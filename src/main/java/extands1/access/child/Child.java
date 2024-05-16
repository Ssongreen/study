package extands1.access.child;

import extands1.access.parent.Parent;

public class Child extends Parent {
	
	public void call() {
		
		publicValue = 1;
		protectedValue = 2; //상속 관계, 같은 패키지
		//defaultValue 다른 패키지 접근 불가
		//privateValue 접근 불가 
		
		publicMethod();
		protectedMethod();
//		defaultMehod();
//		privateMehod();
		
		printParent();
	}
}
