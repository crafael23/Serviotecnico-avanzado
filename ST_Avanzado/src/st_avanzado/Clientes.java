
package st_avanzado;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;

public class Clientes extends javax.swing.JFrame {
    
    int seleccion;
    
    public Clientes() {
        
        initComponents();
        
    }
    private Connection getConection(){
        Connection cnx=null;        
        try{
            String password= "NimbuS-pc131";
            String user= "root";
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url;
            url = "jdbc:mysql://localhost:3306/db_tecnicoServicio?allowMultiQueries=true";  // esto simplemente hace una conexion con 
            cnx= DriverManager.getConnection(url,user,password);                            // la base de datos
        }catch(ClassNotFoundException e){                                                   // entonces todas estas lineas se pueden
           JOptionPane.showMessageDialog(rootPane, e.getMessage());                         // copiar a todos los otros frames
        } catch (SQLException ex) {                                                         // o hacer una clase Solo para este metodo
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);         // para llamar este metodo en las otras
        }                                                                                   // clases de Jframe
        return cnx;   
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoPlan = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        F_TXT = new javax.swing.JTextField();
        F_contacto = new javax.swing.JTextField();
        F_telefono = new javax.swing.JTextField();
        F_direccion = new javax.swing.JTextField();
        F_nombre = new javax.swing.JTextField();
        F_valorservicio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Nivel1 = new javax.swing.JRadioButton();
        Nivel2 = new javax.swing.JRadioButton();
        Nivel3 = new javax.swing.JRadioButton();
        Nivel4 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        BTNagr = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        Botton_Bloqueo = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CLIENTES");

        jLabel2.setText("Nombre: ");

        jLabel3.setText("Nombre de contacto: ");

        jLabel4.setText("Teléfono: ");

        jLabel5.setText("Dirección: ");

