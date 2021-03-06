package com.t2tierp.escritafiscal.cliente;

import org.openswing.swing.mdi.client.InternalFrame;

/**
* <p>Title: T2Ti ERP</p>
* <p>Description: Tela FiscalLivroDetalhe.</p>
*
* <p>The MIT License</p>
*
* <p>Copyright: Copyright (C) 2010 T2Ti.COM
*
* Permission is hereby granted, free of charge, to any person
* obtaining a copy of this software and associated documentation
* files (the "Software"), to deal in the Software without
* restriction, including without limitation the rights to use,
* copy, modify, merge, publish, distribute, sublicense, and/or sell
* copies of the Software, and to permit persons to whom the
* Software is furnished to do so, subject to the following
* conditions:
*
* The above copyright notice and this permission notice shall be
* included in all copies or substantial portions of the Software.
*
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
* EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
* OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
* NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
* HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
* WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
* FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
* OTHER DEALINGS IN THE SOFTWARE.
*
*        The author may be contacted at:
*            t2ti.com@gmail.com</p>
*
* @author Claudio de Barros (t2ti.com@gmail.com)
* @version 1.0
*/
public class FiscalLivroDetalhe extends InternalFrame {

    private FiscalTermoGridController gridController;

    public FiscalLivroDetalhe(FiscalLivroDetalheController controller) {
        initComponents();

        form1.setFormController(controller);

        gridController = new FiscalTermoGridController();
        gridControl1.setController(gridController);
        gridControl1.setGridDataLocator(gridController);
    }

    /**
     * @return the form1
     */
    public org.openswing.swing.form.client.Form getForm1() {
        return form1;
    }

    /**
     * @return the gridController
     */
    public FiscalTermoGridController getGridController() {
        return gridController;
    }

