package model.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import context.DBContext;
import model.bean.Account;

@WebServlet("/AccountDAO")
public class AccountDAO  {
	private static final long serialVersionUID = 1L;
       
    public static Account getByUsername(String username) {
		try (Connection connection = DBContext.getConnection()) {
			Account acc = null; // Initialize the Account object
			String query = "SELECT * FROM accounts WHERE username = ?";
			try (PreparedStatement ps = connection.prepareStatement(query)){
				ps.setString(1, username);
				ResultSet rs = ps.executeQuery();
				
				if(rs.next()) {
					int AccroleId = rs.getInt("role_id");
					String Accusername = rs.getString("username");
					String Accpass = rs.getString("password");
					
					// Create and populate the Account object
	                acc = new Account();
	                acc.setRole_id(AccroleId);
	                acc.setUsername(Accusername);
	                acc.setPassword(Accpass);
				}
				
				
			} catch (Exception ex) {
				// TODO: handle exception
				ex.printStackTrace();
			}
			return acc;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		
	}
    

}
