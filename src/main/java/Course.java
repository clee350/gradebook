package gradebook.model;
/**
*@author: Charles Lee
*
* The Course class that describes class objects.
* Calculates the classes' number grades and the letter grades.
*/
public class Course {
private String title, description;
private int number;
private Course[] coursesNeeded;
private Class[] season;
private final int a = 90, b = 80, c = 70, d = 60;
public Course(String className, String description, int courseNumber,
    Course[] preReqs, Class[] semester) {
    title = className;
    coursesNeeded = preReqs;
    season = semester;
}
public double courseAverage(Class[] semester) {
    double average = 0;
    for (Class each: semester) {
        average += each.classPrecentGrade();
        average = (average / semester.length);
    }
    return average;
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
