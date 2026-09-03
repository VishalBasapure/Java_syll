import java.util.*;/**
 * DatabaseConnection
 */
public class DatabaseConnection {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
    try{
        int a =sc.nextInt(),b=sc.nextInt();
        System.out.println("Q="+(a/b));
    }
    catch(ArithmeticException ae){
        System.out.println("AE occured");
        System.out.println(ae);
    }
    catch(InputMismatchException ime){
        System.out.println("Ime occured");
        System.out.println(ime);
    }
 }
    
}