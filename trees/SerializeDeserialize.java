import java.util.*;

public class SerializeDeserialize {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public String serialize(TreeNode root) {
        if (root == null) return "null";
        return root.val + "," + serialize(root.left) + "," + serialize(root.right);
    }

    private int index = 0;

    public TreeNode deserialize(String data) {
        String[] nodes = data.split(",");
        return build(nodes);
    }

    private TreeNode build(String[] nodes) {
        if (index >= nodes.length || nodes[index].equals("null")) { index++; return null; }
        TreeNode node = new TreeNode(Integer.parseInt(nodes[index++]));
        node.left = build(nodes);
        node.right = build(nodes);
        return node;
    }
}
