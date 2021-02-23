package packagea;

public class ClassA {

    static{
        System.out.println("Hi Neeraj.");
    }

    public static String name = "Neelmani";

    /*public static void main(String[] args) {
        System.out.println("Hi " +name);
    }*/

    public int getAge(String name){
        if("Neeraj".equalsIgnoreCase(name)){
            return 50;
        } else if("Neelmani".equalsIgnoreCase(name)){
            return 22;
        } else{
            System.out.println("I can only tell age of Neeraj or Neelmani. Sorry!");
            return 0;
        }
    }
}
