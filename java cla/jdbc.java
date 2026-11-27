import java.sql.*;

public class jdbc {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String password = "your_password";

        try {
            Connection con = DriverManager.getConnection(url, user, password);

            Statement st = con.createStatement();

            // (a) Create Table
            String create = "CREATE TABLE IF NOT EXISTS Student (" +
                            "id INT PRIMARY KEY, " +
                            "name VARCHAR(50), " +
                            "marks INT)";

            st.executeUpdate(create);
            System.out.println("Table created successfully.");

            // Insert a record
            st.executeUpdate(
                "INSERT INTO Student VALUES (101, 'Vivek', 90)"
            );

            // (b) Update Record
            st.executeUpdate(
                "UPDATE Student SET marks = 95 WHERE id = 101"
            );
            System.out.println("Record updated successfully.");

            // (c) Select Record
            ResultSet rs = st.executeQuery("SELECT * FROM Student");

            System.out.println("\nStudent Records:");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name") + " " +
                    rs.getInt("marks")
                );
            }

            rs.close();

            // (d) Delete Record
            st.executeUpdate(
                "DELETE FROM Student WHERE id = 101"
            );
            System.out.println("\nRecord deleted successfully.");

            st.close();
            con.close();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}