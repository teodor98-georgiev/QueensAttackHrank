import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // given a square matrix nxn, a position of queen [row,column], f number of obstacles on the matrix with coordinates
        // [row, column] count how many free areas queen has when she moves before hiting obstacle or edge.


        ChessSettings cs = new ChessSettings(2,3,4,5, new int[]{1, 6}, new int[]{6,6},  new int[]{1,1}, new int[]{6,1},1,6,
                6,1);
        //left
        MoverClass mc = new MoverClass(cs);
//        int freeSurfaces = mc.moveAndCountSingle(-1,0); // OK
//
//        //upLeft
//        int freeSurfaces2 = mc.moveAndCountSingle(-1,1);
//
//        // up
//        int freeSurfaces3 = mc.moveAndCountSingle(0,1);
//
//        // upRight
//        int freeSurfaces4 = mc.moveAndCountSingle(1,1);
//
//        //right
//        int freeSurfaces5 = mc.moveAndCountSingle(1,0);
//
//        // downRight
//        int freeSurfaces6 = mc.moveAndCountSingle(1,-1);
//
//        // down
//        int freeSurfaces7 = mc.moveAndCountSingle(0,-1);
//
//        //downLeft
//        int freeSurfaces8 = mc.moveAndCountSingle(-1,-1);

        List<Integer> stepsX = Arrays.asList(-1,-1,-1,0,1,1,1,0);
        List<Integer> stepsY = Arrays.asList(-1,0,1,1,1,0,-1,-1);
        for (int c = 0; c < 8; c++){
            int freeSurfaces = mc.moveAndCountSingle(stepsX.get(c),stepsY.get(c));
            System.out.println(freeSurfaces);
        }

//        System.out.println(freeSurfaces);
//        System.out.println(freeSurfaces2);
//        System.out.println(freeSurfaces3);
//        System.out.println(freeSurfaces4);
//        System.out.println(freeSurfaces5);
//        System.out.println(freeSurfaces6);
//        System.out.println(freeSurfaces7);
//        System.out.println(freeSurfaces8);
    }
}