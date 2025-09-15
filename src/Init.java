package src;

/** A "leaf" flavor, before the tournament begins */
public class Init implements IRound {
    String flavor;

    Init(String f) {
        this.flavor = f;
    }
    public int roundsWon(String flav) {
        return 0;
    }
}
