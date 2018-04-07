import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {
	
	public static int recursiveFactorial(int n) {
		if(n == 0) {
			return 1;
		}
		return n*recursiveFactorial(n-1);
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input=0;
		
		while(input != -1) {
			System.out.print("몇 팩토리얼을 출력할까요 0~12 (종료 : -1) : ");
			try {
				input = scan.nextInt();
				if(input < -1 || input > 12) {
					throw new Exception("범위를 벗어났습니다.");
				}
			} catch(InputMismatchException e) {
				scan.nextLine();
				System.out.println("올바른 값을 입력해 주세요.");
				continue;
			} catch(Exception e) {
				System.out.println(e.getMessage());
				continue;
			}
			System.out.println(input+"Factorial : "+recursiveFactorial(input));
		}
		
		scan.close();
	}
}
