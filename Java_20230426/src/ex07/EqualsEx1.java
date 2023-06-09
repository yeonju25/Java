package ex07;

class Value{
	String name;
	int value;
	public Value(String name, int value) {
		this.name = name;
		this.value = value;
	}
	
//	@Override
//	public boolean equals(Object obj) {
////		if(this.value == ((Value)obj).value)
////			return true;
////		else
////			return false;
//		// 위의 if문 간략하게 삼항연산자로 표시
//		return this.value == ((Value)obj).value ? true : false;
//	}
//	
	@Override
	public String toString() {
		
		return "[name : " + name + ", value :" + value + "]";
	}
	
}

public class EqualsEx1 {

	public static void main(String[] args) {
		Value v1 = new Value("kim",10);
		Value v2 = new Value("Park",10);
		
		System.out.println(v1 == v2);
		System.out.println(v1.equals(v2));
		System.out.println(v1.toString());
		System.out.println(v2.toString());
		
	}

}
