import java.lang.Thread;
public class Multithreading extends Thread {
    private int n ;
    public Multithreading(int x){
         n = x;
    }
    public void run(){
          if (n <= 10) {
             try{
                for(int i = 0;i<= n;i++){
                    System.out.println(i);
                    Thread.sleep(500);
                }
            }
              catch(Exception e){
                System.out.println(e.getMessage());
              } 
          }
          else{
            try{
                for(int i = 10;i<= n;i++){
                    System.out.println(i);
                    Thread.sleep(1000);
                }
            }
              catch(Exception e){
                System.out.println(e.getMessage());
              } 
          }
    }
    public static void main(String [] args){
        Multithreading t1 = new Multithreading(10);
        t1.start();
        Multithreading t2 = new Multithreading(20);
        t2.start();
        

    }
}

