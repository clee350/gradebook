package gradebook.model;
import java.util.ArrayList;
/**
 *@author: Charles Lee
 *
 * The abstract interface class that describes.
 * Blueprint for the grading algorithm.
 */
public abstract interface GradingScheme {
    double removeLowestGrade(GradebookItem[] list,
        GradebookCategory type);
    double percentOverall(double[] group,
        GradebookCategory[] type);
    char letterGrade(double result);
    double calculateByCategory(ArrayList<GradebookItem> list,
        GradebookCategory type);
}
