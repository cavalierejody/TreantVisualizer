package it.jody.TreantVisualizer.domain.treant;

import it.jody.TreantVisualizer.domain.treant.chart.Chart;
import it.jody.TreantVisualizer.domain.treant.node.Node;

public class ConfigurationChart {

    private final Chart chart;
    private final Node nodeStructure;

    public ConfigurationChart(Chart chart, Node rootNode) {
        this.chart = chart;
        this.nodeStructure = rootNode;
    }
}
