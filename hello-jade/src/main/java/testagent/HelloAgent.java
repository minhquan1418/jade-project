package testagent;

import jade.core.Agent;

public class HelloAgent extends Agent {
	
	@Override
	public void setup() {
		System.out.println("Hello i'm the first agent");
	}
}
