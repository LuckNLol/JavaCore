package Lesson6.Battle;

public class Human extends Entity implements Fighter{

    public Human(String name) {
        super(name + " the Man");
    }

    @Override
    protected boolean damage(int dhp) {
        return super.damage(dhp);
    }


    @Override
    public void attack(Entity entity) {

    }
}