package popquiz;

public class Dimension {
    public int width;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }

    public int height;
    public int depth;
    public Dimension(int width,int height, int depth){
        this.depth=depth;
        this.height=height;
        this.width=width;

    }
}
