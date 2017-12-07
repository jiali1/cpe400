public class Cloud
{
	Cluster[] cluster;
	boolean dataSharing;
	boolean collaboration; 
	String type;
	
	/**
                * @brief Implementation of the Cloud constructor
                *          
                * @pre Assumes that the data members are unintialized
                *
                * @post data members are initialized with default values 
                *
                * @par Algorithm 
                *      dynamically allocates Cluster objects for Cluster data members.
		*      set their default voltages to 100000f. 
                * 
                */
	public Cloud( String name )
	{
		dataSharing = false;
		collaboration = false;
		cluster = new Cluster[3];
		type = name;
		
		System.out.println("Cloudtype: " + type);
		System.out.println("\n");
	
		cluster[0] = new Cluster("Las Vegas"); 
		cluster[1] = new Cluster("Reno");
		cluster[2] = new Cluster("Elko");

		cluster[0].setVoltage( 100000f ); 
		cluster[1].setVoltage( 100000f );
		cluster[2].setVoltage( 100000f );

		System.out.println("\n");
	}

	/**
                * @brief Implementation of setDataSharingOption function
                *          
                * @pre A boolean variable is passed through the parameter
                *
                * @post the data sharing flag is set
                *
                * @par Algorithm 
                *      Set the data sharing flag to the parameter boolean
                * 
                */
	public void setDataSharingOption( boolean flag )
	{
      		dataSharing = flag;
	}
   	
	/**
                * @brief Implementation of setCollaborationSharingOption function
                *          
                * @pre A boolean variable is passed through the parameter
                *
                * @post the colloboration sharing flag is set
                *
                * @par Algorithm 
                *      Set the Collaboration sharing flag to the parameter boolean
                * 
                */
	public void setCollaborationOption( boolean flag )
	{
      		collaboration = flag;
	}

	/**
                * @brief Implementation of getType function
                *          
                * @pre Assumes that the string type is initialized
                *
                * @post the type of the object is returned
                *
                * @par Algorithm 
                *      returns the string type of the object
                * 
                */
	public String getType( )
	{
		return type;
	}
}
