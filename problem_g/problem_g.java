import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class problem_g {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s = in.readLine()) != null){
            if(s.isEmpty()){
                break;
            }
            List<Character> chars = new ArrayList<>();
            for(char c : s.toCharArray()){
                chars.add(c);
            }
            System.out.println(chars);
            for(int i = 0; i < chars.size(); i++){
                for(int j = 0; j < chars.size(); j++){
                    if(chars.get(j).equals(' ') && chars.get(j+1).equals(' ')){
                        chars.remove(j+1);
                    }
                }
            }
            String result = "";
            for(char c: chars){
                result+=c;
            }
            System.out.println(result);
        }
    }
}
