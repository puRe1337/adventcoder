import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class problem_b {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;
        ArrayList<Integer> days = new ArrayList<>();
        while(!(s = in.readLine()).equals("end")){
            for(String c : s.split(" ")){
                if(c.length() > 2){
                    continue;
                }
                days.add(Integer.parseInt(c));
            }
        }
        System.out.println(days);
    }
}
