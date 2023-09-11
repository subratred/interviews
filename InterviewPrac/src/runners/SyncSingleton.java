package runners;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class SyncSingleton implements Callable<SyncSingleton>{
	private static volatile SyncSingleton syncSingleton= null;
	private SyncSingleton() {};
	public static SyncSingleton getSyncSingleton() {
		if(syncSingleton==null) {
			synchronized (SyncSingleton.class) {
				if(syncSingleton==null) {
					syncSingleton=new SyncSingleton();
				}
			}
		}
		//System.out.println(syncSingleton.hashCode());
		return syncSingleton;
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//System.out.println(SyncSingleton.getSyncSingleton());
		/*
		 * Thread thread= new Thread(); Thread thread2= new Thread(); thread.start();
		 * thread2.start();
		 */
		FutureTask[] randomNumberTasks = new FutureTask[5];
		for (int i = 0; i < 5; i++)
	    {
	      Callable callable = new SyncSingleton();
	      randomNumberTasks[i] = new FutureTask(callable);
	      Thread t = new Thread(randomNumberTasks[i]);
	      t.start();
	    }
		for (int i = 0; i < 5; i++)
	    {
	      System.out.println(randomNumberTasks[i].get().hashCode());
	    }
	  
	}
	@Override
	public SyncSingleton call() throws Exception {
		return getSyncSingleton();
	}
	

}
