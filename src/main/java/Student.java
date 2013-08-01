package gradebook.model;
import java.util.ArrayList;
import java.util.Collection;
/**
*@author: Charles Lee
*
* The student class that describes Grading objects.
* Calculates the classes' number grades and the letter grades.
*/
public class Student {
    private String studentName;
    private BuildGradeScheme gradeScheme;
    private GradebookCategory category;
    private Collection<GradebookItem> scores;
    private double average;
public Student(String name, BuildGradeScheme scheme,
Collection<GradebookItem> figures) {
    ArrayList<GradebookItem> list = new ArrayList<GradebookItem>();
    gradeScheme = scheme;
    studentName = name;
    average = 0;
    for (GradebookItem each: figures) {
        list.add(each);
    }
}
public double getPercentGrade() {
    average = gradeScheme.calcGradePercent();
    return average;
}
public double getLetterGrade() {
    return gradeScheme.letterGrade(average);
}
public String getName() {
    return this.studentName;
}
public Collection<GradebookItem> getScore() {
    return this.scores;
}
public String getCategory() {
    return category.getCategoryName();
}
}
