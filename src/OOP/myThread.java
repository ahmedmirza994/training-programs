package OOP;

public class myThread extends Thread {
    
    boolean isRunning=true;
    String name;

    public myThread(String name){
        this.name = name;
        System.out.println(name);
    }
    
    @Override
    public void run() {
        display();
    }

    public void display() {
        int count = 0; 
        while (count < 9) {
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
        //t.join();
        myThread t2 = new myThread("t2");
        t2.start();
        Thread.sleep(6000);
        t.isRunning=false;
    }
}
