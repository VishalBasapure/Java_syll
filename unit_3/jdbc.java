import java.sql.*;

public class jdbc {

    public static void main(String[] args) {

        String url = "jdbc:sqlite:C:/database/sample.db";

        try {
            Connection con =
                DriverManager.getConnection(url);

            System.out.println("Connection to SQLite successful!");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}