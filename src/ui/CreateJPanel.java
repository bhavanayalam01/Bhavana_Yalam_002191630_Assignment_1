/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Image;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.Person;

/**
 *
 * @author bhavana
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    Person person;

    public CreateJPanel(Person person) {
        initComponents();
        this.person = person;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtGeographicdata = new javax.swing.JTextField();
        txtDob = new javax.swing.JTextField();
        txtTelephoneNumber = new javax.swing.JTextField();
        txtFAX = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSSN = new javax.swing.JTextField();
        txtMedicalRecordNumber = new javax.swing.JTextField();
        txtHealthPlanBeneficiaryNumber = new javax.swing.JTextField();
        txtBankAccountNumber = new javax.swing.JTextField();
        lblMedicalRecordNumber = new javax.swing.JLabel();
        txtLicenseNumber = new javax.swing.JTextField();
        lblHealthPlanBeneficiaryNumber = new javax.swing.JLabel();
        txtVehicleIdentifiers = new javax.swing.JTextField();
        lblBankAccountNumber = new javax.swing.JLabel();
        txtDeviceIdentifiers = new javax.swing.JTextField();
        lblLicenseNumber = new javax.swing.JLabel();
        txtLinkedIn = new javax.swing.JTextField();
        lblVehicleIdentifiers = new javax.swing.JLabel();
        txtInternetProtocolAddresses = new javax.swing.JTextField();
        lblDeviceIdentifiers = new javax.swing.JLabel();
        txtBiometricIdentifiers = new javax.swing.JTextField();
        lblLinkedIn = new javax.swing.JLabel();
        txtFullFacePhotos = new javax.swing.JTextField();
        lblInternetProtocolAddresses = new javax.swing.JLabel();
        txtUniqueIdentifyingNumber = new javax.swing.JTextField();
        lblBiometricIdentifiers = new javax.swing.JLabel();
        lblFullFacePhotos = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblGeographicdata = new javax.swing.JLabel();
        lbldob = new javax.swing.JLabel();
        lblTelephoneNumber = new javax.swing.JLabel();
        lblFAX = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblSSN = new javax.swing.JLabel();
        lblUniqueIdentifyingNumber = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblImgFullFacePhoto = new javax.swing.JLabel();
        lblImgBiometricIdentifiers = new javax.swing.JLabel();
        btnBiometricIdentifiers = new javax.swing.JButton();
        btnFullFacePhotos = new javax.swing.JButton();

        txtGeographicdata.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtGeographicdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeographicdataActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lblMedicalRecordNumber.setText("Medical Record Number");

        lblHealthPlanBeneficiaryNumber.setText("Health plan beneficiary number");

        lblBankAccountNumber.setText("Bank account number");

        lblLicenseNumber.setText("License number");

        lblVehicleIdentifiers.setText("Vehicle identifiers");

        lblDeviceIdentifiers.setText("Device identifiers");

        lblLinkedIn.setText("LinkedIn");

        lblInternetProtocolAddresses.setText("Internet protocol addresses");

        lblBiometricIdentifiers.setText("Biometric identifiers");

        lblFullFacePhotos.setText("Full face photos ");

        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("CREATE");

        lblName.setText("Name");

        lblGeographicdata.setText("Geographic Data");

        lbldob.setText("Date of Birth");

        lblTelephoneNumber.setText("Telephone Number");

        lblFAX.setText("FAX Number");

        lblEmail.setText("Email Address");

        lblSSN.setText("Social Security Number");

        lblUniqueIdentifyingNumber.setText("Unique identifying number");

        txtName.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBiometricIdentifiers.setText("Upload");
        btnBiometricIdentifiers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBiometricIdentifiersActionPerformed(evt);
            }
        });

        btnFullFacePhotos.setText("Upload");
        btnFullFacePhotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFullFacePhotosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(btnSave))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUniqueIdentifyingNumber)
                            .addComponent(lblFullFacePhotos)
                            .addComponent(lblBiometricIdentifiers)
                            .addComponent(lblInternetProtocolAddresses)
                            .addComponent(lblLinkedIn)
                            .addComponent(lblDeviceIdentifiers)
                            .addComponent(lblVehicleIdentifiers)
                            .addComponent(lblLicenseNumber)
                            .addComponent(lblBankAccountNumber)
                            .addComponent(lblHealthPlanBeneficiaryNumber, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmail)
                            .addComponent(lblFAX)
                            .addComponent(lbldob)
                            .addComponent(lblGeographicdata)
                            .addComponent(lblName)
                            .addComponent(lblTelephoneNumber)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblSSN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblMedicalRecordNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtFullFacePhotos, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                            .addComponent(txtBiometricIdentifiers, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtInternetProtocolAddresses, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLinkedIn, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDeviceIdentifiers, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVehicleIdentifiers, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLicenseNumber, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBankAccountNumber, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHealthPlanBeneficiaryNumber, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMedicalRecordNumber, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSSN, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFAX, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelephoneNumber, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGeographicdata, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDob, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUniqueIdentifyingNumber))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblImgBiometricIdentifiers, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblImgFullFacePhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnBiometricIdentifiers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnFullFacePhotos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(108, 108, 108))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGeographicdata)
                            .addComponent(txtGeographicdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbldob)
                            .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelephoneNumber)
                            .addComponent(txtTelephoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFAX)
                            .addComponent(txtFAX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSSN)
                            .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMedicalRecordNumber)
                            .addComponent(txtMedicalRecordNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblImgBiometricIdentifiers, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHealthPlanBeneficiaryNumber)
                    .addComponent(txtHealthPlanBeneficiaryNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBankAccountNumber)
                            .addComponent(txtBankAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLicenseNumber)
                            .addComponent(txtLicenseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVehicleIdentifiers)
                            .addComponent(txtVehicleIdentifiers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDeviceIdentifiers)
                            .addComponent(txtDeviceIdentifiers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLinkedIn)
                            .addComponent(txtLinkedIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblInternetProtocolAddresses)
                            .addComponent(txtInternetProtocolAddresses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblImgFullFacePhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBiometricIdentifiers)
                    .addComponent(txtBiometricIdentifiers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBiometricIdentifiers))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFullFacePhotos)
                    .addComponent(txtFullFacePhotos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFullFacePhotos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUniqueIdentifyingNumber)
                    .addComponent(txtUniqueIdentifyingNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(btnSave))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtGeographicdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeographicdataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGeographicdataActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        person.setName(txtName.getText());
        person.setGeographicData(txtGeographicdata.getText());
        person.setDob(txtDob.getText());
        person.setLinkedIn(txtLinkedIn.getText());        
        person.setBiometricIdentifiers(txtBiometricIdentifiers.getText());
        person.setFullFacePhotos(txtFullFacePhotos.getText());
        person.setInternetProtocolAddresses(txtInternetProtocolAddresses.getText());
        

        int count=  0;
        
        String validTelephoneNumber = "\\d{10}";
        Pattern pattern = Pattern.compile(validTelephoneNumber);
        Matcher matcher = pattern.matcher(txtTelephoneNumber.getText());
        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(this, "Enter correct Telephone Number");
            count += 1;
        }
        if (count == 0) {
            person.setTelephoneNumber(txtTelephoneNumber.getText());
        }

        String validFAX = "\\d{10}";
        Pattern pattern1 = Pattern.compile(validFAX);
        Matcher matcher1 = pattern1.matcher(txtFAX.getText());
        if (!matcher1.matches()) {
            JOptionPane.showMessageDialog(this, "Enter correct Fax number");
            count += 1;
        }
        if (count == 0) {
            person.setFaxNumber(txtFAX.getText());
        }

        String validEmail = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        Pattern pattern2 = Pattern.compile(validEmail);
        Matcher matcher2 = pattern2.matcher(txtEmail.getText());
        if (!matcher2.matches()) {
            JOptionPane.showMessageDialog(this, "Enter correct Email number");
            count += 1;
        }
        if (count == 0) {
             person.setEmailAddress(txtEmail.getText());
        }
        
       String validUniqueIdentifyingNumber = "\\d{10}";
       Pattern pattern3 = Pattern.compile(validUniqueIdentifyingNumber);
       Matcher matcher3 = pattern3.matcher(txtUniqueIdentifyingNumber.getText());
       if (!matcher3.matches()){
           JOptionPane.showMessageDialog(this,"Enter correct Unique Identity number");
           count +=1;
       }
       if(count == 0){
           person.setUniqueIdentifyingNumber(txtUniqueIdentifyingNumber.getText());
       } 
     
       String validSSN = "^(?!000|666)[0-8][0-9]{2}-(?!00)[0-9]{2}-(?!0000)[0-9]{4}$";
       Pattern pattern4 = Pattern.compile(validSSN);
       Matcher matcher4 = pattern4.matcher(txtSSN.getText());
       if (!matcher4.matches()){
           JOptionPane.showMessageDialog(this,"Enter correct Social Security Number");
           count +=1;
       }
       if(count == 0){
           person.setSsn(txtSSN.getText());
       }
       
       String validMedicalRecordNumber = "\\d{7}";
       Pattern pattern5 = Pattern.compile(validMedicalRecordNumber);
       Matcher matcher5 = pattern5.matcher(txtMedicalRecordNumber.getText());
       if (!matcher5.matches()){
           JOptionPane.showMessageDialog(this,"Enter correct Medical Reference number");
           count +=1;
       }
       if(count == 0){
        person.setMedicalRecordNumber(txtMedicalRecordNumber.getText());
       }
              
       String validHealthPlanBeneficiaryNumber = "\\d{7}";
       Pattern pattern6 = Pattern.compile(validHealthPlanBeneficiaryNumber);
       Matcher matcher6 = pattern6.matcher(txtHealthPlanBeneficiaryNumber.getText());
       if (!matcher6.matches()){
           JOptionPane.showMessageDialog(this,"Enter Health Plan Beneficiary number");
           count +=1;
       }
       if(count == 0){
           person.setHealthPlanBeneficiaryNumber(txtHealthPlanBeneficiaryNumber.getText());
       }
        
       String validVehicleIdentifiers = "\\d{7}";
       Pattern pattern7 = Pattern.compile(validVehicleIdentifiers);
       Matcher matcher7 = pattern7.matcher(txtVehicleIdentifiers.getText());
       if (!matcher7.matches()){
           JOptionPane.showMessageDialog(this,"Enter correct Vehicle Identifier Number");
           count +=1;
       }
       if(count == 0){
           person.setVehicleIdentifiers(txtVehicleIdentifiers.getText());
       }
       
       String validDeviceIdentifiers = "\\d{7}";
       Pattern pattern8 = Pattern.compile(validDeviceIdentifiers);
       Matcher matcher8 = pattern8.matcher(txtDeviceIdentifiers.getText());
       if (!matcher8.matches()){
           JOptionPane.showMessageDialog(this,"Enter correct Device Identifier Number");
           count +=1;
       }
       if(count == 0){
           person.setDeviceIdentifiers(txtDeviceIdentifiers.getText());
       }
       
       String validBankAccountNumber = "\\d{10}";
       Pattern pattern9 = Pattern.compile(validBankAccountNumber);
       Matcher matcher9 = pattern9.matcher(txtBankAccountNumber.getText());
       if (!matcher9.matches()){
           JOptionPane.showMessageDialog(this,"Enter correct Bank Account Number");
           count +=1;
       }
       if(count == 0){
           person.setBankAccountNumber(txtBankAccountNumber.getText());
       }
       
       String validLicenseNumber = "\\d{10}";
       Pattern pattern0 = Pattern.compile(validLicenseNumber);
       Matcher matcher0 = pattern0.matcher(txtLicenseNumber.getText());
       if (!matcher0.matches()){
           JOptionPane.showMessageDialog(this,"Enter correct Certificate/License Number");
           count +=1;
       }
       if(count == 0){
           person.setLicenseNumber(txtLicenseNumber.getText());
       }
       if(count == 0){
        JOptionPane.showMessageDialog(this,"Person profile Information is saved.");
       }


    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBiometricIdentifiersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBiometricIdentifiersActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();

        txtBiometricIdentifiers.setText(filename);


        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(138, 152, Image.SCALE_DEFAULT));
        lblImgBiometricIdentifiers.setIcon(imageIcon);
    }//GEN-LAST:event_btnBiometricIdentifiersActionPerformed

    private void btnFullFacePhotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFullFacePhotosActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();

        txtFullFacePhotos.setText(filename);

        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(138, 152, Image.SCALE_DEFAULT));
        lblImgFullFacePhoto.setIcon(imageIcon);

    }//GEN-LAST:event_btnFullFacePhotosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBiometricIdentifiers;
    private javax.swing.JButton btnFullFacePhotos;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblBankAccountNumber;
    private javax.swing.JLabel lblBiometricIdentifiers;
    private javax.swing.JLabel lblDeviceIdentifiers;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFAX;
    private javax.swing.JLabel lblFullFacePhotos;
    private javax.swing.JLabel lblGeographicdata;
    private javax.swing.JLabel lblHealthPlanBeneficiaryNumber;
    private javax.swing.JLabel lblImgBiometricIdentifiers;
    private javax.swing.JLabel lblImgFullFacePhoto;
    private javax.swing.JLabel lblInternetProtocolAddresses;
    private javax.swing.JLabel lblLicenseNumber;
    private javax.swing.JLabel lblLinkedIn;
    private javax.swing.JLabel lblMedicalRecordNumber;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblTelephoneNumber;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUniqueIdentifyingNumber;
    private javax.swing.JLabel lblVehicleIdentifiers;
    private javax.swing.JLabel lbldob;
    private javax.swing.JTextField txtBankAccountNumber;
    private javax.swing.JTextField txtBiometricIdentifiers;
    private javax.swing.JTextField txtDeviceIdentifiers;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFAX;
    private javax.swing.JTextField txtFullFacePhotos;
    private javax.swing.JTextField txtGeographicdata;
    private javax.swing.JTextField txtHealthPlanBeneficiaryNumber;
    private javax.swing.JTextField txtInternetProtocolAddresses;
    private javax.swing.JTextField txtLicenseNumber;
    private javax.swing.JTextField txtLinkedIn;
    private javax.swing.JTextField txtMedicalRecordNumber;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtTelephoneNumber;
    private javax.swing.JTextField txtUniqueIdentifyingNumber;
    private javax.swing.JTextField txtVehicleIdentifiers;
    // End of variables declaration//GEN-END:variables
}
