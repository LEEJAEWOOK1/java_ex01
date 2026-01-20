package ex03;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		System.out.println("수 입력");
		//num = input.nextInt();
		System.out.println("=== 3의 배수 ===");
		if (num % 3 == 0) {
			System.out.println("3의 배수");
		}else {
			System.out.println("배수 아님");
		}
		
		System.out.println("=== 절대값 ===");
		int n = 0;
		System.out.println("수 입력");
		//n = input.nextInt();
		if(n < 0) {
			System.out.println(-n);
		}
		else {
			System.out.println(n);
		}
		
		System.out.println("=== 두 수 입력 받아 큰 수 ===");
		int num1=0, num2=0;
		System.out.println("첫번째 수");
		//num1 = input.nextInt();
		System.out.println("두번째 수");
		//num2 = input.nextInt();	
		if(num1 > num2) {
			System.out.println("더 큰 수 : "+num1);
		}else {
			System.out.println("더 큰 수 : "+num2);
		}
		
		System.out.println("=== 세 수 입력 받아 큰 수 ===");
		int n3=0, n4=0, n5=0;
		System.out.println("첫번째 수");
		//n3 = input.nextInt();
		System.out.println("두번째 수");
		//n4 = input.nextInt();	
		System.out.println("세번째 수");
		//n5 = input.nextInt();	
		
		if(n3 > n4 && n3> n5) {
			System.out.println("가장 큰 수 : "+n3);
		}else if(n4 > n3 && n4 > n5) {
			System.out.println("가장 큰 수 : "+n4);
		}else {
			System.out.println("가장 큰 수 : "+n5);
		}
		
		System.out.println("=== 두 수 입력 받아 큰 수가 짝수 ===");
		int a,b;
		System.out.println("첫번째 수");
		a = input.nextInt();
		System.out.println("두번째 수");
		b = input.nextInt();
		if(a > b && a % 2 == 0) {
			System.out.println("큰수이고 짝수 : "+a);
		}else if(b > a && b % 2 == 0) {
			System.out.println("큰수이고 짝수 : "+b);
		}else {
			System.out.println("해당 없음");
		}
	}
}
