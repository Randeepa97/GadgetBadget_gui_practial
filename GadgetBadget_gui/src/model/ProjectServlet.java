package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProjectServlet {
	
	private Connection connect() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			// Provide the correct details: DBServer/DBName, username, password
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}	
	
	public String insertProject(String project_type, String project_name, String researcher, String description) 
	{ 
		 	String output = ""; 
		 
		 	try
		 	{ 
		 			Connection con = connect(); 
					 if (con == null) 
					 {
						 return "Error while connecting to the database for inserting."; } 
					 // create a prepared statement
					 String query = " insert into project_table_gui (	project_id , project_type , project_name , researcher , description)" + " values (?, ?, ?, ?, ?)"; 
					 
					 PreparedStatement preparedStmt = con.prepareStatement(query); 
					 // binding values
					 preparedStmt.setInt(1, 0); 
					 preparedStmt.setString(2, project_type); 
					 preparedStmt.setString(3, project_name);
					 preparedStmt.setString(4, researcher); 
					 preparedStmt.setString(5, description);
					
					 
					// execute the statement3
					 preparedStmt.execute(); 
					 con.close(); 
					 
					 String newProject = readProject(); 
					 output = "{\"status\":\"success\", \"data\": \"" + newProject + "\"}"; 
		 
		 	} 
		 	
		 	catch (Exception e) 
		 	{ 
		 		output = "{\"status\":\"error\", \"data\": \"Error while inserting the project.\"}";
		 		System.err.println(e.getMessage()); 
		 		System.out.println(e);
		 } 
		 return output; 
	 }
	
	public String readProject() 
	 { 
		String output = ""; 
	 
		try
		{ 
			Connection con = connect(); 
	 
			if (con == null) 
			{
				return "Error while connecting to the database for reading."; } 
	 
				// Prepare the html table to be displayed
				output = "<table border='1'><tr><th>project_type</th><th>project_name</th>" +
					"<th>researcher</th>" + 
					"<th>description</th>" +
					"<th>Update</th><th>Remove</th></tr>"; 
	 
	 
				String query = "select * from project_table_gui"; 
				Statement stmt = con.createStatement(); 
				ResultSet rs = stmt.executeQuery(query); 
	 
				// iterate through the rows in the result set
				while (rs.next()) 
				{ 
	 
					String project_id = Integer.toString(rs.getInt("project_id")); 
					String project_type = rs.getString("project_type"); 
					String project_name = rs.getString("project_name"); 
					String researcher = rs.getString("researcher"); 
					String description = rs.getString("description"); 
					
	 
					// Add into the html table
					output += "<tr><td>" + project_type + "</td>"; 
					output += "<td>" + project_name + "</td>"; 
					output += "<td>" + researcher + "</td>"; 
					output += "<td>" + description + "</td>"; 
					
	 
					// buttons
					output += "<td><input name='btnUpdate' type='button' value='Update' class='btn btn-secondary'></td>" + "<td><form method='post' action='Project.jsp'>" 
							+ "<input name='btnRemove' type='submit' value='Remove' class='btn btn-danger'>"
											+ "<input name='project_id' type='hidden' value='" + project_id 
											+ "'>" + "</form></td></tr>"; 
				} 
				
				con.close(); 
				// Complete the html table
				output += "</table>"; 
	 
		} 
		
		catch (Exception e) 
		 
		{ 
			output = "Error while reading the investment."; 
			System.err.println(e.getMessage()); 
	 
		} 
		return output; 
	 }
	public String updateProject(String project_id, String project_type, String project_name, String researcher, String description)
	 { 
	 
		String output = ""; 
	
		try
		{ 
			Connection con = connect(); 
	 
			if (con == null) 
			{
				return "Error while connecting to the database for updating."; } 
	 
			// create a prepared statement
	 
			String query = "UPDATE project_table_gui SET project_type=?,project_name=?,researcher=?,description=?	"
					+ "WHERE project_id=?"; 
	 
			PreparedStatement preparedStmt = con.prepareStatement(query); 
			// binding values
			preparedStmt.setString(1, project_type); 
			preparedStmt.setString(2, project_name); 
			preparedStmt.setString(3, researcher); 
			preparedStmt.setString(4, description); 
			preparedStmt.setInt(5, Integer.parseInt(project_id)); 
			// execute the statement
			preparedStmt.execute(); 
			 con.close(); 
			 String newProject = readProject(); output = "{\"status\":\"success\", \"data\": \"" + newProject + "\"}"; 
		} 
		
		catch (Exception e) 
		{ 
			output = "{\"status\":\"error\", \"data\": \"Error while updating the investment.\"}"; 
			 System.err.println(e.getMessage()); 
		} 
		return output; 
	 } 
	
	public String deleteProject(String project_id) 
	 { 
	 
		String output = ""; 
	 
		try
		{ 
			Connection con = connect(); 
			if (con == null) 
			{
				return "Error while connecting to the database for deleting."; } 
	 
			// create a prepared statement
			String query = "delete from project_table_gui where project_id=?"; 
			PreparedStatement preparedStmt = con.prepareStatement(query); 
	 
			// binding values
			preparedStmt.setInt(1, Integer.parseInt(project_id)); 
			// execute the statement
			preparedStmt.execute(); 
			con.close(); 
			String newProject = readProject(); output = "{\"status\":\"success\", \"data\": \"" + newProject + "\"}";
	 
		}
		
		catch (Exception e) 
		{ 
			output = "{\"status\":\"error\", \"data\": \"Error while deleting the project.\"}"; 
			System.err.println(e.getMessage()); 
			System.out.println(e);
	 
		} 
	
		return output; 
	 } 
		
		
				
}
