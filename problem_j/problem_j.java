import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem_j {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        double thickness = Integer.parseInt(in.readLine());
        double forone = (double) (1/thickness);
        double distance = Math.sqrt(forone);
        double result = distance*10;
        System.out.println(String.format(java.util.Locale.US,"%.2f", Math.round(result * 100.0) / 100.0));
    }
}
