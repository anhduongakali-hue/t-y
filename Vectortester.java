public class Vectortester {
    public static void main(String[] args){
        Vector v1 = new Vector(5.0,10.0);
        Vector v2 = new Vector(7.0,2.0);
        v1.add(v2);
        v1.subtract(v2);
        v1.multiply(v2);
        v1.print();
    }
}
