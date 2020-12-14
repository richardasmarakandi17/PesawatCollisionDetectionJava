package id.ac.its.richard0017.syafiq0089.afifan0234;

public class Alien extends Sprite {

    private final int INITIAL_X = 400;

    public Alien(int x, int y) {
        super(x, y);

        initAlien();
    }

    private void initAlien() {

        loadImage("src/resources/alien.png");
        getImageDimensions();
    }
    
    //Alien akan kembali ke screen sisi kanan setelah hilang melewati sisi kiri layar
    public void move() {

        if (x < 0) {
            x = INITIAL_X;
        }

        x -= 1;
    }
}