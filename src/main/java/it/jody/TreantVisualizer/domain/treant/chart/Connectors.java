package it.jody.TreantVisualizer.domain.treant.chart;

public class Connectors {

    private ConnectorsType type;
    private ConnectorsStyle style;

    public ConnectorsType getType() {
        return type;
    }

    public void setType(ConnectorsType type) {
        this.type = type;
    }

    public ConnectorsStyle getStyle() {
        return style;
    }

    public void setStyle(ConnectorsStyle style) {
        this.style = style;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Connectors that = (Connectors) o;

        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        return style != null ? style.equals(that.style) : that.style == null;
    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + (style != null ? style.hashCode() : 0);
        return result;
    }
}
