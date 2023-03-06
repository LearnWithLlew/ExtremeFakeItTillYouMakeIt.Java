package org.learnwithllew;

import com.github.larseckart.tcr.TestCommitRevertExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.learnwithllew.utils.Tracker;

import static org.junit.jupiter.api.Assertions.assertEquals;
@ExtendWith(TestCommitRevertExtension.class)
public class FizzBuzzTest {

  @Test
  public void test() {
    //Tracker.ResetAndLaunch();// Comment out after 1st run
    Tracker.TrackTestRuns(this::Check20);
    Tracker.TrackTestRuns(this::Check15);
    Tracker.TrackTestRuns(this::CheckNegative);
  }

  private void Check20() {
    String expected = "1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz,16,17,Fizz,19,Buzz";
    assertEquals(expected, FizzBuzz.print(20));
  }

  private void Check15() {
    String expected = "1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz";
    assertEquals(expected, FizzBuzz.print(15));
  }
  private void CheckNegative() {
    String expected = "";
    assertEquals(expected, FizzBuzz.print(-2));
  }
}