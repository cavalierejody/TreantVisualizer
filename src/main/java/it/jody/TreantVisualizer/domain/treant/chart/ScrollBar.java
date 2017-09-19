package it.jody.TreantVisualizer.domain.treant.chart;

public enum ScrollBar {
    NATIVE {
        @Override
        public String toString() {
            return "native";
        }
    },
    FANCY {
        @Override
        public String toString() {
            return "fancy";
        }
    },
    NONE {
        @Override
        public String toString() {
            return "None";
        }
    }
}
