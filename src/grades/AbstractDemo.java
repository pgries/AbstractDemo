package grades;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrate the use of an abstract class.
 */
public class AbstractDemo {
    public static void main(String[] args) {
        LetterGrade g1 = new LetterGrade("D");
        System.out.println(g1.gpa());
        NumericGrade g2 = new NumericGrade(53);
        System.out.println(g2.gpa());

        // Because both LetterGrade and NumericGrade are subclasses of Grade,
        // we can put them together in a list.
        List<Grade> grades = new ArrayList<>();
        grades.add(g1);
        grades.add(g2);
        for (Grade g : grades) {
            System.out.println(g.gpa());
        }
    }
}
