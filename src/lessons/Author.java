package lessons;

import java.util.Objects;

public class Author {
    private String authorName;
    private String authorSurname;

    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;

    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    @Override
    public String toString() {
        return this.authorName + this.authorSurname;
    }
    @Override
    public boolean equals (Object other) {
        if (this == other)
            return true;
        if (other == null || this.getClass() != other.getClass())
            return false;
        Author author = (Author) other;
        return Objects.equals(authorName, author.authorName) && Objects.equals(authorSurname, author.authorSurname);

    }
    @Override
    public int hashCode (){
        return Objects.hash(authorName, authorSurname);
    }
}