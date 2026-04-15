public class Position {
    public int x;
    public int y;
    public int z;

    public Position(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Position(int x, int y) {
        this(x, y, 0);
    }

    public Position(Position source) {
        this.x = source.x;
        this.y = source.y;
        this.z = source.z;
    }
}
