package luxoft;

/**
 * Created by Mikalai_Churakou on 4/8/2017.
 */
public class MyClass {

    static class Logger {
        Class c;

        public Logger(Class c)
        {
            this.c = c;
        }

        void log(String s){
            System.out.println(c.getSimpleName() + ": " + s);
        }

        void er(String s){
            System.err.println(c.getSimpleName() + ": " + s);
        }
    }

    private static Logger getLoggr(Class c){
        return new Logger(c);
    }

    enum MyEnum{
        INSTANCE;
        private static final Logger logger = getLoggr(MyEnum.class);

        MyEnum()
        {
            try{
                throw new NullPointerException();
            } catch (Exception e){
//                logger.er(e.getMessage());
            }

        }
    }


    public static void main(String[] args) {

        getLoggr(MyClass.class).log(MyEnum.INSTANCE.toString());
    }
}
