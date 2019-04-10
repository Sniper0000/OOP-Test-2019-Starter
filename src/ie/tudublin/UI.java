package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet
{	
	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void settings()
	{
		size(500, 800);

		separate(381);
		separate(1);
		separate(92);	
	}

	public void setup() 
	{
		loadColour();
		printColour();
	}

	public void loadColour()
	{
		Table table = loadTable("colour.csv","header");

		for(TableRow row:table.rows())
		{
			Colour colour = new Colour(row);
			colours.add(colour);
		}
	}

	public void printColour()
	{
		for(Colour colour:colours)
		{
			System.out.println(colour);
		}
	}
	
	public void draw()
	{			

	}

	private ArrayList<Colour> colours = new ArrayList<Colour>(); // Array list colours declare
}