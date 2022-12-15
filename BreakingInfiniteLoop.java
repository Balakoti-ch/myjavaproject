public class BreakingInfiniteLoop {
    public static void main(String[] args) {
        /*for(int i=0;i>=0;i++);
        System.out.println("Loop decrementing by 5--->"+i);
         }*/
        //breaking the infinite loop
        for (int i = 0; i >= 0; i++) {
            System.out.println("Loop decrementing by 5--->" + i);
            if (i == 100) {
                break;
            }
        }
    }
}