    /**
     * @return the gridControl1
     */
    public org.openswing.swing.client.GridControl getGridControl1() {
        return gridControl1;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        editButton1 = new org.openswing.swing.client.EditButton();
        reloadButton1 = new org.openswing.swing.client.ReloadButton();
        saveButton1 = new org.openswing.swing.client.SaveButton();
        form1 = new org.openswing.swing.form.client.Form();
        labelControl1 = new org.openswing.swing.client.LabelControl();
        textControl3 = new org.openswing.swing.client.TextControl();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        insertButton1 = new org.openswing.swing.client.InsertButton();
        editButton2 = new org.openswing.swing.client.EditButton();
        deleteButton1 = new org.openswing.swing.client.DeleteButton();
        saveButton2 = new org.openswing.swing.client.SaveButton();
        reloadButton2 = new org.openswing.swing.client.ReloadButton();
        gridControl1 = new org.openswing.swing.client.GridControl();
        comboColumn3 = new org.openswing.swing.table.columns.client.ComboColumn();
        integerColumn4 = new org.openswing.swing.table.columns.client.IntegerColumn();
        integerColumn5 = new org.openswing.swing.table.columns.client.IntegerColumn();
        integerColumn6 = new org.openswing.swing.table.columns.client.IntegerColumn();
        textColumn7 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn8 = new org.openswing.swing.table.columns.client.TextColumn();
        dateColumn9 = new org.openswing.swing.table.columns.client.DateColumn();
        dateColumn10 = new org.openswing.swing.table.columns.client.DateColumn();
        dateColumn11 = new org.openswing.swing.table.columns.client.DateColumn();
        dateColumn12 = new org.openswing.swing.table.columns.client.DateColumn();
        dateColumn13 = new org.openswing.swing.table.columns.client.DateColumn();
        textColumn14 = new org.openswing.swing.table.columns.client.TextColumn();

        setTitle("T2Ti ERP - Escrita Fiscal");
        setPreferredSize(new java.awt.Dimension(700, 400));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Fiscal Livro"));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jPanel1.add(editButton1);
        jPanel1.add(reloadButton1);
        jPanel1.add(saveButton1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jPanel1, gridBagConstraints);

        form1.setVOClassName("com.t2tierp.escritafiscal.java.FiscalLivroVO");
        form1.setEditButton(editButton1);
        form1.setFunctionId("fiscalLivro");
        form1.setReloadButton(reloadButton1);
        form1.setSaveButton(saveButton1);
        form1.setLayout(new java.awt.GridBagLayout());

        labelControl1.setLabel("Descricao:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 5);
        form1.add(labelControl1, gridBagConstraints);

        textControl3.setAttributeName("descricao");
        textControl3.setEnabled(false);
        textControl3.setMaxCharacters(50);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        form1.add(textControl3, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Fiscal Termo"));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jPanel3.add(insertButton1);
        jPanel3.add(editButton2);
        jPanel3.add(deleteButton1);
        jPanel3.add(saveButton2);
        jPanel3.add(reloadButton2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        jPanel2.add(jPanel3, gridBagConstraints);

        gridControl1.setAutoLoadData(false);
        gridControl1.setDeleteButton(deleteButton1);
        gridControl1.setEditButton(editButton2);
        gridControl1.setFunctionId("fiscalTermo");
        gridControl1.setInsertButton(insertButton1);
        gridControl1.setReloadButton(reloadButton2);
        gridControl1.setSaveButton(saveButton2);
        gridControl1.setValueObjectClassName("com.t2tierp.escritafiscal.java.FiscalTermoVO");
        gridControl1.getColumnContainer().setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        comboColumn3.setColumnName("aberturaEncerramento");
        comboColumn3.setColumnRequired(false);
        comboColumn3.setDomainId("aberturaEncerramento");
        comboColumn3.setEditableOnEdit(true);
        comboColumn3.setEditableOnInsert(true);
        comboColumn3.setHeaderColumnName("Abertura Encerramento");
        comboColumn3.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        comboColumn3.setPreferredWidth(140);
        gridControl1.getColumnContainer().add(comboColumn3);

        integerColumn4.setColumnName("numero");
        integerColumn4.setColumnRequired(false);
        integerColumn4.setEditableOnEdit(true);
        integerColumn4.setEditableOnInsert(true);
        integerColumn4.setHeaderColumnName("Numero");
        integerColumn4.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        gridControl1.getColumnContainer().add(integerColumn4);

        integerColumn5.setColumnName("paginaInicial");
        integerColumn5.setColumnRequired(false);
        integerColumn5.setEditableOnEdit(true);
        integerColumn5.setEditableOnInsert(true);
        integerColumn5.setHeaderColumnName("Pagina Inicial");
        integerColumn5.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        gridControl1.getColumnContainer().add(integerColumn5);

        integerColumn6.setColumnName("paginaFinal");
        integerColumn6.setColumnRequired(false);
        integerColumn6.setEditableOnEdit(true);
        integerColumn6.setEditableOnInsert(true);
        integerColumn6.setHeaderColumnName("Pagina Final");
        integerColumn6.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        gridControl1.getColumnContainer().add(integerColumn6);

        textColumn7.setColumnName("registrado");
        textColumn7.setColumnRequired(false);
        textColumn7.setEditableOnEdit(true);
        textColumn7.setEditableOnInsert(true);
        textColumn7.setHeaderColumnName("Registrado");
        textColumn7.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        textColumn7.setMaxCharacters(100);
        gridControl1.getColumnContainer().add(textColumn7);

        textColumn8.setColumnName("numeroRegistro");
        textColumn8.setColumnRequired(false);
        textColumn8.setEditableOnEdit(true);
        textColumn8.setEditableOnInsert(true);
        textColumn8.setHeaderColumnName("Numero Registro");
        textColumn8.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        textColumn8.setMaxCharacters(50);
        gridControl1.getColumnContainer().add(textColumn8);

        dateColumn9.setColumnName("dataDespacho");
        dateColumn9.setColumnRequired(false);
        dateColumn9.setEditableOnEdit(true);
        dateColumn9.setEditableOnInsert(true);
        dateColumn9.setHeaderColumnName("Data Despacho");
        dateColumn9.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        gridControl1.getColumnContainer().add(dateColumn9);

        dateColumn10.setColumnName("dataAbertura");
        dateColumn10.setColumnRequired(false);
        dateColumn10.setEditableOnEdit(true);
        dateColumn10.setEditableOnInsert(true);
        dateColumn10.setHeaderColumnName("Data Abertura");
        dateColumn10.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        gridControl1.getColumnContainer().add(dateColumn10);

        dateColumn11.setColumnName("dataEncerramento");
        dateColumn11.setColumnRequired(false);
        dateColumn11.setEditableOnEdit(true);
        dateColumn11.setEditableOnInsert(true);
        dateColumn11.setHeaderColumnName("Data Encerramento");
        dateColumn11.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        gridControl1.getColumnContainer().add(dateColumn11);

        dateColumn12.setColumnName("escrituracaoInicio");
        dateColumn12.setColumnRequired(false);
        dateColumn12.setEditableOnEdit(true);
        dateColumn12.setEditableOnInsert(true);
        dateColumn12.setHeaderColumnName("Escrituracao Inicio");
        dateColumn12.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        gridControl1.getColumnContainer().add(dateColumn12);

        dateColumn13.setColumnName("escrituracaoFim");
        dateColumn13.setColumnRequired(false);
        dateColumn13.setEditableOnEdit(true);
        dateColumn13.setEditableOnInsert(true);
        dateColumn13.setHeaderColumnName("Escrituracao Fim");
        dateColumn13.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        gridControl1.getColumnContainer().add(dateColumn13);

        textColumn14.setColumnName("texto");
        textColumn14.setColumnRequired(false);
        textColumn14.setEditableOnEdit(true);
        textColumn14.setEditableOnInsert(true);
        textColumn14.setHeaderColumnName("Texto");
        textColumn14.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        textColumn14.setMaxCharacters(1000);
        gridControl1.getColumnContainer().add(textColumn14);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(gridControl1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        form1.add(jPanel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(form1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.openswing.swing.table.columns.client.ComboColumn comboColumn3;
    private org.openswing.swing.table.columns.client.DateColumn dateColumn10;
    private org.openswing.swing.table.columns.client.DateColumn dateColumn11;
    private org.openswing.swing.table.columns.client.DateColumn dateColumn12;
    private org.openswing.swing.table.columns.client.DateColumn dateColumn13;
    private org.openswing.swing.table.columns.client.DateColumn dateColumn9;
    private org.openswing.swing.client.DeleteButton deleteButton1;
    private org.openswing.swing.client.EditButton editButton1;
    private org.openswing.swing.client.EditButton editButton2;
    private org.openswing.swing.form.client.Form form1;
    private org.openswing.swing.client.GridControl gridControl1;
    private org.openswing.swing.client.InsertButton insertButton1;
    private org.openswing.swing.table.columns.client.IntegerColumn integerColumn4;
    private org.openswing.swing.table.columns.client.IntegerColumn integerColumn5;
    private org.openswing.swing.table.columns.client.IntegerColumn integerColumn6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private org.openswing.swing.client.LabelControl labelControl1;
    private org.openswing.swing.client.ReloadButton reloadButton1;
    private org.openswing.swing.client.ReloadButton reloadButton2;
    private org.openswing.swing.client.SaveButton saveButton1;
    private org.openswing.swing.client.SaveButton saveButton2;
    private org.openswing.swing.table.columns.client.TextColumn textColumn14;
    private org.openswing.swing.table.columns.client.TextColumn textColumn7;
    private org.openswing.swing.table.columns.client.TextColumn textColumn8;
    private org.openswing.swing.client.TextControl textControl3;
    // End of variables declaration//GEN-END:variables


}
