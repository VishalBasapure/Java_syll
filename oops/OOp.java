package oops;
class OOp {

    public static void main(String[] args) {
        horse h1 = new horse();
        horse h2 = new horse("lucy", 12);
        horse h3 = new horse("max", "white", 10, 101);

        h1.setAge(30);

        h1.display();
        h2.display();
        h3.display();
    }
}

class horse {
    private String name, color;
    private int age, code;

    horse() {
    }

    horse(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    horse(String name, String color, int age, int code) {
        this.setName(name);
        this.setColor(color);
        this.setAge(age);
        this.setCode(code);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public int getCode() {
        return code;
    }

    public void display() {
        System.out.println(name);
        System.out.println(color);
        System.out.println(age);
        System.out.println(code);
        System.out.println(this);
    }
}