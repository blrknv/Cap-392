public class outerclass {
    private int x=10;
    private static int y=10;
    class inner{
        public void ml()
        {
            System.out.println("inheritance variable..."+x+",static variable..."+y)

        }
    }
    public static void main(string[] args){
        outerclass o=new outerclass();
        outerclass.inner in=o.new inner();
        in.ml();

    }
}
