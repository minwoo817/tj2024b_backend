package day01;

public class Example2 {

	public static void main(String[] args) {
		// 자료형/타입/분류 : 데이터를 나누는 방법
		
		/*
		 - 자바 기본 타입
		 	[논리] boolean	1바이트 true/false
		 	
		 	[문자] char		2바이트 유니코드, 'A', 작은따옴표로 감싼 한글자
		 		  String	N바이트 문자열클래스 , "ABC" , 큰따옴표로 감싼 문자열
		 	[정수] byte		1바이트 -128~+127
		 		  short		2바이트 -32768~+32767
		 		  int		4바이트 -2^31~+(2^31)-1 21억정도, 리터럴정수(키보드로 입력한 정수), 정수기본타입
		 		  long		8바이트 -2^63~+(2^63)-1 21억 이상
		 	
		 	[실수, 부동소수점] 
		 		  float		4바이트 소수점 8자리 표현
		 		  double	8바이트 소수점 17자리 표현
		 	
		 	* 왜? 타입을 여러가지 구분해서 범위 맞게 사용하려고 할까? 메모리 효율적으로 적절하게 선택하여 사용하자(설계)
		 */
		// 1. boolean 타입은 true와 false만 저장할 수 있다.
		boolean bool1 = true; System.out.println("bool1 : "+ bool1); // + 연결 연산자, "문자열"+변수호출값
		// boolean bool2 = 3; // 오류발생 : boolean 타입에 3을 저장할 수 없다.
		boolean bool3 = false; System.out.println("bool3 : "+ bool3);
		
		// 2. char 타입은 작은따옴표를 이용한 문자 1개만 저장할 수 있다.
		char ch1 = 'A'; System.out.println("ch1 : " + ch1);
		// char ch2 = 'ABC'; // 오류발생 : 문자1개만 저장가능하므로 오류
		// char ch3 = "ABC"; // 오류발생 : char는 큰따옴표를 사용할 수 없다.
		
		// 3. String 클래스타입은 큰따옴표를 이용한 문자여러개 저장할 수 있다. *참고로 기본타입은 아니다.
		String str1 = "ABC"; System.out.println("str1 : "+ str1);
		// String str2 = 'ABC' // 오류발생 : 문자 여러개는 큰따옴표로 감싸야한다.
		
		// 4. byte 타입은 -128~+127까지 저장이 가능하다.
		byte b1 = 100;	System.out.println("b1 : " + b1);
		// byte b2 = 300; // 오류발생 : 저장 허용범위를 벗어났기 때문에
		
		// 5. short 타입은 대략 +-30,000정도 저장이 가능하다.
		short s1 = 32000; System.out.println("s1 : " + s1);
		// short s2 = 40000; // 오류발생 : 저장 허용범위를 벗어났기 때문에
		
		// 6. int 타입은 대략 +-21억정도 저장이 가능하다.
		int i1 = 2100000000; System.out.println("i1 : "+ i1);
		// int i1 = 3100000000; // 오류발생 : 저장 허용범위를 벗어났기 때문에
		
		// 7. long 타입은 대략 +-21억 이상 저장이 가능하다. 정수리터럴값 뒤에 L/l을 붙인다.
		long l1 = 3100000000L; System.out.println("l1 : " + l1);
		// long l2 = 4000000000; //오류발생 : 리터럴값은 int이므로 long에 대입할 수 없다.
		
		// 8. float 타입은 소수점 8자리까지 저장이 가능하다. 실수리터럴값 뒤에 F/f를 붙인다.
		float f1 = 1.111F; System.out.println("f1 : " + f1); // 반올림 가능
		// float f1 = 1.111111111; // 오류발생 : 실수 리터럴 값은 double이므로 float에 대입할 수 없다.
		
		// 9. double 타입은 소수점 17자리까지 저장이 가능하다. 실수리터럴값의 기본타입
		double d1 = 1.111111111; System.out.println("d1 : " + d1);
	}

}
