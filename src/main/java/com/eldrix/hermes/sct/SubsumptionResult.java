package com.eldrix.hermes.sct;

/**
 * Result of a subsumption test between two expressions, aligned with FHIR
 * $subsumes operation outcomes.
 */
public enum SubsumptionResult {
    EQUIVALENT("equivalent"),
    SUBSUMES("subsumes"),
    SUBSUMED_BY("subsumed-by"),
    NOT_SUBSUMED("not-subsumed");

    private final String keyword;

    SubsumptionResult(String keyword) {
        this.keyword = keyword;
    }

    /**
     * Return the Clojure keyword name for this result.
     */
    public String keyword() {
        return keyword;
    }

    /**
     * Look up a SubsumptionResult from a Clojure keyword name.
     */
    public static SubsumptionResult fromKeyword(String name) {
        for (SubsumptionResult r : values()) {
            if (r.keyword.equals(name)) {
                return r;
            }
        }
        throw new IllegalArgumentException("Unknown subsumption result: " + name);
    }
}
