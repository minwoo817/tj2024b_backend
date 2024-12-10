package day02;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		
		// JS DAY10 연산자 문제 10개를 자바로 풀이하기
		
		// 입력 : Scanner scan = new Scanner(System.in); scan.nextXXX();
		// 출력 : System.out.println();
		Scanner scan = new Scanner(System.in);
		//[지문1] nextXXX() 함수로 국어, 영어, 수학 점수를 각 입력받아서 각 변수에 저장하고 총점과 평균을 계산하여 콘솔에 출력
		
		System.out.println("국어점수 : ");
		int i1 = scan.nextInt();
		System.out.println("수학점수 : ");
		int i2 = scan.nextInt();
		System.out.println("영어점수 : ");
		int i3 = scan.nextInt();
		int result1 = i1 + i2+ i3;
		int result2 = (i1 + i2 + i3) / 3;
		System.out.printf("총점 : %d 평균 : %d /n", result1, result2);
		
		 // [지문2] 반지름를 입력받아서 원넓이[반지름*반지름*3.14] 계산하여 console탭에 출력하시오.
		System.out.println("반지름 입력: ");
		int i4 = scan.nextInt();
		double result4 = i4 * i4 * 3.14;
		System.out.printf("원넓이 : %.2f /n", result4);
		
		// [지문3] 두 실수를 입력받아서 앞 실수의 값이 뒤실수의 값의 비율% 계산하여 console탭에 출력하시오.
		System.out.println("실수 1 입력 : ");
		double f1 = scan.nextDouble();
		System.out.println("실수 2 입력 : ");
		double f2 = scan.nextDouble();
		double result5 = f1 / f2 * 100;
		System.out.printf("비율 : %.0f% /n", result5);
	
		// [지문4] 정수를 입력받아 입력받은 값이 홀수이면 true / 짝수이면 false 로 console탭에 출력하시오.
		System.out.println("점수 : ");
		int i5 = scan.nextInt();
		String result9 = i5 % 2 != 0 ? "true" : "false";
		System.out.println(result9);
		// [지문5] 정수를 입력받아 입력받은 값이 7의 배수이면 true / 아니면 false 로 console탭에 출력하시오.
		System.out.println("점수 : ");
		int i6 = scan.nextInt();
		String result10 = i6 % 7 == 0 ? "true" : "false";
		System.out.println(result10);
		// [지문6] 정수를 입력받아 입력받은 값이 홀수 이면서 7배수 이면 true / 아니면 false 로 console탭에 출력하시오.
		System.out.println("점수 : ");
		int i7 = scan.nextInt();
		String result11 = i7 % 2 != 0 && i7 % 7 == 0 ? "true" : "false";
		System.out.println(result11);
		// [지문7] 십만원 단위의 금액을 입력받아 입력받은 금액의 지폐수를 console탭에 출력하시오.
		System.out.println("금액 입력 : ");
		int i8 = scan.nextInt();
		int result6 = i8 / 100000;
		int result7 = i8 % 100000 / 10000;
		int result8 = i8 % 10000 / 1000;
		System.out.printf("십만원 : %d장 만원 : %d장 천원 : %d장  /n", result6, result7, result8);
	
		 // [지문8] 1차점수 와 2차점수 각각 입력받아서 
        // -> 총점이 150점이상이면 '합격' 아니면 '불합격' 으로 console탭에 출력하시오.
		System.out.println("1차점수 : ");
		int i9 = scan.nextInt();
		System.out.println("2차점수 : ");
		int i10 = scan.nextInt();
		String result12 = i9 + i10 >= 150 ? "합격" : "불합격";
		System.out.println(result12);
	
	
	}
}
