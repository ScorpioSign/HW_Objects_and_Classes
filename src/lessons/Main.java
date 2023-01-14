package lessons;
public class Main {
    //Создайте класс Book, который содержит в себе данные о названии, авторе и годе публикации книги. Типы полей должны быть String, Author (его мы создадим в п. 2) и int.
    //Создайте класс Author, который содержит в себе данные об имени и фамилии автора.
    //Напишите конструкторы для обоих классов, заполняющие все поля.
    //Создайте геттеры для всех полей автора и всех полей книги.
    //Создайте сеттер для поля «Год публикации» у книги.
    //В методе main создайте несколько объектов «Книга» (достаточно двух) и несколько объектов «Автор» (достаточно тоже двух) и инициализируйте их. Учтите, что авторы являются обязательными и книги не могут создаваться без авторов.
    //Метод main не должен находиться в классах Book и Author.
    //Создайте отдельный класс для запуска приложения и объявите метод main в нем.
    //В том же методе main измените год публикации одной из книг с помощью сеттера.
    //Так как вы изучили геттеры и сеттеры, оставлять поля открытыми, без модификатора доступа private, недопустимо.
    //Реализуйте методы toString, equals и hashCode в классах Author и Book, которые вы создали на прошлом уроке.
    //Обратите внимание, что toString книги не должен дублировать код из toString автора, а должен делегировать (вызывать) его версию метода.
    public static void main(String[] args) {
        Author author1 = new Author("Margaret", "Mitchell");
        Author author2 = new Author("Stephen", " King");
        System.out.println(author1);
        System.out.println(author2);
        Book book1 = new Book("Gone With the Wind", author1, 1987);
        Book book2 = new Book("The Green Mile", author2, 2005);
        System.out.println(book1.getBookTitle() + " ; " + book1.getAuthor() + " ; " + book1.getPublishingYear());
        System.out.println(book2);
        book2.setYear(2008);
        System.out.println(book2);



    }
}



