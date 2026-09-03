public class nested_try {
    public static void main(String[] args){
        try{
            int a =2 ,b=0;
            int[] arr={1,2,3,4};
            System.out.println(arr[-5]);
            try{
                System.out.println(a/b);
            }
            catch(ArithmeticException ae){
                System.out.println(ae);
            }
        }
        catch(ArrayIndexOutOfBoundsException aei){
            System.out.println(aei);
        }
    }
}
