package kichban07;

import jade.core.AID;
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;

public class SenderBehavior extends OneShotBehaviour {

	@Override
	public void action() {
		// tao mot ACLMessage voi muc dich INFORM
		ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
		
		// ghi cac thong tin lien quan den message
		// nguoi nhan ten la "receiver"
		msg.addReceiver(new AID("receiver", AID.ISLOCALNAME));
		// noi dung cua message la "hello from sender"
		msg.setContent("hello from sender");
		
		// agent goi send() de gui goi tin
		myAgent.send(msg);
	}

}
