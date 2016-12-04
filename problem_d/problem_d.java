import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem_d {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int size = 0;
        while((s=in.readLine()) != null){
            size = Integer.parseInt(s);
            if(true){
                break;
            }
        }
        for ( int i = 0; i < size; i++ ) {
            for ( int j = 0; j < i - 1; j++ ) {
                printSpace( size - j - 1 );
                printRaute( 3 + ( j * 2 ) );
                printNewLine( 1 );
            }
            printSpace( size - i );
            printRaute( ( i * 2 ) == 0 ? 1 : i * 2 + 1 );
            printNewLine( 1 );
            printSpace( size - 1 - i );
            printRaute( 3 + ( i * 2 ) );
            printNewLine( 1 );
            printSpace( size );
            printRaute( 1 );
            printNewLine( 1 );
        }
    }

    public static void printRaute(int count){
        for(int i = 0; i < count; i++){
            System.out.print("#");
        }
    }

    public static void printSpace(int count){
        for(int i = 0; i < count; i++){
            System.out.print(" ");
        }
    }

    public static void printNewLine(int count){
        for(int i = 0; i < count; i++){
            System.out.print("\n");
        }
    }
}
