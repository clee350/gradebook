package gradebook.model;
/**
 *@author: Charles Lee
 *
 * The section that describes student[] objects.
 * Calculates the students' number grades and the letter grades.
 */
public class Section {
private Student[] studentList;
private final int a = 90, b = 80, c = 70, d = 60;
public Section(Student[] students) {
    studentList = students;
}
public double avgSection() {
    double total = 0;
    for (Student each: studentList) {
        total += each.getPercentGrade();
    }
    return (total / studentList.length);
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
