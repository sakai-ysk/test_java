package test02;

public class Cytech02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int number1 = 10;
        int number2 = 50;

        // 演算の結果を格納する変数
        int sum = number1 + number2;           // 加算
        int difference = number1 - number2;    // 減算
        int product = number1 * number2;       // 乗算
        int quotient = number2 / number1;      // 除算
        int remainder = number2 % number1;     // 剰余算

        // 結果の出力
        System.out.println("加算結果 (足し算): " + sum);              // 10 + 50
        System.out.println("減算結果 (引き算): " + difference);        // 10 - 50
        System.out.println("乗算結果 (掛け算): " + product);          // 10 * 50
        System.out.println("除算結果 (割り算): " + quotient);          // 50 / 10
        System.out.println("剰余算結果 (割り算の余り): " + remainder); // 50 % 10
	}

}
