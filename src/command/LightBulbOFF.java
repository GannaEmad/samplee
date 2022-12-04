package command;

public class LightBulbOFF implements ICommand{
    LightBulb LIGHT;
    public LightBulbOFF(LightBulb LIGHT)
    {
        this.LIGHT=LIGHT;
    }

    @Override
    public void execute() {
        LIGHT.OFF();
    }
}