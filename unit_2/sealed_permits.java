public class sealed_permits {
    public static void main(String[] args){
        D d= new D();
        d.showD();d.showC();d.showA();
    }
}
sealed class A permits B ,C{
            A(){System.out.println("Class:A");}
            public void showA(){System.out.println("show(A)");}
}
final class B extends A{
    B(){System.out.println("Class B");}
    public void showB() {System.out.println("ShowB(B)");}
}
non-sealed class C extends A{
    C(){System.out.println("ClassC");}
    public void showC(){System.out.println("show(C)");}
}
class D extends C{
    D(){System.out.println("Class D");}
    public void showD(){System.out.println("show(D)");}
}
