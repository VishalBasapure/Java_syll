
import java.sql.*;

public class jdbc{
    public static void main(String[] args) {
        String url="jdbc:sqlite:c://database/sample.db";
        try {
            Connection con =DriverManager.getConnection(url);
            System.out.println("Connection to Sqlite");
            con.close();
        } catch (Exception e) {
            System.out.println("Error in conection");
        }
    }
}