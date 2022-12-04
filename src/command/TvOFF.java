package command;

public class TvOFF implements ICommand{
    TV tv;
    public TvOFF(TV tv)
    {
        this.tv=tv;
    }

    @Override
    public void execute() {
        tv.OFF();
    }
}