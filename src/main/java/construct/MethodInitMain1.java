package construct;

import java.util.Iterator;

public class MethodInitMain1 {
	public static void main(String[] args) {
		Memberinit member1 = new Memberinit();
		member1.name = "user1";
		member1.age = 13;
		member1.grade = 50;
		
		Memberinit member2 = new Memberinit();
		member2.name = "user2";
		member2.age = 16;
		member2.grade = 70;
		
		Memberinit[] members = {member1, member2};
		
		for (Memberinit m : members) {
			System.out.println("이름 :" + m.name + " 나이 " + m.age + " 성적 " + m.grade);
		}
	}
}
