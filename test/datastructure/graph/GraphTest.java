package datastructure.graph;

import datastructure.Stack;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {
    public static void main(String[] args) {
        Vertex v1 = new Vertex("A");
        Vertex v2 = new Vertex("B");
        Vertex v3 = new Vertex("C");
        Vertex v4 = new Vertex("D");
        Vertex v5 = new Vertex("E");

        Graph g = new Graph(5);

        g.addVertex(v1);
        g.addVertex(v2);
        g.addVertex(v3);
        g.addVertex(v4);
        g.addVertex(v5);

        g.addEdge("A","C");
        g.addEdge("B","C");
        g.addEdge("A","B");
        g.addEdge("B","D");
        g.addEdge("B","E");

        for (int[] a:g.getAdjMat()){
            System.out.println(Arrays.toString(a));
        }
        Stack stack = new Stack();
        System.out.println(stack.isEmpty());
    }
}