package student복습;

import java.util.Scanner;

public class test {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int randomNumber = (int)(Math.random() * 10 + 1);
		
		System.out.print("정수 입력 1 : ");
		int num1 = sc.nextInt();
		System.out.println("정수 입력 2 : ");
		int num2 = sc.nextInt();
		
		
		System.out.println(randomNumber);
		System.out.printf("%d %% %d = %d \n", num1, num2, num1%num2);
		
	}
}