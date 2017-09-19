package it.jody.TreantVisualizer.domain.treant.chart;

public class Chart {

    private String container;
    private RootOrientation rootOrientation;
    private NodeAlign nodeAlign;
    private Integer levelSeparation;
    private Integer siblingSeparation;
    private Integer subTeeSeparation;
    private Boolean hideRootNode;
    private Boolean animateOnInit;
    private Integer animateOnInitDelay;
    private ScrollBar scrollBar;
    private Integer padding;
    private Connectors connectors;
    private NodeConfig node;
    private Animation animation;
    // private CallBackJS callback; //TODO callback js function

    public Chart(String container) {
        this.container = container;
    }

    public RootOrientation getRootOrientation() {
        return rootOrientation;
    }

    public void setRootOrientation(RootOrientation rootOrientation) {
        this.rootOrientation = rootOrientation;
    }

    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    public NodeAlign getNodeAlign() {
        return nodeAlign;
    }

    public void setNodeAlign(NodeAlign nodeAlign) {
        this.nodeAlign = nodeAlign;
    }

    public Integer getLevelSeparation() {
        return levelSeparation;
    }

    public void setLevelSeparation(Integer levelSeparation) {
        this.levelSeparation = levelSeparation;
    }

    public Integer getSiblingSeparation() {
        return siblingSeparation;
    }

    public void setSiblingSeparation(Integer siblingSeparation) {
        this.siblingSeparation = siblingSeparation;
    }

    public Integer getSubTeeSeparation() {
        return subTeeSeparation;
    }

    public void setSubTeeSeparation(Integer subTeeSeparation) {
        this.subTeeSeparation = subTeeSeparation;
    }

    public Boolean getHideRootNode() {
        return hideRootNode;
    }

    public void setHideRootNode(Boolean hideRootNode) {
        this.hideRootNode = hideRootNode;
    }

    public Boolean getAnimateOnInit() {
        return animateOnInit;
    }

    public void setAnimateOnInit(Boolean animateOnInit) {
        this.animateOnInit = animateOnInit;
    }

    public Integer getAnimateOnInitDelay() {
        return animateOnInitDelay;
    }

    public void setAnimateOnInitDelay(Integer animateOnInitDelay) {
        this.animateOnInitDelay = animateOnInitDelay;
    }

    public ScrollBar getScrollBar() {
        return scrollBar;
    }

    public void setScrollBar(ScrollBar scrollBar) {
        this.scrollBar = scrollBar;
    }

    public Integer getPadding() {
        return padding;
    }

    public void setPadding(Integer padding) {
        this.padding = padding;
    }

    public Connectors getConnectors() {
        return connectors;
    }

    public void setConnectors(Connectors connectors) {
        this.connectors = connectors;
    }

    public NodeConfig getNode() {
        return node;
    }

    public void setNode(NodeConfig node) {
        this.node = node;
    }

    public Animation getAnimation() {
        return animation;
    }

    public void setAnimation(Animation animation) {
        this.animation = animation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chart chart = (Chart) o;

        if (container != null ? !container.equals(chart.container) : chart.container != null) return false;
        if (rootOrientation != chart.rootOrientation) return false;
        if (nodeAlign != chart.nodeAlign) return false;
        if (levelSeparation != null ? !levelSeparation.equals(chart.levelSeparation) : chart.levelSeparation != null)
            return false;
        if (siblingSeparation != null ? !siblingSeparation.equals(chart.siblingSeparation) : chart.siblingSeparation != null)
            return false;
        if (subTeeSeparation != null ? !subTeeSeparation.equals(chart.subTeeSeparation) : chart.subTeeSeparation != null)
            return false;
        if (hideRootNode != null ? !hideRootNode.equals(chart.hideRootNode) : chart.hideRootNode != null) return false;
        if (animateOnInit != null ? !animateOnInit.equals(chart.animateOnInit) : chart.animateOnInit != null)
            return false;
        if (animateOnInitDelay != null ? !animateOnInitDelay.equals(chart.animateOnInitDelay) : chart.animateOnInitDelay != null)
            return false;
        if (scrollBar != chart.scrollBar) return false;
        if (padding != null ? !padding.equals(chart.padding) : chart.padding != null) return false;
        if (connectors != null ? !connectors.equals(chart.connectors) : chart.connectors != null) return false;
        if (node != null ? !node.equals(chart.node) : chart.node != null) return false;
        return animation != null ? animation.equals(chart.animation) : chart.animation == null;
    }

    @Override
    public int hashCode() {
        int result = container != null ? container.hashCode() : 0;
        result = 31 * result + (rootOrientation != null ? rootOrientation.hashCode() : 0);
        result = 31 * result + (nodeAlign != null ? nodeAlign.hashCode() : 0);
        result = 31 * result + (levelSeparation != null ? levelSeparation.hashCode() : 0);
        result = 31 * result + (siblingSeparation != null ? siblingSeparation.hashCode() : 0);
        result = 31 * result + (subTeeSeparation != null ? subTeeSeparation.hashCode() : 0);
        result = 31 * result + (hideRootNode != null ? hideRootNode.hashCode() : 0);
        result = 31 * result + (animateOnInit != null ? animateOnInit.hashCode() : 0);
        result = 31 * result + (animateOnInitDelay != null ? animateOnInitDelay.hashCode() : 0);
        result = 31 * result + (scrollBar != null ? scrollBar.hashCode() : 0);
        result = 31 * result + (padding != null ? padding.hashCode() : 0);
        result = 31 * result + (connectors != null ? connectors.hashCode() : 0);
        result = 31 * result + (node != null ? node.hashCode() : 0);
        result = 31 * result + (animation != null ? animation.hashCode() : 0);
        return result;
    }
}
