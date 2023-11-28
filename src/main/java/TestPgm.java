//public class TestPgm {
//   int x = 10;
//   int y= 20;
//   static void methodOne(){
//       System.out.println("my first method calling");
//
//   }
//     void methodTwo(int amount) {
//         System.out.println("Amount in Dollers"+" $"  +amount);
//     }
//    public static void main(String[] args) {
//        TestPgm myObj1 = new TestPgm();  // Object 1
//        TestPgm myObj2 = new TestPgm();  // Object 2
//        System.out.println(myObj1.x);
//        System.out.println(myObj2.y);
//             myObj1.methodTwo(2000);
//             methodOne();
//
//    }
//}
// public class TestPgm {
//    int modelYear;
//    String modelName;
//
//    public TestPgm(int year, String name) {
//        modelYear = year;
//        modelName = name;
//    }
//
//    public static void main(String[] args) {
//        TestPgm myCar = new TestPgm(1969, "Mustang");
//        System.out.println(myCar.modelYear + " " + myCar.modelName);
//    }
//}
//public class TestPgm {
//    final int x = 10;
//    final double PI = 3.14;
//
//    public static void main(String[] args) {
//        TestPgm myObj = new TestPgm();
//        myObj.x = 50; // will generate an error: cannot assign a value to a final variable
//        myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
//        System.out.println(myObj.x);
//    }
//}
//public class TestPgm {
//    int x;
//
//    public TestPgm(int y) {
//        x = y;
//    }
//
//    public static void main(String[] args) {
//        TestPgm myObj = new TestPgm(10);
//        System.out.println(myObj.x);
//    }
//}
abstract class TestPgm {
    public String fname = "John";
    public int age = 24;
    public abstract void study(); // abstract method
}

// Subclass (inherit from Main)
class Student extends TestPgm {
    public int graduationYear = 2018;
    public void study() { // the body of the abstract method is provided here
        System.out.println("Studying all day long");
    }
}
// End code from filename: Main.java













































