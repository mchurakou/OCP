package init;

import javax.annotation.processing.SupportedAnnotationTypes;

/**
 * Created by mikalai on 2/6/2017.
 */
public class Run {

    public static void main(String[] args) {
        System.out.println(Season.SPRING);
    }

    enum Season{

        WINTER(1), SPRING(2), SUMMER(3), AUTUMN(4);

        Season(int x){
            System.out.println(x);
        }




    }
}
