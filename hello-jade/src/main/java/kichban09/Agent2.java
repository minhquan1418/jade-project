package kichban09;

import java.util.ArrayList;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.domain.DFService;
import jade.domain.FIPAException;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.ServiceDescription;

public class Agent2 extends Agent {
	private AID resultAID;
	
	@Override
	public void setup() {
		// them 1 Behavior de tim kiem 
		addBehaviour(new Behaviour() {
			
			@Override
			public boolean done() {
				// tim duoc AID roi thi huy behavior
				return resultAID != null;
			}
			
			@Override
			public void action() {
				DFAgentDescription dfd = new DFAgentDescription();
		        ServiceDescription sd  = new ServiceDescription();
		        
		        // tim kiem thi dfd se khong can phai setName()
		        // tim tat ca cac service co type la "hello-service"
		        sd.setType("hello-service");
		        dfd.addServices(sd);
		        
		        // ket qua se tra ve mang cac DFAgentDescription
				try {
					DFAgentDescription[] result = DFService.search(myAgent, dfd);
					if (result.length > 0) {
			        	resultAID = result[0].getName();
			        	System.out.println("found AID: " + resultAID.getName());
			        } else {
			        	block();
			        }
				} catch (FIPAException e) {
					e.printStackTrace();
				}
		      
			}
		});
	}
}
