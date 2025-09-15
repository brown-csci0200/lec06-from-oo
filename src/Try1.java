package src;

import java.util.ArrayList;
import java.util.List;

/** Rounds as records containing the names themselves */
record RoundA(String flavor1, String flavor2, String winner) {}

/** Try 1: Let's try this with just lists first... */
public class Try1 {
    public static void main(String[] args) {
        List<RoundA> contestA = new ArrayList<>();
        contestA.add(new RoundA("cookiedough", "choc", "cookiedough"));
        contestA.add(new RoundA("lemon","strawberry", "strawberry"));
        contestA.add(new RoundA("cookiedough", "strawberry", "cookiedough"));

        // How can I tell who won? I have to do some work, it's not immediately obvious.
        // This isn't how a tournament looks in real life! The winner is at the "top" of the
        // brackets. Let's try storing that structure explicitly.
    }
}
