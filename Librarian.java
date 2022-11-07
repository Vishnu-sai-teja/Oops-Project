public class Librarian{

}
class Librarian_add{
       private String bookName;
       private String Writer;
       private int cost;

       public Librarian_add(String bookName, String writer, int cost) {
              this.bookName = bookName;
              Writer = writer;
              this.cost = cost;
       }

       public void addBooks(){
              
       }

       public String getBookName() {
              return bookName;
       }

       public void setBookName(String bookName) {
              this.bookName = bookName;
       }

       public String getWriter() {
              return Writer;
       }

       public void setWriter(String writer) {
              Writer = writer;
       }

       public int getCost() {
              return cost;
       }

       public void setCost(int cost) {
              this.cost = cost;
       }
}
class librarian_Edit{
       private String bookName;
       private int cost;
       private String Writer;

       public librarian_Edit(String bookName, int cost, String writer) {
              this.bookName = bookName;
              this.cost = cost;
              Writer = writer;
       }

       public String getBookName() {
              return bookName;
       }

       public void setBookName(String bookName) {
              this.bookName = bookName;
       }

       public int getCost() {
              return cost;
       }

       public void setCost(int cost) {
              this.cost = cost;
       }

       public String getWriter() {
              return Writer;
       }

       public void setWriter(String writer) {
              Writer = writer;
       }
}
class Librarian_issue {
       private String studentName;
       private String bookName;
       private String days;

       public Librarian_issue( String studentName, String bookName, String days) {
              this.studentName = studentName;
              this.bookName = bookName;
              this.days = days;
       }

       public String getStudentName() {
              return studentName;
       }

       public void setStudentName(String studentName) {
              this.studentName = studentName;
       }

       public String getBookName() {
              return bookName;
       }

       public void setBookName(String bookName) {
              this.bookName = bookName;
       }

       public String getDays() {
              return days;
       }

       public void setDays(String days) {
              this.days = days;
       }
}
class Librarian_view{

}