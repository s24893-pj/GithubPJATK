public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Mateusz", "Wisniewski", 21);
        System.out.println(author.toString());

        author.setSurname("Kowalski");

        System.out.println(author.toString());
    }
}
