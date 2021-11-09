package sky.pro;

import java.util.Objects;

public class Author {
    private final String surName;
    private final String firstName;

    public Author(String surName, String firstName) {
        this.surName = surName;
        this.firstName = firstName;
    }

    public String getSurName() {
        return this.surName;

    }

    public String getFirstName() {
        return this.firstName;

    }

    @Override
    public String toString() {
        return "Author{" +
                "surName='" + surName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return surName.equals(author.surName) && firstName.equals(author.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surName, firstName);
    }
}
