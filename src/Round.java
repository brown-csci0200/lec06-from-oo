package src;

/** A round of the tournament */
public class Round implements IRound {
    String winner;
    IRound leftContest; // left winner won this round
    IRound rightContest; // right winner won this round

    Round(IRound left, IRound right, String w) {
        // We don't want to allow "null" anymore:
        if(left == null) throw new IllegalArgumentException();
        if(right == null) throw new IllegalArgumentException();
        this.leftContest = left;
        this.rightContest = right;
        this.winner = w;
    }

    public int roundsWon(String flavor) {
        if (this.winner.equals(flavor))
            return 1 + this.leftContest.roundsWon(flavor) +
                    this.rightContest.roundsWon(flavor);
        else
            return this.leftContest.roundsWon(flavor) +
                    this.rightContest.roundsWon(flavor);

    }
}