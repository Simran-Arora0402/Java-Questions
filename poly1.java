class Adder{
    public int add(int a,int b){
        return a+b;
    }
    public double add(double a, double b, double c){
        return a+b+c;
    }
}
class poly1{
    public static void main(String[]args){
        Adder a = new Adder();
        System.out.println(a.add(32,56));
        System.out.println(a.add(3.2,2.5,6.4));
    }
}
