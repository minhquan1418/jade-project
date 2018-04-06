package kichban09;

import jade.core.Agent;
import jade.domain.DFService;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.ServiceDescription;

public class Agent1 extends Agent {
	
	@Override
	public void setup() {
		DFAgentDescription dfd = new DFAgentDescription();
		ServiceDescription sd = new ServiceDescription();
		
		// dfd gom name(AID cua agent) va danh sach cac services
		dfd.setName(getAID());
		
		sd.setName(getLocalName() + "hello-service");
		sd.setType("hello-service");
		dfd.addServices(sd);
		
		// DFService se goi register() de dang ki service voi default DF
		try {
			DFService.register(this, dfd);
			System.out.println("agent1 registered");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void takeDown() {
		// thuc hien huy dang ki
		try {
			DFService.deregister(this);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
