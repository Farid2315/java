interface Outer{
    void show();
    interface Inner{
        void display();
    }
}

class Test implements Outer.Inner{
    public void display(){
        System.out.println("display method implemented");
    }
    public void show(){
        System.out.println("show method");
    }
}

public class NestedInterface{
    public static void main(String[] args){
        Test t=new Test();
        t.display();
        t.show();
    }
}
