import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class problem_f {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;
        List<Integer> all = new ArrayList<>();
        while ((s = in.readLine()) != null){
            String[] temp = s.split(",");
            for(String i : temp){
                all.add(Integer.parseInt(i));
            }
            break;
        }
        int diameter = all.get(0);
        int height = all.get(1);
        int x = all.get(2);
        int y = all.get(3);
        int z = all.get(4);

        int fieldsToFill = ( x - 1 ) * ( y - 1 );

        int marshmallow_volume = diameter * diameter * z * height;
        double negative = Math.PI * ( double )( ( double )diameter / 2 * ( double )diameter / 2 ) * z * height;
        double positive = ( ( double )marshmallow_volume - negative ) * ( double )fieldsToFill;

        System.out.println(String.format(java.util.Locale.US,"%.2f", Math.round(positive * 100.0) / 100.0));
    }

}

