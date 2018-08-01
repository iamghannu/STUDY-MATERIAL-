import java.util.*;
import java.util.Scanner;
public class AraayReadWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner input= new Scanner(System.in);
		System.out.println("No of elements of ARRAY \n");
		num= input.nextInt();
		
		int[] ArrayVar = new int[num];
		for(int i=0;i<num;i++)
		{
			int j=i+1;
			System.out.println("Enter the element no:\t"+j);
			ArrayVar[i]= input.nextInt();
		}
		System.out.println("Elements of the Array are\n");
		for (int i=0;i<num;i++)
		{
			
			System.out.println(ArrayVar[i]+"\t");
		}

	}

}
