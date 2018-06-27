package week5;

import java.util.ArrayList;

public class EdgeList{
    private ArrayList<Edge> edges;
    public EdgeList(){
        edges = new ArrayList<>();
    }

    public void addEdge(int currentVertex,int destinationVertext,int weight){
        edges.add(new Edge(currentVertex,destinationVertext,weight));
    }

    public Edge findEdge(int currentVertex, int destinationVertex){
        for(Edge edge:edges){
            if(edge.getCurrentVertex() == currentVertex && edge.getDestinationVertex() == destinationVertex){
                return edge;
            }

        }
        return null;
    }

    public ArrayList<Edge> findAllEdgesForVertex(int sourceVertex){
        ArrayList<Edge> allEdges = new ArrayList<>();
        for(Edge edge:edges){
            if(edge.getCurrentVertex() == sourceVertex){
                allEdges.add(edge);
            }

        }
        return allEdges;
    }



}