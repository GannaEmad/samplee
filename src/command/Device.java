package command;

public class Device {
    ICommand ON;
    ICommand OFF;
    public Device(ICommand icommON , ICommand icommOFF)
    {
        this.ON= icommON;
        this.OFF=icommOFF;
    }
    public void ClickOn()
    {
        this.ON.execute();

    }
    public void ClickOff()
    {
        this.OFF.execute();
    }


}
