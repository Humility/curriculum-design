package com.humility.client.view.component;

/**
 * @author Humility <Yiling Yu>
 */
public class Message extends javax.swing.JPanel {

  /**
   * Creates new form Message
   */
  public Message() {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">
  private void initComponents() {

    profile = new javax.swing.JLabel();
    time = new javax.swing.JLabel();
    message = new javax.swing.JLabel();

    setPreferredSize(new java.awt.Dimension(612, 96));

    time.setFont(new java.awt.Font("幼圆", 0, 14)); // NOI18N
    time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    time.setText("2020-5-31 15时40分");

    message.setFont(new java.awt.Font("幼圆", 0, 18)); // NOI18N
    message.setText("This is the true message.");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                            .addComponent(profile, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(message, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                            .addContainerGap())
                    .addComponent(time, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(profile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(message, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                            .addGap(16, 16, 16))
    );
  }// </editor-fold>


  // Variables declaration - do not modify
  private javax.swing.JLabel message;
  private javax.swing.JLabel profile;
  private javax.swing.JLabel time;
  // End of variables declaration
}

