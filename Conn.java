package hotel.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
	
	Connection c ;
	Statement s;
	
	Conn(){
		
		try {
			//load and register the driver
			Class.forName("org.postgresql.Driver");
			
			//create the connection
			c= DriverManager.getConnection("jdbc:postgresql://localhost:5432/hotelmanagementsystem?user=postgres&password=prerana123");
			
			//create the statement
			s= c.createStatement();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

		
		
		
		
		
	
		
		//execution
//		s.execute();
		
		//close the connection
//		c.close();
//		System.out.println("Data inserted");
	}
	   

}
