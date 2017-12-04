import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class problem_d {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int curSnow = 0;
        ArrayList<Integer> results = new ArrayList<>();
        Map<String, Integer> keys = new HashMap<>();
        keys.put("heavy snowing", 10);
        keys.put("snowing", 5);
        keys.put("light rain", -3);
        keys.put("heavy rain", -8);
        keys.put("cloudy", 0);
        keys.put("sunshine", -1);
        while(!(s = in.readLine()).equals("end")){
            curSnow = curSnow + keys.get(s);
            results.add(curSnow);
        }
        for(int i : results) System.out.println(i);
    }
}
