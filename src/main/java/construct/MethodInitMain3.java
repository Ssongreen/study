package construct;

import java.util.Iterator;

public class MethodInitMain3 {
	public static void main(String[] args) {
		Memberinit member1 = new Memberinit();
		member1.initMember( "user1", 15, 66);
		
		Memberinit member2 = new Memberinit();
		member2.initMember( "user2", 16, 77);
		
		Memberinit[] members = {member1, member2};
		
		for (Memberinit m : members) {
			System.out.println("이름 :" + m.name + " 나이 " + m.age + " 성적 " + m.grade);
		}
	}
	
}
