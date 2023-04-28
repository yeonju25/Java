package ex02;

class Unit{
	int x, y;
	
	void move(int x, int y) { 	}
	void stop() { }	
}

class Marine extends Unit{
	void stimPack() { }
	void move(int x, int y) { 
		System.out.println("걸어서 이동");
	}
}

class Tank extends Unit{
	void changeMode() { }
	void move(int x, int y) { 
		System.out.println("탱크로 이동");
	}
}

class Dropship extends Unit{
	void move(int x, int y) { 
		System.out.println("배로 이동");
	}
	void load() { }
	void unload() { }
}

class 비행기 extends Unit{
	void move(int x, int y) {
		System.out.println("날아서 이동");
	}
}

	// 다형성 개념, 확장이 용이하다.

public class Exam01 {

	public static void main(String[] args) {
		Dropship dr = new Dropship();
		move(dr);
		Marine mr = new Marine();
		move(mr);
		Tank ta = new Tank();
		move(ta);
		
		비행기 비 = new 비행기();
		move(비);
	}

	static void move(Unit u) {
		u.move(10, 10);
	}
	
}
