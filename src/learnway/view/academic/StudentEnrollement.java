/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package learnway.view.academic;

import javax.swing.JScrollBar;

/**
 *
 * @author Ishara Deshan
 */
public class StudentEnrollement extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public StudentEnrollement() {
        initComponents();
       
           
            // Speed up the vertical scroll speed
            JScrollBar verticalScrollBar = jScrollPane1.getVerticalScrollBar();
            verticalScrollBar.setUnitIncrement(16);  // Set the unit increment to a higher value
            verticalScrollBar.setBlockIncrement(50); // Set the block increment to a higher value

            // Optionally, speed up the horizontal scroll speed
            JScrollBar horizontalScrollBar = jScrollPane1.getHorizontalScrollBar();
            horizontalScrollBar.setUnitIncrement(16); // Set the unit increment to a higher value
            horizontalScrollBar.setBlockIncrement(50); // Set the block increment to a higher value
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel10 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        typingAreaJPanel1 = new javax.swing.JPanel();
        detailjLabel1 = new javax.swing.JLabel();
        textEnterField1 = new learnway.components.TextField();
        typingAreaJPanel2 = new javax.swing.JPanel();
        detailjLabel2 = new javax.swing.JLabel();
        textEnterField2 = new learnway.components.TextField();
        jPanel6 = new javax.swing.JPanel();
        typingAreaJPanel3 = new javax.swing.JPanel();
        detailjLabel3 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        typingAreaJPanel4 = new javax.swing.JPanel();
        detailjLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        typingAreaJPanel5 = new javax.swing.JPanel();
        detailjLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        typingAreaJPanel6 = new javax.swing.JPanel();
        detailjLabel6 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        typingAreaJPanel7 = new javax.swing.JPanel();
        detailjLabel7 = new javax.swing.JLabel();
        textEnterField6 = new learnway.components.TextField();
        typingAreaJPanel8 = new javax.swing.JPanel();
        button5 = new learnway.components.Button();
        button6 = new learnway.components.Button();
        jPanel5 = new javax.swing.JPanel();
        typingAreaJPanel11 = new javax.swing.JPanel();
        detailjLabel11 = new javax.swing.JLabel();
        textEnterField9 = new learnway.components.TextField();
        typingAreaJPanel12 = new javax.swing.JPanel();
        detailjLabel12 = new javax.swing.JLabel();
        textEnterField10 = new learnway.components.TextField();
        typingAreaJPanel13 = new javax.swing.JPanel();
        detailjLabel13 = new javax.swing.JLabel();
        textEnterField11 = new learnway.components.TextField();
        typingAreaJPanel14 = new javax.swing.JPanel();
        detailjLabel14 = new javax.swing.JLabel();
        textEnterField12 = new learnway.components.TextField();
        typingAreaJPanel15 = new javax.swing.JPanel();
        detailjLabel15 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel9 = new javax.swing.JPanel();
        button3 = new learnway.components.Button();
        button4 = new learnway.components.Button();

        setLayout(new javax.swing.OverlayLayout(this));

