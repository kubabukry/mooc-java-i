public class Book {
    private String author;
    private String title;
    private int pages;

    public Book(String author, String title, int pages){
        this.author = author;
        this.title = title;
        this.pages = pages;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getName(){
        return this.title;
    }

    public int getPages(){
        return this.pages;
    }

    public String toString(){
        return getAuthor()+", "+getName()+", "+getPages()+" pages";
    }
}
