//On terminal create the Procedure
//First change the delimiter
//# Delimiter $$
//Now create a procedure
//================
//Create procedure SelectAllMovies()
  //  -> Begin
    //-> Select * from movies;
    //-> End $$
      //Change Delimiter:
        //Delimiter ;

package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProcedureDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
        Class.forName("com.mysql.cj.jdbc.Driver");
		
		String dburl = "jdbc:mysql://localhost:3306/animated_movies_new";
		String username = "root";
		String password = "root";
		String query = "Call allmovies()";
		
		Connection con = DriverManager.getConnection(dburl, username, password);
		
		Statement stmt = con.createStatement();
		ResultSet rs= stmt.executeQuery(query);
		// print all the rows on the console
		
		while(rs.next())
		{
			System.out.print("Title: " + rs.getString("title") + "\t");
			System.out.print("genre: " + rs.getString("genre") + "\t");
			System.out.print("Director: " + rs.getString("director") + "\t");
			System.out.println("release_year: " + rs.getString("release_year") + "\t");
		}
		
		// Close the connection
		
		con.close();

	}

}
