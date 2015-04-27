import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.until.Arraylist;

public class Main {
  
  public static Compiled; // Holds the value whether the program was able to compile or not!
  public String Value; // Holds the value of the function's output.
  
  public static ArrayList<Test> test_Array = new ArrayList<Test>();
  public static ArrayList<Student> student_Array = new ArrayList<Student>();
  public static ArrayList<Question> question_Array = new ArrayList<Question>();
  
  enum Token {
    LOOKING_FOR_KEYS,
    LOOKING_FOR_TYPE,
    FOUND_TYPE
  }
  
  public static void main (String [] args){
    
    try{ // Trying to load the MySql Drive.
      Class.forName("com.mysql.jdbc.Driver");
    }catch(ClassNotFoundException ex){
      return;
    }
  }
}
