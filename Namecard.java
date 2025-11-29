public class Namecard {
    private String name;
    private Integer Phone;
    private String email;

    public Namecard(String name,Integer Phone,String email){
        this.name=name;
        this.Phone=Phone;
        this.email=email;
    }

    public String getName(){
        return this.name;
    }
    public Integer getPhone(){
        return this.Phone;
    }
    public String getemaill(){
        return this.email;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPhone(Integer Phone){
        this.Phone = Phone;
    }
    public void setemall(String email){
        this.email = email;
    }
    void print(){
        System.out.println("Name: "+this.name);
        System.out.println("Phone: "+this.Phone);
        System.out.println("email"+this.email);
    }
}