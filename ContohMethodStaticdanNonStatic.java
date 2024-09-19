public class ContohMethodStaticdanNonStatic {
    public static double hitungLuasPersegi(double sisi){
        return sisi;
    }

    public static void main(String[] args) {
        double  luasPersegi = ContohMethodStaticdanNonStatic.hitungLuasPersegi(20);
        System.out.println("Luas persegi: " + luasPersegi);

        ContohMethodStaticdanNonStatic object = new ContohMethodStaticdanNonStatic();
        object.tampilkanPesanSelamatDatang("Lukas Glean Samosir");
    }

    public void tampilkanPesanSelamatDatang(String nama){
        System.out.println("Selamat Datang, " + nama + " !");
    }
}
