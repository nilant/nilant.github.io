/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PanelVar.java
 *
 * Created on 20-nov-2011, 13.42.21
 */
package javaapplication1;

import java.awt.Color;

/**
 *
 * @author mwimola
 */
public class PanelVar extends javax.swing.JPanel {

    private Frazione _var = null;
    
    /** Creates new form PanelVar */
    public PanelVar() {
        initComponents();
     // _inputDen.setText("");
        _inputNum.setText("");
    }
    
    public PanelVar(int i)
    {
        initComponents();
    }

    public void SetX(int i)
    {
        _x.setText("X" + i);
    }
    
    public void SetX(String s)
    {
        _x.setText(s);
    }
    
    public Frazione getValue()        
    {
        String frazNum = _inputNum.getText(); 

        if(frazNum.isEmpty())
            _var = new Frazione(0);           
        else 
        {
            int intNum = Integer.parseInt(frazNum);            
            _var = new Frazione(intNum);
        }
          return _var;
    }
    
    public void setValue(String s)
    {
        _inputNum.setText(s);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _inputNum = new javax.swing.JTextField();
        _x = new javax.swing.JLabel();

        _x.setText("___");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(_inputNum, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(_x)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_inputNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_x, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField _inputNum;
    private javax.swing.JLabel _x;
    // End of variables declaration//GEN-END:variables
}
