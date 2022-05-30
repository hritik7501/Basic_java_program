package basics_programs;
import java.util.*;
public class Pallindrome {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp =n,rev=0;
        while(temp!=0){
            int rem = temp%10;
            rev = rev*10+rem;
            temp=temp/10;
        }
        if(rev==n)
        System.out.println("pallindrome");
        else
        System.out.println("not pallindrome");
    }
}
