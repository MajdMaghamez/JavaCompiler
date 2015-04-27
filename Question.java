public class Question {
  
  public String QuestionID;
  public String QuestionTitle;
  public String QuestionType;
  public double QuestionGrade;
  public String Variable;
  public String QuestionOutput;
  
  public Question (){
    this.QuestionID = null;
    this.QuestionTitle = null;
    this.QuestionType = null;
    this.QuestionGrade = 0.0;
    this.QuestionOutput = null;
  }
  
  public Question (String QuestionID, String QuestionTitle, String QuestionType, double QuestionGrade, String QuestionOutput, String Variable) {
    this.QuestionID = QuestionID;
    this.QuestionTitle = QuestionTitle;
    this.QuestionType = QuestionType;
    this.QuestionGrade = QuestionGrade;
    this.Variable = Variable;
    this.QuestionOutput = QuestionOutput;
  }
  
  public String getQuestionID () {
    return QuestionID;
  }
  
  public void setQuestionID (String QuestionID) {
    this.QuestionID = QuestionID;
  }
  
  public String getQuestionTitle () {
    return QuestionTitle;
  }
  
  public void setQuestionTitle (String QuestionTitle) {
    this.QuestionTitle = QuestionTitle;
  }
  
  public String getQuestionType () {
    return QuestionType;
  }
  
  public void setQuestionType (String QuestionType) {
    this.QuestionType = QuestionType;
  }
  
  public double getQuestionGrade () {
    return QuestionGrade;
  }
  
  public void setQuestionGrade (double QuestionGrade) {
    this.QuestionGrade = QuestionGrade;
  }
  
  public String getVariable () {
    return Variable;
  }
  
  public void setVariable (String Variable) {
    this.Variable = Variable;
  }
  
  public String getQuestionOutput () {
    return QuestionOutput;
  }
  
  public void setQuestionOutput (String QuestionOutput) {
    this.QuestionOutput = QuestionOutput;
  }
}
