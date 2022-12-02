//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package bank;

import java.awt.LayoutManager;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class iklan extends ATM {
    public iklan() {
        this.initComponents();
    }

    private void initComponents() {
        JDialog frame = new JDialog();
        frame.setDefaultCloseOperation(2);
        frame.setBounds(430, 0, 398, 450);
        frame.getContentPane().setLayout((LayoutManager)null);
        ImageIcon icon = new ImageIcon("ATMKOMP/src/images/promo.png", "iklan");
        JLabel label = new JLabel(icon);
        label.setBounds(-12, -35, 406, 480);
        frame.getContentPane().add(label);
        frame.setModal(true);
        frame.setVisible(true);
    }
}
