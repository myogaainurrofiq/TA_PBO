package bank;

class ATM extends javax.swing.JFrame{

    private int masukan;
    private double hasil, saldo;
    String jawab;
    String[] ATM = {"US","BNI", "Mandiri", "BRI", "BTN"};

    public String getRekening() {
        return "1";
    }

    public String getPass() {
        return "1";
    }

    public void setHasil(double hasil) {
        this.hasil = hasil;
    }

    public void setMasukan(int masukan) {
        this.masukan = masukan;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getHasil() {
        return hasil;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getMasukan() {
        return masukan;
    }
}
