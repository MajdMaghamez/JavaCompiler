public class Test { // this guy should have ID
  
  public String TestID;
  
  public Test(){
    this.TestID = null;
  }
  
  public Test(String TestID){
    this.TestID = TestID;
  }
  
  public String getTestID(){
    return TestID;
  }
  
  public void setTestID(String TestID){
    this.TestID = TestID;
  }
}
