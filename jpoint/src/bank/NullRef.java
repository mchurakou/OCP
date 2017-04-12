package bank;

/**
 * Created by Mikalai_Churakou on 4/8/2017.
 */
public class NullRef

{

    static String hello(){
        return "hello world";
    }
    public static void main(String[] args)
    {
        NullRef r = null;
        System.out.println(r.hello());
    }
}
