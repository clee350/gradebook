package gradebook.model;
import java.util.ArrayList;
/**
* A Sample Implementation using the grading Scheme interface.
* @author: Charles Lee
*/
public class BuildGradeScheme implements GradingScheme {
    private final int a = 90, b = 80, c = 70, d = 60;
@Override
public double removeLowestGrade(GradebookItem[] list,
GradebookCategory types) {
    if (list == null) {
        return 0;
    }
    if (list.length == 0) {
        return 0;
    }
    double lowest = Integer.MAX_VALUE;
    int index = 0;
    for (int i = 0; i < list.length; i++) {
         if (list[i].getCategory().equals(types) && list[i] != null) {
            if (lowest > list[i].calcPercentage()) {
                lowest = list[i].calcPercentage();
                index = i;
            }
        }
    }
    if (!(list.length > 0)) {
        list[index] = null;
    }
    return lowest;
}
@Override
public char letterGrade(double result) {
    if (result >= 0) {
        if (result < d) {
            return 'F';
        } else if ((result >= d) && (result < c)) {
            return 'D';
        } else if ((result >= c) && (result < b)) {
            return 'C';
        } else if ((result >= b) && (result < a)) {
            return 'B';
        } else {
            return 'A';
        }
    }
    return 'F';
}
@Override
public double percentOverall(double[] group,
GradebookCategory[] type) {
    double grade = 0;
    if (type.length != group.length) {
        return grade;
    }
    for (int i = 0; i < group.length; i++) {
         for (int j = i; j < type.length; j++) {
            grade += (group[i] * type[j].getWeight());
        }
    }
    return grade;
}
@Override
public double calculateByCategory(ArrayList<GradebookItem> list,
    GradebookCategory type) {
    double rawScore = 0;
    int total = 0;
    for (GradebookItem each : list) {
        if (each.getCategory().equals(type)) {
            rawScore += each.getScore();
            total += each.getTotal();
        }
    }
    return ((rawScore / total) * type.getWeight());
}
}
