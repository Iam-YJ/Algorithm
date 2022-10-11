import java.io.*;
import java.util.Scanner;

class SolutionOneReview {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		
		long answer = 1;
		for(int i=0; i<count; i++){
			answer *= scan.nextLong();
		}
		
		System.out.print(answer);
	
	}
}