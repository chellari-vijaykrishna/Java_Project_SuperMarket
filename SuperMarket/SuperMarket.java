import java.util.*;
public class SuperMarket 
{
	static Scanner sc=new Scanner(System.in);
	
	public static int appleAmount=0;
	public static int grapesAmount=0;
	public static int dargenAmount=0;
	public static int bananaAmount=0;
	public static int sapotaAmount=0;
	public static int orangeAmount=0;
	
	public static int brAmount=0;
	public static int lfAmount=0;
	public static int bjAmount=0;
	public static int toAmount=0;
	public static int onAmount=0;
	public static int cbAmount=0;
	
	public static int cmkAmount=0;
	public static int bmkAmount=0;
	public static int cdAmount=0;
	public static int btmAmount=0;
	public static int btAmount=0;
	public static int gheAmount=0;
	
	public static int thmAmount=0;
	public static int sprAmount=0;
	public static int mzaAmount=0;
	public static int pepAmount=0;
	public static int cocAmount=0;
	
	public static int fruitsFinalBilling=0;
	public static int VegFinalBilling=0;
	public static int dairyFinalBilling=0;
	public static int softFinalBilling;
	
	public static int finalbill=0;

	public static int appleQuantity;
	public static int grapesQuantity;
	public static int dargenFruitQuantity;
	public static int bananaQuantity;
	public static int sapotaQuantity;
	public static int orangeQuantity;
	public static int brQuantity;
	public static int lfQuantity;
	public static int toQuantity;
	public static int onQuantity;
	public static int cbQuantity;
	public static int bmkQuantity;
	public static int cmkQuantity;
	public static int cdQuantity;
	public static int btmQuantity;
	public static int btQuantity;
	public static int gheQuantity;
	public static int bjQuantity;
	
	
	public static int thmQuantity;
	public static int sprQuantity;
	public static int mzaQuantity;
	public static int pepQuantity;
	public static int cocQuantity;
	
	void intrometh()
	{
		String d1=null;
		do
		{
			System.out.println("===============================================================================");
			System.out.println("\t\t---------WELCOME TO SUPER MARKET-----------");
			System.out.println("==============================================================================="); 
			System.out.println("<------Please Choose Below Options------>");
			System.out.println("------    ----------    ------------");
			System.out.println("Option    Catagory ID   Product");
			System.out.println("------    ----------    ------------");
			System.out.println("  1:          A         Fruits");
			System.out.println("  2:          B         Vegetables");
			System.out.println("  3:          C         Dairy Products");
			System.out.println("  4:          D         Soft Drinks");
			System.out.println("------    ----------    -------------");
			int a=sc.nextInt();
			switch(a) 
			{
				case 1:
					new SuperMarket().fruits();
					break;
				case 2:
					new SuperMarket().Vegetables();
					break;
				case 3:
					new SuperMarket().dairyProducts();
					break;
				case 4:
					new SuperMarket().softDrinks();
					default :
						System.out.println("Oops! Invaild Please Choose above options: ");
			
			 }
			  System.out.println("Are Sure You Want to Continue with Main Menu, then Press 'Yes' or Press any Key to Get *INVOICE*");
			  d1 = sc.next();
	    }
		while((d1.equals("Yes")) || d1.equals("yes"));
	System.out.println("Calculating Final Bill");
	fruitsBilling();
	VegBilling();
	dairyBilling();
	softBilling();
	finalInvoicePrint();
	}
	
