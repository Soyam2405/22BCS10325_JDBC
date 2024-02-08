package com.capgemini.soyam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainClass {
	public static void main(String[] args) throws ClassNotFoundException,SQLException {


//	public Connection getConnection() throws ClassNotFoundException,SQLException {
		Connection con = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/guptaji","root","Qwerty@098");
		System.out.println("Connection Established");
		

	}

}