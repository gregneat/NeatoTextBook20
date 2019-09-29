import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		
			static int move;
			static int lil=2;
        public static void main(String args[])
        {
		
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
		
			WilliamCarP4 w = new WilliamCarP4(200,40);
			w.draw();
			
			WilliamCarP4 z = new WilliamCarP4(400,400);
			z.fill();
		
		}
		
		public void onMouseClick(double x, double y){
			// and/or here
				
		}

				
		
		public void keyPress(String s)
		{
			// temp holds the enter character
			
			char done = (char)10;
			String temp = Character.toString(done);
			
		}
}
