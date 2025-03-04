package learnway.components;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import learnway.model.AttendanceCardModel;


public class Card_InstructorDetails extends javax.swing.JPanel {
    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }

    private Color color1;
    private Color color2;

    public Card_InstructorDetails() {
        initComponents();
        setOpaque(false);
        color1 = Color.BLACK;
        color2 = Color.WHITE;
    }

    public void setData(AttendanceCardModel data) {
        cardTitle.setText(data.getTitle());
        cardValue.setText(data.getValue());
    }

  
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cardTitle = new javax.swing.JLabel();
        cardValue = new javax.swing.JLabel();

        setLayout(new java.awt.GridLayout(2, 1));

        cardTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cardTitle.setForeground(new java.awt.Color(255, 255, 255));
        cardTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cardTitle.setText("Details");
        add(cardTitle);

        cardValue.setFont(cardValue.getFont().deriveFont(cardValue.getFont().getStyle() | java.awt.Font.BOLD, cardValue.getFont().getSize()+8));
        cardValue.setForeground(new java.awt.Color(255, 255, 255));
        cardValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cardValue.setText("000");
        add(cardValue);
    }// </editor-fold>//GEN-END:initComponents

       @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.setColor(new Color(255, 255, 255, 50));
        g2.fillOval(getWidth() - (getHeight() / 2), 10, getHeight(), getHeight());
        g2.fillOval(getWidth() - (getHeight() / 2) - 20, getHeight() / 2 + 20, getHeight(), getHeight());
        super.paintComponent(grphcs);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cardTitle;
    private javax.swing.JLabel cardValue;
    // End of variables declaration//GEN-END:variables
}
