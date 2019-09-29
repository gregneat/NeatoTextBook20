import pkg.*;

public class ElmerCarP6{
	private Rectangle Body;
	private Rectangle Hood;
	private Ellipse Wheel;
	private Ellipse Wheel2;
	private Ellipse a;
	private Ellipse b;
	private Rectangle Window;
	
	public ElmerCarP6(double x, double y){
		//create Car
		Body = new Rectangle(x,y,70,70);
		Body.setColor(Color.BLUE);
		Hood = new Rectangle(x,y+40,90,30);
		Hood.setColor(Color.BLUE);
		Wheel = new Ellipse(x+64,y+45,30,30);
		Wheel2 = new Ellipse(x-5,y+45,30,30);
		Window = new Rectangle(x+20,y+10,30,30);
		Window.setColor(Color.WHITE);
		a = new Ellipse(x+72,y+53,15,15);
		a.setColor(Color.WHITE);
		b = new Ellipse(x+3,y+53,15,15);
		b.setColor(Color.WHITE);
	}

	public void fill(){
		Body.fill();
		Hood.fill();
		Wheel.fill();
		Wheel2.fill();
		Window.fill();
		a.fill();
		b.fill();
	}
	
	public void draw(){
		Body.draw();
		Hood.draw();
		Wheel.draw();
		Wheel2.draw();
		Window.draw();
		a.draw();
		b.draw();
	}
	
	public void translate(double deltaX, double deltaY){
		Body.translate(deltaX,deltaY);
		Hood.translate(deltaX,deltaY);
		Wheel.translate(deltaX,deltaY);
		Wheel2.translate(deltaX,deltaY);
		a.translate(deltaX,deltaY);
		b.translate(deltaX,deltaY);
		Window.translate(deltaX,deltaY);
	}
}