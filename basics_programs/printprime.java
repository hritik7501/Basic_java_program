package basics_programs;
import java.util.*;
public class printprime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int flag=0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				flag=1;
		}
		if(flag==1)
			System.out.println("no is not prime");
		else
			System.out.println("no is prime");
			
		}
		
	}
	



