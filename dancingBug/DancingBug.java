/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Cay Horstmann
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 */

import info.gridworld.actor.Bug;

/**
 * A <code>SpiralBug</code> traces out a spiral starting with a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class DancingBug extends Bug {
    private int[] turnList;
    private int turncount;
    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public DancingBug(int[] turns)
    {
	turnList = turns;
	turncount = 0;
    }

    //turns the number of times and then continues like Bug
    public void act() {
        if ( turncount < turnList.length ){
	    for (int turnNum = 0; turnNum < turnList[turncount]; turnNum++){
		turn();
	    }
	    super.act();
	    turncount++;
	}
	if (turncount == turnList.length - 1) {
	    turncount = 0;
	}
	
    }

}
