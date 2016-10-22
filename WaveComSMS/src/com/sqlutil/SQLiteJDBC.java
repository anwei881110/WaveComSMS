package com.sqlutil;

import java.sql.*;
import org.sqlite.JDBC;

public class SQLiteJDBC {
	public static void main(String args[]) {

//		Connection c = null;
//		try {
//			Class.forName("org.sqlite.JDBC");
//			c = DriverManager.getConnection("jdbc:sqlite:data/test.db");
//		} catch (Exception e) {
//			System.err.println(e.getClass().getName() + ": " + e.getMessage());
//			System.exit(0);
//		}
//		System.out.println("Opened database successfully");

		try {
			CreateTable createTable=new CreateTable();
//			CreateTable.CreateTable();
			createTable.DeleteTbale();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}