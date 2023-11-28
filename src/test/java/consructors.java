public class consructors {

    consructors(){
        this(11,"forex");
        System.out.println("Non parametarized constructor");
    }
    consructors(int eNo,String Dept ){
        this(10);
        System.out.println("2 parametarized constructor");
    }
    consructors(int eNo ){
     //this();
        System.out.println("1 parametarized constructor");
    }
    public static void main(String[] args){
        consructors cont= new consructors();
    }
}
