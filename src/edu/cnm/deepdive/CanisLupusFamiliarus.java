package edu.cnm.deepdive;

public class CanisLupusFamiliarus extends CanisLupus
    implements Trainable {

  private static int instanceCount = 0;

  public CanisLupusFamiliarus() {
    instanceCount++;
  }

  public static int getInstanceCount() {
    return instanceCount;
  }

  @Override
  public void hunt() {
    System.out.println("Hunt for play.");
  }

  @Override
  public void speak() {
    System.out.println("Bark, unless I'm a Basenji.");
  }

  @Override
  public void perform() {
    System.out.print("Sit, speak, roll over, play dead.");
  }

}

