import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class problem_e {

    public static void main(String[] args) throws IOException{
        ArrayList<Character> charBase = new ArrayList<>();
        charBase.addAll(Arrays.asList('S', 'A', 'N', 'T', 'A', 'C', 'L', 'A', 'U', 'S'));
        ArrayList<Character> temp = new ArrayList<>();
        temp = charBase;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine().toUpperCase();
        in.close();
        String res = "";
        for(int i = 0; i < s.length(); i++){
            if(temp.size() == 0){
                if(res.equals("SANTA CLAUS")){
                    temp.addAll(Arrays.asList('S', 'A', 'N', 'T', 'A', 'C', 'L', 'A', 'U', 'S'));
                    res = "";
                    continue;
                }else{
                    System.out.println(res);
                    temp.addAll(Arrays.asList('S', 'A', 'N', 'T', 'A', 'C', 'L', 'A', 'U', 'S'));
                    res = "";
                }
            }
            if(s.charAt(i) == ' '){
                res+=' ';
                continue;
            }
            if(temp.contains(s.charAt(i))){
                res+=s.charAt(i);
                temp.remove(temp.indexOf(s.charAt(i)));
            }else{
                res = "";
            }
        }

    }


}
