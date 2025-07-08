package Polymorhpism;

public class Poly {

    public static void main(String[] args) {
        Parent P = new Parent();
        Child c = new Child();
       // c.show();
       // P.show();
        Parent p1 = new Child(); // object of parent class referring child class so with this type of reference we can access only the common methods present in both parent & child class by overriding the parent class
        p1.show();
        p1.Show2();//show1() in child class cannot be accessed as we're using object of parent class.with object of parent class in this type of reference we can access all parent class methods but not all Child class methods(which are not common in both Parent & Child class).
       // Child c1 = new Parent();//we cannot initialize object of child class referring to parent class unlike the above initialization.
       // c1.show();
    }
}
    class Parent{

        public void show(){
            System.out.println("Parent Class Method");
        }
        public void Show2(){
            System.out.println("Parent Class only");
        }
    }
    class Child extends Parent{

        public void show(){
            System.out.println("Child Class Method");
        }
        public void show1(){
            System.out.println("Child Class Only");
        }
    }


