package database;

import java.sql.*;
import java.util.Scanner;

public class connection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		Connection conn = null;
		
		try {

			Class.forName("org.sqlite.JDBC");
			conn = DriverManager.getConnection("jdbc:sqlite:info.db");
			System.out.println("connected  ");
			Statement stmt = conn.createStatement();

			//add users
			System.out.println("1- Add\n2- Delete\n3- Read\n4- Update");
			int processIndex = reader.nextInt();
			
			switch(processIndex) {
				
				case 1:
					System.out.print("Enter Username: ");
					String username = reader.next();
					System.out.print("Enter Password: ");
					String password = reader.next();
					String sqlAdd = "insert into admin (username, password) values ('"+username+"', '"+password+"')";
					stmt.executeUpdate(sqlAdd);
					System.out.println("User Added");
					conn.commit();
					stmt.close();
					conn.close();
				break;

				case 2:
					System.out.print("Enter ID of User: ");
					int id = reader.nextInt();
					String sqlDelete = "delete from admin where id = "+id+" ";
					stmt.executeUpdate(sqlDelete);
					System.out.println("User Deleted");
					stmt.close();
					conn.close();
				break;

				case 3:
					String sqlRead = "select * from admin";
					ResultSet result = stmt.executeQuery(sqlRead);
					System.out.println("ID\tUserName\tPassword");
					while(result.next()) {
						System.out.println(result.getInt("id")+"\t"+result.getString("username")+"\t\t"+result.getString("password"));
					}
					stmt.close();
					conn.close();
				break;
				
				case 4:
					System.out.print("Enter ID of User: ");
					int oIdUser = reader.nextInt();
					System.out.print("Enter Username: ");
					String userName = reader.next();
					System.out.print("Enter Password: ");
					String passWord = reader.next();
					String sqlUpdate = "update admin set username = '"+userName+"', password = '"+passWord+"' where id = "+oIdUser+" ";
					stmt.executeUpdate(sqlUpdate);
					System.out.println("User Updated");
					stmt.close();
					conn.close();	
				break;
			}

		} catch (Exception e) {
			//TODO: handle exception
			System.out.println(e.getMessage());
			System.exit(0);
		}

	}

}
