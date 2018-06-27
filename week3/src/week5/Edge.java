package week5;

/**
 * Created by boybo on 27-6-2018.
 */
public class Edge {
    private int currentVertex;
    private int destinationVertex;
    private int edgeWeight;

    public Edge(int currentVertex, int destinationVertex, int edgeWeight) {
        this.currentVertex = currentVertex;
        this.destinationVertex = destinationVertex;
        this.edgeWeight = edgeWeight;
    }

    public int getCurrentVertex() {
        return currentVertex;
    }

    public void setCurrentVertex(int currentVertex) {
        this.currentVertex = currentVertex;
    }

    public int getDestinationVertex() {
        return destinationVertex;
    }

    public void setDestinationVertex(int destinationVertex) {
        this.destinationVertex = destinationVertex;
    }

    public int getEdgeWeight() {
        return edgeWeight;
    }

    public void setEdgeWeight(int edgeWeight) {
        this.edgeWeight = edgeWeight;
    }
}
