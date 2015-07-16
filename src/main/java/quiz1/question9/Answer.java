package quiz1.question9;

import java.util.Arrays;
import java.util.List;

/**
 * Superclass for classes that represent an answer to
 * question 9.
 *
 * Question 9: To convert all the Integers in a list, l,
 * to their hash value, which of the following Lambda
 * expressions would work?
 */
public abstract class Answer {

  /**
   * Tests this answer for correctness.  The test is whether
   * an array of integers (1-10) is transformed into an array
   * of hash codes derived from those integers.  The transformed
   * array should actually be identical to the original array,
   * because the hash code of an Integer is an int with the
   * same value.
   *
   * @return true if this answer is correct, false if it is not
   */
  public boolean isCorrect() {
    final List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    final List<Integer> expectedResult = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    replaceAllWithHashCode(l);
    return expectedResult.equals(l);
  }

  /**
   * Given a list of integers, replaces each element with its
   * hash code.  The input list is modified.
   *
   * @param l a list of integers
   */
  protected abstract void replaceAllWithHashCode(List<Integer> l);

  /**
   * Tests this answer for correctness and outputs the result
   * to System.out.
   */
  public void validate() {
    System.out.println(
      this.getClass().getSimpleName()
      + " is "
      + ( isCorrect() ? "" : "not ")
      + "a correct answer.");
  }

}
