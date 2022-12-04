package command;

public  class Main {
    public static void main(String[] args) {
        LightBulb Lightt = new LightBulb();
        LightBulbON LBON = new LightBulbON(Lightt);
        LightBulbOFF LBOFF = new LightBulbOFF(Lightt);
        Device Lightdevice = new Device(LBON, LBOFF);
        //Lightdevice.ClickOn();
        Lightdevice.ClickOff();
        Refrigerator RefObj = new Refrigerator();
        RefrigeratorON RefOn = new RefrigeratorON(RefObj);
        RefrigeratorOFF RefOFF = new RefrigeratorOFF(RefObj);
        Device Refdevice = new Device(RefOn, RefOFF);
        Refdevice.ClickOn();
        //Refdevice.ClickOff();
        TV tvobj =new TV();
        TvON TVON = new TvON(tvobj);
        TvOFF TVOFF = new TvOFF(tvobj);
        Device TVdevice = new Device(TVON, TVOFF);
        TVdevice.ClickOn();
        TVdevice.ClickOff();


    }
}