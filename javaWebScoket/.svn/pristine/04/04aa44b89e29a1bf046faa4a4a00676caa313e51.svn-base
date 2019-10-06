import java.util.concurrent.locks.ReentrantReadWriteLock;


public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     Station station1=new Station("窗口1");  
	      /*   Station station2=new Station("窗口2");  
	         Station station3=new Station("窗口3");  
	       
	        // 让每一个站台对象各自开始工作  
	         station1.start();  
	         station2.start();  
	         station3.start();  */
		     Thread ta = new Thread(station1,"窗口1");
		     Thread tb = new Thread(station1,"窗口2");
		     Thread tc = new Thread(station1,"窗口3");
		     ta.start();
		     tb.start();
		     tc.start(); 
		    /* ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
		     rwl.readLock().lock();*/
	}

}
