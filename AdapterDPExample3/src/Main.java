public class Main {
    public static void main(String[] args) {
        WomanAdapter womanAdapter = new MyWomanAdapter();
        womanAdapter.doMakeUp();
        womanAdapter.isHappy(7);
        womanAdapter.beWife();
        womanAdapter.doGossip();

        System.out.println("-------------------------------");

        MyWomanAdapter myWomanAdapter = new MyWomanAdapter();
        myWomanAdapter.doGossip();
        myWomanAdapter.setBirthday(5);
        System.out.println(womanAdapter.isHappy(7));

    }
}