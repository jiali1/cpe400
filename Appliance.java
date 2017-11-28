public class Appliance 
{
		boolean controlLine;
		boolean dataLine;
		float voltage; 

		public Appliance( )
		{
			controlLine = false; 
			dataLine = false; 
			voltage = 0.0f; 
		}
		
		public void SetVoltage( float volt )
                {
			voltage = volt;
            	}
		public void SetControlLine( boolean control_line )
		{
			controlLine = control_line;
		}
  		public void SetDataLine( boolean data_line )
		{
			dataLine = data_line;
		} 

		public float GetVoltage( )
		{
			return voltage;
		}
		public boolean GetControlLine( )
		{
			return controlLine;
		}
  		public boolean GetDataLine( )
		{
			return dataLine;
		}
		
}
