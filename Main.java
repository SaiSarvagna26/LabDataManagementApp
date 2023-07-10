package Lib;

class LibraryItem{
    int id;
    String title;
    int year;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;

    }
}
class Book extends LibraryItem{
    String author;

}
class Magazine extends LibraryItem{
    int issue;
}



public class Main
{
	public static void main(String[] args) {
		Book book=new Book();
        Magazine magazine=new Magazine();

        magazine.setId(100);
        magazine.title="DATABASE MANAGEMENT SYSTEM";
        magazine.year=2003;
        magazine.issue=1;

        book.author="RAGHU RAMAN";

        System.out.println(magazine.getId());
        System.out.println(magazine.title);
        System.out.println(magazine.year);
        System.out.println(magazine.issue);
        System.out.println(book.author);
	}
}


