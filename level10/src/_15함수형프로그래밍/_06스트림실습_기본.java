package _15함수형프로그래밍;

import java.util.ArrayList;
import java.util.List;

public class _06스트림실습_기본 {
	
	public static List<Item> setData(){
		List<Item> itemList = new ArrayList<Item>();

		itemList.add(new Item(1001,"과자", "새우깡", 1500));
		itemList.add(new Item(1002,"음료수", "사이다", 1000));
		itemList.add(new Item(1003,"과자", "고래밥", 3000));
		itemList.add(new Item(1004,"음료수", "콜라", 500));
		itemList.add(new Item(1005,"고기", "닭고기", 15000));
		itemList.add(new Item(1006,"고기", "돼지고기", 20000));
		itemList.add(new Item(1005,"고기", "닭고기", 15000));
		itemList.add(new Item(1002,"음료수", "사이다", 1000));
		itemList.add(new Item(1002,"음료수", "사이다", 1000));
		itemList.add(new Item(1008,"과자", "홈런볼", 3500));
		
		return itemList;
	}
	public static void main(String[] args) {
		
	}

}