	// Catagories
	void fruits()
	{
		    //char co;
		    String co1;
			do
			{
				System.out.println("=============================================================================================");
				System.out.println("\t\t\tWelcome to Fruits Section, here the list of avaliable items :");
				System.out.println("\t\t\t\t\t\tPlease choose below options : ");
				System.out.println("------    ----------     -------");
				System.out.println("Option    Product ID     Product");
				System.out.println("------    ----------     -------");
				System.out.println("  1:         A1          Apples");
				System.out.println("  2:         A2          Grapes");
				System.out.println("  3:         A3          Dragen Fruit");
				System.out.println("  4:         A4          Banana");
				System.out.println("  5:         A5          Sapota");
				System.out.println("  6:         A6          Orange");
				System.out.println("------    ----------     -------");
			    int b=sc.nextInt();
				switch(b) 
				{
				case 1:
					System.out.println("Quantity of apples in KG's");
					System.out.println("<===== Per KG = RS. 150 =====>");
					System.out.println("How many KG's of Apples you want :");
					appleQuantity = sc.nextInt();
					appleQty(appleQuantity);
					break;
				case 2:
					System.out.println("Quantity of Grapes in KG's");
					System.out.println("<===== Per KG = RS. 120 =====>");
					System.out.println("How many KG's of Grapes you want :");
					grapesQuantity = sc.nextInt();
					grapQty(grapesQuantity);
					break;
				case 3:
					System.out.println("Quantity of Dargen Fruit in KG's");
					System.out.println("<===== Per KG = RS. 250 =====>");
					System.out.println("How many KG's of Dargen Fruit you want :");
					dargenFruitQuantity = sc.nextInt();
					dargenQty(dargenFruitQuantity);
					break;
				case 4:
					System.out.println("Quantity of Banana in Dazen's");
					System.out.println("<===== Per KG = RS. 40 =====>");
					System.out.println("How many Dazen's of Banana you want :");
					bananaQuantity = sc.nextInt();
					bananaQty(bananaQuantity);
					break;
				case 5:
					System.out.println("Quantity of Sapota in KG's");
					System.out.println("<===== Per KG = RS. 100 =====>");
					System.out.println("How many KG's of Sapota you want :");
					sapotaQuantity = sc.nextInt();
					sapotaQty(sapotaQuantity);
					break;
				case 6:
					System.out.println("Quantity of Orange in KG's");
					System.out.println("<===== Per KG = RS. 140 =====>");
					System.out.println("How many KG's of Orange you want :");
					orangeQuantity = sc.nextInt();
					orangeQty(orangeQuantity);
					break;
				default:
						System.out.println("Invaild Selection please Choose Correct Option....");
				}
				System.out.println("Do You Want to Continue with Fruits Section, then Press 'Yes' ");
				System.out.println("or Return to Main Menu Please Press any key..............");
				//co=sc.next().charAt(0);
				co1=sc.next();
				//System.out.println(co1);
			}
			while(co1.equals("yes") || co1.equals("Yes") );
	}
	void Vegetables()
	{
		//char co;
	    String co1;
		do
		{
			System.out.println("=============================================================================================");
			System.out.println("\t\t\tWelcome to Vegetables Section, here the list of avaliable items :");
			System.out.println("\t\t\t\t\t\tPlease choose below options : ");
			System.out.println("------    ----------     -------");
			System.out.println("Option    Product ID     Product");
			System.out.println("------    ----------     -------");
			System.out.println("  1:          B1         Beat Root");
			System.out.println("  2:          B2         Laddies Fingers");
			System.out.println("  3:          B3         Brinjal");
			System.out.println("  4:          B4         Tomato");
			System.out.println("  5:          B5         Onion");
			System.out.println("  6:          B6         Cabbage");
			System.out.println("------    ----------     -------");
		    int b=sc.nextInt();
			switch(b) 
			{
			case 1:
				System.out.println("Quantity of Beat Root in KG's");
				System.out.println("<===== Per KG = RS. 100 =====>");
				System.out.println("How many KG's of Beat Root you want :");
				brQuantity = sc.nextInt();
				brQty(brQuantity);
				break;
			case 2:
				System.out.println("Quantity of Laddies Fingers in KG's");
				System.out.println("<===== Per KG = RS. 40 =====>");
				System.out.println("How many KG's of Laddies Fingers you want :");
				lfQuantity = sc.nextInt();
				lfQty(lfQuantity);
				break;
			case 3:
				System.out.println("Quantity of Brinjal in KG's");
				System.out.println("<===== Per KG = RS. 45 =====>");
				System.out.println("How many KG's of Brinjal you want :");
				bjQuantity = sc.nextInt();
				bjQty(bjQuantity);
				break;
			case 4:
				System.out.println("Quantity of Tomato in Dazen's");
				System.out.println("<===== Per KG = RS. 50 =====>");
				System.out.println("How many Dazen's of Tomato you want :");
				toQuantity = sc.nextInt();
				toQty(toQuantity);
				break;
			case 5:
				System.out.println("Quantity of Onion in KG's");
				System.out.println("<===== Per KG = RS. 15 =====>");
				System.out.println("How many KG's of Onion you want :");
				onQuantity = sc.nextInt();
				onQty(onQuantity);
				break;
			case 6:
				System.out.println("Quantity of Cabbage in KG's");
				System.out.println("<===== Per KG = RS. 40 =====>");
				System.out.println("How many KG's of Cabbage you want :");
				cbQuantity = sc.nextInt();
				cbQty(cbQuantity);
				break;
				default:
					System.out.println("Invaild Selection please Choose Correct Option....");
			}
			System.out.println("Do You Want to Continue with Vegetables Section, then Press 'Yes' ");
			System.out.println("or Return to Main Menu Please Press any key..............");
			//co=sc.next().charAt(0);
			co1=sc.next();
		}
		while(co1.equals("yes") || co1.equals("Yes") );

	}
	void dairyProducts()
	{
		//char co;
	    String co1;
		do
		{
			System.out.println("=============================================================================================");
			System.out.println("\t\t\tWelcome to Dairy Products Section, here the list of avaliable items :");
			System.out.println("\t\t\t\t\t\tPlease choose below options : ");
			System.out.println("------    ----------     -------");
			System.out.println("Option    Product ID     Product");
			System.out.println("------    ----------     -------");
			System.out.println("  1:          C1         Buffalo Milk");
			System.out.println("  2:          C2         Cow Milk");
			System.out.println("  3:          C3         Curd");
			System.out.println("  4:          C4         Butter Milk");
			System.out.println("  5:          C5         Butter");
			System.out.println("  6:          C6         Ghee");
			System.out.println("------    ----------     -------");
		int b=sc.nextInt();
			switch(b) 
			{
			case 1:
				System.out.println("Quantity of Buffalo Milk in Lt's");
				System.out.println("<===== Per Litre = RS. 70 =====>");
				System.out.println("How many Liter's of Milk you want :");
				bmkQuantity = sc.nextInt();
				bmkQty(bmkQuantity);
				break;
			case 2:
				System.out.println("Quantity of Cow Milk in Lt's");
				System.out.println("<===== Per Litre = RS. 50 =====>");
				System.out.println("How many Liter's of Milk you want :");
				cmkQuantity = sc.nextInt();
				cmkQty(cmkQuantity);
				break;
			case 3:
				System.out.println("Quantity of Curd in KG's");
				System.out.println("<===== Per KG = RS. 100 =====>");
				System.out.println("How many KG's of Curd you want :");
				cdQuantity = sc.nextInt();
				cdQty(cdQuantity);
				break;
			case 4:
				System.out.println("Quantity of Butter Milk in Lt's");
				System.out.println("<===== Per Litre = RS. 50 =====>");
				System.out.println("How many Liter's of Butter Milk you want :");
				btmQuantity = sc.nextInt();
				btmQty(btmQuantity);
				break;
			case 5:
				System.out.println("Quantity of Butter in KG's");
				System.out.println("<===== Per KG = RS. 200 =====>");
				System.out.println("How many KG's of Butter you want :");
				btQuantity = sc.nextInt();
				btQty(btQuantity);
				break;
			case 6:
				System.out.println("Quantity of Ghee in KG's");
				System.out.println("<===== Per KG = RS. 600 =====>");
				System.out.println("How many KG's of Orange you want :");
				gheQuantity = sc.nextInt();
				gheQty(gheQuantity);
				break;
				default:
					System.out.println("Invaild Selection please Choose Correct Option....");
			}
			System.out.println("Do You Want to Continue with Dairy Products Section, then Press 'Yes' ");
			System.out.println("or Return to Main Menu Please Press any key..............");
			//co=sc.next().charAt(0);
			co1=sc.next();
		}
		while(co1.equals("yes") || co1.equals("Yes") );

	}
	void softDrinks()
	{
		//char co;
	    String co1;
		do
		{
			System.out.println("=============================================================================================");
			System.out.println("\t\t\tWelcome to Soft Drinks Section, here the list of avaliable items :");
			System.out.println("\t\t\t\t\t\tPlease choose below options : ");
			System.out.println("------    ----------     -------");
			System.out.println("Option    Product ID     Product");
			System.out.println("------    ----------     -------");
			System.out.println("  1:          D1         Thumbsup");
			System.out.println("  2:          D2         Sprite");
			System.out.println("  3:          D3         Mazza");
			System.out.println("  4:          D4         Pepsi");
			System.out.println("  5:          D5         Cococola");
			System.out.println("------    ----------     -------");
		int b=sc.nextInt();
			switch(b) 
			{
			case 1:
				System.out.println("Quantity of Thumsup in Lt's");
				System.out.println("<===== Per Bottle = RS. 65 =====>");
				System.out.println("How many Bottles of Thumsup you want :");
				thmQuantity = sc.nextInt();
				thmQty(thmQuantity);
				break;
			case 2:
				System.out.println("Quantity of Sprite in Lt's");
				System.out.println("<===== Per Bottle = RS. 55 =====>");
				System.out.println("How many Bottles of Sprite you want :");
				sprQuantity = sc.nextInt();
				sprQty(sprQuantity);
				break;
			case 3:
				System.out.println("Quantity of Mazza in Lt's");
				System.out.println("<===== Per Bottle = RS. 60 =====>");
				System.out.println("How many Bottles of Mazza you want :");
				mzaQuantity = sc.nextInt();
				mzaQty(mzaQuantity);
				break;
			case 4:
				System.out.println("Quantity of Pepsi in Lt's");
				System.out.println("<===== Per Bottle = RS. 50 =====>");
				System.out.println("How many Bottles of Pepsi you want :");
				pepQuantity = sc.nextInt();
				pepQty(pepQuantity);
				break;
			case 5:
				System.out.println("Quantity of Cococola in Lt's");
				System.out.println("<===== Per Bottle = RS. 45 =====>");
				System.out.println("How many Bottles of Cococola you want :");;
				cocQuantity = sc.nextInt();
				cocQty(cocQuantity);
				break;
			default:
				System.out.println("Invaild Selection please Choose Correct Option....");
			}
			System.out.println("Do You Want to Continue with Soft Drinks Section, then Press 'Yes' ");
			System.out.println("or Return to Main Menu Please Press any key..............");
			//co=sc.next().charAt(0);
			co1=sc.next();
		}
		while(co1.equals("yes") || co1.equals("Yes") );

	}
	
	
	// Fruits
	void appleQty(int appleQuantity)
	{
		appleAmount = appleQuantity*150;
		System.out.println("You Selected Apple Quantity: "+appleQuantity+", Price is : "+appleQuantity+"*150 ="+appleAmount);
		
	}
	void grapQty(int grapesQuantity)
	{
		grapesAmount = grapesQuantity*120;
		System.out.println("You Selected Grapes Quantity: "+grapesQuantity+", Price is : "+grapesQuantity+"*120 ="+grapesAmount);
	}
	void dargenQty(int dargenFruitQuantity) 
	{
		dargenAmount = dargenFruitQuantity*250;
		System.out.println("You Selected Dargen fruit Quantity: "+dargenFruitQuantity+", Price is : "+dargenFruitQuantity+"*250 ="+dargenAmount);
		
	}
	void bananaQty(int bananaQuantity)
	{
		bananaAmount = bananaQuantity*40;
		System.out.println("You Selected Banana Quantity: "+bananaQuantity+", Price is : "+bananaQuantity+"*40 ="+bananaAmount);
	}
	void sapotaQty(int sapotaQuantity)
	{
		sapotaAmount = sapotaQuantity*100;
		System.out.println("You Selected sopata Quantity: "+sapotaQuantity+", Price is : "+sapotaQuantity+"*100 ="+sapotaAmount);
	}
	void orangeQty(int orangeQuantity)
	{
		orangeAmount = orangeQuantity*140;
		System.out.println("You Selected Orange Quantity: "+orangeQuantity+", Price is : "+orangeQuantity+"*140 ="+orangeAmount);
	}
	

	
	// Vegetables
	void brQty(int brQuantity)
	{
		brAmount = brQuantity*100;
		System.out.println("You Selected Beat Root Quantity: "+brQuantity+", Price is : "+brQuantity+"*100 ="+brAmount);
		
	}
	void lfQty(int lfQuantity)
	{
		lfAmount = lfQuantity*40;
		System.out.println("You Selected Laddies Finger Quantity: "+lfQuantity+", Price is : "+lfQuantity+"*40 ="+lfAmount);
	}
	void bjQty(int bjQuantity) 
	{
		bjAmount = bjQuantity*45;
		System.out.println("You Selected Brinjal Quantity: "+bjQuantity+", Price is : "+bjQuantity+"*45 ="+bjAmount);
	}
	void toQty(int toQuantity)
	{
		toAmount = toQuantity*50;
		System.out.println("You Selected Tomato Quantity: "+toQuantity+", Price is : "+toQuantity+"*50 ="+toAmount);
	}
	void onQty(int onQuantity)
	{
		onAmount = onQuantity*15;
		System.out.println("You Selected Onion Quantity: "+onQuantity+", Price is : "+onQuantity+"*15 ="+onAmount);
	}
	void cbQty(int cbQuantity)
	{
		cbAmount = cbQuantity*40;
		System.out.println("You Selected Cabbage Quantity: "+cbQuantity+", Price is : "+cbQuantity+"*40 ="+cbAmount);
	}
	
	
	
	
	// Dairy Products
	void cmkQty(int cmkQuantity)
	{
		cmkAmount = cmkQuantity*100;
		System.out.println("You Selected Cow Milk Quantity: "+cmkQuantity+", Price is : "+cmkQuantity+"*100 ="+cmkAmount);
		
	}
	void bmkQty(int bmkQuantity)
	{
		bmkAmount = bmkQuantity*40;
		System.out.println("You Selected Buffalo Milk Quantity: "+bmkQuantity+", Price is : "+bmkQuantity+"*40 ="+bmkAmount);
	}
	void cdQty(int cdQuantity) 
	{
		cdAmount = cdQuantity*45;
		System.out.println("You Selected Curd Quantity: "+cdQuantity+", Price is : "+cdQuantity+"*45 ="+cdAmount);
	}
	void btmQty(int btmQuantity)
	{
		btmAmount = btmQuantity*50;
		System.out.println("You Selected Butter Milk Quantity: "+btmQuantity+", Price is : "+btmQuantity+"*50 ="+btmAmount);
	}
	void btQty(int btQuantity)
	{
		btAmount = btQuantity*15;
		System.out.println("You Selected Butter Quantity: "+btQuantity+", Price is : "+btQuantity+"*15 ="+btAmount);
	}
	void gheQty(int gheQuantity)
	{
		gheAmount = gheQuantity*40;
		System.out.println("You Selected Ghee Quantity: "+gheQuantity+", Price is : "+gheQuantity+"*40 ="+gheAmount);
	}
	

	
	
