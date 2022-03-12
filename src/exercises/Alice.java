package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String aliceToLowerCase;
        String searchTerm;
        String searchTermToLowerCase;

        Scanner search = new Scanner(System.in);
        System.out.println("What word would you like to search in Alice in Wonderland's 1st sentence?: ");
        searchTerm = search.next();
        search.close();

        searchTermToLowerCase = searchTerm.toLowerCase();
        aliceToLowerCase = alice.toLowerCase();
//        aliceToLowerCase.contains(searchTermToLowerCase);
        System.out.println(aliceToLowerCase.contains(searchTermToLowerCase));

        System.out.println(aliceToLowerCase.indexOf(searchTermToLowerCase));
        System.out.println(searchTermToLowerCase.length());

        int split1;
        int split2;
        int split3;
        String aliceWithOutSearchTerm;
        split1 = aliceToLowerCase.indexOf(searchTermToLowerCase);
        split2 = split1 + searchTermToLowerCase.length();
        split3 = aliceToLowerCase.length();
        aliceWithOutSearchTerm = aliceToLowerCase.substring(0,split1) + aliceToLowerCase.substring(split2, split3);
        System.out.println(aliceWithOutSearchTerm);
    }
}
