import java.util.concurrent.locks.ReentrantReadWriteLock;


public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     Station station1=new Station("����1");  
	      /*   Station station2=new Station("����2");  
	         Station station3=new Station("����3");  
	       
	        // ��ÿһ��վ̨������Կ�ʼ����  
	         station1.start();  
	         station2.start();  
	         station3.start();  */
		     Thread ta = new Thread(station1,"����1");
		     Thread tb = new Thread(station1,"����2");
		     Thread tc = new Thread(station1,"����3");
		     ta.start();
		     tb.start();
		     tc.start(); 
		    /* ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
		     rwl.readLock().lock();*/
	}

}
