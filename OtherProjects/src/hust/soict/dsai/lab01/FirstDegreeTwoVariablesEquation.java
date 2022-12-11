package hust.soict.dsai.lab01;

public class FirstDegreeTwoVariablesEquation {
  private double a11, a12, a21, a22;
  private double b1, b2;

  public FirstDegreeTwoVariablesEquation(double a11, double a12, double b1, double a21, double a22, double b2){
    this.a11 = a11;
    this.a12 = a12;
    this.b1 = b1;
    this.a21 = a21;
    this.a22 = a22;
    this.b2 = b2;
  }

  public FirstDegreeTwoVariablesEquation(){

  }

  public void setFirstCoefficients(double a11, double a12, double b1){
    this.a11 = a11;
    this.a12 = a12;
    this.b1 = b1;
  }

  public void setSecondCofficients(double a21, double a22, double b2){
    this.a21 = a21;
    this.a22 = a22;
    this.b2 = b2;
  }

  public void solve(){

    double d = a11 * a22 - a21 * a12;
    double d1 = b1 * a22 - b2 * a12;
    double d2 = a11 * b2 - a21 * b1;

    if (d != 0){
      System.out.println("x: " + d1/d + "\ty: " + d2/d);
    } else if (d == 0 && (d1 != 0 && d2 != 0)){
      System.out.println("\nNo solution");
    } else if (d == d1 && d == d2 && d == 0){
      System.out.println("Many roots");
    }
  }
}