import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class problem_g {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;
        String result = "";
        while ((s = in.readLine()) != null) {
            if (s.isEmpty()) {
                break;
            }
            List<Character> chars = new ArrayList<>();
            for (char c : s.toCharArray()) {
                chars.add(c);
            }
            for (int i = 0; i < chars.size(); i++) {
                for (int j = 0; j < chars.size(); j++) {
                    if (chars.get(j).equals(' ') && chars.get(j + 1).equals(' ')) {
                        chars.remove(j + 1);
                    }
                }
            }
            StringBuilder builder = new StringBuilder(chars.size());
            for (Character ch : chars) {
                builder.append(ch);
            }
            String temp = builder.toString();
            String[] words = temp.split(" ");
            boolean caps = false;
            for (int i = 0; i < words.length; i++) {
                char[] currentWord = words[i].toCharArray();
                for (int j = 0; j < currentWord.length; j++) {
                    if (currentWord[j] == ' ') {
                        continue;
                    }
                    if (caps) {
                        result += Character.toUpperCase(currentWord[j]);
                        caps = false;
                        continue;
                    }
                    if (currentWord[j] == '.' || currentWord[j] == '!' || currentWord[j] == '?') {
                        if (j != currentWord.length - 1) {
                            if (currentWord[j + 1] != ' ') {
                                result += currentWord[j] + " ";
                                caps = true;
                            }
                        } else {
                            result += currentWord[j];
                            continue;
                        }
                    }
                    if (Character.isUpperCase(currentWord[j])) {
                        if (isAllCaps(words[i])) {
                            result += currentWord[j];
                            continue;
                        } else if (j == 0) {
                            result += currentWord[j];
                            continue;
                        } else {
                            result += Character.toLowerCase(currentWord[j]);
                            continue;
                        }
                    }
                    result += currentWord[j];
                }
                if (i == words.length - 1) {
                    continue;
                } else {
                    result += " ";
                }
            }

            result += "\n";
        }
        System.out.println(result);
    }

    static boolean isAllCaps(String word){
        int cnt = 0;
        for(int i = 0; i < word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))){
                cnt++;
            } else if(!Character.isAlphabetic(word.charAt(i))){
                cnt++;
            }
        }
        if(cnt == word.length()){
            return true;
        }else{
            return false;
        }
    }
}

