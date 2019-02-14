package problem04;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int[] arr = new int[3];
		int[] answer = new int[3];
		int S=0,B=0,O=0;
		boolean flag;

		int num=0;
		flag=false;
		for(int i=0; i<arr.length; i++) {
			flag=true;
			while(flag) {
				num=rd.nextInt(9)+1;
				flag=false;
			}
			for(int j=0; j<arr.length; j++) {
				if(arr[i]==num) {
					flag=true;
					break;
				}
			}
			arr[i]=num;
		}
		
		while(true) {
			int num2=sc.nextInt();
			for(int i=0; i<answer.length; i++) {
				answer[i]=num2;
			}
			
		}
	}
}