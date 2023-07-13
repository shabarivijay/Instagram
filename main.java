package Instragram;


import java.util.Scanner;
public class main 
{

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		Open open=new Open();
	
		System.out.println("welcome to instagram\nlog-in\n");
		System.out.println("userName-_______\npassword-______ ");
		String userName=scn.next();
		String password=scn.next();
		if(userName.equals(Instagram.username) && password.equals(Instagram.Password)) 
		{
			System.out.println("welcome:"+Instagram.username);
			open.homePage();
			System.out.println("HomePage");
			System.out.println("1-story\n2-search\n3-newpost\n4-reels\n5-myprofile\n6-notification\n7-messages");
			String start=scn.next();
			if("story".equals(start)) 
			{
				open.story();
			}
			else if("search".equals(start)) 
			{
				open.search();
			}
			else if("newpost".equals(start)) 
			{
				open.newPost();
			}
			else if("reels".equals(start)) 
			{
				open.reels();
			}
			else if("myprofile".equals(start)) 
			{
				open.myProfile();
			}
			else if("notification".equals(start)) 
			{
				open.notifications();
			}
			else if("messages".equals(start)) 
			{
				open.messages();
			}
			
		

		
	    }

    }
}
