import pkg.*;

public class ArkaCarP6{
    
	public static Rectangle r;
    public static Ellipse a;
	public static Ellipse e;     
    public static Rectangle g;
    public static Rectangle k;
	public static Rectangle l;
    public static Rectangle u;
	public static Ellipse f;
	public static Ellipse o;
	public static Rectangle c;
	public static Rectangle t;
    public static Rectangle h;
    public static Ellipse n; 
    public static Rectangle m;
    public static Rectangle q;
    public static Ellipse j; 
    public static Ellipse d; 
    
	public ArkaCarP6(int X, int Y, double scale){
        r = new Rectangle (X + (125 * scale) , Y + (60*scale) , 150 * scale, 70 * scale);
        a = new Ellipse (X + (295 * scale) , Y + (110 * scale) , 50 * scale , 50 * scale);
        e = new Ellipse (X + (45 * scale) , Y + (110 * scale) , 50 * scale , 50 * scale);
        g = new Rectangle (X + (125 * scale) , Y ,10 * scale , 60 * scale);
        k = new Rectangle (X + (265 * scale) , Y , 10 * scale ,60 * scale);
        l = new Rectangle (X + (125 * scale) , Y , 150 * scale , 10 * scale);
        u = new Rectangle (X + (245 * scale), Y + (90 * scale) , 150 * scale , 40 * scale);
        f = new Ellipse (X + (245 * scale) , Y + (60 * scale) , 150 * scale , 70 * scale);
        o = new Ellipse (X + (10 * scale) , Y + (60 * scale) , 150 * scale , 70 * scale);
        c = new Rectangle (X + (10 * scale) , Y + (90 * scale) , 150 * scale , 40 * scale);
        t = new Rectangle (X + (105 * scale) , Y + (60 * scale), 20 * scale , 20 *scale);
        h = new Rectangle (X + (275 * scale) , Y + (60 * scale) , 30 * scale , 10 * scale);
        n = new Ellipse (X + (375 * scale) , Y + (80 * scale) , 30 * scale , 30 * scale);
        m = new Rectangle (X + (125 * scale) , Y + (60 * scale) , 150 * scale , 70 * scale);
        q = new Rectangle (X + (145 * scale) , Y + (75 * scale) , 30 * scale , 10 * scale);
        j = new Ellipse (X , Y + (80 * scale) , 30 * scale , 30 * scale); 
        d = new Ellipse (X + (5 * scale) , Y + (120 * scale) , 400 * scale , 50 * scale);
        d.setColor(Color.BLUE);
		d.draw();
	    d.fill();
		j.setColor(Color.YELLOW);
		j.draw();
	    j.fill();
		n.setColor(Color.YELLOW);
		n.draw();
	    n.fill();
		h.setColor(Color.RED);
		e.draw();
	    e.fill();
		o.setColor(Color.RED);
		o.draw();
	    o.fill();
		t.setColor(Color.RED);
		t.fill();
		c.fill();
		c.setColor(Color.RED);
		u.setColor(Color.RED);
		f.draw();
	    f.fill();
	    f.setColor(Color.RED);
		k.draw();
	    k.fill();
		l.draw();
	    l.fill();
		g.draw();
	    g.fill();
		a.draw();
		a.fill();
		r.draw();
		r.setColor(Color.RED);
		r.fill();
		u.fill();
		h.draw();
		h.fill();
		m.draw();
		q.draw();
		q.fill();
    }

	public static void translate(double X , double Y){
		r.translate(X , Y);
		e.translate(X , Y);
		a.translate(X , Y);
		k.translate(X , Y);
		l.translate(X , Y);
	    g.translate(X , Y);
		u.translate(X , Y);
		f.translate(X , Y);
		o.translate(X , Y);
		c.translate(X , Y);
		h.translate(X , Y);
		t.translate(X , Y);
	    n.translate(X , Y);
		m.translate(X , Y);
	    q.translate(X , Y);
	    j.translate(X , Y);
	    d.translate(X , Y);
	}
}