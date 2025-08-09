package day3.java;

class Person {

}

class Student extends Person {

}

public class InstanceOf{
    public static void main(String[] args) {
        Person p1 = new Student();  
        Person p2 = new Person();   

        if (p1 instanceof Student) {
            System.out.println("p1 is a Student");
        }
        if (p2 instanceof Student) {
            System.out.println("p2 is a Student");
        } else {
            System.out.println("p2 is NOT a Student");
        }
    }
}