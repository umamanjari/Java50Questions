package com.wbl;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnecttoDatabase {

	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb","root","root");
			if(con!=null)
				System.out.println("Connected");
			else 
				System.out.println("not Connected");
			con.close();
				
			}catch(Exception e){
				System.out.println(e);
			}
			
		

	}

}
