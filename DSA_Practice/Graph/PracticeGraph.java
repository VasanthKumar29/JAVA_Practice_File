package DSA_Practice.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Vertex {
  String label;

  Vertex(String label) {
    this.label = label;
  }

  @Override
  public String toString() {
    return label;
  }
}

class Graph {
  private Map<Vertex, List<Vertex>> adjVertices;

  Graph() {
    this.adjVertices = new HashMap<>();
  }

  void addVertex(String label) {
    adjVertices.putIfAbsent(new Vertex(label), new ArrayList<>());
  }

  void removeVertex(String label) {
    Vertex v = new Vertex(label);
    adjVertices.values().stream().forEach(e -> e.remove(v));
    adjVertices.remove(new Vertex(label));
  }

  void addEdge(String label1, String label2) {
    Vertex v1 = new Vertex(label1);
    Vertex v2 = new Vertex(label2);
    adjVertices.get(v1).add(v2);
    adjVertices.get(v2).add(v1);
  }

  void removeEdge(String label1, String label2) {
    Vertex v1 = new Vertex(label1);
    Vertex v2 = new Vertex(label2);
    List<Vertex> eV1 = adjVertices.get(v1);
    List<Vertex> eV2 = adjVertices.get(v2);
    if (eV1 != null)
      eV1.remove(v2);
    if (eV2 != null)
      eV2.remove(v1);
  }

  List<Vertex> getAdjVertices(String label) {
    return adjVertices.get(new Vertex(label));
  }

  void printGraph() {
    for (Vertex v : adjVertices.keySet()) {
      System.out.print(v + " -> ");
      for (Vertex w : adjVertices.get(v)) {
        System.out.print(w + " ");
      }
      System.out.println();
    }
  }
}

public class PracticeGraph {
  public static void main(String[] args) {
    Graph graph = new Graph();
    graph.addVertex("A");
    graph.addVertex("B");
    graph.addVertex("C");
    graph.addVertex("D");
    graph.addEdge("A", "B");
    graph.addEdge("A", "C");
    graph.addEdge("B", "D");
    graph.addEdge("C", "D");

    graph.printGraph();
  }
}
