package edu.scu.oop.assign2;

/** Alpha2Oven allows to Select Mode, that is bake or broil  & Starts only when food is placed
 * @author Prajakta Patil
 */
public class Alpha2Oven extends Alpha1Oven {

 /** Cooking mode can be either bake or broil */
	public enum CookingMode 
	{
		bake,broil;
	}
	private CookingMode currentMode ;

	/**  Default Constructor  */
	public Alpha2Oven()
	{	
		super();    
	}
	/**   Calls the method to set Temperture in Celsius in Thermostat    
	 * @param  temperature                  Temperture with degrees as parameter 
	 * 
	 * */
	public void setTemperatureInc( double temperature)
	{
		thermostat.setTemperatureInC(temperature);
		this.cookingTemp=(int) this.thermostat.getTemperatureInC();

	}

	/** Sets the Cooking mode 
	 * 
	 * @param Mode      Cooking Mode with Mode ( bake, broil) as parameter 
	 */

	public void setCookingMode(CookingMode Mode ) 
	{  
		
         this.currentMode=Mode;
	}



	/** Starts the oven */
	public void start()
	{   
		//this.cookingTemp= (int) this.thermostat.currentTemperture;
		this.cookingTemp=(int) this.thermostat.getTemperatureInF();
		if(this.cookingTemp==0 ) 
		{ 

			System.out.println("Cooking temperature is not  set"); 

		}
		else if(this.cookingTimeInMinutes==0  ){
			System.out.println("cooking time is not set"); 
		}

		else if(this.itemPlaced==false)
		{
			System.out.println("Item is not placed in the oven ,cann't start oven,Place Food & start the oven"); 

		}

		else if(this.currentMode== null)

		{
			System.out.println("Please select the mode & then Start the Oven"); 


		}
		else
		{
			this.st=status.on;

		}

	}

	
	public double getTempinC()
	{
		
		
		return this.thermostat.getTemperatureInC();
		
	}
	public double getTempinF()
	{
		
		return this.thermostat.getTemperatureInF();
	}
	

	/**Sets all the instance data members to default value */
	public void clear()
	{


		super.clear();
		this.currentMode=null;
	}

	/**  String saying whether Item is placedor not 
	 * returns the String*/	
	public String item()
	{

		if(this.itemPlaced)
		{
			return "yes";

		}
		else 
		{

			return "no";
		}
	}	

	/**  Displays the Status of the Oven , Cooking mode ,Current Temperture & whether food is placed or not */                               
	public void showOvenStatus()
	{           
//		super.showOvenStatus();
		// System.out.println("  ");
		if(this.st==status.on){

			if(this.cookingTemp==0 || this.cookingTimeInMinutes==0 )
			{
				System.out.println("Alpha2Oven is  "+this.st.toString());

			}
			else
			{
				System.out.println("Alpha2Oven is  "+this.st.toString());
				System.out.println("Oven 2 :--->cooking mode is  "+this.currentMode.toString());
				System.out.println("Oven 2 :--->Current Cooking Temperature in fahrenheit:"+thermostat.getTemperatureInF());
				System.out.println("Oven 2 :--->Current Cooking Tempearture is Celsius :" +this.thermostat.getTemperatureInC());
				System.out.println("Oven 2 :--->Food placed :"+item());
			}
		}
		else
		{
			System.out.println("Oven2 is off");


		}
	}



}

