package it.jody.TreantVisualizer.domain.treant.chart;

public enum NodeAlign {
    CENTER {
        @Override
        public String toString() {
            return "CENTER";
        }
    },
    TOP {
        @Override
        public String toString() {
            return "TOP";
        }
    },
    BOTTOM {
        @Override
        public String toString() {
            return "BOTTOM";
        }
    }
}
