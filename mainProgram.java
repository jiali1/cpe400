import javax.swing.*;
import java.io.*; 
import java.awt.*; 

public class mainProgram 
{
	Cloud company1, company2; 
	
	/**
                * @brief Implementation of the main function
                *          
                * @pre None
                *
                * @post A main program is dynamically generated. 
                *
                * @par Algorithm 
                *      dynamically allocates a main program object for main.
                * 
                */
	public static void main( String[] args )
	{
		mainProgram main = new mainProgram( );
	}
	
	/**
                * @brief Implementation of the mainProgram constructor
                *          
                * @pre Assumes that all data members are uninitialized
                *
                * @post All data members are now initialized
                *
                * @par Algorithm 
                *      dynamically allocates Cloud objects to the Cloud 
		*      data members with string parameters. 
                * 
                */
	public mainProgram( )
	{ 
		company1 = new Cloud("NVEnergy");
		company2 = new Cloud("Berke-Hathaway Company");
	}
}
