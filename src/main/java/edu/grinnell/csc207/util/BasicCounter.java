package edu.grinnell.csc207.util;

public class BasicCounter implements Counter{
  protected int count;
  protected int start;

  public BasicCounter(int val) {
    this.count = val;
    this.start = val;
    //System.err.printf("BasicCounter(%d, %d)\n", count, start); 
  }

  public void increment() throws Exception{
    if (this.count > Integer.MAX_VALUE) {
      throw new Exception ("Value too large");
    } //if
    this.count = this.count + 1;
  } //increment()

  public void reset() {
    this.count = this.start;
  } //reset()

  public String toString() {
    return "[" + this.count + "]";
  }

  public int get() {
    return this.count;
  }

}
