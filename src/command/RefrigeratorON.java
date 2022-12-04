package command;

public class RefrigeratorON implements ICommand{
    Refrigerator REFLIGHT;
    public RefrigeratorON(Refrigerator REFLIGHT)
    {
        this.REFLIGHT=REFLIGHT;
    }

    @Override
    public void execute() {
        REFLIGHT.ON();
    }
}
