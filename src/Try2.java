package src;

/** Keeping class definitions in the same file for brevity */
class RoundC {
    String winner;
    RoundC leftContest;
    RoundC rightContest;

    public RoundC(RoundC left, RoundC right, String w) {
        this.winner = w;
        this.leftContest = left;
        this.rightContest = right;
    }

    /** First attempt... */
/*    public int roundsWon1(String flavor) {

        if (this.winner.equals(flavor))
            return 1 +
                    this.leftContest.roundsWon1(flavor) +
                    this.rightContest.roundsWon1(flavor);
        else
            return this.leftContest.roundsWon1(flavor) +
                    this.rightContest.roundsWon1(flavor);
    } */







    /** Fixing... */
    public int roundsWon1(String flavor) {
        int leftCount = 0;
        int rightCount = 0;
        if (this.leftContest != null)
            leftCount = this.leftContest.roundsWon1(flavor);
        if (this.rightContest != null)
            rightCount = this.rightContest.roundsWon1(flavor);
        if (this.winner.equals(flavor))
            return 1 + leftCount + rightCount;
        else return leftCount + rightCount;
    }


}

/** Try 2: Let's make a class with a roundsWon method. */
public class Try2 {
    public static void main(String[] args) {
        RoundC contestC = new RoundC(
                // semi-finals winner: cookie dough
                new RoundC(
                        new RoundC(null, null, "cookiedough" ),
                        new RoundC(null, null, "choc"),
                        "cookiedough"),
                // semi-finals winner: strawberry
                new RoundC(
                        new RoundC(null, null, "lemon" ),
                        new RoundC(null, null, "strawberry"),
                        "strawberry"),
                "cookiedough");

        System.out.println(contestC.roundsWon1("lemon"));
    }

}










/** Fixing... */
    /*public int roundsWon2(String flavor) {
        int leftCount = 0;
        int rightCount = 0;
        if (this.leftContest != null)
            leftCount = this.leftContest.roundsWon2(flavor);
        if (this.rightContest != null)
            rightCount = this.rightContest.roundsWon2(flavor);
        if (this.winner.equals(flavor))
            return 1 + leftCount + rightCount;
        else return leftCount + rightCount;
    }*/

