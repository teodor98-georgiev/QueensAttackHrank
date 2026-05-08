public class MoverClass {
    public int surfCounter = 0;
    ChessSettings cs;


    public MoverClass(ChessSettings cs) {
        this.cs = cs;
    }
    public int moveAndCount(int xStep, int yStep) {
        surfCounter = 0;
        Point point = new Point();
        while (true) {
            point.x = point.x + xStep;
            point.y = point.y + yStep;
            // obstacle check
            if (point.x == cs.obsX1 && point.y == cs.obsY1){
                break;
            }
            if (point.x == cs.obsX2 && point.y == cs.obsY2){
                break;
            }
            surfCounter++;

            // diagonal edges
            if (point.x == cs.edgeUpLeft[0] && point.y == cs.edgeUpLeft[1]){
                break;
            }
            if (point.x == cs.edgeUpRight[0] && point.y == cs.edgeUpRight[1]){
                break;
            }
            if (point.x == cs.edgeDownLeft[0] && point.y == cs.edgeDownLeft[1]){
                break;
            }
            if (point.x == cs.edgeDownRight[0] && point.y == cs.edgeDownRight[1]){
                break;
            }


            // edges crossly
            if (point.x == cs.leftXEdge || point.x == cs.rightXEdge){
                break;
            }
            if (point.y == cs.upYedge || point.y == cs.downYedge){
                break;
            }
        }
        return surfCounter;
    }
}

