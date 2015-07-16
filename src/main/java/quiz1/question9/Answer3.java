package quiz1.question9;

import java.util.List;

/**
 * <code>l.replaceAll(Integer::hashCode)</code>
 */
public class Answer3 extends Answer {

  @Override
  protected void replaceAllWithHashCode(List<Integer> l) {
    l.replaceAll(Integer::hashCode);
  }

  public static void main(String[] args) {
    new Answer3().validate();
  }

}
