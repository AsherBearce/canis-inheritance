package edu.cnm.deepdive;

public abstract class Canis {
  public static final int NUMBER_OF_LEGS = 4;

  private static int instanceCount = 0;

  public Canis() {
    instanceCount++;
  }

  public abstract void hunt();
  public abstract void speak();

  public static int getInstanceCount() {
    return instanceCount;
  }
}
