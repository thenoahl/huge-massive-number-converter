/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import bo.Converter;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author noah.leuenberger
 */
public class ConverterInterface extends javax.swing.JFrame {

    /**
     * Creates new form ConverterInterface
     */
    public ConverterInterface() {
        try {
            javax.swing.UIManager.setLookAndFeel(new WindowsLookAndFeel());
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConverterInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        initComponents();

        txtInput.getDocument().addDocumentListener(new DocumentListener() {
            @Override public void changedUpdate(DocumentEvent e) { calculate(); }
            @Override public void removeUpdate (DocumentEvent e) { calculate(); }
            @Override public void insertUpdate (DocumentEvent e) { calculate(); }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        spinInputBase = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        spinOutputBase = new javax.swing.JSpinner();
        txtInput = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtOutput = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Huge Massive Number Converter");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLabel1.setText("Huge Massive Number Converter");

        jLabel2.setText("Input Base:");

        spinInputBase.setModel(new javax.swing.SpinnerNumberModel(10, 1, 36, 1));
        spinInputBase.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinInputBaseStateChanged(evt);
            }
        });
        spinInputBase.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                spinInputBasePropertyChange(evt);
            }
        });

        jLabel3.setText("Output Base:");

        spinOutputBase.setModel(new javax.swing.SpinnerNumberModel(2, 1, 36, 1));
        spinOutputBase.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinOutputBaseStateChanged(evt);
            }
        });

        txtInput.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtInput.setText("0");
        txtInput.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtInputInputMethodTextChanged(evt);
            }
        });
        txtInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputActionPerformed(evt);
            }
        });
        txtInput.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtInputPropertyChange(evt);
            }
        });

        jLabel4.setText("Input number:");

        jLabel5.setText("Output number:");

        txtOutput.setEditable(false);
        txtOutput.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(spinOutputBase)
                                    .addComponent(spinInputBase, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))))
                        .addGap(0, 184, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtInput)
                            .addComponent(txtOutput))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(spinInputBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(spinOutputBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void spinInputBaseStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinInputBaseStateChanged
        calculate();
    }//GEN-LAST:event_spinInputBaseStateChanged

    private void spinOutputBaseStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinOutputBaseStateChanged
        calculate();
    }//GEN-LAST:event_spinOutputBaseStateChanged

    private void txtInputInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtInputInputMethodTextChanged
        calculate();
    }//GEN-LAST:event_txtInputInputMethodTextChanged

    private void txtInputPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtInputPropertyChange
        calculate();
    }//GEN-LAST:event_txtInputPropertyChange

    private void txtInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputActionPerformed
        calculate();
    }//GEN-LAST:event_txtInputActionPerformed

    private void spinInputBasePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_spinInputBasePropertyChange
        calculate();
    }//GEN-LAST:event_spinInputBasePropertyChange

    private void calculate() {
        txtOutput.setText(Converter.convert(txtInput.getText(), (Integer) spinInputBase.getValue(), (Integer) spinOutputBase.getValue()));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSpinner spinInputBase;
    private javax.swing.JSpinner spinOutputBase;
    private javax.swing.JTextField txtInput;
    private javax.swing.JTextField txtOutput;
    // End of variables declaration//GEN-END:variables
}
