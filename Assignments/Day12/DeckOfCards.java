package Assignment1;

public class DeckOfCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] RANKS = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		String[] Deck = new String[52];
		int start = 0;
		int end = 12;
		int j1 = 0;
		int j2 = 0;

		for (int i = 0; i < 4; i++) {
			for (int j = start; j <= end; j++) {
				Deck[j] = SUITS[i] + " " + RANKS[j1];
				j1++;
			}
			j1 = 0;
			start = end + 1;
			end += 13;
		}

		for (int i = 0; i < 52; i++) {
		int j = i + (int) (Math.random());
			String temp = Deck[i];
			Deck[i] = Deck[j];
			Deck[j] = temp;
		}

		for (int i = 0; i < 4; i++) {
			System.out.print("For Player " + (i+1) + ": \n");
			for (int j = 0; j < 9; j++) {

				System.out.print(Deck[j2] +", ");
				j2++;
			}
			System.out.println();
		}
	}
}
