import java.util.Arrays;
import java.util.List;

public class ChessSettings {

    Point queenStartPoint = new Point(5,3);
    public int surfCounter = 0;

    // allowed steps for exercise scope
    List<Integer> stepsX = Arrays.asList(-1,-1,-1,0,1,1,1,0);
    List<Integer> stepsY = Arrays.asList(-1,0,1,1,1,0,-1,-1);

    // edges diagonally

    public Point edgeUpLeft = new Point(1,6);
    public Point edgeUpRight = new Point(6,6);
    public Point edgeDownLeft = new Point(6,6);
    public Point edgeDownRight = new Point(6,6);

    //edges crossly
    public Point leftXEdge = new Point(1,0);
    public Point rightXEdge = new Point(6,0);
    public Point upYedge = new Point(0,6);
    public Point downYedge = new Point(0,1);

    // obstacles coordinates
    public Point obst1 = new Point(2,3);
    public Point obst2 = new Point (4,5);


}
