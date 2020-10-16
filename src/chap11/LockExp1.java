package chap11;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExp1 {
 
	
	void m1() {
		Lock lock=new ReentrantLock();
		lock.lock();
		try {
			
		}finally {
			lock.unlock();
		}
		
	}
}
