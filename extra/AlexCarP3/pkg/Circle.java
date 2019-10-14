package pkg;

public class Circle
{
    private double x;
    private double y;
	private double r;
	private Ellipse joe;
	
    /**
       Constructs an empty rectangle.
    */
    public Circle()
    {
        x = 0;
        y = 0;
		r = 0;
    }       

    /**
       Constructs a rectangle.
       @param x the leftmost x-coordinate
       @param y the topmost y-coordinate
       @param width the width
       @param height the height
    */
    public Circle(double x, double y, double r)
    {
		this.x = x;
		this.y = y;
		this.r = r;
        joe = new Ellipse(x-r,y-r,2*r,2*r);
    }

    /**
       Gets the leftmost x-position of this rectangle.
       @return the leftmost x-position
    */
    public int getX()
    {
        return (int) Math.round(x);
    }

    /**
       Gets the topmost y-position of this rectangle.
       @return the topmost y-position
    */
    public int getY()
    {
        return (int) Math.round(y);
    }
	
	public int getR()
    {
        return (int) Math.round(r);
    }
	
		public void setX(double xx)
	{
		this.x = xx;
	}
	
	public void setY(double yy)
	{
		this.y = yy;
	}
	
	public void gotoXY(double xx,double yy)
    {
       this.x = xx;
	   this.y = yy;
    }


    /**
       Draws this rectangle.
    */
    public void draw()
    {
		joe.draw();
    }
	
	public void fill()
	{
		joe.fill();
	}


}
