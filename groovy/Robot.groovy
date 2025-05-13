/** Robot */

class Point {
  
  private int x;
  private int y;
  
  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

interface ArtificialIntelligence {
    void move(Point destination)
    Point getPosition()

    boolean killEnemy(byte command)
}

class Robot implements ArtificialIntelligence {
    Point position

    Robot() {
        this.position = new Point(0, 0)
    }

    @Override
    void move(Point destination) {
        position = destination
    }

    @Override
    Point getPosition() {
        return this.position
    }

    @Override
    boolean killEnemy(byte command) {
        return checkAsimovLaws(command)
    }

    private boolean checkAsimovLaws(byte command) {
        return command >= 0
    }
}


ArtificialIntelligence aiRobot = new Robot()
aiRobot.killEnemy((byte) 123)

println "Works..."
