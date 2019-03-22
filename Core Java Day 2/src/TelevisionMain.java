import java.util.*;
class TelevisionMain
{
public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
    System.out.println("Do you want to turn ON/OFF?");
    boolean ch=s.nextBoolean();
    System.out.println("Increase/decrease the volume-");
    int d=s.nextInt();
    System.out.println("Enter channel number to change-");
    int p=s.nextInt();
    Television t=new Television(ch,d,p);
     t.stateChange(t);
	t.increaseOrDecreaseVolume(t);
	t.changeChannel(t);
    
}
}