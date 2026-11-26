package unit_4;
import java.io.Serializable;

class Person implements Serializable {
    private String name;
    private int age;
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
    public String toString() {
        return "Person[name=" + name + ", age=" + age + "]";
    }
}

