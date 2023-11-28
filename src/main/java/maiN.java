
public class maiN {
    maiN(int sal,String Dept){
        System.out.println(sal+" "+ Dept);
    }

   int x=111;
   int y= 121;
 void employee(int age,  String Ename){
     System.out.println(age +"    "+ Ename);

 }

static void Mystatic(int amount){
     System.out.println(amount+"My firststatic execution");
}
     public static void main(String[] args)   {
       maiN obj= new maiN(102222,"nare-Dept");
//        obj.employee(23, "Naresh");
//                obj.employee(22,  "Kalpana");
         Mystatic(100000);
         Mystatic(500000);
        // System.out.println(obj.x);
        // System.out.println(obj.sal,obj.dept);
         //obj(55000,"Recruiter");
         //maiN();
     }

}
