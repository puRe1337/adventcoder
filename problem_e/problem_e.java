import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem_e {
    public static void main(String[] args) throws IOException{

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line_str;

        line_str = in.readLine();
        int amountOfShops = Integer.parseInt(line_str);
        for (int i = 0; i < amountOfShops; i++) {
            line_str = in.readLine();

            String[] first = line_str.split(";");
            String timeneeded = first[0];
            System.out.println(timeneeded);
            if(first[1].length() > 11){
                String[] openinghrs = first[1].split(" ");
                System.out.println(openinghrs[0] + " " + openinghrs[1]);
            }else{
                String openinghrs = first[1];
                System.out.println(openinghrs);
            }
        }
    }
}
