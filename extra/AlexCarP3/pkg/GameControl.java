//HIDE
package pkg;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class GameControl
{

	private Block[] BlockArray;
	
    public GameControl()
    {
		BlockArray = new Block[50];
		for(int i = 0; i <= BlockArray.length; i++)
		{
			BlockArray[i] = new Block(i*50, 300, "Grass.jpg");
		}
    }

    public void Generate()
    {
        for(int i = 0; i <= BlockArray.length; i++)
		{
			BlockArray[i].draw();
		}
    }
	
}
