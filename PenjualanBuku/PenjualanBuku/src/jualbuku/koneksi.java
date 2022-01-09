package jualbuku;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Driver;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.io.File;
import net.sf.jasperreports.engine.JasperCompileManager; 
import net.sf.jasperreports.engine.JasperFillManager; 
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery; 
import net.sf.jasperreports.engine.design.JasperDesign; 
import net.sf.jasperreports.engine.xml.JRXmlLoader; 
import net.sf.jasperreports.view.JasperViewer;



public class koneksi {
    
    private String jdbcURL="jdbc:mysql://localhost:3306/penjualanbuku"; 
    private String username="root";
    private String password="";
    
    private DefaultTableModel Modelnya;
    private TableColumn Kolomnya;
    public String sql;
    
    public koneksi(){}
    public Connection getKoneksi() throws SQLException{
        try{
            Driver mysqldriver;
            mysqldriver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(mysqldriver);
            System.out.println("Konneksi DB Berhasil");
        }catch (Exception e){
            System.out.println(e.toString());
        }
                
      return DriverManager.getConnection(jdbcURL, username, password);         
    }

    public boolean DuplicateKey(String NamaTabel, String PrimaryKey, String isiData){
        boolean hasil = false;
        try{
            String SQL="SELECT * FROM "+NamaTabel+" WHERE "+PrimaryKey+" ='"+isiData+"'";
            Statement perintah = getKoneksi().createStatement();
            ResultSet hasilData = perintah.executeQuery(SQL);
            
            hasil=hasilData.next();
        }catch (Exception e){
            System.out.println(e.toString());
        }
        return hasil;
    }
    
    public void TampilDataBuku(){
        
    }

public String getFieldTabel(String[] FieldTabelnya){
    String Hasilnya ="";
    int deteksiIndexAkhir=FieldTabelnya.length-1;
    try{
        for(int i = 0; i < FieldTabelnya.length;i++){
            if (i==deteksiIndexAkhir){
                Hasilnya = Hasilnya + FieldTabelnya[i];
            }else{
               Hasilnya = Hasilnya + FieldTabelnya[i]+","; 
            }
            
        }             
    }catch (Exception e){
        System.out.println(e.toString()); 
    }
    return "("+Hasilnya+")";
}
public String getIsiTabel(String[]IsiTabelnya){
    String Hasilnya = "";
    int deteksiIndex=IsiTabelnya.length-1;         
    try {
       for(int i = 0; i < IsiTabelnya.length;i++){
            if (i==deteksiIndex){
                Hasilnya = Hasilnya + "'"+IsiTabelnya[i]+"'";
            }else{
               Hasilnya = Hasilnya + "'"+IsiTabelnya[i]+"',";
            } 
       }
    }catch(Exception e){
        System.out.println(e.toString()); 
    }
    return "("+Hasilnya+")";
}

public String getFieldValueEdit(String[] Field, String []value){
    String hasil = "";
    int deteksi = Field.length-1;
    try{
       for(int i = 0; i < Field.length;i++){
          if (i==deteksi){
                hasil = hasil +Field[i]+" ='"+value[i]+"'"; 
       }else{
              hasil = hasil +Field[i]+" ='"+value[i]+"',";
          }
       }
    }catch (Exception e){
        System.out.println(e.toString());
    }
        return hasil;
}

public void UbahDinamis(String NamaTabel, String PrimaryKey, String IsiPrimary, String [] Field, String [] Value){
    try{
        String SQLUbah = "UPDATE "+NamaTabel+" SET "+getFieldValueEdit(Field, Value)+" WHERE "+PrimaryKey+"='"+IsiPrimary+"'";
           Statement perintah = getKoneksi().createStatement();
           perintah.executeUpdate(SQLUbah);
           perintah.close();
           getKoneksi().close();
    }catch (Exception e){
        System.out.println(e.toString());
    }
    
}
public void SimpanDinamis(String NamaTabel, String[] Fieldnya, String[]Isinya){
    try{
        String SQLSave="INSERT INTO "+NamaTabel+" "+getFieldTabel(Fieldnya)+" VALUES "+getIsiTabel(Isinya);
        Statement perintah = getKoneksi().createStatement();
        perintah.executeUpdate(SQLSave);
        perintah.close();
        System.out.println("Data Berhasil Disimpan");
    }catch (Exception e){
        System.out.println(e.toString());
    }
}
public void HapusDinamis(String NamaTabel, String PK, String Isi){
    try{
        String SQL="DELETE FROM "+NamaTabel+" WHERE "+PK+"='"+Isi+"'";
        Statement perintah = getKoneksi().createStatement();
        perintah.executeUpdate(SQL);
        perintah.close();
        JOptionPane.showMessageDialog(null,"Data Berhasil Dihapus");
    }catch (Exception e){
        System.out.println(e.toString());
    }
}
 public void settingJudulTable(JTable Tabelnya, String[] JudulKolom){
     try{
         Modelnya = new DefaultTableModel();
         Tabelnya.setModel(Modelnya);
            Tabelnya.setModel(Modelnya);
            for (int i = 0; i < JudulKolom.length; i++) {
                Modelnya.addColumn(JudulKolom[i]);
            }
     }catch (Exception e){
         
     }
 }
 
 public void settingLebarKolom(JTable Tabelnya, int[] Kolom){
     try{
         Tabelnya.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
         for (int i = 0; i < Kolom.length; i++) {
                
         Kolomnya = Tabelnya.getColumnModel().getColumn(0);
         Kolomnya.setPreferredWidth(100);
         }
     }catch (Exception e){
         System.out.println(e.toString());
     }
     
 }
 
 public Object[][] isiTabel(String SQL, int jumlah){
      Object[][] data =null;
      try {
         Statement perintah = getKoneksi().createStatement();
         ResultSet dataset = perintah.executeQuery(SQL);
         dataset.last();
         int baris = dataset.getRow();
         dataset.beforeFirst();
         int j =0;
         
         data = new Object[baris][jumlah];
         
         while (dataset.next()){
             for (int i = 0; i < jumlah; i++) {
                 data[j][i]=dataset.getString(i+1);
             }
             j++;
         }
         
      } catch (Exception e) {
      }
      return data;
 }
public void tampilTabel(JTable Tabelnya, String SQL, String[] Judul){
      try {
        Tabelnya.setModel(new DefaultTableModel(isiTabel(SQL,Judul.length), Judul));
      } catch (Exception e) {
          System.out.println(e.toString());
      }
  }
public void tampilreport(String reportfile, String sql){
    try {
        File file = new File(reportfile);
JasperDesign jasDes = JRXmlLoader.load(file);

        JRDesignQuery sqlQuery = new JRDesignQuery();
        sqlQuery.setText(sql);
        jasDes.setQuery(sqlQuery);

        JasperReport JR = JasperCompileManager.compileReport(jasDes);
        JasperPrint JP = JasperFillManager.fillReport(JR,null,getKoneksi()); 
        JasperViewer.viewReport(JP);
    } catch (Exception e) {
    }
}
}