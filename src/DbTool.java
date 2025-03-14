import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DbTool {

    private Connection connection = null;
    // private Statement stmt = null;

    DbTool() {
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
            Statement stmt = connection.createStatement();

            // table student 1
            String sql = "CREATE TABLE IF NOT EXISTS  student " +
                    "(student_id char(8) NOT NULL," +
                    "student_name char(30) NOT NULL," +
                    "address char(50) NOT NULL," +
                    "PRIMARY KEY(student_id))";

            int i = stmt.executeUpdate(sql);
            System.out.println("Table Created at " + i);

            // table faculty 1
            String a = "CREATE TABLE IF NOT EXISTS  faculty " +
                    "(faculty_id char(8) NOT NULL," +
                    "faculty_name char(30) NOT NULL," +
                    "PRIMARY KEY(faculty_id))";

            int b = stmt.executeUpdate(a);
            System.out.println("Table Created at " + b);

            // table branch 0
            String f = "CREATE TABLE IF NOT EXISTS branch " +
                    "(branch_id char(8) NOT NULL," +
                    "branch_name char(30) NOT NULL," +
                    "PRIMARY KEY(branch_id))";

            int g = stmt.executeUpdate(f);
            System.out.println("Table Created at " + g);

            // table subject 0
            String u = "CREATE TABLE IF NOT EXISTS subject " +
                    "(subject_id char(8) NOT NULL," +
                    "subject_name char(30) NOT NULL," +
                    "amount int NOT NULL," +
                    "PRIMARY KEY(subject_id))";

            int j = stmt.executeUpdate(u);
            System.out.println("Table Created at " + j);

            // table academic_performance
            String h = "CREATE TABLE IF NOT EXISTS academic " +
                    "(id char(8) NOT NULL,"+
                    "sumamount int NOT NULL," +
                    "gpa float(3,2) NOT NULL,"+
                    "PRIMARY KEY(id))";

        

            int y = stmt.executeUpdate(h);
            System.out.println("Table Created at " + y);

        } catch (ClassNotFoundException e) {
            // MySQL JDBC driver not found
            System.out.println("MySQL JDBC driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            // Error establishing connection
            System.out.println("Failed to connect to the database!");
            e.printStackTrace();
        }
    }

    // insertstudent ได้แล้ว
    public abstract void insertstudent(String student_id, String student_name, String address);

    // insertfaculty ได้แล้ว
    public abstract void insertfaculty(String faculty_id, String faculty_name);

    // insertbranch ได้แล้ว
    public abstract void insertbranch(String branch_id, String branch_name);

    // insertsubject ได้แล้ว
    public abstract void insertsubject(String subject_id, String subject_name, int amount);

    // insertacademic_performance ได้แล้ว
    public abstract void insertacademic( String id, int sumamount, float gpa);

    // display student ได้แล้ว
    public abstract void displaystudent();

    // display faculty ได้แล้ว
    public abstract void displayfaculty();

    // display branch ได้แล้ว
    public abstract void displaybranch();

    // display subject ได้แล้ว
    public abstract void displaysubject();

    // display acadenic ได้แล้ว
    public abstract void displayacademic();

    public void CloseDb() {
        System.out.println("***** Close Data ******");
        // Close the database connection
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // Updatefaculty ได้แล้ว
    public abstract void Updatefaculty(String faculty_id, String faculty_name);

    public abstract void Updatestudent(String student_id, String student_name, String address);

    // Updatebranch
    public abstract void Updatebranch(String branch_id, String branch_name);

    // Updteasubject
    public abstract void Updatesubject(String subject_id, String subject_name, int amount);

    // Updateacademic
    public abstract void Updatecademic(int sumamount, float gpa);
    
    // Deletefaculty 
    public abstract void Deletefaculty(String faculty_id);
     
    // Deletestuden
    public abstract void Deletestudent(String student_id);

    //Deletebranch
    public abstract void Deletebranch(String branch_id);

    // Deletesubject
    public abstract void Deletesubject(String subject_id);

    // Deletecademic
    // public abstract void Deleteademic(int sumamount, float gpa);


    

}