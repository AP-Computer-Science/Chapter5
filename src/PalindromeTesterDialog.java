
import javax.swing.JOptionPane;

public class PalindromeTesterDialog {
    public static void main (String[] args)
    {
        String test, result;
        int again;
        do
        {
           test = JOptionPane.showInputDialog ("Enter string to test: ");
           PalinDromeTester pt = new PalinDromeTester();
           result = pt.test(test) ? "It is a palindrome!" : "It is not a palindrome.";
           JOptionPane.showMessageDialog (null, result);
           again = JOptionPane.showConfirmDialog(null, "Do Another?");
        }
        while (again == JOptionPane.YES_OPTION);
   }
}
