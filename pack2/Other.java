package pack2;

import pack1.Parent;

public class Other {

    public void showAccess() {
        Parent p = new Parent();

        System.out.println("\nOther class in different package:");
        System.out.println("Public    : " + p.publicVar);
    }
}
