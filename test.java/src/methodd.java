class A {
    public void show1() {
        System.out.println("hey");
    }

}

class B extends A {
    public void show2() {
        System.out.println("hmm");
    }

}

public class methodd {
    public static void main(String[] args) {
        double d = 4.5;
        int i = (int) d; // this is typecasting
        // System.out.println(i);
        // -------------------------------------------------------
        A obj = new B(); // THIS IS CALLED UPCASTING.
        obj.show1();

        B obj2 = (B) obj;
        obj2.show2(); // this is called DOWNCASTING.

        // ---------------------------------------------
        car objCar = new car() {

            public void fly() {
                System.out.println("flying");
            }
            // annyonmous inner class.
            public void drive() {
                System.out.println("bmw driving");
            }
        };
        objCar.drive();
        objCar.music();
        objCar.fly();
    }
}

// abstract method ]] we can have abostract method only in abstract class.
// we can't create object of abstract class.
abstract class car {
    public abstract void drive(); // abstract class can have normal method too.

    public abstract void fly();

    public void music() {
        System.out.println("play music");
    }
}
// normal way to create class for abstract methods to use below

// class bmw extends car { // we can create object of concreate class only. not
// of abstarct class
// public void fly() {
// System.out.println("flying");
// }

// public void drive() {
// System.out.println("bmw driving");
// }

// }
