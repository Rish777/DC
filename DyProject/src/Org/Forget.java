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
@WebServlet("/Forget")
public class Forget extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email=req.getParameter("R_email");
		String password=req.getParameter("R_password");
		String confirm_password=req.getParameter("R_confirm_password");
		PrintWriter printWriter=res.getWriter();
		if(password.equals(confirm_password))
		{
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection connection =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","details","root");
			String sql="update details.project set PASSWORD=? where EMAIL=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1,password);
			preparedStatement.setString(2,email);
			
			
				preparedStatement.executeUpdate();
				printWriter.println("Password updated successfully");
				System.out.println("successfull");
			}
			
			
		 catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		else
			printWriter.println("Password Missmatch");
		
	}

}
