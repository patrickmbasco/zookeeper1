package com.codingdojo.zookeeper;

public class Gorilla extends Mammal {
	public void throwSomething() {
		System.out.println("Throw a banana peel");
		energyLevel -= 5;
	}
	
	public void eatBananas() {
		System.out.println("Ate a banana");
	}
	
	public void climb() {
		System.out.println("Climbed a tree");
		energyLevel -= 10;
	}
}
