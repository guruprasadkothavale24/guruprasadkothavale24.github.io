// Team Fearless — Java Robot Demo
public class RobotDemo {
    static int move(int position, int speed) {
        return position + speed;
    }

    public static void main(String[] args) {
        System.out.println("Position: " + move(0, 50));
    }
}
