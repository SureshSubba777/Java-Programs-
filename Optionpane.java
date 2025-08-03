import javax.swing.JOptionPane;
public class Optionpane{
    public static void main(String[] args) {
        String firstNumber = JOptionPane.showInputDialog("Enter first integer: ");
        String secondNumber = JOptionPane.showInputDialog("Enter second integer: ");

        int num1 = Integer.parseInt(firstNumber);
        int num2 = Integer.parseInt(secondNumber);
        int sum = num1+ num2;

        JOptionPane.showMessageDialog(null, "The sum is "+sum, "Sum of two Integers", JOptionPane.PLAIN_MESSAGE);    
        
    }
}