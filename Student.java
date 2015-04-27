public class Student {
  
  public String StudentID;
  public double StudentGrade;
  public String StudentAnswer;
  public String ProfessorNotes;
  
  public Student(){
    this.StudentID = null;
    this.StudentGrade = 0.0;
    this.StudentAnswer = null;
  }
  
  public Student(String StudentID, double StudentGrade, String StudentAnswer){
    this.StudentID = StudentID;
    this.StudentGrade = StudentGrade;
    this.StudentAnswer = StudentAnswer;
  }
  
  public String getStudentID () {
    return StudentID;
  }
  
  public void setStudentID (String StudentID) {
    this.StudentID = StudentID;
  }
  
  public double getStudentGrade () {
    return StudentGrade;
  }
  
  public void setStudentGrade (double StudentGrade) {
    this.StudentGrade = StudentGrade;
  }
  
  public String getStudentAnswer () {
    return StudentAnswer;
  }
  
  public void setStudentAnswer (String StudentAnswer){
    this.StudentAnswer = StudentAnswer;
  }
  
  public String getProfessorNotes () {
    return ProfessorNotes;
  }
  
  public void setProfessorNotes (String ProfessorNotes) {
    this.ProfessorNotes = ProfessorNotes;
  }
  
  public void AddGrade (double Grade) {
    StudentGrade = StudentGrade + Grade;
  }
  
  public void AddToProfessorNotes (String Str) {
    ProfessorNotes = ProfessorNotes + " " + str;
  }
}
