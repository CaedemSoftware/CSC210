/*
*  Assignment [ASSIGNMENT Four]
*  Description: [The programs outlines two sets of course information
                using methods.]
*  Name: [Ze Lei]
*  ID: [918312764]
*  Class: CSC 210-04
*  Semester: Spring 2019
 */

/**
 *
 * @author Ze Y Lei
 */
public class Assignment4 {
    public static void main(String[] args) {
        /*The following lines set the arguments for
        the displayCourseInfo method*/
        displayCourseInfo(20, 40, 70);
        displayCourseInfo(90, 70, 60);
}
public static void displayCourseInfo(double score1, 
        double score2, double score3) {
    /*The following statement displays the overall score based on the 
    scores stated in the main method*/
    System.out.println("Your average is " + 
            getOverallScore(score1, score2, score3));
    /*The following statements displays a letter grade based on the scores 
    listed in the main method*/
    System.out.print("Your grade is ");
    //The following if statement issues an F in any scores are below 30
    if (score1 <= 30 || score2 <= 30 || score3 <= 30) {
        System.out.println("F");
    } else System.out.println(getLetterGrade
            (getOverallScore(score1, score2, score3)));
}
public static double getOverallScore(double score1, 
        double score2, double score3) {
    //The following statement averages the three scores
    double average = (score1 + score2 + score3)/3;
    //The following statement stores the average in the method
    return average;
}
public static String getLetterGrade(double overallScore) {
    //The following statement initializes a string called "grade"
    String grade = "Error";
    /*The following if else chain determines the letter grade based on the
    overall score*/
    if (overallScore >= 97) {
        grade = "A+";
    } else if (overallScore >= 93) {
        grade = "A";
    } else if (overallScore >= 90) {
        grade = "A-";
    } else if (overallScore >= 87) {
        grade = "B+";
    } else if (overallScore >= 83) {
        grade = "B";
    } else if (overallScore >= 80) {
        grade = "B-";
    } else if (overallScore >= 77) {
        grade = "C+";
    } else if (overallScore >= 70) {
        grade = "C";
    } else if (overallScore >= 67) {
        grade = "D+";
    } else if (overallScore >= 60) {
        grade = "D";
    } else {
        grade = "F";
    }
    //The following return statement stores the letter grade in the method
        return grade;
}
}
