public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }
    public int getLastGrade() {
        return this.grades[this.size - 1];

    }
    public double getAvg() {
        int sum = 0;
        for (int i = 0; i < this.size; i++) {
            sum = sum + this.grades[i];
/*
grades = 1,3,4,6
sum = 0
i = 0 -> sum = 0 + 1
i = 1 -> sum = 1 + 3
i = 2 -> sum = 4 + 4
i = 3 -> sum = 8 + 6 = 14
14/4 = 3.5
 */
        }
        return sum/this.size;
    }
}
