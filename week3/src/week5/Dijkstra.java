package week5;

import java.util.ArrayList;

/**
 * Created by boybo on 27-6-2018.
 */
public class Dijkstra {
    private ArrayList<Pad> paden;
    private Pad lastPad;
    private EdgeList edgeList;
    private ArrayList<Integer> bezochteVertexes;
    public Dijkstra(EdgeList edgeList){
        bezochteVertexes = new ArrayList<>();
        paden = new ArrayList<>();
        this.edgeList = edgeList;
    }
//    public Pad getPad(int beginVertex,int eindVertex){
//        for(Pad pad:paden){
//            if(pad.getBeginVertex() == beginVertex && pad.getEindVertex() == eindVertex){
//                return pad;
//            }
//        }
//    }

    public void bezoekVertex(int sourceVertex,int destinationVertex){
        bezochteVertexes.add(destinationVertex);
        ArrayList<Edge> tempEdges = edgeList.findAllEdgesForVertex(destinationVertex);
        for(Edge edge: tempEdges){
            if(edge.getDestinationVertex() != sourceVertex){
                addPad(new Pad(lastPad,destinationVertex,edge));
            }
        }

    }

    public void addPad(Pad pad){
        for(Pad x:paden){
            if(pad.getBeginVertex()== x.getBeginVertex() && pad.getEindVertex() == x.getEindVertex() && pad.getTotalWeight() <=x.getTotalWeight()){
                paden.add(pad);
            }
        }
    }
}
