package pattern;

public class Demo5 {

	public static void main(String[] args) {
		
		
		for(int i=1;i<=10;i++)
		{
			for(int j=10;j>=i;j--)
			{
				System.out.print(" ");
			}
			//System.out.print("%");
			for(int k=0;k<i;k++)
			{
				System.out.print(" *");
			
			}
			
			System.out.println();
		}

		
	}

}
