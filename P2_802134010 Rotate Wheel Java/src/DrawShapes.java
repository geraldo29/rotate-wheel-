import java.awt.Color;                                                                                                                       
import java.awt.Graphics;
import javax.swing.JPanel;


	/**
	 * class to construct shapes and graphic part of the frame. 
	 * @author geraldo
	 *
	 */
	public class DrawShapes extends JPanel {
		
		//static Rectangle meter = new Rectangle(486, 420, 15, 15);
		static int x = 486; 
		static int width = 15;
		public void paintComponent(Graphics g){
			


			
			
			g.setColor(Color.BLACK);
			// border layout
			g.drawRect(5, 5, 750, 600);
			//revolution counter rect 
			g.drawRect(270, 20, 285, 50);
			for (int i = 310; i <550;i = i+40)
				g.drawLine(i, 20, i, 70);
			
			// fuel tank meter
			g.fillRect(755, 585, 30, 20);
			g.drawRect(755, 585, 30, 20);
			g.setColor(Color.PINK);
			g.fillRect(785,RotateWheelFrame.gasUsagex + 50, 55,(RotateWheelFrame.gasUsagey + 555));
			g.drawRect(785,RotateWheelFrame.gasUsagex + 50, 55, (RotateWheelFrame.gasUsagey +555));
			g.setColor(Color.BLACK);
			g.drawRect(785, 50, 55, 555);
			
			//rpm oval 
			
			g.drawOval(80,150,200,200);
			g.drawLine(80,250,280,250);  
			g.drawLine(180,150,180,350);
			g.drawLine(250,180,115,325);
			g.drawLine(110,180,250,320);
			g.drawOval(500,150,200,200);

			
			
			//arc for wheel
			g.drawOval(500,150,200,200);

			g.setColor(Color.BLUE);
		    g.fillArc(RotateWheelFrame.centerX, RotateWheelFrame.centerY, 200, 200, RotateWheelFrame.y2 +175, 10);
		    g.fillArc(RotateWheelFrame.centerX, RotateWheelFrame.centerY, 200, 200, RotateWheelFrame.y2 - 185, 10);
		    g.fillArc(RotateWheelFrame.centerX, RotateWheelFrame.centerY, 200, 200, RotateWheelFrame.y2 -95, 10);
		    g.fillArc(RotateWheelFrame.centerX, RotateWheelFrame.centerY, 200, 200, RotateWheelFrame.y2 -135, 10);
		    g.fillArc(RotateWheelFrame.centerX, RotateWheelFrame.centerY, 200, 200, RotateWheelFrame.y2 + 140, 10);
		    g.fillArc(RotateWheelFrame.centerX, RotateWheelFrame.centerY, 200, 200, RotateWheelFrame.y2 + 85, 10);
		    g.fillArc(RotateWheelFrame.centerX, RotateWheelFrame.centerY, 200, 200, RotateWheelFrame.y2 + 45, 10);
			g.fillArc(RotateWheelFrame.centerX, RotateWheelFrame.centerY, 200, 200, RotateWheelFrame.y2 - 45, 10);
			g.setColor(Color.BLACK);
		    g.fillArc(RotateWheelFrame.centerX, RotateWheelFrame.centerY, 200, 200, RotateWheelFrame.y2 - 5, 10);
		    
			//Arc to cover lines 
			g.setColor(Color.WHITE);
			g.fillOval(92,163, 175, 175);
			
			//Needle for circle
			g.setColor(Color.BLUE);
		    g.fillArc(RotateWheelFrame.needleX, RotateWheelFrame.needleY, 200, 200, RotateWheelFrame.needlex2, 1);
		    g.setColor(Color.BLACK);
			g.drawString("Revolutions Counter", 370, 100);
			g.drawString("rpm", 169, 315);
			g.drawString("0", 125, 315);
			g.drawString("10", 100, 255);
			g.drawString("50", 250, 255);
			g.drawString("20", 120, 200);
			g.drawString("30", 172, 180);
			g.drawString("40", 230, 205);
			g.drawString("60", 228, 310);
			
			//String SPEEDOMETER
			g.drawString("S", 60, 185);
			g.drawString("P", 60, 200);
			g.drawString("E", 60, 215);
			g.drawString("E", 60, 230);
			g.drawString("D", 60, 245);
			g.drawString("O", 60, 260);
			g.drawString("M", 60, 275);
			g.drawString("E", 60, 290);
			g.drawString("T", 60, 305);
			g.drawString("E", 60, 320);
			g.drawString("R", 60, 335);
			g.drawString("F", 850, 250);
			g.drawString("U", 850, 265);
			g.drawString("E", 850, 280);
			g.drawString("L", 850, 295);
			g.drawString("T", 850, 325);
			g.drawString("A", 850, 340);
			g.drawString("N", 850, 355);
			g.drawString("K", 850, 370);
			g.drawString("W", 710, 220);
			g.drawString("H", 710, 235);
			g.drawString("E", 710, 250);
			g.drawString("E", 710, 265);
			g.drawString("L", 710, 280);
			    
			//System Controller Rectangle
			g.drawString("System Controller", 550, 400);
			g.drawRect(485, 410, 225, 35);
			for (int i = 500; i <710;i = i+20)
				g.drawLine(i, 418, i, 438);
			g.drawString("O", 490, 470);
			g.drawString("F", 490, 485);
			g.drawString("F", 490, 500);
			g.drawString("M", 600, 470);
			g.drawString("E", 600, 485);
			g.drawString("D", 600, 500);
			g.drawString("M", 700, 470);
			g.drawString("A", 700, 485);
			g.drawString("X", 700, 500);
			
			//rect of system controller
			g.fillRect(x, 420, width, 15);
			g.drawRect(x, 420, width, 15);
			
			//Fuel Meter Rectangle
			g.drawString("Fuel Meter", 150, 470);
			g.drawRect(60, 410, 225, 35);
			for (int i = 70; i <290;i = i+20)
			g.drawLine(i, 418, i, 438);
			g.drawString("E", 60, 470);
			g.drawString("F", 280,470);
			
			
			//meter marker rect 
			g.fillRect(118, 410, 5, 20);
			g.drawRect(118, 410, 5, 20);
			g.fillRect(178, 410, 5, 20);
			g.drawRect(178, 410, 5, 20);
			g.fillRect(238, 410, 5, 20);
			g.drawRect(238, 410, 5, 20);
			
			//press for gas RECT
			g.drawRect(490,560, 40, 30);
			g.fillRect(490, 560, 40, 30);
			g.drawString("Press To", 545, 570);
			g.drawString("Add Gas", 545, 585);
			
			//fuel meter gas
			g.setColor(Color.PINK);
			g.fillRect(60, 422, RotateWheelFrame.gasUsagex2 +225, 10);
			g.drawRect(60, 422, RotateWheelFrame.gasUsagex2+225, 10);
			g.setColor(Color.BLACK);
			g.drawRect(60, 422, 225, 10);
		}

}
