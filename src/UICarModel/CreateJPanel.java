/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UICarModel;
import CarModel.Person;
import CarModel.PersonRecords;
import CarModel.PersonsRecList;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
/**
 *
 * @author dpsmv
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    Person person;
    Image pic;
    PersonRecords persRec;
    //PersonRecords personRecords;
    public CreateJPanel(Person person,  PersonRecords Rec) {
        initComponents();
        this.person = person;
        this.persRec = Rec;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblBrand = new javax.swing.JLabel();
        lblModel = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        lblEngineNo = new javax.swing.JLabel();
        lblseatsNumber = new javax.swing.JLabel();
        lblLicenseplates = new javax.swing.JLabel();
        lblOwnerName = new javax.swing.JLabel();
        lblOnwerTelephonenumbers = new javax.swing.JLabel();
        lblOwnerEmailaddresses = new javax.swing.JLabel();
        lblOwnerDriverlicense = new javax.swing.JLabel();
        lblOwnerSSN = new javax.swing.JLabel();
        lblOwneraddress = new javax.swing.JLabel();
        lblWarrantyYear = new javax.swing.JLabel();
        txtBrand = new javax.swing.JTextField();
        txtModel = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtEngineNo = new javax.swing.JTextField();
        txtLicenseplates = new javax.swing.JTextField();
        txtSeatsnumber = new javax.swing.JTextField();
        txtOwnerEmailaddresses = new javax.swing.JTextField();
        txtOnwerTelephonenumbers = new javax.swing.JTextField();
        txtWarrantyYear = new javax.swing.JTextField();
        txtOwnerName = new javax.swing.JTextField();
        txtOwnerDriverlicense = new javax.swing.JTextField();
        txtOwnerSSN = new javax.swing.JTextField();
        txtOwneraddress = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblCarOwnerDetails = new javax.swing.JLabel();
        txtyear = new javax.swing.JTextField();
        Add_service_records = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtimageholder = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();
        test = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 204));
        setForeground(new java.awt.Color(0, 204, 204));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Car Details");

        lblBrand.setText("Brand");

        lblModel.setText("Model");

        lblColor.setText("Color");

        lblYear.setText("Year");

        lblEngineNo.setText("Engine No.");

        lblseatsNumber.setText("Owner Name");

        lblLicenseplates.setText("License plates");

        lblOwnerName.setText("Seats number");

        lblOnwerTelephonenumbers.setText("Owner Email addresses");

        lblOwnerEmailaddresses.setText("Owner Telephone numbers");

        lblOwnerDriverlicense.setText("Owner Driver license");

        lblOwnerSSN.setText("OwnerSSN");

        lblOwneraddress.setText("Owner address");

        lblWarrantyYear.setText("Warranty Year");

        txtBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrandActionPerformed(evt);
            }
        });
        txtBrand.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBrandKeyPressed(evt);
            }
        });

        txtModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelActionPerformed(evt);
            }
        });

        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });

        txtEngineNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEngineNoActionPerformed(evt);
            }
        });

        txtLicenseplates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLicenseplatesActionPerformed(evt);
            }
        });

        txtSeatsnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeatsnumberActionPerformed(evt);
            }
        });

        txtOwnerEmailaddresses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOwnerEmailaddressesActionPerformed(evt);
            }
        });

        txtOnwerTelephonenumbers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOnwerTelephonenumbersActionPerformed(evt);
            }
        });

        txtWarrantyYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWarrantyYearActionPerformed(evt);
            }
        });

        txtOwnerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOwnerNameActionPerformed(evt);
            }
        });

        txtOwnerDriverlicense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOwnerDriverlicenseActionPerformed(evt);
            }
        });

        txtOwnerSSN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOwnerSSNActionPerformed(evt);
            }
        });

        txtOwneraddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOwneraddressActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblCarOwnerDetails.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCarOwnerDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCarOwnerDetails.setText("Car Owner Contact details");

        txtyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtyearActionPerformed(evt);
            }
        });
        txtyear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtyearKeyPressed(evt);
            }
        });

        Add_service_records.setText("Add Service Records");
        Add_service_records.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_service_recordsActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Owner Name", "Engine No.", "License plates", "Owner Telephone No."
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Upload Image");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblImage.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        test.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblOwnerEmailaddresses)
                                    .addComponent(lblseatsNumber))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtOwnerName, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                    .addComponent(txtOnwerTelephonenumbers))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblOwneraddress, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblOwnerDriverlicense, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtOwnerDriverlicense, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtOwneraddress, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblOwnerSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(59, 59, 59)
                                        .addComponent(txtOwnerSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblOnwerTelephonenumbers)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtOwnerEmailaddresses, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblLicenseplates, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblYear, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblColor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(txtyear, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(txtLicenseplates, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(75, 75, 75)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(lblWarrantyYear)
                                                            .addComponent(lblEngineNo)
                                                            .addComponent(lblModel)
                                                            .addComponent(lblOwnerName)))
                                                    .addComponent(lblCarOwnerDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(lblBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtWarrantyYear, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtSeatsnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEngineNo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtimageholder, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton1)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(353, 353, 353)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Add_service_records)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(102, 102, 102)
                                .addComponent(test, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(232, 323, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblOnwerTelephonenumbers, lblOwnerEmailaddresses});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblBrand)
                                .addGap(25, 25, 25))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblModel)
                                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblYear)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblEngineNo))
                            .addComponent(txtEngineNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLicenseplates)
                            .addComponent(lblWarrantyYear)
                            .addComponent(txtLicenseplates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtWarrantyYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblColor)
                            .addComponent(txtSeatsnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOwnerName))
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtimageholder, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lblCarOwnerDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblseatsNumber)
                    .addComponent(txtOwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOwnerDriverlicense, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOwnerDriverlicense, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOnwerTelephonenumbers)
                    .addComponent(txtOwnerEmailaddresses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOwneraddress)
                    .addComponent(txtOwneraddress, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOwnerSSN)
                    .addComponent(txtOnwerTelephonenumbers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOwnerEmailaddresses)
                    .addComponent(txtOwnerSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(Add_service_records)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(test, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addGap(173, 173, 173))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblBrand, lblColor, lblEngineNo, lblLicenseplates, lblModel, lblOnwerTelephonenumbers, lblOwnerDriverlicense, lblOwnerEmailaddresses, lblOwnerName, lblOwnerSSN, lblOwneraddress, lblWarrantyYear, lblYear});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtOnwerTelephonenumbers, txtOwneraddress});

    }// </editor-fold>//GEN-END:initComponents

    private void txtBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtBrandActionPerformed

    private void txtModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelActionPerformed

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorActionPerformed

    private void txtEngineNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEngineNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEngineNoActionPerformed

    private void txtLicenseplatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLicenseplatesActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtLicenseplatesActionPerformed

    private void txtSeatsnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeatsnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeatsnumberActionPerformed

    private void txtOwnerEmailaddressesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOwnerEmailaddressesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOwnerEmailaddressesActionPerformed

    private void txtOnwerTelephonenumbersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOnwerTelephonenumbersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOnwerTelephonenumbersActionPerformed

    private void txtWarrantyYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWarrantyYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWarrantyYearActionPerformed

    private void txtOwnerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOwnerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOwnerNameActionPerformed

    private void txtOwnerDriverlicenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOwnerDriverlicenseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOwnerDriverlicenseActionPerformed

    private void txtOwnerSSNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOwnerSSNActionPerformed
        // TODO add your handling code here:
        
       
    }//GEN-LAST:event_txtOwnerSSNActionPerformed

    private void txtOwneraddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOwneraddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOwneraddressActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
         // TODO add your handling code here:
      if(txtyear.getText().length() == 4)
         {}
      else JOptionPane.showMessageDialog(this, " InValid year"); 
      if(txtWarrantyYear.getText().length() == 4)
         {}
      else JOptionPane.showMessageDialog(this, " InValid warranty year"); 
     
      if(txtOwnerSSN.getText().length() == 9 )
      {}
      else JOptionPane.showMessageDialog(this, " InValid Owner SSN");
         
      if(txtOwnerEmailaddresses.getText().contains("@") && txtOwnerEmailaddresses.getText().contains("."))
      {}
        else
          JOptionPane.showMessageDialog(this, " InValid email address");
      person.setBrand(txtBrand.getText());
      person.setModel(txtModel.getText());
      person.setYear(txtyear.getText());
      person.setWarrantyYear(txtWarrantyYear.getText());
      person.setColor(txtColor.getText());
      person.setSeatsNumber(txtSeatsnumber.getText());
      person.setOwnerDriverLicense(txtOwnerDriverlicense.getText());
      person.setOwnerEmailAddress(txtOwnerEmailaddresses.getText());
      person.setOwneraddress(txtOwneraddress.getText());
      person.setOwnerSSN(txtOwnerSSN.getText());
      person.setImage(pic);
      PersonsRecList sr = new PersonsRecList(txtEngineNo.getText(),
                                txtLicenseplates.getText(),
                               txtOwnerName.getText(),
                                txtOnwerTelephonenumbers.getText(),
                                   test.getText());
      System.out.println(txtEngineNo.getText());
      System.out.println(txtEngineNo.getText());
       persRec.addCarrecords(sr);
       person.setSerRec(persRec);
      JOptionPane.showMessageDialog(this, " Car details stored successfully");
      
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtBrandKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBrandKeyPressed
        
    }//GEN-LAST:event_txtBrandKeyPressed

    private void txtyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtyearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtyearActionPerformed

    private void txtyearKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtyearKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtyearKeyPressed

    private void Add_service_recordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_service_recordsActionPerformed
        // TODO add your handling code here:
        if(txtOwnerName.getText().equals("") || txtLicenseplates.getText().equals("") || txtEngineNo.getText().equals("") || txtOnwerTelephonenumbers.getText().equals(""))
        { JOptionPane.showMessageDialog(this, "Please enter all the values");
    }//GEN-LAST:event_Add_service_recordsActionPerformed
     else 
        { String datavalues[] = {txtOwnerName.getText(),txtEngineNo.getText(),txtLicenseplates.getText(),txtOnwerTelephonenumbers.getText()};
            DefaultTableModel tblServiceRecords = (DefaultTableModel)jTable1.getModel();
            tblServiceRecords.addRow(datavalues);
            //JOptionPane.showMessageDialog(this, "Please enter all the details");
            txtOwnerName.setText("");
            txtEngineNo.setText("");
            txtLicenseplates.setText("");
            txtOnwerTelephonenumbers.setText("");
      }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser Carimage = new JFileChooser();
        FileNameExtensionFilter CarImageFileType = new FileNameExtensionFilter("*.image","png","jpg","jpeg");
        Carimage.setFileFilter(CarImageFileType);
        Carimage.showOpenDialog(null);
        File file = Carimage.getSelectedFile();
        if(file!=null)
        {
        String filename = file.getAbsolutePath();
        txtimageholder.setText(filename);
        
        Image getAttribute = null;
        ImageIcon icon = new ImageIcon(filename);
        Image img = icon.getImage().getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_SMOOTH);
        icon.setImage(img);
        lblImage.setIcon(icon);
        pic=img;
        }
        
          /*JFileChooser fileUploader = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
        "JPG & GIF Images", "jpg", "gif");
        fileUploader.setFileFilter(filter);
        fileUploader.setDialogTitle("Choose Your Photo");
        fileUploader.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnval = fileUploader.showOpenDialog(this);
        if (returnval == JFileChooser.APPROVE_OPTION)
        {
            File uploadedFile = fileUploader.getSelectedFile();
            BufferedImage bufferedImageObj;
            try {
                bufferedImageObj = ImageIO.read(uploadedFile);
                ByteArrayOutputStream byteArrayOs = new ByteArrayOutputStream();
                ImageIO.write(bufferedImageObj, "jpg", byteArrayOs);
                byte[] photoBytes = byteArrayOs.toByteArray();
                person.setPhoto(photoBytes);
                JOptionPane.showMessageDialog(fileUploader, "Photo Uploaded Successfully");
            } catch(IOException e) {
               e.printStackTrace();
               JOptionPane.showMessageDialog(fileUploader, "Error while uploading Photo");
            }
        }*/
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void testActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testActionPerformed
      

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_service_records;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblCarOwnerDetails;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblEngineNo;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblLicenseplates;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblOnwerTelephonenumbers;
    private javax.swing.JLabel lblOwnerDriverlicense;
    private javax.swing.JLabel lblOwnerEmailaddresses;
    private javax.swing.JLabel lblOwnerName;
    private javax.swing.JLabel lblOwnerSSN;
    private javax.swing.JLabel lblOwneraddress;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWarrantyYear;
    private javax.swing.JLabel lblYear;
    private javax.swing.JLabel lblseatsNumber;
    private javax.swing.JTextField test;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtEngineNo;
    private javax.swing.JTextField txtLicenseplates;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtOnwerTelephonenumbers;
    private javax.swing.JTextField txtOwnerDriverlicense;
    private javax.swing.JTextField txtOwnerEmailaddresses;
    private javax.swing.JTextField txtOwnerName;
    private javax.swing.JTextField txtOwnerSSN;
    private javax.swing.JTextField txtOwneraddress;
    private javax.swing.JTextField txtSeatsnumber;
    private javax.swing.JTextField txtWarrantyYear;
    private javax.swing.JTextField txtimageholder;
    private javax.swing.JTextField txtyear;
    // End of variables declaration//GEN-END:variables
}
