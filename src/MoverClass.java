import java.util.Arrays;
import java.util.List;

public class MoverClass {
    ChessSettings cs;


    public MoverClass(ChessSettings cs) {
        this.cs = cs;
    }

    public void moveAndCountAll(ChessSettings cs){
        for (int i = 0; i < 8; i++){
            moveAndCountSingle(cs.stepsX.get(i),cs.stepsY.get(i));
            // Debug only below, remove on production
            //System.out.println("debug single:" + cs.surfCounter);
        }
    }

    public void moveAndCountSingle(int xStep, int yStep) {
        Point tempPoint = new Point(cs.queenStartPoint);
        while (true) {
            tempPoint.x = tempPoint.x + xStep;
            tempPoint.y = tempPoint.y + yStep;
            // obstacle check
            if (tempPoint.x == cs.obst1.x && tempPoint.y == cs.obst1.y){
                break;
            }
            if (tempPoint.x == cs.obst2.x && tempPoint.y == cs.obst2.y){
                break;
            }
            cs.surfCounter++;

            // diagonal edges check

            if (tempPoint.x == cs.edgeUpLeft.x && tempPoint.y == cs.edgeUpLeft.y){
                break;
            }
            if (tempPoint.x == cs.edgeUpRight.x && tempPoint.y == cs.edgeUpRight.y){
                break;
            }
            if (tempPoint.x == cs.edgeDownLeft.x && tempPoint.y == cs.edgeDownLeft.y){
                break;
            }
            if (tempPoint.x == cs.edgeDownRight.x && tempPoint.y == cs.edgeDownRight.y){
                break;
            }


            // edges crossly check
            if (tempPoint.x == cs.leftXEdge.x || tempPoint.x == cs.rightXEdge.x){
                break;
            }
            if (tempPoint.y == cs.upYedge.y || tempPoint.y == cs.downYedge.y){
                break;
            }
        }
    }

    public void PrintOutCounter() {
        System.out.println(cs.surfCounter);
    }
}