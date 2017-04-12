package bank;

/**
 * Created by Mikalai_Churakou on 4/8/2017.
 */
public class B

{

    public static <T> T foo(){

        try
        {
            return (T) new Integer(42);
        }
        catch (Exception e)
        {
            return (T) "error";
        }
    }

    public static void main(String[] args)
    {


//        B.foo();

//        String s = B.<String>foo();
        System.out.println(B.<String>foo());
    }
}
