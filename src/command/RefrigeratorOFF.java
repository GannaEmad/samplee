package command;

public class RefrigeratorOFF implements ICommand{
    Refrigerator REFLIGHT;
    public RefrigeratorOFF(Refrigerator REFLIGHT)
    {
        this.REFLIGHT=REFLIGHT;
    }

    @Override
    public void execute() {
        REFLIGHT.OFF();
    }
}
