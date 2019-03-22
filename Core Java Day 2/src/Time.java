public class Time
{
int hours;
int minutes;

public void setTime(int hours,int minutes)
{
this.hours=hours;
this.minutes= minutes;
}


public void displayTime()
{
System.out.println("Time is "+hours+"hrs and "+minutes+"minutes");
}

public Time addTime(Time t1,Time t2)
{
Time s=new Time();

s.hours=t1.hours+t2.hours;
s.minutes=t1.minutes+t2.minutes;
return s;
}



}