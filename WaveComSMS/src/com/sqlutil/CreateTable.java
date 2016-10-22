package com.sqlutil;

import java.sql.*;

public class CreateTable {
	public void CreateTable(){
		Connection c = null;
	    Statement stmt = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      c = DriverManager.getConnection("jdbc:sqlite:data/test.db");
	      System.out.println("Opened database successfully");

	      stmt = c.createStatement();
//	      String sql = "CREATE TABLE COMPANY " +
//	                   "(ID INT PRIMARY KEY     NOT NULL," +
//	                   " NAME           TEXT    NOT NULL, " + 
//	                   " AGE            INT     NOT NULL, " + 
//	                   " ADDRESS        CHAR(50), " + 
//	                   " SALARY         REAL)"; 
	      
	      String sql="create table contractor"+
	    		  	 "(id int primary	key		not null,"+
	    		  	 "name			  	text 	not null,"+
	    		  	 "title				text,"+
	    		  	 "number			int		not	null,"+
	    		  	 "address			text,"+
	    		  	 "remark			text	not null);";
	      stmt.executeUpdate(sql);
	      stmt.close();
	      c.close();
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    System.out.println("Table created successfully");
	}

	@SuppressWarnings("null")
	public  void DeleteTbale(){
		Connection c = null;
	    Statement stmt = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      c = DriverManager.getConnection("jdbc:sqlite:data/test.db");
	      System.out.println("Opened database successfully");
	      
//	      String sql="drop table if exists contractor;";
	      String sql="select * frome contractor";
	      stmt.executeUpdate(sql);
	      stmt.close();
	      c.close();
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    System.out.println("Table deleted successfully");
	}
}
