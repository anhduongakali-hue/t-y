//fixed code

public class motorbiketester {
    public static void main(String[] args){
        motorbike mb1 = new motorbike(10.5,60.0,"AB1234");
        mb1.print();
        mb1.accelarate(15.0);
        mb1.print();
        mb1.decelarate(20.0);
        mb1.print();
    }
}
