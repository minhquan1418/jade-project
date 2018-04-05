package kichban08;

import jade.core.Agent;
import jade.core.behaviours.Behaviour;

public class FirstAgent extends Agent {
	
	@Override
	public void setup() {
		Behaviour b = new FirstBehavior();
		addBehaviour(b);
	}
}
