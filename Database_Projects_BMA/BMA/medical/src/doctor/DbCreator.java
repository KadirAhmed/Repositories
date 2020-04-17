/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DbCreator.java
 *
 * Created on Apr 23, 2009, 12:55:23 AM
 */

package doctor;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Ahmed
 */
public class DbCreator extends javax.swing.JFrame
{

    /** Creates new form DbCreator */
    public DbCreator()
    {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        Db_nm = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel1.setText("              CREATE DATABASE");

        jLabel2.setText("DB NAME");

        Db_nm.setFont(new java.awt.Font("Tahoma", 1, 12));

        jButton1.setText("CREATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Db_nm, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Db_nm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


    Connection connection = null;

    Statement statement = null;

    try
       {

      Class.forName("com.mysql.jdbc.Driver").newInstance();
    // String url = "jdbc:mysql://localhost/mysql";

     String url = "jdbc:mysql://192.168.0.1:3306/mysql";

     // Socket m = new Socket("192.168.0.56",3306);


      
      connection = (Connection) DriverManager.getConnection(url, "root", "ahmed");

      statement = (Statement) connection.createStatement();
      String hrappSQL = "CREATE DATABASE " + " "+Db_nm.getText();
      statement.executeUpdate(hrappSQL);

       statement.executeUpdate("USE"+ " " + Db_nm.getText());

       String table = "CREATE TABLE DOCTORBMA"+"("       +  //..........0 //
               "Name   VARCHAR(254), "             + //..........1 //
               "Fname  VARCHAR(254), "             + //..........2 //
               "Mname  VARCHAR(254), "             + //..........3 //
               "ID    VARCHAR(254),   "            + //..........4 //
               "B_D    VARCHAR(10), "              +  //..........5 //
               "B_M  VARCHAR(20)   ,"              + //..........6//
               "B_Y  VARCHAR(20)   ,"              + //..........7 //
               "Rlgn VARCHAR(15) ,  "              + //..........8 //
               "Bld_GRP VARCHAR(10),"              + //..........9 //
               "Gndr VARCHAR(10)   ,"              + //..........10 //
               "Emplmnt VARCHAR(10),"              +  //..........11 //
               "Ntnl_ID VARCHAR(254),"             + //..........12 //
               "BM_DC_Rg_NO VARCHAR(50),"          +  //..........13 //
               "Spclty VARCHAR(254),"              + //..........14 //
               "Mbbs VARCHAR(100),"                +  //..........15 //
               "Prmnt_adrs VARCHAR(254),"          + //..........16 //
               "Prsnt_adrs VARCHAR(254),"          +  //..........17 //
               "Phn_offc VARCHAR(50),"             + //..........18 //
               "Phn_home VARCHAR(50),"             +  //..........19 //
               "Cell_1  VARCHAR(50),"              + //..........20 //
               "Cell_2  VARCHAR(50),"              +  //..........21 //
               "Email_1 VARCHAR(50),"              + //..........22 //
               "Email_2 VARCHAR(50),"              +  //..........23 //
               "Fb_1    VARCHAR(50),"              + //..........24 //
               "Fb_2    VARCHAR(50),"              +  //..........25 //
               "MmbrShp_lt VARCHAR(20),"           +//..........26 //
               "Voter_ID VARCHAR(20),"             +//.........27//
               "Pic         BLOB,        "         +//.........28//
               "Branch      Varchar(20), "         +//.........29//
               "Branch_Code  Varchar(20),"         +//.........30//
               "MemberShip_ID Varchar(20),"        +//.........31//
               "Mbbs_yr  Varchar(20),"             + //.........32//
               "Fcps     Varchar(100),"            + //..........33//
               "Fcps_yr  Varchar(20),"             + //.........34//
               "Ms       Varchar(100),"            + //..........35//
               "Ms_yr    Varchar(20),"             + // .......36//
               "Md       Varchar(100),"             + //.....37 //
               "Md_yr    Varchar(20),"             + //.....38 //
               "Dgo      Varchar(100),"             + //....39 //
               "Dgo_yr   Varchar(20),"             + //....40 //
               "Dlo      Varchar(100),  "          + //...41 //
               "Dlo_yr   Varchar(20), "            + //.....42 //
               "Dfm      Varchar(100),"            + //.....43 //
               "Dfm_yr   Varchar(20),"             + // ....44 //
               "Mphil    Varchar(100),"            + //.....45 //
               "Mphil_yr Varchar(20),"             + // ....46 //
               "ID_NO_FOR_SORTING  INTEGER)";       //....47 //

       statement.executeUpdate(table);



      }
    
    catch (Exception e)
    {
      e.printStackTrace();
    } finally {
      if (statement != null)
      {
        try {
          statement.close();
        } catch (SQLException e) {
        } // nothing we can do
      }
      if (connection != null) {
        try {
          connection.close();
        } catch (SQLException e) {
        } // nothing we can do
      }
    }



 Runnable r = new Runnable()
 {

            public void run()
            {
                 Profile test = new Profile();
                 test.Access_Dbnm = Db_nm.getText();
                 test.setVisible(true);
            }
  };

 r.run();


 this.dispose();






    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */

    /*
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DbCreator().setVisible(true);
            }
        });
    }
*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Db_nm;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

}
