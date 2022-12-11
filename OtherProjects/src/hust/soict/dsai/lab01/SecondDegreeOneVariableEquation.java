package hust.soict.dsai.lab01;

public class SecondDegreeOneVariableEquation {
  private double a;
  private double b;
  private double c;

  public SecondDegreeOneVariableEquation(double a, double b, double c){
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public void setA(double a){
    this.a = a;
  }

  public void setB(double b){
    this.b = b;
  }

  public void setC(double c){
    this.c = c;
  }

  public void solve(){
    double d = b * b - 4 * a * c;
    if (d > 0){
      double x1 = (-b + Math.sqrt(d))/(2*a);
      double x2 = (-b - Math.sqrt(d))/(2*a);
      System.out.println("x1 = " + x1 + "\tx2 = " + x2);
    }
    else if (d == 0){
      double x = -b / (2*a);
      System.out.println("x1 = x2 = " + x);
    } else {
      System.out.println("No solution");
    }
  }
}