public class Cow {
    private String name;
    private String breed;
    private int age;
    private double weight;
    void moo(){
        System.out.println("Moo!");
    }
    public Cow(String name,String breed,int age ,double weight){
        this.name=name;
        this.breed=breed;
        this.age=age;
        this.weight=weight;
    }
    public String getname(){
        return this.name;
    }
    public String getbreed(){
        return this.breed;
    }
    public int getage(){
        return this.age;
    }
    public double getweight(){
        return this.weight;
    }
    public void setname(String name){
        this.name = name;
    }
    public void setbreed(String breed){
        this.breed =  breed;
    }
    public void setage(int age){
        this.age = age;
    }
    public void setweight(double weight){
        this.weight = weight;
    }
    void print(){
        System.out.println("Name:"+this.name);
        System.out.println("Breed:"+this.breed);
        System.out.println("Age:"+this.age);
        System.out.println("Weight:"+this.weight);
    }
}