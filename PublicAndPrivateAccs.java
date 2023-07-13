package Instragram;
import java.util.Scanner;

public class PublicAndPrivateAccs implements Instagram

{
	Scanner scn=new Scanner(System.in);
	void PublicAndPrivateAccs()
	{
		System.out.println("1-kiran787\n2-nirmal778\n3-shilpa422\n4-vicky22\n5-sharuk88\n6-keerthi0098\n7-gowrav009\n8-stabvj009\n9-punith06\n10-virmal556");
		String name1= scn.next();
//----------------------------------------------------------------1-------------------------------------------------------------------------------------------------------------------------------------------------------------------
		if("kiran787".equals(name1)) //private account/*1*/
		{
			System.out.println("kiran_gowda                       |settings|\npost-45 followers-889  following-1159(we cant see anything because this acc is private) \n|follow|\nthis account is private ");
			String opt1= scn.next();
			if("follow".equals(opt1)) 
			{
				System.out.println("resquested to follow");
			}
			else if("settings".equals(opt1)) 
			{
				System.out.println("1-report\n2-block\n3-aboutThisAccount(atc)\n4-hideYourStory(hys)\n5-SendMessage(sm)\n6-ShareThisProfile(stp)");
				String opt2= scn.next();
				if("report".equals(opt2)) 
				{
					System.out.println("this profile is reported for some reason");
				}
				else if("block".equals(opt2)) 
				{
					System.out.println("1-block\n2-blockAndReport(bar)");
					String opt3= scn.next();
					if("block".equals(opt3)) 
					{
						System.out.println("the account is blocked");
					}
					else if("bar".equals(opt3))
					{
						System.out.println("the account is blocked and reported");
					}
				}
					else if("atc".equals(opt2)) 
					{
						System.out.println("(date joined-july2017)\n-formerUsername(fun)");
						String opt4= scn.next();
						if("fun".equals(opt4)) 
						{
							System.out.println("this account has changed their username 2 times");
						}
					}
					else if("hys".equals(opt2)) 
					{
						System.out.println("hide story from this account\nhide\ncancel ");
						String opt5= scn.next();
						if("hide".equals(opt5)) 
						{
							System.out.println("this account will no longer see your story");
						}
					}
					else if("sm".equals(opt2)) 
					{
						System.out.println("the message box is open(-audioCall,-videoCall)\n message...voiceMessage,picsVideos,stickers(m)");
						String opt6= scn.next();
						if("audioCall".equals(opt6)) 
						{
							System.out.println("(audioCall)calling......\n\n\n\nringing.....");
						}
						else if("videoCall".equals(opt6)) 
						{
							System.out.println("(videoCall)calling......\n\n\n\nringing.....");
						}
						else if("m".equals(opt6)) 
						{
							String message= scn.next();
							System.out.println("sent\nyes");
							String sent= scn.next();
							if("yes".equals(sent)) 
							{
								System.out.println("message sent successful");
							}
							
						}
					
					else if("stp".equals(opt2)) 
					{
						System.out.println("sharing this profile to some other account");
					}
				}
			}
		}
//-----------------------------------------------------------------2------------------------------------------------------------------------------------------------------------------------------------------------------------------
		if("nirmal778".equals(name1)) //public account/*2*/
		{
			System.out.println("nirmal_kumar                       |settings|\npost-85 followers-189  following-159(we can see anything because this acc is public) \n|follow|    |message| ");
			String opt1= scn.next();
			if("follow".equals(opt1)) 
			{
				System.out.println("following");
			}
			else if("message".equals(opt1)) 
			{
				System.out.println("the message box is open(-audioCall,-videoCall)\n message...audio,picsVideos,stickers(m)");
				String opt6= scn.next();
				if("audioCall".equals(opt6)) 
				{
					System.out.println("(audioCall)calling......\n\n\n\nringing.....");
				}
				else if("videoCall".equals(opt6)) 
				{
					System.out.println("(videoCall)calling......\n\n\n\nringing.....");
				}
				else if("m".equals(opt6)) 
				{
					String message= scn.next();
					System.out.println("sent\nyes");
					String sent= scn.next();
					if("yes".equals(sent)) 
					{
						System.out.println("message sent successful");
					}
					
				}
				
			}
				
			else if("settings".equals(opt1)) 
			{
				System.out.println("1-report\n2-block\n3-aboutThisAccount(atc)\n4-hideYourStory(hys)\n5-ShareThisProfile(stp)");
				String opt2= scn.next();
				if("report".equals(opt2)) 
				{
					System.out.println("this profile is reported for some reason");
				}
				else if("block".equals(opt2)) 
				{
					System.out.println("1-block\n2-blockAndReport(bar)");
					String opt3= scn.next();
					if("block".equals(opt3)) 
					{
						System.out.println("the account is blocked");
					}
					else if("bar".equals(opt3))
					{
						System.out.println("the account is blocked and reported");
					}
				}
					else if("atc".equals(opt2)) 
					{
						System.out.println("(date joined-july2020)\n-formerUsername(fun)");
						String opt4= scn.next();
						if("fun".equals(opt4)) 
						{
							System.out.println("this account has changed their username 4 times");
						}
					}
					else if("hys".equals(opt2)) 
					{
						System.out.println("hide story from this account\nhide\ncancel ");
						String opt5= scn.next();
						if("hide".equals(opt5)) 
						{
							System.out.println("this account will no longer see your story");
						}
					}
					
					
					else if("stp".equals(opt2)) 
					{
						System.out.println("sharing this profile to some other account");
					}
				}
			}
//----------------------------------------------------------------3-------------------------------------------------------------------------------------------------------------------------------------------------------------------
		if("shilpa422".equals(name1)) //private account/*3*/
		{
			System.out.println("shilpa_gowda_                       |settings|\npost-45 followers-280  following-352(we cant see anything because this acc is private) \n|follow|\nthis account is private ");
			String opt1= scn.next();
			if("follow".equals(opt1)) 
			{
				System.out.println("resquested to follow");
			}
			else if("settings".equals(opt1)) 
			{
				System.out.println("1-report\n2-block\n3-aboutThisAccount(atc)\n4-hideYourStory(hys)\n5-SendMessage(sm)\n6-ShareThisProfile(stp)");
				String opt2= scn.next();
				if("report".equals(opt2)) 
				{
					System.out.println("this profile is reported for some reason");
				}
				else if("block".equals(opt2)) 
				{
					System.out.println("1-block\n2-blockAndReport(bar)");
					String opt3= scn.next();
					if("block".equals(opt3)) 
					{
						System.out.println("the account is blocked");
					}
					else if("bar".equals(opt3))
					{
						System.out.println("the account is blocked and reported");
					}
				}
					else if("atc".equals(opt2)) 
					{
						System.out.println("(date joined-july2018)\n-formerUsername(fun)");
						String opt4= scn.next();
						if("fun".equals(opt4)) 
						{
							System.out.println("this account has changed their username 6 times");
						}
					}
					else if("hys".equals(opt2)) 
					{
						System.out.println("hide story from this account\nhide\ncancel ");
						String opt5= scn.next();
						if("hide".equals(opt5)) 
						{
							System.out.println("this account will no longer see your story");
						}
					}
					else if("sm".equals(opt2)) 
					{
						System.out.println("the message box is open(-audioCall,-videoCall)\n message...voiceMessage,picsVideos,stickers(m)");
						String opt6= scn.next();
						if("audioCall".equals(opt6)) 
						{
							System.out.println("(audioCall)calling......\n\n\n\nringing.....");
						}
						else if("videoCall".equals(opt6)) 
						{
							System.out.println("(videoCall)calling......\n\n\n\nringing.....");
						}
						else if("m".equals(opt6)) 
						{
							String message= scn.next();
							System.out.println("sent\nyes");
							String sent= scn.next();
							if("yes".equals(sent)) 
							{
								System.out.println("message sent successful");
							}
							
						}
					
					else if("stp".equals(opt2)) 
					{
						System.out.println("sharing this profile to some other account");
					}
				}
			}
		}
//-----------------------------------------------------------------4------------------------------------------------------------------------------------------------------------------------------------------------------------------
		if("vicky22".equals(name1)) //public account/*4*/
		{
			System.out.println("vignesh_kumar                       |settings|\npost-15 followers-487  following-959(we can see anything because this acc is public) \n|follow|    |message| ");
			String opt1= scn.next();
			if("follow".equals(opt1)) 
			{
				System.out.println("following");
			}
			else if("message".equals(opt1)) 
			{
				System.out.println("the message box is open(-audioCall,-videoCall)\n message...audio,picsVideos,stickers(m)");
				String opt6= scn.next();
				if("audioCall".equals(opt6)) 
				{
					System.out.println("(audioCall)calling......\n\n\n\nringing.....");
				}
				else if("videoCall".equals(opt6)) 
				{
					System.out.println("(videoCall)calling......\n\n\n\nringing.....");
				}
				else if("m".equals(opt6)) 
				{
					String message= scn.next();
					System.out.println("sent\nyes");
					String sent= scn.next();
					if("yes".equals(sent)) 
					{
						System.out.println("message sent successful");
					}
					
				}
				
			}
				
			else if("settings".equals(opt1)) 
			{
				System.out.println("1-report\n2-block\n3-aboutThisAccount(atc)\n4-hideYourStory(hys)\n5-ShareThisProfile(stp)");
				String opt2= scn.next();
				if("report".equals(opt2)) 
				{
					System.out.println("this profile is reported for some reason");
				}
				else if("block".equals(opt2)) 
				{
					System.out.println("1-block\n2-blockAndReport(bar)");
					String opt3= scn.next();
					if("block".equals(opt3)) 
					{
						System.out.println("the account is blocked");
					}
					else if("bar".equals(opt3))
					{
						System.out.println("the account is blocked and reported");
					}
				}
					else if("atc".equals(opt2)) 
					{
						System.out.println("(date joined-july2014)\n-formerUsername(fun)");
						String opt4= scn.next();
						if("fun".equals(opt4)) 
						{
							System.out.println("this account has changed their username 1 times");
						}
					}
					else if("hys".equals(opt2)) 
					{
						System.out.println("hide story from this account\nhide\ncancel ");
						String opt5= scn.next();
						if("hide".equals(opt5)) 
						{
							System.out.println("this account will no longer see your story");
						}
					}
					
					
					else if("stp".equals(opt2)) 
					{
						System.out.println("sharing this profile to some other account");
					}
				}
			}
//-----------------------------------------------------------------5------------------------------------------------------------------------------------------------------------------------------------------------------------------
		if("sharuk88".equals(name1)) //private account/*5*/
		{
			System.out.println("sharukjan_j                       |settings|\npost-145 followers-380  following-355(we cant see anything because this acc is private) \n|follow|\nthis account is private ");
			String opt1= scn.next();
			if("follow".equals(opt1)) 
			{
				System.out.println("resquested to follow");
			}
			else if("settings".equals(opt1)) 
			{
				System.out.println("1-report\n2-block\n3-aboutThisAccount(atc)\n4-hideYourStory(hys)\n5-SendMessage(sm)\n6-ShareThisProfile(stp)");
				String opt2= scn.next();
				if("report".equals(opt2)) 
				{
					System.out.println("this profile is reported for some reason");
				}
				else if("block".equals(opt2)) 
				{
					System.out.println("1-block\n2-blockAndReport(bar)");
					String opt3= scn.next();
					if("block".equals(opt3)) 
					{
						System.out.println("the account is blocked");
					}
					else if("bar".equals(opt3))
					{
						System.out.println("the account is blocked and reported");
					}
				}
					else if("atc".equals(opt2)) 
					{
						System.out.println("(date joined-july2008)\n-formerUsername(fun)");
						String opt4= scn.next();
						if("fun".equals(opt4)) 
						{
							System.out.println("this account has changed their username 17 times");
						}
					}
					else if("hys".equals(opt2)) 
					{
						System.out.println("hide story from this account\nhide\ncancel ");
						String opt5= scn.next();
						if("hide".equals(opt5)) 
						{
							System.out.println("this account will no longer see your story");
						}
					}
					else if("sm".equals(opt2)) 
					{
						System.out.println("the message box is open(-audioCall,-videoCall)\n message...voiceMessage,picsVideos,stickers(m)");
						String opt6= scn.next();
						if("audioCall".equals(opt6)) 
						{
							System.out.println("(audioCall)calling......\n\n\n\nringing.....");
						}
						else if("videoCall".equals(opt6)) 
						{
							System.out.println("(videoCall)calling......\n\n\n\nringing.....");
						}
						else if("m".equals(opt6)) 
						{
							String message= scn.next();
							System.out.println("sent\nyes");
							String sent= scn.next();
							if("yes".equals(sent)) 
							{
								System.out.println("message sent successful");
							}
							
						}
					
					else if("stp".equals(opt2)) 
					{
						System.out.println("sharing this profile to some other account");
					}
				}
			}
		}
//-----------------------------------------------------------------6------------------------------------------------------------------------------------------------------------------------------------------------------------------
		if("keerthi0098".equals(name1)) //public account/*6*/
		{
			System.out.println("keerthi_shankar                       |settings|\npost-8 followers-2287  following-659(we can see anything because this acc is public) \n|follow|    |message| ");
			String opt1= scn.next();
			if("follow".equals(opt1)) 
			{
				System.out.println("following");
			}
			else if("message".equals(opt1)) 
			{
				System.out.println("the message box is open(-audioCall,-videoCall)\n message...audio,picsVideos,stickers(m)");
				String opt6= scn.next();
				if("audioCall".equals(opt6)) 
				{
					System.out.println("(audioCall)calling......\n\n\n\nringing.....");
				}
				else if("videoCall".equals(opt6)) 
				{
					System.out.println("(videoCall)calling......\n\n\n\nringing.....");
				}
				else if("m".equals(opt6)) 
				{
					String message= scn.next();
					System.out.println("sent\nyes");
					String sent= scn.next();
					if("yes".equals(sent)) 
					{
						System.out.println("message sent successful");
					}
					
				}
				
			}
				
			else if("settings".equals(opt1)) 
			{
				System.out.println("1-report\n2-block\n3-aboutThisAccount(atc)\n4-hideYourStory(hys)\n5-ShareThisProfile(stp)");
				String opt2= scn.next();
				if("report".equals(opt2)) 
				{
					System.out.println("this profile is reported for some reason");
				}
				else if("block".equals(opt2)) 
				{
					System.out.println("1-block\n2-blockAndReport(bar)");
					String opt3= scn.next();
					if("block".equals(opt3)) 
					{
						System.out.println("the account is blocked");
					}
				
					else if("bar".equals(opt3))
					{
						System.out.println("the account is blocked and reported");
					}
				}
					else if("atc".equals(opt2)) 
					{
						System.out.println("(date joined-july2015)\n-formerUsername(fun)");
						String opt4= scn.next();
						if("fun".equals(opt4)) 
						{
							System.out.println("this account has changed their username 5 times");
						}
					}
					else if("hys".equals(opt2)) 
					{
						System.out.println("hide story from this account\nhide\ncancel ");
						String opt5= scn.next();
						if("hide".equals(opt5)) 
						{
							System.out.println("this account will no longer see your story");
						}
					}
					
					
					else if("stp".equals(opt2)) 
					{
						System.out.println("sharing this profile to some other account");
					}
				}
	}
//-----------------------------------------------------------------7------------------------------------------------------------------------------------------------------------------------------------------------------------------
		if("gowrav009".equals(name1)) //private account/*7*/
		{
			System.out.println("sharukjan_j                       |settings|\npost-745 followers-380  following-355(we cant see anything because this acc is private) \n|follow|\nthis account is private ");
			String opt1= scn.next();
			if("follow".equals(opt1)) 
			{
				System.out.println("resquested to follow");
			}
			else if("settings".equals(opt1)) 
			{
				System.out.println("1-report\n2-block\n3-aboutThisAccount(atc)\n4-hideYourStory(hys)\n5-SendMessage(sm)\n6-ShareThisProfile(stp)");
				String opt2= scn.next();
				if("report".equals(opt2)) 
				{
					System.out.println("this profile is reported for some reason");
				}
				else if("block".equals(opt2)) 
				{
					System.out.println("1-block\n2-blockAndReport(bar)");
					String opt3= scn.next();
					if("block".equals(opt3)) 
					{
						System.out.println("the account is blocked");
					}
					else if("bar".equals(opt3))
					{
						System.out.println("the account is blocked and reported");
					}
				}
					else if("atc".equals(opt2)) 
					{
						System.out.println("(date joined-july2009)\n-formerUsername(fun)");
						String opt4= scn.next();
						if("fun".equals(opt4)) 
						{
							System.out.println("this account has changed their username 27 times");
						}
					}
					else if("hys".equals(opt2)) 
					{
						System.out.println("hide story from this account\nhide\ncancel ");
						String opt5= scn.next();
						if("hide".equals(opt5)) 
						{
							System.out.println("this account will no longer see your story");
						}
					}
					else if("sm".equals(opt2)) 
					{
						System.out.println("the message box is open(-audioCall,-videoCall)\n message...voiceMessage,picsVideos,stickers(m)");
						String opt6= scn.next();
						if("audioCall".equals(opt6)) 
						{
							System.out.println("(audioCall)calling......\n\n\n\nringing.....");
						}
						else if("videoCall".equals(opt6)) 
						{
							System.out.println("(videoCall)calling......\n\n\n\nringing.....");
						}
						else if("m".equals(opt6)) 
						{
							String message= scn.next();
							System.out.println("sent\nyes");
							String sent= scn.next();
							if("yes".equals(sent)) 
							{
								System.out.println("message sent successful");
							}
							
						}
					}
					else if("stp".equals(opt2)) 
					{
						System.out.println("sharing this profile to some other account");
					}
				}
			}
		
		
//-----------------------------------------------------------------8------------------------------------------------------------------------------------------------------------------------------------------------------------------
		if("stabvj009".equals(name1)) //public account/*8*/
		{
			System.out.println("shabari_vj                     |settings|\npost-99 followers-42287  following-159(we can see anything because this acc is public) \n|follow|    |message| ");
			String opt1= scn.next();
			if("follow".equals(opt1)) 
			{
				System.out.println("following");
			}
			else if("message".equals(opt1)) 
			{
				System.out.println("the message box is open(-audioCall,-videoCall)\n message...audio,picsVideos,stickers(m)");
				String opt6= scn.next();
				if("audioCall".equals(opt6)) 
				{
					System.out.println("(audioCall)calling......\n\n\n\nringing.....");
				}
				else if("videoCall".equals(opt6)) 
				{
					System.out.println("(videoCall)calling......\n\n\n\nringing.....");
				}
				else if("m".equals(opt6)) 
				{
					String message= scn.next();
					System.out.println("sent\nyes");
					String sent= scn.next();
					if("yes".equals(sent)) 
					{
						System.out.println("message sent successful");
					}
					
				}
				
			}
				
			else if("settings".equals(opt1)) 
			{
				System.out.println("1-report\n2-block\n3-aboutThisAccount(atc)\n4-hideYourStory(hys)\n5-ShareThisProfile(stp)");
				String opt2= scn.next();
				if("report".equals(opt2)) 
				{
					System.out.println("this profile is reported for some reason");
				}
				else if("block".equals(opt2)) 
				{
					System.out.println("1-block\n2-blockAndReport(bar)");
					String opt3= scn.next();
					if("block".equals(opt3)) 
					{
						System.out.println("the account is blocked");
					}
					else if("bar".equals(opt3))
					{
						System.out.println("the account is blocked and reported");
					}
				}
					else if("atc".equals(opt2)) 
					{
						System.out.println("(date joined-july2017)\n-formerUsername(fun)");
						String opt4= scn.next();
						if("fun".equals(opt4)) 
						{
							System.out.println("this account has changed their username 19 times");
						}
					}
					else if("hys".equals(opt2)) 
					{
						System.out.println("hide story from this account\nhide\ncancel ");
						String opt5= scn.next();
						if("hide".equals(opt5)) 
						{
							System.out.println("this account will no longer see your story");
						}
					}
					
					
					else if("stp".equals(opt2)) 
					{
						System.out.println("sharing this profile to some other account");
					}
				}
		}
		
//-----------------------------------------------------------------9------------------------------------------------------------------------------------------------------------------------------------------------------------------
		if("punith06".equals(name1)) //private account/*9*/
		{
			System.out.println("punith_jain                       |settings|\npost-1745 followers-880  following-355(we cant see anything because this acc is private) \n|follow|\nthis account is private ");
			String opt1= scn.next();
			if("follow".equals(opt1)) 
			{
				System.out.println("resquested to follow");
			}
			else if("settings".equals(opt1)) 
			{
				System.out.println("1-report\n2-block\n3-aboutThisAccount(atc)\n4-hideYourStory(hys)\n5-SendMessage(sm)\n6-ShareThisProfile(stp)");
				String opt2= scn.next();
				if("report".equals(opt2)) 
				{
					System.out.println("this profile is reported for some reason");
				}
				else if("block".equals(opt2)) 
				{
					System.out.println("1-block\n2-blockAndReport(bar)");
					String opt3= scn.next();
					if("block".equals(opt3)) 
					{
						System.out.println("the account is blocked");
					}
					else if("bar".equals(opt3))
					{
						System.out.println("the account is blocked and reported");
					}
				}
					else if("atc".equals(opt2)) 
					{
						System.out.println("(date joined-july2009)\n-formerUsername(fun)");
						String opt4= scn.next();
						if("fun".equals(opt4)) 
						{
							System.out.println("this account has changed their username 14 times");
						}
					}
					else if("hys".equals(opt2)) 
					{
						System.out.println("hide story from this account\nhide\ncancel ");
						String opt5= scn.next();
						if("hide".equals(opt5)) 
						{
							System.out.println("this account will no longer see your story");
						}
					}
					else if("sm".equals(opt2)) 
					{
						System.out.println("the message box is open(-audioCall,-videoCall)\n message...voiceMessage,picsVideos,stickers(m)");
						String opt6= scn.next();
						if("audioCall".equals(opt6)) 
						{
							System.out.println("(audioCall)calling......\n\n\n\nringing.....");
						}
						else if("videoCall".equals(opt6)) 
						{
							System.out.println("(videoCall)calling......\n\n\n\nringing.....");
						}
						else if("m".equals(opt6)) 
						{
							String message= scn.next();
							System.out.println("sent\nyes");
							String sent= scn.next();
							if("yes".equals(sent)) 
							{
								System.out.println("message sent successful");
							}
							
						}
					}
					else if("stp".equals(opt2)) 
					{
						System.out.println("sharing this profile to some other account");
					}
				}
			}
		
		
		
//-----------------------------------------------------------------10------------------------------------------------------------------------------------------------------------------------------------------------------------------
		if("virmal556".equals(name1)) //public account/*10*/
		{
			System.out.println("virmal_sharma                     |settings|\npost-199 followers-267  following-859(we can see anything because this acc is public) \n|follow|    |message| ");
			String opt1= scn.next();
			if("follow".equals(opt1)) 
			{
				System.out.println("following");
			}
			else if("message".equals(opt1)) 
			{
				System.out.println("the message box is open(-audioCall,-videoCall)\n message...audio,picsVideos,stickers(m)");
				String opt6= scn.next();
				if("audioCall".equals(opt6)) 
				{
					System.out.println("(audioCall)calling......\n\n\n\nringing.....");
				}
				else if("videoCall".equals(opt6)) 
				{
					System.out.println("(videoCall)calling......\n\n\n\nringing.....");
				}
				else if("m".equals(opt6)) 
				{
					String message= scn.next();
					System.out.println("sent\nyes");
					String sent= scn.next();
					if("yes".equals(sent)) 
					{
						System.out.println("message sent successful");
					}
					
				}
				
			}
				
			else if("settings".equals(opt1)) 
			{
				System.out.println("1-report\n2-block\n3-aboutThisAccount(atc)\n4-hideYourStory(hys)\n5-ShareThisProfile(stp)");
				String opt2= scn.next();
				if("report".equals(opt2)) 
				{
					System.out.println("this profile is reported for some reason");
				}
				else if("block".equals(opt2)) 
				{
					System.out.println("1-block\n2-blockAndReport(bar)");
					String opt3= scn.next();
					if("block".equals(opt3)) 
					{
						System.out.println("the account is blocked");
					}
					else if("bar".equals(opt3))
					{
						System.out.println("the account is blocked and reported");
					}
				}
					else if("atc".equals(opt2)) 
					{
						System.out.println("(date joined-july2011)\n-formerUsername(fun)");
						String opt4= scn.next();
						if("fun".equals(opt4)) 
						{
							System.out.println("this account has changed their username 3 times");
						}
					}
					else if("hys".equals(opt2)) 
					{
						System.out.println("hide story from this account\nhide\ncancel ");
						String opt5= scn.next();
						if("hide".equals(opt5)) 
						{
							System.out.println("this account will no longer see your story");
						}
					}
					
					
					else if("stp".equals(opt2)) 
					{
						System.out.println("sharing this profile to some other account");
					}
		}
			}
		
		
		
		
		
		}
		
		
	}
	
   


