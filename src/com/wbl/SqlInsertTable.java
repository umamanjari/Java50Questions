package com.wbl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SqlInsertTable {

	public static void main(String[] args) {
		
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb","root","root");
				Statement stmt=con.createStatement();
				String s="insert into userid values"+"(8,'sam','sam Abraham','sam@gmail')";
				
				int x=stmt.executeUpdate(s);
				
				if(x>0)
					System.out.println("Inserted Successfully");
				else
					System.out.println("Insert failed");
				con.close();
					
				}catch(Exception e){
					System.out.println(e);
				}
				
			

		}

	}


