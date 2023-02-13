package Com.Day11_12_RFP;

public class DeckOfCards {
    public static void main(String[] args) {
        String [] suits = {"clubs","diamonds","hearts","spades"};

        String [] ranks = {"2","3","4","5","6","7","8","9","10","jack","queen","king","ace"};

          int n = suits.length * ranks.length;
        String[] deck = new String[n];
        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length*i + j] = ranks[i] + " of " + suits[j];
            }
        }

        // shuffle
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n-i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

        //distribute 9 Cards to 4 Players
        for (int i = 0; i < 4; i++) {
            System.out.println("-- Person " + (i + 1) + " --");
            for (int j = 0; j < 9; j++) {
                System.out.println(deck[i + j * 4] + " (Card " + (i + j * 4) + ")");
            }
            System.out.println();
        }
    }
}
