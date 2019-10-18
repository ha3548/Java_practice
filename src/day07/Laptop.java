package day07;

public class Laptop implements Bluetooth , USB, LanCard{
	public static void main(String[] args) {
		Laptop l = new Laptop();
		Bluetooth b = l;
		b.getMaker();
		b.getVersion();
		b.getCapability();
	}
	
	public String getMaker() {
		return maker;
	}
	
	public double getVersion() {
		return version;
	}
	
	public String getCapability() {
		return capa;
	}
}

interface Bluetooth {
	String maker = "samsung";
	double version = 3.0;
	String capa = "128GB";

	public abstract String getMaker();
	public abstract double getVersion();
	public abstract String getCapability();
}

interface USB {

}

interface LanCard {

}