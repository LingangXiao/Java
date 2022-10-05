package This;

public class Car {
    public Car(){
        System.out.println("无参数构造器 " + this);
    }

    public void run() {
        System.out.println("这是方法中的this " + this);
    }

    //this一般出现在有参数构造器中
    String name;
    double price;

    /*public Car(String name, double price) {
        name = name;
        price = price;
        如果我们直接name = name， 根据java的就近原则，并不会赋值到对象上，只会原地赋值传进来的数据
        所以我们需要用this
    }*/
    public Car(String name, double price) {
        this.name = name;
        this.price = price; //这样就可以正常的赋值了
    }

}
