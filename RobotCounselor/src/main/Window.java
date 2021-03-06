/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class Window extends javax.swing.JFrame {

    ArrayList<String> classes = new ArrayList<>();
    ArrayList<ArrayList<String>> people = new ArrayList<>();
    SQLiteConnect sqlite = new SQLiteConnect();
    String name;
    int currentStudent;
    
    /**
     * Creates new form Window
     */
    public Window() {
        initComponents();
        setResizable(false);
    }
    
    /**
     * Sets check boxes to disabled
     */
    public void disableChecks() {
        algebraBox.setSelected(false);
        bandBox.setSelected(false);
        englishBox.setSelected(false);
        healthBox.setSelected(false);
        ssBox.setSelected(false);
        frenchBox.setSelected(false);
        chemistryBox.setSelected(false);
        artBox.setSelected(false);
        gymBox.setSelected(false);
        codingBox.setSelected(false);
        orchestraBox.setSelected(false);
        debateBox.setSelected(false);
        theatreBox.setSelected(false);
        horticultureBox.setSelected(false);
        medTechBox.setSelected(false);
        engineeringBox.setSelected(false);
        statisticsBox.setSelected(false);
        economicsBox.setSelected(false);
    }
    
    /**
     * Updates text in student information
     */
    public void updateText() {
        String text = "";
            for (int i = 0; i < people.size(); i++) {
                text += Scheduler.personToString(people.get(i));                   
            }
            studentsInfo.setText(text);
    }
    
    public void checkClasses() {
        classes.add(name);
        if (algebraBox.isSelected()) {classes.add("Algebra");}
        if (bandBox.isSelected()) {classes.add("Band");}
        if (englishBox.isSelected()) {classes.add("English");}
        if (healthBox.isSelected()) {classes.add("Health");}
        if (ssBox.isSelected()) {classes.add("Social Studies");}
        if (frenchBox.isSelected()) {classes.add("French");}
        if (chemistryBox.isSelected()) {classes.add("Chemistry");}
        if (artBox.isSelected()) {classes.add("Art");}
        if (gymBox.isSelected()) {classes.add("Gym");}
        if (codingBox.isSelected()) {classes.add("Coding");}
        if (orchestraBox.isSelected()) {classes.add("Orchestra");}
        if (debateBox.isSelected()) {classes.add("Debate");}
        if (theatreBox.isSelected()) {classes.add("Theatre");}
        if (horticultureBox.isSelected()) {classes.add("Horticulture");}
        if (medTechBox.isSelected()) {classes.add("MedTech");}
        if (engineeringBox.isSelected()) {classes.add("Engineering");}
        if (statisticsBox.isSelected()) {classes.add("Statistics");}
        if (economicsBox.isSelected()) {classes.add("Economics");}
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        inputPanel = new javax.swing.JPanel();
        algebraBox = new javax.swing.JCheckBox();
        bandBox = new javax.swing.JCheckBox();
        englishBox = new javax.swing.JCheckBox();
        healthBox = new javax.swing.JCheckBox();
        ssBox = new javax.swing.JCheckBox();
        frenchBox = new javax.swing.JCheckBox();
        chemistryBox = new javax.swing.JCheckBox();
        artBox = new javax.swing.JCheckBox();
        gymBox = new javax.swing.JCheckBox();
        addClassesButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentsInfo = new javax.swing.JTextArea();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        codingBox = new javax.swing.JCheckBox();
        orchestraBox = new javax.swing.JCheckBox();
        debateBox = new javax.swing.JCheckBox();
        theatreBox = new javax.swing.JCheckBox();
        horticultureBox = new javax.swing.JCheckBox();
        medTechBox = new javax.swing.JCheckBox();
        engineeringBox = new javax.swing.JCheckBox();
        statisticsBox = new javax.swing.JCheckBox();
        economicsBox = new javax.swing.JCheckBox();
        getStudentButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Robot Counselor");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Scheduling System");

        inputPanel.setName("Options"); // NOI18N

        algebraBox.setText("Algebra");

        bandBox.setText("Band");

        englishBox.setText("English");
        englishBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                englishBoxActionPerformed(evt);
            }
        });

        healthBox.setText("Health");

        ssBox.setText("Social Studies");

        frenchBox.setText("French");

        chemistryBox.setText("Chemistry");

        artBox.setText("Art");

        gymBox.setText("Gym");

        addClassesButton.setText("Add");
        addClassesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClassesButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Add Classes:");

        studentsInfo.setEditable(false);
        studentsInfo.setColumns(20);
        studentsInfo.setRows(5);
        studentsInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Student Info"));
        studentsInfo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        studentsInfo.setEnabled(false);
        studentsInfo.setFocusable(false);
        jScrollPane1.setViewportView(studentsInfo);

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        codingBox.setText("Coding");

        orchestraBox.setText("Orchestra");

        debateBox.setText("Debate");
        debateBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debateBoxActionPerformed(evt);
            }
        });

        theatreBox.setText("Theatre");

        horticultureBox.setText("Horticulture");

        medTechBox.setText("MedTech");

        engineeringBox.setText("Engineering");

        statisticsBox.setText("Statistics");

        economicsBox.setText("Economics");

        getStudentButton.setText("Get Student");
        getStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getStudentButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(healthBox, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(englishBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bandBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE))
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(gymBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(artBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(chemistryBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(frenchBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ssBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(algebraBox, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(codingBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(economicsBox)
                                    .addComponent(medTechBox)
                                    .addComponent(statisticsBox)
                                    .addComponent(theatreBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(engineeringBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(debateBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(orchestraBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(horticultureBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, inputPanelLayout.createSequentialGroup()
                                    .addComponent(getStudentButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, inputPanelLayout.createSequentialGroup()
                                    .addComponent(addClassesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(algebraBox)
                            .addComponent(codingBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bandBox)
                            .addComponent(orchestraBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(englishBox)
                            .addComponent(debateBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(healthBox)
                            .addComponent(theatreBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ssBox)
                            .addComponent(horticultureBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(frenchBox)
                            .addComponent(medTechBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chemistryBox)
                            .addComponent(engineeringBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(artBox)
                            .addComponent(statisticsBox, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gymBox)
                            .addComponent(economicsBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addClassesButton)
                            .addComponent(updateButton))
                        .addGap(18, 18, 18)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(getStudentButton)
                            .addComponent(deleteButton)))
                    .addComponent(jScrollPane1))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void englishBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_englishBoxActionPerformed
            
    }//GEN-LAST:event_englishBoxActionPerformed

    private void addClassesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClassesButtonActionPerformed
        
        classes = new ArrayList<>();
    
        name = (String)JOptionPane.showInputDialog(
                    inputPanel,
                    "Enter student name:",
                    "Student Name",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    null,
                    null);      
        
        checkClasses();
        
        if (classes.size() < 2) {
           JOptionPane.showMessageDialog(inputPanel,
            "Please give the student classes",
            "Zero classes error",
            JOptionPane.ERROR_MESSAGE); 
        } else {
        
        people.add(Scheduler.schedulePerson(classes)); 
        classes = people.get(people.size() - 1);
        currentStudent = people.size() - 1;       
        disableChecks();      
        
        if ((name != null) && (name.length() > 0)) {
            //Write name to database and text field
            updateText();
            sqlite.addStudent(name, classes);
        }
      }        
    }//GEN-LAST:event_addClassesButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        if ((name != null) && (name.length() > 0)) {
            classes = new ArrayList<>();
            checkClasses();
            sqlite.updateStudent(name, classes);           
            people.set(currentStudent, classes);
            updateText();
        }   
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        if ((name != null) && (name.length() > 0)) {
            //Write name to database and text field           
            sqlite.deleteStudent(name); 
            people.remove(currentStudent);
            updateText();
            
        } 
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void debateBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debateBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_debateBoxActionPerformed

    private void getStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getStudentButtonActionPerformed
        name = (String)JOptionPane.showInputDialog(
                    inputPanel,
                    "Enter student name to get:",
                    "Update Student",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    null,
                    null);
        
        if ((name != null) && (name.length() > 0)) {
            
                //Let them change name and update in database
                
                //Let them change the classes, auto show which are already checked
                
                classes = sqlite.getStudent(name);              
                
                for (int i = 0; i < people.size(); i++) {
                    if (people.get(i).get(0).equals(name)) {
                        currentStudent = i;
                    }
                }
                
                if (classes.contains("Algebra")) {algebraBox.setSelected(true);}
                if (classes.contains("Band")) {bandBox.setSelected(true);}
                if (classes.contains("English")) {englishBox.setSelected(true);}
                if (classes.contains("Health")) {healthBox.setSelected(true);}
                if (classes.contains("Social Studies")) {ssBox.setSelected(true);}
                if (classes.contains("French")) {frenchBox.setSelected(true);}
                if (classes.contains("Chemistry")) {chemistryBox.setSelected(true);}
                if (classes.contains("Art")) {artBox.setSelected(true);}
                if (classes.contains("Gym")) {gymBox.setSelected(true);}
                if (classes.contains("Coding")) {codingBox.setSelected(true);}
                if (classes.contains("Orchestra")) {orchestraBox.setSelected(true);}
                if (classes.contains("Debate")) {debateBox.setSelected(true);}
                if (classes.contains("Theatre")) {theatreBox.setSelected(true);}
                if (classes.contains("Horticulture")) {horticultureBox.setSelected(true);}
                if (classes.contains("MedTech")) {medTechBox.setSelected(true);}
                if (classes.contains("Engineering")) {engineeringBox.setSelected(true);}
                if (classes.contains("Statistics")) {statisticsBox.setSelected(true);}
                if (classes.contains("Economics")) {economicsBox.setSelected(true);}
                
            }   
        
    }//GEN-LAST:event_getStudentButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addClassesButton;
    private javax.swing.JCheckBox algebraBox;
    private javax.swing.JCheckBox artBox;
    private javax.swing.JCheckBox bandBox;
    private javax.swing.JCheckBox chemistryBox;
    private javax.swing.JCheckBox codingBox;
    private javax.swing.JCheckBox debateBox;
    private javax.swing.JButton deleteButton;
    private javax.swing.JCheckBox economicsBox;
    private javax.swing.JCheckBox engineeringBox;
    private javax.swing.JCheckBox englishBox;
    private javax.swing.JCheckBox frenchBox;
    private javax.swing.JButton getStudentButton;
    private javax.swing.JCheckBox gymBox;
    private javax.swing.JCheckBox healthBox;
    private javax.swing.JCheckBox horticultureBox;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox medTechBox;
    private javax.swing.JCheckBox orchestraBox;
    private javax.swing.JCheckBox ssBox;
    private javax.swing.JCheckBox statisticsBox;
    private javax.swing.JTextArea studentsInfo;
    private javax.swing.JCheckBox theatreBox;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
