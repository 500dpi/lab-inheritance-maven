package edu.grinnell.csc207.util;

public class DoubleCounter extends BasicCounter {

  public DoubleCounter(int start) {
    super(start);
  } // DoubleCounter(int)

  @Override
  public void increment() throws Exception { 
    super.increment();
    super.increment();
  } // increment()

} // class DoubleCounter 
