import processing.core.PApplet;

public class ProcessingTest extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int D = 100;
    public static final int DIAMETER = 10;

    int ball1 = 0;
    int ball2 = 0;
    int ball3 = 0;
    int ball4 = 0;

    public static void main(String[] args) {
        PApplet.main("ProcessingTest", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        ellipse(ball1, HEIGHT / 5 , DIAMETER, DIAMETER);
        ball1 = ball1 + 1;

        ellipse(ball2, HEIGHT * 2 / 5 , DIAMETER, DIAMETER);
        ball2 = ball2 + 2;

        ellipse(ball3, HEIGHT * 3/ 5 , DIAMETER, DIAMETER);
        ball3 = ball3 + 3;

        ellipse(ball4, HEIGHT * 4/ 5 , DIAMETER, DIAMETER);
        ball4 = ball4 + 4;

    }



    @Override
    public void delay(int napTime) {
        super.delay(napTime);
        delay(1000);
    }
}
