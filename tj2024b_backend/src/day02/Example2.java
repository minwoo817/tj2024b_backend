package day02; // 폴더명

public class Example2 { // 클래스 시작

	public static void main(String[] args) { // main 시작
		
		// 1. 자동 (자료/타입)형 변환, 묵시적 (자료/타입)형 변환
			// - 1. 메모리 크기가 작은 것 부터 큰 순으로 변환
			// - 2. 데이터의 손실이 없다
			// - 3. 연산(계산)중에 큰 값으로 변환된다.(메모리 손실 방지)
			// byte -> short, char -> int -> long -> float -> double
		byte byteValue = 10;			// byte타입 'byteValue' 변수에 10 대입
		short shortValue = byteValue;	// short타입 'shortValue' 변수에 10 대입
		int intValue = shortValue;		// int타입 'intValue' 변수에 10 대입
		long longValue = intValue;		// long타입 'longValue' 변수에 10 대입
		float floatValue = longValue;	// float타입 'floatValue' 변수에 10 대입
		double doubleValue = floatValue; // double타입 'doubleValue' 변수에 10 대입
		System.out.println(doubleValue);
			// + 연산중에 묵시적 형변환 , 연산시 피연산자중에 더 큰 타입으로 결과를 반환한다.
				// byte + byte => int , int이하 byte와 short 연산 결과는 무조건 int 반환
				// byte + short => int
				// int + int => int
				// int + long => long
				// int + float => float
				// float + double => double
		byte b1 = 10; byte b2 = 20; short s1 = 30; int i1 = 40;
		float f1 = 3.14f; double d1 = 41.25;
		int result1 = b1 + b2;
		int result2 = b1 + s1;
		float result3 = i1 + f1;
		double result4 = f1 + d1;
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		// 2. 강제(자료/타입)형 변환, 명시적 (자료/타입)형 변환, 캐스팅
			// - 1. 메모리 크기가 큰값부터 작은 순으로 변환
			// - 2. 데이터의 (허용범위 외)손실이 있을수도 있다.
			// - 3. (변환할타입명)변수명
			// - double -> float -> long -> int -> short, char -> byte
		double value1 = 3.14;
		float value2 = (float)value1;
		long value3 = (long)value2;
		int value4 = (int)value3;
		short value5 = (short)value4;
		byte value6 = (byte)value5;
		System.out.println(value6);
		
		// +++ 자바특징중에 다형성(다양한 형식/타입을 가지는 성질)은 형변환으로부터 표현할 수 있다.
		
		char ch1 = 'A';
		System.out.println((int)ch1);
		int ch2 = 67;
		System.out.println((char)ch2);
		
		// + 연산중에 강제 타입변환
		int result5 = (int)381.14  + 3;
		System.out.println(result5);
		int a = 10;
		double b = 2.0;
		int result6 = a + (int)b;
		System.out.println(result6);
		
		char ch3 = '글';
		int c1 = ch3;
		System.out.println((char)(c1+1) + "?" +""+ (char)(c1+1) + "?");
			// JAVA 정수로 표현하면 , 74 65 86 65
		System.out.println((char)74 +""+ (char)65 +""+ (char)86 +""+ (char)65);
		
		char ch4 = 'A';
		char ch5 = 'B';
		System.out.println(ch4 + ch5);
	}

}
