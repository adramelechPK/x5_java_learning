package HomeTask;

public class Aspirant extends Student{
    String nameOfResearchArticle;
    int bonus = 100;

    public Aspirant(String firstName, String lastName, String group, double averageMar, String nameOfResearchArticle) {
        super(firstName, lastName, group, averageMar);
        this.nameOfResearchArticle = nameOfResearchArticle;
    }

    @Override
    public int getScholarship() {
        return super.getScholarship() + bonus;
    }
}
