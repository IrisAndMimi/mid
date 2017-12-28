package com.fju.mid;

import java.util.Scanner;

public class Numbers {
	//讓使用者輸入數字.不跳行一一列出.每逢5的倍數.在前面加#字.最多出到10
	public static void main(String[] args) {
		System.out.println("請輸入數字");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int m = Integer.parseInt(line);
		if(m>10){
			int r=10;
			m=r;
		}
		for(int a = 1; a<m+1 ;a++){
			if(a%5==0){
				System.out.print("# ");
			}
			System.out.print(a);
			System.out.print(" ");
		}
	}

}
