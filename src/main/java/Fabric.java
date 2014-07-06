package main.java;

/**
 * Fabric class.
 * Create class instance using refactor
 */
public class Fabric {
    static public IFuzzyAnalyse newInstance(String className) {
        try {
            Class<?> cls = Class.forName(className);
            return (IFuzzyAnalyse)cls.newInstance();
        } catch(ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }
    }
}
