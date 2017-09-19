package it.jody.TreantVisualizer.domain.treant.chart;

public enum ConnectorsType {
    CURVE {
        @Override
        public String toString() {
            return "curve";
        }
    },
    BCURVE {
        @Override
        public String toString() {
            return "bCurve";
        }
    },
    STEP {
        @Override
        public String toString() {
            return "step";
        }
    },
    STRAIGHT {
        @Override
        public String toString() {
            return "straight";
        }
    }
}
