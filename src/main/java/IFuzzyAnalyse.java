package main.java;


import java.util.List;

public interface IFuzzyAnalyse {
    /**
     * Return query to invoke.
     * Data returned from query is passed to method fuzzyAnalyse
     * @param settings User settings
     * @return String
     */
    public String getQuery(FuzzySettings settings);

    /**
     * Analyze data using fuzzy logic
     * TODO: Replace String in set by class
     *
     * @param data Data returned from getQuery
     * @param settings User settings
     * @return List of results
     */
    public List<IFuzzyObject> fuzzyAnalyse(List<IFuzzyObject> data, FuzzySettings settings);
}
