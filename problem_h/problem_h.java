import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class problem_h {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;
        List<Point> points = new ArrayList<>();
        while((s = in.readLine()) != null){
            if(s.equals("end")){
                break;
            }
            String[] cur_points = s.split(" ");
            points.add(new Point(Integer.parseInt(cur_points[0]), Integer.parseInt(cur_points[1])));
        }

        int numPoints = points.size();
        double area = 0;
        int j = numPoints-1;
        for(int i = 0; i < numPoints; i++){
            area = area + (points.get(j).getX() + points.get(i).getX()) * (points.get(j).getY() - points.get(i).getY());
            j=i;
        }
        double result = area/2;
        System.out.println(String.format(java.util.Locale.US,"%.2f",Math.round(result * 100.0) / 100.0));
    }
}