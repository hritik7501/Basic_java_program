package basics_programs;
import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int sum=0;
		while(temp!=0) {
			int rem = temp%10;
			sum = sum+rem*rem*rem;
			temp = temp/10;
		}
		if(sum==n)
		System.out.println("armstrong");
		else
			System.out.println("not armstrong");
		

	}

}
