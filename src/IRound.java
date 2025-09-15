package src;

/** Any kind of round must be able to count the wins for a given player. */
public interface IRound {
    int roundsWon(String flavor);
}
