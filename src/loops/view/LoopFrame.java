package loops.view;

import javax.swing.JFrame;

import loops.controller.LoopController;

/**
 * Main GUI	Framework for the Loops Project.
 * @author Sam Robinson
 * @version 1.2 11/5/13 Added documentation and supporting methods.
 */
public class LoopFrame extends JFrame
{
	/**
	 * The referenced controller object.
	 */
	private LoopController baseController;
	
	/**
	 * The application main pane for the GUI
	 */
	private LoopPanel basePanel;
	
	/**
	 * Creates a LoopFrame object with a linked LoopController for the MVC paradigm.
	 * @param baseController The referring controller.
	 */
	public LoopFrame(LoopController baseController)
	{
		this.baseController = baseController;
		basePanel = new LoopPanel(baseController);
		setupFrame();
	}
	
	/**
	 * Sets the content, size and visibility of the frame.
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(500, 500);
		this.setVisible(true);
	}
	
	
	
}
