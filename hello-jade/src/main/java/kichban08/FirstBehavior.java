package kichban08;

import jade.core.AID;
import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;

public class FirstBehavior extends Behaviour {

	private int step = 0;	// bien dem de kiem soat cac nhiem vu
	
	@Override
	public void action() {
		
		switch (step) {		
		// gui message cho SecondAgent
		case 0:
			ACLMessage sendingMessage = new ACLMessage(ACLMessage.INFORM);
			sendingMessage.setContent("hello agent2, this is agent1");
			sendingMessage.addReceiver(new AID("agent2", AID.ISLOCALNAME));
			myAgent.send(sendingMessage);
			step = 1;
			break;			
		// lang nghe reply tu SecondAgent
		case 1:
			ACLMessage repliedMessage = myAgent.receive();
			if(repliedMessage != null) {
				System.out.println("agent1 received reply from agent2: " + repliedMessage.getContent());
				step = 2;
			} else {
				block();
			}
			break;
		}
	}

	@Override
	public boolean done() {
		return step == 2;
	}

}
