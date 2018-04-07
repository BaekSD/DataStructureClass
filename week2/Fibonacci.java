import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonacci {

	public static int binaryFib(int n) {
		if(n == 0 || n == 1)
			return n;
		
		return binaryFib(n-1) + binaryFib(n-2);
	}
	
	public static int[] linearFib(int n) {
		int fib[] = new int[2];
		int tmp;
		if(n <= 1) {
			fib[0] = n;
			fib[1] = 0;
			return fib;
		}
		
		fib = linearFib(n-1);
		tmp = fib[0];
		fib[0] += fib[1];
		fib[1] = tmp;
		return fib;
	}
	
	public static int linearFib2(int n) {
		int prev=0, curr=1, next=0;
		if(n <= 1)
			return n;
		
		for(int i=2; i<=n; i++) {
			next = prev + curr;
			prev = curr;
			curr = next;
		}
		return next;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input=0;
		
		while(input != -1) {
			System.out.print("몇번째 피보나치를 출력할까요 (종료 : -1) : ");
			try {
				input = scan.nextInt();
				if(input < -1) {
					throw new Exception("올바른 값을 입력해 주세요.");
				}
			} catch(InputMismatchException e) {
				scan.nextLine();
				System.out.println("올바른 값을 입력해 주세요.");
				continue;
			} catch(Exception e) {
				System.out.println(e.getMessage());
				continue;
			}

			System.out.println("binaryFib("+input+") : "+binaryFib(input));
			System.out.println("linearFib("+input+") : "+linearFib(input)[0]);
			System.out.println("linearFib2("+input+") : "+linearFib2(input));
		}
		
		scan.close();
	}
}
