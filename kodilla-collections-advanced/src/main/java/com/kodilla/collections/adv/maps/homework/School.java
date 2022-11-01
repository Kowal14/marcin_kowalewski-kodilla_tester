package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {

    private List<Integer> school = new ArrayList<>();

    public School(List<Integer> school) {
        this.school = school;
    }
    public int getNumberOfStudents() {
        int sum = 0;
        for( int school : school)
            sum += school;
        return sum;

    }

    @Override
    public String toString() {
        return "School{" +
                "school=" + school +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school1 = (School) o;
        return Objects.equals(school, school1.school);
    }

    @Override
    public int hashCode() {
        return Objects.hash(school);
    }
}
