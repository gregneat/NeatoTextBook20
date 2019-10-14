//HIDE
package pkg;
import pkg.*;
import java.awt.Dimension;
import java.awt.Graphics2D;

import javax.swing.JLabel;

public class PixArray 
{
	Picture pic;
	Color[] meh;
	public PixArray(Picture pix)
	{
		int width = pix.getWidth();
		int height = pix.getHeight();
		pic = pix;
		meh = new Color[width*height];
		for(int h = 0;h<height;h++)
		{
			for(int w=0;w<width;w++)
			{
				meh[h*width+w] = pic.getColorAt(w,h);
			}
		}
	}
	public void setArray(Color[] param)
	{
		meh = param;
	}
	public Color getColorAt(int index)
	{
		return meh[index];
	}
	public Color getColorAt(int x,int y)
	{
		return meh[y*pic.getWidth()+x];
	}
	public int getHeight()
	{
		return pic.getHeight();
	}
	public int getWidth()
	{
		return pic.getWidth();
	}
	public Color[] getColorArray()
	{
		return meh;
	}
}