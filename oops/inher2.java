package oops;
public class inher2 {
    public static void main(String[] args){
        C c=new C();
        c.show();
    }
}
class A{
    A(){
        System.out.println("inside constructor of a");
    }
    public void show(){
        System.out.println("class a");
    }
}
class B extends A{
    B(){
        super();
        System.out.println("inside constructor b");
    }
    public void show(){
        System.out.println("class b");
        super.show();
    }
}
class C extends B{
    C(){
        super();
        System.out.println("inside constructor c");
    }
    public void show(){
        System.out.println("class c");
        super.show();
    }
}