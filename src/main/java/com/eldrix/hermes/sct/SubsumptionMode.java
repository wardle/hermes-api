package com.eldrix.hermes.sct;

/**
 * Mode of subsumption testing between expressions.
 */
public enum SubsumptionMode {
    /**
     * Structural subsumption using the SNOMED CT concept model.
     * This is the default and does not require an OWL reasoner.
     */
    STRUCTURAL("structural"),

    /**
     * OWL-based subsumption using an ELK reasoner.
     * Requires the reasoner to be available on the classpath.
     */
    OWL("owl");

    private final String keyword;

    SubsumptionMode(String keyword) {
        this.keyword = keyword;
    }

    /**
     * Return the Clojure keyword name for this mode.
     */
    public String keyword() {
        return keyword;
    }
}
