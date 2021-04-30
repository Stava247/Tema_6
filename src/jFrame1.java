

import javax.swing.ImageIcon;

public class jFrame1 extends javax.swing.JFrame {

    public jFrame1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame2 = new javax.swing.JFrame();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jFrame3 = new javax.swing.JFrame();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jFrame4 = new javax.swing.JFrame();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jFrame5 = new javax.swing.JFrame();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jFrame2.setTitle("Детство");
        jFrame2.setIconImage(java.awt.Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png")));
        jFrame2.setMinimumSize(new java.awt.Dimension(357, 326));
        jFrame2.setResizable(false);
        jFrame2.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                jFrame2WindowClosing(evt);
            }
        });

        jButton3.setText("Назад");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Вперед");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Черника");
        jRadioButton1.setActionCommand("0");
        jRadioButton1.setBorder(null);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Вишня");
        jRadioButton2.setActionCommand("1");
        jRadioButton2.setMaximumSize(new java.awt.Dimension(59, 15));
        jRadioButton2.setMinimumSize(new java.awt.Dimension(59, 15));
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Арбуз");
        jRadioButton3.setActionCommand("2");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Земляника");
        jRadioButton4.setActionCommand("3");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("Клубника");
        jRadioButton5.setActionCommand("4");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Выберите любимую кашу:");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/morda0.png"))); // NOI18N
        jLabel9.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Выбрано: ");

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jFrame2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jFrame2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jFrame2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jFrame2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(23, 23, 23)
                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame2Layout.createSequentialGroup()
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jRadioButton3)
                        .addGap(7, 7, 7)
                        .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jRadioButton5)
                .addGap(17, 17, 17)
                .addComponent(jLabel6)
                .addGap(26, 26, 26)
                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jButton4)))
        );

        jFrame2.setLocationRelativeTo(null);

        jFrame3.setTitle("Отрочество");
        jFrame3.setMinimumSize(new java.awt.Dimension(442, 294));
        jFrame3.setResizable(false);
        jFrame3.setSize(new java.awt.Dimension(0, 0));
        jFrame3.setLocationRelativeTo(null);
        jFrame3.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                jFrame3WindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                jFrame3WindowClosing(evt);
            }
        });
        jFrame3.getContentPane().setLayout(null);

        jButton11.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jButton11.setText("Вперед");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jFrame3.getContentPane().add(jButton11);
        jButton11.setBounds(140, 220, 101, 31);

        jButton12.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jButton12.setText("Назад");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jFrame3.getContentPane().add(jButton12);
        jButton12.setBounds(10, 220, 100, 31);

        jList1.setBorder(new javax.swing.border.MatteBorder(null));
        jList1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Отлично", "Хорошо", "Удовлетворительно", "Неудовлетворительно" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jList1.setSelectionBackground(new java.awt.Color(0, 153, 153));
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(jList1);

        jFrame3.getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(10, 40, 210, 130);

        jLabel12.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        jLabel12.setText("Как вы учились в школе?");
        jFrame3.getContentPane().add(jLabel12);
        jLabel12.setBounds(36, 10, 336, 23);
        jFrame3.getContentPane().add(jLabel13);
        jLabel13.setBounds(445, 103, 31, 0);

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jFrame3.getContentPane().add(jLabel14);
        jLabel14.setBounds(221, 173, 0, 31);
        jFrame3.getContentPane().add(jLabel19);
        jLabel19.setBounds(250, 40, 170, 200);

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel16.setText("Выбрано:");
        jFrame3.getContentPane().add(jLabel16);
        jLabel16.setBounds(10, 170, 80, 25);
        jFrame3.getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 174, 130, 20);

        jFrame4.setTitle("Юность");
        jFrame4.setMinimumSize(new java.awt.Dimension(442, 294));
        jFrame4.setResizable(false);
        jFrame4.setLocationRelativeTo(null);
        jFrame4.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                jFrame4WindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                jFrame4WindowClosing(evt);
            }
        });
        jFrame4.getContentPane().setLayout(null);

        jButton7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jButton7.setText("Вперед");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jFrame4.getContentPane().add(jButton7);
        jButton7.setBounds(170, 200, 111, 31);

        jButton8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jButton8.setText("Назад");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jFrame4.getContentPane().add(jButton8);
        jButton8.setBounds(20, 200, 100, 31);

        jComboBox1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Фэнтези", "Детектив", "Комедия" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jFrame4.getContentPane().add(jComboBox1);
        jComboBox1.setBounds(20, 50, 130, 29);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setText("Выберите ваш любимый  ");
        jFrame4.getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 20, 308, 23);

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jFrame4.getContentPane().add(jLabel10);
        jLabel10.setBounds(200, 160, 210, 31);
        jFrame4.getContentPane().add(jLabel11);
        jLabel11.setBounds(170, 50, 164, 134);

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel17.setText("жанр кино");
        jFrame4.getContentPane().add(jLabel17);
        jLabel17.setBounds(240, 20, 110, 23);
        jFrame4.getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 90, 130, 40);

        jFrame5.setTitle("Результаты");
        jFrame5.setIconImage(java.awt.Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png")));
        jFrame5.setMinimumSize(new java.awt.Dimension(357, 326));
        jFrame5.setResizable(false);
        jFrame5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jFrame5MouseClicked(evt);
            }
        });
        jFrame5.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                jFrame5WindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                jFrame5WindowClosing(evt);
            }
        });
        jFrame5.getContentPane().setLayout(null);

        jButton9.setText("Назад");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jFrame5.getContentPane().add(jButton9);
        jButton9.setBounds(10, 260, 135, 23);

        jButton10.setText("ВЫХОД");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jFrame5.getContentPane().add(jButton10);
        jButton10.setBounds(180, 260, 135, 23);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Вопросы", "Ваши ответы"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.getTableHeader().setReorderingAllowed(false);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
        }

        jFrame5.getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 100, 300, 150);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("<html>\n<p align=\"center\">\nСпасибо что воспользовались\nнашей системой!\n</p>");
        jLabel5.setToolTipText("");
        jFrame5.getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 10, 250, 70);

        jFrame5.setLocationRelativeTo(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Приветствие");
        setIconImage(java.awt.Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png")));
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setText("<html>\n<p align=\"center\">\n <h1>Вас приветствует система быстрого анкетирования!</h1>  <br> <br> <br> <h3><cite><p align=\"center\">Тема - Периоды жизни</cite></h3>\n</p> ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 0, 340, 190);

        jButton1.setText("Начать");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(200, 260, 135, 23);

        jButton2.setText("ВЫХОД");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 260, 135, 23);

        setSize(new java.awt.Dimension(357, 326));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        jFrame2.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(true);
        jFrame2.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
    }//GEN-LAST:event_formPropertyChange

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jFrame4.setVisible(true);
        jFrame5.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jFrame2.setVisible(false);
        jFrame3.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jFrame2WindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame2WindowClosing
        System.exit(0);
    }//GEN-LAST:event_jFrame2WindowClosing

    private void jFrame5WindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame5WindowClosing
        System.exit(0);
    }//GEN-LAST:event_jFrame5WindowClosing

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        jLabel6.setText("Выбрано: Черника");
        jLabel9.setIcon(new ImageIcon(jFrame1.class.getResource("morda0.png")));
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jLabel6.setText("Выбрано: Вишня");
        jLabel9.setIcon(new ImageIcon(jFrame1.class.getResource("morda1.png")));
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        jLabel6.setText("Выбрано: Арбуз");
        jLabel9.setIcon(new ImageIcon(jFrame1.class.getResource("morda2.png")));
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        jLabel6.setText("Выбрано: Земляника");
        jLabel9.setIcon(new ImageIcon(jFrame1.class.getResource("morda3.png")));
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jFrame5WindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame5WindowActivated
        jTable2.setValueAt("Ваша любимая ягода:", 0, 0);
        switch (buttonGroup1.getSelection().getActionCommand()) {
            case "0":
                jTable2.setValueAt("Черника", 0, 1);
                break;
            case "1":
                jTable2.setValueAt("Земляника", 0, 1);
                break;
            case "2":
                jTable2.setValueAt("Арбуз", 0, 1);
                break;
            case "3":
                jTable2.setValueAt("Вишня", 0, 1);
                break;
            case "4":
                jTable2.setValueAt("Клубника", 0, 1);
                break;
        }

        jTable2.setValueAt("Как вы учились в школе", 1, 0);
        switch (jList1.getAnchorSelectionIndex()) {
            case 0:
                jTable2.setValueAt("Отлично", 1, 1);
                break;
            case 1:
                jTable2.setValueAt("Хорошо", 1, 1);
                break;
            case 2:
                jTable2.setValueAt("Удовлетворительно", 1, 1);
                break;
            case 3:
                jTable2.setValueAt("Неудовлетворительно", 1, 1);
                break;
        }

        jTable2.setValueAt("Любимый жанр кино", 2, 0);
        switch (jComboBox1.getSelectedIndex()) {
            case 0:
                jTable2.setValueAt("Фэнтези", 2, 1);
                break;
            case 1:
                jTable2.setValueAt("Детектив", 2, 1);
                break;
            case 2:
                jTable2.setValueAt("Комедия", 2, 1);
                break;
        }
    }//GEN-LAST:event_jFrame5WindowActivated

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        // Переход на 2 окно, кнопка «Вперед»
        jFrame3.setVisible(false); // Спрятать главное окно 1
        jFrame4.setVisible(true); // Показать окно 2
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        //  кнопка «Назад»
        jFrame3.setVisible(false); // Спрятать окно 1
        jFrame2.setVisible(true); // Показать главное окно 1
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        switch (jList1.getSelectedIndex()) {
            case 0:
            jLabel3.setText("Отлично");
            jLabel19.setIcon(new ImageIcon(getClass().getResource("ruka0.jpg")));
            break;
            case 1:
            jLabel3.setText("Хорошо");
            jLabel19.setIcon(new ImageIcon(getClass().getResource("ruka1.jpg")));
            break;
            case 2:
            jLabel3.setText("Удовлетворительно");
            jLabel19.setIcon(new ImageIcon(getClass().getResource("ruka2.jpg")));
            break;
            case 3:
            jLabel3.setText("Неудовлетворительно");
            jLabel19.setIcon(new ImageIcon(getClass().getResource("ruka3.jpg")));
            break;

        }
    }//GEN-LAST:event_jList1ValueChanged

    private void jFrame3WindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame3WindowClosed
        System.exit(0);
    }//GEN-LAST:event_jFrame3WindowClosed

    private void jFrame3WindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame3WindowClosing
        System.exit(0);
    }//GEN-LAST:event_jFrame3WindowClosing

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        // Переход на 2 окно, кнопка «Вперед»
        jFrame4.setVisible(false); // Спрятать главное окно
        jFrame5.setVisible(true); // Показать окно 4
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        // кнопка «Назад»
        jFrame4.setVisible(false); // Спрятать окно 3
        jFrame3.setVisible(true); // Показать окно2
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        switch (jComboBox1.getSelectedIndex()) {

            case 0:
            jLabel4.setText("Выбрано: Фэнтези");
            jLabel11.setIcon(new ImageIcon(jFrame1.class.getResource("obr0.jpg")));
            break;
            case 1:
            jLabel4.setText("Выбрано: Детектив");
            jLabel11.setIcon(new ImageIcon(jFrame1.class.getResource("obr1.jpg")));
            break;
            case 2:
            jLabel4.setText("Выбрано: Комедия");
            jLabel11.setIcon(new ImageIcon(jFrame1.class.getResource("obr.png")));
            break;
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jFrame4WindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame4WindowClosed
        System.exit(0);
    }//GEN-LAST:event_jFrame4WindowClosed

    private void jFrame4WindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame4WindowClosing
        System.exit(0);
    }//GEN-LAST:event_jFrame4WindowClosing

    private void jFrame5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFrame5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jFrame5MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2MouseClicked

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        jLabel6.setText("Выбрано: Клубника"); 
jLabel9.setIcon(new ImageIcon(jFrame1.class.getResource("morda4.png")));
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrame1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JFrame jFrame5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
