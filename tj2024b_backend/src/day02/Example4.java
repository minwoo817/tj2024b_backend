package day02;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		
		// [콘솔입력]
		// JS : prompt, document,querySelector().value
		// JAVA : Scanner
		
		// 1. 입력 객체 만들기 , 객체 생성 방법 : new 클래스명( ), 클래스명은 첫글자 대문자로 시작
			// new Scanner( ); // Scanner 클래스, Scanner 클래스 이용한 Scanner 객체 생성
			// new Scanner(System.in); // System.in 입력객체, Scanner 객체 생성시 입력객체를 인수로 전달한다.
			// Scanner scan // Scanner 타입으로 'scan' 변수 선언 // 기본타입(8가지)외 참조타입
		Scanner scan = new Scanner(System.in);
		// 2. 입력 객체로 콘솔에서 키보드로부터 입력받은 데이터 가져오기 함수 제공한다.
			// 객체란? 고유한 속성/데이터와 이벤트/함수를 가지는 실체물
			// 입력객체.nextXXX(); 
			// 엔터 기준으로 하나의 (next) 입력 마침 처리
		
		// [1] 변수명.next(), 문자열 입력받기
		System.out.print(".next() 문자열 입력: ");
		String str1 = scan.next();
		System.out.println("next() 입력 결과 : " + str1);
		
		// [2] 변수명.nextLine(), 키보드로부터 입력받은 데이터를 String 타입으로 반환 함수
			// * 주의할점 : nextLine()은 다른 nextXXX()코드와 사용시 앞전 nextXXX()의 엔터를 포함하므로 하나로 인식한다.
			// - 해결방안 : 의미없는 scan.nextLine() 사용하므로 실사용할 nextLine() 구분하기
		System.out.println(".nextLine() 문자열 입력 : ");
		scan.nextLine(); // 의미없는 단순 nextLine()
		String str2 = scan.nextLine();
		System.out.println(".nextLine() 문자열 결과 : " + str2);
		
		// [3] 변수명.nextInt(), 키보드로부터 입력받은 데이터를 int 타입으로 반환 함수, 허용범위 넘어가면 오류 발생
		System.out.println("nextInt() 정수 입력: ");
		int value1 = scan.nextInt();
		System.out.println("nextInt() 정수 결과 : " + value1);
		
		// [4] 변수명.nextbyte(), byte 타입으로 반환 함수
		System.out.println("nextbyte() 입력: ");
		byte value2 = scan.nextByte();
		System.out.println("nextByte() 결과 : " + value2);
		
		// [5] 변수명.nextShort(), short 타입으로 반환 함수
		System.out.println("nextShort() 입력: ");
		short value3 = scan.nextShort();
		System.out.println("nextShort() 결과 : " + value3);
		
		// [6] 변수명.nextLong(), long 타입으로 반환 함수
		System.out.println("nextlong() 입력: ");
		long value4 = scan.nextLong();
		System.out.println("nextLong() 결과 : " + value4);
		
		// [7] 변수명.nextFloat(), float 타입으로 반환 함수
		System.out.println("nextFloat() 입력: ");
		float value5 = scan.nextFloat();
		System.out.println("nextFloat() 결과 : " + value5);
				
		// [8] 변수명.nextDouble(), double 타입으로 반환 함수
		System.out.println("nextDouble() 입력: ");
		double value6 = scan.nextDouble();
		System.out.println("nextDouble() 결과 : " + value6);
				
		// [9] 변수명.nextBoolean(), boolean 타입으로 반환 함수
		System.out.println("nextBoolean() 입력: ");
		boolean value7 = scan.nextBoolean();
		System.out.println("nextBoolean() 결과 : " + value7);
		
		// + 오류 : 지정한 함수의 반환타입과 입력한 데이터 허용범위 벗어나면 InputMismatchException 오류 발생
	}

}
