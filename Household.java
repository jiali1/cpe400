public class Household
{
	Appliance[] appliance;
	boolean houseControlLine;
	boolean houseDataLine;
	float voltageConsumption; 
	boolean solarHome; 

	public Household( )
	{
		appliance = new Appliance[100]; 
		houseControlLine = false;
		houseDataLine = false; 
		voltageConsumption = 0.0f; 
		solarHome = false; 
	}

	public void setHouseControlLine( boolean HouseControl )
	{
		houseControlLine = HouseControl; 
	}
	
	public void setHouseDataLine( boolean HouseData )
	{
		houseDataLine = HouseData; 
	}

	public void setSolarOption( boolean solar )
	{
		solarHome = solar;
	}

	public boolean getHouseControlLine( )
	{
		return houseControlLine; 
	}
	
	public boolean getHouseDataLine( )
	{
		return houseDataLine; 
	}

	public boolean getSolarOption( )
	{
		return solarHome;
	}
	public float getTotalHouseVoltage( )
	{
		for( int index = 0; index < 100; index++ )
		{
			voltageConsumption += appliance[index].GetVoltage( );
		}
 		return voltageConsumption; 
	}
}
