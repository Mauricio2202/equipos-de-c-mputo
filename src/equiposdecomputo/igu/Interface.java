
package equiposdecomputo.igu;
import equiposdecomputo.model.Model;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Interface extends javax.swing.JFrame {
    private Model model;
    
    Image addUser = Toolkit.getDefaultToolkit().createImage("D:\\Java\\NetbeansProjects\\EquiposDeComputo\\src\\equiposdecomputo\\igu\\adduser.png");
    Image monitor = Toolkit.getDefaultToolkit().createImage("D:\\Java\\NetbeansProjects\\EquiposDeComputo\\src\\equiposdecomputo\\igu\\iconMonitor.png");
    
    Image tarjeta = Toolkit.getDefaultToolkit().createImage("D:\\Java\\NetbeansProjects\\EquiposDeComputo\\src\\equiposdecomputo\\igu\\iconTarjeta.png");
    Image efectivo = Toolkit.getDefaultToolkit().createImage("D:\\Java\\NetbeansProjects\\EquiposDeComputo\\src\\equiposdecomputo\\igu\\iconEfectivo.png");
    
    Image userIcon = Toolkit.getDefaultToolkit().createImage("D:\\Java\\NetbeansProjects\\EquiposDeComputo\\src\\equiposdecomputo\\igu\\userIcon.png");
    Image offline = Toolkit.getDefaultToolkit().createImage("D:\\Java\\NetbeansProjects\\EquiposDeComputo\\src\\equiposdecomputo\\igu\\offline.png");

    Image greenMachine = Toolkit.getDefaultToolkit().createImage("D:\\Java\\NetbeansProjects\\EquiposDeComputo\\src\\equiposdecomputo\\igu\\machineGreen.png");
    Image redMachine = Toolkit.getDefaultToolkit().createImage("D:\\Java\\NetbeansProjects\\EquiposDeComputo\\src\\equiposdecomputo\\igu\\machineRed.png");
    
    private Timer timer;
    private int secondsElapsed = 0;
    private int totalCosto = 0;
    
    
    public Interface() {
        initComponents();
        this.model = model;
        this.setLocationRelativeTo(this);
        this.cmbMachine.addItem("Asignar Máquina");
        this.cmbMachine.addItem("Máquina 1");
        this.cmbMachine.addItem("Máquina 2");
        this.cmbMachine.addItem("Máquina 3");
        this.cmbMachine.addItem("Máquina 4");
        this.cmbMachine.addItem("Máquina 5");
        
        addUser = addUser.getScaledInstance(76, 76, 1);
        monitor = monitor.getScaledInstance(58, 58, 1);
        
        tarjeta = tarjeta.getScaledInstance(33, 31, 1);
        efectivo = efectivo.getScaledInstance(33, 31, 1);
        
        userIcon = userIcon.getScaledInstance(72, 76, 1);
        offline = offline.getScaledInstance(71, 74, 1);
        
        greenMachine = greenMachine.getScaledInstance(62, 60, 1);
        redMachine = redMachine.getScaledInstance(62, 59, 1);
        
        this.lblIcon.setIcon(new ImageIcon(addUser));
        this.lblIconPc.setIcon(new ImageIcon(monitor));
        
        this.lblTarjeta.setIcon(new ImageIcon(tarjeta));
        this.lblEfectivo.setIcon(new ImageIcon(efectivo));
        
        this.lblConectado.setIcon(new ImageIcon(userIcon));
        this.lblDesconectado.setIcon(new ImageIcon(offline));
        
        this.lblConnect.setIcon(new ImageIcon(greenMachine));
        this.lblDissconect.setIcon(new ImageIcon(redMachine));
        
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblIcon = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        cmbMachine = new javax.swing.JComboBox<>();
        lblIconPc = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblTarjeta = new javax.swing.JLabel();
        lblEfectivo = new javax.swing.JLabel();
        btnTarjeta = new javax.swing.JButton();
        btnEfectivo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblConectado = new javax.swing.JLabel();
        lblConnect = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        bar1 = new javax.swing.JProgressBar();
        btnTermine = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        pswNumTarjeta = new javax.swing.JPasswordField();
        txtName = new javax.swing.JTextField();
        txtCVV = new javax.swing.JTextField();
        txtMMAA = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblPago = new javax.swing.JLabel();
        lblCambio = new javax.swing.JLabel();
        btnPagar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblDissconect = new javax.swing.JLabel();
        lblDesconectado = new javax.swing.JLabel();
        lblTime1 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(148, 43, 59));

        jPanel1.setBackground(new java.awt.Color(53, 54, 82));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Administración de Asignaciones a Equipos"));

        lblIcon.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(29, 57, 88)));

        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });

        lblIconPc.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("UD. debe: $");

        lblCargo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblCargo.setForeground(new java.awt.Color(255, 0, 102));

        jButton1.setBackground(new java.awt.Color(76, 51, 77));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Iniciar Tiempo");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(76, 51, 77));
        jButton2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Finalizar Tiempo");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lblTarjeta.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        lblEfectivo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        btnTarjeta.setText("Tarjeta");
        btnTarjeta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTarjetaActionPerformed(evt);
            }
        });

        btnEfectivo.setText("Efectivo");
        btnEfectivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre)
                                    .addComponent(cmbMachine, 0, 284, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblIconPc, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 236, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                            .addComponent(lblEfectivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIconPc, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(14, 14, 14)
                            .addComponent(cmbMachine))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTarjeta))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEfectivo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(100, 48, 71));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuario Conectado"));

        lblConectado.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(100, 48, 71)));

        lblConnect.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTime.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTime.setForeground(new java.awt.Color(51, 204, 0));
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnTermine.setBackground(new java.awt.Color(124, 46, 65));
        btnTermine.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnTermine.setForeground(new java.awt.Color(204, 204, 204));
        btnTermine.setText("Terminé");
        btnTermine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTermine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTermineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblConectado, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(lblConnect, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(bar1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnTermine, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblConectado, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConnect, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bar1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTermine, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(195, 37, 48));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Status de Pago"));

        pswNumTarjeta.setText("jPasswordField1");

        txtName.setText("Nombre completo");

        txtCVV.setText("CVV");

        txtMMAA.setText("MM/AA");

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Su pago gracias:");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Su cambio:");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Hasta Pronto...");

        lblPago.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPago.setForeground(new java.awt.Color(0, 0, 0));
        lblPago.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPago.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(195, 37, 48)));

        lblCambio.setForeground(new java.awt.Color(0, 0, 0));
        lblCambio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCambio.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(195, 37, 48)));

        btnPagar.setBackground(new java.awt.Color(109, 18, 98));
        btnPagar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnPagar.setForeground(new java.awt.Color(255, 255, 255));
        btnPagar.setText("Pagar");
        btnPagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtName)
                    .addComponent(pswNumTarjeta)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtCVV, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMMAA, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                    .addComponent(btnPagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(124, 124, 124)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPago, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(lblCambio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pswNumTarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCambio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCVV, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMMAA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel4.setBackground(new java.awt.Color(5, 60, 94));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuario Desconectado"));

        lblDissconect.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblDesconectado.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(5, 60, 94)));

        lblTime1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTime1.setForeground(new java.awt.Color(51, 204, 0));
        lblTime1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton6.setBackground(new java.awt.Color(29, 57, 88));
        jButton6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(204, 204, 204));
        jButton6.setText("Terminé");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDesconectado, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTime1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDissconect, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDesconectado, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDissconect, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusGained
    }//GEN-LAST:event_txtNombreFocusGained

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
    }//GEN-LAST:event_txtNombreFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nombreUsuario = txtNombre.getText();
        String maquinaSeleccionada = (String) cmbMachine.getSelectedItem();

    if (nombreUsuario.isEmpty() || maquinaSeleccionada == null) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese un nombre y seleccione una máquina.");
        return;
    }
    
    lblTime.setText("00:00:00");
    bar1.setValue(0); 
    btnTermine.setEnabled(true);
    
    timer = new Timer(1000, new ActionListener() { // Actualiza cada segundo
        @Override
        public void actionPerformed(ActionEvent e) {
            secondsElapsed++;
            int hours = secondsElapsed / 3600;
            int minutes = (secondsElapsed % 3600) / 60;
            int seconds = secondsElapsed % 60;
            
            lblTime.setText(String.format("%02d:%02d:%02d", hours, minutes, seconds));
            
            bar1.setValue(secondsElapsed);
        }
    });
    
    timer.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnTermineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTermineActionPerformed
       if (timer != null) {
        timer.stop();
    }

    int totalMinutes = secondsElapsed / 60; 
    int costoPorMinuto = 100;
    int costoTotal = totalMinutes * costoPorMinuto;

    lblCargo.setText(costoTotal + ".-");
    this.lblPago.setText(costoTotal + "");
        
    btnTarjeta.setEnabled(true);
    btnEfectivo.setEnabled(true);
    }//GEN-LAST:event_btnTermineActionPerformed

    private void btnTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTarjetaActionPerformed
        if (totalCosto <= 0) {
        JOptionPane.showMessageDialog(this, "Por favor, calcule el costo presionando 'Terminé' primero.");
        return;
    }

    String numeroTarjeta = pswNumTarjeta.getText();
    String nombreCompleto = txtName.getText();
    String cvv = txtCVV.getText();
    String fechaExpiracion = txtMMAA.getText();
    
    if (numeroTarjeta.isEmpty() || nombreCompleto.isEmpty() || cvv.isEmpty() || fechaExpiracion.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los datos de la tarjeta.");
        return;
    }

    if (numeroTarjeta.length() != 16 || cvv.length() != 3) {
        JOptionPane.showMessageDialog(this, "Datos de la tarjeta no válidos.");
        return;
    }

    lblCambio.setText("Su cambio: $0"); 

    btnTarjeta.setEnabled(false);
    btnEfectivo.setEnabled(false);

    JOptionPane.showMessageDialog(this, "Pago realizado con éxito con tarjeta. Gracias.");
    }//GEN-LAST:event_btnTarjetaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int opc = this.cmbMachine.getSelectedIndex();
        int totalMinutes = secondsElapsed / 60; 
        int costoPorMinuto = 100;
        int costoTotal = totalMinutes * costoPorMinuto;

        if (opc == 1) {
            if (timer != null) {
                timer.stop();
            }
            JOptionPane.showMessageDialog(this, "Ha dado fin al tiempo de la máquina 1");
            lblCargo.setText(costoTotal + ".-");
            this.lblPago.setText(costoTotal + "");
        }
        if (opc == 2) {
            if (timer != null) {
                timer.stop();
            }
            JOptionPane.showMessageDialog(this, "Ha dado fin al tiempo de la máquina 2");
            lblCargo.setText(costoTotal + ".-");
            this.lblPago.setText(costoTotal + "");
        }
        if (opc == 3) {
            if (timer != null) {
                timer.stop();
            }
            JOptionPane.showMessageDialog(this, "Ha dado fin al tiempo de la máquina 3");
            lblCargo.setText(costoTotal + ".-");
            this.lblPago.setText(costoTotal + "");
        }
        if (opc == 4) {
            if (timer != null) {
                timer.stop();
            }
            JOptionPane.showMessageDialog(this, "Ha dado fin al tiempo de la máquina 4");
            lblCargo.setText(costoTotal + ".-");
            this.lblPago.setText(costoTotal + "");
        }
        if (opc == 5) {
            if (timer != null) {
                timer.stop();
            }
            JOptionPane.showMessageDialog(this, "Ha dado fin al tiempo de la máquina 5");
            lblCargo.setText(costoTotal + ".-");
            this.lblPago.setText(costoTotal + "");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        this.lblPago.setText(this.lblCargo.getText() + "Pagado");
        this.lblCambio.setText("No hay cambio cuando es tarjeta");
        JOptionPane.showMessageDialog(this, "Ha dado fin al tiempo de la máquina 5");
        
    }//GEN-LAST:event_btnPagarActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar bar1;
    private javax.swing.JButton btnEfectivo;
    private javax.swing.JButton btnPagar;
    public javax.swing.JButton btnTarjeta;
    public javax.swing.JButton btnTermine;
    private javax.swing.JComboBox<String> cmbMachine;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JProgressBar jProgressBar2;
    public javax.swing.JLabel lblCambio;
    public javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblConectado;
    private javax.swing.JLabel lblConnect;
    private javax.swing.JLabel lblDesconectado;
    private javax.swing.JLabel lblDissconect;
    private javax.swing.JLabel lblEfectivo;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblIconPc;
    public javax.swing.JLabel lblPago;
    private javax.swing.JLabel lblTarjeta;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTime1;
    public javax.swing.JPasswordField pswNumTarjeta;
    private javax.swing.JTextField txtCVV;
    private javax.swing.JTextField txtMMAA;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
