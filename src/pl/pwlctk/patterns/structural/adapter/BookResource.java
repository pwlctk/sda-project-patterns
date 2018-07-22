package pl.pwlctk.patterns.structural.adapter;

public class BookResource implements ResourceProduct {
    private final Book book;

    public BookResource(Book book) {
        this.book = book;
    }

    @Override
    public String getPicture() {
        return book.frontPicture();
    }

    @Override
    public String getContent() {
        return book.bio();
    }
}
