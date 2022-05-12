package week11;

public class SmartPhone extends Calc implements PhoneInterface{
	
	@Override
	public void sendCall() {
		System.out.println("띠리리링");		
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
		
	}
	
	public void schedule() {
		System.out.println("일정관리합니다.");
	}

	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		System.out.println("3과 5을 더하면 "+ phone.calculate(3, 5));
		phone.schedule();				
	}
}
