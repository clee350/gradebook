package gradebook.model;
/**
 *@author: Charles Lee
 *
 * The class that describes GradebookCategory.
 * Gets the scores, total, item and category.
 */
public class GradebookItem {
    private String name;
    private GradebookCategory type;
    private double score;
    private int total;
public GradebookItem(String label, double rawScore,
int total, GradebookCategory category) {
    if (rawScore < 0 || rawScore > total) {
        name = label;
        score = 0;
        this.total = total;
        type = category;
        return;
    } else if (total <= 0 || rawScore <= 0) {
        name = label;
        score = 0;
        this.total = 1;
        type = category;
        return;
    }
    name = label;
    score = rawScore;
    this.total = total;
    type = category;
}
public double getScore() {
    return score;
}
public int getTotal() {
    return total;
}
public String getItemName() {
    return name;
}
public GradebookCategory getCategory() {
    return type;
}
public double calcPercentage() {
    return (score / total);
}
}
