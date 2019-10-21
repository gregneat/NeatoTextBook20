import pkg.*;

public class ArinCarP6 
{
				public static Rectangle r;
				public static Ellipse e;
				public static Ellipse g;
				public static Ellipse o;
				public static Ellipse v;
				public static Rectangle u;
				public static Rectangle h;
				public static Ellipse p;
				public static Rectangle t;
				public static Ellipse b;
				public static Ellipse l;
				public static Ellipse m;
				public static Ellipse n;
				public static Rectangle k;
				public static Rectangle q;
				
				
        public ArinCarP6(double x , double y , double scale)
        {
			r = new Rectangle(x, y + 47 * scale , 200 * scale , 20 * scale);
			e = new Ellipse(x + 65 * scale , y + 62 * scale , 40 * scale , 40 * scale);
			g = new Ellipse(x + 105 * scale, y + 62 * scale, 40 * scale, 40 * scale); 
			o = new Ellipse(x + 70 * scale , y + 67 * scale , 30 * scale , 30 * scale);
			v = new Ellipse(x + 110 * scale , y + 67 * scale , 30 * scale , 30 * scale);
			u = new Rectangle(x + 55 * scale , y + 62 * scale , 200 * scale , 20 * scale);
			h = new Rectangle(x + 155 * scale, y + 2 * scale , 80 * scale , 80 * scale);
			p = new Ellipse(x + 153 * scale , y , 20 * scale , 20 * scale);
			t = new Rectangle(x + 215 * scale , y + 27 * scale , 65 * scale , 55 * scale);
			b = new Ellipse(x + 261 * scale , y + 25 * scale , 20 * scale , 20 * scale);
			l = new Ellipse(x + 262 * scale , y + 32 * scale , 15 * scale , 15 * scale);
			m = new Ellipse(x + 235 * scale , y + 62 * scale , 40 * scale , 40 * scale);
			n = new Ellipse(x + 240 * scale , y + 67 * scale , 30 * scale , 30 * scale);
			k = new Rectangle(x + 185 * scale , y + 42 * scale , 8 * scale , 4 * scale);
			q = new Rectangle(x + 210 * scale , y + 7 * scale , 20 * scale , 20 * scale);
			
			u.fill();
			r.setColor(Color.GRAY);
			r.fill();
			e.fill();
			g.fill();
			o.setColor(Color.GRAY);
			o.fill();
			v.setColor(Color.GRAY);
			v.fill();
			h.setColor(Color.RED);
			h.fill();
			p.setColor(Color.RED);
			p.fill();
			t.setColor(Color.RED);
			t.fill();
			b.setColor(Color.RED);
			b.fill();
			l.setColor(Color.YELLOW);
			l.fill();
			m.fill();
			n.setColor(Color.GRAY);
			n.fill();
			k.fill();
			q.fill();
		}
		
		public void translate(double x, double y){
			// and/or here
	        r.translate(x,y);
			e.translate(x,y);
			g.translate(x,y);
			o.translate(x,y);
			v.translate(x,y);
			p.translate(x,y);
			h.translate(x,y);
			t.translate(x,y);
			b.translate(x,y);
			l.translate(x,y);
			m.translate(x,y);
			n.translate(x,y);
			k.translate(x,y);
			q.translate(x,y);
			u.translate(x, y);
		}
}
