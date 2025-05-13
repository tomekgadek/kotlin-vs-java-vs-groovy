/** Robot */

record Point(int x, int y) {}

interface ArtificialIntelligence {
    void move(Point destination);
    Point getPosition();

    default boolean killEnemy(byte command) {
        return checkAsimovLaws(command);
    }

    private boolean checkAsimovLaws(byte command) {
        return command >= 0;
    }
}

class Robot implements ArtificialIntelligence {
    private Point position;
    
    Robot() {
      this.position = new Point(0, 0);
    }

    @Override
    public void move(Point destination) {
        position = destination;
    }

    @Override
    public Point getPosition() {
        return this.position;
    }
}

class Main {
    public static void main(String[] args) {
      
      ArtificialIntelligence aiRobot = new Robot();
      aiRobot.killEnemy((byte) 123);
      
      System.out.println("Works...");
  }
}
