package day03;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class Example4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 문제1 : 점수를 정수형으로 입력받아 점수가 90점 이상이면 '합격' 아니면 '불합격' 출력 하시오
		System.out.println("성적 입력: ");
		int score1 = scan.nextInt();
		if(score1>=90) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
		// 문제2 : 점수를 정수형으로 입력받아 점수가 90점 이상이면 'A등급', 80점 이상이면 'B등급', 70점 이상이면 'C등급', 그외 '재시험' 으로 출력 하시오.
		System.out.println("점수 입력: ");
		int score2 = scan.nextInt();
		if(score2>=90) {
			System.out.println("A등급");
		}
		else if (score2>=80) {
			System.out.println("B등급");
		}
		else if (score2>=70) {
			System.out.println("C등급");
		}
		else {
			System.out.println("재시험");
		}
		// 문제 3 : 각 3개의 정수형으로 수를 입력받아 가장 큰 수를 출력 하시오. [ 전제조건 : 각 정수는 서로 다른 정수값 ]
		System.out.println("정수 입력: ");
		int num1 = scan.nextInt();
		System.out.println("정수 입력: ");
		int num2 = scan.nextInt();
		System.out.println("정수 입력: ");
		int num3 = scan.nextInt();
		if(num1>num2 && num1>num3) {
			System.out.printf("가장 큰 수 : %d", num1);
		}
		else if(num2 > num1 && num2>num3) {
			System.out.printf("가장 큰 수 : %d", num2);
		}
		else if(num3 > num1 && num3>num2) {
			System.out.printf("가장 큰 수 : %d", num3);
		}
		// 문제4 : 각 3개의 정수형으로 수를 입력받아 오름차순 순서대로 출력하시오. [ 전제조건 : 각 정수는 서로 다른 정수값 ]
		System.out.println("정수 입력: ");
		int num4 = scan.nextInt();
		System.out.println("정수 입력: ");
		int num5 = scan.nextInt();
		System.out.println("정수 입력: ");
		int num6 = scan.nextInt();
		int rank1 = 0;
		int rank2 = 0;
		int rank3 = 0;
		if(num4 < num5 && num4 < num6) {
			rank1 = num4;
			if (num5 > num6) {
				rank2 = num6;
				rank3 = num5;
			}
			else {
				rank2 = num5;
				rank3 = num6;
			}
		}
		if(num5 < num4 && num5 < num6) {
			rank1 = num5;
			if(num4 > num6) {
				rank2 = num6;
				rank3 = num4;
			}
			else {
				rank2 = num4;
				rank3 = num6;
			}
		}
		if(num6 < num4 && num6 < num5) {
			rank1 = num6;
			if(num4 > num5) {
				rank2 = num5;
				rank3 = num4;
			}
			else {
				rank2 = num4;
				rank3 = num5;
			}
		}
		System.out.printf("오름차순 : %d %d %d", rank1, rank2, rank3);
		// 스왑, 두 변수간의 값 바꾸기, temp 변수를 활용한 두 변수간의 값 바꾸기
		 	// int temp = 첫번째변수값; , 첫번째변수명 = 두번째변수값; , 두번째변수명 = temp값;
		
		/*문제5 : 가위바위보 게임 구현하기.
	      - 가위가 '0' 이고 바위가 '1' 이고 보가 '2' 일때 플레이어1와 플레이어2 가 있습니다.
	     - 승리자 판단과 무승부 경우의수를 출력하시오.
	      [입력 조건] 플레이어1 과 플레이어2 에게 각각 입력을 받습니다.
	     [출력 조건] 플레이어1 이기면 ' 플레이어1 승리 ', 플레이어2 이기면 ' 플레이어2 승리 ' 무승부 이면 '무승부' 출력 하시오.
	     */
		int scissors = 0;
		int rock = 1;
		int paper = 2;
		System.out.println("플레이어1 입력: ");
		int player1 = scan.nextInt();
		System.out.println("플레이어2 입력 : ");
		int player2 = scan.nextInt();
		if((player1 == 0 && player2 == 2) || (player1 == 1 && player2 == 0) || (player1 == 2 && player2 == 1)) {
			System.out.println("플레이어1 승리");
		}
		else if(player1 == player2) {
			System.out.println("무승부");
		}
		else {
			System.out.println("플레이어2 승리");
		}
		/*문제6 : 윤년/평년 판단하기
   		[ 입력조건 ] 하나의 연도를 입력 받습니다.
   		[ 윤년/평년 조건 ]
   		-연수가 4로 나누어 떨어지는 해는 윤년으로 한다.
   		-연수가 4, 100으로 나누어 떨어지는 해는 평년으로 한다.
  		-연수가 4, 100, 400으로 나누어 떨어지는 해는 윤년으로 둔다.
   		[ 출력조건] '입력한OOOO년 은' 윤년 입니다.  혹은 평년 입니다 로 출력하시오.*/
		System.out.println("하나의 연도 입력: ");
		int year = scan.nextInt();
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.printf("%d년는 윤년입니다.", year);
		}
		else {
			System.out.printf("%d년는 평년입니다.", year);
		}
		/*문제7 : 주차 사용요금 계산하기
		   [ 선언 변수 조건 ] 입차시간이 9시30분 입니다. 
		   - int 시 = 9;  int 분 = 30; 이와 같이 변수를 먼저 선언해주세요.
		   [ 출차시간 입력 조건 ] 출차시간의 시 와 분을 각 입력받아 각 변수에 저장하시오. 
		   [ 처리출력 조건 ] 1분당 1000원으로 계산하여 사용요금' 0000원' 을 출력하시오,
		   - 단 입차 시간 이전 으로 입력 할 경우에는 '출차시간 오류' 출력하시오.*/
		int hour1 = 9;
		int minute1 = 30;
		System.out.println("출차시간에서 시간 입력 : ");
		int hour2 = scan.nextInt();
		System.out.println("출차시간에서 분 입력: ");
		int minute2 = scan.nextInt();
		int money = (((hour2 - hour1)*60) + (minute2 - minute1)) * 1000;
		if(hour1 > hour2 || (hour1 == hour2 && minute1 > minute2)) {
			System.out.println("출차시간 오류");
		}
		else {
			System.out.printf("주차사용 요금 : %d원", money);
		}
		/*문제8 : 로그인 처리
		   [입력 조건] 아이디[문자열] 와 비밀번호[문자열] 를 입력받기
		   [처리출력 조건]
		   1. 아이디가 'admin' 이고 비밀번호가 '1234' 모두 동일하면 '로그인성공'
		   2. 아이디가 다르면 '아이디 정보가 일치하지 않습니다.'
		   3. 아이디는 일치하고 비밀번호가 다르면 '비밀번호 정보가 일치하지 않습니다'
		   [ 참고 ]
		   1. 문자열 비교시에는 == 같다 연산자 대신에 .equals() 함수를 이용해주세요.
		   예] 
		      String name = scan.next();
		      name =="admin" 대신에 name.equals( "admin" ) 사용.*/
		System.out.println("아이디 입력: ");
		String id = scan.next();
		System.out.println("비밀번호 입력");
		String pw = scan.next();
		if(id.equals("admin") && pw.equals("1234")) {
			System.out.println("로그인 성공");
		}
		else if(id.equals("admin")) {
			System.out.println("비밀번호가 일치하지 않습니다");
		}
		else {
			System.out.println("아이디 정보가 일치하지 않습니다");
		}
		
		/*문제9 : 당첨번호 개수  찾기
		   [ 선언 변수 조건 ] int 공1 = 14 ; int 공2 = 21 ; int 공3 = 9; 이와 같이 변수를 먼저 선언해주세요.
		   [ 입력 조건 ] 세개의 정수를 입력받아 각 변수에 저장하시오.
		   [ 출력 조건 ] 입력받은 세 정수 중에서 공1~공3 까지 동일한 번호 가 몇개 인지 출력하시오.*/
		int ball1 = 14;
		int ball2 = 21;
		int ball3 = 9;
		int count = 0;
		System.out.println("정수1 입력: ");
		int num7 = scan.nextInt();
		System.out.println("정수2 입력: ");
		int num8 = scan.nextInt();
		System.out.println("정수3 입력: ");
		int num9 = scan.nextInt();
		if(ball1 == num7 || ball2 == num7 || ball3 == num7) {
			count++;
		}
		if(ball1 == num8 || ball2 == num8 || ball3 == num8) {
			count++;
		}
		if(ball1 == num9 || ball2 == num9 || ball3 == num9) {
			count++;
		}
		System.out.printf("동일한 번호는 %d개입니다.", count);
	}

}
