public class Book implements Comparable<Book> {
    private String title;
    private int pageNumber;
    private String authorName;
    private String releaseDate;

    public Book(String title, int pageNumber, String authorName, String releaseDate) {
        this.title = title;
        this.pageNumber = pageNumber;
        this.authorName = authorName;
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public int compareTo(Book o) {
        return this.getTitle().compareTo(o.getTitle());
    }

}
