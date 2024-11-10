package test09;

public class Cytech09 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[][] scores = {
	            {80, 75, 90, 88},  // 学生1: 国語、数学、理科、社会
	            {85, 92, 78, 80},  // 学生2: 国語、数学、理科、社会
	            {70, 60, 85, 95},  // 学生3: 国語、数学、理科、社会
	            {90, 88, 84, 77},  // 学生4: 国語、数学、理科、社会
	            {65, 70, 75, 60}   // 学生5: 国語、数学、理科、社会
	        };

	        // 科目名の配列
	        String[] subjects = {"国語", "数学", "理科", "社会"};

	        // 学生ごとに科目ごとの点数を表示
	        for (int i = 0; i < scores.length; i++) {
	            System.out.println("学生 " + (i + 1) + " の点数:");
	            for (int j = 0; j < scores[i].length; j++) {
	                System.out.println(subjects[j] + ": " + scores[i][j] + "点");
	            }
	            System.out.println();  // 学生ごとに空行を挿入
	        }
		
	}

}
