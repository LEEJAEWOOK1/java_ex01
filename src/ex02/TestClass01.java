package ex02;
/*
	int : 정수 표현 - 4byte
	float, double : 실수 표현 - 4, 8byte
	char : 문자 하나 표현 - 2byte
	boolean : 참, 또는 거짓 표현 - 1byte
*/
public class TestClass01 {
	public static void main(String[] args) {
		int num = 100;
		double weight = 55.0, height = 170.3;
		System.out.println(num);
		System.out.println("나의 무게 : "+weight+"kg");
		System.out.println("나의 키 : "+height+"cm");
		
		num = num + 100;
		System.out.println("num 변경 : " + num);
		
		char ch = 'a'; //''는 문자 하나
		num = 5;
		int ret = ch + num;
		System.out.println("a + 5 = "+(char)ret);
		
		final int number = 200; //상수화처리 된거는 변경 불가
		final String STR = "문자열";
		System.out.println("str : " + STR);
	}
}