    // Soft Drinks
	void thmQty(int thmQuantity)
	{
		thmAmount = thmQuantity*100;
		System.out.println("You Selected Thumsup Bottle Quantity: "+thmQuantity+", Price is : "+thmQuantity+"*100 ="+thmAmount);
		
	}
	void sprQty(int sprQuantity)
	{
		sprAmount = sprQuantity*40;
		System.out.println("You Selected Sprite Bottle Quantity: "+sprQuantity+", Price is : "+sprQuantity+"*40 ="+sprAmount);
	}
	void mzaQty(int mzaQuantity) 
	{
		mzaAmount = mzaQuantity*45;
		System.out.println("You Selected Mazza Bottle Quantity: "+mzaQuantity+", Price is : "+mzaQuantity+"*45 ="+mzaAmount);
	}
	void pepQty(int pepQuantity)
	{
		pepAmount = pepQuantity*50;
		System.out.println("You Selected Pepsi Bottle Quantity: "+pepQuantity+", Price is : "+pepQuantity+"*50 ="+pepAmount);
	}
	void cocQty(int cocQuantity)
	{
		cocAmount = cocQuantity*15;
		System.out.println("You Selected Cococola Bottle Quantity: "+cocQuantity+", Price is : "+cocQuantity+"*15 ="+cocAmount);
	}
	
	
	
	
	void fruitsBilling()
	{
		fruitsFinalBilling =appleAmount+grapesAmount+dargenAmount+bananaAmount+sapotaAmount+orangeAmount;
	}
	
