/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbtis.proyecto_fisica.src.packageFrames;


import java.awt.Color;
import java.util.Random;
import packageDatosProblemas.ProblemasDistancia;
import packageDatosProblemas.ProblemasRapidez;
import packageDatosProblemas.ProblemasTiempo;

/**
 *
 * @author Angel Armando Valay Martinez
 */
public class IndexFrame extends javax.swing.JFrame {

    static ProblemasDistancia[] pd= new ProblemasDistancia[5];  
    static ProblemasRapidez[] prs= new ProblemasRapidez[5];   
    static ProblemasTiempo[] pts= new ProblemasTiempo[3];
    Random randomGenerator = new Random();
    int randomInt;    
    public IndexFrame() {
        pd[0]= new ProblemasDistancia("Una persona camina a 2m/s. \n"
                + "Calcula la distancia que recorre en 15 segundos.",30,"m", (float) 15,"seg",2,"m/s");
        pd[1]= new ProblemasDistancia("Calcula los metros que recorre un "
                + "ciclista en 30 segundos si va a una velocidad de 10m/s", 300, "m", 30, "seg", 10, "m/s");
        pd[2]= new ProblemasDistancia("Un corredor de pista lleva un "
                + "ritmo constante de 5 m/s y tarda 1 minuto y 2 segundos en " +
                "dar la vuelta al estadio. \n¿ Cuál es la longitud de la pista?", 310, "m", 62, "seg", 5, "m/s");
        pd[3]= new ProblemasDistancia("Un coche de juguete tarda 5 segundos en recorrer una cierta"
                + " distancia con una velocidad de 0.2m/s. \n Determina la distancia que"
                + " recorrio el coche.", 12,"m", 5, "seg", (float) 0.2, "m/s");
        pd[4]= new ProblemasDistancia("Determina la distancia que recorre un caballo "
                + "en 30 segundos, que tiene una velocidad de 2m/s.", 60, "m", 30, "seg", 2, "m/s");
        prs[0]= new ProblemasRapidez("Un automovilista recorre 180 km en 2 horas. \n"
                + "Calcula su velocidad en el viaje.", 180, "km", 2, "hr", 25, "m/s");
        prs[1]= new ProblemasRapidez("¿ Qué velocidad lleva un ciclista que "
                + "recorre 12 metros cada segundo?.", 12, "m", 1, "seg", 12,"m/s");
        prs[2]= new ProblemasRapidez("Un coche de juguete tarda 5 segundos en "
                + "recorrer 1 metro.", 1, "m", 5, "seg", (float) 0.2, "m/s");
        prs[3]= new ProblemasRapidez("Calcula la velocidad de un atleta que "
                + "recorre 100 m en 10 segundos.", 100, "m", 10, "seg", 10, "m/s");
        prs[4]= new ProblemasRapidez("Un móvil con movimiento uniforme recorre 120 m en "
                + "15 s. ¿ Cuál es su velocidad?.", 120, "m", 15, "seg", 8, "m/s");
        pts[0]= new ProblemasTiempo(" ¿Cuánto tiempo en segundos tarda un atleta "
                + "en recorrer 100 metros, si lleva una velocidad de 10 m/s? ", 100, "m", 10, "seg", 10, "m/s");
        pts[1]= new ProblemasTiempo("Si un avión se desplaza a una velocidad de 450 km/h.\n "
                + "¿Cuánto tiempo en horas tarda en recorrer 2400 km? ", 2400, "km", (float) 5.33, "hr", 450, "km/h");
        pts[2]= new ProblemasTiempo("Si un avión se desplaza a una velocidad de 400 km/h.\n "
                + "¿Cuánto tiempo tarda en recorrer 200 m? ", (float)0.2, "km", (float)0.0005, "hr", 400, "km/h");
        initComponents();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.white);
        this.cerrarApp.setBackground(Color.white);
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTiempo = new javax.swing.JButton();
        btnDistancia = new javax.swing.JButton();
        btnRapidez = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cerrarApp = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(Color.getColor("#263238")
        );
        setFocusable(false);
        setFocusableWindowState(false);
        setUndecorated(true);

