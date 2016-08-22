package threads.ch1.demo3;

/**
 * Created by sukanta on 8/13/16.
 */
public class SimpleThreadMain {

    public static void main(String args[]) {
        Thread t1 = new Thread (new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i <10 ; i++) {
                    System.out.println("Hello " + i );
                }
                try {
                    Thread.sleep(10);
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }

        });


        Thread t2 = new Thread (new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i <10 ; i++) {
                    System.out.println("Hello " + i );
                }
                try {
                    Thread.sleep(10);
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }

        });

        t1.start();
        t2.start();
    }
}
