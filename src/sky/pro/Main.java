package sky.pro;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Author king = new Author("King", "Stephen");
        Author сopyKing = new Author("King", "Stephen");
        System.out.println(new Author("King", "Stephen"));

        Book shooter = new Book(1978, "Shooter", king);
        Book сopyShooter = new Book(1979, "Shooter", king);
        System.out.println(new Book(1978, "Shooter", king));
        shooter.setYearPublication(1979);
        System.out.println(new Book(1979, "Shooter", king));

        Author сapote = new Author("Capote", "Truman");
        System.out.println(new Author("Capote", "Truman"));
        Book breakfast = new Book(1958, "Breakfast at Tiffany's", сapote);
        System.out.println(new Book(1958, "Breakfast at Tiffany's", сapote));
        breakfast.setYearPublication(1959);
        System.out.println(new Book(1959, "Breakfast at Tiffany's", сapote));

        System.out.println("Объекты автор неэквивалентны " + king.equals(сapote));
        System.out.println("Объекты автор хеш не равен " + (king.hashCode() == сapote.hashCode()));
        System.out.println("Объекты автор эквивалентны " + king.equals(сopyKing));
        System.out.println("Объекты автор хеш равен " + (king.hashCode() == сopyKing.hashCode()));
        System.out.println("Объекты книга неэквивалентны " + shooter.equals(breakfast));
        System.out.println("Объекты книга хеш не равен " + (shooter.hashCode() == breakfast.hashCode()));
        System.out.println("Объекты книга эквивалентны " + shooter.equals(breakfast));
        System.out.println("Объекты книга хеш равен " + (shooter.hashCode() == сopyShooter.hashCode()));


    }
}
