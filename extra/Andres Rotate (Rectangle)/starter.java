import pkg.*;

public class starter {
	public static void main(String args[]){
		Rectangle test = new Rectangle(100, 200, 100, 100, 10.0);
		Rectangle original = new Rectangle(100,200,100,100);
		original.draw();
		original.setColor(Color.RED);
		test.draw();
		
	}
}
