package week5_day1_TestNG_Sequential_Parallel;

import org.testng.annotations.Test;

public class Account_TestNg_Priority {

    @Test(priority=3)	
 	public void create()
	{
		System.out.println("Created successfully");
	}
    @Test(priority=1)
	public void edit()
	{
		System.out.println("Edited successfully");
	}
    @Test(priority=2)
	public void delete()
	{
		System.out.println("Deleted successfully");
	}
	
	}

