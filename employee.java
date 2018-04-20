
package encap;
import java.util.Scanner;

public class employee {
  
public static String id;
public static String name;
public static String position;
public static double salary;
public static double taxrate;
public static double tax;
public static double balance;

public void getemployeedetail(){

    Scanner a = new Scanner(System.in);
    System.out.print("id : ");
    id = a.nextLine();
    
    Scanner b = new Scanner(System.in);
    System.out.print("name : ");
    name = b.nextLine();
    
    Scanner c = new Scanner(System.in);
    System.out.print("position : ");
    position = c.nextLine();
    
    Scanner d = new Scanner(System.in);
    System.out.print("salary : ");
    salary = d.nextDouble();
    
    }


public static double Calculate(double x){

        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter TaxRate >> ");
        tax = sc.nextDouble();
    
        if(salary<=20000){
                taxrate = salary*tax;
        }
        else{
                taxrate = salary*2*tax;
         }

         balance = salary-taxrate;
         return taxrate;
}   


}
