package quiz1.question9;

import java.util.List;

/**
 * <code>l.replaceAll(n -&gt; n.hashCode())</code>
 */
public class Answer4 extends Answer {

  @Override
  protected void replaceAllWithHashCode(List<Integer> l) {
    l.replaceAll(n -> n.hashCode());
  }

  public static void main(String[] args) {
    new Answer4().validate();
  }

}
