package pack2;

import pack1.Parent;

public class Main {

    public static void main(String[] args) {

        Parent p = new Parent();
        p.showInsideClass();

        Child c = new Child();
        c.showAccess();
        c.showInterface();

        Other o = new Other();
        o.showAccess();
    }
}
