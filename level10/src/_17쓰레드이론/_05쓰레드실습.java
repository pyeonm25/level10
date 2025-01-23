package _17쓰레드이론;

import java.text.SimpleDateFormat;
import java.util.Scanner;

class InputMachine implements Runnable{

	private Scanner scan = new Scanner(System.in);
	public static char input;
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
		long preTime = System.currentTimeMillis();
		
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
	
		System.out.println(	sdf.format(preTime));
	}
}
