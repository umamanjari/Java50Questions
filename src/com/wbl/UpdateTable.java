package com.wbl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateTable {

	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb","root","root");
			Statement st=con.createStatement();
			String q= "UPDATE userid  set email='abraham@gmail' "+" where useid=8 ";
			int x=st.executeUpdate(q);
			if(x>0)
				System.out.println("Record Updated Successfully");
			else
				System.out.println("Update Failed");
			con.close();
		}catch(Exception e){
			System.out.println(e);
		}

	}

}
