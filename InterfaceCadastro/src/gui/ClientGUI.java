/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import classes.PremiumUser;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Watto
 */
public class ClientGUI extends javax.swing.JFrame {
    
    ArrayList<PremiumUser> ListaUsers;
    
    private RegisterGUI regui;
    private ConfirmDelete delgui;
    
        
    
    public void loadTable(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Nome", "Usuário", "Senha", "Plano", "Número do Cartão", "Data do Cartão", "CVV"}, 0);
        DefaultTableModel filtered = new DefaultTableModel(new Object[]{"Nome", "Usuário", "Senha", "Plano", "Número do Cartão", "Data do Cartão", "CVV"}, 0);
    
        for(int i=0; i<ListaUsers.size();i++){
            if(  ListaUsers.get(i).getName().contains(a_searchbar.getText())  ){
                filtered.addRow(new Object[]{ListaUsers.get(i).getName(), ListaUsers.get(i).getUsername(), ListaUsers.get(i).getPassword(), ListaUsers.get(i).getPlano(), ListaUsers.get(i).getCardNumber(), ListaUsers.get(i).getCardDate(), ListaUsers.get(i).getCardCVV() });
            }
        }
        
        a_table.setModel(filtered);
        clearInfo(); 
    }
    
    public void clearInfo(){
        a_i_field_name.setText("");
        a_i_field_user.setText("");
        a_i_field_password.setText("");
        a_i_field_plano.setText("");
        a_i_field_cardnumber.setText("");
        a_i_field_date.setText("");
        a_i_field_cvv.setText("");
        a_button_excluir.setEnabled(false);
    }
    
    public void focusTableIndex(){
        int index = a_table.getSelectedRow();
        int newindex = 0;
        
        //get the filtered index
            String filteredname = a_table.getModel().getValueAt(index, 0).toString();
            
            for(int i=0; i<ListaUsers.size();i++){
                if(  ListaUsers.get(i).getName().equals(filteredname) ){
                    newindex = i;
                }
            }
        //build
        if(index>=0 && index<ListaUsers.size() ){
            PremiumUser U = ListaUsers.get(newindex);
            a_i_field_name.setText(U.getName() );
            a_i_field_user.setText(U.getUsername() );
            a_i_field_password.setText(U.getPassword() );
            a_i_field_plano.setText(U.getPlano() );
            a_i_field_cardnumber.setText(U.getCardNumber() );
            a_i_field_date.setText(U.getCardDate() );
            a_i_field_cvv.setText(U.getCardCVV() );
            a_button_excluir.setEnabled(true);
        }
    }

    /** Creates new form ClientGUI */
    public ClientGUI() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
        ListaUsers = new ArrayList();
        
        a_table.setDefaultEditor(Object.class, null);
        a_i_field_cardnumber.setEditable(false);
        a_i_field_cvv.setEditable(false);
        a_i_field_date.setEditable(false);
        a_i_field_name.setEditable(false);
        a_i_field_password.setEditable(false);
        a_i_field_plano.setEditable(false);
        a_i_field_user.setEditable(false);
        
        loadTable();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        a_info = new javax.swing.JPanel();
        a_i_label_nome = new javax.swing.JLabel();
        a_i_label_user = new javax.swing.JLabel();
        a_i_label_password = new javax.swing.JLabel();
        a_i_label_plano = new javax.swing.JLabel();
        a_i_label_cardnumber = new javax.swing.JLabel();
        a_i_label_date = new javax.swing.JLabel();
        a_i_label_cvv = new javax.swing.JLabel();
        a_i_field_user = new javax.swing.JTextField();
        a_i_field_password = new javax.swing.JTextField();
        a_i_field_cardnumber = new javax.swing.JTextField();
        a_i_field_date = new javax.swing.JTextField();
        a_i_field_cvv = new javax.swing.JTextField();
        a_i_field_name = new javax.swing.JTextField();
        a_i_field_plano = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        a_table = new javax.swing.JTable();
        a_button_cadastrar = new javax.swing.JButton();
        a_button_excluir = new javax.swing.JButton();
        a_button_buscar = new javax.swing.JButton();
        a_searchbar = new javax.swing.JTextField();
        a_ico_search = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Interface Super Maneira de um Sistema de Cadastro");

        a_info.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Info"));

        a_i_label_nome.setText("Nome:");

        a_i_label_user.setText("Usuário:");

        a_i_label_password.setText("Senha:");

        a_i_label_plano.setText("Plano:");

        a_i_label_cardnumber.setText("Número do Cartão:");

        a_i_label_date.setText("Data do Cartão:");

        a_i_label_cvv.setText("CVV:");

