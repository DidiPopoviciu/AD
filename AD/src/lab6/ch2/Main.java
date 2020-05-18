package lab6.ch2;

public class Main {

    public static void main(String[] args) {
        Running rl = new Running(33, "Red");
        Running rr = new Running(33, "Red");
        try {
            Pair running = new Pair<Running>(rl, rr);
            System.out.println(running.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }

        Heel hr = new Heel(30, "Blue");
        Heel hl = new Heel(30, "Blue");

        try {
            Pair heels = new Pair<Heel>(hl, hr);
            System.out.println(heels.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
