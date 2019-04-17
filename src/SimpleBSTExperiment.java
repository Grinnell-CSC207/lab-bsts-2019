import java.io.PrintWriter;

/**
 * A simple experiment with SimpleBSTs.
 */
public class SimpleBSTExperiment {

  // +------+--------------------------------------------------------
  // | Main |
  // +------+

  public static void main(String[] args) {
    PrintWriter pen = new PrintWriter(System.out, true);

    SimpleBST<String, String> example = new SimpleBST<String, String>();

    String[] phase1 = {"civet", "aardvark", "koala", "llama", "moose",
        "jackalope", "baboon", "dingo"};
    String[] phase2 = {"vicuna", "mouse", "aardwolf", "dog", "emu"};

    pen.println("Starting phase 1");
    addStrings(example, phase1);
    example.dump(pen);
    pen.println();

    pen.println("Starting phase 2");
    addStrings(example, phase2);
    example.dump(pen);
    pen.println();

    removeExperiment(pen, example, "vicuna"); // leaf?
    removeExperiment(pen, example, "koala"); // middle?
    removeExperiment(pen, example, "civet"); // root?

  } // main(String[])


  // +---------+-----------------------------------------------------
  // | Helpers |
  // +---------+

  /**
   * Add a bunch of simulated key/value pairs to a BST.
   */
  static void addStrings(SimpleBST<String, String> example, String[] strings) {
    for (String str : strings) {
      example.set(key(str), str);
    } // for
  } // add

  /**
   * Generate a key from a string.
   */
  static String key(String str) {
    return str.substring(0, 2);
  } // key(String)

  /**
   * A removal experiment
   */
  static void removeExperiment(PrintWriter pen,
      SimpleBST<String, String> example, String str) {
    pen.println("Removing '" + str + "'");
    example.remove(key(str));
    example.dump(pen);
    pen.println();
  } // removeExperiment

} // class SimpleBSTExperiment