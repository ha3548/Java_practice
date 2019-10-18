package day04;

public class TV_Ex {
	public static void main(String[] args) {
		TV t1 = new TV("»ï¼º");
		TV t2 = new TV("LG");
		
		t1.powerOn();
		t1.volumeUp();
		t1.volumeUp();
		t1.volumeUp();
		t1.volumeDown();
		t1.channel_ck(50);
		t1.powerOff();
		t1.channel_ck(40);
		
		System.out.println();
		
		t2.powerOn();
		t2.channel_ck(30);

	}
}
