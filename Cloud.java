public class Cloud
{
	Cluster[] cluster;
	boolean dataSharing;
	boolean collaboration; 
	
	public Cloud( )
	{
		cluster = new Cluster[5];
		dataSharing = false;
		collaboration = false;
	}

	public void setDataSharingOption( boolean flag )
	{
      		dataSharing = flag;
	}
   	
	public void setCollaborationOption( boolean flag )
	{
      		collaboration = flag;
	}
}
