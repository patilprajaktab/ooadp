
package edu.scu.ooadp;


import edu.scu.oop.assign2.Smartoven;


public class SmartOvenApplication {

	public static void main(String args[])
	{

	
		 java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new Smartoven().setVisible(true);
	            }
	        });

}


}
