public class Distance
{
int feet;
float inches;

public void setDistanceValues(int feet,float inches)
{
this.feet=feet;
this.inches=inches;
}


public void display()
{
System.out.println("Distance is "+feet+"feet and "+inches+"inches");
}

public Distance add(Distance d1,Distance d2)
{
Distance s=new Distance();
s.feet=d1.feet+d2.feet;
s.inches=d1.inches+d2.inches;
return s;
}
}