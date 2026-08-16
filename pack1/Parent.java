package pack1;

public class Parent {

    private int privateVar = 10;
    int defaultVar = 20;
    protected int protectedVar = 30;
    public int publicVar = 40;

    public void showInsideClass() {
        System.out.println("Inside same class:");
        System.out.println("Private   : " + privateVar);
        System.out.println("Default   : " + defaultVar);
        System.out.println("Protected : " + protectedVar);
        System.out.println("Public    : " + publicVar);
    }
}
