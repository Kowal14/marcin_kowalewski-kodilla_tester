package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> education = new HashMap<>();
        Principal adam = new Principal("Adam", "Burks", "middle school");
        Principal ann = new Principal("Ann", "Knox", "high school");
        Principal kevin = new Principal("kevin", "Philips", "university");

        School adamSchool = new School(Arrays.asList(12, 15, 20));
        School annSchool = new School(Arrays.asList(20, 18, 25));
        School kevinSchool = new School(Arrays.asList(12, 19, 17));

        education.put(adam, adamSchool);
        education.put(ann, annSchool);
        education.put(kevin, kevinSchool);

        for (Map.Entry<Principal, School> principalEntry : education.entrySet()) {
            System.out.println(principalEntry.getKey().getFirstName() +" "+  principalEntry.getKey().getLastName() + ", name of school: " + principalEntry.getKey().getSchoolName() + ", number of students: " + principalEntry.getValue().getNumberOfStudents());
        }
        }

}
