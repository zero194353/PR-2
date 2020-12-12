public class BallTest {
    public static void main(String[] args) {
        Ball ball1 = new Ball(1,143,165,"Volleyball");
        Ball ball2 = new Ball(2,0,0,"Basketball");
        System.out.println(ball1);
        System.out.println(ball2);
        ball1.move(25, 0);
        ball2.move(65,34);
        System.out.println(ball1);
        System.out.println(ball2);
    }
}
