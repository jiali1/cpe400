public class Cluster
{
	Neighborhood[] neighborhood;
	float totalVoltageAvailable;

	public Cluster( )
	{
		neighborhood = new Neighborhood[10];
		totalVoltageAvailable = 100000f;
	}

	public void setVoltage( float volt )
	{
		totalVoltageAvailable = volt; 
	}
	
	public float getVoltage( )
	{
		return totalVoltageAvailable; 
	}
}
