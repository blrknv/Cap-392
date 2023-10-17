interface Printable
{
    void print();
}
interface Showable extends Printable
{
    void show ();
}
class TestInterface4 implements Showable{
    public void print()
    {System.out.println("Krishnadas");
}
public void show()
{System.out.println("Mony");
}
public static void main(String args[]) {
    TestInterface4 obj =new TestInterface4();
    obj.print();
    obj.show();
}
}