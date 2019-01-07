//********************************************************************
//  EvenOdd.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of the JOptionPane class.
//********************************************************************
import javax.swing.JOptionPane;
public class SumAndProductDialog
{
   //-----------------------------------------------------------------
   //  Determines if the value input by the user is even or odd.
   //  Uses multiple dialog boxes for user interaction.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      String numStr, numStr2, result;
      int num, num2, again;
      do
      {
         numStr = JOptionPane.showInputDialog ("Enter integer 1: ");
         numStr2 = JOptionPane.showInputDialog("Enter integer 2: ");
         num = Integer.parseInt(numStr);
         num2 = Integer.parseInt(numStr2);
         result = "The sum is " + (num + num2) + ", the product is " + (num * num2);
         JOptionPane.showMessageDialog (null, result);
         again = JOptionPane.showConfirmDialog(null, "Do Another?");
      }
      while (again == JOptionPane.YES_OPTION);
   }
}


