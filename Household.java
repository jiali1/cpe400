import java.lang.*;
import java.io.*;
import java.util.concurrent.ThreadLocalRandom;  

public class Household
{
	Appliance[] appliance;
	boolean houseControlLine;
	float voltageConsumption; 
	boolean solarHome; 
	String type;
	int time;
	
	/**
                * @brief Implementation of the Household constructor
                *          
                * @pre Assumes that the data members are unintialized
                *
                * @post data members are initialized with default values 
                *
                * @par Algorithm 
                *      dynamically allocates appliance objects for appliance data members.
                * 
                */	
	public Household( String name )
	{ 
		houseControlLine = true;
		voltageConsumption = 0.0f; 
		solarHome = false; 
		time = 0;
		type = name;
		appliance = new Appliance[4];
		
		
		appliance[0] = new Appliance("Laundry");
		appliance[1] = new Appliance("Air Conditioning");
		appliance[2] = new Appliance("Electronics");
		appliance[3] = new Appliance("LightBulbs");

		appliance[0].SetVoltage( 0.2f );
		appliance[1].SetVoltage( 0.1f );
		appliance[2].SetVoltage( 0.01f );
		appliance[3].SetVoltage( 0.05f );
	}
	
	/**
                * @brief Implementation of the pow function
                *          
                * @pre Assumes that v, c are passed through parameters
                *
                * @post the power of v^c is calculated
                *
                * @par Algorithm 
                *      utilize a for loop to multiply v for c times to 
		*      computer v^c.
                * 
                */
	public float pow( float v, float c )
	{
		for( int i = 0; i < c; i++ )
		{
			v = v * v;
		}
		return v;
	}

	/**
                * @brief Implementation of the simulate function 
                *          
                * @pre Assumes that the data members are intialized
                *
                * @post mathematical patterns are simulated
                *
                * @par Algorithm 
                *      dynamically simulates a 24 hour power consumption environment where the linear 
		*      function is assigned to 24-hour homes, power function for 
		*      night-focused homes, and exponential function for day-focused homes.
		*      Utilizes a random number generator to set the bounds for start and end time. 
                * 
                */
	public void simulate( )
	{
		System.out.println("Hometype: " + type);
		System.out.println("\n");
		int index = 0;
		boolean flag = true;
		int randomNum = ThreadLocalRandom.current().nextInt(0, 24 + 1);

		for( time = 0; time < 24; time++ )
		{
			if( type.equals("DayHome") )
			{
				if( time > randomNum && time < ( (randomNum + 8) % 24 ) )
				{
					appliance[0].SetVoltage( pow( index, 2.0f ) + appliance[0].GetVoltage( ) );
					appliance[1].SetVoltage( pow( index, 2.0f ) + appliance[1].GetVoltage( ) );
					appliance[2].SetVoltage( pow( index, 2.0f ) + appliance[2].GetVoltage( ) );
					appliance[3].SetVoltage( pow( index, 2.0f ) + appliance[3].GetVoltage( ) );
					voltageConsumption += appliance[0].GetVoltage( ); 
					voltageConsumption += appliance[1].GetVoltage( ); 
					voltageConsumption += appliance[2].GetVoltage( ); 
					voltageConsumption += appliance[3].GetVoltage( );
					index++;
				} 
			}
			else if( type.equals("NightHome") )
			{
				if( ( time > randomNum && time < ( (randomNum + 8) % 24 ) ) || 
				    ( time > 0 && time < ( (randomNum + 8) % 3 ) ) )
				{
					appliance[0].SetVoltage( pow( 2.0f, index ) + appliance[0].GetVoltage( ) );
					appliance[1].SetVoltage( pow( 2.0f, index ) + appliance[1].GetVoltage( ) );
					appliance[2].SetVoltage( pow( 2.0f, index ) + appliance[2].GetVoltage( ) );
					appliance[3].SetVoltage( pow( 2.0f, index ) + appliance[3].GetVoltage( ) );
					voltageConsumption += appliance[0].GetVoltage( ); 
					voltageConsumption += appliance[1].GetVoltage( ); 
					voltageConsumption += appliance[2].GetVoltage( ); 
					voltageConsumption += appliance[3].GetVoltage( ); 
					index++;
				}
			}
			else if( type.equals("24hourHome") )
			{
				index = ThreadLocalRandom.current().nextInt(0, 3 + 1);
				appliance[0].SetVoltage( appliance[0].GetVoltage( ) + index );
				appliance[1].SetVoltage( appliance[1].GetVoltage( ) + index );
				appliance[2].SetVoltage( appliance[2].GetVoltage( ) + index );
				appliance[3].SetVoltage( appliance[3].GetVoltage( ) + index );
				voltageConsumption += appliance[0].GetVoltage( ); 
				voltageConsumption += appliance[1].GetVoltage( ); 
				voltageConsumption += appliance[2].GetVoltage( ); 
				voltageConsumption += appliance[3].GetVoltage( ); 
			}
			System.out.println(voltageConsumption);
		}

		System.out.println("\n");

	}

	/**
                * @brief Implementation of setHouseControlLine function
                *          
                * @pre A boolean variable is passed through the parameter
                *
                * @post the control line flag is set
                *
                * @par Algorithm 
                *      Set the control line flag to the parameter boolean
                * 
                */
	public void setHouseControlLine( boolean HouseControl )
	{
		houseControlLine = HouseControl; 
	}
	
	/**
                * @brief Implementation of setSolarOptionfunction
                *          
                * @pre A boolean variable is passed through the parameter
                *
                * @post the solar option flag is set
                *
                * @par Algorithm 
                *      Set the solar option flag to the parameter boolean
                * 
                */
	public void setSolarOption( boolean solar )
	{
		solarHome = solar;
	}

	/**
                * @brief Implementation of getHouseControlLine function
                *          
                * @pre the data member houseControlLine exist
                *
                * @post the boolean of houseControlLine is returned
                *
                * @par Algorithm 
                *      returns the houseControlLine
                * 
                */
	public boolean getHouseControlLine( )
	{
		return houseControlLine; 
	}
	
	/**
                * @brief Implementation of getSolarOption function
                *          
                * @pre the data member solarHome exist
                *
                * @post the boolean of solarHome is returned
                *
                * @par Algorithm 
                *      returns the solarHome data member
                * 
                */
	public boolean getSolarOption( )
	{
		return solarHome;
	}
	
	/**
                * @brief Implementation of getTotalHouseVoltage function
                *          
                * @pre Assumes that the variable voltageConsumption is initialized
                *
                * @post the voltage of the object is returned
                *
                * @par Algorithm 
                *      returns the voltage of the object
                * 
                */
	public float getTotalHouseVoltage( )
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
