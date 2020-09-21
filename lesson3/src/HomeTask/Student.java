package HomeTask;

public class Student {
    String firstName, lastName, group;
    double averageMar;

    public Student(String firstName, String lastName, String group, double averageMar) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMar = averageMar;
    }

    public int getScholarship() {
        return ( averageMar == 5 ? 100 : 80);
    }
}
