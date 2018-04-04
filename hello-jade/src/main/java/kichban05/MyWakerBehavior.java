package kichban05;

import java.util.Date;

import jade.core.Agent;
import jade.core.behaviours.WakerBehaviour;

public class MyWakerBehavior extends WakerBehaviour {
	
	// constructor khong duoc thua ke tu lop cha
	// neu lop cha khong co constructor mac dich thi phai tao moi constructor cho lop con
	public MyWakerBehavior(Agent a, long timeout) {
		super(a, timeout);
	}

	@Override
	public void onWake() {
		System.out.println("one time hello");
	}
}
