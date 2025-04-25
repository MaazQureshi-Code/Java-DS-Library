
import java.util.LinkedList;

public class Graph_List {

    private  LinkedList<Integer>[] adj;
    private int V; // number if vertices
    private int E; // number of edges

    public Graph_List(int nodes){
        this.V = nodes;
        this.E = 0;
        this.adj = new LinkedList[nodes];
        for(int v= 0; v < V;v++){
            adj[v] = new LinkedList<>();
        }
    }

    public void addEdge(int u , int v){
        adj[u].add(v);
        adj[v].add(u);

    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append(V + " vertices,  " + E + " edges " + "\n");

        for(int v= 0; v  < V; v++){
            sb.append(v + ": ");
            for(int w : adj[v]){
                sb.append(w + " ");
            }
            sb.append("\n");
        }

        return  sb.toString();
    }
    public static void main(String[] args) {
        Graph_List g = new Graph_List(4);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);
        System.out.println(g);
    }
    
}
