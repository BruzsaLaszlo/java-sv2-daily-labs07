package day01;

import java.time.LocalDate;

public class Human {

    private final String name;
    private final int yearOfBirth;

    public Human(String name, int yearOfBirth) {
        if (!isNameValid(name))
            throw new IllegalArgumentException("name is invalid: " + name);
        if (!isYearOfBirthValid(yearOfBirth))
            throw new IllegalArgumentException("yearOfbirth is invalid: " + yearOfBirth);

        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    private boolean isYearOfBirthValid(int yearOfBirth) {
        int now = LocalDate.now().getYear();
        return now - yearOfBirth <= 120 && now >= yearOfBirth;
    }

    private boolean isNameValid(String name) {
        return name.trim().split("[ ]").length > 1;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

}
