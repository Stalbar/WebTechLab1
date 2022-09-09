package task9_11;

import java.util.ArrayList;

public class Bucket {
    private ArrayList<Ball> balls;

    public Bucket(){
        balls = new ArrayList<Ball>();
    }

    public void addBall(BallColor color, double weight){
        Ball ball = new Ball(color, weight);
        balls.add(ball);
    }

    public ArrayList<Ball> getBalls(){
        return  balls;
    }
}
