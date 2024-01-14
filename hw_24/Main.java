package hw_24;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String input; // 사용자 입력


		Customer s = new Customer();

		s.check();
		s.print();


		Shop w = new Shop();
		w.check();
		w.print();
	}
}

interface Info {
	String check();
	void print();
}

// 여기에 프로그램을 작성하시오.
class Customer implements Info{
	String id;
	String pwd;

//	Customer(String id, String pwd){
//		this.id = id;
//		this.pwd = pwd;
//	}
	
	@Override
	public String check() {
		String return_id;
		String[] customer_id = {"smlim", "jbkim"};
		String[] customer_pwd = {"smlim123", "jbkim123"};
		Scanner sc = new Scanner(System.in);
		System.out.print("id를 입력하세요:");
		String input_id = sc.nextLine();
		System.out.print("비밀번호를 입력하세요:");
		String input_pwd = sc.nextLine();

		for (int i = 0; i < customer_id.length; i++) {
			if (input_id.equals(customer_id[i])) {
				if (input_pwd.equals(customer_pwd[i])) {
					System.out.println("로그인되었습니다.");
				}
				return customer_id[i];
            }
		}
		return "아이디와 비밀번호가 일치하지 않습니다.";
	}

	@Override
	public void print(){
//		System.out.println("로그인한 아이디:"+check());
	}
	
}

class Shop implements Info{
//	String[] item_list = {"핸드폰", "충전기", "청소기", "휴지"};
	
	public String check(){
		String return_item;
		String[] item_list = {"핸드폰", "충전기", "청소기", "휴지"};
		int[] item_price = {100000, 30000, 150000, 5000};
		Scanner sc = new Scanner(System.in);
		System.out.println("구매할 물건을 입력합니다.");
		System.out.print("구매 가능한 물품 : [핸드폰, 충전기, 청소기, 휴지]");
		String item = sc.nextLine();

		for(int i=0; i<item_list.length; i++){
			if(item.equals(item_list[i])){
				System.out.println("구매가 완료되었습니다.");
				System.out.print(item+"의 가격은 "+item_price[i]+"원 입니다.");
				return_item = item_list[i];
				return return_item;
			}
		}
		return "구매에 실패했습니다.";
	}

	public void print(){
//		System.out.print("물품명: "+check());
	}
}








