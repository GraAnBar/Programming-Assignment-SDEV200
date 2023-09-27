package Chapter34;

import java.util.LinkedList;

public class Exercise11 {
    
        private static final String serverURL = "jdbc:mysql://localhost:3306";
        private static final String url = "jdbc:mysql://localhost:3306/people";
        private static String username = "root";
        private static String password = "";
        
        public static void main(String[] args) {
            int result;
        
        DatabaseConnector initialConnector = new DatabaseConnector(serverURL, username, password);
        result = initialConnector.createDatabase();
        System.out.println(result);
    }
}
