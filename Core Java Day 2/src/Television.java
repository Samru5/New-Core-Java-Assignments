
public class Television
{   boolean state;
    int currentVolume;
    int currentChannel;


public Television()
{


}
public Television(boolean state,int currentVolume,int currentChannel)
{
    this.state=state;
    this.currentVolume=currentVolume;
    this.currentChannel=currentChannel;
}

public void stateChange(Television t)
{
if(t.state=true)
System.out.println("Television is ON");
else
System.out.println("Television is OFF");



}
public void increaseOrDecreaseVolume(Television t)
{
System.out.println("Your  volume was 20");
if(t.currentVolume>20)
System.out.println("You have increased the volume - "+this.currentVolume);
else
System.out.println("You have decreased the volume - "+this.currentVolume);

}
public void changeChannel(Television t)
{
System.out.println("You are currently watching channel no.- "+this. currentChannel);
}

}
