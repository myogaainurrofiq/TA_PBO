package bank;

import javax.swing.*;
import java.awt.*;


public class BankATM extends ATM {


    public BankATM() {
        initComponents();
    }

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {
        setMasukan(Integer.parseInt(JOptionPane.showInputDialog("Enter a Number : ")));
        JOptionPane.showMessageDialog(rootPane,"Your Current Balance is : Rp"+ (getSaldo() + getMasukan()));
        setHasil(getSaldo()+getMasukan());
        setSaldo(getHasil());
        jawab = String.format(" %,.2f ",getSaldo());
        jtxtTampilan2.setText(jawab);
    }

    private void btnCekSaldoActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(rootPane, "Your Current Balance is : Rp"+ getSaldo());
        jawab = String.format(" %,.2f ",getSaldo());
        jtxtTampilan2.setText(jawab);
    }

    private void btnTransferActionPerformed(java.awt.event.ActionEvent evt) {
        JComboBox<String> listATM = new JComboBox<>(ATM);
        JOptionPane.showMessageDialog(null, listATM, "Destination Account",
                JOptionPane.QUESTION_MESSAGE);
        String rektujuan = listATM.getItemAt(listATM.getSelectedIndex());
        String nama3=JOptionPane.showInputDialog("Enter Account ");
        setMasukan(Integer.parseInt(JOptionPane.showInputDialog("Enter the amount you want to transfer : ")));
        if (getSaldo() <= getMasukan()) {
            JOptionPane.showMessageDialog(rootPane,"Your balance is insufficient");
            JOptionPane.showConfirmDialog(null, " Do you want to continue?");
            JOptionPane.showMessageDialog(rootPane,"Add Your Account Balance");
            System.exit(0);
        } else if (getSaldo() >= getMasukan()) {
            setHasil(getSaldo()-getMasukan());
            setSaldo(getHasil());
            jawab = String.format(" %,.2f ", getHasil());
            jtxtTampilan2.setText(jawab);
            JOptionPane.showMessageDialog(rootPane, "Your Current Balance is : Rp" + getSaldo() + "\n" + "Transfer successful to " + nama3 + " " + rektujuan + " account " + " for : Rp" + getMasukan());
        }
    }

    private void btnAmbilActionPerformed(java.awt.event.ActionEvent evt) {
        setMasukan(Integer.parseInt(JOptionPane.showInputDialog("Enter the amount you want to withdraw : ")));
        setHasil(getSaldo()-getMasukan());
        setSaldo(getHasil());
        jawab = String.format(" %,.2f ", getHasil());
        jtxtTampilan2.setText(jawab);
        JOptionPane.showMessageDialog(rootPane,"Your Current Balance is : Rp"+ getSaldo()+ "\n");
    }

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {
        jtxtTampilan2.setText("");
    }

    private JTextField jtxtTampilan2;

    @SuppressWarnings("unchecked")
    private void initComponents() {

        JButton btnAmbil = new JButton();
        JButton btnKeluar = new JButton();
        JLabel jLabel4 = new JLabel();
        JLabel jLabel5 = new JLabel();
        JButton btnCekSaldo = new JButton();
        jtxtTampilan2 = new JTextField();
        JButton btnClear = new JButton();
        JLabel jLabel1 = new JLabel();
        JLabel jLabel3 = new JLabel();
        JButton btnSimpan = new JButton();
        JButton btnTransfer = new JButton();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Roboto Regular", 0, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("  Type of Services");

        jLabel4.setFont(new java.awt.Font("Roboto Regular", 0, 19)); // NOI18N
        jLabel4.setForeground(java.awt.Color.black);
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Welcome to");

        jLabel5.setFont(new java.awt.Font("Roboto Semi Bold", 0, 22)); // NOI18N
        jLabel5.setForeground(Color.black);
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("US Bank");

        btnCekSaldo.setText("Check");
        btnCekSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekSaldoActionPerformed(evt);
            }
        });

        btnSimpan.setText("Save");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnTransfer.setText("Transfer");
        btnTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferActionPerformed(evt);
            }
        });

        btnAmbil.setText("Withdraw");
        btnAmbil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmbilActionPerformed(evt);
            }
        });

        btnKeluar.setText("Logout");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Regular", 0, 13)); // NOI18N
        jLabel1.setText(" Your Current Balance : Rp");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setBackground(Color.pink);
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(109, 109, 109)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btnTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btnAmbil, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btnCekSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(70, 70, 70)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jtxtTampilan2)
                                                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))))))
                                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnCekSaldo)
                                        .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnSimpan)
                                        .addComponent(jtxtTampilan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnTransfer)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnAmbil))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(btnClear)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnKeluar)
                                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }


}
