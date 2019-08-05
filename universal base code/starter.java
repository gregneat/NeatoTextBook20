import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
	
		
		
        public static void main(String args[])
        {
		
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			
			System.out.print("Please enter a single letter: ");
			EasyReader in;
			in = new EasyReader();
			String w = in.readWord();
			// int wLen = w.length();
			// int counter = 0;
			int td;
			int d = 1;
			int xStart = 5;
			int yStart = 10;
			Car box = new Car(xStart,yStart);
			// box.setColor(Color.BLUE);
			// box.fill();
			// Text name = new Text(20,50,"Neato");
			// name.draw(); 
			// Text loc = new Text(20,70,box.getX()+", "+box.getY());
			// loc.draw();
			td = 100;
			Text t = new Text(0,0,w);
			System.out.println(t.getWidth());
			
			while(box.getX() < 570)
			{
				if(box.getX() % t.getWidth()==0)
				{
					Text trail = new Text(box.getX(),box.getY()+box.getHeight()/3,w);
					trail.draw();
				}
				// int locDx = xStart-box.getX();
				// int locDy = yStart - box.getY();
				Canvas.pause(td);
				box.translate(d,0);
				// name.translate(d,0);
				// loc.translate(d,0);
				// loc.setText(box.getX()+", "+box.getY());
			}
		
			
			
		}
		
		public void onMouseClick(double x, double y){
			// and/or here
			// cars[maxI].translate(-5,0);
			
	
		}
		
		public void keyPress(String s)
		{
			
		}
		
}
