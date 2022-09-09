package task12_15;

import java.util.Comparator;

public class TitleAuthorComparator implements Comparator<Book> {

    public int compare(Book o1, Book o2) {
        String title1 = o1.getTitle();
        String title2 = o2.getTitle();
        int titleCompare = title1.compareTo(title2);
        if (titleCompare != 0)
            return titleCompare;
        String author1 = o1.getAuthor();
        String author2 = o2.getAuthor();
        int authorCompare = author1.compareTo(author2);
        return authorCompare;
    }
}
