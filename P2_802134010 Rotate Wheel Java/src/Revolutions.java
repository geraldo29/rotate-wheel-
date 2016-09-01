import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * class to add the revolution counter 
 * @author geraldo
 *
 */
public class Revolutions extends JPanel{
	 static int temp =0;
	 static int counter1 =0,counter2=0,counter3=0,counter4=0,counter5=0,counter6=0,counter7=0;
     static JLabel[] number = new JLabel[7];
     static Font x = new Font("Arial", Font.PLAIN, 40);
     
   /**
    * constructor which creates the label 
    * @param o which will the number on the counter when it begins. 
    */
    public Revolutions(String o){
    	o = "0";
        int change=40;
        setLayout(null);
        for (int i = 0; i<number.length;i++)
            number[i] = new JLabel(o);
       
       
        	
            number[0].setSize(40, 60);
            number[0].setLocation(278,18);
            number[0].setFont(x);
            add(number[0]);
            setBackground(Color.WHITE);
           
          for (int i = 1; i<number.length;i++ )
          {
              number[i].setSize(40,60);
              number[i].setLocation(278 +change,18);
              number[i].setFont(x);
              change +=40;
              add(number[i]);
          }
    }
    	/**
    	 * methods that increments the counter of the revolutions. 
    	 */
          public static void incrementCounter(){
        	  
        	  
        	 
        	  counter7++;
        	  number[6].setText("" + counter7);
        	  if (counter7 >9){
        		  counter7 =0;
        		  number[6].setText("" + counter7);
        		  counter6++;
        		  number[5].setText(""+counter6);
        		  		if (counter6>9){
        		  			counter6=0;
        		  			number[5].setText("" + counter6);
        		  			counter5++;
        		  			number[4].setText(""+counter5);
        		  			
        		  			if (counter5>9){
            		  			counter5=0;
            		  			number[4].setText(""+counter5);
            		  			counter4++;
            		  			number[3].setText(""+counter4);
            		  			
            		  			if (counter4>9){
                		  			counter4=0;
                		  			number[3].setText(""+counter4);
                		  			counter3++;
                		  			number[2].setText(""+counter3);
                		  			if (counter3>9){
                    		  			counter3=0;
                    		  			number[2].setText(""+counter3);
                    		  			counter2++;
                    		  			number[1].setText(""+counter2);
                    		  			
                    		  			if (counter2>9){
                        		  			counter2=0;
                        		  			number[1].setText(""+counter2);
                        		  			counter1++;
                        		  			number[0].setText(""+counter1);
                        		  			if (counter1>9){
                        		  				counter1=9;
                          		          	  number[0].setText("" + counter1);

                        		  				counter2=9;
                          		          	  number[1].setText("" + counter2);

                        		  				counter3=9;
                          		          	  number[2].setText("" + counter3);

                        		  				counter4=9;
                          		          	  number[3].setText("" + counter4);

                        		  				counter5=9;
                          		          	  number[4].setText("" + counter5);

                        		  				counter6=9;
                          		          	  number[5].setText("" + counter6);

                        		  				counter7=9;
                        		          	  number[6].setText("" + counter7);

                        		  				
                        		  			}
                    		  			}
                    		  			
                		  			}
            		  			}
            		  			
        		  			}
        		  		}
        		  		
        	  }
          }
 	
    
    
    			
    		
    		
    		
    
    
    
   
        
    }