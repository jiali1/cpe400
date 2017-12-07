import java.util.concurrent.ThreadLocalRandom; 

public class Cluster
{
	Neighborhood[] neighborhood;
	float totalVoltageAvailable, totalVoltageConsumption;
	boolean commandCenterControlLine;
	String type; 

	/**
                * @brief Implementation of the Cluster constructor
                *          
                * @pre Assumes that the data members are unintialized
                *
                * @post data members are initialized with default values 
                *
                * @par Algorithm 
                *      dynamically allocates Neighborhood objects for Neighborhood data members.
		*      assign neighborhood type based on random number generation 0 - 2.  
                * 
                */
	public Cluster( String name )
	{
		totalVoltageAvailable = 100000f;
		totalVoltageConsumption = 0.0f;
		neighborhood = new Neighborhood[5];
		type = name;
		int randomNum = ThreadLocalRandom.current().nextInt(0, 2 + 1);
		String[] str = {"Metropolitan District", "Upper Income Families", "Medium Income Families"};

		System.out.println("Clustertype: " + type);
		System.out.println("\n");

		neighborhood[0] = new Neighborhood("Metropolitan District");
		for( int index = 1; index < 3; index++ )
		{
			randomNum = ThreadLocalRandom.current().nextInt(0, 2 + 1);
			neighborhood[index] = new Neighborhood(str[randomNum]);
		}
		for( int index = 3; index < 5; index++ )
		{
			randomNum = ThreadLocalRandom.current().nextInt(0, 2 + 1);
			neighborhood[index] = new Neighborhood(str[randomNum]);
		}
		for( int index = 0; index < 5; index++ )
		{
			totalVoltageConsumption += neighborhood[index].getVoltage( );
		}

		if( totalVoltageAvailable < totalVoltageConsumption )
		{
			setCL( false );
		}

		System.out.println("\n");
	}

	/**
                * @brief Implementation of setCL function
                *          
                * @pre A boolean variable is passed through the parameter
                *
                * @post the control line flag is set
                *
                * @par Algorithm 
                *      Set the control line flag to the parameter boolean
                * 
                */
        public void setCL( boolean commandCL )
	{
      		commandCenterControlLine = commandCL;
	}

	/**
                * @brief Implementation of setVoltage function
                *          
                * @pre A boolean variable is passed through the parameter
                *
                * @post the voltage variable is set
                *
                * @par Algorithm 
                *      Set the voltage available to the parameter float
                * 
                */
	public void setVoltage( float volt )
	{
		totalVoltageAvailable = volt; 
	}
	
	/**
                * @brief Implementation of getVoltage function
                *          
                * @pre Assumes that the variable voltage is initialized
                *
                * @post the voltage of the object is returned
                *
                * @par Algorithm 
                *      returns the voltage of the object
                * 
                */
	public float getVoltage( )
	{
		return totalVoltageAvailable; 
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
