package _17쓰레드이론;

import java.util.Scanner;

class InputMachine implements Runnable{

	private Scanner scan = new Scanner(System.in);
	
	@Override
	public void run() {
		System.out.println(">>>>");
		
	}
	
}

class StopWatch implements Runnable{

	private int time; // 소요시간 출력 
	
	@Override
	public void run() {
		System.out.println("[q] quit [h] hold [x] return");
		long preTime = System.currentTimeMillis();
	}
	
}

public class _05쓰레드실습 {
	public static void main(String[] args) {
		
	}
}
