package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String aliceLine = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String alice = aliceLine.toLowerCase();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a term: ");
        String term = input.next().toLowerCase();
        System.out.println(alice.contains(term));

    }
}