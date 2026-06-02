class Book {
   int id;
   String title;
   String author;
   boolean isIssued;

   Book(int var1, String var2, String var3) {
      this.id = var1;
      this.title = var2;
      this.author = var3;
      this.isIssued = false;
   }

   void display() {
      System.out.println(this.id + " | " + this.title + " | " + this.author + " | Issued: " + (this.isIssued ? "Yes" : "No"));
   }
}
