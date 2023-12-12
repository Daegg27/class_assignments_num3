// package GUIs;

//********************************************************************
//FahrenheitPanel.java       Java Foundations
//
//Demonstrates the use of text fields.
//********************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.Math;

public class FahrenheitPanel extends JPanel
{
private JLabel inputLabel, outputLabel, resultLabel;
private JTextField area;

//-----------------------------------------------------------------
//  Constructor: Sets up the main GUI components.
//-----------------------------------------------------------------
public FahrenheitPanel()
{
  inputLabel = new JLabel("Enter the radius of the circle:");
  outputLabel = new JLabel("The area of this circle is: ");
  resultLabel = new JLabel("---");

  area = new JTextField(5);
  area.addActionListener(new TempListener());
	

  add(inputLabel);
  add(area);
  add(outputLabel);
  add(resultLabel);

  setPreferredSize(new Dimension(300, 75));
  setBackground(Color.yellow);
}

//*****************************************************************
//  Represents an action listener for the temperature input field.
//*****************************************************************
private class TempListener implements ActionListener
{
  //--------------------------------------------------------------
  //  Performs the conversion when the enter key is pressed in
  //  the text field.
  //--------------------------------------------------------------
  public void actionPerformed(ActionEvent event)
  {
     double inputRadius, calculatedArea, finalFormat;
     

     String text = area.getText();

     inputRadius = Integer.parseInt(text);
     calculatedArea = (inputRadius * inputRadius ) * Math.PI;
     finalFormat = Math.round(calculatedArea * 100.0) / 100.0;

     resultLabel.setText(Double.toString(finalFormat));
  }
}
}		


