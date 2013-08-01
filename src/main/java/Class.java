package gradebook.model;
/**
 *@author: Charles Lee
 *
 * The class that describes section[] objects.
 * Calculates the sections' number grades and the letter grades.
 */
public class Class {
    private Section[] unit;
    private final int a = 90, b = 80, c = 70, d = 60;
public Class(Section[] group) {
    unit = group;
}
public double classPrecentGrade() {
    double total = 0;
    for (Section each : unit) {
        total += each.avgSection();
    }
    return (total / unit.length);
}
public char courseLetter(double result) {
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
}
