import pkg.*;

public class starter implements InputControl {
		private static Car danielCar;
	

	public static void main(String args[])
        {
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
        danielCar = new DanielCarP2(100,300);
		danielCar.fill();
		}
		


		public void onMouseClick(double x, double y){
			// and/or here
			danielCar.translate(10,0);
		}
}