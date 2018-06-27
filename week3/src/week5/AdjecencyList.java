package week5;

import java.util.ArrayList;

/**
 * Created by boybo on 27-6-2018.
 */
public class AdjecencyList {
    ArrayList<ArrayList<AdjecencyVertex>> adjecencyList;
    public AdjecencyList(){
        adjecencyList = new ArrayList<>();
    }

    public void addVertex(){
        adjecencyList.add(new ArrayList<AdjecencyVertex>());
    }
    public void addEdge(int sourceVertex,int destinationVertex,int weight){
        adjecencyList.get(sourceVertex).add(new AdjecencyVertex(destinationVertex,weight));
    }

    public int getEdgeWeight(int currentVertex,int destinationVertex){
        for(AdjecencyVertex adjecencyVertex:adjecencyList.get(currentVertex)){
            if(adjecencyVertex.getVertexNumber()== destinationVertex){
                return adjecencyVertex.getEdgeWeight();
            }
        }
        return -1;
    }
}
