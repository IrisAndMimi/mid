package com.fju.mid.Lucky;

import java.util.Random;
import java.util.Scanner;

public class Lucky {
	/*第五題
	在mid專案中建立一個類別 com.fju.mid.Lucky
	能不跳行印出6個介於1~10之間的亂數
	================================================
	第六題.從上修改:
	先請使用者輸入一個1~10之間的幸運數字.印出6個亂數後
	告訴使用者這個數字有沒有出現過 
	Please enter a number: 7 (輸入值)
	3 1 4 8 8 1
	No
	執行結果: 
	Please enter a number: 3 (輸入值)
	2 6 10 9 3 6
	Yes
	 */
	public static void main(String[] args) {
		System.out.print("請輸入1~10之間的幸運數字 :");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		System.out.println("這個數字有沒有出現過......");
		int m = Integer.parseInt(line);
		Random r = new Random();
		int rep = 0;
		for(int a=0; a<6; a++){
			int n1  = r.nextInt(10)+1;
			System.out.print(n1);
			System.out.print(" ");

			if (n1==m){
			rep=1;
			}
		
		}
		System.out.println();
		if(rep==1){
			System.out.println("YES! YES! YES! YES!	Y E S !!!");
//			System.out.println("   Y E S !");
		}else{
			System.out.println("NO! NO! NO! NO! NO!");
		}
	
		
	}
}
