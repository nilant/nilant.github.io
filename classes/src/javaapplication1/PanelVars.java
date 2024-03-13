/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PanelVars.java
 *
 * Created on 20-nov-2011, 13.48.22
 */
package javaapplication1;

/**
 *
 * @author mwimola
 */
public class PanelVars extends javax.swing.JPanel {
    private static int MAX_VAR = 6;
    
    private javaapplication1.PanelVar[] _vars = new javaapplication1.PanelVar[MAX_VAR];
    
    /** Creates new form PanelVars */
    Frazione[] vars = null;
            
    public PanelVars() 
    {
        initComponents();
        
        _vars[0] = _panelVar1;
        _vars[1] = _panelVar2;
        _vars[2] = _panelVar3;
        _vars[3] = _panelVar4;
        _vars[4] = _panelVar5;
        _vars[5] = _panelVar6;
        
        for(int i=0; i<_vars.length; i++)
        {
            _vars[i].setVisible(false);
        }

    } 
    
    public void SetNumVars(int numVar)
    {
        
        for(int i=0; i<_vars.length; i++)
        {
            _vars[i].setVisible(false);
        }
        
        for(int i=0; i<numVar; i++)
        {
            _vars[i].setVisible(true);
            _vars[i].SetX(i+1);
        }
        
                
        // setSize(50, 50);
    }

    public Frazione[] GetValues(int numVar)
    {
        Frazione[] riga = new Frazione[numVar];
        for(int i=0; i<numVar; i++)
        {
            riga[i] = _vars[i].getValue();
        }
        
        return riga;
    }
    
    public void resetValues()
    {
        for(PanelVar v : _vars)
        {
            v.setValue("");
        }
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _panelVar1 = new javaapplication1.PanelVar();
        _panelVar2 = new javaapplication1.PanelVar();
        _panelVar3 = new javaapplication1.PanelVar();
        _panelVar4 = new javaapplication1.PanelVar();
        _panelVar5 = new javaapplication1.PanelVar();
        _panelVar6 = new javaapplication1.PanelVar();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(_panelVar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_panelVar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_panelVar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_panelVar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_panelVar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_panelVar6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_panelVar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_panelVar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_panelVar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_panelVar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_panelVar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_panelVar6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javaapplication1.PanelVar _panelVar1;
    private javaapplication1.PanelVar _panelVar2;
    private javaapplication1.PanelVar _panelVar3;
    private javaapplication1.PanelVar _panelVar4;
    private javaapplication1.PanelVar _panelVar5;
    private javaapplication1.PanelVar _panelVar6;
    // End of variables declaration//GEN-END:variables
}
