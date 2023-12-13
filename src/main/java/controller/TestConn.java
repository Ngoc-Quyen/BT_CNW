package controller;

import java.sql.Connection;

import context.DBContext;

public class TestConn {
	public static void main(String[] args) {
		Connection conn = DBContext.getConnection();
		System.out.print(conn);
	}
	
}
