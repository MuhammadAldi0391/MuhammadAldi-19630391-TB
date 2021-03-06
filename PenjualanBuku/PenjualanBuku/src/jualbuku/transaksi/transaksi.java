package jualbuku.transaksi;

import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import jualbuku.koneksi;
import jualbuku.buku.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USESR
 */
public class transaksi extends javax.swing.JFrame {

    String [] Judul = {"No_Transaksi","Tanggal","Nama_Pembeli","Kode_Buku","Harga","Dibayar","Kembali"};
    int [] Lebar = {100,120,250,150,100,100,100};
    private String tgl;
    /**
     * Creates new form 
     */
    public transaksi() {
        koneksi tampil = new koneksi();
        initComponents();
        this.setLocationRelativeTo(null);

     tampil.settingJudulTable(JTableTransaksi, Judul);
     tampil.tampilTabel(JTableTransaksi, "SELECT * FROM tb_transaksi", Judul);
     tampil.settingLebarKolom(JTableTransaksi, Lebar);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Stok = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        Stok1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTableTransaksi = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnHapus = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtKembali = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        Harga = new javax.swing.JLabel();
        txtDibayar = new javax.swing.JTextField();
        btnCetak = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        txtNoTran = new javax.swing.JTextField();
        btnUbah = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnClear1 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        comboBuku = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 255));

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Tanggal");

        Stok.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Stok.setText("Harga");

        Stok1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Stok1.setText("Kembali");

        jScrollPane2.setName(""); // NOI18N

        JTableTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        JTableTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableTransaksiMouseClicked(evt);
            }
        });
        JTableTransaksi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTableTransaksiKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(JTableTransaksi);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nama Pembeli");

        btnHapus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnHapus.setText("Hapus ");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Cari Data");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Kode Buku");

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        Harga.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Harga.setText("Dibayar");

        txtDibayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDibayarActionPerformed(evt);
            }
        });
        txtDibayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDibayarKeyReleased(evt);
            }
        });

        btnCetak.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCetak.setText("Cetak");
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });

        btnSimpan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("No Transaksi");

        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCariKeyReleased(evt);
            }
        });

        btnUbah.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Form Transaksi");

        btnClear1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnClear1.setText("Keluar");
        btnClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear1ActionPerformed(evt);
            }
        });

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });

        comboBuku.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "001", "002", "003", "004", "005", "006", "007", "008", "009", "010" }));
        comboBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBukuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(Stok)
                            .addComponent(Harga)
                            .addComponent(jLabel1)
                            .addComponent(Stok1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                                .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNama)
                                    .addComponent(txtNoTran, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtKembali, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDibayar)
                                    .addComponent(txtHarga)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboBuku, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnClear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnHapus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnUbah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                    .addComponent(btnClear1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(223, 223, 223))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNoTran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)))
                        .addGap(42, 42, 42)
                        .addComponent(jLabel5)
                        .addGap(20, 20, 20)
                        .addComponent(Stok)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDibayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Harga)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUbah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnHapus)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnClear)
                            .addComponent(comboBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnClear1)
                            .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(Stok1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCetak)
                        .addGap(2, 2, 2))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnClear1ActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        String[] field ={"Nama_Pembeli","Kode_Buku","Harga","Dibayar","Kembali"};
        String[] isi ={txtNama.getText(),(String)comboBuku.getSelectedItem(),txtHarga.getText(),txtDibayar.getText(),txtKembali.getText()};
        new koneksi().UbahDinamis("tb_transaksi","No_Transaksi",txtNoTran.getText(), field, isi);
        JOptionPane.showMessageDialog(null,"Data Berhasil diubah");
        new koneksi().settingJudulTable(JTableTransaksi, Judul);
        new koneksi().tampilTabel(JTableTransaksi, "SELECT * FROM tb_transaksi", Judul);
        new koneksi().settingLebarKolom(JTableTransaksi, Lebar);
    }//GEN-LAST:event_btnUbahActionPerformed

    private void txtCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyReleased
        String Cari ="SELECT*FROM tb_transaksi WHERE Nama_Pembeli LIKE '%"+txtCari.getText()+"%' OR Kode_Buku LIKE '%"+txtCari.getText()+"%'";
        new koneksi().settingJudulTable(JTableTransaksi, Judul);
        new koneksi().tampilTabel(JTableTransaksi, Cari, Judul);
        new koneksi().settingLebarKolom(JTableTransaksi, Lebar);
    }//GEN-LAST:event_txtCariKeyReleased

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        if (txtNoTran.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Nomor Transaksi Belum diisi");
            txtNoTran.requestFocus();
        }else if (jDateChooser1.getDateFormatString().getBytes().equals("")){
            JOptionPane.showMessageDialog(null, "Tanggal Belum diisi");
            jDateChooser1.requestFocus();
        }else if (txtNama.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Nama Pembeli Belum diisi");
            txtNama.requestFocus();
        }else if (comboBuku.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null, "Kode Buku Belum diisi");
           comboBuku.requestFocus();
        }else if (txtHarga.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Harga Belum diisi");
            txtHarga.requestFocus();
        }else if(txtKembali.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Kembalian Belum terisi");
            txtKembali.requestFocus();
        }else if (txtDibayar.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Dibayar Belum diisi");
            txtDibayar.requestFocus();
        }else if (new koneksi().DuplicateKey("tb_transaksi","No_Transaksi",txtNoTran.getText())){
            JOptionPane.showMessageDialog(null, "Nomor Transaksi Sudah Terdaftar");
            txtNoTran.requestFocus();
        }else{
            String[] field ={"No_Transaksi","Tanggal","Nama_Pembeli","Kode_Buku","Harga","Dibayar","Kembali"};
            String[] isi ={txtNoTran.getText(),tgl,txtNama.getText(),(String)comboBuku.getSelectedItem(),txtHarga.getText(),txtDibayar.getText(),txtKembali.getText()};
            new koneksi().SimpanDinamis("tb_transaksi", field, isi);
            new koneksi().settingJudulTable(JTableTransaksi, Judul);
            new koneksi().tampilTabel(JTableTransaksi, "SELECT * FROM tb_transaksi", Judul);
            new koneksi().settingLebarKolom(JTableTransaksi, Lebar);
        }
    }//GEN-LAST:event_btnSimpanActionPerformed
