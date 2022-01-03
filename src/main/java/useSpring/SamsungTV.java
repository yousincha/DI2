package useSpring;

public class SamsungTV implements TV{

	//private SonySpeaker speaker;
	//수정1. 배화스피커 사용 할 수 있도록 변수 선언
	private BaewhaSpeaker speaker;

	
	public SamsungTV() {
		
		System.out.println("삼성 티비 객체 생성");
	}
	
	//public SamsungTV(SonySpeaker speaker) {
		//this.speaker = speaker;
	//}
	public SamsungTV(BaewhaSpeaker speaker) {
		this.speaker = speaker;
	}
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
		// TODO Auto-generated method stub
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		speaker.volumeDown();
	}

}
