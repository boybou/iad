package week5;

import java.util.ArrayList;

/**
 * Created by boybo on 27-6-2018.
 */
public class EdgeMatrix {
    int[][] matrix;
    public EdgeMatrix(int dimentie){
        matrix = new int[dimentie][dimentie];
    }

    public void addEdge(int currentVertex,int destinationVertex,int weight){
        matrix[currentVertex][destinationVertex] = weight;
    }

    public int getEdgeWeight(int currentVertex,int destinationVertex){
        return matrix[currentVertex][destinationVertex];
    }
}
