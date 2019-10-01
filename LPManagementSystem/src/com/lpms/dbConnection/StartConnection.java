package com.lpms.dbConnection;
import java.sql.Connection;
import java.sql.DriverManager;
public class StartConnection {
public static Connection createConnection()
{
Connection con = null;
String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
String username = "system"; 
String password = "manager";//oracle password
try 
{
try 
{
Class.forName("oracle.jdbc.driver.OracleDriver"); //loading oracle driver 
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