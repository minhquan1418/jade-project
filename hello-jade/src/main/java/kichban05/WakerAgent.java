package kichban05;

import jade.core.Agent;
import jade.core.behaviours.Behaviour;

public class WakerAgent extends Agent {
	
	@Override
	public void setup() {
		// tao mot WakerBehavior
		// tham so thu nhat cua constructor la agent chua behavior do
		// tham so thu hai cua constructor la thoi gian tinh bang milisecond
		Behaviour b = new MyWakerBehavior(this, 3000);
		
		// them behavior
		addBehaviour(b);
	}
}
