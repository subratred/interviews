package runners;

public class SyncBlock {
	public void runrunrun() {
		synchronized (Train.class) {
			System.out.println(Train.currentThread().getState());
			if(!(Train.currentThread().getState()== Thread.State.BLOCKED)) {
				for (int i = 0; i < 10; i++)
				{
					System.out.println(i);
					try
					{
						Thread.sleep(400);
					}
					catch (Exception e)
					{
						System.out.println(e);
					}
				}

			}
		}
	}

	public static void main(String[] args) {
		SyncBlock syncBlock = new SyncBlock();
		Train train1= new Train(syncBlock);
		Train train2= new Train(syncBlock);

		train1.start();
		train2.start();
		train1.start();
		train2.start();
		train1.start();
		train2.start();
		train1.start();
		train2.start();

	}

}
