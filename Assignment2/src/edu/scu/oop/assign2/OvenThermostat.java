package edu.scu.oop.assign2;

public class OvenThermostat implements TempRegulator {
	double currentTemperture;


	public void setTemperatureInF( double degreesF)
	{
		this.currentTemperture=degreesF;	

	}
	public void setTemperatureInC( double degreeC)
	{
		degreeC= ((degreeC*1.8)+32); 
		this.currentTemperture =degreeC;	
	}
	public double getTemperatureInF()
	{
		return this.currentTemperture;
	}
	public double getTemperatureInC()
	{
		return (double)((this.currentTemperture-32)/1.8); 
	}

}
