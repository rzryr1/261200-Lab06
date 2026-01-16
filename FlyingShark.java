public class FlyingShark extends Shark implements Flyable{

    @Override
    public void fly() {
        System.out.println("FlyingShark is gliding through the air! (I know it's impossible but who cares!)");
    }


    public void eat(Flyable creatures){
        System.out.println(this + " is eating " + creatures);
    }

    @Override
    public void swim() {

    }
}
