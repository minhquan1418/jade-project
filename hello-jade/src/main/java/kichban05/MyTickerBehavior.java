package kichban05;

import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;

public class MyTickerBehavior extends TickerBehaviour {

	// constructor
	public MyTickerBehavior(Agent a, long period) {
		super(a, period);
	}
	
	@Override
	protected void onTick() {
		System.out.println("hello again and again");
	}

}
