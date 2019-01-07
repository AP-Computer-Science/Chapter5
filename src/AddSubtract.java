//********************************************************************
//  PushCounter.java       Authors: Lewis/Loftus/Cocking
//
//  Demonstrates a graphical user interface and an event listener.
//********************************************************************
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class AddSubtract extends JApplet
{
   private int APPLET_WIDTH = 300, APPLET_HEIGHT = 35;
   private int currentNumber;
   private JLabel label;
   private JButton addButton;
   private JButton subtractButton;
   //-----------------------------------------------------------------
   //  Sets up the GUI.
   //-----------------------------------------------------------------
   public void init ()
   {
      currentNumber = 50;
      addButton = new JButton ("Add");
      subtractButton = new JButton("Subtract");
      addButton.addActionListener (new ButtonListener());
      subtractButton.addActionListener(new SubtractButtonListener());
      label = new JLabel(Integer.toString(currentNumber));
      Container cp = getContentPane();
      cp.setBackground (Color.cyan);
      cp.setLayout (new FlowLayout());
      cp.add (addButton);
      cp.add(subtractButton);
      cp.add (label);
      setSize (APPLET_WIDTH, APPLET_HEIGHT);
   }
//********************************************************************
   //  Represents a listener for button push (action) events.
   //********************************************************************
   private class ButtonListener implements ActionListener
   {
      //-----------------------------------------------------------------
      //  Updates the counter when the button is pushed.
      //-----------------------------------------------------------------
      public void actionPerformed (ActionEvent event)
      {
         currentNumber++;
         label.setText(Integer.toString (currentNumber));
         repaint ();
      }
   }
   private class SubtractButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent ae) {
            currentNumber--;
            label.setText(Integer.toString(currentNumber));
            repaint();
        }
   }
}

