import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		

        public static void main(String args[])
        {
		
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			KrabbyMobile joe = new KrabbyMobile(100, 20, 1.0);
			joe.fill();
			
		}
		
		public void onMouseClick(double x, double y){
			// and/or here		
			
			
		}
		
		public void keyPress(String s)
		{
			// temp holds the enter character
			
			
		}
}
