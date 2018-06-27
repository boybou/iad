package week5;

import java.util.ArrayList;

/**
 * Created by boybo on 27-6-2018.
 */
public class Pad {
    private int beginVertex;
    private int eindVertex;
    private ArrayList<Edge> edges;

    public Pad(int beginVertex, int eindVertex, ArrayList<Edge> edges) {
        this.beginVertex = beginVertex;
        this.eindVertex = eindVertex;
        this.edges = new ArrayList<>();
    }
    public Pad(Pad pad,int eindVertex,Edge edge){
        this.beginVertex = pad.beginVertex;
        this.eindVertex = eindVertex;
        this.edges = pad.edges;
        this.edges.add(edge);
    }

    public void addEdge(Edge edge){
        edges.add(edge);
    }

    public int getTotalWeight(){
        int totaal = 0;
        for(Edge edge: edges){
            totaal += edge.getEdgeWeight();
        }
        return totaal;
    }

    public int getBeginVertex() {
        return beginVertex;
    }

    public void setBeginVertex(int beginVertex) {
        this.beginVertex = beginVertex;
    }

    public int getEindVertex() {
        return eindVertex;
    }

    public void setEindVertex(int eindVertex) {
        this.eindVertex = eindVertex;
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }

    public void setEdges(ArrayList<Edge> edges) {
        this.edges = edges;
    }
}
