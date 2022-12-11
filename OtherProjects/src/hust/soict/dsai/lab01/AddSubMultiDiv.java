package hust.soict.dsai.lab01;

/**
 * AddSubMultiDiv
 * 2.2.5
 */
import javax.swing.JOptionPane;

public class AddSubMultiDiv {
  public static void main(String[] args) {
    String strNum1, strNum2;

    strNum1 = JOptionPane.showInputDialog(null,
        "Please input the first number",
        "Input the first number",
        JOptionPane.INFORMATION_MESSAGE);

    strNum2 = JOptionPane.showInputDialog(null,
        "Please input the first number",
        "Input the second number",
        JOptionPane.INFORMATION_MESSAGE);

    double num1 = Double.parseDouble(strNum1);
    double num2 = Double.parseDouble(strNum2);

    double sum = num1 + num2;
    double difference = num1 - num2;
    double product = num1 * num2;
    double quotient = num1 / num2;

    String strNotification = "firstNumber: " + num1 + "\nsecondNumber: " + num2 + "\n\nSum: " + sum + "\nDifference: " + difference + "\nProduct: " + product + "\nQuotient: "
        + quotient;
    JOptionPane.showMessageDialog(null, strNotification, "2-2-5", JOptionPane.INFORMATION_MESSAGE);
  }
}