package quiz1.question9;

import java.util.List;

/**
 * <code>l.replace(n -&gt; n.hashCode())</code>
 */
public class Answer2 extends Answer {

  @Override
  protected void replaceAllWithHashCode(List<Integer> l) {
    l.replace(n -> n.hashCode());
  }

  public static void main(String[] args) {
    new Answer2().validate();
  }

}
