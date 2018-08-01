import java.util.jar.*;
import java.util.Scanner;
public class CelsiusToFar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float Temp_Cel;float Temp_Farh;
		System.out.println("Enter the Temperature in CELSIUS\n");
        Scanner input= new Scanner(System.in);
        Temp_Cel= input.nextInt();
        Temp_Farh= ((((Temp_Cel)*9)/5)+32);
        System.out.println("The temperature in Farhenheit is \n"+Temp_Farh);
        
	}

}
