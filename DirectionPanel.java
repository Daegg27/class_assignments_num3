//********************************************************************
//  DirectionPanel.java       Java Foundations
//
//  Represents the primary display panel for the Direction program.
//********************************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DirectionPanel extends JPanel
{
	private final int WIDTH = 300, HEIGHT = 200;
	private final int JUMP = 10;  // increment for image movement

	private final int IMAGE_SIZE = 31;

	private ImageIcon up, down, right, left, leftUp, leftDown, rightUp, rightDown, currentImage;
	private int x, y;

	//-----------------------------------------------------------------
	//  Constructor: Sets up this panel and loads the images.
	//-----------------------------------------------------------------
	public DirectionPanel()
	{
		addKeyListener (new DirectionListener());

		x = WIDTH / 2;
		y = HEIGHT / 2;

		up = new ImageIcon("DirectionArrows/arrowUp.gif");
		down = new ImageIcon("DirectionArrows/arrowDown.gif");
		left = new ImageIcon("DirectionArrows/arrowLeft.gif");
		right = new ImageIcon("DirectionArrows/arrowRight.gif");
		leftDown = new ImageIcon("DirectionArrows/left_down.gif");
		leftUp = new ImageIcon("DirectionArrows/left_up.gif");
		rightDown = new ImageIcon("DirectionArrows/right_down.gif");
		rightUp = new ImageIcon("DirectionArrows/right_up.gif");


		currentImage = right;

		setBackground(Color.black);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setFocusable(true);
	}

	//-----------------------------------------------------------------
	//  Draws the image in the current location.
	//-----------------------------------------------------------------
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		currentImage.paintIcon(this, page, x, y);
	}

	//*****************************************************************
	//  Represents the listener for keyboard activity.
	//*****************************************************************
	private class DirectionListener implements KeyListener
	{
		//--------------------------------------------------------------
		//  Responds to the user pressing arrow keys by adjusting the
		//  image and image location accordingly.
		//--------------------------------------------------------------
		public void keyPressed(KeyEvent event)
		{
			switch (event.getKeyCode())
			{
			case KeyEvent.VK_UP:
				currentImage = up;
				y -= JUMP;
				break;
			case KeyEvent.VK_DOWN:
				currentImage = down;
				y += JUMP;
				break;
			case KeyEvent.VK_LEFT:
				currentImage = left;
				x -= JUMP;
				break;
			case KeyEvent.VK_RIGHT:
				currentImage = right;
				x += JUMP;
				break;
			case KeyEvent.VK_T:
				currentImage = leftUp;
				x -= JUMP;
				y -= JUMP;
				break;
			case KeyEvent.VK_U:
				currentImage = rightUp;
				x += JUMP;
				y -= JUMP;
				break;
			case KeyEvent.VK_G:
			currentImage = leftDown;
				x -= JUMP;
				y += JUMP;
				break;
			case KeyEvent.VK_J:
				currentImage = rightDown;
				x += JUMP;
				y += JUMP;
				break;
			}

			repaint();
		}

		//--------------------------------------------------------------
		//  Provide empty definitions for unused event methods.
		//--------------------------------------------------------------
		public void keyTyped(KeyEvent event) {}
		public void keyReleased(KeyEvent event) {}
	}
}
