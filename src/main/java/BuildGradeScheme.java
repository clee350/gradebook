package gradebook.model;
import java.util.Collection;
/**
* A Sample Implementation using the grading Scheme interface.
* @author: Charles Lee
*/
public class BuildGradeScheme implements GradingScheme {
@Override
public double removeLowestGrade(Collection<GradebookItem> list,
GradebookCategory types) {
    return 0;
}
@Override
public double calcGradePercent() {
    return 0;
}
@Override
public char letterGrade(double result) {
    return 0;
}
@Override
public double replaceGrade(GradebookCategory type, GradebookItem item) {
    return 0;
}
@Override
public double calcGradePercent(Collection<GradebookItem> group,
GradebookCategory type) {
    return 0;
}
}
