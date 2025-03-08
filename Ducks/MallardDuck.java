public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehaviour = new Quack();
        swimBehaviour = new Swimming();
        flyBehaviour = new CanFly();
    }
    @Override
    public void display() {
        System.out.println("I am a Mallard Duck");
    }


}
