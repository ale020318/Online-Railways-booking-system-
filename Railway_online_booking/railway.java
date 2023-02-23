import java.util.Random;
import java.util.Scanner;
import javax.imageio.plugins.bmp.BMPImageWriteParam; 

class booking extends personal
{
    void bookmain()
    {
        Scanner gi = new Scanner(System.in);
        Random ramo = new Random();

        System.out.println("***** WELCOME TO ONLINE TICKET BOOKING PAGE *****");
        System.out.println(" Please Enter the name of the Traveling person  ");
        String name2;
        name2 = gi.nextLine();
        
        System.out.println("hi "+ name2);
        System.out.println(" Please Select the Railway Line ");
        System.out.println("1.Mumbai to Pune  2.Mumbai to chennai  3.Mumabi to Goa ");
        int cho4;
        cho4 = gi.nextInt();
        switch (cho4) {
            case 1:
            {
                System.out.println("Train On The Route from Mumbai To Pune  :-");
                System.out.println(" 1.Pune Express ");
                System.out.println(" 2.Decan Express");
                System.out.println(" 3.Intercity Express ");
                int cho5;
                cho5 =gi.nextInt();
                switch (cho5) 
                {
                    case 1:
                    {
                        System.out.println("The train you have select is Pune Express ");
                        System.out.println("Please enter the Date ");
                        String date1;
                        date1 = gi.nextLine();
                    
                        int ram1 = ramo.nextInt(50);
                        System.out.println("Name :- " + name2);
                        System.out.println("The Train you have select is  :- PUNE EXPRESS");
                        System.out.println("The Train Number is  :- 12548796");
                        System.out.println("Your Seat is   :-  " +ram1);
                        System.out.println("The train Date is :- " +date1);
                        System.out.println(" Thank You For Traveling with India Railway");
                        
                        break;
                    }
                    case 2:
                    {
                        System.out.println("The train you have select is Decan Express ");
                        System.out.println("Please enter the Date ");
                        String date2;
                        date2 = gi.nextLine();
                        
                        int ram2 = ramo.nextInt(50);
                        System.out.println("Name :- " + name2);
                        System.out.println("The Train you have select is  :- Decan Express");
                        System.out.println("The Train Number is  :- 12548789");
                        System.out.println("Your Seat is   :-  " +ram2);
                        System.out.println("The train Date is :- " +date2);
                        System.out.println(" Thank You For Traveling with India Railway");
                        
                        break;
                    }
                    case 3:
                    {
                        System.out.println("The train you have select is Intercity Express ");
                        System.out.println("Please enter the Date ");
                        String date3;
                        date3 = gi.nextLine();
                        
                        int ram3 = ramo.nextInt(50);
                        System.out.println("Name :- " + name2);
                        System.out.println("The Train you have select is  :- Intercity Epress");
                        System.out.println("The Train Number is  :- 12548754");
                        System.out.println("Your Seat is   :-  " +ram3);
                        System.out.println("The train Date is :- " +date3);
                        System.out.println(" Thank You For Traveling with India Railway");
                        
                        break;
                    }
                
                    default:
                    System.out.println("The train is not available");
                        break;
                }



                
                
                break;
            }
            case 2:
            {
                System.out.println("Train On The Route from Mumbai To Chennai  :-");
                System.out.println(" 1.Chennai Express ");
                System.out.println(" 2.Super fast chennai  Express");
                System.out.println(" 3.South Indian  Express Down Chennai ");
                int cho6;
                cho6 =gi.nextInt();
                switch (cho6) 
                {
                    case 1:
                    {
                        System.out.println("The train you have select is CHINNAI Express ");
                        System.out.println("Please enter the Date ");
                        String date4;
                        date4 = gi.nextLine();
                      
                        int ram4 = ramo.nextInt(50);
                        System.out.println("Name :- " + name2);
                        System.out.println("The Train you have select is  :- CHINNAI EXPRESS");
                        System.out.println("The Train Number is  :- 12548896");
                        System.out.println("Your Seat is   :-  " +ram4);
                        System.out.println("The train Date is :- " +date4);
                        System.out.println(" Thank You For Traveling with India Railway");
                        
                        break;
                    }
                    case 2:
                    {
                        System.out.println("The train you have select is SUPER FAST CHENNIA EXPRESS ");
                        System.out.println("Please enter the Date ");
                        String date5;
                        date5 = gi.nextLine();
                     
                        int ram5 = ramo.nextInt(50);
                        System.out.println("Name :- " + name2);
                        System.out.println("The Train you have select is  :- SUPER FAST CHEENAI EXPRESS");
                        System.out.println("The Train Number is  :- 12548789");
                        System.out.println("Your Seat is   :-  " +ram5);
                        System.out.println("The train Date is :- " +date5);
                        System.out.println(" Thank You For Traveling with India Railway");
                        
                        break;
                    }
                    case 3:
                    {
                        System.out.println("The train you have select is  :- SOUTH EXPRESS DOWN CHINNAI ");
                        System.out.println("Please enter the Date ");
                        String date6;
                        date6 = gi.nextLine();
                        int ram6 = ramo.nextInt(50);
                        System.out.println("Name :- " + name2);
                        System.out.println("The Train you have select is  :- SOUTH EXPRESS DOWN CHEENAI");
                        System.out.println("The Train Number is  :- 12548754");
                        System.out.println("Your Seat is   :-  " +ram6);
                        System.out.println("The train Date is :- " +date6);
                        System.out.println(" Thank You For Traveling with India Railway");
                        
                        break;
                    }
                
                    default:
                    System.out.println("The train is not available");
                        break;
                }



                
                break;
            }
                

            case 3:
            {
                System.out.println("Train On The Route from Mumbai To Goa  :-");
                System.out.println(" 1.Goa Express ");
                System.out.println(" 2.Super fast Goa  Express");
                System.out.println(" 3.West Indian  Express Down Goa ");
                int cho7;
                cho7 =gi.nextInt();
                switch (cho7) 
                {
                    case 1:
                    {
                        System.out.println("The train you have select is Goa Express ");
                        System.out.println("Please enter the Date ");
                        String date7;
                        date7 = gi.nextLine();
                       
                        int ram7 = ramo.nextInt(50);
                        System.out.println("Name :- " + name2);
                        System.out.println("The Train you have select is  :- GOA EXPRESS");
                        System.out.println("The Train Number is  :- 12548589");
                        System.out.println("Your Seat is   :-  " +ram7);
                        System.out.println("The train Date is :- " +date7);
                        System.out.println(" Thank You For Traveling with India Railway");
                        
                        break;
                    }
                    case 2:
                    {
                        System.out.println("The train you have select is SUPER FAST CHENNIA EXPRESS ");
                        System.out.println("Please enter the Date ");
                        String date8;
                        date8 = gi.nextLine();
                     
                        int ram8 = ramo.nextInt(50);
                        System.out.println("Name :- " + name2);
                        System.out.println("The Train you have select is  :- SUPER FAST GOA EXPRESS");
                        System.out.println("The Train Number is  :- 12545698");
                        System.out.println("Your Seat is   :-  " +ram8);
                        System.out.println("The train Date is :- " +date8);
                        System.out.println(" Thank You For Traveling with India Railway");
                        
                        break;
                    }
                    case 3:
                    {
                        System.out.println("The train you have select is  :- WEST EXPRESS DOWN GOA ");
                        System.out.println("Please enter the Date ");
                        String date9;
                        date9 = gi.nextLine();
                       
                        int ram9 = ramo.nextInt(50);
                        System.out.println("Name :- " + name2);
                        System.out.println("The Train you have select is  :- WEST EXPRESS DOWN GOA");
                        System.out.println("The Train Number is  :- 12548754");
                        System.out.println("Your Seat is   :-  " +ram9);
                        System.out.println("The train Date is :- " +date9);
                        System.out.println(" Thank You For Traveling with India Railway");
                        
                        break;
                    }
                
                    default:
                    System.out.println("The train is not available");
                        break;
                }


                
                break;
            }

        
            default:
               System.out.println("The Train is not Available on this Route");
                break;
        }

    }
}
class cancellation extends booking
{

