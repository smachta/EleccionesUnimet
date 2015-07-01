/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleccionesunimet;


public class InterfazElecciones extends javax.swing.JFrame {
   
    public ArchivoObjetos manejador;
    public Estudiantes[] vecEstudiantes = new Estudiantes[6000];
    public int[][] indexCedula = new int[6000][2];
    public int[][] indexNombre = new int[6000][2];
    public int[][] indexApellido = new int[6000][2];
    
   
    public void inicializar(){
        inicializarEst();
        inicializarIndex(indexCedula);
        inicializarIndex(indexNombre);
        inicializarIndex(indexApellido);
    }
    public void inicializarEst(){
        Estudiantes nuevo = new Estudiantes();
        if (vecEstudiantes[0]==null)
            for(int i=0; i<vecEstudiantes.length; i++)
                vecEstudiantes[i] = nuevo;
        else{
            try{
                vecEstudiantes = (Estudiantes[])manejador.ObtenerArchivo();
            }catch(Exception ex){
                System.out.println("Error Leyendo"+ex.getMessage());
                vecEstudiantes = new Estudiantes[6000];
            }
        }
    }
    public void inicializarIndex(int[][] mat){
        for (int i=0; i<6000; i++){
            for (int j=0; j<2; j++)
                mat[i][j]=-1;
        }
    }
    
    public InterfazElecciones() {
        initComponents();
        inicializar();
        manejador = new ArchivoObjetos();
    }
    
    public void insertarEstudiante(Estudiantes est){
        
        int posicionEst = 0;
        
        while(vecEstudiantes[posicionEst].getCedula()!= "-1"){
            posicionEst++;
        }
        
        vecEstudiantes[posicionEst] = est;
        vecEstudiantes[posicionEst].imprimir();
        
        try{
            manejador.CrearArchivo(vecEstudiantes);
        }catch (Exception ex) {
            System.out.println("Error creando: "+ex.getMessage());
            vecEstudiantes = new Estudiantes[6000];
        }
        
    }
    
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        tabBuscar = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        pNombreTexto1 = new javax.swing.JTextField();
        pNombreLabel1 = new javax.swing.JLabel();
        sNombreLabel = new javax.swing.JLabel();
        sNombreTexto = new javax.swing.JTextField();
        pApellidoLabel = new javax.swing.JLabel();
        sApellidoLabel = new javax.swing.JLabel();
        pApellidoTexto = new javax.swing.JTextField();
        sApellidoTexto = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CedulaText = new javax.swing.JTextField();
        Enviar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox();
        BuscarCedula = new javax.swing.JTextField();
        BuscarNombre = new javax.swing.JTextField();
        BuscarApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pNombreTexto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pNombreTexto1ActionPerformed(evt);
            }
        });

        pNombreLabel1.setText("Primer Nombre");

        sNombreLabel.setText("Segundo Nombre");

        pApellidoLabel.setText("Primer Apellido");

        sApellidoLabel.setText("Segundo Apellido");

        pApellidoTexto.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N

        jComboBox1.setForeground(new java.awt.Color(51, 255, 102));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ingenieria de Sistemas", "Ingenieria de Produccion", "Ingenieria Electrica", "Ingenieria Mecánica", "Ingenieria Quimica", "Psicología", "Economía", "Administración", "Idiomas", "Estudios Liberales", "Derecho", "" }));

        jLabel1.setText("Carrera ");

        jLabel2.setText("Cedula");

        CedulaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CedulaTextActionPerformed(evt);
            }
        });

        Enviar.setText("Enviar");
        Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pNombreLabel1)
                    .addComponent(pNombreTexto1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(pApellidoLabel)
                    .addComponent(pApellidoTexto)
                    .addComponent(jLabel2)
                    .addComponent(CedulaText))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(sApellidoLabel)
                                .addComponent(sNombreLabel)
                                .addComponent(sNombreTexto)
                                .addComponent(sApellidoTexto))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 42, Short.MAX_VALUE)
                                .addComponent(Enviar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pNombreLabel1)
                    .addComponent(sNombreLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pNombreTexto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sNombreTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sApellidoLabel)
                        .addComponent(Enviar))
                    .addComponent(pApellidoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pApellidoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sApellidoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CedulaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        tabBuscar.addTab("Agregar", jPanel1);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Primer Nombre y Apellido", "Primer Nombre", "Primer Apellido", "Cedula" }));

        jLabel3.setText("Cedula");

        jLabel4.setText("Nombre");

        jLabel5.setText("Apellido");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BuscarCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(BuscarNombre)
                    .addComponent(BuscarApellido))
                .addGap(161, 161, 161))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(BuscarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuscarApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        tabBuscar.addTab("Buscar", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabBuscar)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabBuscar)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CedulaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CedulaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CedulaTextActionPerformed

    private void pNombreTexto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pNombreTexto1ActionPerformed
    
       
        
        
    }//GEN-LAST:event_pNombreTexto1ActionPerformed

    private void EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarActionPerformed
        
        String cedula=CedulaText.getText(); 
        String PrimerNombre=pNombreTexto1.getText(); 
        String PrimerApellido=pApellidoTexto.getText(); 
        String SegundoNombre=sNombreTexto.getText(); 
        String SegundoApellido=sApellidoTexto.getText(); 
        String carrera1=jComboBox1.getSelectedItem().toString(); 
        
        Estudiantes est= new Estudiantes(cedula,carrera1,PrimerNombre,SegundoNombre,PrimerApellido,SegundoApellido); 
        insertarEstudiante(est);
    }//GEN-LAST:event_EnviarActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazElecciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazElecciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazElecciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazElecciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazElecciones().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BuscarApellido;
    private javax.swing.JTextField BuscarCedula;
    private javax.swing.JTextField BuscarNombre;
    private javax.swing.JTextField CedulaText;
    private javax.swing.JButton Enviar;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel pApellidoLabel;
    private javax.swing.JTextField pApellidoTexto;
    private javax.swing.JLabel pNombreLabel1;
    private javax.swing.JTextField pNombreTexto1;
    private javax.swing.JLabel sApellidoLabel;
    private javax.swing.JTextField sApellidoTexto;
    private javax.swing.JLabel sNombreLabel;
    private javax.swing.JTextField sNombreTexto;
    private javax.swing.JTabbedPane tabBuscar;
    // End of variables declaration//GEN-END:variables
}
