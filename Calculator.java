package week1.day2;

public class Calculator 
{
	public void add(int num1, int num2)
	{
		System.out.println(num1+num2);
		
	}
	public void sub(float num1,int num2,int num3)
	{
		System.out.println(num1-num2-num3);
		
	}
	
	public static void main(String[] args) {
		Calculator c=new Calculator();
		c.add(79, 88);
		c.sub(8.6f, 89, 598);
		
	}

}



