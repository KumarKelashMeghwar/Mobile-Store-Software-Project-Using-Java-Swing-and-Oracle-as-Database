/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobilestore;

import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import java.awt.Color;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.axis.ValueAxis;
import java.sql.*;
import java.time.LocalDate;

/**
 *
 * @author Kelash
 */
public class SaleHistory extends javax.swing.JFrame {

    /**
     * Creates new form SaleHistory
     */
    public SaleHistory() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        pnlReport = new javax.swing.JPanel();
        closeBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        showGraphBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        pnlReport.setBackground(new java.awt.Color(204, 204, 204));
        pnlReport.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sales History Of Last Five Months", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        pnlReport.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                pnlReportComponentAdded(evt);
            }
        });

        javax.swing.GroupLayout pnlReportLayout = new javax.swing.GroupLayout(pnlReport);
        pnlReport.setLayout(pnlReportLayout);
        pnlReportLayout.setHorizontalGroup(
            pnlReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1023, Short.MAX_VALUE)
        );
        pnlReportLayout.setVerticalGroup(
            pnlReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );

        closeBtn.setBackground(new java.awt.Color(255, 255, 0));
        closeBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        closeBtn.setText("Close");
        closeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnMouseClicked(evt);
            }
        });
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(255, 255, 0));
        backBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backBtn.setText("Back");
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });

        showGraphBtn1.setBackground(new java.awt.Color(255, 255, 0));
        showGraphBtn1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        showGraphBtn1.setText("Show Graph");
        showGraphBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showGraphBtn1MouseClicked(evt);
            }
        });
        showGraphBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showGraphBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(showGraphBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(333, 333, 333)
                        .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(pnlReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showGraphBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeBtnMouseClicked

    private void pnlReportComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_pnlReportComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlReportComponentAdded

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed

    }//GEN-LAST:event_closeBtnActionPerformed

    private void showGraphBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showGraphBtn1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_showGraphBtn1MouseClicked

    private void showGraphBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showGraphBtn1ActionPerformed
        DefaultCategoryDataset dcd = new DefaultCategoryDataset();

        LocalDate today = LocalDate.now();

        Object currentMonth = today.getMonthValue();

        String months[] = new String[5];

        if (Integer.parseInt(currentMonth.toString()) == 1) {
            months[0] = "December";
            months[1] = "November";
            months[2] = "October";
            months[3] = "September";
            months[4] = "August";

            dcd.setValue(soldMobiles(8), "Sale", months[4]);
            dcd.setValue(soldMobiles(9), "Sale", months[3]);
            dcd.setValue(soldMobiles(10), "Sale", months[2]);
            dcd.setValue(soldMobiles(11), "Sale", months[1]);
            dcd.setValue(soldMobiles(12), "Sale", months[0]);
        }

        if (Integer.parseInt(currentMonth.toString()) == 2) {
            months[0] = "January";
            months[1] = "December";
            months[2] = "November";
            months[3] = "October";
            months[4] = "September";

            dcd.setValue(soldMobiles(9), "Sale", months[4]);
            dcd.setValue(soldMobiles(10), "Sale", months[3]);
            dcd.setValue(soldMobiles(11), "Sale", months[2]);
            dcd.setValue(soldMobiles(12), "Sale", months[1]);
            dcd.setValue(soldMobiles(1), "Sale", months[0]);
        }

        if (Integer.parseInt(currentMonth.toString()) == 3) {
            months[0] = "February";
            months[1] = "January";
            months[2] = "December";
            months[3] = "November";
            months[4] = "October";

            dcd.setValue(soldMobiles(10), "Sale", months[4]);
            dcd.setValue(soldMobiles(11), "Sale", months[3]);
            dcd.setValue(soldMobiles(12), "Sale", months[2]);
            dcd.setValue(soldMobiles(1), "Sale", months[1]);
            dcd.setValue(soldMobiles(2), "Sale", months[0]);
        }

        if (Integer.parseInt(currentMonth.toString()) == 4) {
            months[0] = "March";
            months[1] = "February";
            months[2] = "January";
            months[3] = "December";
            months[4] = "November";

            dcd.setValue(soldMobiles(11), "Sale", months[4]);
            dcd.setValue(soldMobiles(12), "Sale", months[3]);
            dcd.setValue(soldMobiles(1), "Sale", months[2]);
            dcd.setValue(soldMobiles(2), "Sale", months[1]);
            dcd.setValue(soldMobiles(3), "Sale", months[0]);
        }

        if (Integer.parseInt(currentMonth.toString()) == 5) {
            months[0] = "April";
            months[1] = "March";
            months[2] = "February";
            months[3] = "January";
            months[4] = "December";

            dcd.setValue(soldMobiles(12), "Sale", months[4]);
            dcd.setValue(soldMobiles(1), "Sale", months[3]);
            dcd.setValue(soldMobiles(2), "Sale", months[2]);
            dcd.setValue(soldMobiles(3), "Sale", months[1]);
            dcd.setValue(soldMobiles(4), "Sale", months[0]);
        }

        if (Integer.parseInt(currentMonth.toString()) == 6) {
            months[0] = "May";
            months[1] = "April";
            months[2] = "March";
            months[3] = "February";
            months[4] = "January";

            dcd.setValue(soldMobiles(1), "Sale", months[4]);
            dcd.setValue(soldMobiles(2), "Sale", months[3]);
            dcd.setValue(soldMobiles(3), "Sale", months[2]);
            dcd.setValue(soldMobiles(4), "Sale", months[1]);
            dcd.setValue(soldMobiles(5), "Sale", months[0]);
        }

        if (Integer.parseInt(currentMonth.toString()) == 7) {
            months[0] = "June";
            months[1] = "May";
            months[2] = "April";
            months[3] = "March";
            months[4] = "February";

            dcd.setValue(soldMobiles(2), "Sale", months[4]);
            dcd.setValue(soldMobiles(3), "Sale", months[3]);
            dcd.setValue(soldMobiles(4), "Sale", months[2]);
            dcd.setValue(soldMobiles(5), "Sale", months[1]);
            dcd.setValue(soldMobiles(6), "Sale", months[0]);
        }

        if (Integer.parseInt(currentMonth.toString()) == 8) {
            months[0] = "July";
            months[1] = "June";
            months[2] = "May";
            months[3] = "April";
            months[4] = "March";

            dcd.setValue(soldMobiles(3), "Sale", months[4]);
            dcd.setValue(soldMobiles(4), "Sale", months[3]);
            dcd.setValue(soldMobiles(5), "Sale", months[2]);
            dcd.setValue(soldMobiles(6), "Sale", months[1]);
            dcd.setValue(soldMobiles(7), "Sale", months[0]);
        }

        if (Integer.parseInt(currentMonth.toString()) == 9) {
            months[0] = "August";
            months[1] = "July";
            months[2] = "June";
            months[3] = "May";
            months[4] = "April";

            dcd.setValue(soldMobiles(4), "Sale", months[4]);
            dcd.setValue(soldMobiles(5), "Sale", months[3]);
            dcd.setValue(soldMobiles(6), "Sale", months[2]);
            dcd.setValue(soldMobiles(7), "Sale", months[1]);
            dcd.setValue(soldMobiles(8), "Sale", months[0]);
        }

        if (Integer.parseInt(currentMonth.toString()) == 10) {
            months[0] = "September";
            months[1] = "August";
            months[2] = "July";
            months[3] = "June";
            months[4] = "May";

            dcd.setValue(soldMobiles(5), "Sale", months[4]);
            dcd.setValue(soldMobiles(6), "Sale", months[3]);
            dcd.setValue(soldMobiles(7), "Sale", months[2]);
            dcd.setValue(soldMobiles(8), "Sale", months[1]);
            dcd.setValue(soldMobiles(9), "Sale", months[0]);
        }

        if (Integer.parseInt(currentMonth.toString()) == 11) {
            months[0] = "October";
            months[1] = "September";
            months[2] = "August";
            months[3] = "July";
            months[4] = "June";

            dcd.setValue(soldMobiles(6), "Sale", months[4]);
            dcd.setValue(soldMobiles(7), "Sale", months[3]);
            dcd.setValue(soldMobiles(8), "Sale", months[2]);
            dcd.setValue(soldMobiles(9), "Sale", months[1]);
            dcd.setValue(soldMobiles(10), "Sale", months[0]);
        }

        if (Integer.parseInt(currentMonth.toString()) == 12) {
            months[0] = "November";
            months[1] = "October";
            months[2] = "September";
            months[3] = "August";
            months[4] = "July";

            dcd.setValue(soldMobiles(7), "Sale", months[4]);
            dcd.setValue(soldMobiles(8), "Sale", months[3]);
            dcd.setValue(soldMobiles(9), "Sale", months[2]);
            dcd.setValue(soldMobiles(10), "Sale", months[1]);
            dcd.setValue(soldMobiles(11), "Sale", months[0]);
        }

        JFreeChart jChart = ChartFactory.createBarChart("", "Months", "Total Sold Mobiles", dcd, PlotOrientation.VERTICAL, true, true, false);

        CategoryPlot plot = jChart.getCategoryPlot();

        ValueAxis vx = plot.getRangeAxis();

        vx.setRange(0, 200);
        plot.setRangeAxis(0, vx);

        plot.setRangeGridlinePaint(Color.BLACK);

        ChartPanel chartPanel = new ChartPanel(jChart);

        chartPanel.setBounds(75, 45, 900, 450);

        pnlReport.removeAll();
        pnlReport.add(chartPanel);
        pnlReport.setVisible(true);
        pnlReport.updateUI();
    }//GEN-LAST:event_showGraphBtn1ActionPerformed

    private int soldMobiles(int monthValue) {
        int totalItems = 0;
        try {
            ResultSet rs = Database.DbConnect.st.executeQuery("select * from soldmobiles where extract(month from sal_date) = '" + monthValue + "'");

            while (rs.next()) {
                totalItems += rs.getInt("items");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return totalItems;
    }


    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        new AdminPanelFrame().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backBtnMouseClicked

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
            java.util.logging.Logger.getLogger(SaleHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SaleHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SaleHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SaleHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SaleHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton closeBtn;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel pnlReport;
    private javax.swing.JButton showGraphBtn1;
    // End of variables declaration//GEN-END:variables
}
