public class is_Prime
{
    public static void main(String[] args)
    {
    	int num = Integer.parseInt(args[0]);
	boolean isPrime = true;

	for(int i = 2; i < num/2; i++)
	{
	   if(num%i == 0)

	   	isPrime = false;
	}

	System.out.println(num + " is a prime? " + isPrime);
    }
}
