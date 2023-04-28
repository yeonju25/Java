package testAnswer;

public class Exercise7_19_A {

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
		if(money < p.price) {
			System.out.println("소지한 돈은 " + money + "입니다."
					+ (p.price-money) + "부족합니다.");
			return;
		} 
		money -= p.price;
		add(p);
	}
	
	void add(Product p) {
		if(i>=cart.length) {
			Product[] tmp = new Product[cart.length*2];
			System.arraycopy(cart, 0, tmp, 0, cart.length);
			cart = tmp;
		}
		cart[i] = p;
		i++;
	}
	
	void summary() {
		System.out.print("구입한 물건 : ");
		for(int i=0; i<cart.length; i++) 
			System.out.print(cart[i] + ", ");			
		System.out.println();
		System.out.println("사용한 금액 : " + (1000 - money));
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
