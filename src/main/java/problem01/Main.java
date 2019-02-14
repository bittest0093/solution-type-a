package problem01;

public class Main {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			int count = countClap(i);

			if (count == 0) {
				continue;
			}

			System.out.print(i + " ");

			for (int j = 0; j < count; j++) {
				System.out.print("짝");
			}

			System.out.println("");
		}
	}

	public static int countClap(int number) {

		int j=0;
		int	num1=number%10;
		if(num1==3||num1==6||num1==9) {
			j++;
		}
		int num2=number/10;
		if(num2==3||num2==6||num2==9) {
			j++;
		}
		
		
		return j;
	}
}