import java.util.concurrent.ThreadLocalRandom;  

public class Neighborhood
{
	Household[] household; 
	boolean commandCenterControlLine;
	float voltageConsumption; 
	String type; 

	/**
                * @brief Implementation of the Neighborhood constructor
                *          
                * @pre Assumes that the data members are unintialized
                *
                * @post data members are initialized with default values 
                *
                * @par Algorithm 
                *      dynamically allocates household objects for household data members.
		*      assign neighborhood type based on random number generation 0 - 2.  
                * 
                */
	public Neighborhood( String name )
	{ 
		commandCenterControlLine = true; 
		voltageConsumption = 0.0f; 
		household = new Household[5];
		type = name;
		int randomNum = ThreadLocalRandom.current().nextInt(0, 2 + 1);
		String[] str = {"DayHome", "NightHome", "24hourHome"};
		
		System.out.println("Neighborhoodtype: " + type);
		System.out.println("\n");

		for( int i = 0; i < 2; i++ ) 
		{
			randomNum = ThreadLocalRandom.current().nextInt(0, 2 + 1);
			household[i] = new Household(str[randomNum]);
		}
		for( int i = 2; i < 4; i++ )
		{
			randomNum = ThreadLocalRandom.current().nextInt(0, 2 + 1);
			household[i] = new Household(str[randomNum]);
		}
		for( int i = 4; i < 5; i++ )
		{
			randomNum = ThreadLocalRandom.current().nextInt(0, 2 + 1);
			household[i] = new Household(str[randomNum]); 
		}

		for( int i = 0; i < 5; i++ )
		{
			household[i].simulate( ); 
			setVoltage( getVoltage( ) + household[i].getTotalHouseVoltage( ) ); 
		}
		if( type.equals("Metropolitan District") )
		{
			setVoltage( getVoltage( ) * 2 );
		}
		else if( type.equals("Medium Income Families") )
		{
			setVoltage( getVoltage( ) / 2 );
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
		voltageConsumption = volt; 
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
		return voltageConsumption; 
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
