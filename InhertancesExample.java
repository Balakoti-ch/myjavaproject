public class InhertancesExample {
    private int j=20;
    {
        System.out.println("non Static");
    }
    public void m1()
    {
        System.out.println("non Static method");
    }
    InhertancesExample()
    {
        System.out.println("constructor");
    }
    public static void main (String[]args) {
        InhertancesExample n = new InhertancesExample();
        n.m1();
        System.out.println(n.j);
    }
}
