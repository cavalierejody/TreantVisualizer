package it.jody.TreantVisualizer.domain.treant.node;

import java.util.ArrayList;

public class Node {

    private transient String id;
    private transient Node parent;
    private TextNode text;
    private ArrayList<Node> children = new ArrayList<Node>();

    public Node(String id, Node parent) {
        this.id = id;
        this.parent = parent;
        if (parent != null) parent.addChild(this);
        text = new TextNode();
    }

    public static Node newRootNode() {

        String id = "root";
        return new Node(id, new Node(id, null));
    }

    public static Node newRootNode(String id) {

        if (id == null) id = "root";
        return new Node(id, new Node(id, null));
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public ArrayList<Node> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Node> children) {
        this.children = children;
    }

    public TextNode getText() {
        return text;
    }

    public void setText(TextNode text) {
        this.text = text;
    }

    public Node addChild(Node childNode)  {

        childNode.parent = this;
        this.children.add(childNode);
        return this;
    }

    public boolean removeCHild(Node childNode) {

        childNode.parent = null;
        return this.children.remove(childNode);
    }

    @Override
    public String toString() {
        return "Node{" +
                "id='" + id + '\'' +
                ", parent=" + parent +
                ", children=" + children +
                '}';
    }
}
