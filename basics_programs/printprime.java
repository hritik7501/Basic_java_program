package basics_programs;
import java.util.*;
public class printprime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=2;i<=n;i++) {
			boolean isprime=true;
			for(int j=1;j<=i/2;j++) {
				if(i%j==0) {
					isprime=false;
				}
			}
			if(isprime==true)
				System.out.println(i);
		}
		
	}
	
}


