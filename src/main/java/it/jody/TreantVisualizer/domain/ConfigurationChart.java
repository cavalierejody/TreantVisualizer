package it.jody.TreantVisualizer.domain;

public class ConfigurationChart {

    private final Chart chart;
    private final Node nodeStructure;

    public ConfigurationChart(Chart chart, Node rootNode) {
        this.chart = chart;
        this.nodeStructure = rootNode;
    }
}
