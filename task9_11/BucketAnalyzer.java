package task9_11;

public class BucketAnalyzer {
    private Bucket bucket;

    public BucketAnalyzer(Bucket bucket){
        this.bucket = bucket;
    }

    public int getCountOfBallsOfCertainColor(BallColor color){
        int count = 0;
        for(Ball ball: bucket.getBalls()){
            if (ball.color == color)
                count++;
        }
        return count;
    }

    public double getTotalWeightOfBalls(){
        double totalWeight = 0;
        for(Ball ball: bucket.getBalls()){
            totalWeight += ball.weight;
        }
        return totalWeight;
    }
}
