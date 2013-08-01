package gradebook.model;
import java.util.ArrayList;
/**
 *@author: Charles Lee
 *
 * The Junit Test for the cs2340 final
 * Calculates the classes' number grades and the letter grades.
 */
public class GradebookCategory {
    private String name;
    private int weight;
    private final int percentageMax = 100;
    private ArrayList<GradebookItem> list;
public GradebookCategory(String gradeType, int itemWeight) {
    if ((itemWeight > percentageMax) || (itemWeight < 0)) {
        return;
    }
    this.weight = itemWeight;
    this.name = gradeType;
}
public GradebookCategory(ArrayList<GradebookItem> itemList,
String gradeType, int itemWeight) {
    this.weight = itemWeight;
    name = gradeType;
    for (GradebookItem each : itemList) {
       list.add(each);
    }
}
public String getCategoryName() {
    return name;
}
public int getWeight() {
    return weight;
}
}
