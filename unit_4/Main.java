package unit_4;
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.Serializable;
import java.util.Arrays;
class ppppperson implements Serializable {
    private String name;
    private int age;
    private int marks[]=new int[20];
    public Person() {
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setMarks(int index,int mark){
        if(index>=0 && index<marks.length){
            marks[index]=mark;
        }
    }
    public int getMarks(int index){
        if(index>=0 && index<marks.length){
            return marks[index];
        }
        return 0;
    } 
    public void setMarks(int marks[]){
        this.marks=marks;
    }
    public int[] getMarks(){
        return marks;
    }

}

public class Main {
    public static void main(String[] args) throws IntrospectionException {
        Person p = new Person("Vishal", 25);
        System.out.println(p.getName() + " " + p.getAge());
        p.setName("Mohan");
        p.setMarks(1, 30);
        p.setMarks(new int[]{20,30,50,60});
        System.out.println(p.getName() + " " + p.getAge());
        System.out.println(Arrays.toString(p.getMarks()));

        BeanInfo info = Introspector.getBeanInfo(Person.class);
        PropertyDescriptor[] properties= info.getPropertyDescriptors();
        for (PropertyDescriptor pd : properties) {
        System.out.println(pd.getName());
        
    }
        

    }   
}