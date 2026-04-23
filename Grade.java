

import java.util.*;

public class Grade {
    public static void main(String[] args) {

        int[] marks = {85, 90, 70};  // hardcoded input

        for (int m : marks) {
            if (m >= 90)
                System.out.println("Grade A");
            else if (m >= 75)
                System.out.println("Grade B");
            else
                System.out.println("Grade C");
        }
    }
}
