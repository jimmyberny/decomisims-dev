package org.decomisims.vistas;

import org.decomisims.app.Aplicacion;
import org.decomisims.error.AppException;
import org.decomisims.listeners.AntiguedadListener;
import org.decomisims.listeners.AreaListener;
import org.decomisims.listeners.SalarioListener;
import org.decomisims.util.Format;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author José Bernardo Gómez-Andrade
 */
public class Conceptos extends javax.swing.JPanel {

    private static final long serialVersionUID = 1123581321L;
    private static final Logger log = LoggerFactory.getLogger(Conceptos.class);

    public Conceptos() {
        initComponents();
    }

    public void init(Aplicacion app, OpcionesGenerales opciones) {
        veoHabitacion.setSalarios(opciones);
        veoComedor.setSalarios(opciones);
        veDespensa.init(opciones.getSalarioDF(), 0.4); // Excento hasta el 40%
        //
        AntiguedadListener lAnt = new AntiguedadListener(jtfAntiguedad,
                jtfDiasVacaciones,
                jtfPrimaVacacional,
                jtfPrimaDias);

        //
        AreaListener lArea = new AreaListener(jrbA, jrbB, jrbDF,
                jtfSalarioMinimo, opciones);

        // 
        SalarioListener sl = new SalarioListener(jtfSalario, horas);
    }

    public String getNombre() {
        return String.format("%s %s %s",
                jtfNombre.getText(),
                jtfPaterno.getText(),
                jtfMaterno.getText());
    }

    public Integer getDias() {
        return Format.INTEGER.parse(jtfDias.getText(), 0);
    }

    public Double getSalario()  {
        return Format.CURRENCY.parse(jtfSalario.getText(), 0d);
    }

    public Double getMinimo() {
        return Format.CURRENCY.parse(jtfSalarioMinimo.getText(), 0d);
    }

    public HorasExtra getHoras() {
        return horas;
    }

    public Double getPremioAsistencia() {
        return Format.CURRENCY.parse(jtfPremioAsistencia.getText(), 0d);
    }

    public Double getAyudaHabitacion() {
        return veoHabitacion.getValor();
    }

    public Double getAyudaHabitacionCobro() {
        return veoHabitacion.getCobroOneroso();
    }

    public Double getAyudaComedor() {
        return veoComedor.getValor();
    }

    public Double getAyudaComedorCobro() {
        return veoComedor.getCobroOneroso();
    }

    public Double getValesDespensa() {
        return veDespensa.getValor();
    }

    public Double getDespensaIntegrado() {
        return veDespensa.getExcedente();
    }

    public Double getValesGasolina() {
        return Format.DECIMAL.parse(jtfValesGasolina.getText(), 0d);
    }
    
    public Integer getAntiguedad() {
        return Format.INTEGER.parse(jtfAntiguedad.getText(), 0);
    }
    
    public Double getPrima() {
        return Format.PERCENT.parse(jtfPrimaVacacional.getText(), 0d);
    }
    
    public Integer getVacaciones() {
        return Format.INTEGER.parse(jtfDiasVacaciones.getText(), 0);
    }

    public Integer getAguinaldo() {
        return Format.INTEGER.parse(jtfAguinaldo.getText(), 0);
    }
    
