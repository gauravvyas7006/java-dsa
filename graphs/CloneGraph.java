import java.util.*;

public class CloneGraph {
    static class Node {
        int val;
        List<Node> neighbors;
        Node(int val) { this.val = val; this.neighbors = new ArrayList<>(); }
    }

    Map<Node, Node> visited = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) return null;
        if (visited.containsKey(node)) return visited.get(node);
        Node clone = new Node(node.val);
        visited.put(node, clone);
        for (Node neighbor : node.neighbors) {
            clone.neighbors.add(cloneGraph(neighbor));
        }
        return clone;
    }
}
