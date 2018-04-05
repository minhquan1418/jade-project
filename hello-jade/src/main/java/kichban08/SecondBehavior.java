package kichban08;

import jade.core.AID;
import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;

public class SecondBehavior extends Behaviour {

	private int step = 0;	// bien dem kiem soat nhiem vu
	private AID sender;		// AID nguoi gui message
	
	@Override
	public void action() {
		switch (step) {
		// lang nghe message den
		case 0:
			ACLMessage receivedMessage = myAgent.receive();
			if (receivedMessage != null) {
				// lay AID nguoi gui
				sender = receivedMessage.getSender();
				System.out.println("agent2 received message from agent1: " + receivedMessage.getContent());
				step = 1;
			} else {
				block();
			}
			break;
		// reply cho agent1
		case 1:
			ACLMessage replyMessage = new ACLMessage(ACLMessage.INFORM);
			replyMessage.setContent("hello agent2, nice to meet you");
			replyMessage.addReceiver(sender);
			myAgent.send(replyMessage);
			step = 2;
			break;
		}
	}

	@Override
	public boolean done() {
		return step == 2;
	}

}
