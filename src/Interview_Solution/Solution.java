package Interview_Solution;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;


public class Solution {

    public static void main(String[] args) throws IOException, ParseException {

        Aircraft plane = new Aircraft();
        Object obj = new JSONParser().parse(new FileReader("C:\\Users\\User\\IdeaProjects\\Interview_Projects\\src\\Interview_Solution\\tickets.json"));
        JSONObject jo = (JSONObject) obj;
        String fromCity = (String) jo.get("fromCity");
        String toCity = (String) jo.get("toCity");
        long distance = (long) jo.get("distance");

        double firstCounter = FlighttimeCounter.fullTime(distance, plane.speed);
        double secondCounter = FlighttimeCounter.ninetyPercentTime(distance, plane.speed);
        flightTime(fromCity, toCity, firstCounter);
        ninetyPercentflightTime(fromCity, toCity, secondCounter);
    }

    public static void flightTime(String firstCity, String secondCity, double timeCounter) {
        System.out.println(String.format("Время полета из города %s в город %s - %.1f часов", firstCity, secondCity, timeCounter));
    }

    public static void ninetyPercentflightTime(String firstCity, String secondCity, double timeCounter) {
        System.out.println(String.format("Время полета из города %s в город %s - %.1f часов", firstCity, secondCity, timeCounter));
    }

}


