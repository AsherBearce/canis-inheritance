package edu.cnm.deepdive;

public class CanisLupus extends Canis {

  private static int instanceCount = 0;

  public CanisLupus(){
    instanceCount++;
  }

  @Override
  public void hunt() {
    System.out.println("Hunt living prey in packs");
  }

  public void speak(){
    System.out.println("Howl!");
  }

  public static int getInstanceCount() {
    return instanceCount;
  }

}
