//Coen 275
package edu.scu.oop.assign2;

import java.text.SimpleDateFormat;
import java.util.Date;
/** Alpha1Oven allows to set Temperature & Time
 * @author Prajakta Patil
 * 
 * @version Assignment2 build Jan 30, 2015
 *
 */
public class Alpha1Oven {

	/**Oven can be either On or OFF */ 
	public enum status{
		on ,off
	}

	protected int cookingTemp;
	protected int cookingTimeInMinutes;
	protected OvenThermostat thermostat= new OvenThermostat();
	protected long startTime;
	protected boolean itemPlaced;
	protected status st ;

	/**  Default Constructor  */
	public Alpha1Oven() {
		this.st=status.off;
		itemPlaced=false;
		cookingTemp=0;
		cookingTimeInMinutes=0;
		thermostat.currentTemperture=0;

	}

	/**  Set the oven status to default value ,off */
	public void turnOff()
	{
		this.st=status.off;
	}

	/**Starts the Oven*/
	public void start()
	{   
		this.cookingTemp= (int) thermostat.getTemperatureInF();

		if(this.cookingTemp==0 ) {
			System.out.println("Oven1's cooking temperatureis not set ");
		} 

		else if (this.cookingTimeInMinutes==0  )
		{
			System.out.println("Oven1's cooking time is not set"); 
		}


		else {    
			this.st=status.on;
		}

	}

	/** Calls the method set Temperature in Thermostat with  temperature  as a parameter  
	 * @param temp                  Temperature with degrees as parameter
	 */
	public void setTemperature( double temp)
	{   
		thermostat.setTemperatureInF(temp);
	}

	/**  Sets the Cooking time 
	  @param cooking             Time in minutes 
	 */
	public void setTime( int cooking){


		this.cookingTimeInMinutes=cooking;
		this.startTime=System.currentTimeMillis(); 

	}
	/**  Sets the Place food value as true */

	public void placeFood()
	{
		this.itemPlaced=true;
	}

	/** Sets all the Instance data members to default value */
	public void clear()
	{
		this.st=status.off;
		this.itemPlaced=false;
		this.cookingTemp=0;
		this.cookingTimeInMinutes=0;
		this.thermostat.currentTemperture=0;
	}

	/** Displays the Start time and Stop time  */
	public void time() {
		System.out.println("Start Time is :"+new SimpleDateFormat("HH:mm:ss").format(new Date(this.startTime)));
		System.out.println("Stop Time is :"+new SimpleDateFormat("HH:mm:ss").format(new Date(this.startTime+(this.cookingTimeInMinutes*60*1000))));
	}

	/**  Displays the Status of the oven , i.e Whether the Oven is ON or OFF ,Current temperature in Farenheit and Start & Stop Time  */
	public void showOvenStatus()
	{  
		if(this.st==status.on){
			if(this.cookingTemp==0 || this.cookingTimeInMinutes==0)
			{
				System.out.println("Alpha1Oven is "+this.st.toString());

			}
			else
			{
				System.out.println("Alpha1Oven is "+this.st.toString());
				System.out.println("Current Cooking Temperature in fahrenheit:"+this.cookingTemp);
				time();

			}
		}
		else
		{
			System.out.println("Oven1 is off");
		}
	}


}

