package BookStore;

public class BookStore {
    public static void main(String[] args) {
        Book[] booksList = new Book[10];

        Book book1 = new Book();
        book1.bookName = "Буратино";
        book1.bookPrice = 500;
        book1.releaseDate = 1925;
        addBook(booksList, book1); // добавление книги в картотеку

        Book book2 = new Book();
        book2.bookName = "Детские сказки";
        book2.bookPrice = 200;
        book2.releaseDate = 2022;
        addBook(booksList, book2); // добавление книги в картотеку

        Book book3 = new Book();
        book3.bookName = "Сочинения";
        book3.bookPrice = 1200;
        book3.releaseDate = 2021;
        addBook(booksList, book3); // добавление книги в картотеку

        Book book4 = new Book();
        book4.bookName = "Детские сказки";
        book4.bookPrice = 200;
        book4.releaseDate = 2022;
        addBook(booksList, book4); // добавление книги в картотеку

        printAllBooks(booksList);
    }

//Проверяем наличие книги в картотеке:
    public static boolean checkBook(Book[] bookList, Book book) {
        for(Book item: bookList) {
            if(item != null && item.bookName.equals(book.bookName) && item.releaseDate == book.releaseDate) {
                System.out.println("Такая книга уже есть в картотеке");
                return true;
            }
        }
        System.out.println("Книги нет в картотеке");
        return false;
    }

// Выполняем условие
    public static void addBook(Book[] bookList, Book book) {
        if(!checkBook(bookList, book)) {
            for(int i = 0; i < bookList.length; i++) {
                if (bookList[i] == null) {
                    bookList[i] = book;
                    System.out.println("Книга добавлена в картотеку");
                    break;
                }
                if (i ==bookList.length - 1) {
                    System.out.println("Картотека переполнена");
                }
            }
        }
    }

// Выводим на печать список книг
    public static void printAllBooks(Book[] bookList) {
        for(int i = 0; i < bookList.length; i++) {
            if (bookList[i] != null) {
                System.out.printf("книга №%d: название: \"%s\", год издания: %dг., цена - %dруб. \n",
                        i + 1, bookList[i].bookName, bookList[i].releaseDate, bookList[i].bookPrice);
            }
        }
    }
}