
public class MyRunnable implements Runnable{
	
	 private Foo foo =new Foo();

	    public static void main(String[] args) {
	        MyRunnable r = new MyRunnable();
	        MyRunnable r2 = new MyRunnable();
	        Thread ta = new Thread(r,"Thread-A");
	        Thread tb = new Thread(r,"Thread-B");
	        
	        tb.start();
	        ta.start();
	    } 
	public  void run() {
	
		run2();
	}
	public synchronized void run2(){
		for (int i = 0; i < 3; i++) {
            this.fix(30);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " :当前foo对象的x值= " + foo.getX());
        } 
	}
	  public  int   fix(int y) {
	        return foo.fix(y);
	    } 
}
