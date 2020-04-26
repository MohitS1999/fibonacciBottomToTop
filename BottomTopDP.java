import java.util.*;
public class BottomTopDP{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			System.out.println("Bottom to Top :- "+bottomToTop(n));
			System.out.println("Bottom to Top Space Optimization :- "+bottomToTopspc(n));
		}
	}
	public static int bottomToTop(int n){
		int dp[]=new int[n+1];
		Arrays.fill(dp,0);
		dp[1]=1;
		for(int i=2;i<=n;i++){
			dp[i]=dp[i-1]+dp[i-2];
		}
		return dp[n];
	}
	public static int bottomToTopspc(int n){
		if (n==0 || n==1)
			return n;
		int a=0;
		int b=1;
		int c=0;
		for(int i=2;i<=n;i++){
			c=a+b;
			a=b;
			b=c;
		}
		return c;
	}
}