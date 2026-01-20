package ex02;

import java.util.Scanner;

public class TestClass02 {
	public static void main(String[] args) {
		//System.out.println("실행?");
		char ch = 0;
		double dou = 0;
		String str = null; //대문자로 시작하는 자료형은 null로 초기화
		int number = 0; //소문자로 시작하는 자료형은 0으로 초기화
		
		int k=0,e=0,m=0; //초기화를 먼저 해줘야 연산,출력 가능
		int sum;
		sum = k + e + m;
		System.out.println("합 : " + sum);
	}
	public static void main01(String[] args) {
		Scanner input = new Scanner(System.in); //무언가 입력받을 때 쓴다, new : 객체 생성
		int num;
		String name;
		System.out.println("이름 입력 : ");
		name = input.next(); //문자열을 입력받을 때(next)
		
		System.out.print("수 입력 : ");
		num = input.nextInt(); //정수를 입력받을 때(nextInt)
		
		System.out.println("이름 : " + name);
		System.out.println("수 : " + num);
	}
}
