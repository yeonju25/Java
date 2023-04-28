package ex03;

public class Exam01 {

	static void action(Robot r) {
		// r이 참조하고 있는 대상이 DanceRobot이면 true, 아니면 false.
//		if(r instanceof DanceRobot) { 
//			DanceRobot d = (DanceRobot)r;
//		d.dance();
//	} else if(r instanceof SingRobot) { // r이 참조하고 있는 대상이 SingRobot이면 true, 아니면 false.
//		SingRobot s = (SingRobot)r;
//		s.sing();
//	} else if(r instanceof DrawRobot) { // r이 참조하고 있는 대상이 DrawRobot이면 true, 아니면 false.
//		DrawRobot dr = (DrawRobot)r;
//		dr.draw();
//		}
		
		r.funcR();
	}
	
	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		for(int i=0; i<arr.length; i++)
			action(arr[i]);
	}
}
	

class Robot {
	void funcR() { }
}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
	void funcR() {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
	void funcR() {
		System.out.println("노래를 합니다.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
	void funcR() {
		System.out.println("그림을 그립니다.");
	}
}