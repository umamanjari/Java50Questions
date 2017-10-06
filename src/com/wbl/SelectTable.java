package com.wbl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectTable {

	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb","root","root");
			Statement st=con.createStatement();
			String s= "Select * from userid";
			ResultSet  result=st.executeQuery(s);
			if(result.next()){
				System.out.println("Userid; "+result.getString(1));
				System.out.println("password; "+result.getString(2));
				System.out.println("FullName; "+result.getString(3));
				System.out.println("email; "+result.getString(4));
				
			}
			else
				System.out.println("No record exists");
			con.close();
			
		}catch(Exception e){
			System.out.println(e);

	}

}
}
