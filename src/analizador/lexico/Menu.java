package analizador.lexico;
import static analizador.lexico.Globales.LL;
import static analizador.lexico.Globales.LU;
import static analizador.lexico.Globales.LS;
import static analizador.lexico.Globales.LNU;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
                                                                                  


public class Menu extends javax.swing.JFrame {
int codigo=0;
int codigova=99;
int codigode=999;
int codigonu=1999;   
int verificar=0;
int filas=0;
int vectorllavesabrir[] = new int [99999];
int vectorin[] = new int [99999];
int vectorllavescerrar[] = new int [99999];
int vectorletra[]=new int[99999];
int vectorigual[]=new int[99999];
int vectorpuntocoma[]=new int[99999];
int vectornum[]=new int[99999];
int validar=0;
int ingresadosnum=0,ingresadospuntocoma=0,ingresadosigual=0,ingresadosletras=0,ingresadosint=0,ingresadosllavesabrir=0,ingresadosllavescerrar=0;
int vaif=0,vaelse=0,vaabreparentesis=0,vacierraparentesis=0,vavariablepalabra=0,vadelimitador=0,varianum1=0,vastring=0;
int vawhile=0,vafor=0,vai=0,vasu=0;
int xMouse, yMouse;
private ImageIcon imagen; //luego hacerlo public
private Icon icono;
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer();
        modelocentrar.setHorizontalAlignment(SwingConstants.LEFT);
        tabla.getColumnModel().getColumn(0).setCellRenderer(modelocentrar); 
        tabla.getColumnModel().getColumn(1).setCellRenderer(modelocentrar); 
        Globales.LeerVariables();
        Globales.Leerreservada();
        Globales.LeerDelimitadores();
        Globales.Leernu();
        codigova=(int)LU.devuelID();
        codigo=(int)LS.devuelID();
        codigode=(int)LL.devuelID();
        codigonu=(int)LNU.devuelID();
        this.setLocationRelativeTo(null);
        //Redondeado de las esquinas
        setShape(new RoundRectangle2D.Double(0,0,getWidth(),getHeight(),25,25));
        P1.setBackground(new Color(0,0,0,0));
        P2.setBackground(new Color(0,0,0,0));
        P3.setBackground(new Color(0,0,0,0));
        b1.setBackground(new Color(0,0,0,0));
        b2.setBackground(new Color(0,0,0,0));
        b3.setBackground(new Color(0,0,0,0));
        head2.setBackground(new Color(0,0,0,0));
        salir.setBackground(new Color(0,0,0,0));
        miminizar.setBackground(new Color(0,0,0,0));
        maximizar.setBackground(new Color(0,0,0,0));
        this.setBackground(new Color(255,255,255,220));
        //asignar imagenes
        this.pintarImagen(im1, "src/analizador/lexico/i1.png");
        this.pintarImagen(im2, "src/analizador/lexico/i2.png");
        this.pintarImagen(im3, "src/analizador/lexico/i3.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnsintactico = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnlexico = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        head2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        salir = new RoundedPanel(300,new Color(255,93,86));
        miminizar = new RoundedPanel(300,Color.yellow);
        maximizar = new RoundedPanel(300,new Color(28,191,48));
        bg = new javax.swing.JPanel();
        P3 = new RoundedPanel(20, new Color(30,113,231));
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areasintactico = new javax.swing.JTextArea();
        P1 = new RoundedPanel(20, new Color(30,113,231));
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        areacadena = new javax.swing.JTextArea();
        P2 = new RoundedPanel(20, new Color(30,113,231));
        jScrollPane5 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        b1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        im1 = new javax.swing.JLabel();
        b2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        im2 = new javax.swing.JLabel();
        b3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        im3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        btnsintactico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/analizador/lexico/analyze.png"))); // NOI18N
        btnsintactico.setText("Analizador Sintactico");
        btnsintactico.setEnabled(false);
        btnsintactico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsintacticoActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/analizador/lexico/label_new red.png"))); // NOI18N
        jButton2.setText("Nuevo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnlexico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/analizador/lexico/analyze.png"))); // NOI18N
        btnlexico.setText("Analizador Lexico");
        btnlexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlexicoActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Analizador Lexicografico");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(51, 255, 255));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, -1, -1));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, -1));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(225, 225, 225));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-210, 60, 1490, 10));

        head2.setBackground(new java.awt.Color(102, 153, 0));
        head2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                head2MouseDragged(evt);
            }
        });
        head2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                head2MousePressed(evt);
            }
        });
        head2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(253, 253, 253));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        title.setForeground(new java.awt.Color(102, 102, 102));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Analizador Léxico y Sintáctico");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 1050, 60));

        salir.setBackground(new java.awt.Color(255, 0, 51));
        salir.setForeground(new java.awt.Color(51, 255, 0));
        salir.setToolTipText("cerrar");
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        salir.setPreferredSize(new java.awt.Dimension(20, 20));
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout salirLayout = new javax.swing.GroupLayout(salir);
        salir.setLayout(salirLayout);
        salirLayout.setHorizontalGroup(
            salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        salirLayout.setVerticalGroup(
            salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        jPanel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 25, 15, 15));

        miminizar.setBackground(new java.awt.Color(255, 51, 51));
        miminizar.setForeground(new java.awt.Color(255, 255, 0));
        miminizar.setToolTipText("miminizar");
        miminizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        miminizar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        miminizar.setPreferredSize(new java.awt.Dimension(20, 20));
        miminizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miminizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout miminizarLayout = new javax.swing.GroupLayout(miminizar);
        miminizar.setLayout(miminizarLayout);
        miminizarLayout.setHorizontalGroup(
            miminizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        miminizarLayout.setVerticalGroup(
            miminizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        jPanel1.add(miminizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 25, 15, 15));

        maximizar.setBackground(new java.awt.Color(0, 204, 0));
        maximizar.setForeground(new java.awt.Color(28, 191, 48));
        maximizar.setToolTipText("maximizar");
        maximizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        maximizar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        maximizar.setPreferredSize(new java.awt.Dimension(20, 20));

        javax.swing.GroupLayout maximizarLayout = new javax.swing.GroupLayout(maximizar);
        maximizar.setLayout(maximizarLayout);
        maximizarLayout.setHorizontalGroup(
            maximizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        maximizarLayout.setVerticalGroup(
            maximizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        jPanel1.add(maximizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 25, 15, 15));

        head2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 60));

        getContentPane().add(head2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 60));

        bg.setBackground(new java.awt.Color(246, 246, 246));
        bg.setToolTipText("");
        bg.setAlignmentX(1.0F);
        bg.setAlignmentY(1.0F);
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        P3.setBackground(new java.awt.Color(134, 168, 199));
        P3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Resultado Analizador Sintáctico");
        P3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 910, -1));

        areasintactico.setEditable(false);
        areasintactico.setBackground(new java.awt.Color(214, 217, 223));
        areasintactico.setColumns(20);
        areasintactico.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        areasintactico.setForeground(new java.awt.Color(51, 51, 51));
        areasintactico.setRows(5);
        areasintactico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                areasintacticoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(areasintactico);

        P3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 890, 160));

        bg.add(P3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 910, 210));

        P1.setBackground(new java.awt.Color(134, 168, 199));
        P1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingresar cadena");
        P1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 430, -1));

        areacadena.setBackground(new java.awt.Color(214, 217, 223));
        areacadena.setColumns(20);
        areacadena.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        areacadena.setForeground(new java.awt.Color(51, 51, 51));
        areacadena.setRows(5);
        areacadena.setAlignmentX(1.0F);
        areacadena.setBorder(null);
        areacadena.setCaretColor(new java.awt.Color(51, 51, 51));
        areacadena.setMargin(new java.awt.Insets(6, 6, 6, 6));
        areacadena.setSelectionColor(new java.awt.Color(153, 153, 153));
        areacadena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                areacadenaKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(areacadena);

        P1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 410, 280));

        bg.add(P1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 430, 330));

        P2.setBackground(new java.awt.Color(134, 168, 199));
        P2.setForeground(new java.awt.Color(37, 37, 37));
        P2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setBackground(new java.awt.Color(255, 255, 255));
        tabla.setForeground(new java.awt.Color(51, 51, 51));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "TOKENS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setSelectionBackground(new java.awt.Color(51, 204, 255));
        jScrollPane5.setViewportView(tabla);

        P2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 410, 280));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Resultado Analizador Léxico");
        P2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 430, -1));

        bg.add(P2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 430, 330));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 1010, 740));

        b1.setBackground(new java.awt.Color(255, 255, 255));
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b1MouseClicked(evt);
            }
        });
        b1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Analizador Léxico");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        b1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 190, 60));

        im1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/analizador/lexico/analyze.png"))); // NOI18N
        b1.add(im1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 230, 60));

        b2.setBackground(new java.awt.Color(255, 255, 255));
        b2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Analizador Sintáctico");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        b2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 190, 60));

        im2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/analizador/lexico/analyze.png"))); // NOI18N
        b2.add(im2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 230, 60));

        b3.setBackground(new java.awt.Color(255, 255, 255));
        b3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Reiniciar");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        b3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 190, 60));

        im3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/analizador/lexico/analyze.png"))); // NOI18N
        b3.add(im3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 230, 60));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 270, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void areasintacticoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_areasintacticoKeyReleased

    }//GEN-LAST:event_areasintacticoKeyReleased

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_salirMouseClicked

    private void areacadenaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_areacadenaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_areacadenaKeyReleased

    private void miminizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miminizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_miminizarMouseClicked

    private void head2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_head2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x- xMouse, y- yMouse);
    }//GEN-LAST:event_head2MouseDragged

    private void head2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_head2MousePressed
        xMouse= evt.getX();
        yMouse= evt.getY();
    }//GEN-LAST:event_head2MousePressed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        try {
        btnsintactico.setEnabled(true);//Habilita el boton Analizador sintactico
        verificar=1;
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        Object[] fila=new Object[3];       
        String cadena=("(while|for|int|if|else|public|static|private|String|Double|println|boolean|char|class|this|void|return|System|do)|([a-zA-Z]+)|([0-9]+)|([{|}|>|<|==|=|-|+|/|*|;|.|,|(|)])");       
        Pattern p=Pattern.compile(cadena);
        Matcher matcher= p.matcher(areacadena.getText());
        while(matcher.find()){
            String token1=matcher.group(1);
            if (token1 !=null) {
                if (LS.BuscarNom(token1)==1) {   
                    if (LS.BuscarID(token1)==9) {
                        vaif=9;
                        validar=1;
                    }
                    if (LS.BuscarID(token1)==2) {
                        validar=2;
                        vawhile=LS.BuscarID(token1);
                    }
                    if (LS.BuscarID(token1)==6) {
                        vafor=LS.BuscarID(token1);
                        validar=3;
                    }
                    if (LS.BuscarID(token1)==10) {
                        vaelse=10;
                    }
                    
                    if (LS.BuscarID(token1)==8) {
                        vastring=8;
                    }
                    
                    if (LS.BuscarID(token1)==1) {
                       vectorin[ingresadosint]= LS.BuscarID(token1);
                       ingresadosint++;
                    }
                    
                    if (LS.BuscarID(token1)==10) {
                        vaelse=10;
                    }
                        
                fila[0]=LS.BuscarID(token1);
                fila[1]=token1;
                fila[2]="PALABRA RESERVADA";
                modelo.addRow(fila);
                }else{
                codigo++;    
                fila[0]=codigo;
                fila[1]=token1;
                fila[2]="PALABRA RESERVADA";
                modelo.addRow(fila);
                tabla.setModel(modelo);
                Tablasimbolosreservada r=new Tablasimbolosreservada(codigo, token1,"PALABRA RESERVADA");
                LS.agregar(r);
                Globales.Grabarreservada();
                }

            }

            String token2=matcher.group(2);
            if (token2 !=null) {
                if (LU.BuscarNom(token2)==1) {  
                    if (LU.BuscarID(token2)>99 & LU.BuscarID(token2)<126) {
                        vectorletra[ingresadosletras]=LU.BuscarID(token2);
                        ingresadosletras++;
                    }
                    if (LU.BuscarID(token2)>125) {
                        vavariablepalabra=LU.BuscarID(token2); 
                    }
                    if (LU.BuscarID(token2)==108) {
                        vai=108;
                    }
                fila[0]=LU.BuscarID(token2);
                fila[1]=token2;
                fila[2]="VARIABLE";
                modelo.addRow(fila);
                }else{
                codigova++;   
                vavariablepalabra=codigova;
                fila[0]=codigova;
                fila[1]=token2;
                fila[2]="VARIABLE";
                modelo.addRow(fila);
                tabla.setModel(modelo);
                Tablasimbolos s=new Tablasimbolos(codigova, token2,"VARIABLE");
                LU.agregar(s);
                Globales.GrabarVariables();
                }
            }

            String token3=matcher.group(3);
            if (token3 !=null) {
                if (LNU.BuscarNom(token3)==1) {   
                    if (LNU.BuscarID(token3)>2018 & LNU.BuscarID(token3)<3000) {
                        varianum1=LNU.BuscarID(token3);
                    }
                    
                    if (LNU.BuscarID(token3)>1999 & LNU.BuscarID(token3)<2019) {
                        vectornum[ingresadosnum]=LNU.BuscarID(token3);
                        ingresadosnum++;
                    }
                    
                   
                fila[0]=LNU.BuscarID(token3);
                fila[1]=token3;
                fila[2]="NUMEROS";
                modelo.addRow(fila);
                }else{
                codigonu++;    
                fila[0]=codigonu;
                fila[1]=token3;
                fila[2]="NUMEROS";
                modelo.addRow(fila);
                tabla.setModel(modelo);
                Tablanumeros n=new Tablanumeros(codigonu, token3,"NUMEROS");
                LNU.agregar(n);
                Globales.Grabarnu();
                }
            }

            String token4=matcher.group(4);
            if (token4 !=null) {
                if (LL.BuscarNom(token4)==1) {
                    if (LL.BuscarID(token4)==1003) {
                        vaabreparentesis=1003;
                    }
                    
                    if (LL.BuscarID(token4)==1004) {
                       vacierraparentesis=1004; 
                    }
                    
                    if (LL.BuscarID(token4)==1014) {
                        vectorllavesabrir[ingresadosllavesabrir]=LL.BuscarID(token4);
                        ingresadosllavesabrir++;
                    }
                    
                    if (LL.BuscarID(token4)==1013) {
                       vectorllavescerrar[ingresadosllavescerrar]=LL.BuscarID(token4);
                       ingresadosllavescerrar++;
                    }
                    
                    if (LL.BuscarID(token4)==1006) {
                        vectorigual[ingresadosigual]=LL.BuscarID(token4);
                        ingresadosigual++;
                    }
                    
                    if (LL.BuscarID(token4)==1000) {
                        vectorpuntocoma[ingresadospuntocoma]=LL.BuscarID(token4);
                        ingresadospuntocoma++;
                    }
                    
                    if (LL.BuscarID(token4)==1019) {
                        vasu=1019;
                    }
                    
                    if (LL.BuscarID(token4)==1007 || LL.BuscarID(token4)==1008 || LL.BuscarID(token4)==1011) {
          
                        vadelimitador=LL.BuscarID(token4); 
                    }
                fila[0]=LL.BuscarID(token4);
                fila[1]=token4;
                fila[2]="DELIMITADORES";
                modelo.addRow(fila);
                }else{
                codigode++;    
                fila[0]=codigode;
                fila[1]=token4;
                fila[2]="DELIMITADORES";
                modelo.addRow(fila);
                tabla.setModel(modelo);
                Tabladelimitadores d=new Tabladelimitadores(codigode, token4,"DELIMITADORES");
                LL.agregar(d);
                Globales.Grabardelimitadores();
                }
            }

        }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseClicked
           
    }//GEN-LAST:event_b1MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        int validaletra=0;
        if (verificar==1) {
            if (validar==1) {
              if (vaif==9) {
                areasintactico.append("Palabra reservada correcta ->"+" IF "+" - ID = "+vaif);
                
                if (vaabreparentesis==1003) {
                    areasintactico.append("\nDelimitador correcto ->"+" ( "+" - ID = "+vaabreparentesis); 
                    
                    if (vavariablepalabra>125 ) {         
                        areasintactico.append("\nVariable Correcta -> "+LU.Obtenernombre(vavariablepalabra)+" - ID = "+vavariablepalabra);
                        
                        if (vadelimitador==1006 || vadelimitador==1007 || vadelimitador==1008 || vadelimitador==1011) {
                            areasintactico.append("\nDelimitador Correcto -> "+LL.Obtenernombre(vadelimitador)+" - ID = "+vavariablepalabra);
                        
                            if (varianum1>2018 & varianum1<3000) {
                                areasintactico.append("\nNumero correcto -> "+LNU.Obtenernombre(varianum1)+" - ID ="+varianum1);
                                
                                if (vacierraparentesis==1004) {
                                  areasintactico.append("\nDelimitador correcto -> "+" ) "+" - ID = "+vacierraparentesis); 
                                
                                    if (vectorllavesabrir[0]==1014) {
                                    areasintactico.append("\nDelimitador correcto -> "+" { "+" - ID = "+vectorllavesabrir[0]); 
                                    
                                        if (vectorin[0]==1) {
                                         areasintactico.append("\nPalabra Reservada Correcto ->"+" int "+" - ID = "+vectorin[0]);
                                         
                                            if (vectorletra[0]>99 & vectorletra[0]<126) {
                                               areasintactico.append("\nVariable correcta -> "+LU.Obtenernombre(vectorletra[0])+" "+" - ID = "+vectorletra[0]);   
                                                
                                               if (vectorigual[0]==1006) {
                                                   areasintactico.append("\nDelimitador correcto ->"+" = "+" - ID = "+vectorigual[0]);
                                                    
                                                   if (vectornum[0]>1999 & vectornum[0]<2019) {
                                                       areasintactico.append("\nNumero Correcto -> "+LNU.Obtenernombre(vectornum[0])+" "+" - ID = "+vectornum[0]); 
                                                    
                                                       if (vectorpuntocoma[0]==1000) {
                                                         areasintactico.append("\nDelimitador correcto ->"+" ; "+" - ID = "+vectorpuntocoma[0]);  
                                                       
                                                           if (vectorllavescerrar[0]==1013) {
                                                            areasintactico.append("\nDelimitador correcto ->"+" } "+" - ID = "+vectorllavescerrar[0]);     
                                                           
                                                               if (vaelse==10) {
                                                                areasintactico.append("\nPalabra Reservada Correcta ->"+" else "+" - ID = "+vaelse); 
                                                                
                                                                   if (vectorllavesabrir[1]==1014) {
                                                                    areasintactico.append("\nDelimitador correcto ->"+" { "+" - ID = "+vectorllavesabrir[1]);    
                                                                   
                                                                       if (vectorin[1]==1) {
                                                                       areasintactico.append("\nPalabra Reservada Correcta ->"+" int "+" - ID = "+vectorin[1]);
                                                                       
                                                                            if (vectorletra[1]>99 & vectorletra[1]<126) {
                                                                              areasintactico.append("\nVariable correcta -> "+LU.Obtenernombre(vectorletra[1])+" "+" - ID = "+vectorletra[1]); 
                                                                             
                                                                              if (vectorigual[1]==1006) {
                                                                                 areasintactico.append("\nDelimitador correcto ->"+" = "+" - ID = "+vectorigual[1]); 
                                                                              
                                                                                 if (vectornum[1]>1999 & vectornum[1]<2019) {
                                                                                 areasintactico.append("\nNumero Correcto -> "+LNU.Obtenernombre(vectornum[1])+" "+" - ID = "+vectornum[1]);
                                                                                 
                                                                                 if (vectorpuntocoma[1]==1000) {
                                                                                    areasintactico.append("\nDelimitador correcto ->"+" ; "+" - ID = "+vectorpuntocoma[1]);  
                                                                                 
                                                                                    if (vectorllavescerrar[1]==1013) {
                                                                                    areasintactico.append("\nDelimitador correcto ->"+" } "+" - ID = "+vectorllavescerrar[1]); 
                                                                                              JOptionPane.showMessageDialog(null, 
                                                                                                                            "CADENA ACEPTADA IF ELSE NO CONTIENE NI UN ERROR!", 
                                                                                                                            "DATOS CORRECTOS", 
                                                                                                                            JOptionPane.INFORMATION_MESSAGE);
                                                                                    }else{
                                                                                     areasintactico.append("\nError Falta Delimitador  ->"+" } ");
                                                                                    }  
                                                                                }else{
                                                                                     areasintactico.append("\nError Falta Delimitador  ->"+" ; ");
                                                                                 }
                                                                                 }else{
                                                                                      areasintactico.append("\nError Falta numero  ->"+" 1,2,3,4,5,6,7.......... ");
                                                                                 }
                                                                                 }else{
                                                                                  areasintactico.append("\nError Falta Delimitador  ->"+" = ");
                                                                             }
                                                                           }else{
                                                                              areasintactico.append("\nError Falta Variable  ->"+" Letras ");
                                                                            }
                                                                       }else{
                                                                       areasintactico.append("\nError Falta Palabra Reservada  ->"+" int ");
                                                                       }
                                                                   }else{
                                                                   areasintactico.append("\nError Falta Delimitador ->"+" { ");
                                                                   }
                                                               }else{
                                                                areasintactico.append("\nError Falta Palabra Reservada ->"+" else ");
                                                           }
                                                           }else{
                                                           areasintactico.append("\nError Falta Delimitador ->"+" } ");
                                                           }
                                                       }else{
                                                         areasintactico.append("\nError Falta Delimitador ->"+" ; ");
                                                       }
                                                   }else{
                                                     areasintactico.append("\nError Falta Numeros ->"+" 1,2,3,4,5,6,7,8............ ");
                                                   }
                                                }else{
                                                   areasintactico.append("\nError Falta Delimitador ->"+" = ");
                                                }
                                            }else{
                                             areasintactico.append("\nError Falta Variables ->"+" Letras ");
                                            }
                                        }else{
                                         areasintactico.append("\nError Falta Palabra Reservada ->"+" int "); 
                                         
                                        }
                                    }else{
                                    areasintactico.append("\nError Falta Delimitador -> "+"{"); 
                                    }
                                }else{
                                  areasintactico.append("\nError Falta Delimitador ->"+" ) "); 
                                }
                            }else{
                               areasintactico.append("\nError Falta Numeros ->"+" 1,2,3,4................... ");
                            }
                        }else{
                             areasintactico.append("\nError Falta Uno De Estos Delimitadores ->"+" = , == , > , < "); 
                        }
                    }else{
                    areasintactico.append("\nError Falta Variables ->"+" Letras ");
                    
                    }
                        
                }else{
                areasintactico.append("\nError Falta Delimitador ->"+" ( "); 
                
                }
            }else{
                areasintactico.append("Error Falta palabra reservada ->"+" IF");
            } 
           
            }
            
            
            if (validar==0) {
                        JOptionPane.showMessageDialog(null, 
                        "LA CADENA DEBE INICIALIZAR IF,FOR,WHILE", 
                        "DATOS INCORRECTOS", 
                        JOptionPane.ERROR_MESSAGE);                
            }
            
            if (validar==2) {
                if (vawhile==2) {
                areasintactico.append("Palabra Reservada Correcta ->"+" while"); 
                    if (vaabreparentesis==1003) {
                    areasintactico.append("\nDelimitador correcto ->"+" ( "+" - ID = "+vaabreparentesis);
                        if (vavariablepalabra>125 ) {         
                        areasintactico.append("\nVariable Correcta -> "+LU.Obtenernombre(vavariablepalabra)+" - ID = "+vavariablepalabra);
                        
                        if (vadelimitador==1007 || vadelimitador==1008 || vadelimitador==1011) {
                            areasintactico.append("\nDelimitador Correcto -> "+LL.Obtenernombre(vadelimitador)+" - ID = "+vavariablepalabra);
                        
                             if (varianum1>2018 & varianum1<3000) {
                             areasintactico.append("\nNumero correcto -> "+LNU.Obtenernombre(varianum1)+" - ID ="+varianum1);
                             
                        if (vacierraparentesis==1004) {
                             areasintactico.append("\nDelimitador correcto -> "+" ) "+" - ID = "+vacierraparentesis);
                             
                              if (vectorllavesabrir[0]==1014) {
                                    areasintactico.append("\nDelimitador correcto ->"+" { "+" - ID = "+vectorllavesabrir[0]);
                              
                             if (vectorin[0]==1) {
                             areasintactico.append("\nPalabra Reservada Correcto ->"+" int "+" - ID = "+vectorin[0]);
                             
                                if (vectorletra[0]>99 & vectorletra[0]<126) {
                                   areasintactico.append("\nVariable correcta -> "+LU.Obtenernombre(vectorletra[0])+" "+" - ID = "+vectorletra[0]);
                                 
                                   if (vectorigual[0]==1006) {
                                   areasintactico.append("\nDelimitador correcto ->"+" = "+" - ID = "+vectorigual[0]);
                                   
                                   if (vectornum[0]>1999 & vectornum[0]<2019) {
                                    areasintactico.append("\nNumero correcto -> "+LNU.Obtenernombre(vectornum[0])+" - ID ="+vectornum[0]);
                                    
                                    if (vectorpuntocoma[0]==1000) {
                                       areasintactico.append("\nDelimitador correcto ->"+" ; "+" - ID = "+vectorpuntocoma[0]);  
                                    
                                    if (vectorllavescerrar[0]==1013) {
                                    areasintactico.append("\nDelimitador correcto ->"+" } "+" - ID = "+vectorllavescerrar[0]); 
                                              JOptionPane.showMessageDialog(null, 
                                                                            "CADENA ACEPTADA WHILE NO CONTIENE NI UN ERROR!", 
                                                                            "DATOS CORRECTOS", 
                                                                            JOptionPane.INFORMATION_MESSAGE);
                                    }else{
                                     areasintactico.append("\nError Falta Delimitador  ->"+" } ");
                                    }  

                                    }else{
                                     areasintactico.append("\nError Falta Delimitador ->"+" ;");  
                                   }
                                   }else{
                                   areasintactico.append("\nError Falta Numero ->"+" 1,2,3,4,5,6,7 ..........");    
                                   }
                                 }else{
                                   areasintactico.append("\nError Falta Delimitador ->"+" =");   
                                 }
                                }else{
                                    areasintactico.append("\nError Falta Letra ->"+" letra");                               
                                 }
                             }else{
                             areasintactico.append("\nError Falta Palabra Reservada ->"+" int");
                             }
                        }else{
                            areasintactico.append("\nError Falta Delimitador ->"+" {");
                        }
                        }else{
                             areasintactico.append("\nError Falta Delimitador ->"+" )");
                        }
                        }else{
                            areasintactico.append("\nError Falta Numero ->"+" 1,2,3,4,5,6,7...........");
                        }
                        }else{
                            areasintactico.append("\nError Falta Delimitador ->"+" >,= o <");
                        }
                        }else{
                        areasintactico.append("\nError Falta Variable ->"+" letras");
                        }
                   }else{
                    areasintactico.append("\nError Falta Delimitador ->"+" (");
                    }
            }else{
                areasintactico.append("Error Falta palabra reservada ->"+" while");
            }
            }
            
            if (validar==3) {
                if (vafor==6) {
                areasintactico.append("Palabra Reservada Correc ->"+" For"+" - ID = "+vafor);    
                    
                if (vaabreparentesis==1003) {
                    areasintactico.append("\nDelimitador correcto ->"+" ( "+" - ID = "+vaabreparentesis);
                    
                    if (vectorletra[0]>99 & vectorletra[0]<126) {
                        areasintactico.append("\nVariable correcta -> "+LU.Obtenernombre(vectorletra[0])+" "+" - ID = "+vectorletra[0]);   
                        validaletra=vectorletra[0];
                   
                        if (vectorigual[0]==1006) {
                        areasintactico.append("\nDelimitador correcto ->"+" = "+" - ID = "+vectorigual[0]);  
                        
                            if (vectornum[0]>1999 & vectornum[0]<2019) {
                             areasintactico.append("\nNumero Correcto -> "+LNU.Obtenernombre(vectornum[0])+" "+" - ID = "+vectornum[0]);  
                           if (vectorpuntocoma[0]==1000) {
                                areasintactico.append("\nDelimitador correcto ->"+" ; "+" - ID = "+vectorpuntocoma[0]); 
                                 if (vectorletra[1]==validaletra) {
                                 areasintactico.append("\nVariable correcta -> "+LU.Obtenernombre(vectorletra[1])+" "+" - ID = "+vectorletra[1]);
                                 
                                     if ( vadelimitador==1008) {
                                       areasintactico.append("\nDelimitador correcto ->"+" < "+" - ID = "+vadelimitador);    
                                     
                                        if (vectornum[1]>1999 & vectornum[1]<2019) {
                                            areasintactico.append("\nNumero Correcto -> "+LNU.Obtenernombre(vectornum[1])+" "+" - ID = "+vectornum[1]);  
                                            if (vectorpuntocoma[1]==1000) {
                                            areasintactico.append("\nDelimitador correcto ->"+" ; "+" - ID = "+vectorpuntocoma[1]);
                                            
                                            if (vai==108 & vasu==1019) {
                                               areasintactico.append("\nVariable y Delimitador correcto ->"+" i++ "+" - ID = "+vai+" - "+vasu);       
                                                
                                                if (vacierraparentesis==1004) {
                                                  areasintactico.append("\nDelimitador correcto ->"+" ) "+" - ID = "+vacierraparentesis);   
                                                
                                                    if (vectorllavesabrir[0]==1014) {
                                                       areasintactico.append("\nDelimitador correcto ->"+" { "+" - ID = "+vectorllavesabrir[0]); 
                                                    
                                                        if (vastring==8) {
                                                            areasintactico.append("\nPalabra Reservada correcto ->"+" String "+" - ID = "+vastring);  
                                                            if (vavariablepalabra>125) {
                                                                 areasintactico.append("\nVariable correcta ->"+LU.Obtenernombre(vavariablepalabra)+" - ID = "+vavariablepalabra);   
                                                                if (vectorpuntocoma[2]==1000) {
                                                                areasintactico.append("\nDelimitador correcto ->"+" ; "+" - ID = "+vectorpuntocoma[2]);
                                                                    if (vectorllavescerrar[0]==1013) {
                                                                            areasintactico.append("\nDelimitador correcto ->"+" } "+" - ID = "+vectorllavescerrar[0]);
                                                                            JOptionPane.showMessageDialog(null, 
                                                                            "CADENA ACEPTADA FOR NO CONTIENE NI UN ERROR!", 
                                                                            "DATOS CORRECTOS", 
                                                                            JOptionPane.INFORMATION_MESSAGE);  
                                                                    }else{
                                                                        areasintactico.append("\nError Falta Delimitador  ->"+" } ");
                                                                    }
                                                                
                                                                }else{
                                                                     areasintactico.append("\nError Falta Delimitador  ->"+" ; ");
                                                                }
                                                                }else{
                                                            areasintactico.append("\nError Falta Palabra Variable  ->"+" a,b,c,d,e,f.............. ");
                                                             }
                                                        
                                                        }else{
                                                              areasintactico.append("\nError Falta Palabra Reservada  ->"+" String ");
                                                        }
                                          
                                                    }else{
                                                        areasintactico.append("\nError Falta Delimitador  ->"+" { ");
                                                    }
                                                }else{
                                                areasintactico.append("\nError Falta Delimitador  ->"+" ) ");
                                                }
                                            }else{
                                                areasintactico.append("\nError Falta Variable y Delimitador  ->"+" i++ ");
                                            }
                                            }else{
                                            areasintactico.append("\nError Falta Delimitador  ->"+" ; ");
                                            }
                                        }else{
                                             areasintactico.append("\nError Falta Numero  ->"+" 1,2,3,4,5,6,7........... ");
                                        }
                                     }else{
                                       areasintactico.append("\nError Falta Delimitador  ->"+" < ");
                                     }
                                 }else{
                                 areasintactico.append("\nError Variables Distintas ->"+" "+LU.Obtenernombre(vectorletra[0])+" Es Diferente a "+LU.Obtenernombre(vectorletra[1]));    
                                 }
                           }else{
                                areasintactico.append("\nError Falta Delimitador ->"+" ;");                           
                           }
                            }else{
                                areasintactico.append("\nError Falta Numero ->"+" 1,2,3,4,5,6,7.............");
                            }
                        }else{
                        areasintactico.append("\nError Falta Delimitador ->"+" =");
                        }
                    }else{
                     areasintactico.append("\nError Falta Variable ->"+" letra");
                     }                   
                    }else{
                    areasintactico.append("\nError Falta Delimitador ->"+" (");
                    }
                }else{
                areasintactico.append("Error Falta palabra reservada ->"+" For");
            }
  
            }
 
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        ingresadosnum=0;ingresadospuntocoma=0;ingresadosigual=0;ingresadosletras=0;ingresadosint=0;ingresadosllavesabrir=0;ingresadosllavescerrar=0;
        vaif=0;vaelse=0;vaabreparentesis=0;vacierraparentesis=0;vavariablepalabra=0;vadelimitador=0;varianum1=0;vastring=0;
        vaif=0;vaelse=0;vaabreparentesis=0;vacierraparentesis=0;ingresadosletras=0;vavariablepalabra=0;vadelimitador=0;varianum1=0;
        ingresadosnum=0;ingresadospuntocoma=0;ingresadosllavesabrir=0;ingresadosllavescerrar=0;vectorllavesabrir[0]=0;ingresadosigual=0;
        vectorllavesabrir[1]=0;vectorllavescerrar[0]=0;vectorllavescerrar[1]=0;ingresadosint=0;vectorin[0]=0;vectorin[1]=0;vectornum[0]=0;
        vectornum[1]=0;vectorpuntocoma[0]=0;vectorpuntocoma[1]=0;vawhile=0;vafor=0;vai=0;vasu=0;vastring=0;
        vawhile=0;vafor=0;vai=0;vasu=0;
        areacadena.setText("");
        areasintactico.setText("");
        areacadena.requestFocus();     
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        for (int i = 0; i < tabla.getRowCount(); i++) {
            modelo.removeRow(i);
            i-=1;
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void btnsintacticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsintacticoActionPerformed
        int validaletra=0;
        if (verificar==1) {
            if (validar==1) {
                if (vaif==9) {
                    areasintactico.append("Palabra reservada correcta ->"+" IF "+" - ID = "+vaif);

                    if (vaabreparentesis==1003) {
                        areasintactico.append("\nDelimitador correcto ->"+" ( "+" - ID = "+vaabreparentesis);

                        if (vavariablepalabra>125 ) {
                            areasintactico.append("\nVariable Correcta -> "+LU.Obtenernombre(vavariablepalabra)+" - ID = "+vavariablepalabra);

                            if (vadelimitador==1006 || vadelimitador==1007 || vadelimitador==1008 || vadelimitador==1011) {
                                areasintactico.append("\nDelimitador Correcto -> "+LL.Obtenernombre(vadelimitador)+" - ID = "+vavariablepalabra);

                                if (varianum1>2018 & varianum1<3000) {
                                    areasintactico.append("\nNumero correcto -> "+LNU.Obtenernombre(varianum1)+" - ID ="+varianum1);

                                    if (vacierraparentesis==1004) {
                                        areasintactico.append("\nDelimitador correcto -> "+" ) "+" - ID = "+vacierraparentesis);

                                        if (vectorllavesabrir[0]==1014) {
                                            areasintactico.append("\nDelimitador correcto -> "+" { "+" - ID = "+vectorllavesabrir[0]);

                                            if (vectorin[0]==1) {
                                                areasintactico.append("\nPalabra Reservada Correcto ->"+" int "+" - ID = "+vectorin[0]);

                                                if (vectorletra[0]>99 & vectorletra[0]<126) {
                                                    areasintactico.append("\nVariable correcta -> "+LU.Obtenernombre(vectorletra[0])+" "+" - ID = "+vectorletra[0]);

                                                    if (vectorigual[0]==1006) {
                                                        areasintactico.append("\nDelimitador correcto ->"+" = "+" - ID = "+vectorigual[0]);

                                                        if (vectornum[0]>1999 & vectornum[0]<2019) {
                                                            areasintactico.append("\nNumero Correcto -> "+LNU.Obtenernombre(vectornum[0])+" "+" - ID = "+vectornum[0]);

                                                            if (vectorpuntocoma[0]==1000) {
                                                                areasintactico.append("\nDelimitador correcto ->"+" ; "+" - ID = "+vectorpuntocoma[0]);

                                                                if (vectorllavescerrar[0]==1013) {
                                                                    areasintactico.append("\nDelimitador correcto ->"+" } "+" - ID = "+vectorllavescerrar[0]);

                                                                    if (vaelse==10) {
                                                                        areasintactico.append("\nPalabra Reservada Correcta ->"+" else "+" - ID = "+vaelse);

                                                                        if (vectorllavesabrir[1]==1014) {
                                                                            areasintactico.append("\nDelimitador correcto ->"+" { "+" - ID = "+vectorllavesabrir[1]);

                                                                            if (vectorin[1]==1) {
                                                                                areasintactico.append("\nPalabra Reservada Correcta ->"+" int "+" - ID = "+vectorin[1]);

                                                                                if (vectorletra[1]>99 & vectorletra[1]<126) {
                                                                                    areasintactico.append("\nVariable correcta -> "+LU.Obtenernombre(vectorletra[1])+" "+" - ID = "+vectorletra[1]);

                                                                                    if (vectorigual[1]==1006) {
                                                                                        areasintactico.append("\nDelimitador correcto ->"+" = "+" - ID = "+vectorigual[1]);

                                                                                        if (vectornum[1]>1999 & vectornum[1]<2019) {
                                                                                            areasintactico.append("\nNumero Correcto -> "+LNU.Obtenernombre(vectornum[1])+" "+" - ID = "+vectornum[1]);

                                                                                            if (vectorpuntocoma[1]==1000) {
                                                                                                areasintactico.append("\nDelimitador correcto ->"+" ; "+" - ID = "+vectorpuntocoma[1]);

                                                                                                if (vectorllavescerrar[1]==1013) {
                                                                                                    areasintactico.append("\nDelimitador correcto ->"+" } "+" - ID = "+vectorllavescerrar[1]);
                                                                                                    JOptionPane.showMessageDialog(null,
                                                                                                        "CADENA ACEPTADA IF ELSE NO CONTIENE NI UN ERROR!",
                                                                                                        "DATOS CORRECTOS",
                                                                                                        JOptionPane.INFORMATION_MESSAGE);
                                                                                                }else{
                                                                                                    areasintactico.append("\nError Falta Delimitador  ->"+" } ");
                                                                                                }
                                                                                            }else{
                                                                                                areasintactico.append("\nError Falta Delimitador  ->"+" ; ");
                                                                                            }
                                                                                        }else{
                                                                                            areasintactico.append("\nError Falta numero  ->"+" 1,2,3,4,5,6,7.......... ");
                                                                                        }
                                                                                    }else{
                                                                                        areasintactico.append("\nError Falta Delimitador  ->"+" = ");
                                                                                    }
                                                                                }else{
                                                                                    areasintactico.append("\nError Falta Variable  ->"+" Letras ");
                                                                                }
                                                                            }else{
                                                                                areasintactico.append("\nError Falta Palabra Reservada  ->"+" int ");
                                                                            }
                                                                        }else{
                                                                            areasintactico.append("\nError Falta Delimitador ->"+" { ");
                                                                        }
                                                                    }else{
                                                                        areasintactico.append("\nError Falta Palabra Reservada ->"+" else ");
                                                                    }
                                                                }else{
                                                                    areasintactico.append("\nError Falta Delimitador ->"+" } ");
                                                                }
                                                            }else{
                                                                areasintactico.append("\nError Falta Delimitador ->"+" ; ");
                                                            }
                                                        }else{
                                                            areasintactico.append("\nError Falta Numeros ->"+" 1,2,3,4,5,6,7,8............ ");
                                                        }
                                                    }else{
                                                        areasintactico.append("\nError Falta Delimitador ->"+" = ");
                                                    }
                                                }else{
                                                    areasintactico.append("\nError Falta Variables ->"+" Letras ");
                                                }
                                            }else{
                                                areasintactico.append("\nError Falta Palabra Reservada ->"+" int ");

                                            }
                                        }else{
                                            areasintactico.append("\nError Falta Delimitador -> "+"{");
                                        }
                                    }else{
                                        areasintactico.append("\nError Falta Delimitador ->"+" ) ");
                                    }
                                }else{
                                    areasintactico.append("\nError Falta Numeros ->"+" 1,2,3,4................... ");
                                }
                            }else{
                                areasintactico.append("\nError Falta Uno De Estos Delimitadores ->"+" = , == , > , < ");
                            }
                        }else{
                            areasintactico.append("\nError Falta Variables ->"+" Letras ");

                        }

                    }else{
                        areasintactico.append("\nError Falta Delimitador ->"+" ( ");

                    }
                }else{
                    areasintactico.append("Error Falta palabra reservada ->"+" IF");
                }

            }

            if (validar==0) {
                JOptionPane.showMessageDialog(null,
                    "LA CADENA DEBE INICIALIZAR IF,FOR,WHILE",
                    "DATOS INCORRECTOS",
                    JOptionPane.ERROR_MESSAGE);
            }

            if (validar==2) {
                if (vawhile==2) {
                    areasintactico.append("Palabra Reservada Correcta ->"+" while");
                    if (vaabreparentesis==1003) {
                        areasintactico.append("\nDelimitador correcto ->"+" ( "+" - ID = "+vaabreparentesis);
                        if (vavariablepalabra>125 ) {
                            areasintactico.append("\nVariable Correcta -> "+LU.Obtenernombre(vavariablepalabra)+" - ID = "+vavariablepalabra);

                            if (vadelimitador==1007 || vadelimitador==1008 || vadelimitador==1011) {
                                areasintactico.append("\nDelimitador Correcto -> "+LL.Obtenernombre(vadelimitador)+" - ID = "+vavariablepalabra);

                                if (varianum1>2018 & varianum1<3000) {
                                    areasintactico.append("\nNumero correcto -> "+LNU.Obtenernombre(varianum1)+" - ID ="+varianum1);

                                    if (vacierraparentesis==1004) {
                                        areasintactico.append("\nDelimitador correcto -> "+" ) "+" - ID = "+vacierraparentesis);

                                        if (vectorllavesabrir[0]==1014) {
                                            areasintactico.append("\nDelimitador correcto ->"+" { "+" - ID = "+vectorllavesabrir[0]);

                                            if (vectorin[0]==1) {
                                                areasintactico.append("\nPalabra Reservada Correcto ->"+" int "+" - ID = "+vectorin[0]);

                                                if (vectorletra[0]>99 & vectorletra[0]<126) {
                                                    areasintactico.append("\nVariable correcta -> "+LU.Obtenernombre(vectorletra[0])+" "+" - ID = "+vectorletra[0]);

                                                    if (vectorigual[0]==1006) {
                                                        areasintactico.append("\nDelimitador correcto ->"+" = "+" - ID = "+vectorigual[0]);

                                                        if (vectornum[0]>1999 & vectornum[0]<2019) {
                                                            areasintactico.append("\nNumero correcto -> "+LNU.Obtenernombre(vectornum[0])+" - ID ="+vectornum[0]);

                                                            if (vectorpuntocoma[0]==1000) {
                                                                areasintactico.append("\nDelimitador correcto ->"+" ; "+" - ID = "+vectorpuntocoma[0]);

                                                                if (vectorllavescerrar[0]==1013) {
                                                                    areasintactico.append("\nDelimitador correcto ->"+" } "+" - ID = "+vectorllavescerrar[0]);
                                                                    JOptionPane.showMessageDialog(null,
                                                                        "CADENA ACEPTADA WHILE NO CONTIENE NI UN ERROR!",
                                                                        "DATOS CORRECTOS",
                                                                        JOptionPane.INFORMATION_MESSAGE);
                                                                }else{
                                                                    areasintactico.append("\nError Falta Delimitador  ->"+" } ");
                                                                }

                                                            }else{
                                                                areasintactico.append("\nError Falta Delimitador ->"+" ;");
                                                            }
                                                        }else{
                                                            areasintactico.append("\nError Falta Numero ->"+" 1,2,3,4,5,6,7 ..........");
                                                        }
                                                    }else{
                                                        areasintactico.append("\nError Falta Delimitador ->"+" =");
                                                    }
                                                }else{
                                                    areasintactico.append("\nError Falta Letra ->"+" letra");
                                                }
                                            }else{
                                                areasintactico.append("\nError Falta Palabra Reservada ->"+" int");
                                            }
                                        }else{
                                            areasintactico.append("\nError Falta Delimitador ->"+" {");
                                        }
                                    }else{
                                        areasintactico.append("\nError Falta Delimitador ->"+" )");
                                    }
                                }else{
                                    areasintactico.append("\nError Falta Numero ->"+" 1,2,3,4,5,6,7...........");
                                }
                            }else{
                                areasintactico.append("\nError Falta Delimitador ->"+" >,= o <");
                            }
                        }else{
                            areasintactico.append("\nError Falta Variable ->"+" letras");
                        }
                    }else{
                        areasintactico.append("\nError Falta Delimitador ->"+" (");
                    }
                }else{
                    areasintactico.append("Error Falta palabra reservada ->"+" while");
                }
            }

            if (validar==3) {
                if (vafor==6) {
                    areasintactico.append("Palabra Reservada Correc ->"+" For"+" - ID = "+vafor);

                    if (vaabreparentesis==1003) {
                        areasintactico.append("\nDelimitador correcto ->"+" ( "+" - ID = "+vaabreparentesis);

                        if (vectorletra[0]>99 & vectorletra[0]<126) {
                            areasintactico.append("\nVariable correcta -> "+LU.Obtenernombre(vectorletra[0])+" "+" - ID = "+vectorletra[0]);
                            validaletra=vectorletra[0];

                            if (vectorigual[0]==1006) {
                                areasintactico.append("\nDelimitador correcto ->"+" = "+" - ID = "+vectorigual[0]);

                                if (vectornum[0]>1999 & vectornum[0]<2019) {
                                    areasintactico.append("\nNumero Correcto -> "+LNU.Obtenernombre(vectornum[0])+" "+" - ID = "+vectornum[0]);
                                    if (vectorpuntocoma[0]==1000) {
                                        areasintactico.append("\nDelimitador correcto ->"+" ; "+" - ID = "+vectorpuntocoma[0]);
                                        if (vectorletra[1]==validaletra) {
                                            areasintactico.append("\nVariable correcta -> "+LU.Obtenernombre(vectorletra[1])+" "+" - ID = "+vectorletra[1]);

                                            if ( vadelimitador==1008) {
                                                areasintactico.append("\nDelimitador correcto ->"+" < "+" - ID = "+vadelimitador);

                                                if (vectornum[1]>1999 & vectornum[1]<2019) {
                                                    areasintactico.append("\nNumero Correcto -> "+LNU.Obtenernombre(vectornum[1])+" "+" - ID = "+vectornum[1]);
                                                    if (vectorpuntocoma[1]==1000) {
                                                        areasintactico.append("\nDelimitador correcto ->"+" ; "+" - ID = "+vectorpuntocoma[1]);

                                                        if (vai==108 & vasu==1019) {
                                                            areasintactico.append("\nVariable y Delimitador correcto ->"+" i++ "+" - ID = "+vai+" - "+vasu);

                                                            if (vacierraparentesis==1004) {
                                                                areasintactico.append("\nDelimitador correcto ->"+" ) "+" - ID = "+vacierraparentesis);

                                                                if (vectorllavesabrir[0]==1014) {
                                                                    areasintactico.append("\nDelimitador correcto ->"+" { "+" - ID = "+vectorllavesabrir[0]);

                                                                    if (vastring==8) {
                                                                        areasintactico.append("\nPalabra Reservada correcto ->"+" String "+" - ID = "+vastring);
                                                                        if (vavariablepalabra>125) {
                                                                            areasintactico.append("\nVariable correcta ->"+LU.Obtenernombre(vavariablepalabra)+" - ID = "+vavariablepalabra);
                                                                            if (vectorpuntocoma[2]==1000) {
                                                                                areasintactico.append("\nDelimitador correcto ->"+" ; "+" - ID = "+vectorpuntocoma[2]);
                                                                                if (vectorllavescerrar[0]==1013) {
                                                                                    areasintactico.append("\nDelimitador correcto ->"+" } "+" - ID = "+vectorllavescerrar[0]);
                                                                                    JOptionPane.showMessageDialog(null,
                                                                                        "CADENA ACEPTADA FOR NO CONTIENE NI UN ERROR!",
                                                                                        "DATOS CORRECTOS",
                                                                                        JOptionPane.INFORMATION_MESSAGE);
                                                                                }else{
                                                                                    areasintactico.append("\nError Falta Delimitador  ->"+" } ");
                                                                                }

                                                                            }else{
                                                                                areasintactico.append("\nError Falta Delimitador  ->"+" ; ");
                                                                            }
                                                                        }else{
                                                                            areasintactico.append("\nError Falta Palabra Variable  ->"+" a,b,c,d,e,f.............. ");
                                                                        }

                                                                    }else{
                                                                        areasintactico.append("\nError Falta Palabra Reservada  ->"+" String ");
                                                                    }

                                                                }else{
                                                                    areasintactico.append("\nError Falta Delimitador  ->"+" { ");
                                                                }
                                                            }else{
                                                                areasintactico.append("\nError Falta Delimitador  ->"+" ) ");
                                                            }
                                                        }else{
                                                            areasintactico.append("\nError Falta Variable y Delimitador  ->"+" i++ ");
                                                        }
                                                    }else{
                                                        areasintactico.append("\nError Falta Delimitador  ->"+" ; ");
                                                    }
                                                }else{
                                                    areasintactico.append("\nError Falta Numero  ->"+" 1,2,3,4,5,6,7........... ");
                                                }
                                            }else{
                                                areasintactico.append("\nError Falta Delimitador  ->"+" < ");
                                            }
                                        }else{
                                            areasintactico.append("\nError Variables Distintas ->"+" "+LU.Obtenernombre(vectorletra[0])+" Es Diferente a "+LU.Obtenernombre(vectorletra[1]));
                                        }
                                    }else{
                                        areasintactico.append("\nError Falta Delimitador ->"+" ;");
                                    }
                                }else{
                                    areasintactico.append("\nError Falta Numero ->"+" 1,2,3,4,5,6,7.............");
                                }
                            }else{
                                areasintactico.append("\nError Falta Delimitador ->"+" =");
                            }
                        }else{
                            areasintactico.append("\nError Falta Variable ->"+" letra");
                        }
                    }else{
                        areasintactico.append("\nError Falta Delimitador ->"+" (");
                    }
                }else{
                    areasintactico.append("Error Falta palabra reservada ->"+" For");
                }

            }

        }

    }//GEN-LAST:event_btnsintacticoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ingresadosnum=0;ingresadospuntocoma=0;ingresadosigual=0;ingresadosletras=0;ingresadosint=0;ingresadosllavesabrir=0;ingresadosllavescerrar=0;
        vaif=0;vaelse=0;vaabreparentesis=0;vacierraparentesis=0;vavariablepalabra=0;vadelimitador=0;varianum1=0;vastring=0;
        vaif=0;vaelse=0;vaabreparentesis=0;vacierraparentesis=0;ingresadosletras=0;vavariablepalabra=0;vadelimitador=0;varianum1=0;
        ingresadosnum=0;ingresadospuntocoma=0;ingresadosllavesabrir=0;ingresadosllavescerrar=0;vectorllavesabrir[0]=0;ingresadosigual=0;
        vectorllavesabrir[1]=0;vectorllavescerrar[0]=0;vectorllavescerrar[1]=0;ingresadosint=0;vectorin[0]=0;vectorin[1]=0;vectornum[0]=0;
        vectornum[1]=0;vectorpuntocoma[0]=0;vectorpuntocoma[1]=0;vawhile=0;vafor=0;vai=0;vasu=0;vastring=0;
        vawhile=0;vafor=0;vai=0;vasu=0;
        areacadena.setText("");
        areasintactico.setText("");
        areacadena.requestFocus();
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        for (int i = 0; i < tabla.getRowCount(); i++) {
            modelo.removeRow(i);
            i-=1;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnlexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlexicoActionPerformed
        try {
            btnsintactico.setEnabled(true);//Habilita el boton Analizador sintactico
            verificar=1;
            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
            Object[] fila=new Object[3];
            String cadena=("(while|for|int|if|else|public|static|private|String|Double|println|boolean|char|class|this|void|return|System|do)|([a-zA-Z]+)|([0-9]+)|([{|}|>|<|==|=|-|+|/|*|;|.|,|(|)])");
            Pattern p=Pattern.compile(cadena);
            Matcher matcher= p.matcher(areacadena.getText());
            while(matcher.find()){
                String token1=matcher.group(1);
                if (token1 !=null) {
                    if (LS.BuscarNom(token1)==1) {
                        if (LS.BuscarID(token1)==9) {
                            vaif=9;
                            validar=1;
                        }
                        if (LS.BuscarID(token1)==2) {
                            validar=2;
                            vawhile=LS.BuscarID(token1);
                        }
                        if (LS.BuscarID(token1)==6) {
                            vafor=LS.BuscarID(token1);
                            validar=3;
                        }
                        if (LS.BuscarID(token1)==10) {
                            vaelse=10;
                        }

                        if (LS.BuscarID(token1)==8) {
                            vastring=8;
                        }

                        if (LS.BuscarID(token1)==1) {
                            vectorin[ingresadosint]= LS.BuscarID(token1);
                            ingresadosint++;
                        }

                        if (LS.BuscarID(token1)==10) {
                            vaelse=10;
                        }

                        fila[0]=LS.BuscarID(token1);
                        fila[1]=token1;
                        fila[2]="PALABRA RESERVADA";
                        modelo.addRow(fila);
                    }else{
                        codigo++;
                        fila[0]=codigo;
                        fila[1]=token1;
                        fila[2]="PALABRA RESERVADA";
                        modelo.addRow(fila);
                        tabla.setModel(modelo);
                        Tablasimbolosreservada r=new Tablasimbolosreservada(codigo, token1,"PALABRA RESERVADA");
                        LS.agregar(r);
                        Globales.Grabarreservada();
                    }

                }

                String token2=matcher.group(2);
                if (token2 !=null) {
                    if (LU.BuscarNom(token2)==1) {
                        if (LU.BuscarID(token2)>99 & LU.BuscarID(token2)<126) {
                            vectorletra[ingresadosletras]=LU.BuscarID(token2);
                            ingresadosletras++;
                        }
                        if (LU.BuscarID(token2)>125) {
                            vavariablepalabra=LU.BuscarID(token2);
                        }
                        if (LU.BuscarID(token2)==108) {
                            vai=108;
                        }
                        fila[0]=LU.BuscarID(token2);
                        fila[1]=token2;
                        fila[2]="VARIABLE";
                        modelo.addRow(fila);
                    }else{
                        codigova++;
                        vavariablepalabra=codigova;
                        fila[0]=codigova;
                        fila[1]=token2;
                        fila[2]="VARIABLE";
                        modelo.addRow(fila);
                        tabla.setModel(modelo);
                        Tablasimbolos s=new Tablasimbolos(codigova, token2,"VARIABLE");
                        LU.agregar(s);
                        Globales.GrabarVariables();
                    }
                }

                String token3=matcher.group(3);
                if (token3 !=null) {
                    if (LNU.BuscarNom(token3)==1) {
                        if (LNU.BuscarID(token3)>2018 & LNU.BuscarID(token3)<3000) {
                            varianum1=LNU.BuscarID(token3);
                        }

                        if (LNU.BuscarID(token3)>1999 & LNU.BuscarID(token3)<2019) {
                            vectornum[ingresadosnum]=LNU.BuscarID(token3);
                            ingresadosnum++;
                        }

                        fila[0]=LNU.BuscarID(token3);
                        fila[1]=token3;
                        fila[2]="NUMEROS";
                        modelo.addRow(fila);
                    }else{
                        codigonu++;
                        fila[0]=codigonu;
                        fila[1]=token3;
                        fila[2]="NUMEROS";
                        modelo.addRow(fila);
                        tabla.setModel(modelo);
                        Tablanumeros n=new Tablanumeros(codigonu, token3,"NUMEROS");
                        LNU.agregar(n);
                        Globales.Grabarnu();
                    }
                }

                String token4=matcher.group(4);
                if (token4 !=null) {
                    if (LL.BuscarNom(token4)==1) {
                        if (LL.BuscarID(token4)==1003) {
                            vaabreparentesis=1003;
                        }

                        if (LL.BuscarID(token4)==1004) {
                            vacierraparentesis=1004;
                        }

                        if (LL.BuscarID(token4)==1014) {
                            vectorllavesabrir[ingresadosllavesabrir]=LL.BuscarID(token4);
                            ingresadosllavesabrir++;
                        }

                        if (LL.BuscarID(token4)==1013) {
                            vectorllavescerrar[ingresadosllavescerrar]=LL.BuscarID(token4);
                            ingresadosllavescerrar++;
                        }

                        if (LL.BuscarID(token4)==1006) {
                            vectorigual[ingresadosigual]=LL.BuscarID(token4);
                            ingresadosigual++;
                        }

                        if (LL.BuscarID(token4)==1000) {
                            vectorpuntocoma[ingresadospuntocoma]=LL.BuscarID(token4);
                            ingresadospuntocoma++;
                        }

                        if (LL.BuscarID(token4)==1019) {
                            vasu=1019;
                        }

                        if (LL.BuscarID(token4)==1007 || LL.BuscarID(token4)==1008 || LL.BuscarID(token4)==1011) {

                            vadelimitador=LL.BuscarID(token4);
                        }
                        fila[0]=LL.BuscarID(token4);
                        fila[1]=token4;
                        fila[2]="DELIMITADORES";
                        modelo.addRow(fila);
                    }else{
                        codigode++;
                        fila[0]=codigode;
                        fila[1]=token4;
                        fila[2]="DELIMITADORES";
                        modelo.addRow(fila);
                        tabla.setModel(modelo);
                        Tabladelimitadores d=new Tabladelimitadores(codigode, token4,"DELIMITADORES");
                        LL.agregar(d);
                        Globales.Grabardelimitadores();
                    }
                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnlexicoActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    //Reajustar imagenes
    private void pintarImagen(JLabel im, String ruta){
        this.imagen=new ImageIcon(ruta);
        this.icono=new ImageIcon(this.imagen.getImage().getScaledInstance(
                im.getWidth(),
                im.getHeight(),
                Image.SCALE_DEFAULT
            ) 
        );
        im.setIcon(this.icono);
        this.repaint();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel P1;
    private javax.swing.JPanel P2;
    private javax.swing.JPanel P3;
    private javax.swing.JTextArea areacadena;
    private javax.swing.JTextArea areasintactico;
    private javax.swing.JPanel b1;
    private javax.swing.JPanel b2;
    private javax.swing.JPanel b3;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnlexico;
    private javax.swing.JButton btnsintactico;
    private javax.swing.JPanel head2;
    private javax.swing.JLabel im1;
    private javax.swing.JLabel im2;
    private javax.swing.JLabel im3;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel maximizar;
    private javax.swing.JPanel miminizar;
    private javax.swing.JPanel salir;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
    
    class RoundedPanel extends JPanel
    {
        private Color backgroundColor;
        private int cornerRadius = 15;
        public RoundedPanel(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
        }
        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;
            
        }
        public RoundedPanel(int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            //Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
//            graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
//             
        }
    }

}
