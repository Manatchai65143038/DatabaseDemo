import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
//import java.sql.SQLException;

public class Register extends DbTool {

    private Connection connection = null;

    Register() {
        System.out.println("***** register Constructor ******");
        // Database connection properties
        String url = "jdbc:mysql://localhost:3306/register";
        String username = "root";
        String password = "";
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // Establish the database connection
            connection = DriverManager.getConnection(url, username, password);
            // Print a success message
            System.out.println("Database connection successful!");

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    public void Updatecademic(int sumamount, float gpa) {
        System.out.println("***** Update ******");
        String sql = "UPDATE academic set ";
        sql = sql + " sumamount = '" + sumamount + "',";
        sql = sql + " gpa = '" + gpa + "';";

        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(sql);
            // conn.commit();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.out.println(sql);
            System.exit(0);
        }
    }

    public void Updatesubject(String subject_id, String subject_name, int amount) {
        System.out.println("***** Update ******");
        String sql = "UPDATE subject set ";
        sql = sql + " subject_id = '" + subject_id + "',";
        sql = sql + " subject_name = '" + subject_name + "',";
        sql = sql + " amount = '" + amount + "';";

        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(sql);
            // conn.commit();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.out.println(sql);
            System.exit(0);
        }
    }

    // Updatebranch
    public void Updatebranch(String branch_id, String branch_name) {
        System.out.println("***** Update ******");
        String sql = "UPDATE branch set ";
        sql = sql + " branch_id = '" + branch_id + "',";
        sql = sql + " branch_name = '" + branch_name + "';";

        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(sql);
            // conn.commit();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.out.println(sql);
            System.exit(0);
        }
    }

    public void Updatestudent(String student_id, String student_name, String address) {
        System.out.println("***** Update ******");
        String sql = "UPDATE student set ";
        sql = sql + " student_id = '" + student_id + "',";
        sql = sql + " student_name = '" + student_name + "';";

        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(sql);
            // conn.commit();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.out.println(sql);
            System.exit(0);
        }
    }

    public void Updatefaculty(String faculty_id, String faculty_name) {
        System.out.println("***** Update ******");
        String sql = "UPDATE faculty set ";
        sql = sql + " faculty_id = '" + faculty_id + "',";
        sql = sql + " faculty_name = '" + faculty_name + "';";

        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(sql);
            // conn.commit();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.out.println(sql);
            System.exit(0);
        }
    }

    // Delete faculty
    public void Deletefaculty(String faculty_id) {
        System.out.println("***** Delete ******");
        String sql = "Delete from  faculty  ";
        sql = sql + "  where faculty_id = '" + faculty_id + "';";
        

        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(sql);
            // conn.commit();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.out.println(sql);
            System.exit(0);
        }
    }

    // Deletestudent
    public void Deletestudent(String student_id) {
        System.out.println("***** Delete ******");
        String sql = " Delete from student  ";
        sql = sql + "  where student_id = '" + student_id + "';";
    

        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(sql);
            // conn.commit();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.out.println(sql);
            System.exit(0);
        }
    }

    // DeleteBrach
    public void Deletebranch(String branch_id) {
        System.out.println("***** Delete ******");
        String sql = "Delete  from branch  ";
        sql = sql + "  where branch_id = '" + branch_id + "';";
       
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(sql);
            // conn.commit();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.out.println(sql);
            System.exit(0);
        }
    }

    // DeletSubject
    public void Deletesubject(String subject_id) {
        System.out.println("***** Delete ******");
        String sql = "Delete from subject  ";
        sql = sql + " where subject_id = '" + subject_id + "';";

        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(sql);
            // conn.commit();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.out.println(sql);
            System.exit(0);
        }
    }

    // Delete cademic
    public void Deletecademic( String id) {
        System.out.println("***** Delete ******");
        String sql = " Delete from academic  ";
        sql = sql + " where id = '" + id + "';";

        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(sql);
            // conn.commit();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.out.println(sql);
            System.exit(0);
        }
    }

    public void displayacademic() {
        System.out.println("***** In Display All Data ******");
        System.out.println("________________________________________________________________________");
        System.out.format("| %-14s| %-30s|\n","id","sumamount","gpa");
        System.out.println("________________________________________________________________________");
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("Select * From academic");
            while (rs.next()) {
                // Display values
                // System.out.print("sumamount: " + rs.getString("sumamount"));
                // System.out.print(", gpa: " + rs.getString("gpa"));
                System.out.format("| %-14s| %-30s| %-10s|\n",rs.getString("id"),rs.getString("sumamount"),rs.getString("gpa"));
            }
            System.out.println("________________________________________________________________________");
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    public void displaysubject() {
        System.out.println("***** In Display All Data ******");
        System.out.println("________________________________________________________________________");
            System.out.format("| %-14s| %-30s| %-10s|\n","subject_ID","subject_Name","Amount");
            System.out.println("________________________________________________________________________");
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("Select * From subject");
            while (rs.next()) {
                // Display values
                // System.out.print("subject_ID: " + rs.getString("subject_id"));
                // System.out.print(", subject_Name: " + rs.getString("subject_name"));
                // System.out.println("Amount" + rs.getString("amount"));
                System.out.format("| %-14s| %-30s| %-10s|\n",rs.getString("subject_ID"),rs.getString("subject_Name"),rs.getString("Amount"));
            }
            System.out.println("________________________________________________________________________");
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    public void displaybranch() {
        System.out.println("***** In Display All Data ******");
        System.out.println("________________________________________________________________________");
            System.out.format("| %-14s| %-30s|\n","branch_ID","branch_Name");
            System.out.println("________________________________________________________________________");
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("Select * From branch");
            while (rs.next()) {
                // Display values
                // System.out.print("branch_ID: " + rs.getString("branch_id"));
                // System.out.print(", branch_Name: " + rs.getString("branch_name"));
                // System.out.format("| %-14s| %-30s| %-10s|\n",rs.getString("student_id"),rs.getString("branch_Name"),rs.getString("address"));
                System.out.format("| %-14s| %-30s|\n",rs.getString("branch_ID"),rs.getString("branch_Name"));
            }
            System.out.println("________________________________________________________________________");
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    public void displayfaculty() {
        System.out.println("***** In Display All Data ******");
        System.out.println("________________________________________________________________________");
            System.out.format("| %-14s| %-30s|\n","faculty_ID","faculty_Name");
            System.out.println("________________________________________________________________________");
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("Select * From faculty");
            while (rs.next()) {
                // Display values
                // System.out.print("faculty_ID: " + rs.getString("faculty_id"));
                // System.out.print(", faculty_Name: " + rs.getString("faculty_name"));
                System.out.format("| %-14s| %-30s|\n",rs.getString("faculty_ID"),rs.getString("faculty_Name"));
            }
            System.out.println("________________________________________________________________________");
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    public void displaystudent() {
        System.out.println("***** In Display All Data ******");
        System.out.println("________________________________________________________________________");
            System.out.format("| %-14s| %-30s| %-10s|\n","studentID","studentName","address");
            System.out.println("________________________________________________________________________");
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("Select * From student");
            while (rs.next()) {
                // Display values
                // System.out.print("student_ID: " + rs.getString("student_id"));
                // System.out.print(", student_Name: " + rs.getString("student_name"));
                // System.out.print(",Address: " + rs.getString("address"));
                System.out.format("| %-14s| %-30s| %-10s|\n",rs.getString("student_id"),rs.getString("student_name"),rs.getString("address"));
            }
            System.out.println("________________________________________________________________________");
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    public void insertacademic( String id,int sumamount, float gpa) {
        System.out.println("***** Insert Data ******");
        String h;
        h = "INSERT INTO academic (id,sumamount,gpa) " +
                "VALUES( '" + id + "','" + sumamount + "','" + gpa + "');";

        System.out.println(h);
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(h);
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    public void insertsubject(String subject_id, String subject_name, int amount) {
        System.out.println("***** Insert Data ******");
        String u;
        u = "INSERT INTO subject (subject_id,subject_name,amount) " +
                "VALUES('" + subject_id + "','" + subject_name + "','" + amount + "');";

        System.out.println(u);
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(u);
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    // insertbranch ได้แล้ว
    public void insertbranch(String branch_id, String branch_name) {
        System.out.println("***** Insert Data ******");
        String f;
        f = "INSERT INTO branch (branch_ID,branch_NAME) " +
                "VALUES('" + branch_id + "','" + branch_name + "');";

        System.out.println(f);
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(f);
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    public void insertfaculty(String faculty_id, String faculty_name) {
        System.out.println("***** Insert Data ******");
        String a;
        a = "INSERT INTO faculty (faculty_ID,faculty_NAME) " +
                "VALUES('" + faculty_id + "','" + faculty_name + "');";

        System.out.println(a);
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(a);
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    public void insertstudent(String student_id, String student_name, String address) {
        System.out.println("***** Insert Data ******");
        String sql;
        sql = "INSERT INTO student (student_ID,student_NAME,ADDRESS) " +
                "VALUES('" + student_id + "','" + student_name + "','" + address + "');";

        System.out.println(sql);
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
}
