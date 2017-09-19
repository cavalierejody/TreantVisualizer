package it.jody.TreantVisualizer.services;

import com.google.gson.Gson;
import it.jody.TreantVisualizer.domain.*;
import org.springframework.stereotype.Service;

@Service
public class FakeChartBuilder {

    public ConfigurationChart newFakeChart() {

        Chart chart = new Chart("#tree-simple");
        chart.setRootOrientation(RootOrientation.NORTH);

        final Node root = Node.newRootNode("root");
        TextNode textNode = new TextNode();
        textNode.setName("Parent Node");
        root.setText(textNode);

        Node firstChild = new Node("firstChild", root);
        firstChild.getText().setName(firstChild.getId());
        Node secondCHild = new Node("secondCHild", root);
        secondCHild.getText().setName(secondCHild.getId());

        ConfigurationChart configurationChart = new ConfigurationChart(chart, root);

        return configurationChart;
    }

    public String newFakeCHartJson() {

        FakeChartBuilder builder = new FakeChartBuilder();
        final ConfigurationChart configurationChart = builder.newFakeChart();

        Gson gson = new Gson();
        final String toJson = gson.toJson(configurationChart);

        return toJson;
    }
}
