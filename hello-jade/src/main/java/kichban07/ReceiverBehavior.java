package kichban07;

import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

public class ReceiverBehavior extends CyclicBehaviour {

	@Override
	public void action() {
		// agent goi receive() de lay message tiep theo trong hang doi
		ACLMessage msg = myAgent.receive();
		
		// neu nhan duoc message thi in ra cau thong bao
		if(msg != null) {
			System.out.println("receiver: message received!");
			System.out.println("message content " + msg.getContent());
		} else {
			// block action --> tiet kiem CPU
			block();
		}
	}

}
