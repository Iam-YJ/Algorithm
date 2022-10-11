import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

class SolutionThreeReview {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int[] numArr = new int[4];
		
		for(int i=0; i<4; i++){
			numArr[i] = scanner.nextInt();
		}
	
		Arrays.sort(numArr);	
		System.out.println(Math.abs(numArr[3]+numArr[2]-numArr[1]-numArr[0]));
	}
}