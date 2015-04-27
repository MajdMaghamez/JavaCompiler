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
    
    System.out.println("Driver has been registered.");
    
    Connection connection1 = null; //this will be used to receive data from database
    Connection connection2 = null; //this will be used to send data to database
    
    try{ // Trying to establish a connection with the database for receiving data
      
      connection1 = DriverManager.getConnection("jdbc:mysql://sql.njit.edu:3306/UCID", "UCID", "Password");
      
      System.out.println("connection has been established");
      
      Statement statement = connection1.createStatement();
      ResultSet Database = statement.executeQuerry("SELECT Answers2.StudentID, Answers2.TestID, Answers2.QuestionID, Answers2.Answer, Questions2.QuestionTitle, Questions2.QuestionType, Questions2.QuestionGrade, Questions2.InputValue, Questions2.OutputValue, Questions2.Variable, Questions2.Question, Questions2.Intializing_Var FROM Answers2, Questions2 WHERE Answers2.QuestionID = Questions2.QuestionID;");
      
      while(Database.next()){
        Test test = new Test(String.valueOf(Database.getInt(2)));
        Student student = new Student(Database.getString(1), 0.0, Database.getString(4));
        Question question = new Question(String.valueOf(Database.getInt(3)), Database.getString(5), Database.getString(6), Database.getDouble(7), Database.getString(9), Database.getString(10));
        
        String fileName = "T" + String.valueOf(Database.getString(2)) + "Q" + String.valueOf(Database.getString(3));
        
        try{
          PrintWriter Writer = new PrintWriter(fileName + ".java", "UTF-8");
          Writer.println("public class " + fileName + " {" + '\n' + '\t' + "public static void main (String [] args) {" + '\n' + '\t' + '\t' + Database.getString(12) + '\n' + '\t' + '\t' + "System.out.println(" + Database.getString(5) + "(" + Database.getString(8) + "));" + '\n' + '\t' + "}" + '\n' + '\t' + Database.getString(4) + '\n' + "}" );
          Writer.close();
          runProcess("javac" + fileName + ".java");
          runProcess("java" + fileName);
          double CompilingGrade = Database.getDouble(7) / 2;
          double PartialGrade = CompilingGrade / 3;
          
          if(Compiled){ //checks and grade if the function compiled.
            System.out.println("program has compiled sucessfully");
            student.AddGrade(CompileGrade); // compile grade is 50% of question grade
            student.setProfessorNotes("program compiled");
            
            if(NameOfFunction(question, student)){ //checks and grade if the function name is correct
              student.AddGrade(PartialGrade);
              student.AddToProfessorNotes("Function name correct");
            }
            else{
              student.AddToProfessorNotes("Function name incorrect");
            }
            
            if(FunctionTypeValidor(question, student)){
              student.AddGrade(PartialGrade);
              student.AddToProfessorNotes("Function type is correct");
            }
            else{
              student.AddToProfessorNotes("Function type is incorrect");
            }
          }
          else{
            System.out.println("Program could not compile, check for Syntax errors.");
						student.AddGrade(0);
						student.setProfessorNotes("program did not compile");
						
						if(NameOfFunction(question, student)) {
						  student.AddGrade(PartialGrade);
						  student.AddToProfessorNotes("Function name correction ");
						}
						else{
						  student.AddToProfessorNotes("Function name is incorrect");
						}
						
						if(FunctionReturnValue(question)){
						  student.AddGrade(ParialGrade);
						  studnet.AddToProfessorNotes("Function returns correct value");
						}
						else{
						  student.AddToProfessorNotes("Function return wront value");
						}
						
						if(FunctionTypeValidor(question, student)){
						  student.AddGrade(PartialGrade);
						  student.AddToProfessorNotes("Function type is correct");
						}
						else{
						  student.AddToProfessorNotes("Function type is incorrect");
						}
          }
          test_Array.add(test);
          student_Array.add(student);
          question_Array.add(question);
          
        }catch (Exception ex) {
          ex.printStackTrace();
        }
      }
      connection1.close();
    }catch (SQLException ex) {
      System.out.println("connection failed! check output console");
      return;
    }finally{
      try{
        if(connection1 != null
          connection1.close();
        System.out.println("connection1 closed");
      }catch (SQLException ex){
        ex.printStackTrace();
      }
    }
  }
}
