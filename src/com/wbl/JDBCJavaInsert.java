package com.wbl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCJavaInsert {
	public static void main(String[] args) throws SQLException {
		Connection con=null;
		Statement stmt=null;
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb","root","root");
		 stmt=con.createStatement();
		 System.out.println("Creating the Table");
		String q1="CREATE TABLE EMPLOYEE(" +
                     "ID NUMBER NOT NULL, " +"FIRST_NAME VARCHAR2(200), " +
                    " LAST_NAME VARCHAR2(200), " +
                    "DISIGNATION VARCHAR2(200))";
                                    
         int i=stmt.executeUpdate(q1);
        if(i!=0)
        {
        System.out.println("Row is created");	
                }
        else{
        	System.out.println("Row is not created");
        	
        }
        	
		}catch(Exception e){
			e.getMessage();
		}finally{
			try{
			if(stmt!=null){
				stmt.close();
				stmt=null;
			}
				
		}catch(Exception e){
			e.getMessage();
		}
			
	}

	

	}
}

