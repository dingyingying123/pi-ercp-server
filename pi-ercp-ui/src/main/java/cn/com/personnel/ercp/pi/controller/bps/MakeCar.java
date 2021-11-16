package cn.com.personnel.ercp.pi.controller.bps;

public class MakeCar {
    public static final int WHEEL_NUMBER = 4;
    private String bodyColor;

    public MakeCar madeCar(String bodyColor){
        MakeCar makeCar = new MakeCar();
        makeCar.bodyColor = bodyColor;
        return makeCar;
    }

    public String getBodyColor(){
        return this.bodyColor;
    }
}
