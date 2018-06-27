package week5;

/**
 * Created by boybo on 27-6-2018.
 */
public class Test {
    public static void main(String[] args){
        EdgeList edgeList = new EdgeList();
        edgeList.addEdge(1,2,3);
        System.out.println(edgeList.findEdge(1,2).getEdgeWeight());
        EdgeMatrix edgeMatrix = new EdgeMatrix(10);
        edgeMatrix.addEdge(1,2,4);
        System.out.println(edgeMatrix.getEdgeWeight(1,2));
        AdjecencyList adjecencyList = new AdjecencyList();
        adjecencyList.addVertex();
        adjecencyList.addVertex();
        adjecencyList.addVertex();
        adjecencyList.addVertex();
        adjecencyList.addVertex();
        adjecencyList.addVertex();
        adjecencyList.addEdge(0,4,10);
        System.out.println(adjecencyList.getEdgeWeight(0,4));
    }
}
