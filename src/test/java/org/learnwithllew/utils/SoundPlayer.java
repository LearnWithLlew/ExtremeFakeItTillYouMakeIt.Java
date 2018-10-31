package org.learnwithllew.utils;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

public class SoundPlayer
{
  public static void playSoundWithoutExceptions(String filename)
  {
    try
    {
      playSound(filename);
    }
    catch (Throwable t)
    {
      //throw ObjectUtils.throwAsError(t);
    }
  }
  public static void playSound(String filename)
      throws UnsupportedAudioFileException, IOException, LineUnavailableException
  {
    final int BUFFER_SIZE = 128000;
    AudioFormat audioFormat;
    String strFilename = filename;
    File soundFile = new File(strFilename);
    AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
    audioFormat = audioStream.getFormat();
    DataLine.Info info = new DataLine.Info(SourceDataLine.class, audioFormat);
    SourceDataLine sourceLine;
    sourceLine = (SourceDataLine) AudioSystem.getLine(info);
    sourceLine.open(audioFormat);
    sourceLine.start();
    int nBytesRead = 0;
    byte[] abData = new byte[BUFFER_SIZE];
    while (nBytesRead != -1)
    {
      try
      {
        nBytesRead = audioStream.read(abData, 0, abData.length);
      }
      catch (IOException e)
      {
        e.printStackTrace();
      }
      if (nBytesRead >= 0)
      {
        @SuppressWarnings("unused")
        int nBytesWritten = sourceLine.write(abData, 0, nBytesRead);
      }
    }
    sourceLine.drain();
    sourceLine.close();
  }
}
