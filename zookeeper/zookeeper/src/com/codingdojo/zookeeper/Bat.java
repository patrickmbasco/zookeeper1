package com.codingdojo.zookeeper;

public class Bat extends Mammal {
	Integer energyLevel = 300;
	
	public void fly() {
		System.out.println("taking off");
		energyLevel -= 50;
	}
	
	public void eatHumans() {
		System.out.println("yummy");
		energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("i hate this place");
		energyLevel -= 100;
	}
}
