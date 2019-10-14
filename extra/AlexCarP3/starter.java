import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		static Rectangle rec1;
		static Rectangle rec2;
		static Rectangle rec3;
		static Rectangle rec4;
		static Rectangle rec5;
		static Rectangle rec6;
		static Rectangle rec7;
		static Rectangle rec8;
		static Rectangle rec9;
		static Rectangle rec10;
		static Rectangle rec11;
		// static Rectangle rec12;
		static Rectangle rec13;
		static Ellipse ell1;
		static Ellipse ell2;
		static Ellipse ell3;
		static Ellipse ell4;
		static boolean xx;

        public static void main(String args[])
        {
		
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			
			xx = true;
			
			rec1 = new Rectangle(35,35,90,60);
			rec1.setColor(Color.RED);
			rec1.fill();
			
			rec2 = new Rectangle(16,70,20,5);
			rec2.setColor(Color.BLUE);
			rec2.fill();
			
			rec3 = new Rectangle(16,79,20,5);
			rec3.setColor(Color.BLUE);
			rec3.fill();
			
			rec4 = new Rectangle(16,88,20,5);
			rec4.setColor(Color.BLUE);
			rec4.fill();
			
			rec5 = new Rectangle(20,30,110,15);
			rec5.setColor(Color.WHITE);
			rec5.fill();
			
			rec6 = new Rectangle(35,70,18,10);
			rec6.setColor(Color.ORANGE);
			rec6.fill();
			
			rec7 = new Rectangle(53,70,18,10);
			rec7.setColor(Color.GREEN);
			rec7.fill();
			
			rec8 = new Rectangle(71,70,18,10);
			rec8.setColor(Color.ORANGE);
			rec8.fill();
					
			rec9 = new Rectangle(89,70,18,10);
			rec9.setColor(Color.GREEN);
			rec9.fill();
			
			rec10 = new Rectangle(107,70,18,10);
			rec10.setColor(Color.ORANGE);
			rec10.fill();
			
			rec11 = new Rectangle(89,50,30,15);
			rec11.setColor(Color.BLACK);
			rec11.fill();
			
			// rec12 = new Rectangle(33,54,30,10);
			// rec12.setColor(Color.GREEN);
			// rec12.fill();
			
			rec13 = new Rectangle(5,5,70,55);
			rec13.setColor(Color.WHITE);
			rec13.fill();
			
			ell1 = new Ellipse(93,82,30,30);
			ell1.setColor(Color.BLACK);
			ell1.fill();
			
			ell2 = new Ellipse(38,82,30,30);
			ell2.setColor(Color.BLACK);
			ell2.fill();
			
			ell3 = new Ellipse(46,90,15,15);
			ell3.setColor(Color.LIGHT_GRAY);
			ell3.fill();
			
			ell4 = new Ellipse(101,90,15,15);
			ell4.setColor(Color.LIGHT_GRAY);
			ell4.fill();
		}
		
		public void onMouseClick(double x, double y){
			// and/or here		
			
		
			if (xx)
			{
			rec1.setColor(Color.RED);
			rec1.fill();
			rec2.setColor(Color.BLUE);
			rec2.fill();
			rec3.setColor(Color.BLUE);
			rec3.fill();
			rec4.setColor(Color.BLUE);
			rec4.fill();
			rec5.setColor(Color.WHITE);
			rec5.fill();
			rec6.setColor(Color.ORANGE);
			rec6.fill();
			rec7.setColor(Color.GREEN);
			rec7.fill();
			rec8.setColor(Color.ORANGE);
			rec8.fill();	
			rec9.setColor(Color.GREEN);
			rec9.fill();
			rec10.setColor(Color.ORANGE);
			rec10.fill();
			rec11.setColor(Color.BLACK);
			rec11.fill();
			// rec12.setColor(Color.WHITE);
			// rec12.fill();
			rec13.setColor(Color.WHITE);
			rec13.fill();
			ell1.setColor(Color.BLACK);
			ell1.fill();
			ell2.setColor(Color.BLACK);
			ell2.fill();
			ell3.setColor(Color.LIGHT_GRAY);
			ell3.fill();			
			ell4.setColor(Color.LIGHT_GRAY);
			ell4.fill();
			
			}
			
			else
				
			{
				
			rec1.setColor(Color.BLUE);
			rec1.fill();			
			rec2.setColor(Color.RED);
			rec2.fill();			
			rec3.setColor(Color.RED);
			rec3.fill();			
			rec4.setColor(Color.RED);
			rec4.fill();			
			rec5.setColor(Color.WHITE);
			rec5.fill();			
			rec6.setColor(Color.GREEN);
			rec6.fill();			
			rec7.setColor(Color.ORANGE);
			rec7.fill();			
			rec8.setColor(Color.GREEN);
			rec8.fill();					
			rec9.setColor(Color.ORANGE);
			rec9.fill();			
			rec10.setColor(Color.GREEN);
			rec10.fill();			
			rec11.setColor(Color.BLACK);
			rec11.fill();			
			// rec12.setColor(Color.WHITE);
			// rec12.fill();	
			rec13.setColor(Color.WHITE);
			rec13.fill();
			ell1.setColor(Color.BLACK);
			ell1.fill();			
			ell2.setColor(Color.BLACK);
			ell2.fill();		
			ell3.setColor(Color.LIGHT_GRAY);
			ell3.fill();
			ell4.setColor(Color.LIGHT_GRAY);
			ell4.fill();
			
			}
			rec1.translate(5.0,0.0);
			rec2.translate(5.0,0.0);
			rec3.translate(5.0,0.0);
			rec4.translate(5.0,0.0);
			rec5.translate(5.0,0.0);
			rec6.translate(5.0,0.0);
			rec7.translate(5.0,0.0);
			rec8.translate(5.0,0.0);
			rec9.translate(5.0,0.0);
			rec10.translate(5.0,0.0);
			rec11.translate(5.0,0.0);
			// rec12.translate(5.0,0.0);
			rec13.translate(5.0,0.0);
			ell1.translate(5.0,0.0);
			ell2.translate(5.0,0.0);
			ell3.translate(5.0,0.0);
			ell4.translate(5.0,0.0);
			xx= !xx;
			
		// if(x>400)
		// {
			//System.out.println(x);
			// rec1.undraw();
			// rec2.undraw();
			// rec3.undraw();
			// rec4.undraw();
			// rec5.undraw();
			// rec6.undraw();
			// rec7.undraw();
			// rec8.undraw();
			// rec9.undraw();
			// rec10.undraw();
			// rec11.undraw();
			// rec12.undraw();
			
		// }
			
		}
		
		public void keyPress(String s)
		{
			// temp holds the enter character
			
			rec1.undraw();
			rec2.undraw();
			rec3.undraw();
			rec4.undraw();
			rec5.undraw();
			rec6.undraw();
			rec7.undraw();
			rec8.undraw();
			rec9.undraw();
			rec10.undraw();
			rec11.undraw();
			// rec12.undraw();
			rec13.undraw();
			ell1.undraw();
			ell2.undraw();
			ell3.undraw();
			ell4.undraw();
			
			char done = (char)10;
			String temp = Character.toString(done);
			
		}
}
