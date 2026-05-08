public class ChessSettings {

    public int obsX1 = 2;
    public int obsY1 = 3;

    public int obsX2 = 4;
    public int obsY2 = 5;

    // edges diagonally
    public int[] edgeUpLeft = {1,6};
    public int[] edgeUpRight = {6,6};
    public int[] edgeDownLeft = {1,1};
    public int[] edgeDownRight = {6,1};

    //edges crossly
    public int leftXEdge = 1;
    public int rightXEdge = 6;
    public int upYedge = 6;
    public int downYedge = 1;

    public ChessSettings(int obsX1, int obsY1, int obsX2, int obsY2, int[] edgeUpLeft, int[] edgeUpRight, int[] edgeDownLeft, int[] edgeDownRight, int leftXEdge,
                         int rightXEdge, int upYedge, int downYedge) {
        this.obsX1 = obsX1;
        this.obsY1 = obsY1;
        this.obsX2 = obsX2;
        this.obsY2 = obsY2;
        this.edgeUpLeft = edgeUpLeft;
        this.edgeUpRight = edgeUpRight;
        this.edgeDownLeft = edgeDownLeft;
        this.edgeDownRight = edgeDownRight;
        this.leftXEdge = leftXEdge;
        this.rightXEdge = rightXEdge;
        this.upYedge = upYedge;
        this.downYedge = downYedge;
    }
}
