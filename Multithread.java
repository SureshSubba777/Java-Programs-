import java.lang.Thread;
public class Multithread extends Thread {
    private int n;
    private String name;
    Multithread (int x, String name){
        n = x;
        this.name = name;
    }
    public void run(){
        try{
        for (int i = 0; i<=n; i++){
            System.out.print(this.name+": ");
            System.out.print(i);
            System.out.println();
           
        }}
        catch(Exception e){

        }
    }
    public static void main(String[] args) {
        Multithread t1 = new Multithread(10,"t1");
        Multithread t2 = new Multithread(10,"t2");
        Multithread t3 = new Multithread(10,"t3");
      
        t1.setPriority(1);
        t2.setPriority(5);
        t3.setPriority(10);
        t1.start();
        t2.start();
        t3.start();
        
        
    }
        
}
