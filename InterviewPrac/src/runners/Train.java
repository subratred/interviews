package runners;

class Train extends Thread
{
    // Reference variable of type Line.
	SyncBlock syncBlock;
  
    Train(SyncBlock syncBlock)
    {
        this.syncBlock = syncBlock;
    }
  
    @Override
    public void run()
    {
    	syncBlock.runrunrun();
    }
}