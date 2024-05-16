package access.ex;

public class MaxCount {
	//내부에서 사용하는 숫자
	private int count = 0;
	
	//최대값
	private int max;
	
	public MaxCount(int max) {
		this.max = max;
	}

	//숫자 증가
	public void increment() {
		
		//검증 로직 return으로 하면 좋은 점은 검증로직이 복잡할때, 정리 되어 보이기 편하다.
		if(count >= max) {
			System.out.println("증가 할 수 없습니다.");
			return;
		}
		// 실행 로직 
		count ++;
	}
	
	//증가 값 반환
	public int getCount() {
		return count;
	}
	
	
}
