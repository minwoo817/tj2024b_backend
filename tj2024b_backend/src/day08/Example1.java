package day08;

import java.util.Scanner;

/*
자바 과제7 : (식당) 대기번호 발행 프로그램
- 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문) , 클래스(멤버변수)/객체, 배열
- 전화번호 , 인원수 를 입력받아서 저장·출력 구현
- 명단 클래스 설계한다.
- 총 대기명단은 100개 까지 가능하다. 
제출 : 카카오톡방에 과제 코드가 존재하는 본인 git 상세주소 제출 
*/
public class Example1 {

	public static void main(String[] args) {
		
		Waiting[] waitingArray = new Waiting[100];
		while(true) {
			System.out.println("1.명단 등록 2.명단 확인");
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt();
			if(choose == 1) {
				System.out.print("전화번호 :"); 	String phone = scan.next();
				System.out.print("인원수 : ");	int count = scan.nextInt();
				Waiting waiting = new Waiting();
				waiting.phone = phone; waiting.count = count;
				boolean state = false;
				for(int i = 0; i <= waitingArray.length-1; i++) {
					if(waitingArray[i] == null) {
						waitingArray[i] = waiting;
						state = true;
						break;
					}
				}
				if (state == true) {
					System.out.println("명단 등록 완료");
				}
				else {
					System.out.println("명단 등록 실패");
				}
			}
			else if(choose == 2) {
				for(int i = 0; i <= waitingArray.length-1; i++) {
					if(waitingArray[i] != null) {
						Waiting waiting = waitingArray[i];
						System.out.printf("순번 : %d, 전화번호 : %s, 인원수 : %d \n", i+1, waiting.phone, waiting.count);
					}
				}
			}
		}

	}

}
