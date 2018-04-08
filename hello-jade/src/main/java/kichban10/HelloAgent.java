package kichban10;

import jade.core.Agent;

public class HelloAgent extends Agent {

	@Override
	public void setup() {
		System.out.println("hello, i'm " + getAID().getName());
	}
	
	@Override
	public void takeDown() {
		System.out.println(getAID().getName() + " is down");
	}
}
