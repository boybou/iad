package week5;

/**
 * Created by boybo on 27-6-2018.
 */
public class AdjecencyVertex {
    private int vertexNumber;
    private int edgeWeight;

    public AdjecencyVertex(int vertexNumber, int edgeWeight) {
        this.vertexNumber = vertexNumber;
        this.edgeWeight = edgeWeight;
    }

    public int getVertexNumber() {
        return vertexNumber;
    }

    public void setVertexNumber(int vertexNumber) {
        this.vertexNumber = vertexNumber;
    }

    public int getEdgeWeight() {
        return edgeWeight;
    }

    public void setEdgeWeight(int edgeWeight) {
        this.edgeWeight = edgeWeight;
    }
}