        org.jdesktop.layout.GroupLayout a_infoLayout = new org.jdesktop.layout.GroupLayout(a_info);
        a_info.setLayout(a_infoLayout);
        a_infoLayout.setHorizontalGroup(
            a_infoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(a_infoLayout.createSequentialGroup()
                .addContainerGap()
                .add(a_infoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(a_infoLayout.createSequentialGroup()
                        .add(a_infoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(a_i_label_cardnumber)
                            .add(a_i_label_date)
                            .add(a_i_label_cvv))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(a_infoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(a_i_field_cardnumber, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                            .add(a_i_field_date)
                            .add(a_i_field_cvv)))
                    .add(a_infoLayout.createSequentialGroup()
                        .add(a_infoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(a_i_label_user)
                            .add(a_i_label_password)
                            .add(a_i_label_plano)
                            .add(a_i_label_nome))
                        .add(50, 50, 50)
                        .add(a_infoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(a_i_field_password, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                            .add(a_i_field_user)
                            .add(a_i_field_name)
                            .add(a_i_field_plano))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        a_infoLayout.setVerticalGroup(
            a_infoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(a_infoLayout.createSequentialGroup()
                .addContainerGap()
                .add(a_infoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(a_i_label_nome)
                    .add(a_i_field_name, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(a_infoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(a_i_label_user)
                    .add(a_i_field_user, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(a_infoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(a_i_label_password)
                    .add(a_i_field_password, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(a_infoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(a_i_label_plano)
                    .add(a_i_field_plano, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(a_infoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(a_i_label_cardnumber)
                    .add(a_i_field_cardnumber, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(a_infoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(a_i_label_date)
                    .add(a_i_field_date, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(a_infoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(a_i_label_cvv)
                    .add(a_i_field_cvv, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        a_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Usuário", "Senha", "Plano", "Número do Cartão", "Data do Cartão", "CVV"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        a_table.getTableHeader().setReorderingAllowed(false);
        a_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a_tableMouseClicked(evt);
            }
        });
        a_table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                a_tableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(a_table);

        a_button_cadastrar.setText("Cadastrar");
        a_button_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_button_cadastrarActionPerformed(evt);
            }
        });

        a_button_excluir.setText("Excluir");
        a_button_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_button_excluirActionPerformed(evt);
            }
        });

        a_button_buscar.setText("Buscar");
        a_button_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_button_buscarActionPerformed(evt);
            }
        });

        a_ico_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/pesquisar.png"))); // NOI18N

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(a_info, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .add(layout.createSequentialGroup()
                        .add(10, 10, 10)
                        .add(a_button_cadastrar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 81, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(a_button_excluir, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 81, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(a_ico_search, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(a_searchbar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 183, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(a_button_buscar)
                        .add(34, 34, 34))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(29, 29, 29)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 155, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, a_ico_search, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(a_button_cadastrar)
                        .add(a_button_excluir)
                        .add(a_searchbar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(a_button_buscar)))
                .add(18, 18, 18)
                .add(a_info, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void a_button_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_button_cadastrarActionPerformed
        
        this.regui = new RegisterGUI(this, true);
        this.regui.setVisible(true);
        
        if(this.regui.getCampoPlano() == "Free"){
            PremiumUser P = new PremiumUser(this.regui.getCampoNome(), this.regui.getCampoUser(), this.regui.getCampoSenha(), this.regui.getCampoPlano(), "", "", "" );
            ListaUsers.add(P);
        } else if(this.regui.getCampoPlano() == "Premium") {
            PremiumUser P = new PremiumUser(this.regui.getCampoNome(), this.regui.getCampoUser(), this.regui.getCampoSenha(), this.regui.getCampoPlano(), this.regui.getCampoCardNumber(), this.regui.getCampoDate(), this.regui.getCampoCVV() );
            ListaUsers.add(P);
        } else{
            //does not add empty rows if canceled
        }
        loadTable();
        
    }//GEN-LAST:event_a_button_cadastrarActionPerformed

    private void a_button_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_button_excluirActionPerformed
        
        this.delgui = new ConfirmDelete(this, true);
        this.delgui.setVisible(true);
        //changed
        if(this.delgui.isCheck() ){
            
            int index = a_table.getSelectedRow();
            
            //get the filtered index
            String namevalue = a_table.getModel().getValueAt(index, 0).toString();
            
            for(int i=0; i<ListaUsers.size();i++){
                if(  ListaUsers.get(i).getName().equals(namevalue) ){
                    if(index >= 0 && index < ListaUsers.size() ){
                        ListaUsers.remove(i);
                    }
                }
            }
            
            
        }
        
        loadTable();
    }//GEN-LAST:event_a_button_excluirActionPerformed

    private void a_button_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_button_buscarActionPerformed
        
        loadTable();
        
    }//GEN-LAST:event_a_button_buscarActionPerformed

    private void a_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a_tableMouseClicked
        
        focusTableIndex();
        
    }//GEN-LAST:event_a_tableMouseClicked

    private void a_tableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_a_tableKeyReleased
        try{
            focusTableIndex();
        }catch(Exception e){
            /* Esse catch lida com as teclas apertadas quando não hé item selecionado na tabela. */
        }
        
    }//GEN-LAST:event_a_tableKeyReleased

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton a_button_buscar;
    private javax.swing.JButton a_button_cadastrar;
    private javax.swing.JButton a_button_excluir;
    private javax.swing.JTextField a_i_field_cardnumber;
    private javax.swing.JTextField a_i_field_cvv;
    private javax.swing.JTextField a_i_field_date;
    private javax.swing.JTextField a_i_field_name;
    private javax.swing.JTextField a_i_field_password;
    private javax.swing.JTextField a_i_field_plano;
    private javax.swing.JTextField a_i_field_user;
    private javax.swing.JLabel a_i_label_cardnumber;
    private javax.swing.JLabel a_i_label_cvv;
    private javax.swing.JLabel a_i_label_date;
    private javax.swing.JLabel a_i_label_nome;
    private javax.swing.JLabel a_i_label_password;
    private javax.swing.JLabel a_i_label_plano;
    private javax.swing.JLabel a_i_label_user;
    private javax.swing.JLabel a_ico_search;
    private javax.swing.JPanel a_info;
    private javax.swing.JTextField a_searchbar;
    private javax.swing.JTable a_table;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
