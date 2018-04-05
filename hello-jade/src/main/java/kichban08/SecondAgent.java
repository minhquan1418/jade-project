package kichban08;

import jade.core.Agent;
import jade.core.behaviours.Behaviour;

public class SecondAgent extends Agent {

	@Override
	public void setup() {
		Behaviour b = new SecondBehavior();
		addBehaviour(b);
	}
}
