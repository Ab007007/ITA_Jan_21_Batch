package com.ita.training.java.interfaces;

public class Cow extends Animal implements DomasticAnimal, AnimalLivesIn
{

	@Override
	public void givesMilk() {
		System.out.println("Cow gives tastey milk!!!");
	}

	@Override
	public void livesIn() {
		System.out.println("Lives out side the house, and inside compound");
		
	}
	public static void main(String[] args) {
		
		Cow c = new Cow();
		c.family = "Cow";
		c.location = "India";
		
		System.out.println(c.family);
		System.out.println(c.location);
		System.out.println(c.maxAge);
		c.givesMilk();
		c.livesIn();
	}


	
}
