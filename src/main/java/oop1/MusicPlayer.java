package oop1;

public class MusicPlayer {
	
	int volume = 0;
	boolean isOn = false;
	
	void on() {
		isOn = true;
		System.out.println("음악 플레이어를 시작함");
	}
	void off() {
		isOn = false;
		System.out.println("음악 플레이어를 종료");
	}
	
	void volumUp() {
		volume ++;
		System.out.println("음악 볼륨 증가" + volume);
	}
	void volumDown(){
		volume --;
		System.out.println("음악 볼륨 다운" + volume);
	}
	void showStatus( ) {
		System.out.println("음악 플레이어 상태 확인");
		if(isOn) {
			System.out.println("음악 플레이어 ON 볼륨 : " + volume);
		}else {
			System.out.println("음악 플레이어 off");
		}
	}
}