     void canticket()
     {
        Scanner al = new Scanner(System.in);
        System.out.println(" Welcome to the cancellation Service of the Indian Railways ");
        System.out.println("Are you sure u want to cancel your ticket ?");
        System.out.println("1 . Yes");
        System.out.println("2 . No");

        int dec;
        dec=al.nextInt();
        
        if(dec == 1)
        {
            System.out.println(" Your train has been cancel ....");
            System.out.println("Thank You For Visiting Indian Railways....");
        }
        else
        {
            System.out.println(" Thank you for Traveling with Indian railways ");
        }


     }
}


class info
{
    void print()
    {
        System.out.println("** INDIAN RAILWAYS **");
        System.out.println("**** WELCOME TO RAILWAY BOOKING ****");
        System.out.println("# BOOK YOUR TICKET HERE #");
    }
    
}
class personal
{
    String name;
    double addharnumber;
    double loginid;
    void per1()
    {
        booking it = new booking();
        Scanner fi = new Scanner(System.in);
        cancellation yi = new cancellation();
        System.out.println("enter your name here as per addhar card ");
        name = fi.nextLine();
        System.out.println("enter your addhar card number ");
        addharnumber = fi.nextDouble();
        System.out.println("Enter the login id");
        loginid = fi.nextDouble();
        System.out.println(" HELLO "+ name +" welcome to online railways booking system "); 
        System.out.println("your Login id is  :- "+loginid);
        System.out.println("1.BOOK YOUR TICKET  2.cancellation of train ");
        int cho3;
        cho3 = fi.nextInt();
        switch (cho3) {
            case 1:

                it.bookmain();
                break;
                
                
            case 2:
                yi.canticket();
                
                break;
        
            default:
            System.out.println(" Enter the right value in the option box");
                break;
        }
    

    }

}
class user1
{
   int id;
   int pass;
   void log1()
   {
    System.out.println("PLEASE REGISTER YOURSELF AS ONLINE USER OF RAILWAY BOOKING ");
    System.out.println("******************");
    Scanner SC = new Scanner(System.in);
    System.out.println("PLEASE ENTER THE LOGIN ID ");
    id = SC.nextInt();
    System.out.println("PLEASE ENTER THE  PIN  ");
    pass = SC.nextInt();
    System.out.println("******************");
    System.out.println("your login Id is   = " +id);
    System.out.println("your Pin  is = " +pass);
    

   }

}
class user2 extends user1
{ 
   int check1;
   int finid;
   int finpass;
   String name;
   void log2()
   {
    personal ti = new personal();
    System.out.println("PLEASE ENTER YOUR LOGIN ID AND PIN ");
    System.out.println("******************");
    Scanner SC = new Scanner(System.in);  
    System.out.println("PLEASE ENTER THE LOGIN ID ");
    finid = SC.nextInt();
    System.out.println("PLEASE ENTER THE  PIN  ");
    finpass = SC.nextInt();
    if(finid == id && finpass == pass)
    { 
        ti.per1();
    }
    else
    {
      System.out.println(" ENTER THE RIGHT USER ID AND PIN");
    }
    
    
   }

}
public class railway 
{
    public static void main(String[] args) 
    {
        Scanner ed = new Scanner(System.in);
        info sc = new info();
        sc.print();
        user2 us = new user2();
        int cho1;
        System.out.println("******************");
        System.out.println("Are u already railway online booking user ???? ");
        System.out.println("1 .) YES ");
        System.out.println("2 .) NO ");
        System.out.println("3 .)Exit");
        cho1 = ed.nextInt();
    
    
        
 
     
        if(cho1 == 1)
        {
            us.log2();
        }
        else
        {
            us.log1();
            System.out.println("******************");
            System.out.println( " NOW PLEASE LOGIN TO BOOK THE TICKET ");
            us.log2();
            
            
        }
    
       
    
    
    
    
    }
}

