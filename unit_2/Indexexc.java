import java.util.Scanner;

public class Indexexc {
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        Scanner sc= new Scanner(System.in);
        String s="abc";
        System.out.println("n:");
        
        try{
        int n =sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
            
        }
        for(int i=0;i<n;i++){
            System.out.println(s.charAt(i));
        }}
        catch(Exception e){
            System.out.println(e);
        }

    }
}
