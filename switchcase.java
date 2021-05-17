import java.util.*;
public class switchcase {
       public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
           System.out.println("Welcome to Our's Cafe:"+ "\n"+"What would you like to drink?:");
           System.out.println("please select 1 for Coffe, 2 for milk, 3 for Tea and 4 for Cold-Coffee");

           int answer = input.nextInt();

           switch (answer) {
               case 1:
                   System.out.println("Coffee");
                   
                   break;
               case 2:
                   System.out.println("Milk"); 
                   break;
               case 3:
                   System.out.println("Tea"); 
                   break;
                case 4:
                    System.out.println("Cold-Coffee");   
               default:
                   System.out.println("Please Select from option");  
                   break;
           }
       } 
}