        jScrollPane1.setToolTipText("");
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1075, 737));

        jPanel4.setLayout(new java.awt.GridLayout(1, 1));

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD, jLabel1.getFont().getSize()+24));
        jLabel1.setText("Student Enrollement");
        jPanel4.add(jLabel1);

        jPanel2.setLayout(new java.awt.GridLayout(2, 3, 10, 0));

        typingAreaJPanel1.setLayout(new java.awt.GridLayout(2, 1));

        detailjLabel1.setFont(detailjLabel1.getFont().deriveFont(detailjLabel1.getFont().getSize()+2f));
        detailjLabel1.setText("Line 01");
        typingAreaJPanel1.add(detailjLabel1);

        textEnterField1.setFont(textEnterField1.getFont().deriveFont(textEnterField1.getFont().getSize()+2f));
        typingAreaJPanel1.add(textEnterField1);

        jPanel2.add(typingAreaJPanel1);

        typingAreaJPanel2.setLayout(new java.awt.GridLayout(2, 1));

        detailjLabel2.setFont(detailjLabel2.getFont().deriveFont(detailjLabel2.getFont().getSize()+2f));
        detailjLabel2.setText("Line 02");
        typingAreaJPanel2.add(detailjLabel2);

        textEnterField2.setFont(textEnterField2.getFont().deriveFont(textEnterField2.getFont().getSize()+2f));
        typingAreaJPanel2.add(textEnterField2);

        jPanel2.add(typingAreaJPanel2);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 89, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel6);

        typingAreaJPanel3.setLayout(new java.awt.GridLayout(2, 1, 10, 0));

        detailjLabel3.setFont(detailjLabel3.getFont().deriveFont(detailjLabel3.getFont().getSize()+2f));
        detailjLabel3.setText("Province");
        typingAreaJPanel3.add(detailjLabel3);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        typingAreaJPanel3.add(jComboBox4);

        jPanel2.add(typingAreaJPanel3);

        typingAreaJPanel4.setLayout(new java.awt.GridLayout(2, 1));

        detailjLabel4.setFont(detailjLabel4.getFont().deriveFont(detailjLabel4.getFont().getSize()+2f));
        detailjLabel4.setText("District");
        typingAreaJPanel4.add(detailjLabel4);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        typingAreaJPanel4.add(jComboBox2);

        jPanel2.add(typingAreaJPanel4);

        typingAreaJPanel5.setLayout(new java.awt.GridLayout(2, 1));

        detailjLabel5.setFont(detailjLabel5.getFont().deriveFont(detailjLabel5.getFont().getSize()+2f));
        detailjLabel5.setText("City");
        typingAreaJPanel5.add(detailjLabel5);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        typingAreaJPanel5.add(jComboBox1);

        jPanel2.add(typingAreaJPanel5);

        jPanel3.setLayout(new java.awt.GridLayout(1, 3, 10, 0));

        typingAreaJPanel6.setLayout(new java.awt.GridLayout(2, 1));

        detailjLabel6.setFont(detailjLabel6.getFont().deriveFont(detailjLabel6.getFont().getSize()+2f));
        detailjLabel6.setText("Class");
        typingAreaJPanel6.add(detailjLabel6);

        jComboBox6.setFont(jComboBox6.getFont().deriveFont(jComboBox6.getFont().getSize()+2f));
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });
        typingAreaJPanel6.add(jComboBox6);

        jPanel3.add(typingAreaJPanel6);

        typingAreaJPanel7.setLayout(new java.awt.GridLayout(2, 1));

        detailjLabel7.setFont(detailjLabel7.getFont().deriveFont(detailjLabel7.getFont().getSize()+2f));
        detailjLabel7.setText("NIC");
        typingAreaJPanel7.add(detailjLabel7);

        textEnterField6.setFont(textEnterField6.getFont().deriveFont(textEnterField6.getFont().getSize()+2f));
        textEnterField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEnterField6ActionPerformed(evt);
            }
        });
        typingAreaJPanel7.add(textEnterField6);

        jPanel3.add(typingAreaJPanel7);

        button5.setBackground(new java.awt.Color(46, 204, 113));
        button5.setForeground(new java.awt.Color(255, 255, 255));
        button5.setText("Clear");
        button5.setFont(button5.getFont().deriveFont(button5.getFont().getStyle() | java.awt.Font.BOLD, button5.getFont().getSize()+2));
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        button6.setBackground(new java.awt.Color(230, 126, 34));
        button6.setForeground(new java.awt.Color(255, 255, 255));
        button6.setText("Check");
        button6.setFont(button6.getFont().deriveFont(button6.getFont().getStyle() | java.awt.Font.BOLD, button6.getFont().getSize()+2));
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout typingAreaJPanel8Layout = new javax.swing.GroupLayout(typingAreaJPanel8);
        typingAreaJPanel8.setLayout(typingAreaJPanel8Layout);
        typingAreaJPanel8Layout.setHorizontalGroup(
            typingAreaJPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(typingAreaJPanel8Layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        typingAreaJPanel8Layout.setVerticalGroup(
            typingAreaJPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, typingAreaJPanel8Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(typingAreaJPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.add(typingAreaJPanel8);

        jPanel5.setLayout(new java.awt.GridLayout(2, 3, 10, 0));

        typingAreaJPanel11.setLayout(new java.awt.GridLayout(2, 1));

        detailjLabel11.setFont(detailjLabel11.getFont().deriveFont(detailjLabel11.getFont().getSize()+2f));
        detailjLabel11.setText("First Name");
        typingAreaJPanel11.add(detailjLabel11);

        textEnterField9.setFont(textEnterField9.getFont().deriveFont(textEnterField9.getFont().getSize()+2f));
        typingAreaJPanel11.add(textEnterField9);

        jPanel5.add(typingAreaJPanel11);

        typingAreaJPanel12.setLayout(new java.awt.GridLayout(2, 1));

        detailjLabel12.setFont(detailjLabel12.getFont().deriveFont(detailjLabel12.getFont().getSize()+2f));
        detailjLabel12.setText("Last Name");
        typingAreaJPanel12.add(detailjLabel12);

        textEnterField10.setFont(textEnterField10.getFont().deriveFont(textEnterField10.getFont().getSize()+2f));
        typingAreaJPanel12.add(textEnterField10);

        jPanel5.add(typingAreaJPanel12);

        typingAreaJPanel13.setLayout(new java.awt.GridLayout(2, 1));

        detailjLabel13.setFont(detailjLabel13.getFont().deriveFont(detailjLabel13.getFont().getSize()+2f));
        detailjLabel13.setText("Mobile");
        typingAreaJPanel13.add(detailjLabel13);

        textEnterField11.setFont(textEnterField11.getFont().deriveFont(textEnterField11.getFont().getSize()+2f));
        typingAreaJPanel13.add(textEnterField11);

        jPanel5.add(typingAreaJPanel13);

        typingAreaJPanel14.setLayout(new java.awt.GridLayout(2, 1));

        detailjLabel14.setFont(detailjLabel14.getFont().deriveFont(detailjLabel14.getFont().getSize()+2f));
        detailjLabel14.setText("Email");
        typingAreaJPanel14.add(detailjLabel14);

        textEnterField12.setFont(textEnterField12.getFont().deriveFont(textEnterField12.getFont().getSize()+2f));
        typingAreaJPanel14.add(textEnterField12);

        jPanel5.add(typingAreaJPanel14);

        typingAreaJPanel15.setLayout(new java.awt.GridLayout(2, 1));

        detailjLabel15.setFont(detailjLabel15.getFont().deriveFont(detailjLabel15.getFont().getSize()+2f));
        detailjLabel15.setText("Gender");
        typingAreaJPanel15.add(detailjLabel15);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        typingAreaJPanel15.add(jComboBox3);

        jPanel5.add(typingAreaJPanel15);

        jPanel7.setLayout(new java.awt.GridLayout(2, 1, 0, 10));

        jLabel2.setFont(jLabel2.getFont().deriveFont(jLabel2.getFont().getStyle() | java.awt.Font.BOLD, jLabel2.getFont().getSize()+4));
        jLabel2.setText("Details");
        jPanel7.add(jLabel2);
        jPanel7.add(jSeparator2);

        jPanel8.setLayout(new java.awt.GridLayout(2, 1, 0, 10));

        jLabel3.setFont(jLabel3.getFont().deriveFont(jLabel3.getFont().getStyle() | java.awt.Font.BOLD, jLabel3.getFont().getSize()+4));
        jLabel3.setText("Address");
        jPanel8.add(jLabel3);
        jPanel8.add(jSeparator3);

        button3.setBackground(new java.awt.Color(235, 59, 90));
        button3.setForeground(new java.awt.Color(255, 255, 255));
        button3.setText("Back");
        button3.setFont(button3.getFont().deriveFont(button3.getFont().getStyle() | java.awt.Font.BOLD, button3.getFont().getSize()+2));
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button4.setBackground(new java.awt.Color(142, 68, 173));
        button4.setForeground(new java.awt.Color(255, 255, 255));
        button4.setText("Add");
        button4.setFont(button4.getFont().deriveFont(button4.getFont().getStyle() | java.awt.Font.BOLD, button4.getFont().getSize()+2));
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1068, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1068, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(532, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jScrollPane1.setViewportView(jPanel10);

        add(jScrollPane1);
    }// </editor-fold>//GEN-END:initComponents

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button4ActionPerformed

    private void textEnterField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEnterField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEnterField6ActionPerformed

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private learnway.components.Button button3;
    private learnway.components.Button button4;
    private learnway.components.Button button5;
    private learnway.components.Button button6;
    private javax.swing.JLabel detailjLabel1;
    private javax.swing.JLabel detailjLabel11;
    private javax.swing.JLabel detailjLabel12;
    private javax.swing.JLabel detailjLabel13;
    private javax.swing.JLabel detailjLabel14;
    private javax.swing.JLabel detailjLabel15;
    private javax.swing.JLabel detailjLabel2;
    private javax.swing.JLabel detailjLabel3;
    private javax.swing.JLabel detailjLabel4;
    private javax.swing.JLabel detailjLabel5;
    private javax.swing.JLabel detailjLabel6;
    private javax.swing.JLabel detailjLabel7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private learnway.components.TextField textEnterField1;
    private learnway.components.TextField textEnterField10;
    private learnway.components.TextField textEnterField11;
    private learnway.components.TextField textEnterField12;
    private learnway.components.TextField textEnterField2;
    private learnway.components.TextField textEnterField6;
    private learnway.components.TextField textEnterField9;
    private javax.swing.JPanel typingAreaJPanel1;
    private javax.swing.JPanel typingAreaJPanel11;
    private javax.swing.JPanel typingAreaJPanel12;
    private javax.swing.JPanel typingAreaJPanel13;
    private javax.swing.JPanel typingAreaJPanel14;
    private javax.swing.JPanel typingAreaJPanel15;
    private javax.swing.JPanel typingAreaJPanel2;
    private javax.swing.JPanel typingAreaJPanel3;
    private javax.swing.JPanel typingAreaJPanel4;
    private javax.swing.JPanel typingAreaJPanel5;
    private javax.swing.JPanel typingAreaJPanel6;
    private javax.swing.JPanel typingAreaJPanel7;
    private javax.swing.JPanel typingAreaJPanel8;
    // End of variables declaration//GEN-END:variables
}
