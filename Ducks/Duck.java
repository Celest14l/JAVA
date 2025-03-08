abstract public class Duck {
    QuackBehaviour quackBehaviour;
    SwimBehaviour swimBehaviour;
    FlyBehaviour flyBehaviour;

    public void setFlyBehaviour(FlyBehaviour flyBehaviour){
        this.swimBehaviour = swimBehaviour;
    }

    public void performFly(){
        flyBehaviour.fly();
    }

    public void setSwimBehaviour(SwimBehaviour swimBehaviour){
        this.swimBehaviour = swimBehaviour;
    }

    public void performSwim() {
        swimBehaviour.swim();
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour){
        this.quackBehaviour=quackBehaviour;
    }
    abstract public void display();
    public void performQuack(){
        quackBehaviour.quack();
    }
}
