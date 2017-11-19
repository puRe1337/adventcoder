import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class problem_b {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;
        Map<String, Integer> temp = new LinkedHashMap<>();
        while((s = in.readLine()) != null) {
            if(s.equals("stop")){
                break;
            }
            if (temp.containsKey(s)) {
                temp.put(s, temp.get(s) + 1);
            } else {
                temp.put(s, 1);
            }
        }
        for(Map.Entry<String, Integer> entry : temp.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getValue() + " " + entry.getKey() + "s");
            }else{
                System.out.println(entry.getValue() + " " + entry.getKey());
            }
        }
    }
}
