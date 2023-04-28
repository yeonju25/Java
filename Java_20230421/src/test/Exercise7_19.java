package test;

public class Exercise7_19 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summary();
	}

}

class Buyer {
	int money = 1000;
	Product[] cart = new Product[3];	// 구입한 제품을 저장하기 위한 배열
	int i = 0;							// Product배열 cart에 사용될 index
	
	void buy(Product p) {
		if(money>=p.price) {
			money -= p.price;
			add(p);
		} else 
			System.out.println("잔액이 부족하여 " + p + "를 살 수 없습니다.");
		return;
	}
	
	void add(Product p) {
//			if(i<cart.length) {
//				cart[i] = p;
//			} else if(i>=cart.length) {
//				Product[] tmp = new Product[cart.length*2];
//				for(int i=0; i<cart.length; i++) {
//					tmp[i] = cart[i];
//				}
//				cart = tmp;
//				cart[i] = p;
//			}			
		
			if(i>=cart.length) {
				Product[] tmp = new Product[cart.length*2];
				for(int i=0; i<cart.length; i++) {
					tmp[i] = cart[i];
				}
				cart = tmp;
			}			
			cart[i] = p;
			
			i++;
	}
	
	void summary() {
		System.out.print("구입한 물건 : ");
		for(int i=0; i<cart.length; i++) {
			System.out.print(cart[i].toString() + ", "); // toString 빼고 cart[i]만 적어도 출력됨, 생략해도 자바가 기본적으로 toString이라고 출력			
		}

		System.out.println();
		int sum = 0;
		for(int i=0; i<cart.length; i++) {
			sum += cart[i].price;
		}
		System.out.println("사용한 금액 : " + sum);
		
		System.out.println("남은 금액 : " + money);
	}
	
}

class Product {
	int price;			// 제품의 가격
	
	public Product(int price) {
		this.price = price;
	}
}

class Tv extends Product {
	Tv() { super(100); }
	
	public String toString() { return "Tv"; }
}

class Computer extends Product {
	Computer() { super(200); }
	
	public String toString() { return "Computer"; }
}

class Audio extends Product {
	Audio() { super(50); }
	
	public String toString() { return "Audio"; }
}
