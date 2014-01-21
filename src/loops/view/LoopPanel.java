package loops.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

import loops.controller.LoopController;
import loops.model.Loop;

/**
 * Panel for the Loops Project.
 * @author Sam Robinson
 * @version 1.2 11/5/13 Basic framework, setupListeners method, setupPanel method, setupLayout method.
 */
public class LoopPanel extends JPanel
{
	private LoopController baseController;
	private SpringLayout baseLayout;
	private JTextArea loopTextArea;
	private JButton submitButton;
	private JScrollPane textPane;
	
	/**
	 * Creates a LoopPanel object linked via the controller for MVC paradigm
	 * @param baseController reference to LoopController.
	 */
	public LoopPanel(LoopController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		loopTextArea = new JTextArea(10, 20);
		submitButton = new JButton("Click here!");
		textPane = new JScrollPane(loopTextArea);
		
		setupPanel();
		setupListeners();
		setupLayout();
		
	}
	
	/**
	 * Adds all components to the panel, sets color and component settings.
	 */
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(new Color(0, 0, 255));
		this.add(submitButton);
		this.add(textPane);
		
		loopTextArea.setWrapStyleWord(true);
		loopTextArea.setLineWrap(true);
		loopTextArea.setEditable(false);
		
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, submitButton, 84, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, submitButton, -53, SpringLayout.EAST, this);
		
		baseLayout.putConstraint(SpringLayout.NORTH, textPane, 24, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, textPane, 48, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, textPane, 251, SpringLayout.WEST, this);
	}
	
	private void setupListeners()
	{
		submitButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent click)
					{
						loopTextArea.append(baseController.getLoopResults());
					}
				});
	}
	
}
