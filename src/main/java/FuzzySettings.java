package main.java;

/**
 * Store fuzzy settings generated by user
 */
public class FuzzySettings {

    /**
     * Membership functions list
     */
    public class MembershipFunction {
        public static final int NONE = 0;
    }

    /**
     * Membership function
     */
    private int membershipFunction = MembershipFunction.NONE;

    /**
     * Value label to find
     */
    private String value = null;


    public int getMembershipFunction() {
        return membershipFunction;
    }

    public void setMembershipFunction(int membershipFunction) {
        this.membershipFunction = membershipFunction;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
