package javaexercises5;

public class TestBook {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan An Teck", "ahteck@ahihi.com", 'm');
        authors[1] = new Author("Paul Tan", "paul@java.com", 'm'); 
        System.out.println(authors[0]);
        Book dummyBook = new Book("Java for dummy", authors, 19.95, 99);
        System.out.println(dummyBook);

        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("quantily is: " + dummyBook.getQty());
        System.out.println("Authors is: " + dummyBook.getAuthor()[0] + dummyBook.getAuthor()[1]);

    }
}
