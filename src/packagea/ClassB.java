package packagea;

public class ClassB extends ClassA{
    public static String name = "Neelmani";

    //Constructor
    public ClassB(){
        super();
        this.name = "Neel";
    }
    //parameterized constructor //Constructor Overloading
    public ClassB(String name){
        this.name = name;
    }

    static {
        System.out.println("Hi " +name);
    }

    /*public static void main(String[] args) {
        System.out.println("Hi " +name);
    }*/


    public  int getAge(String name){
        if("Neeraj".equalsIgnoreCase(name)){
            return 50;
        } else if("Neelmani".equalsIgnoreCase(name)){
            return 22;
        } else{
            System.out.println("Hello Mr. X, I can only tell age of Neeraj or Neelmani. Sorry!");
            return 0;
        }
    }
}
