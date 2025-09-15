package src;

/** Rounds as records containing references to other rounds */
record RoundB(RoundB leftContest, RoundB rightContest, String winner) {}

/** Try 1.5: Let's try making the structure explicit. */
public class Try15 {
    public static void main(String[] args) {

        // finals winner: cookie dough
        RoundB contestB = new RoundB(
                // semi-finals winner: cookie dough
                new RoundB(
                        new RoundB(null, null, "cookiedough" ),
                        new RoundB(null, null, "choc"),
                        "cookiedough"),
                // semi-finals winner: strawberry
                new RoundB(
                        new RoundB(null, null, "lemon" ),
                        new RoundB(null, null, "strawberry"),
                        "strawberry"),
                "cookiedough");

        // Who was cookie dough's first opponent? (We can follow the trail of "cookiedough" wins:
        System.out.println(contestB.leftContest().rightContest().winner());
        System.out.println(roundsWon("cookiedough", contestB));
        System.out.println(roundsWon("strawberry", contestB));
        System.out.println(roundsWon("choc", contestB));

        // Null "works", but it can cause problems down the road.



    }

    public static int roundsWon(String flavor, RoundB contest) {
        if (contest == null)
            return 0;
        else if (contest.winner().equals(flavor)) {
            return 1 +
                    roundsWon(flavor, contest.leftContest()) +
                    roundsWon(flavor, contest.rightContest());
        } else {
            return roundsWon(flavor, contest.leftContest()) +
                    roundsWon(flavor, contest.rightContest());
        }
    }

}
