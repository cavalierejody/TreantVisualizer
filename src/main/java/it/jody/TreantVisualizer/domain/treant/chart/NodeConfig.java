package it.jody.TreantVisualizer.domain.treant.chart;

public class NodeConfig {

    private String HTMLclass;
    private Boolean drawLineThrough;
    private Boolean collapsable;
    // private Object/String link //TODO


    public String getHTMLclass() {
        return HTMLclass;
    }

    public void setHTMLclass(String HTMLclass) {
        this.HTMLclass = HTMLclass;
    }

    public Boolean getDrawLineThrough() {
        return drawLineThrough;
    }

    public void setDrawLineThrough(Boolean drawLineThrough) {
        this.drawLineThrough = drawLineThrough;
    }

    public Boolean getCollapsable() {
        return collapsable;
    }

    public void setCollapsable(Boolean collapsable) {
        this.collapsable = collapsable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NodeConfig that = (NodeConfig) o;

        if (HTMLclass != null ? !HTMLclass.equals(that.HTMLclass) : that.HTMLclass != null) return false;
        if (drawLineThrough != null ? !drawLineThrough.equals(that.drawLineThrough) : that.drawLineThrough != null)
            return false;
        return collapsable != null ? collapsable.equals(that.collapsable) : that.collapsable == null;
    }

    @Override
    public int hashCode() {
        int result = HTMLclass != null ? HTMLclass.hashCode() : 0;
        result = 31 * result + (drawLineThrough != null ? drawLineThrough.hashCode() : 0);
        result = 31 * result + (collapsable != null ? collapsable.hashCode() : 0);
        return result;
    }
}
