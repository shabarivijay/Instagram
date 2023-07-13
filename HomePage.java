package Instragram;

import java.util.Scanner;

public abstract class HomePage extends PublicAndPrivateAccs
{
	Scanner scn=new Scanner(System.in);
	void homePage() 
	{
		System.out.println("scroll up and down to see the posts and videos wht they r uploaded");
		System.out.println("we can see the profile by going inside the post profile\n-click(click on it)");
		String profile= scn.next();
		if("click".equals(profile)) 
		{
			 PublicAndPrivateAccs();
		}
	
		
	}
	abstract void story();
	abstract void search();
	abstract void reels();
	abstract void myProfile();
	abstract void notifications();
	abstract void messages();
	abstract void newPost();
	
	

}
