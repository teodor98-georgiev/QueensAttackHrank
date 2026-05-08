public class Main {
    public static void main(String[] args) {
        // given a square matrix nxn, a position of queen [row,column], f number of obstacles on the matrix with coordinates
        // [row, column] count how many free areas queen has when she moves before hiting obstacle or edge.


        ChessSettings cs = new ChessSettings(2,3,4,5, new int[]{1, 6}, new int[]{6,6},  new int[]{1,1}, new int[]{6,1},1,6,
                6,1);
        //left

        MoverClass mc = new MoverClass(cs);
        int freeSurfaces = mc.moveAndCount(-1,0); // OK

        //upLeft


        int freeSurfaces2 = mc.moveAndCount(-1,1);

        // up


        int freeSurfaces3 = mc.moveAndCount(0,1);

        // upRight


        int freeSurfaces4 = mc.moveAndCount(1,1);

        //right


        int freeSurfaces5 = mc.moveAndCount(1,0);

        // downRight


        int freeSurfaces6 = mc.moveAndCount(1,-1);

        // down


        int freeSurfaces7 = mc.moveAndCount(0,-1);

        //downLeft


        int freeSurfaces8 = mc.moveAndCount(-1,-1);



        System.out.println(freeSurfaces);
        System.out.println(freeSurfaces2);
        System.out.println(freeSurfaces3);
        System.out.println(freeSurfaces4);
        System.out.println(freeSurfaces5);
        System.out.println(freeSurfaces6);
        System.out.println(freeSurfaces7);
        System.out.println(freeSurfaces8);
    }
}