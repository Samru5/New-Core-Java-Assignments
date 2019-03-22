class RectangleMain
{
public static void main(String args[])
	{
		double area1=0.0;
		double area2=0.0;
		Rectangle r=new Rectangle(5.0,3.0);
		
		area1=r.calculateArea();
		System.out.println("Area of Rectangle1- "+area1);
		
		Rectangle s=new Rectangle(4.0,2.0);
		area2=s.calculateArea();
		System.out.println("Area of Rectangle2- "+area2);

		if(area1==area2)
		{
			System.out.println("Area of both rectangles is same");
		}
		else
		{
			System.out.println("Area of both rectangles is not same");
		}



	}
}