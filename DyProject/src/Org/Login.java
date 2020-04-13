package Org;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email=req.getParameter("Un");
		String password=req.getParameter("Pass");
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","details","root");
			String sql="Select EMAIL,PASSWORD from details.project where EMAIL=? and PASSWORD=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1,email);
			preparedStatement.setString(2,password);
			
			ResultSet resultSet=preparedStatement.executeQuery();
			String email1="";
			String password1="";
			while(resultSet.next())
			{
				 email1=resultSet.getString("EMAIL");
				 password1=resultSet.getString("PASSWORD");
			}
			PrintWriter printWriter=resp.getWriter();
			if(email.equals(email1)&&password.equals(password1))
			{
				printWriter.println("Login Successful");
			}
			else
			{
				printWriter.println("Incorrect Email or Password");
			}
			connection.close();
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
}
