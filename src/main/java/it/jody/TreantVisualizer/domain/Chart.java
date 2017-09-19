package it.jody.TreantVisualizer.domain;

public class Chart {

    String container;
    private RootOrientation rootOrientation;

    public Chart(String container) {
        this.container = container;
    }


    public RootOrientation getRootOrientation() {
        return rootOrientation;
    }

    public void setRootOrientation(RootOrientation rootOrientation) {
        this.rootOrientation = rootOrientation;
    }
}
