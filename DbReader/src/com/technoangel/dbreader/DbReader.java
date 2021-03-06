package com.technoangel.dbreader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class DbReader {
	public static final String DB_PROPERTIES = "db.properties";
	
	Properties globalProps;
	static double height;
	static String sport;
	
	/**
	 * Create a new dbReader, get the user search terms, then find the targets of the search
	 */
	public static void main(String[] args) {
		DbReader dbReader = new DbReader();
		try {
			getUserInput();
			dbReader.findPeopleByHeight(height, sport);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * This uses a Scanner to read user String information
	 * We then parse the user data to whatever we want
	 */
	public static void getUserInput() {
		try(Scanner scanner = new Scanner(System.in)) {
		
	    System.out.print("Enter target height: ");
	    String myHeight = scanner.next();
	    height = Double.parseDouble(myHeight);
	    
	    System.out.print("Enter target sport: ");
	    String mySport = scanner.next();
	    sport = mySport.trim();
		}
	}
	
	/**
	 * This uses the connectToDatabase link to execute an SQL statement
	 * We then build an SQL query and send it to the SQL executor
	 * The return values are put into a ResultSet
	 * While the ResultSet isn't closed and there is a next element, we pull the information
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public void findPeopleByHeight(double queryHeight, String querySport) throws SQLException, FileNotFoundException, IOException{
		readProperties();
		try(Statement query = connectToDatabase().createStatement()) {
			String sql = searchQuery(queryHeight, querySport);
			query.setFetchSize(100);
			
			boolean found = false;
			try(ResultSet rs = query.executeQuery(sql)) {
				while (!rs.isClosed() && rs.next()) {
					String name = rs.getString(1);
					Double height = rs.getDouble(2);
					String sport = rs.getString(3);
					System.out.println(name + ": " + height + ", " + sport);
					found = true;
				}
			}
			if(!found) {
				System.out.println("No one was found at that tuple of height and sport");
			}
		}
	}
	
	/**
	 * Watch out that you include the necessary spaces if your query goes multi-line
	 * It will not be obvious why it fails.
	 * 
	 * Notice you can cast doubles as strings here.  This is a good option for this
	 * particular use case.
	 */
	public String searchQuery(double height, String sport) {
		String sql = String.format("SELECT name, height, sport FROM person"
				+ " WHERE height = %s AND sport LIKE '%s'", height, sport);
		System.out.println(sql);
		return(sql);
	}
	
	/**
	 * This is for making a database JDBC connection.  Notice it's just 
	 * DriverManager.getConnection, providing a URI, a username, and a password
	 */
	public Connection connectToDatabase() throws SQLException {
		Connection conn = null;
        try {
            conn = DriverManager.getConnection(globalProps.getProperty("dbUrl"), 
            		globalProps.getProperty("dbUser"), "");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
 
        return conn;
	}
	
	/**
	 * Here we have a FileInputStream, and the {@link Properties#load(InputStream)} will
	 * pull in the pairs for us.
	 */
	public void readProperties() throws FileNotFoundException, IOException {
		try(InputStream in = new FileInputStream(DB_PROPERTIES)) {
			globalProps = new Properties();
			globalProps.load(in);
		}
	}

}
