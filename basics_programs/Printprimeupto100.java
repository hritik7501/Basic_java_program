package basics_programs;
import java.util.*;
public class Printprimeupto100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean isprime=true;
		int n = sc.nextInt();
		for(int i=2;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
				  isprime=false;
				}
			}
		if(isprime==true)
			System.out.println(i);
		}

	}

}
