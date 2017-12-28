package com.fju.mid.DiceRoller;

import java.util.Random;

public class DiceRoller {
	/*第七題
	請設計一個類別 com.fju.mid.DiceRoller，執行後以
	亂數模擬擲出3顆骰子，若骰子未出現二個全相同且另
	一個是不同數時，再擲一次，一直到出現只有二個完全
	相同時再結束程式。
	執行如下:
	3 5 4
	2 1 6
	4 3 1
	2 6 3
	5 5 1
	================================================
	第八題
	繼續修改第七題的DiceRoller，讓它可以在結束程式前
	，印出總共出現了幾次6點
	執行結果:
	3 5 1
	2 1 6
	4 2 1
	2 2 3
	6點出現1次
	================================================
	第九題
	繼續修改第八題的DiceRoller，讓它可以在結束程式前
	，印出總共出現了六種點數各出現幾次
	執行結果:
	3 5 1
	2 1 6
	4 2 1
	2 2 3
	1點出現3次
	2點出現4次
	3點出現2次
	4點出現1次
	5點出現1次
	6點出現1次
	 */
	public static void main(String[] args) {
		Random r = new Random();
		int rep = 0;
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int point1 = 0;
		int point2 = 0;
		int point3 = 0;
		int point4 = 0;
		int point5 = 0;
		int point6 = 0;
		while (rep==0) {
			for (int loop = 1; loop <= 3; loop++) {
				int n = r.nextInt(6)+1;
				if (n1==0) {
					n1 = n;
				}else if(n2==0){
					n2 = n;
				}else if (n3==0){
					n3 = n;
				}
				System.out.print(n+" ");
				switch (n) {
				case 1:
					point1=point1+1;
					break;
				case 2:
					point2=point2+1;
					break;
				case 3:
					point3=point3+1;
					break;
				case 4:
					point4=point4+1;
					break;
				case 5:
					point5=point5+1;
					break;
				case 6:
					point6=point6+1;
					break;
				}
			}
			if (!((n1!=n2) && (n2!=n3) && (n1!=n3))){
				rep=1;
				System.out.println("*");
			}else{
				System.out.println("");
				n1=0;
				n2=0;
				n3=0;
			}
		}
		for (int i = 1; i <= 6; i++) {
			System.out.print(i+"點出現");
			switch (i) {
			case 1:
				System.out.println(point1+"次");
				break;
			case 2:
				System.out.println(point2+"次");
				break;
			case 3:
				System.out.println(point3+"次");
				break;
			case 4:
				System.out.println(point4+"次");
				break;
			case 5:
				System.out.println(point5+"次");
				break;
			case 6:
				System.out.println(point6+"次");
				break;
			}
		}
	}
	

}
