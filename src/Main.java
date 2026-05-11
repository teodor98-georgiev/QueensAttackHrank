import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // given a square matrix nxn, a position of queen [row,column], f number of obstacles on the matrix with coordinates
        // [row, column] count how many free areas queen has when she moves before hiting obstacle or edge.


        ChessSettings cs = new ChessSettings();

        MoverClass mc = new MoverClass(cs);

        mc.moveAndCountAll(cs);
        mc.PrintOutCounter();
    }
}