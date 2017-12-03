import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class problem_c {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;
        ArrayList<Integer> candles = new ArrayList<>();
        ArrayList<Integer> results = new ArrayList<>();
        while(!(s = in.readLine()).equals("end")){
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) != ' '){
                    candles.add((Integer.parseInt(s.charAt(i) + "")));
                }
            }
            int res = 0;
            for(int i : candles){
                res+=i*60;
            }
            res = res / candles.size();
            results.add(res);
            res = 0;
        }
        for(int i : results){
            System.out.println(i);
        }
    }
}
