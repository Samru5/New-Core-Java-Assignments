class DistanceMain
{

	public static void main(String args[])
	{
		Distance d1=new Distance();
		d1.setDistanceValues(12,2.0f);
		d1.display();

		Distance d2=new Distance();
		d2.setDistanceValues(20,5.0f);
		d2.display();

		Distance s=new Distance();
		s=s.add(d1,d2);
	System.out.println("Sum of 2 Distance is "+s.feet+"feet and "+s.inches+"inches");
	}
}