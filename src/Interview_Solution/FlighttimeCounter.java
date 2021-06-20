package Interview_Solution;

public class FlighttimeCounter extends Aircraft {

    public static double fullTime(long distance, int speed){
        return (double) distance / speed;
    }

    public static double ninetyPercentTime(long distance, int speed){
        return (double) (distance / speed) * 0.9;
    }

}
