package edu.cnm.deepdive;

public class CanisLatrans extends Canis {

  private static int instanceCount = 0;

  public CanisLatrans() {
    instanceCount++;
  }

  @Override
  public void hunt() {
    System.out.println("Hunt small prey individually, larger prey, in packs.");
  }

  @Override
  public void speak() {
    System.out.println("Howl, bark, or yap.");
  }

  public static int getInstanceCount() {
    return instanceCount;
  }
}
