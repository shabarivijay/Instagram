package Instragram;

import java.util.Scanner;

public class Open  extends HomePage
{

	Scanner scn=new Scanner(System.in);
	void story()//okay
	{
		System.out.println("1-yourStory(ys)\n2-seeTheOthersStory(stos)");
		
		String story = scn.next();
		if("ys".equals(story)) 
		{
			System.out.println("opens the -phoneCamera and -gallery ");
			String story1 = scn.next();
			if("phoneCamera".equals(story1)) 
			{
				System.out.println("click the picture,add some filters edit it and add to ur story....");
			}
			else if("gallery".equals(story1)) 
			{
				System.out.println("select the picture,add some filters edit it and add to ur story....");
			}
			
		}
		else if("stos".equals(story)) 
		{
			System.out.println("swipe right or left to see many stories<--or-->\nwhere profile pic is seen\nif we click on the particular profile story gets opens and \nu can like ,message and share it to ur frnds");
			PublicAndPrivateAccs();
		} 
		
	}

	
	void search() //okay
	{
		 System.out.println("1-searchBar\n2-contents(down)");
		 String search=scn.next();
		 if("searchBar".equals(search)) 
		 {
			 System.out.println("search bar is opened(we can search for accounts ,things ,foods,flowers,birds,animals...more)");
			 System.out.println("1-donut\n2-flowers\n3-nikitha\n4-shilpaShree\n5-sweets\n.............stillMore.......");
			 String search2=scn.next();
			 if("donut".equals(search2)) 
			 {
				 System.out.println("1-forYou\n2-account\n3-audio\n4-tags\n5-places");
				 String search3=scn.next();
				 if("forYou".equals(search3)) 
				 {
					 System.out.println("everything about donut is shown (post,reels,videos...)");
				 }
				 else if("account".equals(search3)) 
				 {
					 System.out.println("everything donut linked accounts is shown (only profiles name and profiles pic)");
				 }
				 else if("audio".equals(search3)) 
				 {
					 System.out.println("everything donut linked audio is shown (only songs )");
				 }
				 else if("tags".equals(search3)) 
				 {
					 System.out.println("everything donut linked hashtags(#) is shown (only hashtags)");
				 }
				 else if("places".equals(search3)) 
				 {
					 System.out.println("everything donut linked locations is shown (only locations ..places)");
				 }
				 
			 }
			 else if("flowers".equals(search2)) 
			 {
				 System.out.println("1-forYou\n2-account\n3-audio\n4-tags\n5-places");
				 String search3=scn.next();
				 if("forYou".equals(search3)) 
				 {
					 System.out.println("everything about flowers is shown (post,reels,videos...)");
				 }
				 else if("account".equals(search3)) 
				 {
					 System.out.println("everything flowers linked accounts is shown (only profiles name and profiles pic)");
				 }
				 else if("audio".equals(search3)) 
				 {
					 System.out.println("everything flowers linked audio is shown (only songs )");
				 }
				 else if("tags".equals(search3)) 
				 {
					 System.out.println("everything flowers linked hashtags(#) is shown (only hashtags)");
				 }
				 else if("places".equals(search3)) 
				 {
					 System.out.println("everything flowers linked locations is shown (only locations ..places)");
				 }
				 
			 }
			 else if("nikitha".equals(search2)) 
			 {
				 System.out.println("1-forYou\n2-account\n3-audio\n4-tags\n5-places");
				 String search3=scn.next();
				 if("forYou".equals(search3)) 
				 {
					 System.out.println("everything about nikitha and some accounts is shown (post,reels,videos...)");
				 }
				 else if("account".equals(search3)) 
				 {
					 System.out.println("everything nikitha linked accounts is shown (only profiles name and profiles pic)");
				 }
				 else if("audio".equals(search3)) 
				 {
					 System.out.println("everything nikitha linked audio is shown (only songs )");
				 }
				 else if("tags".equals(search3)) 
				 {
					 System.out.println("everything nikitha linked hashtags(#) is shown (only hashtags)");
				 }
				 else if("places".equals(search3)) 
				 {
					 System.out.println("everything nikitha shops linked locations is shown (only locations ..places)");
				 }
				 
			 }
			 else if("shilpaShree".equals(search2)) 
			 {
				 System.out.println("1-forYou\n2-account\n3-audio\n4-tags\n5-places");
				 String search3=scn.next();
				 if("forYou".equals(search3)) 
				 {
					 System.out.println("everything about shilpaShree and some accounts is shown (post,reels,videos...)");
				 }
				 else if("account".equals(search3)) 
				 {
					 System.out.println("everything shilpaShree linked accounts is shown (only profiles name and profiles pic)");
				 }
				 else if("audio".equals(search3)) 
				 {
					 System.out.println("everything shilpaShree linked audio is shown (only songs )");
				 }
				 else if("tags".equals(search3)) 
				 {
					 System.out.println("everything shilpaShree linked hashtags(#) is shown (only hashtags)");
				 }
				 else if("places".equals(search3)) 
				 {
					 System.out.println("everything shilpaShree shops linked locations is shown (only locations ..places)");
				 }
				 
			 }
			 else if("sweets".equals(search2)) 
			 {
				 System.out.println("1-forYou\n2-account\n3-audio\n4-tags\n5-places");
				 String search3=scn.next();
				 if("forYou".equals(search3)) 
				 {
					 System.out.println("everything about sweets is shown (post,reels,videos...)");
				 }
				 else if("account".equals(search3)) 
				 {
					 System.out.println("everything sweets linked accounts is shown (only profiles name and profiles pic)");
				 }
				 else if("audio".equals(search3)) 
				 {
					 System.out.println("everything sweets linked audio is shown (only songs )");
				 }
				 else if("tags".equals(search3)) 
				 {
					 System.out.println("everything sweets linked hashtags(#) is shown (only hashtags)");
				 }
				 else if("places".equals(search3)) 
				 {
					 System.out.println("everything sweets linked locations is shown (only locations ..places)");
				 }
				 
			 }
			 
		 }
		 else if("contents".equals(search)) 
		 {
			System.out.println("see all the contents which has many posts,reels and random videos"); 
		 }
		
		
	}

	
	void reels()//oky
	{
		System.out.println("swipe up and down to see the random reel videos and \nif u wanna(like,comment,share) and can open there account ");
		
		
		
	}

	
	void myProfile()//oky
	{
		System.out.println("Shabari Vijay(profile photo)(with bio)      |posts-102|     |(f)followers-144|    |(fo)following-166|    \n|(ep)editProfile|           |(sp)shareProfile|   \n(hi)highlights\n (post)post         (rl)reels       (tg)tags     ");
		String open=scn.next();
		if("f".equals(open)) 
		{
			System.out.println("(which shows how many of thm r following my account)\nshilpa(remove)\nraghu(remove)\nkowslaya(remove)\nsharath(remove)\nhemanth(remove)\nrahul(remove)\nbharath(remove)\nkavan(remove)\nrishi(remove)\nlekha(remove)\nteju(remove)\nshena(remove)\n....\n..\n..\n..\n..\n....\n...\n...\n...\n...");
			
			
		}
		else if("fo".equals(open)) 
		{
			System.out.println("(which shows how many of thm r following my account)\nshilpa(following)\nraghu(following)\nkowslaya(following)\nsharath(following)\nhemanth(following)\nrahul(following)\nbharath(following)\nkavan(following)\nrishi(following)\nlekha(following)\nteju(following)\nshena(following)\n....\n..\n..\n..\n..\n....\n...\n...\n...\n...");
		}
		else if("ep".equals(open)) 
		{
			System.out.println("name-Shabari Vijay\n (un)username-theshabari_is_here \n(b)bio-if ur bad i am ur dad \n (g)gender-male");
			System.out.println("u can change the username\nbio\ngender");
			String change=scn.next();
			if("un".equals(change)) 
			{
				String change1=scn.next();
				System.out.println("u have changed the username to -"+change1);
			}
			else if("b".equals(change)) 
			{
				String change2=scn.next();
				System.out.println("u have changed the bio to -"+change2);
			}
			else if("g".equals(change)) 
			{
				System.out.println("1-male\n2-female\n3-custom\n4-prefer not to say");
				String change3=scn.next();
				System.out.println("u have changed the gender to -"+change3);
			}
		
		}
		else if("sp".equals(open)) 
		{
			System.out.println("share profile qr code to some account ");
		}
		else if("hi".equals(open)) 
		{
			System.out.println("we can see our old story which we saved it in profile as highlights");
		}
		else if("post".equals(open)) 
		{
			System.out.println("we can see the posts(102)wht all we have uploaded");
		}
		else if("rl".equals(open)) 
		{
			System.out.println("we can see the reelswht all we have uploaded");
		}
		else if("tg".equals(open)) 
		{
			System.out.println("we can see the tagged post wht followers tagged to me");
		}
	}

	
	void notifications() //oky
	{
		System.out.println("chethan(o1) has sent u a friend resquest(follow)\nTHIS WEEK\nneha.g,madhuravenkatesh,moni liked ur story(o2)\nyeswanth has sent u a friend resquest(follow)(o3)\nTHIS MONTH\nchaitra liked ur story(o4)\nmadhuravenkatesh,chiraga7 and 222 others liked ur post(o5)\ndeepak commented :awesome bro(o6)\np_m_kutti started following you(o7)..\n..\n..\n..\n..\n..\n...\n..");
		String opening=scn.next();
		if("o1".equals(opening)) 
		{
			System.out.println("opening the profile ...if u wanna -(follow) if not -(cancel) the resquest");
			String follow=scn.next();
			if("follow".equals(follow)) 
			{
				System.out.println("u started following chethan");
			}
			else 
			{
				System.out.println("cancelled the resquest");
			}
		}
		else if("o2".equals(opening)) 
		{
			System.out.println("opening the story to see how many of thm liked and how many of thm viewed");
		}
		else if("o3".equals(opening)) 
		{
			System.out.println("opening the profile ...if u wanna -(follow) if not -(cancel) the resquest");
			String follow=scn.next();
			if("follow".equals(follow)) 
			{
				System.out.println("u started following yeswanth");
			}
			else 
			{
				System.out.println("cancelled the resquest");
			}
		}
		else if("o4".equals(opening)) 
		{
			System.out.println("opening the story to see how many of thm liked and how many of thm viewed");
		}
		else if("o5".equals(opening)) 
		{
			System.out.println("opening the post to see how many of thm liked the post");
		}
		else if("o6".equals(opening)) 
		{
			System.out.println("opening to see wht deepak has commented to my post");
		}
		else if("o7".equals(opening)) 
		{
			System.out.println("so i can see the p_m_kutti post and story");
		}
			
	}

	
	void messages()//oky
	{
		System.out.println("search\nyourNote(yn)\nmessages\nresquestsMessages(rm)");
		String opt=scn.next();
		if("search".equals(opt)) 
		{
			System.out.println("prashanth\nneha\nmadhura\nvignesh\nmanish\nmonitha");
			String opt1=scn.next();
			if("prashanth".equals(opt1)) 
			{
				System.out.println("1-(m)message(test,audioMessage,gallery(pics),stickers)\n2-(av)audio video(call)\n3-(p)go to thr profile");
				String opt2=scn.next();
				if("m".equals(opt2)) 
				{
					String message=scn.next();
					System.out.println("sent successfully");
				}
				else if("av".equals(opt2))
				{
					System.out.println("ringing.......");
				}
				else if("p".equals(opt2))
				{
					System.out.println("opening thr profile ........");
				}
			}
			else if("neha".equals(opt1)) 
			{
				System.out.println("1-(m)message(test,audioMessage,gallery(pics),stickers)\n2-(av)audio video(call)\n3-(p)go to thr profile");
				String opt2=scn.next();
				if("m".equals(opt2)) 
				{
					String message=scn.next();
					System.out.println("sent successfully");
				}
				else if("av".equals(opt2))
				{
					System.out.println("ringing.......");
				}
				else if("p".equals(opt2))
				{
					System.out.println("opening thr profile ........");
				}
			}
			else if("madhura".equals(opt1)) 
			{
				System.out.println("1-(m)message(test,audioMessage,gallery(pics),stickers)\n2-(av)audio video(call)\n3-(p)go to thr profile");
				String opt2=scn.next();
				if("m".equals(opt2)) 
				{
					String message=scn.next();
					System.out.println("sent successfully");
				}
				else if("av".equals(opt2))
				{
					System.out.println("ringing.......");
				}
				else if("p".equals(opt2))
				{
					System.out.println("opening thr profile ........");
				}
			}
			
			
			else if("vignesh".equals(opt1)) 
			{
				System.out.println("1-(m)message(test,audioMessage,gallery(pics),stickers)\n2-(av)audio video(call)\n3-(p)go to thr profile");
				String opt2=scn.next();
				if("m".equals(opt2)) 
				{
					String message=scn.next();
					System.out.println("sent successfully");
				}
				else if("av".equals(opt2))
				{
					System.out.println("ringing.......");
				}
				else if("p".equals(opt2))
				{
					System.out.println("opening thr profile ........");
				}
			}
			
			else if("manish".equals(opt1)) 
			{
				System.out.println("1-(m)message(test,audioMessage,gallery(pics),stickers)\n2-(av)audio video(call)\n3-(p)go to thr profile");
				String opt2=scn.next();
				if("m".equals(opt2)) 
				{
					String message=scn.next();
					System.out.println("sent successfully");
				}
				else if("av".equals(opt2))
				{
					System.out.println("ringing.......");
				}
				else if("p".equals(opt2))
				{
					System.out.println("opening thr profile ........");
				}
			}
			
			
			else if("monitha".equals(opt1)) 
			{
				System.out.println("1-(m)message(test,audioMessage,gallery(pics),stickers)\n2-(av)audio video(call)\n3-(p)go to thr profile");
				String opt2=scn.next();
				if("m".equals(opt2)) 
				{
					String message=scn.next();
					System.out.println("sent successfully");
				}
				else if("av".equals(opt2))
				{
					System.out.println("ringing.......");
				}
				else if("p".equals(opt2))
				{
					System.out.println("opening thr profile ........");
				}
			}
			
		}
		else if("yn".equals(opt)) 
		{
			System.out.println("1-(note)addTheNote and addMusic \n2-(snote)seeingOthersNote ");
			String watch=scn.next();
			if("note".equals(watch)) 
			{
				System.out.println("(sat)share a thought... \n (m)music");
				String thought=scn.next();
				switch(thought)
			     {
			     case  "sat":
			    	 System.out.println("write");
			    	 String write=scn.next();
			     case  "m":
			    	 System.out.println("music\nyes\nno");
			    	 String music=scn.next();
			    	 if("yes".equals(music)) 
			    	 {
			    		 System.out.println("1-vibes\n2-(jta)jd the alcoholic\n3-(nn)naan naan\n4-(dl)dont look ...\n..\n..\n..\n...\n...\n..\n...");
			    		 String music1=scn.next();
				    	 if("vibes".equals(music1)) 
				    	 {
				    		 System.out.println(music1+" music added");
				    	 }
				    	 else if("jta".equals(music1)) 
				    	 {
				    		 System.out.println(music1+" music added");
				    	 }
				    	 else if("nn".equals(music1)) 
				    	 {
				    		 System.out.println(music1+" music added");
				    	 }
				    	 else if("dl".equals(music1)) 
				    	 {
				    		 System.out.println(music1+" music added");
				    	 }
			    	 }else 
			    	 {
			    		 System.out.println("not interested in music");
			    	 }
			     }
				  System.out.println("ur note has been added");
				
				
				
			}
			else if("snote".equals(watch)) 
			{
				System.out.println("swipe left to see their other accounts notes<---->");
			}
		}
		
		else if("messages".equals(opt)) 
		{
			System.out.println("prashanth\nneha\nmadhura\nvignesh\nmanish\nmonitha");
			String opt1=scn.next();
			if("prashanth".equals(opt1)) 
			{
				System.out.println("1-(m)message(test,audioMessage,gallery(pics),stickers)\n2-(av)audio video(call)\n3-(p)go to thr profile");
				String opt2=scn.next();
				if("m".equals(opt2)) 
				{
					String message=scn.next();
					System.out.println("sent successfully");
				}
				else if("av".equals(opt2))
				{
					System.out.println("ringing.......");
				}
				else if("p".equals(opt2))
				{
					System.out.println("opening thr profile ........");
				}
			}
			else if("neha".equals(opt1)) 
			{
				System.out.println("1-(m)message(test,audioMessage,gallery(pics),stickers)\n2-(av)audio video(call)\n3-(p)go to thr profile");
				String opt2=scn.next();
				if("m".equals(opt2)) 
				{
					String message=scn.next();
					System.out.println("sent successfully");
				}
				else if("av".equals(opt2))
				{
					System.out.println("ringing.......");
				}
				else if("p".equals(opt2))
				{
					System.out.println("opening thr profile ........");
				}
			}
			else if("madhura".equals(opt1)) 
			{
				System.out.println("1-(m)message(test,audioMessage,gallery(pics),stickers)\n2-(av)audio video(call)\n3-(p)go to thr profile");
				String opt2=scn.next();
				if("m".equals(opt2)) 
				{
					String message=scn.next();
					System.out.println("sent successfully");
				}
				else if("av".equals(opt2))
				{
					System.out.println("ringing.......");
				}
				else if("p".equals(opt2))
				{
					System.out.println("opening thr profile ........");
				}
			}
			
			
			else if("vignesh".equals(opt1)) 
			{
				System.out.println("1-(m)message(test,audioMessage,gallery(pics),stickers)\n2-(av)audio video(call)\n3-(p)go to thr profile");
				String opt2=scn.next();
				if("m".equals(opt2)) 
				{
					String message=scn.next();
					System.out.println("sent successfully");
				}
				else if("av".equals(opt2))
				{
					System.out.println("ringing.......");
				}
				else if("p".equals(opt2))
				{
					System.out.println("opening thr profile ........");
				}
			}
			
			else if("manish".equals(opt1)) 
			{
				System.out.println("1-(m)message(test,audioMessage,gallery(pics),stickers)\n2-(av)audio video(call)\n3-(p)go to thr profile");
				String opt2=scn.next();
				if("m".equals(opt2)) 
				{
					String message=scn.next();
					System.out.println("sent successfully");
				}
				else if("av".equals(opt2))
				{
					System.out.println("ringing.......");
				}
				else if("p".equals(opt2))
				{
					System.out.println("opening thr profile ........");
				}
			}
			
			
			else if("monitha".equals(opt1)) 
			{
				System.out.println("1-(m)message(test,audioMessage,gallery(pics),stickers)\n2-(av)audio video(call)\n3-(p)go to thr profile");
				String opt2=scn.next();
				if("m".equals(opt2)) 
				{
					String message=scn.next();
					System.out.println("sent successfully");
				}
				else if("av".equals(opt2))
				{
					System.out.println("ringing.......");
				}
				else if("p".equals(opt2))
				{
					System.out.println("opening thr profile ........");
				}
			}
		}
		
		else if("rm".equals(opt)) 
		{
			System.out.println("kalpana\nmehana\ngowri");
			String opt1=scn.next();
			if("kalpana".equals(opt1)) 
			{
				System.out.println("message-hey shabari whatsup");
				System.out.println("|block||allow|");
				String allow=scn.next();
				if("allow".equals(allow)) 
				{
					
				
				System.out.println("1-(m)message(test,audioMessage,gallery(pics),stickers)\n2-(av)audio video(call)\n3-(p)go to thr profile\n4-(sr)send resquest");
				String opt2=scn.next();
				if("m".equals(opt2)) 
				{
					String message=scn.next();
					System.out.println("sent successfully");
				}
				else if("av".equals(opt2))
				{
					System.out.println("ringing.......");
				}
				else if("p".equals(opt2))
				{
					System.out.println("opening thr profile ........");
				}
				else if("sr".equals(opt2))
				{
					System.out.println("send friend resquest-|yes|    |no| ");
					String accept=scn.next();
					if("yes".equals(accept)) 
					{
						System.out.println("u have sent the resquest");
					}
					else 
					{
						System.out.println("ignored");
					}
				}
				
				}
				else if("block".equals(allow)) 
				{
					System.out.println("this account is blocked");
				}
			}
			
			
			else if("mehana".equals(opt1)) 
			{
				System.out.println("message-can u plz send ur number");
				System.out.println("|block||allow|");
				String allow=scn.next();
				if("allow".equals(allow)) 
				{
					
				
				System.out.println("1-(m)message(test,audioMessage,gallery(pics),stickers)\n2-(av)audio video(call)\n3-(p)go to thr profile\n4-(sr)send resquest");
				String opt2=scn.next();
				if("m".equals(opt2)) 
				{
					String message=scn.next();
					System.out.println("sent successfully");
				}
				else if("av".equals(opt2))
				{
					System.out.println("ringing.......");
				}
				else if("p".equals(opt2))
				{
					System.out.println("opening thr profile ........");
				}
				else if("sr".equals(opt2))
				{
					System.out.println("send friend resquest-|yes|    |no| ");
					String accept=scn.next();
					if("yes".equals(accept)) 
					{
						System.out.println("u have sent the resquest");
					}
					else 
					{
						System.out.println("ignored");
					}
				}
				
				}
				else if("block".equals(allow)) 
				{
					System.out.println("this account is blocked");
				}
			}
			
			
			else if("gowri".equals(opt1)) 
			{
				System.out.println("message-hey u r hansome");
				System.out.println("|block||allow|");
				String allow=scn.next();
				if("allow".equals(allow)) 
				{
					
				
				System.out.println("1-(m)message(test,audioMessage,gallery(pics),stickers)\n2-(av)audio video(call)\n3-(p)go to thr profile\n4-(sr)send resquest");
				String opt2=scn.next();
				if("m".equals(opt2)) 
				{
					String message=scn.next();
					System.out.println("sent successfully");
				}
				else if("av".equals(opt2))
				{
					System.out.println("ringing.......");
				}
				else if("p".equals(opt2))
				{
					System.out.println("opening thr profile ........");
				}
				else if("sr".equals(opt2))
				{
					System.out.println("send friend resquest-|yes|    |no| ");
					String accept=scn.next();
					if("yes".equals(accept)) 
					{
						System.out.println("u have sent the resquest");
					}
					else 
					{
						System.out.println("ignored");
					}
				}
				
				}
				else if("block".equals(allow)) 
				{
					System.out.println("this account is blocked");
				}
			}
			
			
			
		
		}
		
	}

	
	void newPost() //oky
	{
		System.out.println("automatically opens -gallery(g) ..and -camera(c) is thr");
		String opt=scn.next();
		if("g".equals(opt)) 
		{
			
		System.out.println("select the pic1,2,video1(v1),2(v2)");
		String search4=scn.next();
		if("1".equals(search4)) 
		 {
			System.out.println("post\nstory");
			String search5=scn.next();
			if("post".equals(search5)) 
			 {
				System.out.println("the pic is selected (filter and edit(fe)) is an option");
				String search6=scn.next();
				if("fe".equals(search6)) 
				{
					System.out.println("the pic has been filtered and edited\n-oky");
					String oky=scn.next();
					if("oky".equals(oky)) 
					{
						System.out.println("OPTIONAL\nwrite a caption(wac)\ntag people(tp)\nadd location(al)\nadd music(am) \nshare to facebook(stf)");
						String select=scn.next();
					     switch(select)
					     {
					     case  "wac":
					    	 System.out.println("write\nyes\nno");
					    	 String select2=scn.next();
					    	 if("yes".equals(select2)) 
								{
					    	 String write=scn.next();
					    	 System.out.println("finished");
								}
					    	 else 
					    	 {
					    		 System.out.println("oky");
					    	 }
					    	 
					     case  "tp":
					    	 System.out.println("u wanna tag the peoples\nyes\nno");
					    	 String select3=scn.next();
					    	 if("yes".equals(select3)) 
					    	 {
					    		System.out.println("ur frnds had been tagged");
					    	 }
					    	 else 
					    	 {
					    		 System.out.println("oky");
					    	 }
					     case  "al":
					    	 System.out.println("add location\nyes\nno");
					    	 String select4=scn.next();
					    	 if("yes".equals(select4)) 
					    	 {
					    		System.out.println("added the location");
					    	 }
					    	 else 
					    	 {
					    		 System.out.println("oky");
					    	 }
					     case  "am":
					    	 System.out.println("add music\nyes\nno");
					    	 String select5=scn.next();
					    	 if("yes".equals(select5)) 
					    	 {
					    		System.out.println("added music to the particular pic");
					    	 }
					    	 else 
					    	 {
					    		 System.out.println("oky");
					    	 }
					     case  "stf":
					    	 System.out.println("add to fb\nyes\nno");
					    	 String select6=scn.next();
					    	 if("yes".equals(select6)) 
					    	 {
					    		System.out.println("added to facebook");
					    	 }
					    	 else 
					    	 {
					    		 System.out.println("oky");
					    	 }
					    	 break;
					    	
						
					} System.out.println("ur post is uploaded");
					
				}
				
				
				
			 }
				
		 }
			else if("story".equals(search5)) 
			 {
				System.out.println("Aa\nstickers\neffects");
				String select=scn.next();
				switch(select)
			     {
			     case  "Aa":
			    	 System.out.println("write \nyes\nno");
			    	 String select1=scn.next();
			    	 if("yes".equals(select1)) 
			    	 {
			    		 String write=scn.next();
				    	 System.out.println("finished");
			    	 }
			    	 else 
			    	 {
			    		 System.out.println("oky");
			    	 }
			     case  "stickers":
			    	 System.out.println("stickers \nyes\nno");
			    	 String select2=scn.next();
			    	 if("yes".equals(select2)) 
			    	 {
				    	 System.out.println("stickers are added");

			    	 }
			    	 else 
			    	 {
			    		 System.out.println("oky");
			    	 }
			    	 
			     case  "effects":
			    	 System.out.println("effects \nyes\nno");
			    	 String select3=scn.next();
			    	 if("yes".equals(select3)) 
			    	 {
				    	 System.out.println("effects are added");
				    	 
			    	 }
			    	 else 
			    	 {
			    		 System.out.println("oky");
			    	 }
			    	 break;
			 }
				System.out.println("added to ur story");
		
			 }
			}
		
		
		else if("2".equals(search4)) 
		 {
			System.out.println("post\nstory");
			String search5=scn.next();
			if("post".equals(search5)) 
			 {
				System.out.println("the pic is selected (filter and edit(fe)) is an option");
				String search6=scn.next();
				if("fe".equals(search6)) 
				{
					System.out.println("the pic has been filtered and edited\n-oky");
					String oky=scn.next();
					if("oky".equals(oky)) 
					{
						System.out.println("OPTIONAL\nwrite a caption(wac)\ntag people(tp)\nadd location(al)\nadd music(am) \nshare to facebook(stf)");
						String select=scn.next();
					     switch(select)
					     {
					     case  "wac":
					    	 System.out.println("write\nyes\nno");
					    	 String select2=scn.next();
					    	 if("yes".equals(select2)) 
								{
					    	 String write=scn.next();
					    	 System.out.println("finished");
								}
					    	 else 
					    	 {
					    		 System.out.println("oky");
					    	 }
					    	 
					     case  "tp":
					    	 System.out.println("u wanna tag the peoples\nyes\nno");
					    	 String select3=scn.next();
					    	 if("yes".equals(select3)) 
					    	 {
					    		System.out.println("ur frnds had been tagged");
					    	 }
					    	 else 
					    	 {
					    		 System.out.println("oky");
					    	 }
					     case  "al":
					    	 System.out.println("add location\nyes\nno");
					    	 String select4=scn.next();
					    	 if("yes".equals(select4)) 
					    	 {
					    		System.out.println("added the location");
					    	 }
					    	 else 
					    	 {
					    		 System.out.println("oky");
					    	 }
					     case  "am":
					    	 System.out.println("add music\nyes\nno");
					    	 String select5=scn.next();
					    	 if("yes".equals(select5)) 
					    	 {
					    		System.out.println("added music to the particular pic");
					    	 }
					    	 else 
					    	 {
					    		 System.out.println("oky");
					    	 }
					     case  "stf":
					    	 System.out.println("add to fb\nyes\nno");
					    	 String select6=scn.next();
					    	 if("yes".equals(select6)) 
					    	 {
					    		System.out.println("added to facebook");
					    	 }
					    	 else 
					    	 {
					    		 System.out.println("oky");
					    	 }
					    	 break;
					    	
						
					} System.out.println("ur post is uploaded");
					
				}
				
				
				
			 }
				
		 }
			else if("story".equals(search5)) 
			 {
				System.out.println("Aa\nstickers\neffects");
				String select=scn.next();
				switch(select)
			     {
			     case  "Aa":
			    	 System.out.println("write \nyes\nno");
			    	 String select1=scn.next();
			    	 if("yes".equals(select1)) 
			    	 {
			    		 String write=scn.next();
				    	 System.out.println("finished");
			    	 }
			    	 else 
			    	 {
			    		 System.out.println("oky");
			    	 }
			     case  "stickers":
			    	 System.out.println("stickers \nyes\nno");
			    	 String select2=scn.next();
			    	 if("yes".equals(select2)) 
			    	 {
				    	 System.out.println("stickers are added");
				    	 System.out.println("added to ur story");
			    	 }
			    	 else 
			    	 {
			    		 System.out.println("oky");
			    	 }
			    	 
			     case  "effects":
			    	 System.out.println("effects \nyes\nno");
			    	 String select3=scn.next();
			    	 if("yes".equals(select3)) 
			    	 {
				    	 System.out.println("effects are added");
				    	
			    	 }
			    	 else 
			    	 {
			    		 System.out.println("oky");
			    	 }
			    	 break;
			 }
				System.out.println("added to ur story");
		}
			}
		
		
		
		if("v1".equals(search4)) 
		 {
			System.out.println("post\nstory");
			String search5=scn.next();
			if("post".equals(search5)) 
			 {
				System.out.println("the video is selected (filter and edit(fe)) is an option");
				String search6=scn.next();
				if("fe".equals(search6)) 
				{
					System.out.println("the video has been filtered and edited\n-oky");
					String oky=scn.next();
					if("oky".equals(oky)) 
					{
						System.out.println("OPTIONAL\nwrite a caption(wac)\ntag people(tp)\nadd location(al)\nadd music(am) \nshare to facebook(stf)");
						String select=scn.next();
					     switch(select)
					     {
					     case  "wac":
					    	 System.out.println("write\nyes\nno");
					    	 String select2=scn.next();
					    	 if("yes".equals(select2)) 
								{
					    	 String write=scn.next();
					    	 System.out.println("finished");
								}
					    	 else 
					    	 {
					    		 System.out.println("oky");
					    	 }
					    	 
					     case  "tp":
					    	 System.out.println("u wanna tag the peoples\nyes\nno");
					    	 String select3=scn.next();
					    	 if("yes".equals(select3)) 
					    	 {
					    		System.out.println("ur frnds had been tagged");
					    	 }
					    	 else 
					    	 {
					    		 System.out.println("oky");
					    	 }
					     case  "al":
					    	 System.out.println("add location\nyes\nno");
					    	 String select4=scn.next();
					    	 if("yes".equals(select4)) 
					    	 {
					    		System.out.println("added the location");
					    	 }
					    	 else 
					    	 {
					    		 System.out.println("oky");
					    	 }
					     case  "am":
					    	 System.out.println("add music\nyes\nno");
					    	 String select5=scn.next();
					    	 if("yes".equals(select5)) 
					    	 {
					    		System.out.println("added music to the particular pic");
					    	 }
					    	 else 
					    	 {
					    		 System.out.println("oky");
					    	 }
					     case  "stf":
					    	 System.out.println("add to fb\nyes\nno");
					    	 String select6=scn.next();
					    	 if("yes".equals(select6)) 
					    	 {
					    		System.out.println("added to facebook");
					    	 }
					    	 else 
					    	 {
					    		 System.out.println("oky");
					    	 }
					    	 break;
					    	
						
					}
					     System.out.println("ur post is uploaded");
					
				}
				
				
				
			 }
				
		 }
			else if("story".equals(search5)) 
			 {
				System.out.println("Aa\nstickers\neffects");
				String select=scn.next();
				switch(select)
			     {
			     case  "Aa":
			    	 System.out.println("write \nyes\nno");
			    	 String select1=scn.next();
			    	 if("yes".equals(select1)) 
			    	 {
			    		 String write=scn.next();
				    	 System.out.println("finished");
			    	 }
			    	 else 
			    	 {
			    		 System.out.println("oky");
			    	 }
			     case  "stickers":
			    	 System.out.println("stickers \nyes\nno");
			    	 String select2=scn.next();
			    	 if("yes".equals(select2)) 
			    	 {
				    	 System.out.println("stickers are added");
			    	 }
			    	 else 
			    	 {
			    		 System.out.println("oky");
			    	 }
			    	 
			     case  "effects":
			    	 System.out.println("effects \nyes\nno");
			    	 String select3=scn.next();
			    	 if("yes".equals(select3)) 
			    	 {
				    	 System.out.println("effects are added");
			    	 }
			    	 else 
			    	 {
			    		 System.out.println("oky");
			    	 }
			    	 break;
			 }
				System.out.println("added to ur story");
		}
			}
		
		
		
		if("v2".equals(search4)) 
		 {
			System.out.println("post\nstory");
			String search5=scn.next();
			if("post".equals(search5)) 
			 {
				System.out.println("the video is selected (filter and edit(fe)) is an option");
				String search6=scn.next();
				if("fe".equals(search6)) 
				{
					System.out.println("the video has been filtered and edited\n-oky");
					String oky=scn.next();
					if("oky".equals(oky)) 
					{
						System.out.println("OPTIONAL\nwrite a caption(wac)\ntag people(tp)\nadd location(al)\nadd music(am) \nshare to facebook(stf)");
						String select=scn.next();
					     switch(select)
					     {
					     case  "wac":
					    	 System.out.println("write\nyes\nno");
					    	 String select2=scn.next();
					    	 if("yes".equals(select2)) 
								{
					    	 String write=scn.next();
					    	 System.out.println("finished");
								}
					    	 else 
					    	 {
					    		 System.out.println("oky");
					    	 }
					    	 
					     case  "tp":
					    	 System.out.println("u wanna tag the peoples\nyes\nno");
					    	 String select3=scn.next();
					    	 if("yes".equals(select3)) 
					    	 {
					    		System.out.println("ur frnds had been tagged");
					    	 }
					    	 else 
					    	 {
					    		 System.out.println("oky");
					    	 }
					     case  "al":
					    	 System.out.println("add location\nyes\nno");
					    	 String select4=scn.next();
					    	 if("yes".equals(select4)) 
					    	 {
					    		System.out.println("added the location");
					    	 }
					    	 else 
					    	 {
					    		 System.out.println("oky");
					    	 }
					     case  "am":
					    	 System.out.println("add music\nyes\nno");
					    	 String select5=scn.next();
					    	 if("yes".equals(select5)) 
					    	 {
					    		System.out.println("added music to the particular pic");
					    	 }
					    	 else 
					    	 {
					    		 System.out.println("oky");
					    	 }
					     case  "stf":
					    	 System.out.println("add to fb\nyes\nno");
					    	 String select6=scn.next();
					    	 if("yes".equals(select6)) 
					    	 {
					    		System.out.println("added to facebook");
					    	 }
					    	 else 
					    	 {
					    		 System.out.println("oky");
					    	 }
					    	 break;
					    	
						
					}
					     System.out.println("ur post is uploaded");
					
				}
				
				
				
			 }
				
		 }
			else if("story".equals(search5)) 
			 {
				System.out.println("Aa\nstickers\neffects");
				String select=scn.next();
				switch(select)
			     {
			     case  "Aa":
			    	 System.out.println("write \nyes\nno");
			    	 String select1=scn.next();
			    	 if("yes".equals(select1)) 
			    	 {
			    		 String write=scn.next();
				    	 System.out.println("finished");
			    	 }
			    	 else 
			    	 {
			    		 System.out.println("oky");
			    	 }
			     case  "stickers":
			    	 System.out.println("stickers \nyes\nno");
			    	 String select2=scn.next();
			    	 if("yes".equals(select2)) 
			    	 {
				    	 System.out.println("stickers are added");
			    	 }
			    	 else 
			    	 {
			    		 System.out.println("oky");
			    	 }
			    	 
			     case  "effects":
			    	 System.out.println("effects \nyes\nno");
			    	 String select3=scn.next();
			    	 if("yes".equals(select3)) 
			    	 {
				    	 System.out.println("effects are added");
			    	 }
			    	 else 
			    	 {
			    		 System.out.println("oky");
			    	 }
			    	 break;
			 }
				System.out.println("added to ur story");
		}
			}
		}
			
			
			
			
		else if("c".equals(opt)) 
		 {
			 System.out.println("which opens camera to capture\n-post\n-story");
			 String opt1=scn.next();
			
			 if("post".equals(opt1)) 
			 {
				System.out.println("capture(cap)");
				String search5=scn.next();
				if("cap".equals(search5)) 
				 {
					System.out.println("the pic is captured (filter and edit(fe)) is an option");
					String search6=scn.next();
					if("fe".equals(search6)) 
					{
						System.out.println("the pic has been filtered and edited\n-next");
						String next=scn.next();
						if("next".equals(next)) 
						{
							System.out.println("OPTIONAL\nwrite a caption(wac)\ntag people(tp)\nadd location(al)\nadd music(am) \nshare to facebook(stf)");
							String select=scn.next();
						     switch(select)
						     {
						     case  "wac":
						    	 System.out.println("write\nyes\nno");
						    	 String select2=scn.next();
						    	 if("yes".equals(select2)) 
									{
						    	 String write=scn.next();
						    	 System.out.println("finished");
									}
						    	 else 
						    	 {
						    		 System.out.println("oky");
						    	 }
						    	 
						     case  "tp":
						    	 System.out.println("u wanna tag the peoples\nyes\nno");
						    	 String select3=scn.next();
						    	 if("yes".equals(select3)) 
						    	 {
						    		System.out.println("ur frnds had been tagged");
						    	 }
						    	 else 
						    	 {
						    		 System.out.println("oky");
						    	 }
						     case  "al":
						    	 System.out.println("add location\nyes\nno");
						    	 String select4=scn.next();
						    	 if("yes".equals(select4)) 
						    	 {
						    		System.out.println("added the location");
						    	 }
						    	 else 
						    	 {
						    		 System.out.println("oky");
						    	 }
						     case  "am":
						    	 System.out.println("add music\nyes\nno");
						    	 String select5=scn.next();
						    	 if("yes".equals(select5)) 
						    	 {
						    		System.out.println("added music to the particular pic");
						    	 }
						    	 else 
						    	 {
						    		 System.out.println("oky");
						    	 }
						     case  "stf":
						    	 System.out.println("add to fb\nyes\nno");
						    	 String select6=scn.next();
						    	 if("yes".equals(select6)) 
						    	 {
						    		System.out.println("added to facebook");
						    	 }
						    	 else 
						    	 {
						    		 System.out.println("oky");
						    	 }
						    	 break;
						    	
							
						}
						     System.out.println("post is uploaded");
						
					}
					
					
					
				 }
					
			 }}
				else if("story".equals(opt1)) 
				 {
					
					
					System.out.println("capture(cap)");
					String search13=scn.next();
					if("cap".equals(search13)) 
					 {
					System.out.println("Aa\nstickers\neffects");
					String select1=scn.next();
					switch(select1)
				     {
				     case  "Aa":
				    	 System.out.println("write \nyes\nno");
				    	 String select77=scn.next();
				    	 if("yes".equals(select77)) 
				    	 {
				    		 String write=scn.next();
					    	 System.out.println("finished");
				    	 }
				    	 else 
				    	 {
				    		 System.out.println("oky");
				    	 }
				     case  "stickers":
				    	 System.out.println("stickers \nyes\nno");
				    	 String select2=scn.next();
				    	 if("yes".equals(select2)) 
				    	 {
					    	 System.out.println("stickers are added");
				    	 }
				    	 else 
				    	 {
				    		 System.out.println("oky");
				    	 }
				    	 
				     case  "effects":
				    	 System.out.println("effects \nyes\nno");
				    	 String select33=scn.next();
				    	 if("yes".equals(select33)) 
				    	 {
					    	 System.out.println("effects are added");
				    	 }
				    	 else 
				    	 {
				    		 System.out.println("oky");
				    	 }
				    	 break;
				 }
					
					
					System.out.println("story is uploaded");
			}
				}
			 
		 }
		 
		 
		 
		 
		 }
		}
		
		
		
		
	

	