        F_TXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_TXTActionPerformed(evt);
            }
        });

        F_contacto.setEditable(false);
        F_contacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_contactoActionPerformed(evt);
            }
        });

        F_telefono.setEditable(false);
        F_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_telefonoActionPerformed(evt);
            }
        });

        F_direccion.setEditable(false);
        F_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_direccionActionPerformed(evt);
            }
        });

        F_nombre.setEditable(false);
        F_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_nombreActionPerformed(evt);
            }
        });

        F_valorservicio.setEditable(false);
        F_valorservicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_valorservicioActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("NIVEL DE SERVICIO");

        GrupoPlan.add(Nivel1);
        Nivel1.setText("Plan Básico");
        Nivel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Nivel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlanEvento(evt);
            }
        });

        GrupoPlan.add(Nivel2);
        Nivel2.setText("Plan Intermedio");
        Nivel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Nivel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlanEvento(evt);
            }
        });

        GrupoPlan.add(Nivel3);
        Nivel3.setText("Plan Avanzado");
        Nivel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Nivel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlanEvento(evt);
            }
        });

        GrupoPlan.add(Nivel4);
        Nivel4.setText("Plan Premium");
        Nivel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Nivel4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlanEvento(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Valor del servicio:");

        jLabel8.setText("ID: ");

        jButton1.setText("...");
        jButton1.setMaximumSize(new java.awt.Dimension(289, 265));
        jButton1.setMinimumSize(new java.awt.Dimension(289, 265));
        jButton1.setPreferredSize(new java.awt.Dimension(289, 265));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        BTNagr.setText("+");
        BTNagr.setMaximumSize(new java.awt.Dimension(289, 265));
        BTNagr.setMinimumSize(new java.awt.Dimension(289, 265));
        BTNagr.setPreferredSize(new java.awt.Dimension(289, 265));
        BTNagr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNagrActionPerformed(evt);
            }
        });

        jButton4.setText("-");
        jButton4.setMaximumSize(new java.awt.Dimension(289, 265));
        jButton4.setMinimumSize(new java.awt.Dimension(289, 265));
        jButton4.setPreferredSize(new java.awt.Dimension(289, 265));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("GUARDAR CAMBIOS");
        jButton5.setEnabled(false);
        jButton5.setMaximumSize(new java.awt.Dimension(289, 265));
        jButton5.setMinimumSize(new java.awt.Dimension(289, 265));
        jButton5.setPreferredSize(new java.awt.Dimension(289, 265));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("SALIR");
        jButton6.setMaximumSize(new java.awt.Dimension(289, 265));
        jButton6.setMinimumSize(new java.awt.Dimension(289, 265));
        jButton6.setPreferredSize(new java.awt.Dimension(289, 265));

        Botton_Bloqueo.setText("Desbloquear");
        Botton_Bloqueo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botton_BloqueoActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F_contacto))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F_telefono))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F_direccion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nivel1)
                            .addComponent(Nivel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Nivel2)
                                    .addComponent(Nivel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(F_valorservicio, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F_TXT, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Botton_Bloqueo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BTNagr, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(F_TXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNagr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton_Bloqueo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(F_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(F_contacto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(F_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(F_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F_valorservicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nivel1)
                        .addGap(0, 0, 0)
                        .addComponent(Nivel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nivel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nivel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Limpiar(){
            F_TXT.setText("");
            F_contacto.setText("");
            F_direccion.setText("");
            F_nombre.setText("");
            F_telefono.setText("");
            F_valorservicio.setText("");
            GrupoPlan.clearSelection();
            
        
    }
    
    private void F_TXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_TXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F_TXTActionPerformed

    private void F_contactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_contactoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F_contactoActionPerformed

    private void F_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F_telefonoActionPerformed

    private void F_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F_direccionActionPerformed

    private void F_valorservicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_valorservicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F_valorservicioActionPerformed

    private void F_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F_nombreActionPerformed

    private void BTNagrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNagrActionPerformed
               
        
       
        // esto es solamente para insertar un nuevo perfil de cliente
        try{
            PreparedStatement  stm= getConection().prepareStatement("insert into cliente values(?,?,?,?,?,?,?,?,?,?)"); //hace un prepared statement donde cada ? es una posicion dond se hace la conexion la base
            // stm.setTipodedato(posicion de la ? , dato a ingresar)
            stm.setInt(1, Integer.parseInt(F_TXT.getText())); 
            stm.setString(2, F_nombre.getText());           
            stm.setString(3, F_contacto.getText());              // estas lineas simplemente sacan los datos que estan ingresados en los
            stm.setInt(4,Integer.parseInt(F_telefono.getText()));// cuadros de texto en el Jframe
            stm.setInt(5, seleccion);
            
            Statement Stm2= getConection().createStatement();
            String query= "select * from `nivel de servicio` where ID_Nivel_servicio ="+seleccion;// acordate que seleccion es el nivel que se eligio en el combo button, se inicializo en la linea17 y se modifica con el void Planevento
            ResultSet rs= Stm2.executeQuery(query);     //este grupo de lineas ejecuta el query para sacar la lista de datos en la tabla NivelServicio
            rs.next(); //esto solo se hace porque empieza en la posicion0, rs es un objeto tipo Result set, osea que rs es lo que devuelve el query
            stm.setInt(6,rs.getInt(3));              // ingresa horas de atencion sacadas de la tabla nivel de servicio    
            
            int numero;
            numero=rs.getInt(8);
            String s= String.valueOf(numero);
            F_valorservicio.setText(s);
            
            stm.setFloat(7,0);// ingresa el dato numero 7 que seria horas de atencion usadas
            
            Statement Stm3= getConection().createStatement(); //hacemos otra conexion para un otro statement
            query= "select * from `tecnicos_lista` where Tecnico_nivelservicio = "+ seleccion+ " and Tecnico_NumC < 3";// el query que se va a ejecutar.
            rs= Stm3.executeQuery(query);// se ejecuta el query y se guarda en el result set
            rs.next();// se hace el next porque empieza en 0
            
            if(rs.getRow()==0){ //el if revisa si el row sigue en 0, si sigue en 0 significa que esta vacio por lo que no hay datos donde Tecnico_NumC sea menor a 3, osea los tecnicos ya tienen 3 clientes
                JOptionPane.showMessageDialog(rootPane,"No hay tecnicos de este nivel para asignar");
                return;
            }else{ //si no es 0 simplemente se jalan y meten los datos
                int i=rs.getInt(4); // se saca el int en la posicion 4 del query en tecnicos_lista que seria numero de clientes
                stm.setInt(8, rs.getInt(1));// como el primer tecnico de la lista tiene menos de 3 clientes asignados simplemente se ingresa el id al statment 1 effectivamente guardandolo en la posicion 8(tecnicoID) de la tabla cliente
                i++; // El numero de clientes del tecnico aumenta en uno
                Stm3.executeUpdate("update tecnicos_lista set Tecnico_NumC = "+i+" where ID_Tecnico= "+rs.getInt(1)); //hace update al numero de clientes del tecnico
            }
            
            stm.setString(9, F_direccion.getText()); //saca la direccion del Jtext 
            stm.setFloat(10,0); //0 porque no ha usado inguna hora extra   
            stm.executeUpdate(); //y  se ejecuta el update de el PREPARED STATMENT
            
         
        }catch(Exception e){
           JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        
        
        
    }//GEN-LAST:event_BTNagrActionPerformed

    private void PlanEvento(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlanEvento

        String ID= evt.getActionCommand();
        switch(ID){
            
            case "Plan Básico":
                seleccion=1;
            break;
            
            case "Plan Intermedio":
                seleccion=2;
            break;
             
            case "Plan Avanzado":
                seleccion=3;
            break;
                
            case "Plan Premium":
                seleccion=4;
            break;
        }
        
    }//GEN-LAST:event_PlanEvento

    private void Botton_BloqueoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botton_BloqueoActionPerformed
        
        String Texto;
        
        Texto= Botton_Bloqueo.getText();
        switch (Texto){
            case "Desbloquear":
                Botton_Bloqueo.setText("Bloquear");
                F_contacto.setEditable(true);
                F_direccion.setEditable(true);
                F_nombre.setEditable(true);
                F_telefono.setEditable(true);
                F_valorservicio.setEditable(false);
                jButton5.setEnabled(true);
                break;
            case "Bloquear":
                Botton_Bloqueo.setText("Desbloquear");
                F_contacto.setEditable(false);
                F_direccion.setEditable(false);
                F_nombre.setEditable(false);
                F_telefono.setEditable(false);
                F_valorservicio.setEditable(false);
                jButton5.setEnabled(false);
                break;
        }
        
        
        
    }//GEN-LAST:event_Botton_BloqueoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        
        try{
            Statement stm= getConection().createStatement();
            
            String query="select * from cliente where ID_Cliente = "+F_TXT.getText();
            
            ResultSet rs= stm.executeQuery(query);
            rs.next();
            if(rs.getRow()==0){
                JOptionPane.showMessageDialog(rootPane,"No existe tal cliente");
                return;
            }
            
            F_contacto.setText(rs.getString(3));
            F_direccion.setText(rs.getString(9));
            F_nombre.setText(rs.getString(2));
            F_telefono.setText(rs.getString(4));
            
           
            if(Nivel1.isSelected()||Nivel2.isSelected()||Nivel3.isSelected()||Nivel4.isSelected()){
                GrupoPlan.clearSelection();
            }
            switch(rs.getInt(5)){
                case 1:
                    Nivel1.setSelected(true);
                    seleccion=1;
                break;
                case 2:
                    Nivel2.setSelected(true);
                    seleccion=2;
                break;
                case 3:
                    Nivel3.setSelected(true);
                    seleccion=3;
                break;
                case 4:
                    Nivel4.setSelected(true);
                    seleccion=4;
                break;   
            }   
                int nvs= rs.getInt(5);
                query= "select * from `nivel de servicio` where ID_Nivel_servicio = "+nvs;
                rs= stm.executeQuery(query);
                rs.next();
                F_valorservicio.setText(rs.getString(8));
            
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try{
            Statement stm= getConection().createStatement();
            Statement stm2= getConection().createStatement();
            Statement stm3= getConection().createStatement();
            Statement stm4= getConection().createStatement();
            
            ResultSet rs2= stm2.executeQuery("select * from cliente where ID_Cliente= "+ F_TXT.getText());
            rs2.next();
            if(rs2.getRow()==0){
                JOptionPane.showMessageDialog(rootPane, "No existe ese registro");
                return;    
            }
            ResultSet rs= stm.executeQuery("select * from tecnicos_lista where ID_Tecnico = "+ rs2.getString(8));
            rs.next();
            if(rs.getRow()==0){
                JOptionPane.showMessageDialog(rootPane, "No existe ese registro donde tecnico con ID "+rs2.getString(8) +"este asignado al cliente "+F_TXT.getText());
                return; 
            }
            int i= rs.getInt(4);
            i--;
            stm3.executeUpdate("update tecnicos_lista set Tecnico_NumC = "+i+" where ID_Tecnico= "+rs2.getInt(8));
            stm4.execute("delete from cliente where ID_Cliente= "+F_TXT.getText());
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        Limpiar();
        JOptionPane.showMessageDialog(rootPane, "El cliente se ha borrado exitosamente");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            
            if("".equals(F_TXT.getText())||"".equals(F_contacto.getText())||"".equals(F_direccion.getText())||"".equals(F_nombre.getText())||"".equals(F_telefono.getText())||"".equals(F_valorservicio.getText())){
                JOptionPane.showMessageDialog(rootPane, "Porfavor ingrese los datos a editar completos ");
                return;
            }
            
            PreparedStatement  stm= getConection().prepareStatement("update cliente set Cliente_nombre= ? ,Cliente_Contacto_Nombre= ? ,Cliente_Contacto_numero= ? ,Cliente_Nivelservicio= ? ,Cliente_Direccion= ?, Cliente_horasatencion= ?  where ID_Cliente= ? ");
                                                                                                      //1                           2                           3                         4                     5                         6                    7
            ResultSet rs;
            Statement stm2= getConection().createStatement();
            rs= stm2.executeQuery("select * from cliente where ID_Cliente= "+ F_TXT.getText());
            rs.next();
            
            
            
            stm.setString(1,F_nombre.getText());
            stm.setString(2,F_contacto.getText());
            stm.setInt(3,Integer.parseInt(F_telefono.getText()));
            stm.setInt(4, seleccion);
            stm.setString(5, F_direccion.getText());
            if (rs.getRow()==0){
                JOptionPane.showMessageDialog(rootPane, "No existe registro de cliente con ID= "+F_TXT);
                return;
            }else if(rs.getInt(5)!=seleccion){// en caso de que el nivel que se selecciono sea diferente al nivel que ya esta en la base
                //horas de atencion
                Statement stm3= getConection().createStatement();
                ResultSet rs2= stm3.executeQuery("select * from `nivel de servicio` where ID_Nivel_servicio= "+ seleccion);
                rs2.next();
                System.out.println(seleccion);
                if(rs2.getRow()==0){
                    JOptionPane.showMessageDialog(rootPane,"Error en la base, revisar la tabla donde el nivel de servicio que supone que el ID ="+ seleccion);
                    return;
                }
                stm.setInt(6, rs2.getInt(3));
                
                //Cambio Tecnico
                //primera parte elimina el cliente del tecnico
                Statement stm4= getConection().createStatement();
                ResultSet rs3= stm4.executeQuery("select * from cliente where ID_Cliente= "+ F_TXT.getText());
                rs3.next();
                if(rs3.getRow()==0){
                    JOptionPane.showMessageDialog(rootPane, "No existe ese registro");
                return;    
                }
                Statement stm5= getConection().createStatement();
                ResultSet rs4= stm5.executeQuery("select * from tecnicos_lista where ID_Tecnico = "+ rs3.getString(8));
                rs4.next();
                if(rs4.getRow()==0){
                    JOptionPane.showMessageDialog(rootPane, "No existe ese registro donde tecnico con ID "+rs3.getString(8) +"este asignado al cliente "+F_TXT.getText());
                    return; 
                }
                int i= rs4.getInt(4);
                i--;
                stm4.executeUpdate("update tecnicos_lista set Tecnico_NumC = "+i+" where ID_Tecnico= "+rs3.getInt(8));
                //segunda parte asigna nuevo tecnico al cliente  rs4 stm5
                
                Statement Stm6= getConection().createStatement();
                ResultSet rs5;
                String query= "select * from `tecnicos_lista` where Tecnico_nivelservicio = "+ seleccion+ " and Tecnico_NumC < 3";
                rs5= Stm6.executeQuery(query);
                rs5.next();
            
                if(rs5.getRow()==0){
                    JOptionPane.showMessageDialog(rootPane,"No hay tecnicos de este nivel para asignar");
                    return;
                }else{ 
                    int j=rs5.getInt(4); 
                    Statement STMTec= getConection().createStatement();
                    STMTec.executeUpdate("update cliente set Cliente_tecnicoID= "+ rs5.getInt(1)+" where ID_Cliente= "+ F_TXT.getText()+";");
                    j++; 
                    Stm6.executeUpdate("update tecnicos_lista set Tecnico_NumC = "+j+" where ID_Tecnico= "+rs5.getInt(1));
                }
            }else{
                stm.setInt(6, rs.getInt(6));
            }
            
            stm.setInt(7, Integer.parseInt(F_TXT.getText()));
            stm.executeUpdate();
            
            jButton1ActionPerformed(evt);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Limpiar();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNagr;
    private javax.swing.JButton Botton_Bloqueo;
    private javax.swing.JTextField F_TXT;
    private javax.swing.JTextField F_contacto;
    private javax.swing.JTextField F_direccion;
    private javax.swing.JTextField F_nombre;
    private javax.swing.JTextField F_telefono;
    private javax.swing.JTextField F_valorservicio;
    private javax.swing.ButtonGroup GrupoPlan;
    private javax.swing.JRadioButton Nivel1;
    private javax.swing.JRadioButton Nivel2;
    private javax.swing.JRadioButton Nivel3;
    private javax.swing.JRadioButton Nivel4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
