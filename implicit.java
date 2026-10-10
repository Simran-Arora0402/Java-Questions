class poly1{
    public float add(int a,float b){
        return a + b;
    }
    public float add(int a,int b){
        return a+b;
    }
}
class implicit{
    public static void main(String args[]){
        poly1 p = new poly1();
        System.out.println(p.add(4,5));
        System.out.println(p.add(4,7));
    }
}