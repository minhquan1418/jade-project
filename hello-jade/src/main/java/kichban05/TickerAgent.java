package kichban05;

import jade.core.Agent;
import jade.core.behaviours.Behaviour;

public class TickerAgent extends Agent {
	
	@Override
	public void setup() {
		// tao TickerBehavior
		Behaviour b = new MyTickerBehavior(this, 3000);
		
		// them behavior
		addBehaviour(b);
	}
}
