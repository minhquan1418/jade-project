package kichban07;

import jade.core.Agent;
import jade.core.behaviours.Behaviour;

public class ReceiverAgent extends Agent {
	
	@Override
	public void setup() {
		// tao SenderBehavior
		Behaviour b = new ReceiverBehavior();
		// them behavior
		addBehaviour(b);
	}
}
