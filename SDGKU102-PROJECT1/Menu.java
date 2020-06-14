import java.util.Scanner;

class Menu{
    
    public static void main(final String[] args) {
        //user choice(variable)
        int choice;
    //display menu  
    System.out.println("M e n u");
    System.out.println("===========");
    System.out.println("1.Tina Age:25");
    System.out.println("2.Nina Age:28");
    System.out.println("3.Trina Age:30");
    System.out.println("4.Exit");
    System.out.println("===========");
    System.out.print("Select your Designer");
    


    //setup scanner
    final Scanner in=new Scanner(System.in);
 
    //get choice from user
    choice=in.nextInt();

    //menu loop (allows user to keep making selection until they decide to leave)
    while(choice!=4){
    //display menu(again)
    System.out.println("M e n u");
    System.out.println("===========");
    System.out.println("1.Tina Age:25 Price:$500.00");
    System.out.println("2.Nina Age:28 Price:$1000.00");
    System.out.println("3.Trina Age:30 Price:$1500.00");
    System.out.println("4.Exit");
    System.out.println("===========");
    System.out.print("Select your Designer");

    //get choice from user (again)
    choice=in.nextInt();

    //check selection value
    if (choice==1) {
        System.out.println("1.Tina");   
        }
        else if (choice==2){
        System.out.println("2.Nina");
        }
        else if (choice==3){
        System.out.println("3.Trina");   
        }
        else if (choice==4){
        System.out.println("Thanks for stopping by,See you next time"); 

        }
    }
}
}  
       

        

    
    


      