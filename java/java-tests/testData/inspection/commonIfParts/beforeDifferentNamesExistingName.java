// "Extract common part removing branch" "false"

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class IfStatementWithIdenticalBranches {
  int getX() {
    return 42;
  }

  int work() {
    if<caret>(true)  {
      final int y = getX();
      return y;
    } else {
      final int x = getX();
      final int y = getX();
      System.out.println(x);
      return x;
    }
  }
}