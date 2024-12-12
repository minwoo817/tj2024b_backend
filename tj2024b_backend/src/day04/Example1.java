package day04;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		/*
		- 형태
		switch(조건){
			case 값1:
				실행문;
				break;
		}
		
		- break : switch 종료 , 만일 break 없다면 아래 case의 실행문이 실행된다.
		*/
		// [1]
		int ranking = 1;
		char medalColor;
		switch(ranking) { 	// switch(조건) {case 값1: 실행문1 실행; break;} 
		case 1 : medalColor = 'G';
			break;
		case 2 : medalColor = 'S';
			break;
		case 3 : medalColor = 'B';
			break;
		default:
			medalColor = 'A';
		}
		System.out.println(ranking + "등 메달의 색깔은" + medalColor);
		
		// [2] 각 월마다 일수를 정하는 코드, case문 동시에 사용하기
		int month = 10;
		int day;
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
			day = 31; // month가 1 3 5 7 8 10 12 경우에 아래 코드가 실행된다.
			break;
		case 4: case 6: case 9: case 11:
			day = 30;
			break;
		case 2:
			day = 28;
			break;
		}
		
		// [3] '메달' 문자열에 따른 메시지 출력코드, case문에 문자열 사용하기
		String medal = "Gold";
		switch(medal) {
		case "Gold":
			System.out.println("금메달");
			break;
		case "Silver":
			System.out.println("은메달");
			break;
		case "Bronze":
			System.out.println("동메달");
			break;
		default: // 그외
			System.out.println("메달이 없습니다");
			break; // 생략가능
		}
		
		// [4] if는 조건 결과의 논리(T/F) 제어, switch는 조건결과의 값(value case) 제어 
		// int score = 80;
		// switch(score >= 80) {} : 조건문에 논리연산, 비교연산에 따른 논리결과 케이스가 아니다.	 e
			// case score >= 80 : 안됨
		
		
		// [5] 나혼자 코드
		Scanner scan = new Scanner(System.in);
		System.out.println("건물의 층 입력 : ");
		int floor = scan.nextInt();
		switch(floor) {
		case 1:
			System.out.println(floor+"층은 약국입니다.");
			break;
		case 2:
			System.out.println(floor+"층은 정형외과입니다.");
			break;
		case 3:
			System.out.println(floor+"층은 피부과입니다.");
			break;
		case 4:
			System.out.println(floor+"층은 치과입니다.");
			break;
		case 5:
			System.out.println(floor + "층은 헬스 클럽입니다.");
			break;
		}
		
		
		
		
	}
	
}
