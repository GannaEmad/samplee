package command;

public class TvON implements ICommand{
    TV tv;
    public TvON(TV tv)
    {
        this.tv=tv;
    }

    @Override
    public void execute() {
        tv.ON();
    }
}

