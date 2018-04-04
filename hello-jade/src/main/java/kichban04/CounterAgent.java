package kichban04;

import jade.core.Agent;
import jade.core.behaviours.Behaviour;

public class CounterAgent extends Agent {
	
	@Override 
	public void setup() {
		// tao mot behavior
		Behaviour counterBehavior = new CounterBehavior();
		System.out.println("Behavior vua duoc tao moi");
		
		// them behavior cho agent
		addBehaviour(counterBehavior);
		System.out.println("Behavior moi duoc them vao cho agent");
	}
	
	@Override
	public void takeDown() {
		System.out.println("agent is down");
	}
}
