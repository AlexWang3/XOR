package XOR;
import java.util.*;
public class XOR {
	static int N;
	static Scanner in=new Scanner(System.in);
	static long [][]num;
	public static void main(String[] args) {
		N=in.nextInt();
		num=new long[N][2];
		for(int i=0;i<N;i++) {
			num[i][0]=in.nextLong();
			num[i][1]=in.nextLong();
		}
		for(int i=0;i<N;i++)
			System.out.println(Calculate(num[i][0],num[i][1]));
	}
	private static long Calculate(long l, long m) {
		int k1=(int)Math.pow(2, Findtime(l)+1);
		int k2=(int)Math.pow(2, Findtime(m));
		long result1=0;
		long result2=0;
		for(long i=l;i<k1;i++) {
			result1=result1^i;
		}
		for(long i=k2;i<=m;i++) {
			result2=result2^i;
		}
		return result1^result2;
	}
	private static int Findtime(long t) {
		int count=0;
		while (t!=1) {
			t=t/2;
			count++;
		}
		return count;
	}

}
