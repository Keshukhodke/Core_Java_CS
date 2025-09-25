package This_24_09_25;

// Class representing a Book in the library
class Book {

    // Instance variables (specific to each book)
    int Bookid;
    String BookName;
    String Authorname;
    int numberofcopies;

    // Static variable (common for all books in the library)
    static String libraryname = "Cyber Success";

    // Method to set book information
    void setlibraryinfo(int bookid, String BookName, String Authorname, int numberofcopies) {
        this.Bookid = bookid;          // 'this.Bookid' refers to instance variable
        this.BookName = BookName;      // differentiate local variable from instance variable
        this.Authorname = Authorname;
        this.numberofcopies = numberofcopies;
    }

    // Method to display book information
    void getlibraryinfo() {
        System.out.println("Book ID: " + Bookid +
                " | Book Name: " + BookName +
                " | Author Name: " + Authorname +
                " | Number of Copies: " + numberofcopies +
                " | Library Name: " + libraryname);
    }
}

// Separate public class with main method
public class Real_Life_Example1 {

    public static void main(String[] args) {
        // Create first book object
        Book l1 = new Book();
        l1.setlibraryinfo(101, "Java Programming", "James Gosling", 5);
        l1.getlibraryinfo();

        // Create second book object
        Book l2 = new Book();
        l2.setlibraryinfo(102, "Python Essentials", "Guido van Rossum", 3);
        l2.getlibraryinfo();
    }
}
