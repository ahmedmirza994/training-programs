package OOP;

public class myRunnable implements Runnable {

	boolean isRunning=true;
    String name;

    public myRunnable(String name){
        this.name = name;
        System.out.println(name);
    }
    
    @Override
    public void run() {
        int count = 0;
        while (isRunning) {
            System.out.println(name + " : " + count);
            try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
            }
            count++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        
        myThread t = new myThread("t1"); 
        t.start();
        myThread t2 = new myThread("t2");
        t2.start();
        Thread.sleep(6000);
        t.isRunning=false;

        //runnable
        myRunnable r = new myRunnable("runnable");
        Thread tr = new Thread(r);
        tr.start();
    }

}
