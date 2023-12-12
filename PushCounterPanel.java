// package GUIs;

//********************************************************************
//  PushCounterPanel.java       Java Foundations
//
//  Demonstrates a graphical user interface and an event listener.
//********************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class PushCounterPanel extends JPanel
{

   public int randomNumber;
   private int count;
   private JButton push;
   private JLabel label;
   private Random rand = new Random();

   //-----------------------------------------------------------------
   //  Constructor: Sets up the GUI.
   //-----------------------------------------------------------------
   public PushCounterPanel()
   {

      push = new JButton("Push Me!");
      push.addActionListener(new ButtonListener());
		
      label = new JLabel ("Pushes: " + count);

      add(push);
      add(label);

      setBackground(Color.yellow);
      setPreferredSize(new Dimension(600, 300));
   }

   //*****************************************************************
   //  Represents a listener for button push (action) events.
   //*****************************************************************
   private class ButtonListener implements ActionListener
   {
      //--------------------------------------------------------------
      //  Updates the counter and label when the button is pushed.
      //--------------------------------------------------------------
      public void actionPerformed(ActionEvent event)
      {
         randomNumber = rand.nextInt(100) + 1;
         label.setText("Random Number: " + randomNumber);

      }
   }
}		

