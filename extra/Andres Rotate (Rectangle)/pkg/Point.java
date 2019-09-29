package pkg;

public class Point {
	private double x;
	private double y;
	private Rectangle point;
	private Color color = null;
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public Point rotatePoint(Point center, double angle) {
		center = center.realPoint();
		// System.out.println("The center is: " + center);
		angle = angle * Math.PI/180;
		y = -y;
		double newX = (Math.cos(angle) * (x - center.getX())) - Math.sin(angle) * (y - center.getY()) + center.getX();
		double newY = (Math.sin(angle) * (x - center.getX())) + Math.cos(angle) * (y - center.getY()) + center.getY();
		y = -y;
		Point rotated = new Point(newX, newY);
		rotated = rotated.realPoint();
		return rotated;
	}
	public Point translate(double x, double y){
		return new Point(this.x + x, this.y + y);
	}
	public Point realPoint(){
		return new Point(x, -y);
	}
	public void setColor(Color color){
		point = new Rectangle(x, y, 1, 1);
		point.setColor(color);
		this.color = color;
	}
	public void draw(){
		point = new Rectangle(x, y, 1, 1);
		point.draw();
		if(color != null){
			point.setColor(color);
		}
	}
	public String toString(){
		return "x = " + x + " y =" + y;
	}
}