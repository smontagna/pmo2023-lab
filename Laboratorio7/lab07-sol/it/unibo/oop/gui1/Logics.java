package a01a.sol2;

import java.util.*;

/*
 * A model for SelectorGUI. We suggest using methods to 
 * - return the String that each button should show at a given time,
 * - return the enabling state of each button (true/false)
 * - notify that a button has been pressed
 * - return the final string to show
 */

public interface Logics {
	
	int size();
	
	List<String> currentNames();
	
	List<Boolean> currentEnabling();
	
	String hit(int elem);
		
	String result();
	
	boolean toQuit();
}
