package day07;

public class Example5 {

	public static void main(String[] args) {
		// 임의의 점수 5개를 배열에 저정하고 총점, 평균
		int[] score = new int[] {5,10,15,40,50};
		int sum1 = 0;
		int avg = 0;
		for(int j = 0; j < score.length; j++) {
			sum1 += score[j];
			avg = sum1 / score.length;
		}
		System.out.println(sum1);
		System.out.println(avg);	

	}

}
