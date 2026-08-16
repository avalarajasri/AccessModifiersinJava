package pack2;

import pack1.Parent;
import pack1.MyInterface;

public class Child extends Parent implements MyInterface {

    public void showAccess() {
        System.out.println("\nSubclass in different package:");

        System.out.println("Protected : " + protectedVar);
        System.out.println("Public    : " + publicVar);
    }

    public void showInterface() {
        System.out.println("Interface method is accessible and implemented.");
    }
}
