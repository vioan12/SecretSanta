import javax.swing.*;

public class Main {

    private static JPanel frm = new JPanel();
    public static void main(String[] args) {
        Read.readallnames();
        PairGeneration PG = new PairGeneration();
        JOptionPane.showMessageDialog(frm, "Done :)");
    }
}
