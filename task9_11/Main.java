package task9_11;

public class Main {
    public static void main(String[] args){
        Bucket bucket = new Bucket();
        bucket.addBall(BallColor.blue, 2.5);
        bucket.addBall(BallColor.red, 2.1);
        bucket.addBall(BallColor.white, 1.5);
        bucket.addBall(BallColor.yellow, 1.3);
        bucket.addBall(BallColor.blue, 4.2);
        bucket.addBall(BallColor.blue, 8.6);
        bucket.addBall(BallColor.purple, 7.1);
        bucket.addBall(BallColor.purple, 3.3);
        bucket.addBall(BallColor.yellow, 5.1);
        BucketAnalyzer analyzer = new BucketAnalyzer(bucket);
        int countOfBlueBalls = analyzer.getCountOfBallsOfCertainColor(BallColor.blue);
        double totalWeight = analyzer.getTotalWeightOfBalls();
        System.out.println("Total count of blue balls in bucket: " + countOfBlueBalls);
        System.out.printf("Total weight of balls in bucket: %.2f\n", totalWeight);
    }
}
