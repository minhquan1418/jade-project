package kichban04;

import jade.core.behaviours.Behaviour;

public class CounterBehavior extends Behaviour {

	private int counter = 0;
	
	@Override
	public void action() {
		++counter;
		System.out.println("counter = " + counter);
	}

	@Override
	public boolean done() {
		return counter == 3;
	}

}
