# PesawatCollisionDetectionJava
Merupakan sebuah tugas dari mata kuliah Pemrograman Berbasis Objek, yaitu mengaplikasikan sebuah game dengan collision detection pada web http://zetcode.com/javagames/collision/

Berikut penjelasan mengenai setiap Class nya :

1. Sprite.java

dalam class sprite, terdapat 6 variabel, yaitu
protected int x = yaitu posisi secara horizontal gambar yang akan di render
protected int y = yaitu posisi secara vertical gambar yang akan di render
protected int width = yaitu lebar gambar yang akan di render
protected int height = yaitu panjang gambar yang akan di render
protected boolean visible = yaitu flag untuk menandai gambar terlihat atau tidak
protected Image image = yaitu variable untuk menampung gambar

lalu terdapat beberapa fungsi,
yang pertama Constructornya public Sprite dengan parameter x dan y yang keduanya bertipe integer.
fungsi ini sebagai inisiasi/awal letak gambarnya, juga untuk mengatur gambar terlihat atau tidak.

yang kedua adalah protected void getImageDimensions tanpa parameter yang digunakan untuk mendapatkan
nilai panjang dan lebar dari gambarnya

yang ketiga void loadImage dengan parameter imageName dengan tipe data String. imageName
adalah variabel yang digunakan untuk mencatat nama dari gambar yang akan diload atau diproses
lalu fungsinya digunakan untuk meload image yang akan di render.

yang keempat Image getImage tanpa parameter. yang digunakan untuk mendapatkan image yang dipanggil

yang kelima sampai ke kedelapan mengandung getter untuk posisi x, posisi y, isVisible dan tambahan
setter untuk isVisible sehingga bisa diatur gambar nampak atau tidak.

yang terakhir terdapat fungsi dengan return Rectangle bernama getBounds untuk mendapatkan border
atau sebuah kotak yang merepresentasikan panjang dan lebar gambar

2. Missile.java

dalam class Missile yang merupakan child dari sprite atau gerenalization dari sprite mengandung 2
variabel yaitu :
private final int BOARD_WIDTH = yaitu variabel yang digunakan untuk menyimpan lebar window ketika
di run pada tampilan layar
private final int MISSILE_SPEED = yaitu variabel yang digunakan untuk menyimpan kecepatan missile
atau besarnya perpindahan pada misil yang akan diluncurkan pesawat.

lalu terdapat beberapa fungsi,
yang pertama adalah constructor itu sendiri dengan parameter x dan y dengan tipe data integer.
constructor ini memanggil constructor dari parentnya, yaitu sprite. maka dengan kata lain,
constructor pada missile.java ini mengatur letak dari sprite atau gambar yang akan di render
pada poin x,y. lalu terdapat tambahan selain memanggil constructor dari parent, adalah memanggil
fungsi initMissile yang terdapat dan akan dijelaskan pada fungsi yang kedua

yang kedua ini adalah fungsi initMissile dengan return tipe void dan tanpa parameter. fungsi ini
digunakan sebagai sebuah inisiasi saat missile hendak dilepaskan dari pesawat. lebih rincinya,
inisiasi ini memanggil fungsi untuk meload gambar yang akan dirender dan mendapatkan panjang dan
lebar dari gambar (yang disini adalah gambar misil/missile)

lalu yang terakhir terdapat fungsi move dengan return tipe void dan tanpa parameter. fungsi ini
digunakan ketika missile telah bergerak menjauhi pesawat atau dapat dibilang telah ditembakkan
dari pesawat. fungsi ini digunakan untuk menggerakkan misil ke kanan dengan cara mengubah posisi
misil pada bidang horizontal atau sumbu x secara konstan dengan perpindahan posisi sebesar 
MISSILE_SPEED, sehingga misil tampak bergerak. lalu dalam fungsi ini juga terdapat pengecekan,
jika posisi misil melebihi dari lebar layar window, maka gambar akan di set/atur tidak terlihat
sehingga seakan2 misil keluar dari layar window.

3. CollisionEx.java
dalam class CollisionEx yang memanfaatkan JFrame sebagai parent, tidak terdapat variabel lokal
pada class ini. terdapat tiga fungsi pada class ini

yang pertama adalah constructornya, yaitu memanggil fungsi yang bernama initUI yang terdapat juga
di dalam kelas ini dan akan dijelaskan pada fungsi berikutnya

fungsi kedua inilah yang bernama initUI. pada fungsi initUI ini, langkah pertama yang dilakukan
adalah add(new Board()) yaitu membuat sebuah objek yang akan menjadi basis dari sebuah
permainan, tempat berbagai macam objek diletakkan/dirender. atau analoginya seperti papan tulis 
yang digunakan sebagai media untuk menggambar. lalu kedua, fungsi ini mengeset agar window tidak
resizeable atau tidak dapat di resize. lalu terdapat pemanggilan fungsi pack() yang mengakibatkan
semua yang berada pada window sesuai atau lebih dari ukuran window yang telah ditetapkan. lalu 
terdapat pemanggilan fungsi setTitle dengan parameter "Collision" yang digunakan untuk menamai
judul/tulisan pada window. lalu ada pemanggilan fungsi/method setLocationRelativeTo dengan
parameter null yang berfungsi untuk meletakkan window defaultnya pada tengah2 layar sehingga
ketika program dijalankan, window akan berada pada tengah2 layar. terdapat juga pemanggilan
fungsi setDefaultCloseOperation dengan komponen parameter JFrame.EXIT_ON_CLOSE yang bertujuan 
ketika program diclose, akan menggunakan method exit dari sistem.

fungsi ketiga ini adalah fungsi main. dalam fungsi main ini, terdapat pemanggilan fungsi
EventQueue.invokeLater() yang bertujuan untuk memanggil fungsi yang dibutuhkan secara asinkronus.
dengan komponen parameter pembuatan objek baru dari class CollisionEx() dan mengatur objek
tersebut untuk terlihat pada layar(mengubah nilai setVisible ke true)