import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class problem_g {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;
        String result = "";
        while((s = in.readLine()) != null){
            if(s.isEmpty()){
                break;
            }
            List<Character> chars = new ArrayList<>();
            for(char c : s.toCharArray()){
                chars.add(c);
            }
            for(int i = 0; i < chars.size(); i++){
                for(int j = 0; j < chars.size(); j++){
                    if(chars.get(j).equals(' ') && chars.get(j+1).equals(' ')){
                        chars.remove(j+1);
                    }
                }
            }
            StringBuilder builder = new StringBuilder(chars.size());
            for(Character ch : chars){
                builder.append(ch);
            }
            String temp = builder.toString();
            String[] words = temp.split(" ");
            boolean caps = false;
            boolean capsFlag = false;
            for(int i = 0; i < words.length; i++){
                char[] currentWord = words[i].toCharArray();
                for(int j = 0; j < currentWord.length; j++){
                    if(Character.isUpperCase(currentWord[j]) && j != 0){
                        if(capsFlag == true){
                            result+=currentWord[j];
                            continue;
                        }
                        int cnt = 0;
                        for(int k = 0; k < words[i].length(); k++){
                            if(Character.isUpperCase(words[i].charAt(k))){
                                cnt++;
                            }
                        }
                        if(cnt == words[i].length()){
                            result+=currentWord[j];
                            capsFlag = true;
                            continue;
                        }else{
                            capsFlag = false;
                            result+=Character.toLowerCase(currentWord[j]);
                            continue;
                        }
                    }else if(j == 0){
                        result += currentWord[j];
                        continue;
                    }
                    if(caps){
                        result+= Character.toUpperCase(currentWord[j]);
                        caps = false;
                        continue;
                    }
                    if(currentWord[j] == '!' || currentWord[j] == '.' || currentWord[j] == '?'){
                        if(j == currentWord.length-1){
                            System.out.println("test" + " " + currentWord[j]);
                            result+=currentWord[j];
                            continue;
                        }
                        else if(currentWord[j+1] != ' '){
                            result+=currentWord[j] + " ";
                            caps = true;
                            continue;
                        }
                    }
                    result+=currentWord[j];
                }
                capsFlag = false;
                result+= " ";
            }
            result+="\n";
        }
        System.out.println(result);
    }
}
