import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class problem_b {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;
        Map<Integer, String> base = new TreeMap<>();
        base.put(1, "Friday");
        base.put(2, "Saturday");
        base.put(3, "Sunday");
        base.put(4, "Monday");
        base.put(5, "Tuesday");
        base.put(6, "Wednesday");
        base.put(7, "Thursday");
        ArrayList<Integer> days = new ArrayList<>();
        while(!(s = in.readLine()).equals("end")){
            for(String c : s.split(" ")){
                if(c.length() > 2){
                    continue;
                }
                days.add(Integer.parseInt(c));
            }
        }
        for(int i : days){
            if(i == 7){
                System.out.println(base.get(7));
                continue;
            }
            System.out.println(base.get(i % 7));
        }
    }
}
