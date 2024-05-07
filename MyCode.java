   import java.util.Scanner;
public class Main{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
System.out.println("Enter temperature");
int temp = input.nextInt();
if(temp>37){
System.out.println("It is very hot today");
System.out.println("Stay inside");
}
else if(temp >=20 && temp<= 36){
System.out.println("The temperature is good today");
System.out.println("Go outside");
}
else{
    System.out.println("The temperature is cold today put on your pull over");
     }
   }
 }





    