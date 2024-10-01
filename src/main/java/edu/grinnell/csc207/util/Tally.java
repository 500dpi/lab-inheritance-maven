package edu.grinnell.csc207.util;

/**
 * Objects that Tally values.
 */
public class Tally extends BasicCounter {
  /**
   * Create a new Tally.
   *
   * @param start
   *   The initial value of the tally.
   */
  public Tally() {
    super(0);
    //System.err.printf("Tally(%d)\n", start); 
  } // Tally(int)
} // class Tally