public class Appliance 
{
		boolean controlLine;
		float voltageConsumption; 
		String type; 

		/**
                * @brief Implementation of the Appliance constructor
                *          
                * @pre Assumes that the data members are unintialized
                *
                * @post data members are initialized with default values 
                *
                * @par Algorithm 
                *      dynamically allocates data members with default values.
                * 
                */
		public Appliance( String name )
		{
			controlLine = true; 
			voltageConsumption = 0.0f;
			type = name;
		}
		
		/**
                * @brief Implementation of the SetVoltage function
                *          
                * @pre Assumes that the data member voltage Consumption exist
                *
                * @post data member voltage Consumption is set with the parameter
                *
                * @par Algorithm 
                *      set the voltageConsumption data member equal to the parameter
                * 
                */
		public void SetVoltage( float volt )
                {
			voltageConsumption = volt;
            	}
		
		/**
                * @brief Implementation of setControlLine function
                *          
                * @pre A boolean variable is passed through the parameter
                *
                * @post the control line flag is set
                *
                * @par Algorithm 
                *      Set the control line flag to the parameter boolean
                * 
                */
		public void SetControlLine( boolean control_line )
		{
			controlLine = control_line;
		} 

		/**
                * @brief Implementation of getVoltage function
                *          
                * @pre Assumes that the variable voltageConsumption is initialized
                *
                * @post the voltage of the object is returned
                *
                * @par Algorithm 
                *      returns the voltage of the object
                * 
                */
		public float GetVoltage( )
		{
			return voltageConsumption;
		}

		/**
                * @brief Implementation of GetControlLine function
                *          
                * @pre the data member controlLine exist
                *
                * @post the boolean of controlLine is returned
                *
                * @par Algorithm 
                *      returns the controlLine
                * 
                */
		public boolean GetControlLine( )
		{
			return controlLine;
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
