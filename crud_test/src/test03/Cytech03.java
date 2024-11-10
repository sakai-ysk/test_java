package test03;

import java.time.Instant;

public class Cytech03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		long epochSecond = Instant.now().getEpochSecond();

        if (epochSecond % 2 == 0) {
            System.out.println("偶数です");
        } else {
            System.out.println("奇数です");
        }
	}

}
