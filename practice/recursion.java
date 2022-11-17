class recursion
{
	static int fac(int n) 
	{
		if(n>0)
			return n * fac(n-1);
		else
			return 1;
	}
	public static void main(String [ ] args) 
	{
		int num = 12, result;
		result = fac(num);
		System.out.println("Factorial = "+ result);
	}
}