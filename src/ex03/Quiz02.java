package ex03;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("=== 5의배수 ===");
		int n1=0;
		System.out.print("입력: ");
		//n1 = input.nextInt();
		if(n1 % 5 == 0) {
			System.out.println("5의 배수");
		}else {
			System.out.println("5의 배수 아님");
		}
		
		System.out.println("=== 0보다 크고 100보다 작으면 정상, 아니면 비정상 ===");
		int n2=0;
		System.out.print("입력: ");
		//n2 = input.nextInt();
		if(n2 > 0 && n2 < 100) {
			System.out.println("정상");
		}else {
			System.out.println("비정상");
		}
		
		System.out.println("=== 짝수이면서 3의 배수 ===");
		int n3=0;
		System.out.print("입력: ");
		//n3 = input.nextInt();
		if(n3 % 2 == 0 && n3 % 3 ==0 ) {
			System.out.println("짝수+3의배수");
		}else {
			System.out.println("해당 없음");
		}
		
		System.out.println("=== 세 수 입력, 가장 큰수, 두번째 큰수, 마지막 수 ===");
		int n4=0,n5=0,n6=0;
		System.out.print("입력: ");
		n4 = input.nextInt();
		n5 = input.nextInt();
		n6 = input.nextInt();
		if(n4 > n5 && n4 > n6) {
			System.out.println("가장 큰수 : "+n4);
			if(n5 > n6) {
				System.out.println("두번째 큰수 : "+ n5);
				System.out.println("마지막 수 : "+ n6);
			}else {
				System.out.println("두번째 큰수 : "+ n6);
				System.out.println("마지막 수 : "+ n5);
			}
		}else if(n5 > n4 && n5 > n6) {
			System.out.println("가장 큰수 : "+n5);
			if(n4 > n6) {
				System.out.println("두번째 큰수 : "+ n4);
				System.out.println("마지막 수 : "+ n6);
			}else {
				System.out.println("두번째 큰수 : "+ n6);
				System.out.println("마지막 수 : "+ n4);
			}
		}else {
			System.out.println("가장 큰수 : "+n6);
			if(n4 > n5) {
				System.out.println("두번째 큰수 : "+ n4);
				System.out.println("마지막 수 : "+ n5);
			}else {
				System.out.println("두번째 큰수 : "+ n5);
				System.out.println("마지막 수 : "+ n4);
			}
		}
	}
}
