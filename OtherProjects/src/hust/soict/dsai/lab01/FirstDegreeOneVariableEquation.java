package hust.soict.dsai.lab01;

public class FirstDegreeOneVariableEquation {

  private double a;
  private double b;

  public FirstDegreeOneVariableEquation(double a, double b){
    this.a = a;
    this.b = b;
  }

  public double getA(){
    return this.a;
  }
  public double getB(){
    return this.b;
  }

  public void setA(double num){
    this.a = num;
  }
  public void setB(double num){
    this.b = num;
  }

  public double solve(){
    return - b / a;    
  }
}