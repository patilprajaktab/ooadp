package edu.scu.oop.assign2;
/**
Interface to Regulate values of temperture 
@author prajakta 
 */
public interface TempRegulator {
	/** Set temperature in Franheit 
	 * 
	 * @param temp    Temperature is in degrees
	 */
	void setTemperatureInF(double temp);
	
	/**Converts the temperature in Celsius to Fahrenheit and sets the current Temperture in Fahrenheit
    * @param temp  Temperature is in Degrees
	 */
	void setTemperatureInC(double temp);
	
	/**Returns the value of current Temperture in Fahrenheit
	 * */
    double getTemperatureInF();
	
    /** Converts & returns the value of current Temperture in Celsius */
	double getTemperatureInC();


}

