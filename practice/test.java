
import java.util.*;

class test{
    public static void main(String[] args) {
        ArrayList<String> fruits= new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter fruits");
        for(int i=0;i<4;i++){
            String fruit=sc.nextLine();
            fruits.add(fruit);
        }
        System.out.println(fruits.get(3));
        System.out.println(fruits);
        System.err.println("after removal "+fruits.remove("apple"));
        System.out.println(fruits);
        System.err.println("does it contain banana: "+fruits.contains("banana"));
        System.out.println("file size "+fruits.size());
        
    }
}