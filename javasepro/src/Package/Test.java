package Package;

import Package.PackageExtend.Id;

public class Test {
    /*理解包的含义
    * 用一个包下的两个类，可以直接来互相访问
    * 不同包内的类，需要先导包才可以访问
    * */
    public static void main(String[] args) {
        System.out.println(User.onlineNumber); // 因为和User在一个包，可以直接访问
    }

    Id i = new Id(); //因为这个Id在另外一个包里，需要先import Id的包才可以

    /*如果这个类中使用不同包下的相同类名，只能默认导入其中用一个类的包，另一个类要使用全名访问*/
//    Package.PackageExtend2.Id i2 = new Package.PackageExtend2.Id();
    // Id i2 = new Id() 是一样的，但是要用全称，不然计算机会不知道要用哪个
}
