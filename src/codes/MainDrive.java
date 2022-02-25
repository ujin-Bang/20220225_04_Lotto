package codes;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
//		6개의 숫자 입력받기.
		
		Scanner myScanner = new Scanner(System.in);
		
		int[] myNumbers = new int[6];
		
		for(int i=0; i<myNumbers.length; i++) {
			
			while (true) {
				
				System.out.print((i+1) + "번째 숫자 : ");
				int inputNum = myScanner.nextInt();
				
				boolean isRangeOk = (1 <= inputNum) && (inputNum <=45);
				
				boolean isDuplOk = true;
				
				for(int myNum : myNumbers) {
					if(myNum == inputNum) {
						isDuplOk = false;
						break;
					}
				}
				
				if(isRangeOk && isDuplOk) { 
					
					myNumbers[i] = inputNum;
					
					break;
				}
			}
			
		}
		
		int[] winNumbers = new int[6];
		
		for (int i=0; i<winNumbers.length; i++) {
			
			while (true) {
				
//				Math.random() => 0<= 랜덤값*45+1 <46 
//				cf) Random 클래스를 활용해도 됨.
				int randomNum = (int)(Math.random()*45+1);
				
				
				
			}
		}
		
	}
}
