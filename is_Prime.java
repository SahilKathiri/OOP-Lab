public class is_Prime
{
    public static void main(String[] args) throws IllegalArgumentException
    {
    	int num = Integer.parseInt(args[0]);
        
        if(num <= 0) {
            throw new IllegalArgumentException("Negative number passed: " + num);
        }

	    boolean isPrime = true;

	for(int i = 2; i < num/2; i++)
	{
	   if(num%i == 0)

	   	isPrime = false;
	}

	System.out.println(num + " is a prime? " + isPrime);
    }
}
