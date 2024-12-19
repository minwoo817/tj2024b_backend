package day09;

import java.util.Scanner;

public class WaitingService {
	// 1. 명단등록 메소드 : 실행조건, 매개변수, 반환값
	void WaitingAdd(Scanner scan, Waiting[] waitings) {
		System.out.println("명단 등록");
		System.out.println("전화번호 : "); String number = scan.next();
		System.out.println("인원수 : "); int count = scan.nextInt();
		// [*] 객체 생성하고 객체내 멤버변수 접근하여 입력받은 값 대입
		Waiting waiting = new Waiting();
		waiting.number = number;
		waiting.count = count;
		boolean save = false;
		for(int i = 0; i < waitings.length; i++) {
			if(waitings[i] == null) {
				waitings[i] = waiting;
				save = true;
				break;
			}
		}
		if(save == true) {System.out.println("명단 등록 완료");}
		else {System.out.println("명단 등록 실패");}
	}
	// 2. 명단출력 메소드 
	void WaitingPrint(Waiting[] waitings) {
		System.out.println("명단 출력");
		for(int i = 0; i < waitings.length; i++) {
			if(waitings[i] != null) {
				Waiting waiting = waitings[i];
				System.out.printf("번호 : %d번, 전화번호 : %s, 인원수 : %d명 \n", i+1, waiting.number, waiting.count);
			}
		}
	}
}
