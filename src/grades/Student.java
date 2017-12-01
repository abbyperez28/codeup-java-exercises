package grades;

import java.util.ArrayList;

public class Student {
    private String studentName;

    //Declaring
    private ArrayList<Integer> grades;

    //Constructor that takes in a name argument and uses it to set the name
    public Student(String studentName) {
        this.studentName = studentName;

        //Initializing
        grades = new ArrayList<>();

    }

    public String getName() {
        return studentName;
    }

    //"Void"- no return line needed
    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage() {
        int numberOfGrades = grades.size();
        double sumOfAllGades = 0;
        double average;

        for (int grade : grades) {
            sumOfAllGades += grade;
        }

        average = sumOfAllGades / numberOfGrades;
        return average;
    }



    public static void main(String[] args) {
        System.out.println("Testing the student class...");
        Student student = new Student("Bob");

        System.out.println("Start with an empty array list of grades..");
        System.out.println("The number of elements in the grades array is " + student.grades.size());

        System.out.println("Now we will add three grades: 90, 75, 82");
        student.addGrade(90);
        student.addGrade(75);
        student.addGrade(82);

        double expectedGrade = (90 + 75 + 82) / 3;
        System.out.println("The expected average is: " + expectedGrade);
        System.out.println("The average produced by .getAverage is " + student.getGradeAverage());
        System.out.println("Now we know that .addGrade and .getAverageGrade work");
        System.out.println("We can use this class in the rest of our application");

    }

}

