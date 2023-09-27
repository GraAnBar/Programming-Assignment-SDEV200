package Chapter34;

import java.sql.*;
import java.util.LinkedList;

public class DatabaseConnector {
    private String url;
    private String username;
    private String password;

    public DatabaseConnector(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }
    
    public int createDatabase(){
        String query = "CREATE DATABASE IF NOT EXISTS People;";
        int result;
        try{
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            result = stmt.executeUpdate(query);
            stmt.close();
            conn.close();
        }
        catch(Exception e){
            return -999;
        }
        return result;
    }
    
    public int createPeopleTable(){
        String query = "CREATE TABLE IF NOT EXISTS Person(";
        query += "personID INTEGER PRIMARY KEY AUTO_INCREMENT, ";
        query += "name VARCHAR(64), ";
        query += "age INTEGER, ";
        query += "town VARCHAR(64));";
        int result;
        try{
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            result = stmt.executeUpdate(query);
            stmt.close();
            conn.close();
        }
        catch(Exception e){
            return -999;
        }
        return result;
    }
    
    public int insertData(String name, int age, String town){
        String query = "INSERT INTO Person(name, age, town) VALUES(";
        query += "\""+name+"\", "+age+", \""+town+"\");";
        int result;
        try{
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            result = stmt.executeUpdate(query);
            stmt.close();
            conn.close();
        }
        catch(Exception e){
            return -999;
        }
        return result;
    }
    
    public LinkedList<Record> getData(String table, String[] fields, String condition){
        LinkedList<Record> data = new LinkedList<>();
        // SELECT [fields] FROM table WHERE condition;
        String query = "SELECT ";
        for(int i=0; i<fields.length; i++){
            query += fields[i];
            if(i != fields.length-1){
                query += ", ";
            }
            else{
                query += " FROM " + table + " ";
            }
        }
        query += "WHERE " + condition + ";";
        
        try{
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            ResultSet results = stmt.executeQuery(query);
            
            while(results.next()){
                Record temp = new Record();
                //temp.setPersonID(results.getInt(1)); //not in our query
                temp.setName(results.getString(1));
                //temp.setAge(results.getInt(3)); //not in our query
                temp.setTown(results.getString(2));
                data.add(temp);
            }  
            stmt.close();
            conn.close();
        }
        catch(Exception e){
            data = null;
        }
 
        return data;
    }
}
