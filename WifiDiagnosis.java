/*
 Class: CMSC203 CRN 30376
 Program: Assignment # 1
 Instructor: Grinberg
 Summary of Description: Wi-Fi Diagnosis. Test internet connectivity
 Due Date: 02/13/2023 
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
 Name: Shawn Parmhans
*/
import java.util.Scanner;

public class WifiDiagnosis  
{
    //decision method
	public void Decision()
	{
	    Scanner sc = new Scanner(System.in);
        
        //1st question
		System.out.println("Reboot your computer and try to connect");
		System.out.println("Did that fix the problem? (Yes or No): ");
		String answer = sc.nextLine().trim();
		
		// invalid response
		if(!answer.equalsIgnoreCase("Yes") && !answer.equalsIgnoreCase("no"))
		{
		    System.out.println("Invalid response. Try again");
		    System.exit(0);
		}

		if (answer.equalsIgnoreCase("yes"))
		{
		    System.out.println("Done\nProgrammer: Shawn Parmhans");
		    return;
		}
		
		//2nd question
		System.out.println("Reboot the router and try to reconnect");
        System.out.print("Did that fix the problem? (Yes or No): ");
        answer = sc.nextLine().trim();
        if(!answer.equalsIgnoreCase("Yes") && !answer.equalsIgnoreCase("no"))
		{
		    System.out.println("Invalid response. Try again");
		    System.exit(0);
		}

		if (answer.equalsIgnoreCase("yes"))
		{
		    System.out.println("Done\nProgrammer: Shawn Parmhans");
		    return;
		}
		
		//3rd question
		System.out.println("Make sure the cables connecting the router are firmly plugged in and power is getting to the router");
        System.out.print("Did that fix the problem? (Yes or No): ");
        answer = sc.nextLine().trim();
        if(!answer.equalsIgnoreCase("Yes") && !answer.equalsIgnoreCase("no"))
		{
		    System.out.println("Invalid response. Try again");
		    System.exit(0);
		}

		if (answer.equalsIgnoreCase("yes"))
		{
		    System.out.println("Done\nProgrammer: Shawn Parmhans");
		    return;
		}
		
		//4th question
		System.out.println("Move the computer closer to the router and try to connect");
        System.out.print("Did that fix the problem? (Yes or No): ");
        answer = sc.nextLine().trim();
        if(!answer.equalsIgnoreCase("Yes") && !answer.equalsIgnoreCase("no"))
		{
		    System.out.println("Invalid response. Try again");
		    System.exit(0);
		}

		if (answer.equalsIgnoreCase("yes"))
		{
		    System.out.println("Done\nProgrammer: Shawn Parmhans");
		    return;
		}
		
		//5th and final question
		System.out.println("Contact your ISP\nDone\nProgrammer Name: Shawn Parmhans");

	}
	public static void main(String[] args)
	{
	   System.out.println("If you have a problem with internet connectivity this WiFi Diagnosis might work.\n");
        
        //Use the Decision method
        WifiDiagnosis diagnosis = new WifiDiagnosis();
        diagnosis.Decision();
    }
}

