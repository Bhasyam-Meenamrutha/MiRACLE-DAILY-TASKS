package oops;

public  class ShowAbstraction extends  Abs{
    
    double area(int r){
        return (3.14*r*r);
    }
    double peremeter(int r){
        return (2*3.14*r);
    }
    public static void main(String[] args) {
        Abs a=new ShowAbstraction();
        System.out.println(a.area(5));
        System.out.println(a.peremeter(5));
        a.display();
    }
    
}

abstract  class Abs{
    
    abstract double area(int r);

    abstract double peremeter(int r);

    static void display(){
        System.out.println("Show Abstraction ");
    }

    public static void main(String[] args) {
        //ShowAbstraction sa= new ShowAbstraction();
        display();
    }

}
