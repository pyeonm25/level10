package _17쓰레드이론;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;

class Timer implements Runnable {

	private BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
	private StringBuffer buffer = new StringBuffer();

	private boolean isRun = true;
	private int time;
	private SimpleDateFormat sdf;

	@Override
	public void run() {
		sdf = new SimpleDateFormat("HH:mm:ss");

		System.err.println("[q] STOP");
		System.err.println("[h] HOLD");
		System.err.println("[x] RERUN");

		while (isRun) {

			String order = InputManager.getValue();
			if (order.isBlank()) {

			} else if (order.equals("x")) {
				System.out.println("강제 종료");
				break;
			} else if (order.equals("q")) {
				buffer.setLength(0);
				buffer.append(String.format(">>> %d분 %d초 소요됨", time / 60, time % 60));
				break;
			} else if (!order.equals("q") && !order.equals("h")) {
				buffer.setLength(0);
				buffer.append(sdf.format(System.currentTimeMillis()));
				buffer.append(String.format(" [%2d sec]\n", ++time));

				try {
					writer.append(buffer);
					writer.flush();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		try {
			writer.append(buffer);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class InputManager implements Runnable {

	private boolean isRun = true;
	private static StringBuffer buffer = new StringBuffer();
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	private static String value = "";

	public static String getValue() {
		return value;
	}

	public void setValue() {
		try {
			buffer.setLength(0);
			buffer.append(reader.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		value = buffer.toString();
	}

	@Override
	public void run() {

		while (isRun) {
			setValue();
			if (value.equals("q")) {
				isRun = false;
				break;
			}

		}
		try {
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class Stopwatch {

	private Stopwatch() {
	}

	private static Stopwatch instance = new Stopwatch();

	public static Stopwatch getInstance() {
		return instance;
	}

	public void run() {
		Thread timer = new Thread(new Timer());
		timer.start();

		Thread input = new Thread(new InputManager());
		input.start();
	}
}
public class _05쓰레드실습 {
	public static void main(String[] args) {

		Stopwatch stopwatch = Stopwatch.getInstance();
		stopwatch.run();

	}
}