	void VegBilling()
	{
		VegFinalBilling =brAmount+lfAmount+bjAmount+toAmount+onAmount+cbAmount;
	}
	
	void dairyBilling()
	{
		dairyFinalBilling = cmkAmount+bmkAmount+cdAmount+btmAmount+btAmount+gheAmount;
	}
	
	void softBilling()
	{
		softFinalBilling = thmAmount+sprAmount+mzaAmount+pepAmount+cocAmount;
	}
	

	void DiscountCal(int finalbi) 
	{
		if(finalbi>400 && finalbi<500)
		{
			int disbill = finalbi-100;
			System.out.println("             Congrats!!!!   You Received Discount of RS.50          ");
			System.out.println("                                                              Your Final Bill is  =   "+finalbi+"-50"+"  =  "+disbill);
		}
		else if(finalbi>500 && finalbi<1000)
		{
			int disbill = finalbi-200;
			System.out.println("             Congrats!!!!   You Received Discount of RS.200          ");
			System.out.println("                                                              Your Final Bill is  =   "+finalbi+"-200"+"  = "+disbill);
		}
		else if(finalbi>1000)
		{
			int disbill = finalbi-200;
			System.out.println("             Congrats!!!!   You Received Discount of RS.300          ");
			System.out.println("                                                              Your Final Bill is  =  "+finalbi+"-300"+"  = "+disbill);
		}
		
		else
		{
			int reqbil100 = 500-finalbi;
			int reqbil200 = 1000-finalbi;
			System.out.println("             Oops You didn't receive any Discount, Please Purchase more to get RS.100   "+reqbil100);
			System.out.println("             Oops You didn't receive any Discount, Please Purchase more to get RS.200   "+reqbil200);
			System.out.println();
			System.out.println("                                                                                       Your Final Bill is  = "+finalbi);
		}
	}
	
