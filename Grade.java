public class Grade {

    public static String getGrade(int marks) {
        if (marks >= 90) return "Grade A";
        else if (marks >= 75) return "Grade B";
        else if (marks >= 60) return "Grade C";
        else if (marks >= 50) return "Grade D";
        else return "Grade F";
    }

    public static void main(String[] args) {

        int[] marksList = {95, 82, 67, 54, 40};

        System.out.println("Student Grades:");
        System.out.println("----------------");

        for (int i = 0; i < marksList.length; i++) {
            int marks = marksList[i];
            System.out.println("Student " + (i + 1) +
                    " Marks: " + marks +
                    " -> " + getGrade(marks));
        }
    }
}
