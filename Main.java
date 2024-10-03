public class Main {
    public static void main (String[] args){
        Spider labalaba = new Spider();
        labalaba.walk();
        labalaba.eat();

        System.out.println();

        Dog leonardo = new Dog();
        leonardo.setName ( "Leonardo");
        leonardo.play();
        leonardo.eat();
        leonardo.walk();

        System.out.println();

        Cat garfil = new Cat();
        garfil.setName( "Garfil");
        garfil.play();
        garfil.eat();
    }
}