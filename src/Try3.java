package src;

/** Try 3: interface and 2 cases.
 *  Since there are now 3 definitions (IRound, Init, and Round), I've now
 *  put them all in different files. */
public class Try3 {
    public static void main(String[] args) {
        Round contestD = new Round(
                // semi-finals winner: cookie dough
                new Round(
                        new Init("cookiedough" ),
                        new Init("choc"),
                        "cookiedough"),
                // semi-finals winner: strawberry
                new Round(
                        new Init("lemon" ),
                        new Init( "strawberry"),
                        "strawberry"),
                "cookiedough");

        System.out.println(contestD.roundsWon("lemon"));
        System.out.println(contestD.roundsWon("cookiedough"));
    }
}
