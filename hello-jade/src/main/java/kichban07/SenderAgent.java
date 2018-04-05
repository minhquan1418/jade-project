package kichban07;

import jade.core.Agent;
import jade.core.behaviours.Behaviour;

public class SenderAgent extends Agent {
	
	@Override
	public void setup() {
		// tao SenderBehavior
		Behaviour b = new SenderBehavior();
		// them behavior
		addBehaviour(b);
		System.out.println("sender: message sent!");
	}
}
