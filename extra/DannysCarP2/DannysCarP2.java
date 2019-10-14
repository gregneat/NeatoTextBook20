import pkg.*;

public class DannysCarP2
	{
		// public static void main(String args[])
		// {
			// DannysCar(100, 100);
			// DannysCar(10, 300);
			// DannysCar(1000, 3);
		// }
		
		public DannysCarP2(int posX, int posY)
		{
			Color whiteTire = new Color(226, 226, 226);
			Color dynacoBlue = new Color(0, 171, 255);
			Color glassyWonder = new Color(210, 230, 235);
			Rectangle windShield = new Rectangle(posX+39.0, posY-5.0, 35.0, 10.0);
			Ellipse shieldedWind = new Ellipse(posX+69.0, posY-5.0, 10.0, 10.0);
			Rectangle chassis = new Rectangle(posX, posY, 95.0, 30.0);
			Ellipse frontBumper = new Ellipse(posX-10.0, posY-1.0, 31.0, 31.0);
			Ellipse backBumper = new Ellipse(posX+80.0, posY-1.0, 31.0, 31.0);
			Ellipse backWheel = new Ellipse(posX, posY, 40.0, 40.0);
			Ellipse frontWheel = new Ellipse(posX+70.0, posY+10.0, 30.0, 30.0);
			
			windShield.setColor(glassyWonder);
			windShield.fill();
			shieldedWind.setColor(glassyWonder);
			shieldedWind.fill();
			chassis.setColor(dynacoBlue);
			chassis.fill();
			frontBumper.setColor(dynacoBlue);
			frontBumper.fill();
			backBumper.setColor(dynacoBlue);
			backBumper.fill();
			backWheel.setColor(whiteTire);
			backWheel.fill();
			frontWheel.setColor(whiteTire);
			frontWheel.fill();
		}
	}