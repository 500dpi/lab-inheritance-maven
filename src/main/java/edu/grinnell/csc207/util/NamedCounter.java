package edu.grinnell.csc207.util;

/**
 * Counters that have names.
 */
public class NamedCounter extends DecrementableCounter {
  /**
   * The name associated with the counter.
   */
  String name;

  /**
   * Create a new named counter.
   *
   * @param counterName
   *   The name of the counter.
   * @param start
   *   The starting value (also used for reset).
   */
  public NamedCounter(String counterName, int start) {
    super(start);
    //System.err.printf("NamedCounter(%s, %d)\n", name, start); 
  } // NamedCounter(String, int)

   /**
   * Convert the counter to a string (e.g., for printing).
   */
  @Override
  public String toString() {
    return this.name + super.toString();
  } // toString()
} // class NamedCounter 
