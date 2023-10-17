class Base {
    int num1;

    void baseShow() {
        System.out.println("num1 = " + num1);
    }
}

class Derived extends Base {
    int num2;

    void product() {
        System.out.println("Product = " + (num1 * num2));
    }

    void driveShow() {
        System.out.println("num2 = " + num2);
    }
}

public class InheritDemo {
    public static void main(String[] args) {
        Derived derivedObject = new Derived();
        derivedObject.num1 = 5;
        derivedObject.num2 = 10;

        derivedObject.baseShow();
        derivedObject.product();
        derivedObject.driveShow();
    }
}
