package kichban03;

import jade.core.Agent;

public class ArgumentAgent extends Agent {

	@Override
	public void setup() {
		// lay danh sach argument bang getArguments()
		Object[] args = getArguments();
		
		// duyet danh sach tham so
		for(Object a : args) {
			System.out.println("" + a);
		}
	}
}
