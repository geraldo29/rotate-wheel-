import java.awt.BorderLayout;                       
import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent; 
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

/**@author geraldo
 * Class where we run the frame and make the whole project work. This project simulates a car and we rotate a wheel gas and we can see the speedometer of the car. 
 * 
 */
public class RotateWheelFrame implements MouseListener,MouseMotionListener{
	
	// variable for the program 
    boolean rectgasClicked = false, rectsystClicked = false;
    boolean mouseClicked = false,mousePressed = false;
    public static int oneX = 270;
    public static int oneY = 20 ;
    public static int gasUsagex = 0,gasUsagey = 0;
    public static int gasUsagex2 = 0;
    private int x,y;
    JFrame frame;
    DrawShapes doTheThing;
    public static int y2 = 180, i = 1, speedControl = 20;
    public static int needlex2 = 229;
    public static int centerX = 500, centerY = 150;
    public static int needleX = 80, needleY  = 150;
    public int change = 0;
   
   
    
    
    /**
     * Main method used to run the program. 
     * @param args
     */
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new RotateWheelFrame().fire();
       
    }
    
    /**
     * method to add the frame and make everything visible
     */
    private void fire() {
       
        frame = new JFrame("Rotation controlled circle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        doTheThing = new DrawShapes();
        frame.add(doTheThing);
        frame.getContentPane().add(BorderLayout.CENTER, doTheThing);
        frame.setResizable(false);
        frame.setSize(900, 800);
        frame.setBackground(Color.WHITE);
        frame.setLocation(10, 80);
        frame.setVisible(true);
        frame.add(new Revolutions("0"));
        frame.addMouseListener(this);
        frame.addMouseMotionListener(this);

        update();
        
    
    	
    }
             
    /**
     * this method is to keep updating the frame and repainting it. here we control the variables. 
     */
   
    private void update() {
    	
    	//tanks initially empty
    	gasUsagex = 560; 
    	gasUsagey = -560;
    	gasUsagex2 = -225;
        
    	while (true) {
        		
        		


           		int rotacion = 0;
           	
           		
           		//start controlling the system controller 
           		if (DrawShapes.x > 486)
          	 	  y2 = y2 - 1;
           		if(DrawShapes.x ==486)
           			needlex2 = 229;
           		if(DrawShapes.x ==488){
           			needlex2 = 227;
           			speedControl=100;
           		}
           		if(DrawShapes.x ==490){
           			needlex2 = 225;
           			speedControl=60;

           		}
           		if(DrawShapes.x ==492){
           			needlex2 = 223;
           			speedControl=50;

           		}
           		if(DrawShapes.x ==494){
           			needlex2 = 221;
           			speedControl=40;

           		}
           		if(DrawShapes.x ==496){
           			needlex2 = 219;
           			speedControl=40;

           		}
           		if(DrawShapes.x ==498){
           			needlex2 = 217;
           			speedControl=40;

           			
        }
           		if(DrawShapes.x ==500){
           			needlex2 = 215;
           			speedControl=40;

           		}
           		if(DrawShapes.x ==502){
           			needlex2 = 213;
           			speedControl=40;

           		}
           		if(DrawShapes.x ==504){
           			needlex2 = 211;
           			speedControl=40;

           		}
           		if(DrawShapes.x ==506){
           			needlex2 = 209;
           			speedControl=40;

           		}
           		if(DrawShapes.x ==508){
           			needlex2 = 207;
       			speedControl=40;
           		}
           		if(DrawShapes.x ==510){
           			needlex2 = 205;
           			speedControl=30;
           		}
           		if(DrawShapes.x ==512){
           			needlex2 = 203;
           			speedControl=30;
           		}
           		
           		if(DrawShapes.x ==514){
           			needlex2 = 201;      
           			speedControl=30;}

           		if(DrawShapes.x ==516){
           			needlex2 = 198;
           			speedControl=30;
           		}
           		if(DrawShapes.x ==518){
           			needlex2 = 196;
           			speedControl=30;

           		}
           		if(DrawShapes.x ==520){
           			needlex2 = 194;
           			speedControl=30;
           		}
           		
           		if(DrawShapes.x ==522){
           			needlex2 = 192;
           			speedControl=20;
           		}
           		if(DrawShapes.x ==524){
           			needlex2 = 190;
           			speedControl=20;

           		}
           		if(DrawShapes.x ==526){
           			needlex2 = 188;
           			speedControl=20;
           		}
           		
             		if(DrawShapes.x ==528){
             			needlex2 = 186;
             			speedControl=20;
               		}
             		if(DrawShapes.x ==530){
             			needlex2 = 184;
             			speedControl=20;
               		}
             		if(DrawShapes.x ==532){
             			needlex2 = 182;
             			speedControl=19;
               		}
             		if(DrawShapes.x ==534){
             			needlex2 = 180;
             			speedControl=18;
               		}
             		if(DrawShapes.x ==536){
             			needlex2 = 178;
             			speedControl=18;
               		}
             		if(DrawShapes.x ==538){
             			needlex2 = 176;
             			speedControl=17;
               		}
             		if(DrawShapes.x ==540){
             			needlex2 = 174;
             			speedControl=17;
               		}
             		if(DrawShapes.x ==542){
             			needlex2 = 172;
             			speedControl=16;
               		}
             		if(DrawShapes.x ==544){
             			needlex2 = 170;
             			speedControl=16;
               		}
             		if(DrawShapes.x ==546){
             			needlex2 = 168;
             			speedControl=15;
               		}
             		if(DrawShapes.x ==548){
             			needlex2 = 166;
             			speedControl=15;
               		}
             		if(DrawShapes.x ==550){
             			needlex2 = 164;
             			speedControl=14;
               		}
             		if(DrawShapes.x ==552){
             			needlex2 = 162;
             			speedControl=10;
               		}
             		if(DrawShapes.x ==554){
             			needlex2 = 160;
             			speedControl=10;
               		}
             		if(DrawShapes.x ==556){
             			needlex2 = 158;
             			speedControl=10;
               		}
             		if(DrawShapes.x ==558){
             			needlex2 = 156;
             			speedControl=9;
               		}
             		if(DrawShapes.x ==560){
             			needlex2 = 154;
             			speedControl=9;
               		}
             		if(DrawShapes.x ==562){
             			needlex2 = 152;
             			speedControl=9;
               		}
             			
             		if(DrawShapes.x ==564){
             			needlex2 = 148;
             			speedControl=9;
               		}
             		if(DrawShapes.x ==566){
             			needlex2 = 142;
             			speedControl=9;
               		}
             		if(DrawShapes.x ==568){
             			needlex2 = 138;
             			speedControl=9;
               		}

             		if(DrawShapes.x ==570){
             			needlex2 = 136;
             			speedControl=9;
               		}
             		if(DrawShapes.x ==572){
             			needlex2 = 134;
             			speedControl=9;
               		}
             		if(DrawShapes.x ==574){
             			needlex2 = 132;
             			speedControl=8;
               		}
             		if(DrawShapes.x ==576){
             			needlex2 = 130;
             			speedControl=8;
               		}
             		if(DrawShapes.x ==578){
             			needlex2 = 128;
             			speedControl=8;
               		}
             		if(DrawShapes.x ==580){
             			needlex2 = 126;
             			speedControl=8;
               		}
             		if(DrawShapes.x ==582){
             			needlex2 = 124;
             			speedControl=8;
               		}
             		if(DrawShapes.x ==584){
             			needlex2 = 122;
             			speedControl=8;
               		}
             		if(DrawShapes.x ==586){
             			needlex2 = 120;
             			speedControl=8;
               		}
             		
             		
             		if(DrawShapes.x ==588){
             			needlex2 = 116;
             			speedControl=8;
               		}
             		if(DrawShapes.x ==589){
             			needlex2 = 112;
             			speedControl=8;
               		}
             		if(DrawShapes.x ==590){
             			needlex2 = 108;
             			speedControl=8;
               		}
             		if(DrawShapes.x ==592){
             			needlex2 = 102;
             			speedControl=7;
               		}
             		if(DrawShapes.x ==594){
             			needlex2 = 98;
             			speedControl=7;
               		}
             		if(DrawShapes.x ==596){
             			needlex2 = 94;
             			speedControl=7;
               		}
             		
             		if(DrawShapes.x ==598){
             			needlex2 = 90;
             			speedControl=7;
               		}
             		if(DrawShapes.x ==603){
             			needlex2 = 89;
             			speedControl=7;
               		}
             		if(DrawShapes.x ==604){
             			needlex2 = 86;
             			speedControl=7;
               		}
             		if(DrawShapes.x ==605){
             			needlex2 = 84;
             			speedControl=7;
               		}
             		if(DrawShapes.x ==606){
             			needlex2 = 82;
             			speedControl=7;
               		}
             		if(DrawShapes.x ==607){
             			needlex2 = 80;
             			speedControl=7;
               		}
           		
           		
             		
             		if(DrawShapes.x ==608){
               			needlex2 = 78;
               			speedControl=7;
               		}
               		if(DrawShapes.x ==609){
               			needlex2 = 76;
               			speedControl=6;

               		}
               		if(DrawShapes.x ==610){
               			needlex2 = 74;
               			speedControl=6;

               		}
               		if(DrawShapes.x ==611){
               			needlex2 = 72;
               			speedControl=6;

               		}
               		if(DrawShapes.x ==612){
               			needlex2 = 70;
               			speedControl=6;

               		}
               		if(DrawShapes.x ==613){
               			needlex2 = 68;
               			speedControl=6;
               			}
               		
               		if(DrawShapes.x ==614){
               			needlex2 = 66;
               			speedControl=6;

               		}
               		if(DrawShapes.x ==615){
               			needlex2 = 64;
               			speedControl=6;

               		}
               		if(DrawShapes.x ==616){
               			needlex2 = 62;
               			speedControl=6;

               		}
               		if(DrawShapes.x ==617){
               			needlex2 = 50;
               			speedControl=6;

               		}
               		if(DrawShapes.x ==618){
               			needlex2 = 48;
           			speedControl=6;
               		}
               		if(DrawShapes.x ==619){
               			needlex2 = 46;
               			speedControl=5;
               		}
               		if(DrawShapes.x ==620){
               			needlex2 = 45;
               			speedControl=5;
               		}
               		
               		if(DrawShapes.x ==621){
               			needlex2 = 44;      
               			speedControl=5;}

               		if(DrawShapes.x ==622){
               			needlex2 = 43;
               			speedControl=5;
               		}
               		if(DrawShapes.x ==623){
               			needlex2 = 42;
               			speedControl=5;

               		}
               		if(DrawShapes.x ==624){
               			needlex2 = 38;
               			speedControl=5;
               		}
               		
               		if(DrawShapes.x ==625){
               			needlex2 = 37;
               			speedControl=5;
               		}
               		if(DrawShapes.x ==626){
               			needlex2 = 36;
               			speedControl=5;

               		}
               		if(DrawShapes.x ==627){
               			needlex2 = 34;
               			speedControl=5;
               		}
               		
                 		if(DrawShapes.x ==628){
                 			needlex2 = 32;
                 			speedControl=5;
                   		}
                 		if(DrawShapes.x ==629){
                 			needlex2 = 30;
                 			speedControl=4;
                   		}
                 		if(DrawShapes.x ==630){
                 			needlex2 = 28;
                 			speedControl=4;
                   		}
                 		if(DrawShapes.x ==631){
                 			needlex2 = 26;
                 			speedControl=4;
                   		}
                 		if(DrawShapes.x ==632){
                 			needlex2 = 24;
                 			speedControl=4;
                   		}
                 		if(DrawShapes.x ==633){
                 			needlex2 = 23;
                 			speedControl=4;
                   		}
                 		if(DrawShapes.x ==634){
                 			needlex2 = 22;
                 			speedControl=4;
                   		}
                 		if(DrawShapes.x ==635){
                 			needlex2 = 21;
                 			speedControl=4;
                   		}
                 		if(DrawShapes.x ==636){
                 			needlex2 = 20;
                 			speedControl=4;
                   		}
                 		if(DrawShapes.x ==637){
                 			needlex2 = 18;
                 			speedControl=4;
                   		}
                 		if(DrawShapes.x ==638){
                 			needlex2 = 16;
                 			speedControl=4;
                   		}
                 		if(DrawShapes.x ==639){
                 			needlex2 = 14;
                 			speedControl=3;
                   		}
                 		if(DrawShapes.x ==640){
                 			needlex2 = 12;
                 			speedControl=3;
                   		}
                 		if(DrawShapes.x ==641){
                 			needlex2 = 10;
                 			speedControl=3;
                   		}
                 		if(DrawShapes.x ==642){
                 			needlex2 = 8;
                 			speedControl=3;
                   		}
                 		if(DrawShapes.x ==643){
                 			needlex2 = 6;
                 			speedControl=3;
                   		}
                 		if(DrawShapes.x ==644){
                 			needlex2 = 4;
                 			speedControl=3;
                   		}
                 		if(DrawShapes.x ==646){
                 			needlex2 = 2;
                 			speedControl=3;
                   		}
                 			
                 		if(DrawShapes.x ==648){
                 			needlex2 = 0;
                 			speedControl=3;
                   		}
                 		if(DrawShapes.x ==650){
                 			needlex2 = -2;
                 			speedControl=3;
                   		}
                 		if(DrawShapes.x ==652){
                 			needlex2 = -4;
                 			speedControl=3;
                   		}

                 		if(DrawShapes.x ==654){
                 			needlex2 = -6;
                 			speedControl=2;
                   		}
                 		if(DrawShapes.x ==656){
                 			needlex2 = -8;
                 			speedControl=2;
                   		}
                 		if(DrawShapes.x ==658){
                 			needlex2 = -10;
                 			speedControl=2;
                   		}
                 		if(DrawShapes.x ==660){
                 			needlex2 = -12;
                 			speedControl=2;
                   		}
                 		if(DrawShapes.x ==662){
                 			needlex2 = -14;
                 			speedControl=2;
                   		}
                 		if(DrawShapes.x ==664){
                 			needlex2 = -16;
                 			speedControl=2;
                   		}
                 		if(DrawShapes.x ==666){
                 			needlex2 = -18;
                 			speedControl=2;
                   		}
                 		if(DrawShapes.x ==668){
                 			needlex2 = -20;
                 			speedControl=2;
                   		}
                 		if(DrawShapes.x ==670){
                 			needlex2 = -22;
                 			speedControl=2;
                   		}
                 		
                 		
                 		if(DrawShapes.x ==672){
                 			needlex2 = -24;
                 			speedControl=2;
                   		}
                 		if(DrawShapes.x ==674){
                 			needlex2 = -26;
                 			speedControl=1;
                   		}
                 		if(DrawShapes.x ==676){
                 			needlex2 = -28;
                 			speedControl=1;
                   		}
                 		if(DrawShapes.x ==678){
                 			needlex2 = -30;
                 			speedControl=1;
                   		}
                 		if(DrawShapes.x ==680){
                 			needlex2 = -32;
                 			speedControl=1;
                   		}
                 		if(DrawShapes.x ==682){
                 			needlex2 = -34;
                 			speedControl=1;
                   		}
                 		
                 		if(DrawShapes.x ==684){
                 			needlex2 = -36;
                 			speedControl=1;
                   		}
                 		if(DrawShapes.x ==686){
                 			needlex2 = -38;
                 			speedControl=1;
                   		}
                 		if(DrawShapes.x ==688){
                 			needlex2 = -40;
                 			speedControl=1;
                   		}
                 		if(DrawShapes.x ==690){
                 			needlex2 = -42;
                 			speedControl=1;
                   		}
                 		if(DrawShapes.x ==692){
                 			needlex2 = -44;
                 			speedControl=1;
                   		}
                 		if(DrawShapes.x ==693){
                 			needlex2 = -46;
                 			speedControl=1;
                   		}
               			
             	// adding a revolution to the counter 
                  if ((y2-181)%360==0){         
                	  rotacion++;
                  		
                  }
                  
                 
                  
                
                  
                  if (rotacion >0 ){
                      Revolutions.incrementCounter();

                	  gasUsagex = gasUsagex +20;
                	  gasUsagey = gasUsagey -20;
                	  gasUsagex2 = gasUsagex2 -8; 
                	  
                	 //needle can't be more than 60
                	  if (needlex2 <= -46)
                       	needlex2 = -46;
                   
                	  
                	  
                	  
                  	
                     	
                  }
                 
                  
                  // if no gas left, stop wheel and speedometer
                  if (gasUsagex==560 && gasUsagey ==-560){
                	  y2=0; 
                 	  needlex2 =229;
                  	DrawShapes.x = 486;

                
                	  }
                 
                 //adding gas  
                  if (mouseClicked && rectgasClicked){
                	  gasUsagex=gasUsagex -20;
                	  gasUsagey =gasUsagey +20;  
                	  //no letting it pass its boundaries 
                	  if (gasUsagex <=0 || gasUsagey >=555){
                		  gasUsagex=0;
                		  gasUsagey = 0;
                		  
                        	  }

                	  
           		  
                	  gasUsagex2 = gasUsagex2 +8;
                	  if (gasUsagex2 >=0)
                		  gasUsagex2 = 0;
                	  mouseClicked = false;
                	  rectgasClicked = false;
                	  }
                  
                  
                  	

                    frame.repaint();
                    
                    try {
                        Thread.sleep(speedControl);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                   
                }
            }
    }
          
   
    		 /*
    		  * 
    		  * (non-Javadoc)
    		  * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent)
    		  */
            @Override
            public void mouseClicked(MouseEvent e) {
            	x = e.getX();
            	y = e.getY();
            	mouseClicked = true;
        			if (x>=493 && x <=493 +40 && y >=561 && y <=593)
        			{	rectgasClicked = true;
        			}
                // TODO Auto-generated method stub
            }
            /*
             * (non-Javadoc)
             * @see java.awt.event.MouseListener#mouseEntered(java.awt.event.MouseEvent)
             */
            @Override  
            public void mouseEntered(MouseEvent arg0) {
                // TODO Auto-generated method stub
               
            }
            /*
             * (non-Javadoc)
             * @see java.awt.event.MouseListener#mouseExited(java.awt.event.MouseEvent)
             */
            @Override
            public void mouseExited(MouseEvent arg0) {
                // TODO Auto-generated method stub
               
            }
            /*
             * (non-Javadoc)
             * @see java.awt.event.MouseListener#mousePressed(java.awt.event.MouseEvent)
             */
            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
            	Point p = e.getPoint();
            	x = p.x;
            	y = p.y;
            	
        		
            	if(x>=DrawShapes.x && x<=(DrawShapes.width + DrawShapes.x) +4 && y>=421 && y<=438)
            		rectsystClicked=true;
            		
            	
            }
            /*
             * (non-Javadoc)
             * @see java.awt.event.MouseListener#mouseReleased(java.awt.event.MouseEvent)
             */
            @Override
            public void mouseReleased(MouseEvent e) {
            	rectsystClicked = false;
            }
            
            /*
             * 
             * (non-Javadoc)
             * @see java.awt.event.MouseMotionListener#mouseDragged(java.awt.event.MouseEvent)
             */
            @Override 
            public void mouseDragged(MouseEvent e) {
            	Point point  = e.getPoint();
            	
            	if (rectsystClicked ){
            		
                	DrawShapes.x  = point.x;
                while (DrawShapes.x <=486 && rectsystClicked ){
                	
            		frame.repaint();
            		rectsystClicked =false;
                	}
                if (DrawShapes.x >= 695)
                	DrawShapes.x = 695;
                if (DrawShapes.x <= 486)
                	DrawShapes.x =486;
                if (gasUsagex==560 && gasUsagey ==-560)
                	DrawShapes.x = 486;
            	}
            	
            }
            /*
             * (non-Javadoc)
             * @see java.awt.event.MouseMotionListener#mouseMoved(java.awt.event.MouseEvent)
             */
			@Override
			public void mouseMoved(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
             
           
            
            
        }