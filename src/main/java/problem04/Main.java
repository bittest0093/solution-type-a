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

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(9)+1;
			
			for (int j=0; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					arr[j]=rd.nextInt(9)+1;
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
		answer[i]=sc.nextInt();
		}
		for(int i=0; i<=arr.length; i++) {
			if(arr[i]==answer[i]) {
				S++;
			}
			for(int j=1; j<=arr.length; j++) {
				if(arr[i]==answer[j]) {
					B++;
				}
				else {
					O++;
				}
			}
		}
		

	}
}