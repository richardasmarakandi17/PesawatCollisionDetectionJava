package id.ac.its.richard0017.syafiq0089.afifan0234;

<<<<<<< HEAD
public class Alien extends Sprite {

    private final int INITIAL_X = 400;

    public Alien(int x, int y) {
        super(x, y);

        initAlien();
    }
=======

public class Alien extends Sprite {

		private final int INITIAL_X = 400;
	    
	    public Alien(int x, int y) {
	        super(x, y);
>>>>>>> eee7c9c2ad11e31973bc6e4003a1759a7aa0aa36

    private void initAlien() {

        loadImage("src/resources/alien.png");
        getImageDimensions();
    }
    
    //Alien akan kembali ke screen sisi kanan setelah hilang melewati sisi kiri layar
    public void move() {

<<<<<<< HEAD
        if (x < 0) {
            x = INITIAL_X;
        }

        x -= 1;
    }
}
=======
	        loadImage("src/resources/alien.png");
	        getImageDimensions();
	    }
	    
	    public void move() {

	        if (x < 0) {
	            x = INITIAL_X;
	        }

	        x -= 1;
	    }
}
>>>>>>> eee7c9c2ad11e31973bc6e4003a1759a7aa0aa36
