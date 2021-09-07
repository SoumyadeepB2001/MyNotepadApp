//Notepad App for Windows using Java Swing in Netbeans

import java.awt.Color;
import java.awt.Font;
import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.UndoableEditEvent;
import javax.swing.undo.UndoManager;

public class Notepad extends javax.swing.JFrame {

    File filename; // this variable stores the current file in usage
    int n, z = 0;
    String s = "";
    Font f1 = new Font("Tahoma", Font.PLAIN, 13); // default font in the beginning
    String st = "Tahoma"; // default font Tahoma
    String style = "p"; // default font style- Plain
    int size = 13; // default font size in the beginning

    public Notepad() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Untitled");
        panel.setVisible(false);
        replab.setVisible(false);
        rt.setVisible(false);
        replacebut.setVisible(false);
        replaceall.setVisible(false);
        t.getDocument().addUndoableEditListener((UndoableEditEvent e) -> {
            um.addEdit(e.getEdit());
        });
    }

    // This method is called from within the constructor to initialize the form.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        t = new javax.swing.JTextArea();
        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ft = new javax.swing.JTextField();
        replab = new javax.swing.JLabel();
        rt = new javax.swing.JTextField();
        matchcheck = new javax.swing.JCheckBox();
        closebut = new javax.swing.JButton();
        findbut = new javax.swing.JButton();
        replacebut = new javax.swing.JButton();
        replaceall = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        newfile = new javax.swing.JMenuItem();
        open = new javax.swing.JMenuItem();
        save = new javax.swing.JMenuItem();
        saveas = new javax.swing.JMenuItem();
        print = new javax.swing.JMenuItem();
        close = new javax.swing.JMenuItem();
        edit = new javax.swing.JMenu();
        copy = new javax.swing.JMenuItem();
        cut = new javax.swing.JMenuItem();
        paste = new javax.swing.JMenuItem();
        undomenu = new javax.swing.JMenuItem();
        redomenu = new javax.swing.JMenuItem();
        find = new javax.swing.JMenuItem();
        replace = new javax.swing.JMenuItem();
        dateandtime = new javax.swing.JMenuItem();
        format = new javax.swing.JMenu();
        cb = new javax.swing.JCheckBoxMenuItem();
        font = new javax.swing.JMenu();
        algerian = new javax.swing.JMenuItem();
        arial = new javax.swing.JMenuItem();
        calibri = new javax.swing.JMenuItem();
        cambria = new javax.swing.JMenuItem();
        segoeui = new javax.swing.JMenuItem();
        tahoma = new javax.swing.JMenuItem();
        tnr = new javax.swing.JMenuItem();
        verdana = new javax.swing.JMenuItem();
        fontStyle = new javax.swing.JMenu();
        plain = new javax.swing.JMenuItem();
        bold = new javax.swing.JMenuItem();
        italics = new javax.swing.JMenuItem();
        bolditalics = new javax.swing.JMenuItem();
        fontSize = new javax.swing.JMenu();
        size8 = new javax.swing.JMenuItem();
        size9 = new javax.swing.JMenuItem();
        size10 = new javax.swing.JMenuItem();
        size11 = new javax.swing.JMenuItem();
        size12 = new javax.swing.JMenuItem();
        size13 = new javax.swing.JMenuItem();
        size14 = new javax.swing.JMenuItem();
        size16 = new javax.swing.JMenuItem();
        size18 = new javax.swing.JMenuItem();
        size20 = new javax.swing.JMenuItem();
        size24 = new javax.swing.JMenuItem();
        size26 = new javax.swing.JMenuItem();
        size28 = new javax.swing.JMenuItem();
        size36 = new javax.swing.JMenuItem();
        size48 = new javax.swing.JMenuItem();
        size72 = new javax.swing.JMenuItem();
        bgc = new javax.swing.JMenu();
        bluebgc = new javax.swing.JMenuItem();
        cyanbgc = new javax.swing.JMenuItem();
        magentabgc = new javax.swing.JMenuItem();
        yellowbgc = new javax.swing.JMenuItem();
        greenbgc = new javax.swing.JMenuItem();
        redbgc = new javax.swing.JMenuItem();
        pinkbgc = new javax.swing.JMenuItem();
        orangebgc = new javax.swing.JMenuItem();
        blackbgc = new javax.swing.JMenuItem();
        graybgc = new javax.swing.JMenuItem();
        lgraybgc = new javax.swing.JMenuItem();
        dgraybgc = new javax.swing.JMenuItem();
        whitebgc = new javax.swing.JMenuItem();
        fontcol = new javax.swing.JMenu();
        bluefc = new javax.swing.JMenuItem();
        cyanfc = new javax.swing.JMenuItem();
        magentafc = new javax.swing.JMenuItem();
        yellowfc = new javax.swing.JMenuItem();
        greenfc = new javax.swing.JMenuItem();
        redfc = new javax.swing.JMenuItem();
        pinkfc = new javax.swing.JMenuItem();
        orangefc = new javax.swing.JMenuItem();
        blackfc = new javax.swing.JMenuItem();
        grayfc = new javax.swing.JMenuItem();
        lgrayfc = new javax.swing.JMenuItem();
        dgrayfc = new javax.swing.JMenuItem();
        whitefc = new javax.swing.JMenuItem();
        help = new javax.swing.JMenu();
        contact = new javax.swing.JMenuItem();
        about = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setIconImages(null);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }

            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        t.setColumns(20);
        t.setRows(5);
        t.setBorder(null);
        t.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jScrollPane2.setViewportView(t);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setText("Find");

        ft.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ftKeyPressed(evt);
            }
        });

        replab.setFont(new java.awt.Font("Tahoma", 1, 14));
        replab.setText("Replace");

        rt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rtKeyPressed(evt);
            }
        });

        matchcheck.setSelected(true);
        matchcheck.setText("Match Case");
        matchcheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matchcheckActionPerformed(evt);
            }
        });

        closebut.setFont(new java.awt.Font("Tahoma", 1, 11));
        closebut.setForeground(new java.awt.Color(255, 0, 0));
        closebut.setText("X");
        closebut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebutActionPerformed(evt);
            }
        });

        findbut.setText("Find Next");
        findbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findbutActionPerformed(evt);
            }
        });

        replacebut.setText("Replace");
        replacebut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replacebutActionPerformed(evt);
            }
        });

        replaceall.setText("Replace All");
        replaceall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replaceallActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelLayout.createSequentialGroup().addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ft, javax.swing.GroupLayout.PREFERRED_SIZE, 109,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(findbut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(replab, javax.swing.GroupLayout.PREFERRED_SIZE, 61,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rt, javax.swing.GroupLayout.PREFERRED_SIZE, 109,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(replacebut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(replaceall)
                        .addGap(18, 18, 18).addComponent(matchcheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addComponent(closebut).addContainerGap()));
        panelLayout.setVerticalGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(replaceall).addComponent(replacebut)
                                .addComponent(rt, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(replab, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(matchcheck)
                                .addComponent(closebut, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ft)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(findbut, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 5, Short.MAX_VALUE)));

        file.setText("File");

        newfile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N,
                java.awt.event.InputEvent.CTRL_DOWN_MASK));
        newfile.setText("New File");
        newfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newfileActionPerformed(evt);
            }
        });
        file.add(newfile);

        open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O,
                java.awt.event.InputEvent.CTRL_DOWN_MASK));
        open.setText("Open File");
        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });
        file.add(open);

        save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S,
                java.awt.event.InputEvent.CTRL_DOWN_MASK));
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        file.add(save);

        saveas.setText("Save As");
        saveas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveasActionPerformed(evt);
            }
        });
        file.add(saveas);

        print.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P,
                java.awt.event.InputEvent.CTRL_DOWN_MASK));
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        file.add(print);

        close.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4,
                java.awt.event.InputEvent.ALT_DOWN_MASK));
        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        file.add(close);

        menuBar.add(file);

        edit.setText("Edit");

        copy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C,
                java.awt.event.InputEvent.CTRL_DOWN_MASK));
        copy.setText("Copy");
        copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyActionPerformed(evt);
            }
        });
        edit.add(copy);

        cut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X,
                java.awt.event.InputEvent.CTRL_DOWN_MASK));
        cut.setText("Cut");
        cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutActionPerformed(evt);
            }
        });
        edit.add(cut);

        paste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V,
                java.awt.event.InputEvent.CTRL_DOWN_MASK));
        paste.setText("Paste");
        paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteActionPerformed(evt);
            }
        });
        edit.add(paste);

        undomenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z,
                java.awt.event.InputEvent.CTRL_DOWN_MASK));
        undomenu.setText("Undo");
        undomenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undomenuActionPerformed(evt);
            }
        });
        edit.add(undomenu);

        redomenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y,
                java.awt.event.InputEvent.CTRL_DOWN_MASK));
        redomenu.setText("Redo");
        redomenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redomenuActionPerformed(evt);
            }
        });
        edit.add(redomenu);

        find.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F,
                java.awt.event.InputEvent.CTRL_DOWN_MASK));
        find.setText("Find");
        find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findActionPerformed(evt);
            }
        });
        edit.add(find);

        replace.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R,
                java.awt.event.InputEvent.CTRL_DOWN_MASK));
        replace.setText("Replace");
        replace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replaceActionPerformed(evt);
            }
        });
        edit.add(replace);

        dateandtime.setText("Date/Time");
        dateandtime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateandtimeActionPerformed(evt);
            }
        });
        edit.add(dateandtime);

        menuBar.add(edit);

        format.setText("Format");

        cb.setText("Wrap Text");
        cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbActionPerformed(evt);
            }
        });
        format.add(cb);

        font.setText("Font");

        algerian.setFont(new java.awt.Font("Algerian", 0, 12));
        algerian.setText("Algerian");
        algerian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                algerianActionPerformed(evt);
            }
        });
        font.add(algerian);

        arial.setFont(new java.awt.Font("Arial", 0, 12));
        arial.setText("Arial");
        arial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arialActionPerformed(evt);
            }
        });
        font.add(arial);

        calibri.setFont(new java.awt.Font("Calibri", 0, 12));
        calibri.setText("Calibri");
        calibri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calibriActionPerformed(evt);
            }
        });
        font.add(calibri);

        cambria.setFont(new java.awt.Font("Cambria", 0, 12));
        cambria.setText("Cambria");
        cambria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambriaActionPerformed(evt);
            }
        });
        font.add(cambria);

        segoeui.setText("Segoe UI");
        segoeui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segoeuiActionPerformed(evt);
            }
        });
        font.add(segoeui);

        tahoma.setFont(new java.awt.Font("Tahoma", 0, 12));
        tahoma.setText("Tahoma");
        tahoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tahomaActionPerformed(evt);
            }
        });
        font.add(tahoma);

        tnr.setFont(new java.awt.Font("Times New Roman", 0, 12));
        tnr.setText("Times New Roman");
        tnr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnrActionPerformed(evt);
            }
        });
        font.add(tnr);

        verdana.setFont(new java.awt.Font("Verdana", 0, 12));
        verdana.setText("Verdana");
        verdana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verdanaActionPerformed(evt);
            }
        });
        font.add(verdana);

        format.add(font);

        fontStyle.setText("Font Style");

        plain.setText("Plain");
        plain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plainActionPerformed(evt);
            }
        });
        fontStyle.add(plain);

        bold.setFont(new java.awt.Font("Segoe UI", 1, 12));
        bold.setText("Bold");
        bold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boldActionPerformed(evt);
            }
        });
        fontStyle.add(bold);

        italics.setFont(new java.awt.Font("Segoe UI", 2, 12));
        italics.setText("Italic");
        italics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                italicsActionPerformed(evt);
            }
        });
        fontStyle.add(italics);

        bolditalics.setFont(new java.awt.Font("Segoe UI", 3, 12));
        bolditalics.setText("Bold Italic");
        bolditalics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bolditalicsActionPerformed(evt);
            }
        });
        fontStyle.add(bolditalics);

        format.add(fontStyle);

        fontSize.setText("Font Size");

        size8.setText("8");
        size8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                size8ActionPerformed(evt);
            }
        });
        fontSize.add(size8);

        size9.setText("9");
        size9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                size9ActionPerformed(evt);
            }
        });
        fontSize.add(size9);

        size10.setText("10");
        size10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                size10ActionPerformed(evt);
            }
        });
        fontSize.add(size10);

        size11.setText("11");
        size11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                size11ActionPerformed(evt);
            }
        });
        fontSize.add(size11);

        size12.setText("12");
        size12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                size12ActionPerformed(evt);
            }
        });
        fontSize.add(size12);

        size13.setText("13");
        size13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                size13ActionPerformed(evt);
            }
        });
        fontSize.add(size13);

        size14.setText("14");
        size14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                size14ActionPerformed(evt);
            }
        });
        fontSize.add(size14);

        size16.setText("16");
        size16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                size16ActionPerformed(evt);
            }
        });
        fontSize.add(size16);

        size18.setText("18");
        size18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                size18ActionPerformed(evt);
            }
        });
        fontSize.add(size18);

        size20.setText("20");
        size20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                size20ActionPerformed(evt);
            }
        });
        fontSize.add(size20);

        size24.setText("24");
        size24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                size24ActionPerformed(evt);
            }
        });
        fontSize.add(size24);

        size26.setText("26");
        size26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                size26ActionPerformed(evt);
            }
        });
        fontSize.add(size26);

        size28.setText("28");
        size28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                size28ActionPerformed(evt);
            }
        });
        fontSize.add(size28);

        size36.setText("36");
        size36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                size36ActionPerformed(evt);
            }
        });
        fontSize.add(size36);

        size48.setText("48");
        size48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                size48ActionPerformed(evt);
            }
        });
        fontSize.add(size48);

        size72.setText("72");
        size72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                size72ActionPerformed(evt);
            }
        });
        fontSize.add(size72);

        format.add(fontSize);

        bgc.setText("Background Color");

        bluebgc.setText("Blue");
        bluebgc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bluebgcActionPerformed(evt);
            }
        });
        bgc.add(bluebgc);

        cyanbgc.setText("Cyan");
        cyanbgc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cyanbgcActionPerformed(evt);
            }
        });
        bgc.add(cyanbgc);

        magentabgc.setText("Magenta");
        magentabgc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                magentabgcActionPerformed(evt);
            }
        });
        bgc.add(magentabgc);

        yellowbgc.setText("Yellow");
        yellowbgc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yellowbgcActionPerformed(evt);
            }
        });
        bgc.add(yellowbgc);

        greenbgc.setText("Green");
        greenbgc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenbgcActionPerformed(evt);
            }
        });
        bgc.add(greenbgc);

        redbgc.setText("Red");
        redbgc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redbgcActionPerformed(evt);
            }
        });
        bgc.add(redbgc);

        pinkbgc.setText("Pink");
        pinkbgc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinkbgcActionPerformed(evt);
            }
        });
        bgc.add(pinkbgc);

        orangebgc.setText("Orange");
        orangebgc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orangebgcActionPerformed(evt);
            }
        });
        bgc.add(orangebgc);

        blackbgc.setText("Black");
        blackbgc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackbgcActionPerformed(evt);
            }
        });
        bgc.add(blackbgc);

        graybgc.setText("Gray");
        graybgc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graybgcActionPerformed(evt);
            }
        });
        bgc.add(graybgc);

        lgraybgc.setText("Light Gray");
        lgraybgc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lgraybgcActionPerformed(evt);
            }
        });
        bgc.add(lgraybgc);

        dgraybgc.setText("Dark Grey");
        dgraybgc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dgraybgcActionPerformed(evt);
            }
        });
        bgc.add(dgraybgc);

        whitebgc.setText("White");
        whitebgc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whitebgcActionPerformed(evt);
            }
        });
        bgc.add(whitebgc);

        format.add(bgc);

        fontcol.setText("Font Color");

        bluefc.setText("Blue");
        bluefc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bluefcActionPerformed(evt);
            }
        });
        fontcol.add(bluefc);

        cyanfc.setText("Cyan");
        cyanfc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cyanfcActionPerformed(evt);
            }
        });
        fontcol.add(cyanfc);

        magentafc.setText("Magenta");
        magentafc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                magentafcActionPerformed(evt);
            }
        });
        fontcol.add(magentafc);

        yellowfc.setText("Yellow");
        yellowfc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yellowfcActionPerformed(evt);
            }
        });
        fontcol.add(yellowfc);

        greenfc.setText("Green");
        greenfc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenfcActionPerformed(evt);
            }
        });
        fontcol.add(greenfc);

        redfc.setText("Red");
        redfc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redfcActionPerformed(evt);
            }
        });
        fontcol.add(redfc);

        pinkfc.setText("Pink");
        pinkfc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinkfcActionPerformed(evt);
            }
        });
        fontcol.add(pinkfc);

        orangefc.setText("Orange");
        orangefc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orangefcActionPerformed(evt);
            }
        });
        fontcol.add(orangefc);

        blackfc.setText("Black");
        blackfc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackfcActionPerformed(evt);
            }
        });
        fontcol.add(blackfc);

        grayfc.setText("Gray");
        grayfc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grayfcActionPerformed(evt);
            }
        });
        fontcol.add(grayfc);

        lgrayfc.setText("Light Gray");
        lgrayfc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lgrayfcActionPerformed(evt);
            }
        });
        fontcol.add(lgrayfc);

        dgrayfc.setText("Dark Grey");
        dgrayfc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dgrayfcActionPerformed(evt);
            }
        });
        fontcol.add(dgrayfc);

        whitefc.setText("White");
        whitefc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whitefcActionPerformed(evt);
            }
        });
        fontcol.add(whitefc);

        format.add(fontcol);

        menuBar.add(format);

        help.setText("Help");

        contact.setText("Contact Me");
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        help.add(contact);

        about.setText("About");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        help.add(about);

        menuBar.add(help);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2).addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap()));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void copyActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_copyActionPerformed

        t.copy();
    }// event_copyActionPerformed

    private void cutActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cutActionPerformed

        t.cut();
    }// event_cutActionPerformed

    private void pasteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_pasteActionPerformed

        t.paste();
    }// event_pasteActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_contactActionPerformed

        try {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler file:https://twitter.com/SoumyadeepB2001");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Browser not found");
        }
    }// event_contactActionPerformed

    private void findActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_findActionPerformed

        panel.setVisible(true);
        ft.requestFocus();
    }// event_findActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_aboutActionPerformed

        JOptionPane.showMessageDialog(null,
                "My Notepad Version: 2.0.1\nCreated by Soumyadeep Banerjee\nBSc. (Hons) Computer Science, 1st Year");
    }// event_aboutActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_closeActionPerformed

        int r = JOptionPane.showConfirmDialog(null,
                "Do you want to exit the application? All unsaved changes will be lost.", "Exit",
                JOptionPane.YES_NO_OPTION);
        if (r == JOptionPane.YES_OPTION)
            System.exit(0);
    }// event_closeActionPerformed

    private void closebutActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_closebutActionPerformed

        panel.setVisible(false);
        replab.setVisible(false);
        rt.setVisible(false);
        replacebut.setVisible(false);
        replaceall.setVisible(false);

    }// event_closebutActionPerformed

    private void replaceActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_replaceActionPerformed

        panel.setVisible(true);
        replab.setVisible(true);
        rt.setVisible(true);
        rt.requestFocus(); // requestfocus is here after rt.setVisible() because you can not requestfocus
                           // without it being visible
        replacebut.setVisible(true);
        replaceall.setVisible(true);
    }// event_replaceActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_printActionPerformed
        try {

            t.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Notepad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// event_printActionPerformed

    private void openActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_openActionPerformed

        JFileChooser j = new JFileChooser();
        int r = j.showOpenDialog(null);
        if (r == JFileChooser.APPROVE_OPTION) {
            File fi = new File(j.getSelectedFile().getAbsolutePath());
            filename = fi;
            try {
                // String
                String s1 = "", sl = "";

                // File reader
                FileReader fr = new FileReader(fi);

                // Buffered reader
                BufferedReader br = new BufferedReader(fr);

                // Initilize sl
                sl = br.readLine();

                // Take the input from the file
                while ((s1 = br.readLine()) != null) {
                    sl = sl + "\n" + s1;
                }

                // Set the text
                t.setText(sl);
                this.setTitle(filename.getName());
            } catch (Exception ex) {
                Logger.getLogger(Notepad.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }// event_openActionPerformed

    private void newfileActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_newfileActionPerformed
        // TODO add your handling code here
        int YesOrNo = JOptionPane.showConfirmDialog(null, "Do you want to create a new file?", "New File",
                JOptionPane.YES_NO_OPTION);
        if (YesOrNo == 0) {
            t.setText("");
            filename = null;
            this.setTitle("Untitled");
        }
    }// event_newfileActionPerformed

    private void findbutActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_findbutActionPerformed

        if (t.getText().length() != 0 && ft.getText().length() != 0 && matchcheck.isSelected()) {
            s = ft.getText();
            if (!t.getText().contains(s))
                JOptionPane.showMessageDialog(null, "Search key not found");
            else {
                t.requestFocus();
                if (z == 0) {
                    z++;
                    t.select(t.getText().indexOf(s), t.getText().indexOf(s) + s.length());
                } else
                    t.select(n, n + s.length());

                n = t.getText().indexOf(s, (n + s.length())); // fromindexof

                if (n < 0)
                    n = t.getText().indexOf(s);
            }
        } else if (t.getText().length() != 0 && ft.getText().length() != 0 && !matchcheck.isSelected()) {
            s = ft.getText().toLowerCase();
            if (!t.getText().toLowerCase().contains(s))
                JOptionPane.showMessageDialog(null, "Not Found");
            else {
                t.requestFocus();
                if (z == 0) {
                    z++;
                    t.select(t.getText().toLowerCase().indexOf(s), t.getText().toLowerCase().indexOf(s) + s.length());
                } else
                    t.select(n, n + s.length());

                n = t.getText().toLowerCase().indexOf(s, (n + s.length())); // fromindexof

                if (n < 0)
                    n = t.getText().toLowerCase().indexOf(s);
            }
        } else
            JOptionPane.showMessageDialog(null, "Nothing to search");

    }// event_findbutActionPerformed

    public void savefile() {
        JFileChooser j = new JFileChooser();
        int r = j.showSaveDialog(null);
        if (r == JFileChooser.APPROVE_OPTION) {

            // Set the label to the path of the selected directory
            File fi = new File(j.getSelectedFile().getAbsolutePath());
            filename = fi;
            try {
                // Create a file writer
                FileWriter wr = new FileWriter(fi, false);

                // Create buffered writer to write
                BufferedWriter w = new BufferedWriter(wr);
                t.write(w);

                w.flush();
                w.close();
                this.setTitle(filename.getName());
            } catch (IOException ex) {
                Logger.getLogger(Notepad.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void saveasActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_saveasActionPerformed

        savefile();
    }// event_saveasActionPerformed

    private void undomenuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_undomenuActionPerformed

        um.undo();
    }// event_undomenuActionPerformed

    private void redomenuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_redomenuActionPerformed

        um.redo();
    }// event_redomenuActionPerformed

    private void bluebgcActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bluebgcActionPerformed

        t.setBackground(Color.blue);
    }// event_bluebgcActionPerformed

    private void yellowbgcActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_yellowbgcActionPerformed

        t.setBackground(Color.yellow);
    }// event_yellowbgcActionPerformed

    private void redbgcActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_redbgcActionPerformed

        t.setBackground(Color.red);
    }// event_redbgcActionPerformed

    private void greenbgcActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_greenbgcActionPerformed

        t.setBackground(Color.green);
    }// event_greenbgcActionPerformed

    private void pinkbgcActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_pinkbgcActionPerformed

        t.setBackground(Color.pink);
    }// event_pinkbgcActionPerformed

    private void blackbgcActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_blackbgcActionPerformed

        t.setBackground(Color.black);
    }// event_blackbgcActionPerformed

    private void whitebgcActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_whitebgcActionPerformed

        t.setBackground(Color.white);
    }// event_whitebgcActionPerformed

    private void orangebgcActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_orangebgcActionPerformed

        t.setBackground(Color.orange);
    }// event_orangebgcActionPerformed

    private void cyanbgcActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cyanbgcActionPerformed

        t.setBackground(Color.cyan);
    }// event_cyanbgcActionPerformed

    private void magentabgcActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_magentabgcActionPerformed

        t.setBackground(Color.magenta);
    }// event_magentabgcActionPerformed

    private void graybgcActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_graybgcActionPerformed

        t.setBackground(Color.gray);
    }// event_graybgcActionPerformed

    private void lgraybgcActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_lgraybgcActionPerformed

        t.setBackground(Color.LIGHT_GRAY);
    }// event_lgraybgcActionPerformed

    private void dgraybgcActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_dgraybgcActionPerformed

        t.setBackground(Color.DARK_GRAY);
    }// event_dgraybgcActionPerformed

    private void bluefcActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bluefcActionPerformed

        t.setForeground(Color.blue);
    }// event_bluefcActionPerformed

    private void cyanfcActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cyanfcActionPerformed

        t.setForeground(Color.cyan);
    }// event_cyanfcActionPerformed

    private void magentafcActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_magentafcActionPerformed

        t.setForeground(Color.magenta);
    }// event_magentafcActionPerformed

    private void yellowfcActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_yellowfcActionPerformed

        t.setForeground(Color.yellow);
    }// event_yellowfcActionPerformed

    private void greenfcActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_greenfcActionPerformed

        t.setForeground(Color.green);
    }// event_greenfcActionPerformed

    private void redfcActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_redfcActionPerformed

        t.setForeground(Color.red);
    }// event_redfcActionPerformed

    private void pinkfcActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_pinkfcActionPerformed

        t.setForeground(Color.pink);
    }// event_pinkfcActionPerformed

    private void orangefcActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_orangefcActionPerformed

        t.setForeground(Color.orange);
    }// event_orangefcActionPerformed

    private void blackfcActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_blackfcActionPerformed

        t.setForeground(Color.black);
    }// event_blackfcActionPerformed

    private void grayfcActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_grayfcActionPerformed

        t.setForeground(Color.gray);
    }// event_grayfcActionPerformed

    private void lgrayfcActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_lgrayfcActionPerformed

        t.setForeground(Color.LIGHT_GRAY);
    }// event_lgrayfcActionPerformed

    private void dgrayfcActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_dgrayfcActionPerformed

        t.setForeground(Color.DARK_GRAY);
    }// event_dgrayfcActionPerformed

    private void whitefcActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_whitefcActionPerformed

        t.setForeground(Color.white);
    }// event_whitefcActionPerformed

    private void matchcheckActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_matchcheckActionPerformed

    }// event_matchcheckActionPerformed

    private void plainActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_plainActionPerformed

        style = "p";
        setFont();
    }// event_plainActionPerformed

    public void setFont() {

        switch (style) {
            case "p":
                f1 = new Font(st, Font.PLAIN, size);
                break;
            case "b":
                f1 = new Font(st, Font.BOLD, size);
                break;
            case "i":
                f1 = new Font(st, Font.ITALIC, size);
                break;
            case "bi":
                f1 = new Font(st, Font.ITALIC | Font.BOLD, size);
                break;
        }
        t.setFont(f1);
    }

    private void cbActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cbActionPerformed

        if (cb.isSelected()) {
            t.setLineWrap(true);
            t.setWrapStyleWord(true);
        } else {
            t.setLineWrap(false);
            t.setWrapStyleWord(false);
        }
    }// event_cbActionPerformed

    private void ftKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_ftKeyPressed

        z = 0;
        n = 0;
    }// event_ftKeyPressed

    private void replacebutActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_replacebutActionPerformed

        if (ft.getText().length() > 0 && rt.getText().length() > 0 && t.getSelectionStart() - t.getSelectionEnd() != 0)
            t.replaceRange(rt.getText(), t.getSelectionStart(), t.getSelectionEnd());
        else
            JOptionPane.showMessageDialog(null, "Nothing to search and replace");
    }// event_replacebutActionPerformed

    private void boldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_boldActionPerformed

        style = "b";
        setFont();
    }// event_boldActionPerformed

    private void replaceallActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_replaceallActionPerformed

        if (ft.getText().length() > 0 && t.getText().length() > 0 && rt.getText().length() > 0
                && matchcheck.isSelected()) {
            s = ft.getText();
            if (!t.getText().contains(s))
                JOptionPane.showMessageDialog(null, "Not Found");
            else {
                while (true) {
                    t.requestFocus();
                    if (z == 0) {
                        z++;
                        t.select(t.getText().indexOf(s), t.getText().indexOf(s) + s.length());
                    } else
                        t.select(n, n + s.length());
                    t.replaceRange(rt.getText(), t.getSelectionStart(), t.getSelectionEnd());
                    n = t.getText().indexOf(s, (n + s.length())); // fromindexof

                    if (n < 0)
                        break;
                }
            }
        } else if (ft.getText().length() > 0 && t.getText().length() > 0 && rt.getText().length() > 0
                && !matchcheck.isSelected()) {
            s = ft.getText().toLowerCase();
            if (!t.getText().contains(s))
                JOptionPane.showMessageDialog(null, "Not Found");
            while (true) {
                t.requestFocus();
                if (z == 0) {
                    z++;
                    t.select(t.getText().indexOf(s), t.getText().indexOf(s) + s.length());
                } else
                    t.select(n, n + s.length());
                t.replaceRange(rt.getText(), t.getSelectionStart(), t.getSelectionEnd());
                n = t.getText().toLowerCase().indexOf(s, (n + s.length())); // fromindexof

                if (n < 0)
                    break;
            }
        } else
            JOptionPane.showMessageDialog(null, "Nothing to search and replace");
    }// event_replaceallActionPerformed

    private void rtKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_rtKeyPressed

        z = 0;
        n = 0;
    }// event_rtKeyPressed

    private void arialActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_arialActionPerformed

        st = "Arial";
        setFont();
    }// event_arialActionPerformed

    private void algerianActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_algerianActionPerformed

        st = "Algerian";
        setFont();
    }// event_algerianActionPerformed

    private void tnrActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_tnrActionPerformed

        st = "Times New Roman";
        setFont();
    }// event_tnrActionPerformed

    private void italicsActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_italicsActionPerformed

        style = "i";
        setFont();
    }// event_italicsActionPerformed

    private void bolditalicsActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bolditalicsActionPerformed

        style = "bi";
        setFont();
    }// event_bolditalicsActionPerformed

    private void size8ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_size8ActionPerformed

        size = 8;
        setFont();
    }// event_size8ActionPerformed

    private void size9ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_size9ActionPerformed

        size = 9;
        setFont();
    }// event_size9ActionPerformed

    private void size10ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_size10ActionPerformed

        size = 10;
        setFont();
    }// event_size10ActionPerformed

    private void size11ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_size11ActionPerformed

        size = 11;
        setFont();
    }// event_size11ActionPerformed

    private void size12ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_size12ActionPerformed

        size = 12;
        setFont();
    }// event_size12ActionPerformed

    private void size14ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_size14ActionPerformed

        size = 14;
        setFont();
    }// event_size14ActionPerformed

    private void size16ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_size16ActionPerformed

        size = 16;
        setFont();
    }// event_size16ActionPerformed

    private void size18ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_size18ActionPerformed

        size = 18;
        setFont();
    }// event_size18ActionPerformed

    private void size20ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_size20ActionPerformed

        size = 20;
        setFont();
    }// event_size20ActionPerformed

    private void size24ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_size24ActionPerformed

        size = 24;
        setFont();
    }// event_size24ActionPerformed

    private void size26ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_size26ActionPerformed

        size = 26;
        setFont();
    }// event_size26ActionPerformed

    private void size28ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_size28ActionPerformed

        size = 28;
        setFont();
    }// event_size28ActionPerformed

    private void size36ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_size36ActionPerformed

        size = 36;
        setFont();
    }// event_size36ActionPerformed

    private void size48ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_size48ActionPerformed

        size = 48;
        setFont();
    }// event_size48ActionPerformed

    private void size72ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_size72ActionPerformed

        size = 72;
        setFont();
    }// event_size72ActionPerformed

    private void cambriaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cambriaActionPerformed

        st = "Cambria";
        setFont();
    }// event_cambriaActionPerformed

    private void calibriActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_calibriActionPerformed

        st = "Calibri";
        setFont();
    }// event_calibriActionPerformed

    private void verdanaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_verdanaActionPerformed

        st = "Verdana";
        setFont();
    }// event_verdanaActionPerformed

    private void segoeuiActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_segoeuiActionPerformed

        st = "Segoe UI";
        setFont();
    }// event_segoeuiActionPerformed

    private void tahomaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_tahomaActionPerformed

        st = "Tahoma";
        setFont();
    }// event_tahomaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowOpened

        t.setFont(f1);
    }// event_formWindowOpened

    private void size13ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_size13ActionPerformed

        size = 13;
        setFont();
    }// event_size13ActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_saveActionPerformed

        if (filename == null)
            savefile();
        else {
            try {
                // Create a file writer
                FileWriter wr = new FileWriter(filename, false);

                // Create buffered writer to write
                BufferedWriter w = new BufferedWriter(wr);
                t.write(w);

                w.flush();
                w.close();
            } catch (IOException ex) {
                Logger.getLogger(Notepad.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }// event_saveActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowClosing

        int r = JOptionPane.showConfirmDialog(null,
                "Do you want to exit the application? All unsaved changes will be lost.", "Exit",
                JOptionPane.YES_NO_OPTION);
        if (r == JOptionPane.YES_OPTION)
            System.exit(0);
    }// event_formWindowClosing

    private void dateandtimeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_dateandtimeActionPerformed

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy h:mm a");
        LocalDateTime now = LocalDateTime.now();
        t.insert(dtf.format(now), t.getCaretPosition());
    }// event_dateandtimeActionPerformed

    /**
     * @param args the command line arguments
     */
    UndoManager um = new UndoManager();

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notepad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JMenuItem arial;
    private javax.swing.JMenuItem bold;
    private javax.swing.JMenuItem bolditalics;
    private javax.swing.JCheckBoxMenuItem cb;
    private javax.swing.JMenuItem close;
    private javax.swing.JButton closebut;
    private javax.swing.JMenuItem copy;
    private javax.swing.JMenuItem cut;
    private javax.swing.JMenu edit;
    private javax.swing.JMenu file;
    private javax.swing.JMenuItem find;
    private javax.swing.JButton findbut;
    private javax.swing.JTextField ft;
    private javax.swing.JMenu help;
    private javax.swing.JMenuItem italics;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu format;
    private javax.swing.JMenu bgc;
    private javax.swing.JMenu fontcol;
    private javax.swing.JMenu font;
    private javax.swing.JMenu fontStyle;
    private javax.swing.JMenu fontSize;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem algerian;
    private javax.swing.JMenuItem yellowbgc;
    private javax.swing.JMenuItem redbgc;
    private javax.swing.JMenuItem pinkbgc;
    private javax.swing.JMenuItem blackbgc;
    private javax.swing.JMenuItem whitebgc;
    private javax.swing.JMenuItem orangebgc;
    private javax.swing.JMenuItem cyanbgc;
    private javax.swing.JMenuItem magentabgc;
    private javax.swing.JMenuItem graybgc;
    private javax.swing.JMenuItem lgraybgc;
    private javax.swing.JMenuItem cambria;
    private javax.swing.JMenuItem dgraybgc;
    private javax.swing.JMenuItem calibri;
    private javax.swing.JMenuItem verdana;
    private javax.swing.JMenuItem segoeui;
    private javax.swing.JMenuItem size8;
    private javax.swing.JMenuItem size9;
    private javax.swing.JMenuItem size10;
    private javax.swing.JMenuItem size11;
    private javax.swing.JMenuItem size12;
    private javax.swing.JMenuItem size14;
    private javax.swing.JMenuItem contact;
    private javax.swing.JMenuItem size16;
    private javax.swing.JMenuItem size18;
    private javax.swing.JMenuItem size20;
    private javax.swing.JMenuItem size24;
    private javax.swing.JMenuItem bluefc;
    private javax.swing.JMenuItem cyanfc;
    private javax.swing.JMenuItem magentafc;
    private javax.swing.JMenuItem yellowfc;
    private javax.swing.JMenuItem greenfc;
    private javax.swing.JMenuItem redfc;
    private javax.swing.JMenuItem about;
    private javax.swing.JMenuItem pinkfc;
    private javax.swing.JMenuItem orangefc;
    private javax.swing.JMenuItem blackfc;
    private javax.swing.JMenuItem grayfc;
    private javax.swing.JMenuItem lgrayfc;
    private javax.swing.JMenuItem dgrayfc;
    private javax.swing.JMenuItem whitefc;
    private javax.swing.JMenuItem size26;
    private javax.swing.JMenuItem size28;
    private javax.swing.JMenuItem size36;
    private javax.swing.JMenuItem greenbgc;
    private javax.swing.JMenuItem size48;
    private javax.swing.JMenuItem size72;
    private javax.swing.JMenuItem tahoma;
    private javax.swing.JMenuItem size13;
    private javax.swing.JMenuItem dateandtime;
    private javax.swing.JMenuItem bluebgc;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox matchcheck;
    private javax.swing.JMenuItem newfile;
    private javax.swing.JMenuItem open;
    private javax.swing.JPanel panel;
    private javax.swing.JMenuItem paste;
    private javax.swing.JMenuItem plain;
    private javax.swing.JMenuItem print;
    private javax.swing.JMenuItem redomenu;
    private javax.swing.JLabel replab;
    private javax.swing.JMenuItem replace;
    private javax.swing.JButton replaceall;
    private javax.swing.JButton replacebut;
    private javax.swing.JTextField rt;
    private javax.swing.JMenuItem save;
    private javax.swing.JMenuItem saveas;
    private javax.swing.JTextArea t;
    private javax.swing.JMenuItem tnr;
    private javax.swing.JMenuItem undomenu;
    // End of variables declaration
}
