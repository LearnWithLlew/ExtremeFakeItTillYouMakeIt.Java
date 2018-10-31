package org.learnwithllew.utils;

import java.io.File;
import java.util.Arrays;

import org.lambda.actions.Action0;

import com.spun.util.LambdaThreadLauncher;
import com.spun.util.ObjectUtils;
import com.spun.util.io.FileUtils;

public class TestCounter
{
  public static File passFile = new File("fakeit.counter.pass.txt");
  public static File failFile = new File("fakeit.counter.fail.txt");
  public static void IncrementSuccess()
  {
    Increment(passFile);
  }
  public static void IncrementFailure()
  {
    Increment(failFile);
  }
  public static void Increment(File file)
  {
    long count = 0;
    if (file.exists())
    {
      count = Integer.parseInt(FileUtils.readFile(file).trim());
    }
    count++;
    FileUtils.writeFile(file, "" + count);
  }
  public static void Reset()
  {
    if (passFile.exists())
    {
      passFile.delete();
    }
    if (failFile.exists())
    {
      failFile.delete();
    }
  }
  public static void ResetAndLaunch(String javaPath, String counterDisplay)
  {
    Reset();
    Launch(javaPath, counterDisplay);
  }
  public static void Launch(String java, String jar)
  {
    new LambdaThreadLauncher(
        () -> LaunchProgram(java, "-jar", jar, passFile.getAbsolutePath(), failFile.getAbsolutePath()));
  }
  private static void LaunchProgram(String... programAndArguments)
  {
    try
    {
      //      System.out.println("Starting: " + program + " " + arguments);
      ProcessBuilder builder = new ProcessBuilder(programAndArguments);
      builder.start();
    }
    catch (Exception e)
    {
      throw new RuntimeException(String.format("Unable to launch: %s with arguments %s\nError Message: %s",
          Arrays.toString(programAndArguments), e.getMessage()), e);
    }
  }
  public static void Track(Action0 test)
  {
    try
    {
      test.call();
      TestCounter.IncrementSuccess();
    }
    catch (Throwable e)
    {
      TestCounter.IncrementFailure();
      throw ObjectUtils.throwAsError(e);
    }
  }
}