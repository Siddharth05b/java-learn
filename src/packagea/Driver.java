package packagea;

public class Driver {
    public static void main(String[] args) {
        /*ClassA a = new ClassA();
        ClassB b = new ClassB();*/

//        ClassB b = new ClassB("Neel");

//        ClassA parentA = new ClassB();

//        Mankind human1 = new Mankind();


        /*System.out.println("Age of Neeraj is : " + parentA.getAge("Neeraj"));
        System.out.println("Age of Neelmani is : " + parentA.getAge("Neelmani"));
        System.out.println("Age of Kanhaiya is : " + parentA.getAge("Kanhaiya"));*/

        /*WiseHuman wiseHuman = new WiseHuman();

        wiseHuman.hasLegs();
        wiseHuman.worships();*/

        WiseHuman badHeart = new WiseHumanWithBadHeart();
        WiseHuman goodHeart = new WiseHumanWithGoodHeart();

        badHeart.hasLegs();
        badHeart.worships();
        badHeart.hasHeart();

        goodHeart.hasLegs();
        goodHeart.worships();
        goodHeart.hasHeart();
    }
}
