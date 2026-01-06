package praktikum1;
// kucing
class Kucing{
    String nama;
    String warna;
    int umur;

    Kucing(String nama, String warna, int umur) {
        this.nama = nama;
        this.warna = warna;
        this.umur = umur;
    }
    void mengeong(){
        System.out.println(nama + " mengeong : meow!");
    }
    void makan(String makanan){
        System.out.println(nama + " makan " + makanan);
    }
    void info(){
        System.out.println("Kucing nama : " + nama + ", warna : " + warna + ", umur : " + umur + " tahun");
    }
}

// motor
class Motor{
    String merk;
    String tipe;
    int bensin;
    int kecepatan;

    Motor(String merk, String tipe, int bensin){
        this.merk = merk;
        this.tipe = tipe;
        this.bensin = bensin;
        this.kecepatan = 0;
    }
    void gas(int tambah){
        kecepatan += tambah;
        if (bensin > 0){
            bensin -= 5;
        }
        if (bensin < 0){
            bensin = 0;
        }
        System.out.println("Motor " + merk + " gas, kecepatan : " + kecepatan + " km/jam, bensin: " + bensin +" %");
    }
    void rem(int kurang){
        kecepatan -= kurang;
        if (kecepatan < 0){
            kecepatan = 0;
            System.out.println("Motor " + merk + " rem, kecepatan: " + kecepatan +" km/jam");
        }
    }
    void info(){
        System.out.println("Motor merk : " + merk + ", tipe : " + tipe +", bensin : " + bensin + "%, kecepatan : " + kecepatan);
    }
}

// laptop
class Laptop{
    String merk;
    String prosesor;
    int baterai; // persen
    boolean menyala;

    Laptop(String merk, String prosesor, int baterai){
        this.merk = merk;
        this.prosesor = prosesor;
        this.baterai = baterai;
        this.menyala = false;
    }
    void nyalakan(){
        if (baterai <= 0){
            System.out.println("Laptop " + merk + " tidak bisa menyala, baterai habis!");
            return;
        }
        menyala = true;
        System.out.println("Laptop "+ merk+ " menyala.");
    }
    void matikan(){
        menyala = false;
        System.out.println("Laptop "+ merk+ " mati.");
    }
    void info(){
        System.out.println("Laptop merk : " + merk + ", prosesor : " + prosesor + ", baterai : " + baterai + "%, menyala : " + menyala);
    }
}

// buku
class Buku {
    String judul;
    String penulis;
    int halaman;
    int halamanSekarang;

    Buku(String judul, String penulis, int halaman) {
        this.judul = judul;
        this.penulis = penulis;
        this.halaman = halaman;
        this.halamanSekarang = 1;
    }
    void baca(int halamanDibaca) {
        halamanSekarang += halamanDibaca;
        if (halamanSekarang > halaman) halamanSekarang = halaman;
        System.out.println("Membaca \"" + judul + "\" sampai halaman " + halamanSekarang + "/" + halaman);
    }
    void info() {
        System.out.println("Buku{judul=" + judul + ", penulis=" + penulis + ", halaman=" + halaman + "}");
    }
}

//lampu
class Lampu {
    String warna;
    int terang; // 0-100
    boolean nyala;

    Lampu(String warna) {
        this.warna = warna;
        this.terang = 50;
        this.nyala = false;
    }
    void hidupkan() {
        nyala = true;
        System.out.println("Lampu " + warna + " menyala (terang " + terang + "%).");
    }
    void matikan() {
        nyala = false;
        System.out.println("Lampu " + warna + " mati.");
    }
    void setTerang(int nilai) {
        if (nilai < 0) nilai = 0;
        if (nilai > 100) nilai = 100;
        terang = nilai;
        System.out.println("Lampu " + warna + " diatur terang menjadi " + terang + "%.");
    }
    void info() {
        System.out.println("Lampu{warna=" + warna + ", terang=" + terang + "%, nyala=" + nyala + "}");
    }
}

// jam tangan
class JamTangan {
    String merk;
    int jam;
    int menit;

    JamTangan(String merk, int jam, int menit) {
        this.merk = merk;
        this.jam = jam;
        this.menit = menit;
    }
    void aturWaktu(int jam, int menit) {
        this.jam = (jam % 24 + 24) % 24;
        this.menit = (menit % 60 + 60) % 60;
        System.out.println("Jam " + merk + " diatur ke " + tampil());
    }
    String tampil() {
        return String.format("%02d:%02d", jam, menit);
    }
    void info() {
        System.out.println("JamTangan{merk=" + merk + ", waktu=" + tampil() + "}");
    }
}

// botol minuman
class BotolMinum {
    String bahan;
    int kapasitasMl;
    int isiMl;

