interface Animal{
    void cat();
}
interface Bird{
    void eat();
}
class Random implements Animal,Bird{
    public void eat(){
        System.out.println("eating");
    }
}
class bs3{
    public static void main(String[]args){
        Random r = new Random();
        r.eat();
    }
}