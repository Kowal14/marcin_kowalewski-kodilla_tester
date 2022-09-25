public class User {
    public String name;
    public int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        User marcin = new User("Marcin", 36);
        User marlena = new User("Marlena", 30);
        User tomek = new User("Tomek", 22);
        User magda = new User("Magda", 27);

        User[] users = {marcin, marlena, tomek, magda};

        int result = 0;
        for (int i = 0; i < users.length; i++) {
            result = result + users[i].age;
        }
        int average = 0;
        average = result / users.length;

        for (int i = 0; i < users.length; i++) {
            if (users[i].age < average) {
                System.out.println(users[i].name + users[i].age);
            }
        }
    }
}
