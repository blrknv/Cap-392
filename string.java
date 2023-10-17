public class string
{
    public static void main(String args[])
    {
        char[] chararray={'H','I','J','A','V','A'};
        byte[]ascii={65,66,67,68,69,70};
        String str="welcome";
        String str1=new String("Welcome to java");
        String str2=new String(chararray);
        String str3=new String(chararray,3,2);
        String str4=new String(ascii);
        String str5=new String(ascii,2,3);
        String str6=new String();
        String str7=new String(str);
        System.out.println("str = "+str);
        System.out.println("str1 = "+str1);
        System.out.println("str2 = "+str2);
        System.out.println("str3 = "+str3);
        System.out.println("str4 = "+str4);
        System.out.println("str5 = "+str5);
        System.out.println("str6 = "+str6);
        System.out.println("str7 = "+str7);
		str+="World";
		System.out.println("str = "+str);
    }
}