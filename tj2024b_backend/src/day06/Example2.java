package day06;

import java.util.Scanner;

/*
자바 과제4: 키오스크 프로그램
	- 문법 : 변수, 연산자, 제어문(조건문/반복문)
	- 제품은 콜라, 사이다, 환타 3개 존재
	- 각 제품의 제고는 초기에 10개씩 존재한다.
	- 각 제품의 가격은 콜라 1000원 사이다 1500원 환타 2000원 가정한다.
	- 제품을 선택시 재고 1 차감하고 장바구니에 담는다.
	- 메뉴] 1.콜라 2.사이다 3.환타 4.결제
		1 선택시 : 콜라 선택시 콜라 재고 1 차감하고 장바구니에 담는다.
		2 선택시 : 사이다 선택시 사이다 재고 1 차감하고 장바구니에 담는다.
		3 선택시 : 환타 선택시 환타 재고 1 차감하고 장바구니에 담는다.
		4 선택시 : 현재 장바구니에 담긴 모든 현황을 보여주고 금액 합산을 출력한다.
			ex] 콜라 1개, 사이다 2개, 환타 0개 총 금액: 4000원
		* 추가 유효성 검사: 만일 재고가 부족하면 "재고가 부족합니다"라고 출력하시오.
	
*/

public class Example2 {

	public static void main(String[] args) {
		int coke = 1000; int cokecount = 10;  int cokecount1 = 0; // 앞의 count = 재고, 뒤의 count = 장바구니에 담긴 수량
		int sprite = 1500; int spritecount = 10; int spritecount1 = 0; // 앞의 count = 재고, 뒤의 count = 장바구니에 담긴 수량
		int fanta = 2000; int fantacount = 10; int fantacount1 = 0; // 앞의 count = 재고, 뒤의 count = 장바구니에 담긴 수량
		int money = 0;
		while(true) {
			System.out.println("===키오스크 프로그램===");
			System.out.println("1.콜라 2.사이다 3.환타 4.결제");
			Scanner scan = new Scanner(System.in);
			int menu = scan.nextInt();
			if(menu == 1) {
				money += coke; 
				cokecount--;
				cokecount1++;
				System.out.println("콜라 선택"); 
				if(cokecount <= 0) {
				System.out.println("재고가 부족합니다");
				}
				
			}
			else if(menu == 2) { 
				money += sprite; 
				spritecount--; 
				spritecount1++;
				System.out.println("사이다선택");
				if(spritecount <=0) {
					System.out.println("재고가 부족합니다");
				}
			}
			else if(menu == 3) { 
				money += fanta; 
				fantacount--; 
				fantacount1++;
				System.out.println("환타선택");
				if(fantacount <=0) {
					System.out.println("재고가 부족합니다");
				}
			}
			else if(menu == 4) { 
				System.out.printf("콜라 : %d개, 사이다 : %d개, 환타 : %d개 총금액: %d",cokecount1, spritecount1, fantacount1, money);
				break;
			}
		}

	}

}
