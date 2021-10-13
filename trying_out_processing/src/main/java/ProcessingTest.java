import processing.core.PApplet;

public class ProcessingTest extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;

    int x = 0;

    public static void main(String[] args) { PApplet.main("ProcessingTest", args);
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
        ellipse(x, HEIGHT / 5 , DIAMETER, DIAMETER);

        ellipse(x * 2, HEIGHT * 2 / 5 , DIAMETER, DIAMETER);

        ellipse(x * 3, HEIGHT * 3/ 5 , DIAMETER, DIAMETER);

        ellipse(x * 4, HEIGHT * 4/ 5 , DIAMETER, DIAMETER);

        x++;
        ;

    }
}
