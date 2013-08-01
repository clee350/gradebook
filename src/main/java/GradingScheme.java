package gradebook.model;

import java.util.Collection;

/**
 *@author: Charles Lee
 *
 * The abstract interface class that describes.
 * Blueprint for the grading algorithm.
 */
public abstract interface GradingScheme {
    double removeLowestGrade(Collection<GradebookItem> grades,
        GradebookCategory type);
    double calcGradePercent();
    double calcGradePercent(Collection<GradebookItem> group,
        GradebookCategory type);
    char letterGrade(double result);
    double replaceGrade(GradebookCategory type, GradebookItem item);
}
