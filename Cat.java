public class Cat extends Animal implements Pet {

    public Cat(int legs) {
        super(4);
    }

    public Cat() {
        super(4);
    }

    @Override
    public void setName(String name){
        System.out.println("Nama Kucing :" + name);
    }

    @Override
    public String getName(){
        return this.getName();
    }

    @Override
    public void play(){
        System.out.println("Bermain bola");
    }

    @Override
    public void eat(){
        System.out.println("makan ikan");
    }
}