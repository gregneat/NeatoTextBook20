//HIDE
package pkg;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class Rectangle implements Shape
{
    private Color color = Color.BLACK;
	private Point rotate;
    private boolean filled = false;
    private double x;
    private double y;
    private double width;
    private double height;
	private Double angle = null;
	private double converter = (Math.PI/180);

    /**
       Constructs an empty rectangle.
    */
    public Rectangle()
    {
        x = 0;
        y = 0;
        width = 10;
        height = 10;
    }       

    /**
       Constructs a rectangle.
       @param x the leftmost x-coordinate
       @param y the topmost y-coordinate
       @param width the width
       @param height the height
    */
    public Rectangle(double x, double y, double width, double height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
	public Rectangle (double x, double y, double width, double height, Double angle){
		rotate = new Point(x, y);
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.angle = angle;
	}

    /**
       Gets the leftmost x-position of this rectangle.
       @return the leftmost x-position
    */
	public Double getAngle() {
		return angle;
	}
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

    /**
       Gets the width of this rectangle.
       @return the width
    */    
    public int getWidth()
    {
        return (int) Math.round(width);
    }

    /**
       Gets the height of this rectangle.
       @return the height
    */    
    public int getHeight()
    {
        return (int) Math.round(height);
    }

    /**
       Moves this rectangle by a given amount.
       @param dx the amount by which to move in x-direction
       @param dy the amount by which to move in y-direction
    */
    public void translate(double dx, double dy)
    {
        x += dx;
        y += dy;
        Canvas.getInstance().repaint();
    }

    /**
       Resizes this rectangle both horizontally and vertically.
       @param dw the amount by which to resize the width on each side
       @param dw the amount by which to resize the height on each side
    */
    public void grow(double dw, double dh)
    {
        width += 2 * dw;
        height += 2 * dh;
        x -= dw;
        y -= dh;
        Canvas.getInstance().repaint();
    }

    /**
       Sets the color of this rectangle.
       @param newColor the new color
    */
    public void setColor(Color newColor)
    {
        color = newColor;
        Canvas.getInstance().repaint();
    }

    /**
       Draws this rectangle.
    */
    public void draw()
    {
		if(angle != null){
			Line top = new Line(rotate, rotate.translate(width, 0).rotatePoint(rotate, angle));
			Line side1 = new Line(rotate, rotate.translate(0,height).rotatePoint(rotate,angle));
			Line side2 = new Line(side1.getYPoint(),side1.getYPoint().translate(width, 0).rotatePoint(side1.getYPoint(),angle));
			Line bottom = new Line(top.getYPoint(), top.getYPoint().translate(0, height).rotatePoint(top.getYPoint(), angle));
			top.draw();
			side1.draw();
			side2.draw();
			bottom.draw();
			
		}
		else{
			filled = false;
			Canvas.getInstance().show(this);
		}
    }

    /**
       Fills this rectangle.
    */
    public void fill()
    {
        filled = true;
        Canvas.getInstance().show(this);
    }

    public String toString()
    {
		if(angle!=null){
			return "Rectangle[x=" + getX() + ",y=" + getY() + ",width=" + getWidth() + ",height=" + getHeight() + ",angle=" + getAngle() + "]";
		}
		else{
			return "Rectangle[x=" + getX() + ",y=" + getY() + ",width=" + getWidth() + ",height=" + getHeight() + "]";
		}
    }

    public void paintShape(Graphics2D g2)
    {
		Rectangle2D.Double rect = new Rectangle2D.Double(getX(), getY(),
				getWidth(), getHeight());
		g2.setColor(new java.awt.Color((int) color.getRed(), (int) color.getGreen(), (int) color.getBlue()));
		if (filled)
		{
			g2.fill(rect);
		}
		else
		{
			g2.draw(rect);
		}
    }
}