        btnTiempo.setBackground(Color.white);
        btnTiempo.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        btnTiempo.setForeground(Color.decode("#263238")
        );
        btnTiempo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/reloj-de-arena.png"))); // NOI18N
        btnTiempo.setText("Tiempo");
        btnTiempo.setBorderPainted(false);
        btnTiempo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTiempo.setDefaultCapable(false);
        btnTiempo.setFocusPainted(false);
        btnTiempo.setFocusable(false);
        btnTiempo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTiempoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTiempoMouseExited(evt);
            }
        });
        btnTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiempoActionPerformed(evt);
            }
        });

        btnDistancia.setBackground(Color.white
        );
        btnDistancia.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        btnDistancia.setForeground(Color.decode("#263238"));
        btnDistancia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/distancia.png"))); // NOI18N
        btnDistancia.setText("Distancia");
        btnDistancia.setBorderPainted(false);
        btnDistancia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDistancia.setDefaultCapable(false);
        btnDistancia.setFocusPainted(false);
        btnDistancia.setFocusable(false);
        btnDistancia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDistanciaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDistanciaMouseExited(evt);
            }
        });
        btnDistancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDistanciaActionPerformed(evt);
            }
        });

        btnRapidez.setBackground(Color.white);
        btnRapidez.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        btnRapidez.setForeground(Color.decode("#263238"));
        btnRapidez.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/salpicadero.png"))); // NOI18N
        btnRapidez.setText("Velocidad");
        btnRapidez.setBorderPainted(false);
        btnRapidez.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRapidez.setDefaultCapable(false);
        btnRapidez.setFocusPainted(false);
        btnRapidez.setFocusable(false);
        btnRapidez.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRapidezMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRapidezMouseExited(evt);
            }
        });
        btnRapidez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapidezActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 48)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/movimiento.gif"))); // NOI18N

        cerrarApp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/marca-de-la-cruz-sobre-un-fondo-negro-de-circulo.png"))); // NOI18N
        cerrarApp.setBorderPainted(false);
        cerrarApp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrarApp.setDefaultCapable(false);
        cerrarApp.setFocusable(false);
        cerrarApp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrarAppMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrarAppMouseExited(evt);
            }
        });
        cerrarApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarAppActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Movimiento Rectilíneo Uniforme (MRU)");

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel4.setText("Cerrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnRapidez, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cerrarApp))
                    .addComponent(btnDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(414, 414, 414)
                .addComponent(btnTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRapidez)
                            .addComponent(btnDistancia)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cerrarApp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTiempo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTiempoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiempoMouseEntered
        //Evento para capturar el mouse cuando el cursor esta sobre el objecto
        btnTiempo.setBackground(Color.decode("#263238"));
        btnTiempo.setForeground(this.getContentPane().getBackground());
    }//GEN-LAST:event_btnTiempoMouseEntered

    private void btnTiempoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiempoMouseExited
        // TODO add your handling code here:
        btnTiempo.setBackground(this.getContentPane().getBackground());
        btnTiempo.setForeground(Color.decode("#263238"));
    }//GEN-LAST:event_btnTiempoMouseExited

    private void btnDistanciaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDistanciaMouseExited
        // TODO add your handling code here:
        btnDistancia.setForeground(Color.decode("#263238"));
        btnDistancia.setBackground(this.getContentPane().getBackground());
    }//GEN-LAST:event_btnDistanciaMouseExited

    private void btnDistanciaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDistanciaMouseEntered
        // TODO add your handling code here:
        btnDistancia.setBackground(Color.decode("#263238"));
        btnDistancia.setForeground(this.getContentPane().getBackground());
    }//GEN-LAST:event_btnDistanciaMouseEntered

    private void btnRapidezMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRapidezMouseEntered
        // TODO add your handling code here:
        btnRapidez.setBackground(Color.decode("#263238"));
        btnRapidez.setForeground(this.getContentPane().getBackground());
    }//GEN-LAST:event_btnRapidezMouseEntered

    private void btnRapidezMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRapidezMouseExited
        // TODO add your handling code here:
        btnRapidez.setBackground(this.getContentPane().getBackground());
        btnRapidez.setForeground(Color.decode("#263238"));
    }//GEN-LAST:event_btnRapidezMouseExited

    private void cerrarAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarAppActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cerrarAppActionPerformed

    private void btnTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiempoActionPerformed
        randomInt = randomGenerator.nextInt(2);
        packageFrames.EjerciciosFrame ef = new packageFrames.EjerciciosFrame(pts[randomInt]);
        ef.show();
        this.dispose();
    }//GEN-LAST:event_btnTiempoActionPerformed

    private void btnRapidezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapidezActionPerformed
        randomInt = randomGenerator.nextInt(5);
        packageFrames.EjerciciosFrame ef = new packageFrames.EjerciciosFrame(prs[randomInt]);
        ef.show();
        this.dispose();
    }//GEN-LAST:event_btnRapidezActionPerformed

    private void btnDistanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDistanciaActionPerformed
        randomInt = randomGenerator.nextInt(5);
        packageFrames.EjerciciosFrame ef = new packageFrames.EjerciciosFrame(pd[randomInt]);
        ef.show();
        this.dispose();
    }//GEN-LAST:event_btnDistanciaActionPerformed

    private void cerrarAppMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarAppMouseEntered
        // TODO add your handling code here:
        this.cerrarApp.setBackground(Color.decode("#B0BEC5"));
    }//GEN-LAST:event_cerrarAppMouseEntered

    private void cerrarAppMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarAppMouseExited
        // TODO add your handling code here:
        this.cerrarApp.setBackground(Color.white);
    }//GEN-LAST:event_cerrarAppMouseExited

    
    
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDistancia;
    private javax.swing.JButton btnRapidez;
    private javax.swing.JButton btnTiempo;
    private javax.swing.JButton cerrarApp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
