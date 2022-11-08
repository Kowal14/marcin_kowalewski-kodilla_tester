package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

    public class UsersManager {
        public static void main(String[] args) {
            List<String> chemistGroupUsernames = filterChemistGroupUsernames();
            int age = 40;
            List<String> usersOlderThan40 = usersOlderThan40(age);
            int number = 5;
            List<String> postedMoreThan5Posts = postedMoreThan5Posts(number);
            System.out.println(chemistGroupUsernames);
            System.out.println(usersOlderThan40);
            System.out.println(postedMoreThan5Posts);
        }

    private static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
    }

    private static List<String> usersOlderThan40(int age) {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> (user.getAge() > age))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
    }

    private static List<String> postedMoreThan5Posts(int number) {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> (user.getNumberOfPost() > number))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
}
    public static String getUserName(User user) {
        return user.getUserName();
    }
}
