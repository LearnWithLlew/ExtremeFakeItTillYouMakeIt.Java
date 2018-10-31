package org.learnwithllew;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.learnwithllew.utils.Tracker;

public class FizzBuzzTest
{
  @Test
  public void test()
  {
    Tracker.ResetAndLaunch();// Comment out after 1st run
    Tracker.TrackTestRuns(this::Check20);
  }
  private void Check20()
  {
    assertEquals(1, 2);
  }
}
