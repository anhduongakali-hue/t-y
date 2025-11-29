public class motorbike {
    private double fuel;
    private double speed;
    private String license;
    public motorbike(double fuel,double speed,String license ){
        this.fuel = fuel;
        this.speed = speed;
        this.license = license;
    }
    public double getfuel(){
        return this.fuel;
    }
    public double getspeed(){
        return this.speed;
    }
    public String getlicense(){
        return this.license;
    }
    public void setfuel(double fuel){
        this.fuel = fuel;
    }
    public void setspeed(double speed){
        this.speed = speed;
    }
    public void setlicense(String license){
        this.license = license;
    }
    public void accelarate(double d){
        this.speed += d;  
    }
    public void decelarate(double d){
        this.speed -= d;
        if(this.speed < 0){
            this.speed = 0;
        }
    }
    public void print(){
        System.out.println("fuel:"+this.fuel);
        System.out.println("speed:"+this.speed);
        System.out.println("license:"+this.license);
    }
}
