package enumeration;

/**
 * Created by mikalai on 1/18/2017.
 */
public class Run {
    public static void main(String[] args) {
        Object season = Season.WINTER;

        switch ((Season)season){
            case Season.SPRING:
                System.out.println("SP");
                break;
            case Season.WINTER:
                System.out.println("W");
            case Season.SUMMER:
                System.out.println("SU");
            case Season.AUTUMN:
                System.out.println("A");
            default:
                System.out.println("DEF");
        }
    }
    enum Season{
        WINTER, SPRING, SUMMER, AUTUMN;
    }


}
