import java.awt.*;
import java.awt.geom.Line2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class aufgabe_c {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;
        List<Point> temp = new ArrayList<>();
        int count = 0;
        while((s = in.readLine()) != null){
            String[] splitted = s.split(",");
            temp.add(new Point(Integer.parseInt(splitted[0]),Integer.parseInt(splitted[1])));
            count++;
            if(count == 4){
                break;
            }
        }
        Line2D line1 = new Line2D.Double(temp.get(0), temp.get(1));
        Line2D line2 = new Line2D.Double(temp.get(2), temp.get(3));
        if(temp.get(0).equals(temp.get(3)) || temp.get(2).equals(temp.get(1))){
            System.out.println("not crossing");
        }
        else {
            if (line1.intersectsLine(line2)) {
                System.out.println("crossing");
            } else {
                System.out.println("not crossing");
            }
        }
    }
}
