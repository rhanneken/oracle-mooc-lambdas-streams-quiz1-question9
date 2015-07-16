package quiz1.question9;

import java.util.List;

/**
 * <code>l.replace(Integer::hashCode)</code>
 */
public class Answer1 extends Answer {

  @Override
  protected void replaceAllWithHashCode(List<Integer> l) {
    l.replace(Integer::hashCode);
  }

  public static void main(String[] args) {
    new Answer1().validate();
  }

}
