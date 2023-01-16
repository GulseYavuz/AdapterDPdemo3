
public class MyWomanAdapter extends WomanAdapter{
    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    private int birthday;
    @Override
    public void doGossip() {
        System.out.println("gossip about celebrities");

    }

    @Override
    public boolean isHappy(int date) {

        if(getBirthday() < date){
            return true;

        }else {
            return false;
        }
    }
}
