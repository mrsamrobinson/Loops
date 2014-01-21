package loops.controller;

import loops.model.Loop;
import loops.view.LoopFrame;

/**
 * Controller object for the Loop project.
 * @author Sam Robinson
 * @version 1.0 11/5/13 added data member and start method.
 */
public class LoopController
{
	private LoopFrame loopFrame;
	private Loop myLoop;
	
	public LoopController()
	{
		this.myLoop = new Loop();
	}
	
	public Loop getLoopApp()
	{
		return myLoop;
	}
	
	/**
	 * Starts the app.
	 */
	public void start()
	{
		loopFrame = new LoopFrame(this);
	}
	
	public String getLoopResults()
	{
		String currentResults = myLoop.loopTestThree();
		return currentResults;
	}
	
	private String getText(int position)
	{
		String results = "";
		
		results = myLoop.getGraveNameList().get(position);
		
		return results;
	}
	
}
