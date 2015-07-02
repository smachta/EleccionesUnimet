/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleccionesunimet;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class InterfazElecciones extends javax.swing.JFrame {
   
    public ArchivoObjetos manejador= new ArchivoObjetos();
    public Estudiantes[] vecEstudiantes = new Estudiantes[6000];
    public Vectores ve; 
    public int[]indexCedula = new int[6000];
    public int[]indexNombre = new int[6000];
    public int[]indexApellido = new int[6000];
    int cont=0;
    String Datos[][]={};
    String Cabecera[]={"P Nombre"," S Nombre ", "Cedula "," P Apellido","S Apellido","Carrera1","Carrera2"};
    DefaultTableModel modelo= new DefaultTableModel(Datos, Cabecera);
    public Estudiantes eliminado = new Estudiantes();
   
    
    public void inicializar(){
  
        inicializarEst();
        inicializarIndex(indexCedula);
        inicializarIndex(indexNombre);
        inicializarIndex(indexApellido);      
    }
    public void inicializarEst(){
        Estudiantes nuevo = new Estudiantes();
        if (vecEstudiantes[0]==null){
            for(int i=0; i<vecEstudiantes.length; i++)
                vecEstudiantes[i] = nuevo;
        cont++;
        }
        else{
            try{
                ve= new Vectores(); 
                Vectores ve=(Vectores)manejador.leer();
                vecEstudiantes=ve.getVecEstudiantes(); 
                cont++; 
                ve.setCont(cont);
                
            }catch(Exception ex){
                System.out.println("Error Leyendo"+ex.getMessage());
                vecEstudiantes = new Estudiantes[6000];
            }
        }
        
        System.out.println(cont);
    }
    public void inicializarIndex(int[] mat){
        for (int i=0; i<6000; i++)
                mat[i]=-1;
    }
    
    public InterfazElecciones() {
        try {
            initComponents();
            ve=(Vectores)manejador.leer();
            if(ve.getCont()==0){
                inicializar();
            }
            else{
             
            vecEstudiantes=ve.getVecEstudiantes();
            indexCedula=ve.getIndexCedula();
            indexNombre=ve.getIndexNombre();
            indexApellido=ve.getIndexApellido();
            cont++; 
          
                }
        } catch (Exception ex) {
            Logger.getLogger(InterfazElecciones.class.getName()).log(Level.SEVERE, null, ex);
        }
       TablaRe.setModel(modelo);
       pNombreTexto1.setDocument(new JTextFieldLimit(40));
       sNombreTexto.setDocument(new JTextFieldLimit(40));
       pApellidoTexto.setDocument(new JTextFieldLimit(40));
       sApellidoTexto.setDocument(new JTextFieldLimit(40));
       CedulaText.setDocument(new JTextFieldLimit(8));
       BuscarNombre.setDocument(new JTextFieldLimit(40));
       BuscarApellido.setDocument(new JTextFieldLimit(40));
       BuscarCedula.setDocument(new JTextFieldLimit(8));
    }
    
    public void insertarEstudiante(Estudiantes est){
        
        int posicionEst = 0;
        
        while(!vecEstudiantes[posicionEst].getCedula().equals("-1")){
            posicionEst++;
        }
        
        vecEstudiantes[posicionEst] = est;
        System.out.println("==="+posicionEst);
        indexCedula[hashCedula(est.getCedula())]= posicionEst;
        indexNombre[hashNombre(est.getpNombre())]= posicionEst;
        indexApellido[hashApellido(est.getpApellido())]= posicionEst;
        
       
    }
    
    //========================================================
    
    public int hashCedula (String cedula){
        
        int hash=Integer.parseInt(cedula); 
        hash=hash%6000; 
        while(indexCedula[hash]!=-1){
            hash=hash+1; 
        } 
        System.out.println("valos del hash"+hash);
        return hash;
    }
    public int sfold(String s) {
        int M= 6000;
        int intLength = s.length() / 4;
        int sum = 0;
        
        for (int j = 0; j < intLength; j++) {
            char c[] = s.substring(j * 4, (j * 4) + 4).toCharArray();
            int mult = 1;
            for (int k = 0; k < c.length; k++) {
                sum += c[k] * mult;
                mult *= 256;
            }
        }

        char c[] = s.substring(intLength * 4).toCharArray();
        int mult = 1;
        for (int k = 0; k < c.length; k++) {
            sum += c[k] * mult;
            mult *= 256;
        }

     return(Math.abs(sum) % M);
    }
    public int hashNombre (String nom){
        int hash = sfold(nom);
        while(indexNombre[hash]!= -1)
            hash++;
        
        return hash;
    }
    public int hashApellido (String ape){
        int hash = sfold(ape);
        while(indexApellido[hash]!= -1)
            hash++;
        
        return hash;
    }
    
    //========================================================
    
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        ComboBoxBuscar = new javax.swing.JComboBox();
        BuscarCedula = new javax.swing.JTextField();
        BuscarNombre = new javax.swing.JTextField();
        BuscarApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BotonBuscar = new javax.swing.JButton();
        PanelResultado = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaRe = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabBuscarMouseClicked(evt);
            }
        });

        pNombreTexto1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        pNombreTexto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pNombreTexto1ActionPerformed(evt);
            }
        });

        pNombreLabel1.setText("Primer Nombre");

        sNombreLabel.setText("Segundo Nombre");

        sNombreTexto.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        sNombreTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sNombreTextoActionPerformed(evt);
            }
        });

        pApellidoLabel.setText("Primer Apellido");

        sApellidoLabel.setText("Segundo Apellido");

        pApellidoTexto.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N

        sApellidoTexto.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione...", "Ingenieria de Sistemas", "Ingenieria de Produccion", "Ingenieria Electrica", "Ingenieria Mecánica", "Ingenieria Quimica", "Psicología", "Economía", "Administración", "Idiomas", "Estudios Liberales", "Derecho", " " }));

        jLabel1.setText("Carrera 1");

        jLabel2.setText("Cedula");

        CedulaText.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        CedulaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CedulaTextActionPerformed(evt);
            }
        });

        Enviar.setText("Enviar");
        Enviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EnviarMouseClicked(evt);
            }
        });
        Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarActionPerformed(evt);
            }
        });

        jLabel6.setText("Nombres y Apellidos max 40 char");

        jLabel7.setText("Cedula max 8 digitos");

        jLabel8.setText("Carrera 2");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "N/A", "Ingenieria de Sistemas", "Ingenieria de Produccion", "Ingenieria Electrica", "Ingenieria Mecánica", "Ingenieria Quimica", "Psicología", "Economía", "Administración", "Idiomas", "Estudios Liberales", "Derecho", " " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pNombreLabel1)
                    .addComponent(pNombreTexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pApellidoLabel)
                    .addComponent(pApellidoTexto)
                    .addComponent(jLabel2)
                    .addComponent(CedulaText))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sApellidoLabel)
                            .addComponent(sNombreLabel)
                            .addComponent(sApellidoTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(sNombreTexto))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                                .addComponent(Enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel1))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addGap(12, 12, 12)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        tabBuscar.addTab("Agregar", jPanel1);

        ComboBoxBuscar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione...", "Primer Nombre y Apellido", "Primer Nombre", "Primer Apellido", "Cedula" }));
        ComboBoxBuscar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxBuscarItemStateChanged(evt);
            }
        });
        ComboBoxBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxBuscarActionPerformed(evt);
            }
        });

        BuscarCedula.setEnabled(false);
        BuscarCedula.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        BuscarCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarCedulaActionPerformed(evt);
            }
        });

        BuscarNombre.setEnabled(false);
        BuscarNombre.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N

        BuscarApellido.setEnabled(false);
        BuscarApellido.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N

        jLabel3.setText("Cedula");

        jLabel4.setText("Nombre");

        jLabel5.setText("Apellido");

        BotonBuscar.setText("Buscar");
        BotonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonBuscarMouseClicked(evt);
            }
        });
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 241, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BuscarCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(BuscarNombre)
                    .addComponent(BuscarApellido))
                .addGap(35, 35, 35)
                .addComponent(BotonBuscar)
                .addGap(17, 17, 17))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(ComboBoxBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(ComboBoxBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BuscarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BotonBuscar)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuscarApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        tabBuscar.addTab("Buscar", jPanel2);

        TablaRe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "P.Nombre", "S.Nombre", "P.Apellido", "S.Apellido", "Cedula", "Carrera1", "Carrera2"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaRe);
        if (TablaRe.getColumnModel().getColumnCount() > 0) {
            TablaRe.getColumnModel().getColumn(0).setHeaderValue("P.Nombre");
            TablaRe.getColumnModel().getColumn(1).setHeaderValue("S.Nombre");
            TablaRe.getColumnModel().getColumn(2).setHeaderValue("P.Apellido");
            TablaRe.getColumnModel().getColumn(3).setHeaderValue("S.Apellido");
            TablaRe.getColumnModel().getColumn(4).setHeaderValue("Cedula");
            TablaRe.getColumnModel().getColumn(5).setHeaderValue("Carrera1");
            TablaRe.getColumnModel().getColumn(6).setHeaderValue("Carrera2");
        }

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salir Sin Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        BotonEliminar.setText("Eliminar");
        BotonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonEliminarMouseClicked(evt);
            }
        });
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelResultadoLayout = new javax.swing.GroupLayout(PanelResultado);
        PanelResultado.setLayout(PanelResultadoLayout);
        PanelResultadoLayout.setHorizontalGroup(
            PanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelResultadoLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonEliminar)
                .addGap(49, 49, 49))
            .addGroup(PanelResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelResultadoLayout.setVerticalGroup(
            PanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2))
                    .addComponent(BotonEliminar))
                .addGap(0, 59, Short.MAX_VALUE))
        );

        tabBuscar.addTab("Resultado", PanelResultado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabBuscar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabBuscar)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(ve!=null){
            ve.setCont(0);
            try {
                manejador.Escribir(ve);
            } catch (Exception ex) {
                Logger.getLogger(InterfazElecciones.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.exit(1);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ve.setIndexApellido(indexApellido);
        ve.setIndexCedula(indexCedula);
        ve.setIndexNombre(indexNombre);
        ve.setVecEstudiantes(vecEstudiantes);
        ve.setCont(cont);
        try {
            manejador.Escribir(ve);
            System.exit(1);
        } catch (Exception ex) {
            Logger.getLogger(InterfazElecciones.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed

        Estudiantes aux= new Estudiantes();
        if(BuscarNombre.isEnabled() && !BuscarApellido.isEnabled()){

            System.out.println("\n-->Buscando Nombre");
            String nom = BuscarNombre.getText().toUpperCase();
            System.out.println(nom);
            int posIndex= sfold(nom);
            aux=vecEstudiantes[indexNombre[posIndex]];
            aux.imprimir();
            System.out.println("------");

        }else if(!BuscarNombre.isEnabled() && BuscarApellido.isEnabled()){

            System.out.println("\n-->Buscando Apellido");
            String ape = BuscarApellido.getText().toUpperCase();
            System.out.println(ape);
            int posIndex= sfold(ape);
            aux=vecEstudiantes[indexApellido[posIndex]];
            System.out.println("");
            aux.imprimir();
            System.out.println("------");

        }else if(BuscarNombre.isEnabled() && BuscarApellido.isEnabled()){

            System.out.println("\n-->Buscando Nombre y Apellido");
            String nom = BuscarNombre.getText().toUpperCase();
            System.out.println(nom);
            int posIndex= sfold(nom);
            while(!vecEstudiantes[indexNombre[posIndex]].getpApellido().equals(BuscarApellido.getText()))
            posIndex++;

            aux=vecEstudiantes[indexNombre[posIndex]];
            aux.imprimir();
            System.out.println("------");

        }else{
            System.out.println("\n-->BuscarCedula");
            System.out.println(BuscarCedula.getText().toString());
            int ci= Integer.parseInt(BuscarCedula.getText().toString());
            ci=ci%6000;
            aux=vecEstudiantes[indexCedula[ci]];
            aux.imprimir();
            System.out.println("------");
        }
        String pnom= aux.getpNombre();
        String snom= aux.getsNombre();
        String ci= aux.getCedula();
        String pAp=aux.getpApellido();
        String sAp=aux.getsApellido();
        String car1= aux.getCarrera1();
        String car2= aux.getCarrera2();
        Object dato[]={pnom,snom,ci,pAp,sAp,car1,car2};
        modelo.addRow(dato);
        eliminado=aux;
        
        
    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void BuscarCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarCedulaActionPerformed

    }//GEN-LAST:event_BuscarCedulaActionPerformed

    private void ComboBoxBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxBuscarActionPerformed

    private void ComboBoxBuscarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboBoxBuscarItemStateChanged
        if(ComboBoxBuscar.getSelectedItem().toString()=="Cedula"){
            BuscarCedula.setEnabled(true);
            BuscarNombre.setEnabled(false);
            BuscarApellido.setEnabled(false);
        }
        else if(ComboBoxBuscar.getSelectedItem().toString()=="Primer Nombre"){
            BuscarCedula.setEnabled(false);
            BuscarNombre.setEnabled(true);
            BuscarApellido.setEnabled(false);
        }
        else if(ComboBoxBuscar.getSelectedItem().toString()=="Primer Apellido"){
            BuscarCedula.setEnabled(false);
            BuscarNombre.setEnabled(false);
            BuscarApellido.setEnabled(true);
        }
        else{
            BuscarCedula.setEnabled(false);
            BuscarNombre.setEnabled(true);
            BuscarApellido.setEnabled(true);

        }
    }//GEN-LAST:event_ComboBoxBuscarItemStateChanged

    private void EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarActionPerformed

        String cedula=CedulaText.getText();
        String PrimerNombre=pNombreTexto1.getText().toUpperCase();
        String PrimerApellido=pApellidoTexto.getText().toUpperCase();
        String SegundoNombre=sNombreTexto.getText().toUpperCase();
        String SegundoApellido=sApellidoTexto.getText().toUpperCase();
        String carrera1=jComboBox1.getSelectedItem().toString();

        Estudiantes est= new Estudiantes(cedula,carrera1,PrimerNombre,SegundoNombre,PrimerApellido,SegundoApellido);
        insertarEstudiante(est);

    }//GEN-LAST:event_EnviarActionPerformed

    private void CedulaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CedulaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CedulaTextActionPerformed

    private void sNombreTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sNombreTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sNombreTextoActionPerformed

    private void pNombreTexto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pNombreTexto1ActionPerformed

    }//GEN-LAST:event_pNombreTexto1ActionPerformed

    private void BotonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBuscarMouseClicked
    tabBuscar.setSelectedIndex(2);
    BuscarCedula.setText("");
    BuscarNombre.setText("");
    BuscarApellido.setText("");
    }//GEN-LAST:event_BotonBuscarMouseClicked

    private void EnviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnviarMouseClicked
    pNombreTexto1.setText("");
    sNombreTexto.setText("");
    pApellidoTexto.setText("");
    sApellidoTexto.setText("");
    CedulaText.setText("");
    }//GEN-LAST:event_EnviarMouseClicked

    private void tabBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabBuscarMouseClicked
    modelo.setNumRows(0);
    }//GEN-LAST:event_tabBuscarMouseClicked

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void BotonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEliminarMouseClicked
        
        String nom = modelo.getValueAt(0, 0).toString();
        String ape = modelo.getValueAt(0, 3).toString();
        String ci = modelo.getValueAt(0, 2).toString();
        int hash;
        hash= sfold(nom);
        System.out.println("index N viejo--> "+indexNombre[hash]);
        indexNombre[hash]=-1;
        System.out.println("index NOMBRE--> "+indexNombre[hash]+" hash:"+hash);
        hash= sfold(ape);
        System.out.println("indes A viejo--> "+indexApellido[hash]);
        indexApellido[hash]=-1;
        System.out.println("index APELLIDO--> "+indexApellido[hash]+" hash:"+hash);
        hash=Integer.parseInt(ci);
        hash= hash%6000;
        System.out.println("index C viejo--> "+indexCedula[hash]);
        indexCedula[hash]=-1;
        System.out.println("index CEDULA-->"+indexCedula[hash]+" hash:"+hash);
        
        modelo.removeRow(0);
    }//GEN-LAST:event_BotonEliminarMouseClicked
    
    
    
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
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JTextField BuscarApellido;
    private javax.swing.JTextField BuscarCedula;
    private javax.swing.JTextField BuscarNombre;
    private javax.swing.JTextField CedulaText;
    private javax.swing.JComboBox ComboBoxBuscar;
    private javax.swing.JButton Enviar;
    private javax.swing.JPanel PanelResultado;
    private javax.swing.JTable TablaRe;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
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