    BotolMinum(String bahan, int kapasitasMl) {
        this.bahan = bahan;
        this.kapasitasMl = kapasitasMl;
        this.isiMl = 0;
    }
    void isi(int ml) {
        isiMl += ml;
        if (isiMl > kapasitasMl) isiMl = kapasitasMl;
        System.out.println("Botol diisi, sekarang: " + isiMl + "ml/" + kapasitasMl + "ml");
    }
    void minum(int ml) {
        isiMl -= ml;
        if (isiMl < 0) isiMl = 0;
        System.out.println("Minum " + ml + "ml, sisa: " + isiMl + "ml");
    }
    void info() {
        System.out.println("BotolMinum{bahan=" + bahan + ", kapasitas=" + kapasitasMl + "ml, isi=" + isiMl + "ml}");
    }
}

// pintu
class Pintu {
    String lokasi;
    boolean terkunci;
    boolean terbuka;

    Pintu(String lokasi) {
        this.lokasi = lokasi;
        this.terkunci = false;
        this.terbuka = false;
    }
    void buka() {
        if (terkunci) {
            System.out.println("Pintu " + lokasi + " terkunci, tidak bisa dibuka.");
            return;
        }
        terbuka = true;
        System.out.println("Pintu " + lokasi + " terbuka.");
    }
    void tutup() {
        terbuka = false;
        System.out.println("Pintu " + lokasi + " tertutup.");
    }
    void kunci() {
        terkunci = true;
        System.out.println("Pintu " + lokasi + " dikunci.");
    }
    void bukaKunci() {
        terkunci = false;
        System.out.println("Pintu " + lokasi + " dibuka kuncinya.");
    }
    void info() {
        System.out.println("Pintu{lokasi=" + lokasi + ", terkunci=" + terkunci + ", terbuka=" + terbuka + "}");
    }
}

// akun instagram
class AkunInstagram {
    String username;
    int followers;
    int jumlahPost;

    AkunInstagram(String username) {
        this.username = username;
        this.followers = 0;
        this.jumlahPost = 0;
    }
    void uploadPost(String caption) {
        jumlahPost++;
        System.out.println(username + " upload post #" + jumlahPost + ": " + caption);
    }
    void tambahFollowers(int n) {
        followers += n;
        if (followers < 0) followers = 0;
        System.out.println(username + " followers sekarang: " + followers);
    }
    void info() {
        System.out.println("AkunInstagram{username=" + username + ", followers=" + followers + ", post=" + jumlahPost + "}");
    }
}

// mahasiswa
class Mahasiswa {
    String nama;
    String nim;
    int semester;
    double ipk;

    Mahasiswa(String nama, String nim, int semester, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.semester = semester;
        this.ipk = ipk;
    }
    void belajar(String matkul) {
        System.out.println(nama + " belajar matkul " + matkul);
    }
    void naikSemester() {
        semester++;
        System.out.println(nama + " naik ke semester " + semester);
    }
    void info() {
        System.out.println("Mahasiswa{nama=" + nama + ", nim=" + nim + ", semester=" + semester + ", ipk=" + ipk + "}");
    }
}

public class soal1 {
    public static void main(String[] args) {
        Kucing k1 = new Kucing("Kiko","orange",1);
        Motor m1 = new Motor("Yamaha", "Mio", 90);
        Laptop l1 = new Laptop("Lenovo", "intel core i9", 85);
        Buku b1 = new Buku("Pemrograman Java", "Tim Dosen", 200);
        Lampu lp1 = new Lampu("Putih");
        JamTangan j1 = new JamTangan("Casio", 10, 15);
        BotolMinum bt1 = new BotolMinum("Stainless", 600);
        Pintu p1 = new Pintu("Kamar");
        AkunInstagram ig1 = new AkunInstagram("@disdukcapil_mt");
        Mahasiswa s1 = new Mahasiswa("Aldi", "D0224043", 2, 3.45);

        System.out.println("\n>>> KUCING <<<");
        k1.info();
        k1.mengeong();
        k1.makan("ikan");

        System.out.println("\n>>> MOTOR <<<");
        m1.info();
        m1.gas(20);
        m1.rem(5);

        System.out.println("\n>>> LAPTOP <<<");
        l1.info();
        l1.nyalakan();
        l1.matikan();

        System.out.println("\n>>> BUKU <<<");
        b1.info();
        b1.baca(25);

        System.out.println("\n>>> LAMPU <<<");
        lp1.info();
        lp1.hidupkan();
        lp1.setTerang(85);
        lp1.matikan();

        System.out.println("\n>>> JAM TANGAN <<<");
        j1.info();
        j1.aturWaktu(21, 7);

        System.out.println("\n>>> BOTOL MINUM <<<");
        bt1.info();
        bt1.isi(400);
        bt1.minum(150);

        System.out.println("\n>>> PINTU <<<");
        p1.info();
        p1.buka();
        p1.kunci();
        p1.buka();      // harusnya gagal karena terkunci
        p1.bukaKunci();
        p1.buka();
        p1.tutup();

        System.out.println("\n>>> AKUN INSTAGRAM <<<");
        ig1.info();
        ig1.tambahFollowers(120);
        ig1.uploadPost("Info layanan hari ini!");

        System.out.println("\n>>> MAHASISWA <<<");
        s1.info();
        s1.belajar("PBO");
        s1.naikSemester();
    }
}
