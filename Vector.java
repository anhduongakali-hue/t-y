public class Vector {
    private double x;
    private double y;
    public Vector(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public void setX(double X){
        this.x=X;
    }
    public void setY(double Y){
        this.y=Y;
    }
    public void add(Vector v){
        this.x += v.getX();//this.x = this.x + v.getX();
        this.y += v.getY();//this.y = this.y + v.getY();
    }
    public void subtract(Vector v){
        this.x -= v.getX();//this.x = this.x - v.getX();
        this.y -= v.getY();//this.y = this.y - v.getY();
    }
    public void multiply(Vector ve){
        this.x *= ve.getX();//this.x = this.x * v.getX();
        this.y *= ve.getY();//this.y = this.y * v.getY();
    }
    public void print(){
        System.out.println("X:"+this.x);
        System.out.println("Y:"+this.y);
    }
}
