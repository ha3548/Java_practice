package day07;

public class RemoteControl_ex {
	public static void main(String[] args) {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		System.out.println(rc.getVolume());
		rc.setVolume(10);
		System.out.println(rc.getVolume());
		
		RemoteControl.changeBattery();
	}
}
