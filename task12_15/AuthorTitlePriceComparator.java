package task12_15;

import java.util.Comparator;

public class AuthorTitlePriceComparator implements Comparator<Book> {

    public int compare(Book o1, Book o2) {
        String author1 = o1.getAuthor();
        String author2 = o2.getAuthor();
        int authorCompare = author1.compareTo(author2);
        if (authorCompare != 0)
            return authorCompare;
        String title1 = o1.getTitle();
        String title2 = o2.getTitle();
        int titleCompare = title1.compareTo(title2);
        if (titleCompare != 0)
            return titleCompare;
        int price1 = o1.getPrice();
        int price2 = o2.getPrice();
        return price1 > price2 ? 1 : price1 < price2 ? -1 : 0;
    }
}
