
//Imports are listed in full to show what's being used'//could just import javax.swing.* and java.awt.* etc..
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Container;

public class SimpleCalc implements ActionListener{
	
	  JFrame guiFrame;
	    JPanel buttonPanel;
	      JTextField numberCalc;
	        int calcOperation = 0;
	          int currentCalc;
	            
	            //Note: Typically the main method will be in a
	            //separate class. As this is a simple one class
	            //example it's all in the one class.
	            public static void main(String[] args) {
	            	   
	            	       //Use the event dispatch thread for Swing components
	            	       EventQueue.invokeLater(new Runnable()
	            	    		          {
	            	    	              
	            	    	             @Override
	            	    	                        public void run()
	            	    	                        {
	            	    	            	                
	            	    	            	                new SimpleCalc();         
	            	    	            	                   
	            	    	                        }
	            	    		          })
	            }
}