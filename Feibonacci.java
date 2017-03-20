public class Feibonacci
{
	public static void main(String[] args)
	{
		long [] A=new long[50];
		
		for(int N=0;N<50;N++)
			
		{
			
			System.out.println(N+"--"+F(A,N));
			
		}
		
	}
    public static long F(long  [] A, int n) 
	{
		if (0 == n)
			
		{
			A[n] = 0;
			return A[n];
		}
		
		 else if (1 == n)
			
		{
			
			A[n] = 1;
			
			return A[n];
			
		}
		
		 else
			 
		{
			
			A[n] = A[n-1] + A[n-2];
			
			return A[n];
		}
		
	}
}
	