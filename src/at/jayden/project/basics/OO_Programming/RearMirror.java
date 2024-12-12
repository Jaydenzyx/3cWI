package at.jayden.project.basics.OO_Programming;

public class RearMirror {
    private int Mirrorsize;
    private int Mirrorposition; // 0 neutral, -10 nach links, +10 nach Rechts

    public RearMirror(int size, int position) {
        this.Mirrorsize = size;
        this.Mirrorposition = position;
    }

    public int getMirrorsize() {
        return Mirrorsize;
    }

    public void setMirrorsize(int size) {
        this.Mirrorsize = size;
    }

    public int getMirrorposition() {
        return Mirrorposition;
    }

    public void setMirrorposition(int position) {
        this.Mirrorposition = position;
    }
}
