package quiz1.question9;

import java.util.List;

/**
 * <code>l.replaceAll(Number::hashCode)</code>
 */
public class Answer5 extends Answer {

  @Override
  protected void replaceAllWithHashCode(List<Integer> l) {
    l.replaceAll(Number::hashCode);
  }

  public static void main(String[] args) {
    new Answer5().validate();
  }

}
