package com.nagesh.learneroo;

public class Dice {

	public int roll(int i, int j) {
		
		if (i<1 || i> 6 || j<1 || j>6) {
			return -1;
		}
		
		return (i == j) ? 2*(i+j) : (i+j); 
	}

}