	// Final Invoice 
	void finalInvoicePrint()
	{
		System.out.println("Please Enter Your Name : ");
        String name = sc.next();
        System.out.println("Please Enter your City : ");
        String address = sc.next();
        System.out.println("Please Enter your Number : ");
        long num = sc.nextLong();
        System.out.println("Please Enter your Mail ID : ");
        String mail = sc.next();
        System.out.println();
		System.out.println("Printing Invoice..........");
		System.out.println();
		System.out.println();
        System.out.println("----------------------------------------------------Invoice-----------------------------------------");  
        System.out.println("\t\t\t\t\t "+"         "+"Super Makert ");  
        System.out.println("\t\t\t\t\t 1-1, Chintalapudi, West Godavari, AP, 534460");  
        System.out.println("\t\t\t\t\t"  +"      " +"Opposite Government School");  
        System.out.println("GSTIN: 0475ASEFG4155F5D"+"\t\t\t\t\t\t\tContact: (+91) 9988776655"); 
        System.out.println();
        System.out.println("Name      : "+name);
        System.out.println("Address   : "+address);
        System.out.println("Mobile No : "+num);
        System.out.println("Mail Id   : "+mail);
        System.out.println();
        System.out.println("INVOICE NO : 01");
        System.out.println();
		finalbill = fruitsFinalBilling+VegFinalBilling+dairyFinalBilling+softFinalBilling;
		//int items[] = {appleAmount,grapesAmount,dargenAmount,bananaAmount,sapotaAmount,orangeAmount,brAmount,lfAmount,bjAmount,toAmount,onAmount,cbAmount,cmkAmount,bmkAmount,cdAmount,btmAmount,btAmount,gheAmount,thmAmount,sprAmount,mzaAmount,pepAmount,cocAmount};
		System.out.println("Item ID        Item Name        Item Quantity    Item Cost Per 1 Unit(in RS)       Item Total Cost (in RS)    "); 
        System.out.println("-------        ---------        -------------    ---------------------------       -----------------------    "); 
        
        if(appleAmount!=0) 
        {
        System.out.println("  A1            Apples             "+appleQuantity+        "                         "+appleQuantity+"*150 = "+appleQuantity*150+"               "+appleAmount+"");
        System.out.println(); 
        }
        if(grapesAmount!=0) 
        {
        System.out.println("  A2            Grapes             "+grapesQuantity+        "                         "+grapesQuantity+"*120 = "+grapesQuantity*120+"               "+grapesAmount+"");
        System.out.println();
        }
        if(dargenAmount!=0) 
        {
        System.out.println("  A3            Dargen Fruit       "+dargenFruitQuantity+        "                         "+dargenFruitQuantity+"*250 = "+dargenFruitQuantity*250+"               "+dargenAmount+"");
        System.out.println();
        }
        if(bananaAmount!=0) 
        {
        System.out.println("  A4            Banana             "+bananaQuantity+        "                         "+bananaQuantity+"*40 = "+bananaQuantity*40+"                 "+bananaAmount+"");
        System.out.println();
        }
        if(sapotaAmount!=0) 
        {
        System.out.println("  A5            Sapota             "+sapotaQuantity+        "                         "+sapotaQuantity+"*100 = "+sapotaQuantity*100+"               "+sapotaAmount+"");
        System.out.println();
        }
        if(orangeAmount!=0) 
        {
        System.out.println("  A6            Orange             "+orangeQuantity+        "                         "+orangeQuantity+"*140 = "+orangeQuantity*140+"               "+orangeAmount+"");
        System.out.println();
        }
        
        
        
        if(brAmount!=0) 
        {
        System.out.println("  B1            Beat Root          "+brQuantity+        "                         "+brQuantity+"*100 = "+brQuantity*100+"               "+brAmount+"");
        System.out.println();
        }
        if(lfAmount!=0) 
        {
        System.out.println("  B2            Ladies Finger      "+lfQuantity+        "                         "+lfQuantity+"*40 = "+lfQuantity*40+"                 "+lfAmount+"");
        System.out.println();
        }
        if(bjAmount!=0) 
        {
        System.out.println("  B3            Brinjal            "+bjQuantity+        "                         "+bjQuantity+"*45 = "+bjQuantity*45+"                 "+bjAmount+"");
        System.out.println();
        }
        if(toAmount!=0) 
        {
        System.out.println("  B4            Tomato             "+toQuantity+        "                         "+toQuantity+"*50 = "+toQuantity*50+"                 "+toAmount+"");
        System.out.println();
        }
        if(onAmount!=0) 
        {
        System.out.println("  B5            Oninon             "+onQuantity+        "                         "+onQuantity+"*15 = "+onQuantity*15+"                 "+onAmount+"");
        System.out.println();
        }
        if(cbAmount!=0) 
        {
        System.out.println("  B6            Cabbage            "+cbQuantity+        "                         "+cbQuantity+"*40 = "+cbQuantity*40+"                 "+cbAmount+"");
        System.out.println();
        }
        
       
        
        if(bmkAmount!=0) 
        {
        System.out.println("  C1            Buffalo Milk       "+bmkQuantity+        "                         "+bmkQuantity+"*70 = "+bmkQuantity*70+"                 "+bmkAmount+"");
        System.out.println();
        }
        if(cmkAmount!=0) 
        {
        System.out.println("  C2            Cow Milk           "+cmkQuantity+        "                         "+cmkQuantity+"*50 = "+cmkQuantity*50+"                 "+cmkAmount+"");
        System.out.println();
        }
        if(cdAmount!=0) 
        {
        System.out.println("  C3            Curd               "+cdQuantity+        "                         "+cdQuantity+"*100 = "+cdQuantity*100+"               "+cdAmount+"");
        System.out.println();
        }
        if(btmAmount!=0) 
        {
        System.out.println("  C4            Butter Milk        "+btmQuantity+        "                         "+btmQuantity+"*50 = "+btmQuantity*50+"                 "+btmAmount+"");
        System.out.println();
        }
        if(btAmount!=0) 
        {
        System.out.println("  C5            Butter             "+btQuantity+        "                         "+btQuantity+"*200 = "+btQuantity*200+"               "+btAmount+"");
        System.out.println();
        }
        if(gheAmount!=0) 
        {
        System.out.println("  C6            Ghee               "+gheQuantity+        "                         "+gheQuantity+"*600 = "+gheQuantity*600+"               "+gheAmount+"");
        System.out.println();
        }
        
        
        
        if(thmAmount!=0) 
        {
        System.out.println("  D1            Thumsup            "+thmQuantity+        "                         "+thmQuantity+"*65 = "+thmQuantity*65+"                 "+thmAmount+"");
        System.out.println();
        }
        if(sprAmount!=0) 
        {
        System.out.println("  D2            Sprite             "+sprQuantity+        "                         "+sprQuantity+"*55 = "+sprQuantity*55+"                 "+sprAmount+"");
        System.out.println();
        }
        if(mzaAmount!=0) 
        {
        System.out.println("  D3            Mazza              "+mzaQuantity+        "                         "+mzaQuantity+"*60 = "+mzaQuantity*60+"                 "+mzaAmount+"");
        System.out.println();
        }
        if(pepAmount!=0) 
        {
        System.out.println("  D4            Pepsi              "+pepQuantity+        "                         "+pepQuantity+"*50 = "+pepQuantity*50+"                 "+pepAmount+"");
        System.out.println();
        }
        if(cocAmount!=0) 
        {
        System.out.println("  D5            Cococola           "+cocQuantity+        "                         "+cocQuantity+"*45 = "+cocQuantity*45+"                 "+cocAmount+"");
        System.out.println();
        }
        
        
        
       
        

 
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.println("                                                                                      "+finalbill);
        
        System.out.println("Applying Discount Benfits----------");
        System.out.println();
        DiscountCal(finalbill);
        System.out.println();
        System.out.println("             Thank You for Shooping with us..... See You Soon!!!!!!!          ");
        System.out.println();
		System.out.println("             This is Computer Generated INVOICE Signature not Required                ");
	}
	
	public static void main(String[] args)
	{
		new SuperMarket().intrometh();
		System.out.println("-----------------------------*****------------------------------------------");
	}
}
