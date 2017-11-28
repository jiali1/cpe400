public class Neighborhood
{
	Household[] household; 
	boolean commandCenterControlLine;
	boolean commandCenterDataLine;
	float voltageAvailable; 

	public Neighborhood( )
	{
		household = new Household[100]; 
		commandCenterControlLine = false; 
		commandCenterDataLine = false; 
		voltageAvailable = 20000f; 
	}
	
	public void setCL( boolean commandCL )
	{
      		commandCenterControlLine = commandCL;
	}
	
	public void setDL( boolean commandDL )
	{
		commandCenterDataLine = commandDL;
	}
	
	public void setVoltage( float volt )
	{
		voltageAvailable = volt; 
	}

        public float getVoltage( )
	{
		return voltageAvailable; 
	}
}
