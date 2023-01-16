public class WomanAdapter implements Women {
    @Override
    public void doMakeUp() {
        System.out.println("Ouch! eyeliner poke my eye..");
    }

    @Override
    public void beWife() {
        System.out.println("I love my husband");
    }

    @Override
    public void doGossip() {

    }

    @Override
    public boolean isHappy(int date) {
        return true;
    }
}
