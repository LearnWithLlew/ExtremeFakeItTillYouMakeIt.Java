package org.learnwithllew.utils;

import org.lambda.actions.Action0;

import com.spun.util.ObjectUtils;

public class Tracker
{
  public static void TrackTestRuns(Action0 test)
  {
    try
    {
      TestCounter.Track(test);
      SoundSuccess();
    }
    catch (Throwable t)
    {
      SoundFailure();
      throw ObjectUtils.throwAsError(t);
    }
  }
  public static void SoundFailure()
  {
    SoundPlayer.playSoundWithoutExceptions("utils/fail.wav");
  }
  public static void ResetAndLaunch()
  {
    String java = "java";
    String counterDisplayJar = "utils/CounterDisplay.jar";
    TestCounter.ResetAndLaunch(java, counterDisplayJar);
  }
  public static void SoundSuccess()
  {
    SoundPlayer.playSoundWithoutExceptions("utils/pass.wav");
  }
}
