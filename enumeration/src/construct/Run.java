package construct;

/**
 * Created by Mikalai_Churakou on 1/26/2017.
 */
public class Run {
    public static void main(String[] args) {
       for (Season s : Season.values()){
            s.print();
       }
    }

    enum Season{
        WINTER(1), SPRING(2){
            @Override
            public void print() {
                System.out.println(id);
            }
        }, SUMMER(3), AUTUMN(4),NU;

        public int id;

        public Season(int x){
            this.id = x;
        }

        public Season(){
            this.id = 1;
        }

        public void  print(){
            System.out.println("def");
        }
    }
}
