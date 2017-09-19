package it.jody.TreantVisualizer.domain.treant.chart;

public class Animation {

    private Integer nodeSpeed;
    private Integer connectorsSpeed;
    //    NodeAnimation nodeAnimation; //TODO from jQuery http://easings.net/
    //    private ConnectorsAnimation connectorsAnimation; //TODO from jQuery

    public Integer getNodeSpeed() {
        return nodeSpeed;
    }

    public void setNodeSpeed(Integer nodeSpeed) {
        this.nodeSpeed = nodeSpeed;
    }

    public Integer getConnectorsSpeed() {
        return connectorsSpeed;
    }

    public void setConnectorsSpeed(Integer connectorsSpeed) {
        this.connectorsSpeed = connectorsSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animation animation = (Animation) o;

        if (nodeSpeed != null ? !nodeSpeed.equals(animation.nodeSpeed) : animation.nodeSpeed != null) return false;
        return connectorsSpeed != null ? connectorsSpeed.equals(animation.connectorsSpeed) : animation.connectorsSpeed == null;
    }

    @Override
    public int hashCode() {
        int result = nodeSpeed != null ? nodeSpeed.hashCode() : 0;
        result = 31 * result + (connectorsSpeed != null ? connectorsSpeed.hashCode() : 0);
        return result;
    }
}
