package com.ci.mtup.dbcon;

import java.sql.Connection;
import java.sql.DriverManager;

import com.ci.mtup.util.UserDbConstants;

public class DBConnection {

	 public static Connection dbConn(){
		 Connection conn = null;
	  try {
		  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

		// C:\\databaseFileName.accdb" - location of your database
		String url = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + "C:\\Users\\Prateek\\Documents\\Copper_DB.mdb";

		// specify url, username, pasword - make sure these are valid
		conn = DriverManager.getConnection(url, "", "");
	   System.out.println("Connected to the database");
	  } catch (Exception e) {
	   e.printStackTrace();
	  }
	  return conn;
	 }
	}
