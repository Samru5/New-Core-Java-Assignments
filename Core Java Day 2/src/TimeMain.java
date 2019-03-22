class TimeMain
{
public static void main(String args[])
{
Time t1=new Time();
t1.setTime(7,30);
t1.displayTime();

Time t2=new Time();
t2.setTime(8,45);
t2.displayTime();

Time s=new Time();

s=s.addTime(t1,t2);
System.out.println("Sum of 2 differnt time  is "+s.hours+"hrs and "+s.minutes+"minutes");
}
}