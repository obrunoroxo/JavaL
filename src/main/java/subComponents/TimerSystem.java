package subComponents;

public class TimerSystem {
  public void timerSystem(int timeinmilisseconds) {
      try {
          Thread.sleep(timeinmilisseconds);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
  }  
}
