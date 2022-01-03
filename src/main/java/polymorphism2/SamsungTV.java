package polymorphism2;

public class SamsungTV implements TV{

	private SonySpeaker speaker;
	
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("삼성 전원 켠다.");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("삼성 전원 끈다.");
	}

	@Override
	public void volumeUp() {
		speaker = new SonySpeaker();
		speaker.volumeUp();
		// TODO Auto-generated method stub
		//System.out.println("삼성 소리 높인다.");
	}

	@Override
	public void volumeDown() {
		speaker = new SonySpeaker();
		speaker.volumeDown();
		// TODO Auto-generated method stub
		//System.out.println("삼성 소리 내린다.");
	}

}
