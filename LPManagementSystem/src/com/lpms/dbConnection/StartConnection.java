package com.lpms.dbConnection;
import java.sql.Connection;
import java.sql.DriverManager;
public class StartConnection {
public static Connection createConnection()
{
Connection con = null;
String url = "jdbc:mysql://localhost:3306/lpbms"; 
String username = "root"; 
String password = "system";//oracle password
try 
{
try 
{
Class.forName("com.mysql.jdbc.Driver"); //loading oracle driver 
} 
catch (ClassNotFoundException e)
{
e.printStackTrace();
} 
con = DriverManager.getConnection(url, username, password); //attempting to connect to MySQL database
System.out.println("Printing connection object "+con);
} 
catch (Exception e) 
{
e.printStackTrace();
}
return con; 
}
}