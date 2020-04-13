package Org;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@SuppressWarnings("serial")
@WebServlet("/Register")
public class Register extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstName=req.getParameter("Fn");
		String lastName=req.getParameter("Ln");
		String password=req.getParameter("Pw");
		String confirmPassword=req.getParameter("Cpw");
		String email=req.getParameter("EM");
		String phone=req.getParameter("Phone");
		String gender=req.getParameter("gender");
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection connection =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","details","root");
			String sql = "insert into details.project values(?,?,?,?,?,?,?) ";
			PreparedStatement  preparedStatement=connection.prepareStatement(sql);
			PrintWriter printWriter= res.getWriter();
			preparedStatement.setString(1,firstName);
			preparedStatement.setString(2,lastName);
			preparedStatement.setString(3,email);
			preparedStatement.setString(4,phone);
			preparedStatement.setString(5,gender);
			preparedStatement.setString(6,password);
			preparedStatement.setString(7,confirmPassword);
			if(password.equals(confirmPassword))
			{
				preparedStatement.executeUpdate();
				
				printWriter.println("Signup Successfull");
				connection.close();
			}
			else
				printWriter.println("Password Mismatch");
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
