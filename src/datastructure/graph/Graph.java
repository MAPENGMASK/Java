package datastructure.graph;

import datastructure.Stack;

/**
 * 图
 */
public class Graph {
    private Vertex[] vertices;
    private int currentSize;
    //邻接矩阵----二维数组
    private int[][] adjMat;

    private int index;

    public Graph(int size) {
        vertices = new Vertex[size];
        adjMat = new int[size][size];
    }

    public void addVertex(Vertex v){
        vertices[currentSize++] = v;
    }

    public void addEdge(String v1, String v2){
        int x = 0, y = 0;
        for (int i = 0; i < vertices.length; i++){
            if (vertices[i].getValue().equals(v1)){
                x = i;
                break;
            }
        }
        for (int i = 0; i < vertices.length; i++){
            if (vertices[i].getValue().equals(v2)){
                y = i;
                break;
            }
        }

        adjMat[x][y] = 1;
        adjMat[y][x] = 1;
    }

    public int[][] getAdjMat() {
        return adjMat;
    }
    /**
     * 深度优先搜索
     */
    public void dfs(){
        vertices[0].visited = true;
        Stack stack = new Stack();

        stack.push(0);

        out:while (!stack.isEmpty()){
            for (int i = index + 1;i < vertices.length; i++){
                if (adjMat[index][i] == 1 && vertices[i].visited == false){
                    stack.push(i);
                    vertices[i].visited = true;
                    continue out;
                }
            }
            stack.pop();

            if (!stack.isEmpty())
            index = stack.peek();

        }
    }
}
