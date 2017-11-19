import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class problem_k {
    static int numC = 0;
    static int numL = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int stables = Integer.parseInt(in.readLine());
        String temp = in.readLine();
        List<Character> horses = new ArrayList<>();
        for(char c: temp.toCharArray()){
            horses.add(c);
        }
        for(char c: horses){
            if(c == 'C'){
                numC++;
            }
            if(c == 'L'){
                numL++;
            }
        }
    }

}
