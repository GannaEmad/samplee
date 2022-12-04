package command;

public class LightBulbON implements ICommand{
    LightBulb LIGHT;
    public LightBulbON( LightBulb LIGHT)
    {
        this.LIGHT=LIGHT;
    }
    @Override
    public void execute() {
        LIGHT.ON();

    }
}