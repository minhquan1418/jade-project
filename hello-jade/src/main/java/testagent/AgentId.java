package testagent;

import java.util.Iterator;

import jade.core.AID;
import jade.core.Agent;

public class AgentId extends Agent {

	@Override
	public void setup() {
		System.out.println("Agent info:");
		System.out.println("My local-name is " + getAID().getLocalName());
		System.out.println("My GUID is " + getAID().getName());
		System.out.println("My addresses are:");
		Iterator<AID> it = getAID().getAllAddresses();
		while (it.hasNext()) {
			System.out.println("- " + it.next());
		}
	}

}
