public class exp123
{
    private int x = 30;
    private int y = 40;
    public class Inner 
    {
        public void m2() 
        {
            System.out.println("Hello");
        }
    }
    public static void main(String[] args) 
    {
        exp123 outerObj = new exp123();
        exp123.Inner innerObj = outerObj.new Inner();
        innerObj.m2();
    }
}