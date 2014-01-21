package loops.model;

import java.util.ArrayList;

public class Loop
{
	private ArrayList<String> graveNameList;

	public Loop()
	{
		graveNameList = new ArrayList<String>();

		fillTheNameList();
	}

	private void fillTheNameList()
	{
		graveNameList.add("Mildred Vincent O'Brien");
		graveNameList.add("Ibene Darnley");
		graveNameList.add("Harry P. Miller");
		graveNameList.add("Devvin D. Kraatz");
		graveNameList.add("Milton S. Brady");
		graveNameList.add("Kate M. Brady");
		graveNameList.add("Reinhold G. Erikson");
		graveNameList.add("Harold S. Wennerstrom");
		graveNameList.add("Christina N. Wennerstrom");
	}

	public ArrayList<String> getGraveNameList()
	{
		return graveNameList;
	}

	public String loopTestOne()
	{
		String loopResult = "";
		int timesLooped = 0;

		for (int loopCounter = 0; loopCounter < 10; loopCounter += 2)
		{
			loopResult += loopCounter + ", ";
			timesLooped++;
		}

		loopResult += "\nThe loop executed " + timesLooped + " times";

		return loopResult;
	}

	public String loopTestTwo()
	{
		String loopResult = "";
		int outerLoopTimes = 0;
		int timesLooped = 0;

		for (int weeks = 0; weeks < 52; weeks++)
		{

			for (int hours = 0; hours < 24; hours++)
			{

				for (int outerLoop = 0; outerLoop < 60; outerLoop++)
				{
					for (int loopCounter = 0; loopCounter < 60; loopCounter++)
					{
						// loopResult += loopCounter + ", ";
						timesLooped++;
					}
					outerLoopTimes++;
				}
			}
		}

		loopResult += "\nThe loop executed " + timesLooped + " times";

		return loopResult;
	}

	public String loopTestThree()
	{
		String loopResult = "";

		int outerLoopTimes = 0;
		int timesLooped = 0;

		for (int quarter = 0; quarter < 4; quarter++)
		{

			for (int nickel = 0; nickel < 5; nickel++)
			{
				for (int pennies = 0; pennies < 5; pennies++)
				{
					// loopResult += loopCounter + ", ";
					timesLooped++;
				}
				outerLoopTimes++;
			}
		}

		loopResult += "\nThe loop executed " + timesLooped + " times";

		return loopResult;
	}

}
