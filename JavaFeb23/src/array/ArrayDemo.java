package array;

public class ArrayDemo {
	// this an one dimentional array

	public static void main(String[] args) {
		String[] s = new String[3];
		
		
		s[0]= "Selenium";
		s[1]= "Eclipse";
		s[2]= "Java";
		System.out.println(	s[1]);
		
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		
          int  [] num = {4,2,7};
          
          for(int i=0;i<num.length;i++)
          {
        	  System.out.println(num[i]);
          }
          System.out.println("example of enhance for loop");
          for (int masud:num)
          {
        	  System.out.println(masud);
          }
	}

}
