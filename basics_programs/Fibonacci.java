package basics_programs;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1 =0, n2 = 1;
		System.out.print(n1+" "+n2+" ");
		int next =0;
		for(int i =2;i<n;i++) {
			next=n1+n2;
			n1=n2;
			n2=next;
		System.out.print(next+" ");
		}
		

	}

}