    public Double getDiasPrima() {
        return Format.DECIMAL.parse(jtfPrimaDias.getText(), 0d);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgArea = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfDias = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        lblPaterno = new javax.swing.JLabel();
        jtfPaterno = new javax.swing.JTextField();
        lblMaterno = new javax.swing.JLabel();
        jtfMaterno = new javax.swing.JTextField();
        jtfSalario = new javax.swing.JTextField();
        jtfAntiguedad = new javax.swing.JTextField();
        jrbA = new javax.swing.JRadioButton();
        jrbB = new javax.swing.JRadioButton();
        jrbDF = new javax.swing.JRadioButton();
        jtfDiasVacaciones = new javax.swing.JTextField();
        jtfPrimaVacacional = new javax.swing.JTextField();
        lblPrimaVacacional = new javax.swing.JLabel();
        lblDiasVacaciones = new javax.swing.JLabel();
        lblPrimaDias = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jtfAguinaldo = new javax.swing.JTextField();
        jtfPrimaDias = new javax.swing.JTextField();
        lblSalMinimo = new javax.swing.JLabel();
        jtfSalarioMinimo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jtfValesGasolina = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtfPremioAsistencia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        veoHabitacion = new org.decomisims.vistas.ValorExentoOneroso();
        veoComedor = new org.decomisims.vistas.ValorExentoOneroso();
        veDespensa = new org.decomisims.vistas.ValorExento();
        horas = new org.decomisims.vistas.HorasExtra();

        setLayout(new java.awt.BorderLayout());

        jLabel2.setText("Salario diario");
        jLabel2.setPreferredSize(new java.awt.Dimension(160, 26));

        jLabel3.setText("Días laborados");
        jLabel3.setPreferredSize(new java.awt.Dimension(160, 26));

        jLabel5.setText("Área geográfica");
        jLabel5.setPreferredSize(new java.awt.Dimension(160, 26));

        jLabel1.setText("Nombre");
        jLabel1.setPreferredSize(new java.awt.Dimension(160, 26));

        jLabel4.setText("Antigüedad");
        jLabel4.setPreferredSize(new java.awt.Dimension(160, 26));

        jtfDias.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jtfDias.setPreferredSize(new java.awt.Dimension(220, 26));

        jtfNombre.setPreferredSize(new java.awt.Dimension(220, 26));

        lblPaterno.setText("Apellido paterno");
        lblPaterno.setPreferredSize(new java.awt.Dimension(160, 26));

        jtfPaterno.setPreferredSize(new java.awt.Dimension(220, 26));

        lblMaterno.setText("Apellido materno");
        lblMaterno.setPreferredSize(new java.awt.Dimension(160, 26));

        jtfMaterno.setPreferredSize(new java.awt.Dimension(220, 26));

        jtfSalario.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jtfSalario.setPreferredSize(new java.awt.Dimension(220, 26));

        jtfAntiguedad.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jtfAntiguedad.setPreferredSize(new java.awt.Dimension(220, 26));

        bgArea.add(jrbA);
        jrbA.setText("A");
        jrbA.setPreferredSize(new java.awt.Dimension(56, 26));

        bgArea.add(jrbB);
        jrbB.setText("B");
        jrbB.setPreferredSize(new java.awt.Dimension(56, 26));

        bgArea.add(jrbDF);
        jrbDF.setText("D.F.");
        jrbDF.setPreferredSize(new java.awt.Dimension(56, 26));

        jtfDiasVacaciones.setEditable(false);
        jtfDiasVacaciones.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jtfDiasVacaciones.setPreferredSize(new java.awt.Dimension(220, 26));

        jtfPrimaVacacional.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jtfPrimaVacacional.setPreferredSize(new java.awt.Dimension(220, 26));

        lblPrimaVacacional.setText("% de prima vacacional");
        lblPrimaVacacional.setPreferredSize(new java.awt.Dimension(160, 26));

        lblDiasVacaciones.setText("Días de vacaciones");
        lblDiasVacaciones.setPreferredSize(new java.awt.Dimension(160, 26));

        lblPrimaDias.setText("Prima vac. en días");
        lblPrimaDias.setPreferredSize(new java.awt.Dimension(160, 26));

        jLabel17.setText("Días de aguinaldo");
        jLabel17.setPreferredSize(new java.awt.Dimension(160, 26));

        jtfAguinaldo.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jtfAguinaldo.setPreferredSize(new java.awt.Dimension(220, 26));

        jtfPrimaDias.setEditable(false);
        jtfPrimaDias.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jtfPrimaDias.setPreferredSize(new java.awt.Dimension(220, 26));

        lblSalMinimo.setText("Salario mínimo");
        lblSalMinimo.setPreferredSize(new java.awt.Dimension(160, 26));

        jtfSalarioMinimo.setEditable(false);
        jtfSalarioMinimo.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jtfSalarioMinimo.setPreferredSize(new java.awt.Dimension(220, 26));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSalMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfAntiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jrbA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrbB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrbDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtfSalarioMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblDiasVacaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfDiasVacaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblPrimaVacacional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfPrimaVacacional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPrimaDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfPrimaDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfAguinaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfAntiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDiasVacaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDiasVacaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrimaVacacional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPrimaVacacional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrimaDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPrimaDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfAguinaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfSalarioMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
        );

        jTabbedPane1.addTab("General", jPanel3);

        jLabel7.setText("Premio de asistencia");
        jLabel7.setPreferredSize(new java.awt.Dimension(160, 26));

        jtfValesGasolina.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jtfValesGasolina.setPreferredSize(new java.awt.Dimension(120, 26));

        jLabel10.setText("Ayuda de comedor");
        jLabel10.setPreferredSize(new java.awt.Dimension(160, 26));

        jLabel9.setText("Vales de gasolina");
        jLabel9.setPreferredSize(new java.awt.Dimension(160, 26));

        jtfPremioAsistencia.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jtfPremioAsistencia.setPreferredSize(new java.awt.Dimension(120, 26));

        jLabel6.setText("Ayuda de habitación");
        jLabel6.setPreferredSize(new java.awt.Dimension(160, 26));

        jLabel8.setText("Vales de depensa");
        jLabel8.setPreferredSize(new java.awt.Dimension(160, 26));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(veoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfPremioAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(veDespensa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfValesGasolina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(veoComedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPremioAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(veoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(veoComedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(veDespensa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfValesGasolina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(340, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ayudas", jPanel2);
        jTabbedPane1.addTab("Horas extra", horas);

        add(jTabbedPane1, java.awt.BorderLayout.PAGE_START);
        jTabbedPane1.getAccessibleContext().setAccessibleName("Ayudas");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgArea;
    private org.decomisims.vistas.HorasExtra horas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton jrbA;
    private javax.swing.JRadioButton jrbB;
    private javax.swing.JRadioButton jrbDF;
    private javax.swing.JTextField jtfAguinaldo;
    private javax.swing.JTextField jtfAntiguedad;
    private javax.swing.JTextField jtfDias;
    private javax.swing.JTextField jtfDiasVacaciones;
    private javax.swing.JTextField jtfMaterno;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfPaterno;
    private javax.swing.JTextField jtfPremioAsistencia;
    private javax.swing.JTextField jtfPrimaDias;
    private javax.swing.JTextField jtfPrimaVacacional;
    private javax.swing.JTextField jtfSalario;
    private javax.swing.JTextField jtfSalarioMinimo;
    private javax.swing.JTextField jtfValesGasolina;
    private javax.swing.JLabel lblDiasVacaciones;
    private javax.swing.JLabel lblMaterno;
    private javax.swing.JLabel lblPaterno;
    private javax.swing.JLabel lblPrimaDias;
    private javax.swing.JLabel lblPrimaVacacional;
    private javax.swing.JLabel lblSalMinimo;
    private org.decomisims.vistas.ValorExento veDespensa;
    private org.decomisims.vistas.ValorExentoOneroso veoComedor;
    private org.decomisims.vistas.ValorExentoOneroso veoHabitacion;
    // End of variables declaration//GEN-END:variables
}
