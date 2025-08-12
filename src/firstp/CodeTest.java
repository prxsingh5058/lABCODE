package firstp;

public class CodeTest {
	public static void main (String[] args) {
		int c3=0; int c4=0;
		for (int i=20; i<40; i++)
		{
			if (i%3==0)
			{
				System.out.println("divisible by 3:"+i);
				c3++;
			}
			else if (i%4==0)
			{
				System.out.println("divisible by 4:"+i);
				c4++;
			}
		}
		System.out.println("/by 3="+c3);
		System.out.println("/by 4="+c4);
	}
}
