import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // given a square matrix nxn, a position of queen [row,column], f number of obstacles on the matrix with coordinates
        // [row, column] count how many free areas queen has when she moves before hiting obstacle or edge.


        ChessSettings cs = new ChessSettings(2,3,4,5, new int[]{1, 6}, new int[]{6,6},  new int[]{1,1}, new int[]{6,1},1,6,
                6,1);

        MoverClass mc = new MoverClass(cs);

        List<Integer> stepsX = Arrays.asList(-1,-1,-1,0,1,1,1,0);
        List<Integer> stepsY = Arrays.asList(-1,0,1,1,1,0,-1,-1);

        mc.moveAndCountAll(stepsX, stepsY);
        mc.PrintOutCounter();
    }
}