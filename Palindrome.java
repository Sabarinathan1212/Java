package week1.assigment;

public class Palindrome {
	public static void main(String[] args) {
		int num = 34343, rNum = 0, remainder;
		int givenNum = num;
		while (num !=0)
		{
			remainder=num%10;
			rNum=rNum*10+remainder;
			num/=10;
		
		}
		if(givenNum==rNum) 
		{
			System.out.println(givenNum + " It is Palindrome");
			
		}
		else
		{
			System.out.println(givenNum + " It is not Palindrome");
			
		}
	}

}
