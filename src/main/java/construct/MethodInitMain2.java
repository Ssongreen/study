package construct;

import java.util.Iterator;

public class MethodInitMain2 {
	public static void main(String[] args) {
		Memberinit member1 = new Memberinit();
		initMember(member1, "user1", 15, 66);
		
		Memberinit member2 = new Memberinit();
		initMember(member2, "user2", 16, 77);
		
		Memberinit[] members = {member1, member2};
		
		for (Memberinit m : members) {
			System.out.println("이름 :" + m.name + " 나이 " + m.age + " 성적 " + m.grade);
		}
	}
	
	static void initMember(Memberinit member , String name, int age, int grade) {
		member.name = name;
		member.age = age;
		member.grade = grade;
	}
	
}
