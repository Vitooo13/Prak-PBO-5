public class Dog extends Animal implements Pet {

    public Dog(int legs) {
        super(4);
    }

    public Dog() {
        super(4);
    }

    @Override
    public void setName(String name){
        System.out.println("Nama Anjing :" + name);
    }

    @Override
    public String getName(){
        return this.getName();
    }

    @Override
    public void play(){
        System.out.println("Bermain tangkap stik kayu");
    }

    @Override
    public void eat(){
        System.out.println("makan daging");
    }

    @Override
    public void walk(){
        System.out.println("jalan bersama tuannya");
    }
}