package grades;

/**
 * A grade in a course with a gpa.
 */
public abstract class Grade {

    /**
     * Return the GPA equivalent on the regular 4-point scale.
     *
     * @return a number in the range [0.0 .. 4.0]
     */
    public abstract double gpa();
}