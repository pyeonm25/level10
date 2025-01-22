package _15함수형프로그래밍;

class Calculate{
	int add(int a, int b) {return a+b;}
	int subtract(int a, int b) {return a-b;}
	int multiply(int a, int b) {return a * b;}
}




public class _03함수형프로그래밍실습 {
	public static void main(String[] args) {
		Calculate cal = new Calculate();
		System.out.println(cal.add(10, 20));
		System.out.println(cal.subtract(10, 20));
		System.out.println(cal.multiply(10, 20));
		
		//함수형 인퍼페이스 CalFunction 만들어서 위와 같은 결과 실행 
		// 각각 인터페이스 변수 add, subtract, multiply 호출 
		
	}
}
