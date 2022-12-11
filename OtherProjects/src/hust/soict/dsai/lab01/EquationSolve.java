package hust.soict.dsai.lab01;

public class EquationSolve {
  public static void main(String[] args) {
    FirstDegreeOneVariableEquation firstEquation = new FirstDegreeOneVariableEquation(4, 5);
    FirstDegreeTwoVariablesEquation secondEquation = new FirstDegreeTwoVariablesEquation();
    secondEquation.setFirstCoefficients(2, 6, 4);
    secondEquation.setSecondCofficients(4, 6, 8);
    //secondEquation.solve();
    firstEquation.setA(6);
    double result = firstEquation.solve();
    System.out.println(result);
    SecondDegreeOneVariableEquation thirdEquation = new SecondDegreeOneVariableEquation(3, -4, 1);
    thirdEquation.solve();
  }
}