public void kembali(){
    double bayar, kembali, harga;
        bayar= Double.parseDouble(txtDibayar.getText());
        harga= Double.parseDouble(txtHarga.getText());
        kembali = bayar - harga; 
        txtKembali.setText(Double.toString(kembali));
    
}
public void harga(){
    String Kode;
    double harga;
    
    Kode = String.valueOf(comboBuku.getSelectedItem());
    
    if (Kode=="001"){
        harga = 10000;
    }else if (Kode=="002"){
        harga = 90000;
    }else if (Kode=="003"){
        harga = 40000;
    }else if (Kode=="004"){
        harga = 80000;
    }else if (Kode=="005"){
        harga = 80000;
    }else if (Kode=="006"){
        harga = 90000;
    }else if (Kode=="007"){
        harga = 20000;
    }else if (Kode=="008"){
        harga = 20000;
    }else{
        harga = 10000;
    }
    txtHarga.setText(""+harga);
}
    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        // TODO add your handling code here:
        new koneksi().tampilreport("src/jualbuku/transaksi/reportTransaksi.jrxml", "SELECT*FROM tb_transaksi");
    }//GEN-LAST:event_btnCetakActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtNoTran.setText("");
        txtNama.setText("");
        txtKembali.setText("");
        comboBuku.setSelectedItem("001");
        txtHarga.setText("");
        txtDibayar.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        new koneksi().HapusDinamis("tb_transaksi","No_Transaksi", txtNoTran.getText());
        JOptionPane.showMessageDialog(null,"Berhasil dihapus");
        new koneksi().settingJudulTable(JTableTransaksi, Judul);
        new koneksi().tampilTabel(JTableTransaksi, "SELECT * FROM tb_transaksi", Judul);
        new koneksi().settingLebarKolom(JTableTransaksi, Lebar);
        txtNoTran.setText("");
        txtNama.setText("");
        txtKembali.setText("");
        comboBuku.setSelectedItem("001");
        txtHarga.setText("");
        txtDibayar.setText("");
    }//GEN-LAST:event_btnHapusActionPerformed

    private void JTableTransaksiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTableTransaksiKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTableTransaksiKeyPressed

    private void JTableTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableTransaksiMouseClicked
        int row = JTableTransaksi.getSelectedRow();
        txtNoTran.setText(JTableTransaksi.getModel().getValueAt(row,0).toString());
        jDateChooser1.setDateFormatString(JTableTransaksi.getModel().getValueAt(row,1).toString());
        txtNama.setText(JTableTransaksi.getModel().getValueAt(row,2).toString());
        comboBuku.setSelectedItem(JTableTransaksi.getModel().getValueAt(row,3).toString());
        txtHarga.setText(JTableTransaksi.getModel().getValueAt(row,4).toString());
        txtDibayar.setText(JTableTransaksi.getModel().getValueAt(row,5).toString());
        txtKembali.setText(JTableTransaksi.getModel().getValueAt(row,6).toString());
    }//GEN-LAST:event_JTableTransaksiMouseClicked

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        // TODO add your handling code here:
        if (jDateChooser1.getDate()!=null){
            SimpleDateFormat format_tanggal = new SimpleDateFormat("yyyy-MM-dd");
            tgl = format_tanggal.format(jDateChooser1.getDate()); 
        }
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void txtDibayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDibayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDibayarActionPerformed

    private void txtDibayarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDibayarKeyReleased
        // TODO add your handling code here:
        kembali();
    }//GEN-LAST:event_txtDibayarKeyReleased

    private void comboBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBukuActionPerformed
        harga();
    }//GEN-LAST:event_comboBukuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Harga;
    private javax.swing.JTable JTableTransaksi;
    private javax.swing.JLabel Stok;
    private javax.swing.JLabel Stok1;
    private javax.swing.JButton btnCetak;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClear1;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox<String> comboBuku;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtDibayar;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtKembali;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNoTran;
    // End of variables declaration//GEN-END:variables
}
