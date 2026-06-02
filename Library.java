import java.util.*;-

class Library {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Member> members = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    void addBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author: ");
        String author = sc.nextLine();

        books.add(new Book(id, title, author));
        System.out.println("Book Added Successfully!");
    }

    void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available!");
            return;
        }

        for (Book b : books) {
            b.display();
        }
    }

    void addMember() {
        System.out.print("Enter Member ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        members.add(new Member(id, name));
        System.out.println("Member Added!");
    }

    void issueBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        for (Book b : books) {
            if (b.id == id && !b.isIssued) {
                b.isIssued = true;
                System.out.println("Book Issued!");
                return;
            }
        }
        System.out.println("Book not available!");
    }

    void returnBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        for (Book b : books) {
            if (b.id == id && b.isIssued) {
                b.isIssued = false;

                System.out.print("Enter late days: ");
                int days = sc.nextInt();
                int fine = days * 5;

                System.out.println("Book Returned!");
                System.out.println("Fine: Rs." + fine);
                return;
            }
        }
        System.out.println("Invalid Book ID!");
    }
}
