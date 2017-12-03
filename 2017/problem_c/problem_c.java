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
            int res2 = 0;
            for(int i : candles){
                //res+=i*60;
                res2+=i;
            }
            results.add((res2*6) - (res2*6) % 5);
            res = 0;
            res2 = 0;
            candles.clear();
        }
        for(int i : results) System.out.println(i);
    }
}
