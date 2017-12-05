import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class problem_e {

    public static void main(String[] args) throws IOException{
        ArrayList<Character> temp = new ArrayList<>();
        temp.addAll(Arrays.asList('S', 'A', 'N', 'T', 'A', 'C', 'L', 'A', 'U', 'S'));
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine().toUpperCase();
        in.close();
        String res = "";
        boolean blockflag = false;
        for(int i = 0; i < s.length(); i++){
            if(blockflag){
                if(s.charAt(i) == ' '){
                    blockflag = false;
                    continue;
                }else{
                    continue;
                }
            }
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
            if(temp.contains(s.charAt(i))){
                res+=s.charAt(i);
                temp.remove(temp.indexOf(s.charAt(i)));
            }else if(s.charAt(i) == ' '){
                res+= ' ';
            }else if(s.charAt(i) == '.' || s.charAt(i) == ',' || s.charAt(i) == ';' || s.charAt(i) == ':'){

            }
            else{
                res = "";
                temp.clear();
                temp.addAll(Arrays.asList('S', 'A', 'N', 'T', 'A', 'C', 'L', 'A', 'U', 'S'));
                blockflag = true;
            }
        }
        if(temp.size() == 0 && !res.equals("SANTA CLAUS")){
            System.out.println(res);
        }

    }

}
