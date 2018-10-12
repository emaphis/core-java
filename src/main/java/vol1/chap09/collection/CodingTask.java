/*
 * Chapter 9 Collections
 * Section vol1.chap09.collection
 */
package vol1.chap09.collection;

/**
 *
 * @author emaphis
 */
public final class CodingTask extends Task {
   private final String spec;

   public CodingTask(String spec) {
      this.spec = spec;
   }

   public String getSpec() { return spec; }

   @Override
   public String toString() {
      return "code " + spec;
   }
}
