interface Smartdevice{
    void turnon();
	void turnoff();
	void getStatus();

}
// class implementing the interface

class Smartlight implements Smartdevice{

	@Override
	public void turnon() {
	System.out.println("smart light is one");
		
	}

	@Override
	public void turnoff() {
		System.out.println("smart light is off");
		
	}

	@Override
	public void getStatus() {
		System.out.println("smart light is in standly mode");
		
	}
	
}

public class interface1 {
	public static void main(String[] args) {
		Smartlight s=new Smartlight();
		s.turnoff();
		s.turnon();
		s.getStatus();
	}

}