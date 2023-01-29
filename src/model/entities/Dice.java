package model.entities;

import java.util.Random;

public class Dice {

	private int faces;
	
	public Dice() {
		
	}

	public Dice(int faces) {
		this.faces = faces;
	}

	public int getFaces() {
		return faces;
	}

	public int  roll() {
		Random random = new Random();
		return random.nextInt(this.faces)+1;
	}
}
