package it.jody.TreantVisualizer;

import com.google.gson.Gson;
import it.jody.TreantVisualizer.domain.ConfigurationChart;
import it.jody.TreantVisualizer.services.FakeChartBuilder;
import org.junit.Test;

public class MarshallerTests {

    @Test
    public void testMarshallingNode() {

        final String toJson = new FakeChartBuilder().newFakeCHartJson();

        System.out.println(toJson);
    }
}
