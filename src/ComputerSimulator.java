import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ComputerSimulator extends JFrame {
    private short R0;    //Stores GPR0 value
    private short R1;    //Stores GPR1 value
    private short R2;    //Stores GPR2 value
    private short R3;    //Stores GPR3 value
    private short FR0;    //Stores FR0 value
    private short FR1;    //Stores FR1 value
    private short X1;    //Stores IXR1 value
    private short X2;    //Stores IXR2 value
    private short X3;    //Stores IXR3 value
    private short PC;    //Stores PC value
    private short MAR;   //Stores MAR value
    private short MBR;   //Stores MBR value
    private short IR;    //Stores IR value
    private short MFR;   //Stores MFR value
    private short CC0;    //Stores CC0-OverFlow value
    private short CC1;    //Stores CC1-UnderFlow value
    private short CC2;    //Stores CC2-DivZero value
    private short CC3;    //Stores CC3-EqualOrNot value
    public short InputSignal; //Stores Input Signal status
    public short InputVal; //Stores Input Value

    /**
     * Creates new form ComputerSimulator
     */
    public ComputerSimulator() {
        initComponents();
        R0 = 0;
        R1 = 0;
        R2 = 0;
        R3 = 0;
        FR0 = 0;
        FR1 = 0;
        X1 = 0;
        X2 = 0;
        X3 = 0;
        PC = 0;
        MAR = 0;
        MBR = 0;
        IR = 0;
        MFR = 0;
        CC0 = 0;
        CC1 = 0;
        CC2 = 0;
        CC3 = 0;
        InputSignal = 0;
        InputVal = 0;
    }

    public static short[] memory = new short[2048];
    static JFrame f;
    static JButton Store, Load, Clear_All, SS, Run, Init, Custom_Init;
    static GridLayout G_Layout, G_Layout1, G_Layout2, G_Layout3;
    static JLabel JLabel_Halt, JLabel_Run, JLabel_R0, JLabel_R1, JLabel_R3, JLabel_R2;
    static JButton[] R_0_Buttons, Address_b;
    static JTextField t1, t2, t3;
    static JPanel JPanel_Func, JPanel_OPT, JPanel_Init, Halt_Display, JPanel_Run, JPanel_Display, JPanel_Grid1, JPanel_Grid2;
    static JButton Load1, Load2, Load3, Load_R1;
    static JPanel JPanelMain, JPanel_R1;
    static JLabel JLabel_IR;
    static JPanel JPanel_IR;
    static JButton Load_IR;
    static JButton IR_0;
    static JButton IR_1;
    static JButton IR_10;
    static JButton IR_11;
    static JButton IR_12;
    static JButton IR_13;
    static JButton IR_14;
    static JButton IR_15;
    static JButton IR_2;
    static JButton IR_3;
    static JButton IR_4;
    static JButton IR_5;
    static JButton IR_6;
    static JButton IR_7;
    static JButton IR_8;
    static JButton IR_9;
    static JPanel JPanel_R0;
    static JButton Load_R0;
    static JButton R0_0;
    static JButton R0_1;
    static JButton R0_10;
    static JButton R0_11;
    static JButton R0_12;
    static JButton R0_13;
    static JButton R0_14;
    static JButton R0_15;
    static JButton R0_2;
    static JButton R0_3;
    static JButton R0_4;
    static JButton R0_5;
    static JButton R0_6;
    static JButton R0_7;
    static JButton R0_8;
    static JButton R0_9;
    static JButton R1_0;
    static JButton R1_1;
    static JButton R1_10;
    static JButton R1_11;
    static JButton R1_12;
    static JButton R1_13;
    static JButton R1_14;
    static JButton R1_15;
    static JButton R1_2;
    static JButton R1_3;
    static JButton R1_4;
    static JButton R1_5;
    static JButton R1_6;
    static JButton R1_7;
    static JButton R1_8;
    static JButton R1_9;
    static JPanel JPanel_R2;
    static JButton Load_R2;
    static JButton R2_0;
    static JButton R2_1;
    static JButton R2_10;
    static JButton R2_11;
    static JButton R2_12;
    static JButton R2_13;
    static JButton R2_14;
    static JButton R2_15;
    static JButton R2_2;
    static JButton R2_3;
    static JButton R2_4;
    static JButton R2_5;
    static JButton R2_6;
    static JButton R2_7;
    static JButton R2_8;
    static JButton R2_9;
    static JPanel JPanel_R3;
    static JButton Load_R3;
    static JButton R3_0;
    static JButton R3_1;
    static JButton R3_10;
    static JButton R3_11;
    static JButton R3_12;
    static JButton R3_13;
    static JButton R3_14;
    static JButton R3_15;
    static JButton R3_2;
    static JButton R3_3;
    static JButton R3_4;
    static JButton R3_5;
    static JButton R3_6;
    static JButton R3_7;
    static JButton R3_8;
    static JButton R3_9;
    static JLabel JLabel_PC;
    static JPanel JPanel_PC;
    static JButton Load_PC;
    static JButton PC_0;
    static JButton PC_1;
    static JButton PC_10;
    static JButton PC_11;
    static JButton PC_2;
    static JButton PC_3;
    static JButton PC_4;
    static JButton PC_5;
    static JButton PC_6;
    static JButton PC_7;
    static JButton PC_8;
    static JButton PC_9;
    static JLabel JLabel_MAR;
    static JPanel JPanel_MAR;
    static JButton Load_MAR;
    static JButton MAR_0;
    static JButton MAR_1;
    static JButton MAR_10;
    static JButton MAR_11;
    static JButton MAR_2;
    static JButton MAR_3;
    static JButton MAR_4;
    static JButton MAR_5;
    static JButton MAR_6;
    static JButton MAR_7;
    static JButton MAR_8;
    static JButton MAR_9;
    static JPanel JPanel_MBR;
    static JLabel JLabel_MBR;
    static JButton Load_MBR;
    static JButton MBR_0;
    static JButton MBR_1;
    static JButton MBR_10;
    static JButton MBR_11;
    static JButton MBR_12;
    static JButton MBR_13;
    static JButton MBR_14;
    static JButton MBR_15;
    static JButton MBR_2;
    static JButton MBR_3;
    static JButton MBR_4;
    static JButton MBR_5;
    static JButton MBR_6;
    static JButton MBR_7;
    static JButton MBR_8;
    static JButton MBR_9;
    static JToggleButton OP_10;
    static JToggleButton OP_11;
    static JToggleButton OP_12;
    static JToggleButton OP_13;
    static JToggleButton OP_14;
    static JToggleButton OP_15;
    static JToggleButton GPR_8;
    static JToggleButton GPR_9;
    static JToggleButton IXR_6;
    static JToggleButton IXR_7;
    static JToggleButton I_5;
    static JToggleButton ADDRESS_0;
    static JToggleButton ADDRESS_1;
    static JToggleButton ADDRESS_2;
    static JToggleButton ADDRESS_3;
    static JToggleButton ADDRESS_4;
    static JPanel JPanel_OP;
    static JPanel JPanel_IXR;
    static JPanel JPanel_GPR;
    static JPanel JPanel_I;
    static JPanel JPanel_ADDRESS;
    static JPanel JPanel_INSTRUCTION;
    static JPanel JPanel_OP_Main;
    static JPanel JPanel_GPR_Main;
    static JPanel JPanel_IXR_Main;
    static JPanel JPanel_I_Main;
    static JPanel JPanel_ADDRESS_Main;
    static JPanel JPanel_X1;
    static JLabel JLabel_X1;
    static JButton Load_X1;
    static JButton X1_0;
    static JButton X1_1;
    static JButton X1_10;
    static JButton X1_11;
    static JButton X1_12;
    static JButton X1_13;
    static JButton X1_14;
    static JButton X1_15;
    static JButton X1_2;
    static JButton X1_3;
    static JButton X1_4;
    static JButton X1_5;
    static JButton X1_6;
    static JButton X1_7;
    static JButton X1_8;
    static JButton X1_9;
    static JPanel JPanel_X2;
    static JLabel JLabel_X2;
    static JButton Load_X2;
    static JButton X2_0;
    static JButton X2_1;
    static JButton X2_10;
    static JButton X2_11;
    static JButton X2_12;
    static JButton X2_13;
    static JButton X2_14;
    static JButton X2_15;
    static JButton X2_2;
    static JButton X2_3;
    static JButton X2_4;
    static JButton X2_5;
    static JButton X2_6;
    static JButton X2_7;
    static JButton X2_8;
    static JButton X2_9;
    static JPanel JPanel_X3;
    static JLabel JLabel_X3;
    static JButton Load_X3;
    static JButton X3_0;
    static JButton X3_1;
    static JButton X3_10;
    static JButton X3_11;
    static JButton X3_12;
    static JButton X3_13;
    static JButton X3_14;
    static JButton X3_15;
    static JButton X3_2;
    static JButton X3_3;
    static JButton X3_4;
    static JButton X3_5;
    static JButton X3_6;
    static JButton X3_7;
    static JButton X3_8;
    static JButton X3_9;
    static JPanel JPanel_MFR;
    static JButton MFR_3;
    static JButton MFR_2;
    static JButton MFR_1;
    static JButton MFR_0;
    static JLabel JLabel_MFR;
    static JPanel JPanel_CC;
    static JButton CC_3;
    static JButton CC_2;
    static JButton CC_1;
    static JButton CC_0;
    static JLabel JLabel_CC;

    public static void ADDRESS_0ActionPerformed(ActionEvent evt) {

    }

    private void Clear() {    //Clear LEDs
        PC_0.setText("0");
        PC_1.setText("0");
        PC_2.setText("0");
        PC_3.setText("0");
        PC_4.setText("0");
        PC_5.setText("0");
        PC_6.setText("0");
        PC_7.setText("0");
        PC_8.setText("0");
        PC_9.setText("0");
        PC_10.setText("0");
        PC_11.setText("0");
        MAR_0.setText("0");
        MAR_1.setText("0");
        MAR_2.setText("0");
        MAR_3.setText("0");
        MAR_4.setText("0");
        MAR_5.setText("0");
        MAR_6.setText("0");
        MAR_7.setText("0");
        MAR_8.setText("0");
        MAR_9.setText("0");
        MAR_10.setText("0");
        MAR_11.setText("0");
        MBR_0.setText("0");
        MBR_1.setText("0");
        MBR_2.setText("0");
        MBR_3.setText("0");
        MBR_4.setText("0");
        MBR_5.setText("0");
        MBR_6.setText("0");
        MBR_7.setText("0");
        MBR_8.setText("0");
        MBR_9.setText("0");
        MBR_10.setText("0");
        MBR_11.setText("0");
        MBR_12.setText("0");
        MBR_13.setText("0");
        MBR_14.setText("0");
        MBR_15.setText("0");
        IR_0.setText("0");
        IR_1.setText("0");
        IR_2.setText("0");
        IR_3.setText("0");
        IR_4.setText("0");
        IR_5.setText("0");
        IR_6.setText("0");
        IR_7.setText("0");
        IR_8.setText("0");
        IR_9.setText("0");
        IR_10.setText("0");
        IR_11.setText("0");
        IR_12.setText("0");
        IR_13.setText("0");
        IR_14.setText("0");
        IR_15.setText("0");
        PC_0.setBackground(Color.white);
        PC_1.setBackground(Color.white);
        PC_2.setBackground(Color.white);
        PC_3.setBackground(Color.white);
        PC_4.setBackground(Color.white);
        PC_5.setBackground(Color.white);
        PC_6.setBackground(Color.white);
        PC_7.setBackground(Color.white);
        PC_8.setBackground(Color.white);
        PC_9.setBackground(Color.white);
        PC_10.setBackground(Color.white);
        PC_11.setBackground(Color.white);
        MAR_0.setBackground(Color.white);
        MAR_1.setBackground(Color.white);
        MAR_2.setBackground(Color.white);
        MAR_3.setBackground(Color.white);
        MAR_4.setBackground(Color.white);
        MAR_5.setBackground(Color.white);
        MAR_6.setBackground(Color.white);
        MAR_7.setBackground(Color.white);
        MAR_8.setBackground(Color.white);
        MAR_9.setBackground(Color.white);
        MAR_10.setBackground(Color.white);
        MAR_11.setBackground(Color.white);
        MBR_0.setBackground(Color.white);
        MBR_1.setBackground(Color.white);
        MBR_2.setBackground(Color.white);
        MBR_3.setBackground(Color.white);
        MBR_4.setBackground(Color.white);
        MBR_5.setBackground(Color.white);
        MBR_6.setBackground(Color.white);
        MBR_7.setBackground(Color.white);
        MBR_8.setBackground(Color.white);
        MBR_9.setBackground(Color.white);
        MBR_10.setBackground(Color.white);
        MBR_11.setBackground(Color.white);
        MBR_12.setBackground(Color.white);
        MBR_13.setBackground(Color.white);
        MBR_14.setBackground(Color.white);
        MBR_15.setBackground(Color.white);
        IR_0.setBackground(Color.white);
        IR_1.setBackground(Color.white);
        IR_2.setBackground(Color.white);
        IR_3.setBackground(Color.white);
        IR_4.setBackground(Color.white);
        IR_5.setBackground(Color.white);
        IR_6.setBackground(Color.white);
        IR_7.setBackground(Color.white);
        IR_8.setBackground(Color.white);
        IR_9.setBackground(Color.white);
        IR_10.setBackground(Color.white);
        IR_11.setBackground(Color.white);
        IR_12.setBackground(Color.white);
        IR_13.setBackground(Color.white);
        IR_14.setBackground(Color.white);
        IR_15.setBackground(Color.white);
        Reset_Toggle_Instruction();
        Halt_Display.setBackground(Color.black);
        ;
    }

    private void LoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadActionPerformed
        MBR = (short) memory[MAR];

        Populate_MBR();
    }

    private void Clear_AllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear_LEDsActionPerformed
        Clear();
        Reset_Toggle_Instruction();
    }

    public double convertToFloat(int content) {
        double number;

        String bits = String.format("%16S", Integer.toBinaryString(content).replace(' ', '0'));
        bits = bits.replace(' ', '0');

        int S_Bit = Integer.parseInt(bits.substring(0, 1), 2);
        int Exponent = Integer.parseInt(bits.substring(1, 8), 2) - 63;
        int Mantissa = Integer.parseInt(bits.substring(8), 2);

        number = Mantissa * Math.pow(10, Exponent);

        if (S_Bit == 0) {
            number = 0 - number;
        }

//        System.out.println(convertToFloat("33538"));   // Sting 1100001100000010

        return number;
    }

    private void SSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SSActionPerformed
        new Thread(() -> {
            try {
                ExecuteInstruction();
            } catch (InterruptedException ex) {
                Logger.getLogger(ComputerSimulator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }).start();
    }//GEN-LAST:event_SSActionPerformed

    private void RunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RunActionPerformed
        new Thread(new Runnable() {
            @Override
            public void run() {
                JPanel_Run.setBackground(Color.red);
                short flag_Halt = 0;
                while (flag_Halt == 0) {
                    try {
                        System.out.println(IR + "y");
                        ExecuteInstruction();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ComputerSimulator.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if (IR == 0) {
                        break;
                    }
                }
            }
        }).start();
    }//GEN-LAST:event_RunActionPerformed

    private void Custom_InitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /*// Using this process to invoke the constructor,
        // JFileChooser points to user's default directory
        JFileChooser j = new JFileChooser();

        // Open the save dialog
        j.showOpenDialog(null);*/
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

        int returnValue = jfc.showOpenDialog(null);
        // short returnValue = jfc.showSaveDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = jfc.getSelectedFile();

            BufferedReader br = null;
            try {
                br = new BufferedReader(new FileReader(selectedFile));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ComputerSimulator.class.getName()).log(Level.SEVERE, null, ex);
            }
            String st;
            try {
                short flag_PC = 0;
                while ((st = br.readLine()) != null) {

                    String[] content = st.split(" ");
                    System.out.println(content[0] + content[1]);
                    short location = Short.parseShort(content[0], 16);
                    short value = Short.parseShort(content[1], 16);
                    System.out.println(location + " " + value);
                    memory[location] = value;
                    if (flag_PC == 0) {
                        flag_PC++;
                        PC = location;
                        Populate_PC();
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(ComputerSimulator.class.getName()).log(Level.SEVERE, null, ex);
            }
            Reset_Toggle_Instruction();
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void InitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INITActionPerformed
        File file = new File("Init.txt");
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ComputerSimulator.class.getName()).log(Level.SEVERE, null, ex);
        }
        String st;
        try {
            short flag_PC = 0;
            while ((st = br.readLine()) != null) {
                String[] content = st.split(" ");
                int location = Integer.parseInt(content[0], 16);
                int value = Integer.parseInt(content[1], 16);
                System.out.println(location + " " + value);

                memory[location] = (short) value;
                if (flag_PC == 0) {
                    flag_PC++;
                    PC = (short) location;
                    Populate_PC();
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(ComputerSimulator.class.getName()).log(Level.SEVERE, null, ex);
        }
        Reset_Toggle_Instruction();
    }//GEN-LAST:event_INITActionPerformed

    public void Populate_MFR() {
        String MFR_binary = Integer.toBinaryString(MFR);
        if (MFR_binary.length() >= 1 && MFR_binary.charAt(MFR_binary.length() - 1) == '1') {
            MFR_0.setText("1");
            MFR_0.setBackground(Color.red);
        } else {
            MFR_0.setText("0");
            MFR_0.setBackground(Color.white);
        }
        if (MFR_binary.length() >= 2 && MFR_binary.charAt(MFR_binary.length() - 2) == '1') {
            MFR_1.setText("1");
            MFR_1.setBackground(Color.red);
        } else {
            MFR_1.setText("0");
            MFR_1.setBackground(Color.white);
        }
        if (MFR_binary.length() >= 3 && MFR_binary.charAt(MFR_binary.length() - 3) == '1') {
            MFR_2.setText("1");
            MFR_2.setBackground(Color.red);
        } else {
            MFR_2.setText("0");
            MFR_2.setBackground(Color.white);
        }
        if (MFR_binary.length() >= 4 && MFR_binary.charAt(MFR_binary.length() - 4) == '1') {
            MFR_3.setText("1");
            MFR_3.setBackground(Color.red);
        } else {
            MFR_3.setText("0");
            MFR_3.setBackground(Color.white);
        }
    }

    public void Populate_PC() {
        String PC_binary = Integer.toBinaryString(PC);
        if (PC_binary.length() >= 1 && PC_binary.charAt(PC_binary.length() - 1) == '1') {
            PC_0.setText("1");
            PC_0.setBackground(Color.red);
        } else {
            PC_0.setText("0");
            PC_0.setBackground(Color.white);
        }
        if (PC_binary.length() >= 2 && PC_binary.charAt(PC_binary.length() - 2) == '1') {
            PC_1.setText("1");
            PC_1.setBackground(Color.red);
        } else {
            PC_1.setText("0");
            PC_1.setBackground(Color.white);
        }
        if (PC_binary.length() >= 3 && PC_binary.charAt(PC_binary.length() - 3) == '1') {
            PC_2.setText("1");
            PC_2.setBackground(Color.red);
        } else {
            PC_2.setText("0");
            PC_2.setBackground(Color.white);
        }
        if (PC_binary.length() >= 4 && PC_binary.charAt(PC_binary.length() - 4) == '1') {
            PC_3.setText("1");
            PC_3.setBackground(Color.red);
        } else {
            PC_3.setText("0");
            PC_3.setBackground(Color.white);
        }
        if (PC_binary.length() >= 5 && PC_binary.charAt(PC_binary.length() - 5) == '1') {
            PC_4.setText("1");
            PC_4.setBackground(Color.red);
        } else {
            PC_4.setText("0");
            PC_4.setBackground(Color.white);
        }
        if (PC_binary.length() >= 6 && PC_binary.charAt(PC_binary.length() - 6) == '1') {
            PC_5.setText("1");
            PC_5.setBackground(Color.red);
        } else {
            PC_5.setText("0");
            PC_5.setBackground(Color.white);
        }
        if (PC_binary.length() >= 7 && PC_binary.charAt(PC_binary.length() - 7) == '1') {
            PC_6.setText("1");
            PC_6.setBackground(Color.red);
        } else {
            PC_6.setText("0");
            PC_6.setBackground(Color.white);
        }
        if (PC_binary.length() >= 8 && PC_binary.charAt(PC_binary.length() - 8) == '1') {
            PC_7.setText("1");
            PC_7.setBackground(Color.red);
        } else {
            PC_7.setText("0");
            PC_7.setBackground(Color.white);
        }
        if (PC_binary.length() >= 9 && PC_binary.charAt(PC_binary.length() - 9) == '1') {
            PC_8.setText("1");
            PC_8.setBackground(Color.red);
        } else {
            PC_8.setText("0");
            PC_8.setBackground(Color.white);
        }
        if (PC_binary.length() >= 10 && PC_binary.charAt(PC_binary.length() - 10) == '1') {
            PC_9.setText("1");
            PC_9.setBackground(Color.red);
        } else {
            PC_9.setText("0");
            PC_9.setBackground(Color.white);
        }
        if (PC_binary.length() >= 11 && PC_binary.charAt(PC_binary.length() - 11) == '1') {
            PC_10.setText("1");
            PC_10.setBackground(Color.red);
        } else {
            PC_10.setText("0");
            PC_10.setBackground(Color.white);
        }
        if (PC_binary.length() >= 12 && PC_binary.charAt(PC_binary.length() - 12) == '1') {
            PC_11.setText("1");
            PC_11.setBackground(Color.red);
        } else {
            PC_11.setText("0");
            PC_11.setBackground(Color.white);
        }
    }

    public short getAddress(short x) {
        String x_binary = Integer.toBinaryString(x & 0xFFFF);
        if (x_binary.length() == 32) {
            x_binary = x_binary.substring(16, 32);
        }
        short address = 0;

        if (x_binary.length() >= 5 && x_binary.charAt(x_binary.length() - 5) == '1') {
            address += Math.pow(2, 4);
        }
        if (x_binary.length() >= 4 && x_binary.charAt(x_binary.length() - 4) == '1') {
            address += Math.pow(2, 3);
        }
        if (x_binary.length() >= 3 && x_binary.charAt(x_binary.length() - 3) == '1') {
            address += Math.pow(2, 2);
        }
        if (x_binary.length() >= 2 && x_binary.charAt(x_binary.length() - 2) == '1') {
            address += Math.pow(2, 1);
        }
        if (x_binary.length() >= 1 && x_binary.charAt(x_binary.length() - 1) == '1') {
            address += Math.pow(2, 0);
        }
        return address;
    }

    public boolean memoryOutofBoundCheck(short memoryAdr) { //MFR
        if (memoryAdr > 2056) {
            MFR = 8;
            PC = (short) (memory[1]);
            Populate_PC();


        } else if (memoryAdr > 0 && memoryAdr <= 5) {
            MFR = 1;
            PC = (short) (memory[1]);
            Populate_PC();


        } else {
            return false;
        }
        Populate_MFR();
        return true;
    }


    public void Populate_MBR() {
        String MBR_binary = Integer.toBinaryString(MBR);
        if (MBR_binary.length() >= 1 && MBR_binary.charAt(MBR_binary.length() - 1) == '1') {
            MBR_0.setText("1");
            MBR_0.setBackground(Color.red);
        } else {
            MBR_0.setText("0");
            MBR_0.setBackground(Color.white);
        }
        if (MBR_binary.length() >= 2 && MBR_binary.charAt(MBR_binary.length() - 2) == '1') {
            MBR_1.setText("1");
            MBR_1.setBackground(Color.red);
        } else {
            MBR_1.setText("0");
            MBR_1.setBackground(Color.white);
        }
        if (MBR_binary.length() >= 3 && MBR_binary.charAt(MBR_binary.length() - 3) == '1') {
            MBR_2.setText("1");
            MBR_2.setBackground(Color.red);
        } else {
            MBR_2.setText("0");
            MBR_2.setBackground(Color.white);
        }
        if (MBR_binary.length() >= 4 && MBR_binary.charAt(MBR_binary.length() - 4) == '1') {
            MBR_3.setText("1");
            MBR_3.setBackground(Color.red);
        } else {
            MBR_3.setText("0");
            MBR_3.setBackground(Color.white);
        }
        if (MBR_binary.length() >= 5 && MBR_binary.charAt(MBR_binary.length() - 5) == '1') {
            MBR_4.setText("1");
            MBR_4.setBackground(Color.red);
        } else {
            MBR_4.setText("0");
            MBR_4.setBackground(Color.white);
        }
        if (MBR_binary.length() >= 6 && MBR_binary.charAt(MBR_binary.length() - 6) == '1') {
            MBR_5.setText("1");
            MBR_5.setBackground(Color.red);
        } else {
            MBR_5.setText("0");
            MBR_5.setBackground(Color.white);
        }
        if (MBR_binary.length() >= 7 && MBR_binary.charAt(MBR_binary.length() - 7) == '1') {
            MBR_6.setText("1");
            MBR_6.setBackground(Color.red);
        } else {
            MBR_6.setText("0");
            MBR_6.setBackground(Color.white);
        }
        if (MBR_binary.length() >= 8 && MBR_binary.charAt(MBR_binary.length() - 8) == '1') {
            MBR_7.setText("1");
            MBR_7.setBackground(Color.red);
        } else {
            MBR_7.setText("0");
            MBR_7.setBackground(Color.white);
        }
        if (MBR_binary.length() >= 9 && MBR_binary.charAt(MBR_binary.length() - 9) == '1') {
            MBR_8.setText("1");
            MBR_8.setBackground(Color.red);
        } else {
            MBR_8.setText("0");
        }
        if (MBR_binary.length() >= 10 && MBR_binary.charAt(MBR_binary.length() - 10) == '1') {
            MBR_9.setText("1");
            MBR_9.setBackground(Color.red);
        } else {
            MBR_9.setText("0");
            MBR_9.setBackground(Color.white);
        }
        if (MBR_binary.length() >= 11 && MBR_binary.charAt(MBR_binary.length() - 11) == '1') {
            MBR_10.setText("1");
            MBR_10.setBackground(Color.red);
        } else {
            MBR_10.setText("0");
            MBR_10.setBackground(Color.white);
        }
        if (MBR_binary.length() >= 12 && MBR_binary.charAt(MBR_binary.length() - 12) == '1') {
            MBR_11.setText("1");
            MBR_11.setBackground(Color.red);
        } else {
            MBR_11.setText("0");
            MBR_11.setBackground(Color.white);
        }
        if (MBR_binary.length() >= 13 && MBR_binary.charAt(MBR_binary.length() - 13) == '1') {
            MBR_12.setText("1");
            MBR_12.setBackground(Color.red);
        } else {
            MBR_12.setText("0");
            MBR_12.setBackground(Color.white);
        }
        if (MBR_binary.length() >= 14 && MBR_binary.charAt(MBR_binary.length() - 14) == '1') {
            MBR_13.setText("1");
            MBR_13.setBackground(Color.red);
        } else {
            MBR_13.setText("0");
            MBR_13.setBackground(Color.white);
        }
        if (MBR_binary.length() >= 15 && MBR_binary.charAt(MBR_binary.length() - 15) == '1') {
            MBR_14.setText("1");
            MBR_14.setBackground(Color.red);
        } else {
            MBR_14.setText("0");
            MBR_14.setBackground(Color.white);
        }
        if (MBR_binary.length() >= 16 && MBR_binary.charAt(MBR_binary.length() - 16) == '1') {
            MBR_15.setText("1");
            MBR_15.setBackground(Color.red);
        } else {
            MBR_15.setText("0");
            MBR_15.setBackground(Color.white);
        }
    }

    private void StoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StoreActionPerformed
        memory[MAR] = MBR;
        Clear();
    }

    private void Load_X3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Load_X3ActionPerformed
        X3 = 0;
        if (ADDRESS_0.isSelected()) {
            X3_0.setText("1");
            X3 += Math.pow(2, 0);
            X3_0.setBackground(Color.red);
        } else {
            X3_0.setText("0");
            X3_0.setBackground(Color.white);
        }

        if (ADDRESS_1.isSelected()) {
            X3 += Math.pow(2, 1);
            X3_1.setText("1");
            X3_1.setBackground(Color.red);
        } else {
            X3_1.setText("0");
            X3_1.setBackground(Color.white);
        }

        if (ADDRESS_2.isSelected()) {
            X3 += Math.pow(2, 2);
            X3_2.setText("1");
            X3_2.setBackground(Color.red);
        } else {
            X3_2.setText("0");
            X3_2.setBackground(Color.white);
        }

        if (ADDRESS_3.isSelected()) {
            X3 += Math.pow(2, 3);
            X3_3.setText("1");
            X3_3.setBackground(Color.red);
        } else {
            X3_3.setText("0");
            X3_3.setBackground(Color.white);
        }

        if (ADDRESS_4.isSelected()) {
            X3 += Math.pow(2, 4);
            X3_4.setText("1");
            X3_4.setBackground(Color.red);
        } else {
            X3_4.setText("0");
            X3_4.setBackground(Color.white);
        }

        if (I_5.isSelected()) {
            X3 += Math.pow(2, 5);
            X3_5.setText("1");
            X3_5.setBackground(Color.red);
        } else {
            X3_5.setText("0");
            X3_5.setBackground(Color.white);
        }

        if (IXR_6.isSelected()) {
            X3 += Math.pow(2, 6);
            X3_6.setText("1");
            X3_6.setBackground(Color.red);
        } else {
            X3_6.setText("0");
            X3_6.setBackground(Color.white);
        }

        if (IXR_7.isSelected()) {
            X3 += Math.pow(2, 7);
            X3_7.setText("1");
            X3_7.setBackground(Color.red);
        } else {
            X3_7.setText("0");
            X3_7.setBackground(Color.white);
        }

        if (GPR_8.isSelected()) {
            X3 += Math.pow(2, 8);
            X3_8.setText("1");
            X3_8.setBackground(Color.red);
        } else {
            X3_8.setText("0");
            X3_8.setBackground(Color.white);
        }

        if (GPR_9.isSelected()) {
            X3 += Math.pow(2, 9);
            X3_9.setText("1");
            X3_9.setBackground(Color.red);
        } else {
            X3_9.setText("0");
            X3_9.setBackground(Color.white);
        }

        if (OP_10.isSelected()) {
            X3 += Math.pow(2, 10);
            X3_10.setText("1");
            X3_10.setBackground(Color.red);
        } else {
            X3_10.setText("0");
            X3_10.setBackground(Color.white);
        }

        if (OP_11.isSelected()) {
            X3 += Math.pow(2, 11);
            X3_11.setText("1");
            X3_11.setBackground(Color.red);
        } else {
            X3_11.setText("0");
            X3_11.setBackground(Color.white);
        }

        if (OP_12.isSelected()) {
            X3 += Math.pow(2, 12);
            X3_12.setText("1");
            X3_12.setBackground(Color.red);
        } else {
            X3_12.setText("0");
            X3_12.setBackground(Color.white);
        }

        if (OP_13.isSelected()) {
            X3 += Math.pow(2, 13);
            X3_13.setText("1");
            X3_13.setBackground(Color.red);
        } else {
            X3_13.setText("0");
            X3_13.setBackground(Color.white);
        }

        if (OP_14.isSelected()) {
            X3 += Math.pow(2, 14);
            X3_14.setText("1");
            X3_14.setBackground(Color.red);
        } else {
            X3_14.setText("0");
            X3_14.setBackground(Color.white);
        }

        if (OP_15.isSelected()) {
            X3 += Math.pow(2, 15);
            X3_15.setText("1");
            X3_15.setBackground(Color.red);
        } else {
            X3_15.setText("0");
            X3_15.setBackground(Color.white);
        }
        Reset_Toggle_Instruction();
    }//GEN-LAST:event_Load_X3ActionPerformed

    private void Load_X2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Load_X2ActionPerformed
        X2 = 0;
        if (ADDRESS_0.isSelected()) {
            X2_0.setText("1");
            X2 += Math.pow(2, 0);
            X2_0.setBackground(Color.red);
        } else {
            X2_0.setText("0");
            X2_0.setBackground(Color.white);
        }

        if (ADDRESS_1.isSelected()) {
            X2 += Math.pow(2, 1);
            X2_1.setText("1");
            X2_1.setBackground(Color.red);
        } else {
            X2_1.setText("0");
            X2_1.setBackground(Color.white);
        }

        if (ADDRESS_2.isSelected()) {
            X2 += Math.pow(2, 2);
            X2_2.setText("1");
            X2_2.setBackground(Color.red);
        } else {
            X2_2.setText("0");
            X2_2.setBackground(Color.white);
        }

        if (ADDRESS_3.isSelected()) {
            X2 += Math.pow(2, 3);
            X2_3.setText("1");
            X2_3.setBackground(Color.red);
        } else {
            X2_3.setText("0");
            X2_3.setBackground(Color.white);
        }

        if (ADDRESS_4.isSelected()) {
            X2 += Math.pow(2, 4);
            X2_4.setText("1");
            X2_4.setBackground(Color.red);
        } else {
            X2_4.setText("0");
            X2_4.setBackground(Color.white);
        }

        if (I_5.isSelected()) {
            X2 += Math.pow(2, 5);
            X2_5.setText("1");
            X2_5.setBackground(Color.red);
        } else {
            X2_5.setText("0");
            X2_5.setBackground(Color.white);
        }

        if (IXR_6.isSelected()) {
            X2 += Math.pow(2, 6);
            X2_6.setText("1");
            X2_6.setBackground(Color.red);
        } else {
            X2_6.setText("0");
            X2_6.setBackground(Color.white);
        }

        if (IXR_7.isSelected()) {
            X2 += Math.pow(2, 7);
            X2_7.setText("1");
            X2_7.setBackground(Color.red);
        } else {
            X2_7.setText("0");
            X2_7.setBackground(Color.white);
        }

        if (GPR_8.isSelected()) {
            X2 += Math.pow(2, 8);
            X2_8.setText("1");
            X2_8.setBackground(Color.red);
        } else {
            X2_8.setText("0");
            X2_8.setBackground(Color.white);
        }

        if (GPR_9.isSelected()) {
            X2 += Math.pow(2, 9);
            X2_9.setText("1");
            X2_9.setBackground(Color.red);
        } else {
            X2_9.setText("0");
            X2_9.setBackground(Color.white);
        }

        if (OP_10.isSelected()) {
            X2 += Math.pow(2, 10);
            X2_10.setText("1");
            X2_10.setBackground(Color.red);
        } else {
            X2_10.setText("0");
            X2_10.setBackground(Color.white);
        }

        if (OP_11.isSelected()) {
            X2 += Math.pow(2, 11);
            X2_11.setText("1");
            X2_11.setBackground(Color.red);
        } else {
            X2_11.setText("0");
            X2_11.setBackground(Color.white);
        }

        if (OP_12.isSelected()) {
            X2 += Math.pow(2, 12);
            X2_12.setText("1");
            X2_12.setBackground(Color.red);
        } else {
            X2_12.setText("0");
            X2_11.setBackground(Color.white);
        }

        if (OP_13.isSelected()) {
            X2 += Math.pow(2, 13);
            X2_13.setText("1");
            X2_13.setBackground(Color.red);
        } else {
            X2_13.setText("0");
            X2_13.setBackground(Color.white);
        }

        if (OP_14.isSelected()) {
            X2 += Math.pow(2, 14);
            X2_14.setText("1");
            X2_14.setBackground(Color.red);
        } else {
            X2_14.setText("0");
            X2_14.setBackground(Color.white);
        }

        if (OP_15.isSelected()) {
            X2 += Math.pow(2, 15);
            X2_15.setText("1");
            X2_15.setBackground(Color.red);
        } else {
            X2_15.setText("0");
            X2_15.setBackground(Color.white);
        }
        Reset_Toggle_Instruction();
    }//GEN-LAST:event_Load_X2ActionPerformed

    public int getIntValofFloat(double number) {
        String s = String.valueOf(number);
        int n = s.length();

        StringBuilder num_string = new StringBuilder();
        int i, j, exponent, c;

        for (i = 0; s.charAt(i) == '0' || s.charAt(i) == '.'; i++)
            ;
        for (j = n - 1; s.charAt(j) == '0' || s.charAt(j) == '.'; j--)
            ;

        c = s.indexOf('.');

        if (c == -1) {
            c = n;
        }

        num_string.append(s.charAt(i));

        if (i != j) {
            num_string.append('.');
        }

        for (int k = i + 1; k <= j; k++) {
            if (s.charAt(k) != '.') {
                num_string.append(s.charAt(k));
            }
        }

        if (i < c) {
            exponent = c - i - 1;
        } else {
            exponent = c - i;
        }

        i = 0;
        StringBuilder new_num_string = new StringBuilder();


        while (true) {

            if (num_string.charAt(i) != '.') {
                new_num_string.append(num_string.charAt(i));
            }

            if (new_num_string.length() == 3) {
                break;
            }

            i++;
        }

        exponent = exponent - 2;


        int mantissa = Integer.parseInt(new_num_string.toString());

        if (mantissa > 255) {
            mantissa = Integer.parseInt(String.valueOf(mantissa).substring(0, 2));
            exponent++;
        }


        String Final_Num_Bin = "";

        if (number < 0) {
            Final_Num_Bin = Final_Num_Bin + "0";
        } else {
            Final_Num_Bin = Final_Num_Bin + "1";
        }


        if (exponent == 0) {
            Final_Num_Bin = Final_Num_Bin + "0000000";
        } else if (exponent > 0) {
            Final_Num_Bin = Final_Num_Bin + String.format("%7S", Integer.toBinaryString(64 + exponent).replace(' ', '0'));
        } else if (exponent < 0) {
            Final_Num_Bin = Final_Num_Bin + "0";
            Final_Num_Bin = Final_Num_Bin + String.format("%6S", Integer.toBinaryString(64 - Math.abs(exponent)).replace(' ', '0'));
        }


        Final_Num_Bin = Final_Num_Bin + String.format("%8S", Integer.toBinaryString(mantissa).replace(' ', '0'));
        Final_Num_Bin = Final_Num_Bin.substring(Final_Num_Bin.length() - 16);

        return Integer.parseInt(Final_Num_Bin, 2);
    }

    private void Load_X1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Load_X1ActionPerformed
        X1 = 0;
        if (ADDRESS_0.isSelected()) {
            X1_0.setText("1");
            X1 += Math.pow(2, 0);
            X1_0.setBackground(Color.red);
        } else {
            X1_0.setText("0");
            X2_0.setBackground(Color.white);
        }

        if (ADDRESS_1.isSelected()) {
            X1 += Math.pow(2, 1);
            X1_1.setText("1");
            X1_1.setBackground(Color.red);
        } else {
            X1_1.setText("0");
            X2_1.setBackground(Color.white);
        }

        if (ADDRESS_2.isSelected()) {
            X1 += Math.pow(2, 2);
            X1_2.setText("1");
            X1_2.setBackground(Color.red);
        } else {
            X1_2.setText("0");
            X2_2.setBackground(Color.white);
        }

        if (ADDRESS_3.isSelected()) {
            X1 += Math.pow(2, 3);
            X1_3.setText("1");
            X1_3.setBackground(Color.red);
        } else {
            X1_3.setText("0");
            X1_3.setBackground(Color.white);
        }

        if (ADDRESS_4.isSelected()) {
            X1 += Math.pow(2, 4);
            X1_4.setText("1");
            X1_4.setBackground(Color.red);
        } else {
            X1_4.setText("0");
            X1_4.setBackground(Color.white);
        }

        if (I_5.isSelected()) {
            X1 += Math.pow(2, 5);
            X1_5.setText("1");
            X1_5.setBackground(Color.red);
        } else {
            X1_5.setText("0");
            X1_5.setBackground(Color.white);
        }

        if (IXR_6.isSelected()) {
            X1 += Math.pow(2, 6);
            X1_6.setText("1");
            X1_6.setBackground(Color.red);
        } else {
            X1_6.setText("0");
            X1_6.setBackground(Color.white);
        }

        if (IXR_7.isSelected()) {
            X1 += Math.pow(2, 7);
            X1_7.setText("1");
            X1_7.setBackground(Color.red);
        } else {
            X1_7.setText("0");
            X1_7.setBackground(Color.white);
        }

        if (GPR_8.isSelected()) {
            X1 += Math.pow(2, 8);
            X1_8.setText("1");
            X1_8.setBackground(Color.red);
        } else {
            X1_8.setText("0");
            X1_8.setBackground(Color.white);
        }

        if (GPR_9.isSelected()) {
            X1 += Math.pow(2, 9);
            X1_9.setText("1");
            X1_9.setBackground(Color.red);
        } else {
            X1_9.setText("0");
            X1_9.setBackground(Color.white);
        }

        if (OP_10.isSelected()) {
            X1 += Math.pow(2, 10);
            X1_10.setText("1");
            X1_10.setBackground(Color.red);
        } else {
            X1_10.setText("0");
            X1_10.setBackground(Color.white);
        }

        if (OP_11.isSelected()) {
            X1 += Math.pow(2, 11);
            X1_11.setText("1");
            X1_11.setBackground(Color.red);
        } else {
            X1_11.setText("0");
            X1_11.setBackground(Color.white);
        }

        if (OP_12.isSelected()) {
            X1 += Math.pow(2, 12);
            X1_12.setText("1");
            X1_12.setBackground(Color.red);
        } else {
            X1_12.setText("0");
            X1_12.setBackground(Color.white);
        }

        if (OP_13.isSelected()) {
            X1 += Math.pow(2, 13);
            X1_13.setText("1");
            X1_13.setBackground(Color.red);
        } else {
            X1_13.setText("0");
            X1_13.setBackground(Color.white);
        }

        if (OP_14.isSelected()) {
            X1 += Math.pow(2, 14);
            X1_14.setText("1");
            X1_14.setBackground(Color.red);
        } else {
            X1_14.setText("0");
            X1_14.setBackground(Color.white);
        }

        if (OP_15.isSelected()) {
            X1 += Math.pow(2, 15);
            X1_15.setText("1");
            X1_15.setBackground(Color.red);
        } else {
            X1_15.setText("0");
            X1_15.setBackground(Color.white);
        }
        Reset_Toggle_Instruction();
    }//GEN-LAST:event_Load_X1ActionPerformed

    private void Load_MARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Load_MARActionPerformed
        MAR = 0;
        if (ADDRESS_0.isSelected()) {
            MAR += Math.pow(2, 0);
            MAR_0.setText("1");
            MAR_0.setBackground(Color.red);
        } else {
            MAR_0.setText("0");
            MAR_0.setBackground(Color.white);
        }

        if (ADDRESS_1.isSelected()) {
            MAR += Math.pow(2, 1);
            MAR_1.setText("1");
            MAR_1.setBackground(Color.red);
        } else {
            MAR_1.setText("0");
            MAR_1.setBackground(Color.white);
        }

        if (ADDRESS_2.isSelected()) {
            MAR += Math.pow(2, 2);
            MAR_2.setText("1");
            MAR_2.setBackground(Color.red);
        } else {
            MAR_2.setText("0");
            MAR_2.setBackground(Color.white);
        }

        if (ADDRESS_3.isSelected()) {
            MAR += Math.pow(2, 3);
            MAR_3.setText("1");
            MAR_3.setBackground(Color.red);
        } else {
            MAR_3.setText("0");
            MAR_3.setBackground(Color.white);
        }

        if (ADDRESS_4.isSelected()) {
            MAR += Math.pow(2, 4);
            MAR_4.setText("1");
            MAR_4.setBackground(Color.red);
        } else {
            MAR_4.setText("0");
            MAR_4.setBackground(Color.white);
        }

        if (I_5.isSelected()) {
            MAR += Math.pow(2, 5);
            MAR_5.setText("1");
            MAR_5.setBackground(Color.red);
        } else {
            MAR_5.setText("0");
            MAR_5.setBackground(Color.white);

        }

        if (IXR_6.isSelected()) {
            MAR += Math.pow(2, 6);
            MAR_6.setText("1");
            MAR_6.setBackground(Color.red);
        } else {
            MAR_6.setText("0");
            MAR_6.setBackground(Color.white);
        }
        if (IXR_7.isSelected()) {
            MAR += Math.pow(2, 7);
            MAR_7.setText("1");
            MAR_7.setBackground(Color.red);
        } else {
            MAR_7.setText("0");
            MAR_7.setBackground(Color.white);
        }

        if (GPR_8.isSelected()) {
            MAR += Math.pow(2, 8);
            MAR_8.setText("1");
            MAR_8.setBackground(Color.red);
        } else {
            MAR_8.setText("0");
            MAR_8.setBackground(Color.white);
        }

        if (GPR_9.isSelected()) {
            MAR += Math.pow(2, 9);
            MAR_9.setText("1");
            MAR_9.setBackground(Color.red);
        } else {
            MAR_9.setText("0");
            MAR_9.setBackground(Color.white);
        }

        if (OP_10.isSelected()) {
            MAR += Math.pow(2, 10);
            MAR_10.setText("1");
            MAR_10.setBackground(Color.red);
        } else {
            MAR_10.setText("0");
            MAR_10.setBackground(Color.white);
        }

        if (OP_11.isSelected()) {
            MAR += Math.pow(2, 11);
            MAR_11.setText("1");
            MAR_11.setBackground(Color.red);
        } else {
            MAR_11.setText("0");
            MAR_11.setBackground(Color.white);
        }
        Reset_Toggle_Instruction();
    }//GEN-LAST:event_Load_MARActionPerformed

    private void Load_MBRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Load_MBRActionPerformed
        MBR = 0;
        if (ADDRESS_0.isSelected()) {
            MBR_0.setText("1");
            MBR += Math.pow(2, 0);
            MBR_0.setBackground(Color.red);
        } else {
            MBR_0.setText("0");
            MBR_0.setBackground(Color.white);
        }

        if (ADDRESS_1.isSelected()) {
            MBR += Math.pow(2, 1);
            MBR_1.setText("1");
            MBR_1.setBackground(Color.red);
        } else {
            MBR_1.setText("0");
            MBR_1.setBackground(Color.white);
        }

        if (ADDRESS_2.isSelected()) {
            MBR += Math.pow(2, 2);
            MBR_2.setText("1");
            MBR_2.setBackground(Color.red);
        } else {
            MBR_2.setText("0");
            MBR_2.setBackground(Color.white);
        }

        if (ADDRESS_3.isSelected()) {
            MBR += Math.pow(2, 3);
            MBR_3.setText("1");
            MBR_3.setBackground(Color.red);
        } else {
            MBR_3.setText("0");
            MBR_3.setBackground(Color.white);
        }

        if (ADDRESS_4.isSelected()) {
            MBR += Math.pow(2, 4);
            MBR_4.setText("1");
            MBR_4.setBackground(Color.red);
        } else {
            MBR_4.setText("0");
            MBR_4.setBackground(Color.white);
        }

        if (I_5.isSelected()) {
            MBR += Math.pow(2, 5);
            MBR_5.setText("1");
            MBR_5.setBackground(Color.red);
        } else {
            MBR_5.setText("0");
            MBR_5.setBackground(Color.white);
        }

        if (IXR_6.isSelected()) {
            MBR += Math.pow(2, 6);
            MBR_6.setText("1");
            MBR_6.setBackground(Color.red);
        } else {
            MBR_6.setText("0");
            MBR_6.setBackground(Color.white);
        }

        if (IXR_7.isSelected()) {
            MBR += Math.pow(2, 7);
            MBR_7.setText("1");
            MBR_7.setBackground(Color.red);
        } else {
            MBR_7.setText("0");
            MBR_7.setBackground(Color.white);
        }

        if (GPR_8.isSelected()) {
            MBR += Math.pow(2, 8);
            MBR_8.setText("1");
            MBR_8.setBackground(Color.red);
        } else {
            MBR_8.setText("0");
            MBR_8.setBackground(Color.white);
        }

        if (GPR_9.isSelected()) {
            MBR += Math.pow(2, 9);
            MBR_9.setText("1");
            MBR_9.setBackground(Color.red);
        } else {
            MBR_9.setText("0");
            MBR_9.setBackground(Color.white);
        }

        if (OP_10.isSelected()) {
            MBR += Math.pow(2, 10);
            MBR_10.setText("1");
            MBR_10.setBackground(Color.red);
        } else {
            MBR_10.setText("0");
            MBR_10.setBackground(Color.white);
        }
        if (OP_11.isSelected()) {
            MBR += Math.pow(2, 11);
            MBR_11.setText("1");
            MBR_11.setBackground(Color.red);
        } else {
            MBR_11.setText("0");
            MBR_11.setBackground(Color.white);
        }

        if (OP_12.isSelected()) {
            MBR += Math.pow(2, 12);
            MBR_12.setText("1");
            MBR_12.setBackground(Color.red);
        } else {
            MBR_12.setText("0");
            MBR_12.setBackground(Color.white);
        }

        if (OP_13.isSelected()) {
            MBR += Math.pow(2, 13);
            MBR_13.setText("1");
            MBR_13.setBackground(Color.red);
        } else {
            MBR_13.setText("0");
            MBR_13.setBackground(Color.white);
        }

        if (OP_14.isSelected()) {
            MBR += Math.pow(2, 14);
            MBR_14.setText("1");
            MBR_14.setBackground(Color.red);
        } else {
            MBR_14.setText("0");
            MBR_14.setBackground(Color.white);
        }

        if (OP_15.isSelected()) {
            MBR += Math.pow(2, 15);
            MBR_15.setText("1");
            MBR_15.setBackground(Color.red);
        } else {
            MBR_15.setText("0");
            MBR_15.setBackground(Color.white);
        }
        Reset_Toggle_Instruction();
    }//GEN-LAST:event_Load_MBRActionPerformed

    private void Load_PCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Load_PCActionPerformed
        PC = 0;
        if (ADDRESS_0.isSelected()) {
            PC += Math.pow(2, 0);
            PC_0.setText("1");
            PC_0.setBackground(Color.red);
        } else {
            PC_0.setText("0");
            PC_0.setBackground(Color.white);
        }

        if (ADDRESS_1.isSelected()) {
            PC += Math.pow(2, 1);
            PC_1.setText("1");
            PC_1.setBackground(Color.red);
        } else {
            PC_1.setText("0");
            PC_1.setBackground(Color.white);
        }

        if (ADDRESS_2.isSelected()) {
            PC += Math.pow(2, 2);
            PC_2.setText("1");
            PC_2.setBackground(Color.red);
        } else {
            PC_2.setText("0");
            PC_2.setBackground(Color.white);
        }

        if (ADDRESS_3.isSelected()) {
            PC += Math.pow(2, 3);
            PC_3.setText("1");
            PC_3.setBackground(Color.red);
        } else {
            PC_3.setText("0");
            PC_3.setBackground(Color.white);
        }

        if (ADDRESS_4.isSelected()) {
            PC += Math.pow(2, 4);
            PC_4.setText("1");
            PC_4.setBackground(Color.red);
        } else {
            PC_4.setText("0");
            PC_4.setBackground(Color.white);
        }

        if (I_5.isSelected()) {
            PC += Math.pow(2, 5);
            PC_5.setText("1");
            PC_5.setBackground(Color.red);
        } else {
            PC_5.setText("0");
            PC_5.setBackground(Color.white);
        }

        if (IXR_6.isSelected()) {
            PC += Math.pow(2, 6);
            PC_6.setText("1");
            PC_6.setBackground(Color.red);
        } else {
            PC_6.setText("0");
            PC_6.setBackground(Color.white);
        }

        if (IXR_7.isSelected()) {
            PC += Math.pow(2, 7);
            PC_7.setText("1");
            PC_7.setBackground(Color.red);
        } else {
            PC_7.setText("0");
            PC_7.setBackground(Color.white);
        }

        if (GPR_8.isSelected()) {
            PC += Math.pow(2, 8);
            PC_8.setText("1");
            PC_8.setBackground(Color.red);
        } else {
            PC_8.setText("0");
            PC_8.setBackground(Color.white);
        }

        if (GPR_9.isSelected()) {
            PC += Math.pow(2, 9);
            PC_9.setText("1");
            PC_9.setBackground(Color.red);
        } else {
            PC_9.setText("0");
            PC_9.setBackground(Color.white);
        }

        if (OP_10.isSelected()) {
            PC += Math.pow(2, 10);
            PC_10.setText("1");
            PC_10.setBackground(Color.red);
        } else {
            PC_10.setText("0");
            PC_10.setBackground(Color.white);
        }

        if (OP_11.isSelected()) {
            PC += Math.pow(2, 11);
            PC_11.setText("1");
            PC_11.setBackground(Color.red);
        } else {
            PC_11.setText("0");
            PC_11.setBackground(Color.white);
        }
        Reset_Toggle_Instruction();
    }//GEN-LAST:event_Load_PCActionPerformed

    private void Load_R3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Load_R3ActionPerformed
        R3 = 0;
        if (ADDRESS_0.isSelected()) {
            R3_0.setText("1");
            R3 += Math.pow(2, 0);
            R3_0.setBackground(Color.red);
        } else {
            R3_0.setText("0");
            R3_0.setBackground(Color.white);
        }

        if (ADDRESS_1.isSelected()) {
            R3 += Math.pow(2, 1);
            R3_1.setText("1");
            R3_1.setBackground(Color.red);
        } else {
            R3_1.setText("0");
            R3_1.setBackground(Color.white);
        }

        if (ADDRESS_2.isSelected()) {
            R3 += Math.pow(2, 2);
            R3_2.setText("1");
            R3_2.setBackground(Color.red);
        } else {
            R3_2.setText("0");
            R3_2.setBackground(Color.white);
        }

        if (ADDRESS_3.isSelected()) {
            R3 += Math.pow(2, 3);
            R3_3.setText("1");
            R3_3.setBackground(Color.red);
        } else {
            R3_3.setText("0");
            R3_3.setBackground(Color.white);
        }

        if (ADDRESS_4.isSelected()) {
            R3 += Math.pow(2, 4);
            R3_4.setText("1");
            R3_4.setBackground(Color.red);
        } else {
            R3_4.setText("0");
            R3_4.setBackground(Color.white);
        }

        if (I_5.isSelected()) {
            R3 += Math.pow(2, 5);
            R3_5.setText("1");
            R3_5.setBackground(Color.red);
        } else {
            R3_5.setText("0");
            R3_5.setBackground(Color.white);
        }

        if (IXR_6.isSelected()) {
            R3 += Math.pow(2, 6);
            R3_6.setText("1");
            R3_6.setBackground(Color.red);
        } else {
            R3_6.setText("0");
            R3_6.setBackground(Color.white);
        }

        if (IXR_7.isSelected()) {
            R3 += Math.pow(2, 7);
            R3_7.setText("1");
            R3_7.setBackground(Color.red);
        } else {
            R3_7.setText("0");
            R3_7.setBackground(Color.white);
        }

        if (GPR_8.isSelected()) {
            R3 += Math.pow(2, 8);
            R3_8.setText("1");
            R3_8.setBackground(Color.red);
        } else {
            R3_8.setText("0");
            R3_8.setBackground(Color.white);
        }

        if (GPR_9.isSelected()) {
            R3 += Math.pow(2, 9);
            R3_9.setText("1");
            R3_9.setBackground(Color.red);
        } else {
            R3_9.setText("0");
            R3_9.setBackground(Color.white);
        }

        if (OP_10.isSelected()) {
            R3 += Math.pow(2, 10);
            R3_10.setText("1");
            R3_10.setBackground(Color.red);
        } else {
            R3_10.setText("0");
            R3_10.setBackground(Color.white);
        }

        if (OP_11.isSelected()) {
            R3 += Math.pow(2, 11);
            R3_11.setText("1");
            R3_11.setBackground(Color.red);
        } else {
            R3_11.setText("0");
            R3_11.setBackground(Color.white);
        }

        if (OP_12.isSelected()) {
            R3 += Math.pow(2, 12);
            R3_12.setText("1");
            R3_12.setBackground(Color.red);
        } else {
            R3_12.setText("0");
            R3_12.setBackground(Color.white);
        }

        if (OP_13.isSelected()) {
            R3 += Math.pow(2, 13);
            R3_13.setText("1");
            R3_13.setBackground(Color.red);
        } else {
            R3_13.setText("0");
            R3_13.setBackground(Color.white);
        }

        if (OP_14.isSelected()) {
            R3 += Math.pow(2, 14);
            R3_14.setText("1");
            R3_14.setBackground(Color.red);
        } else {
            R3_14.setText("0");
            R3_14.setBackground(Color.white);
        }

        if (OP_15.isSelected()) {
            R3 += Math.pow(2, 15);
            R3_15.setText("1");
            R3_15.setBackground(Color.red);
        } else {
            R3_15.setText("0");
            R3_15.setBackground(Color.white);
        }
        Reset_Toggle_Instruction();
    }//GEN-LAST:event_Load_R3ActionPerformed

    private void Load_R2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Load_R2ActionPerformed
        R2 = 0;
        if (ADDRESS_0.isSelected()) {
            R2_0.setText("1");
            R2 += Math.pow(2, 0);
            R2_0.setBackground(Color.red);
        } else {
            R2_0.setText("0");
            R2_0.setBackground(Color.white);
        }

        if (ADDRESS_1.isSelected()) {
            R2 += Math.pow(2, 1);
            R2_1.setText("1");
            R2_1.setBackground(Color.red);
        } else {
            R2_1.setText("0");
            R2_1.setBackground(Color.white);
        }

        if (ADDRESS_2.isSelected()) {
            R2 += Math.pow(2, 2);
            R2_2.setText("1");
            R2_2.setBackground(Color.red);
        } else {
            R2_2.setText("0");
            R2_2.setBackground(Color.white);
        }

        if (ADDRESS_3.isSelected()) {
            R2 += Math.pow(2, 3);
            R2_3.setText("1");
            R2_3.setBackground(Color.red);
        } else {
            R2_3.setText("0");
            R2_3.setBackground(Color.white);
        }

        if (ADDRESS_4.isSelected()) {
            R2 += Math.pow(2, 4);
            R2_4.setText("1");
            R2_4.setBackground(Color.red);
        } else {
            R2_4.setText("0");
            R2_4.setBackground(Color.white);
        }

        if (I_5.isSelected()) {
            R2 += Math.pow(2, 5);
            R2_5.setText("1");
            R2_5.setBackground(Color.red);
        } else {
            R2_5.setText("0");
            R2_5.setBackground(Color.white);
        }

        if (IXR_6.isSelected()) {
            R2 += Math.pow(2, 6);
            R2_6.setText("1");
            R2_6.setBackground(Color.red);
        } else {
            R2_6.setText("0");
            R2_6.setBackground(Color.white);
        }

        if (IXR_7.isSelected()) {
            R2 += Math.pow(2, 7);
            R2_7.setText("1");
            R2_7.setBackground(Color.red);
        } else {
            R2_7.setText("0");
            R2_7.setBackground(Color.white);
        }

        if (GPR_8.isSelected()) {
            R2 += Math.pow(2, 8);
            R2_8.setText("1");
            R2_8.setBackground(Color.red);
        } else {
            R2_8.setText("0");
            R2_8.setBackground(Color.white);
        }

        if (GPR_9.isSelected()) {
            R2 += Math.pow(2, 9);
            R2_9.setText("1");
            R2_9.setBackground(Color.red);
        } else {
            R2_9.setText("0");
            R2_9.setBackground(Color.white);
        }

        if (OP_10.isSelected()) {
            R2 += Math.pow(2, 10);
            R2_10.setText("1");
            R2_10.setBackground(Color.red);
        } else {
            R2_10.setText("0");
            R2_10.setBackground((Color.white));
        }

        if (OP_11.isSelected()) {
            R2 += Math.pow(2, 11);
            R2_11.setText("1");
            R2_11.setBackground(Color.red);
        } else {
            R2_11.setText("0");
            R2_11.setBackground(Color.white);
        }

        if (OP_12.isSelected()) {
            R2 += Math.pow(2, 12);
            R2_12.setText("1");
            R2_12.setBackground(Color.red);
        } else {
            R2_12.setText("0");
            R2_12.setBackground(Color.white);
        }

        if (OP_13.isSelected()) {
            R2 += Math.pow(2, 13);
            R2_13.setText("1");
            R2_13.setBackground(Color.red);
        } else {
            R2_13.setText("0");
            R2_13.setBackground(Color.white);
        }

        if (OP_14.isSelected()) {
            R2 += Math.pow(2, 14);
            R2_14.setText("1");
            R2_14.setBackground(Color.red);
        } else {
            R2_14.setText("0");
            R2_14.setBackground(Color.white);
        }

        if (OP_15.isSelected()) {
            R2 += Math.pow(2, 15);
            R2_15.setText("1");
            R2_15.setBackground(Color.red);
        } else {
            R2_15.setText("0");
            R2_15.setBackground(Color.white);
        }
        Reset_Toggle_Instruction();
    }//GEN-LAST:event_Load_R2ActionPerformed

    private void Load_R1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Load_R1ActionPerformed
        R1 = 0;
        if (ADDRESS_0.isSelected()) {
            R1_0.setText("1");
            R1 += Math.pow(2, 0);
            R1_0.setBackground(Color.red);
        } else {
            R1_0.setText("0");
            R1_0.setBackground(Color.white);
        }

        if (ADDRESS_1.isSelected()) {
            R1 += Math.pow(2, 1);
            R1_1.setText("1");
            R1_1.setBackground(Color.red);
        } else {
            R1_1.setText("0");
            R1_1.setBackground(Color.white);
        }

        if (ADDRESS_2.isSelected()) {
            R1 += Math.pow(2, 2);
            R1_2.setText("1");
            R1_2.setBackground(Color.red);
        } else {
            R1_2.setText("0");
            R1_2.setBackground(Color.white);
        }

        if (ADDRESS_3.isSelected()) {
            R1 += Math.pow(2, 3);
            R1_3.setText("1");
            R1_3.setBackground(Color.red);
        } else {
            R1_3.setText("0");
            R1_3.setBackground(Color.white);
        }

        if (ADDRESS_4.isSelected()) {
            R1 += Math.pow(2, 4);
            R1_4.setText("1");
            R1_4.setBackground(Color.red);
        } else {
            R1_4.setText("0");
            R1_4.setBackground(Color.white);
        }

        if (I_5.isSelected()) {
            R1 += Math.pow(2, 5);
            R1_5.setText("1");
            R1_5.setBackground(Color.red);
        } else {
            R1_5.setText("0");
            R1_5.setBackground(Color.white);
        }

        if (IXR_6.isSelected()) {
            R1 += Math.pow(2, 6);
            R1_6.setText("1");
            R1_6.setBackground(Color.red);
        } else {
            R1_6.setText("0");
            R1_6.setBackground(Color.white);
        }

        if (IXR_7.isSelected()) {
            R1 += Math.pow(2, 7);
            R1_7.setText("1");
            R1_7.setBackground(Color.red);
        } else {
            R1_7.setText("0");
            R1_7.setBackground(Color.white);
        }

        if (GPR_8.isSelected()) {
            R1 += Math.pow(2, 8);
            R1_8.setText("1");
            R1_8.setBackground(Color.red);
        } else {
            R1_8.setText("0");
            R1_8.setBackground(Color.white);
        }

        if (GPR_9.isSelected()) {
            R1 += Math.pow(2, 9);
            R1_9.setText("1");
            R1_9.setBackground(Color.red);
        } else {
            R1_9.setText("0");
            R1_9.setBackground(Color.white);
        }

        if (OP_10.isSelected()) {
            R1 += Math.pow(2, 10);
            R1_10.setText("1");
            R1_10.setBackground(Color.red);
        } else {
            R1_10.setText("0");
            R1_10.setBackground(Color.white);
        }

        if (OP_11.isSelected()) {
            R1 += Math.pow(2, 11);
            R1_11.setText("1");
            R1_11.setBackground(Color.red);
        } else {
            R1_11.setText("0");
            R1_11.setBackground(Color.white);
        }

        if (OP_12.isSelected()) {
            R1 += Math.pow(2, 12);
            R1_12.setText("1");
            R1_12.setBackground(Color.red);
        } else {
            R1_12.setText("0");
            R1_12.setBackground(Color.white);
        }

        if (OP_13.isSelected()) {
            R1 += Math.pow(2, 13);
            R1_13.setText("1");
            R1_13.setBackground(Color.red);
        } else {
            R1_13.setText("0");
            R1_13.setBackground(Color.white);
        }

        if (OP_14.isSelected()) {
            R1 += Math.pow(2, 14);
            R1_14.setText("1");
            R1_14.setBackground(Color.red);
        } else {
            R1_14.setText("0");
            R1_14.setBackground(Color.white);
        }

        if (OP_15.isSelected()) {
            R1 += Math.pow(2, 15);
            R1_15.setText("1");
            R1_15.setBackground(Color.red);
        } else {
            R1_15.setText("0");
            R1_15.setBackground(Color.white);
        }
        Reset_Toggle_Instruction();
    }//GEN-LAST:event_Load_R1ActionPerformed

    private void Load_R0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Load_R0ActionPerformed
        R0 = 0;
        if (ADDRESS_0.isSelected()) {
            R0_0.setText("1");
            R0 += Math.pow(2, 0);
            R0_0.setBackground(Color.red);
        } else {
            R0_0.setText("0");
            R0_0.setBackground(Color.white);
        }

        if (ADDRESS_1.isSelected()) {
            R0 += Math.pow(2, 1);
            R0_1.setText("1");
            R0_1.setBackground(Color.red);
        } else {
            R0_1.setText("0");
            R0_1.setBackground(Color.white);
        }

        if (ADDRESS_2.isSelected()) {
            R0 += Math.pow(2, 2);
            R0_2.setText("1");
            R0_2.setBackground(Color.red);
        } else {
            R0_2.setText("0");
            R0_2.setBackground(Color.white);
        }

        if (ADDRESS_3.isSelected()) {
            R0 += Math.pow(2, 3);
            R0_3.setText("1");
            R0_3.setBackground(Color.red);
        } else {
            R0_3.setText("0");
            R0_3.setBackground(Color.white);
        }

        if (ADDRESS_4.isSelected()) {
            R0 += Math.pow(2, 4);
            R0_4.setText("1");
            R0_4.setBackground(Color.red);
        } else {
            R0_4.setText("0");
            R0_4.setBackground(Color.white);
        }

        if (I_5.isSelected()) {
            R0 += Math.pow(2, 5);
            R0_5.setText("1");
            R0_5.setBackground(Color.red);
        } else {
            R0_5.setText("0");
            R0_5.setBackground(Color.white);
        }

        if (IXR_6.isSelected()) {
            R0 += Math.pow(2, 6);
            R0_6.setText("1");
            R0_6.setBackground(Color.red);
        } else {
            R0_6.setText("0");
            R0_6.setBackground(Color.white);
        }

        if (IXR_7.isSelected()) {
            R0 += Math.pow(2, 7);
            R0_7.setText("1");
            R0_7.setBackground(Color.red);
        } else {
            R0_7.setText("0");
            R0_7.setBackground(Color.white);
        }

        if (GPR_8.isSelected()) {
            R0 += Math.pow(2, 8);
            R0_8.setText("1");
            R0_8.setBackground(Color.red);
        } else {
            R0_8.setText("0");
            R0_8.setBackground(Color.white);
        }

        if (GPR_9.isSelected()) {
            R0 += Math.pow(2, 9);
            R0_9.setText("1");
            R0_9.setBackground(Color.red);
        } else {
            R0_9.setText("0");
            R0_9.setBackground(Color.white);
        }

        if (OP_10.isSelected()) {
            R0 += Math.pow(2, 10);
            R0_10.setText("1");
            R0_10.setBackground(Color.red);
        } else {
            R0_10.setText("0");
            R0_10.setBackground(Color.white);
        }

        if (OP_11.isSelected()) {
            R0 += Math.pow(2, 11);
            R0_11.setText("1");
            R0_11.setBackground(Color.red);
        } else {
            R0_11.setText("0");
            R0_11.setBackground(Color.white);
        }

        if (OP_12.isSelected()) {
            R0 += Math.pow(2, 12);
            R0_12.setText("1");
            R0_12.setBackground(Color.red);
        } else {
            R0_12.setText("0");
            R0_12.setBackground(Color.white);
        }

        if (OP_13.isSelected()) {
            R0 += Math.pow(2, 13);
            R0_13.setText("1");
            R0_13.setBackground(Color.red);
        } else {
            R0_13.setText("0");
            R0_13.setBackground(Color.white);
        }

        if (OP_14.isSelected()) {
            R0 += Math.pow(2, 14);
            R0_14.setText("1");
            R0_14.setBackground(Color.red);
        } else {
            R0_14.setText("0");
            R0_14.setBackground(Color.white);
        }

        if (OP_15.isSelected()) {
            R0 += Math.pow(2, 15);
            R0_15.setText("1");
            R0_15.setBackground(Color.red);
        } else {
            R0_15.setText("0");
            R0_15.setBackground(Color.white);
        }
        Reset_Toggle_Instruction();
    }//GEN-LAST:event_Load_R0ActionPerformed

    private void Load_IRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Load_IRActionPerformed
        IR = 0;
        if (ADDRESS_0.isSelected()) {
            IR += Math.pow(2, 0);
            IR_0.setText("1");
            IR_0.setBackground(Color.red);
        } else {
            IR_0.setText("0");
            IR_0.setBackground(Color.white);
        }

        if (ADDRESS_1.isSelected()) {
            IR += Math.pow(2, 1);
            IR_1.setText("1");
            IR_1.setBackground(Color.red);
        } else {
            IR_1.setText("0");
            IR_1.setBackground(Color.white);
        }

        if (ADDRESS_2.isSelected()) {
            IR += Math.pow(2, 2);
            IR_2.setText("1");
            IR_2.setBackground(Color.red);
        } else {
            IR_2.setText("0");
            IR_2.setBackground(Color.white);
        }

        if (ADDRESS_3.isSelected()) {
            IR += Math.pow(2, 3);
            IR_3.setText("1");
            IR_3.setBackground(Color.red);
        } else {
            IR_3.setText("0");
            IR_3.setBackground(Color.white);
        }

        if (ADDRESS_4.isSelected()) {
            IR += Math.pow(2, 4);
            IR_4.setText("1");
            IR_4.setBackground(Color.red);
        } else {
            IR_4.setText("0");
            IR_4.setBackground(Color.white);
        }

        if (I_5.isSelected()) {
            IR += Math.pow(2, 5);
            IR_5.setText("1");
            IR_5.setBackground(Color.red);
        } else {
            IR_5.setText("0");
            IR_5.setBackground(Color.white);
        }

        if (IXR_6.isSelected()) {
            IR += Math.pow(2, 6);
            IR_6.setText("1");
            IR_6.setBackground(Color.red);
        } else {
            IR_6.setText("0");
            IR_6.setBackground(Color.white);
        }

        if (IXR_7.isSelected()) {
            IR += Math.pow(2, 7);
            IR_7.setText("1");
            IR_7.setBackground(Color.red);
        } else {
            IR_7.setText("0");
            IR_7.setBackground(Color.white);
        }

        if (GPR_8.isSelected()) {
            IR += Math.pow(2, 8);
            IR_8.setText("1");
            IR_8.setBackground(Color.red);
        } else {
            IR_8.setText("0");
            IR_8.setBackground(Color.white);
        }

        if (GPR_9.isSelected()) {
            IR += Math.pow(2, 9);
            IR_9.setText("1");
            IR_9.setBackground(Color.red);
        } else {
            IR_9.setText("0");
            IR_9.setBackground(Color.white);
        }

        if (OP_10.isSelected()) {
            IR += Math.pow(2, 10);
            IR_10.setText("1");
            IR_10.setBackground(Color.red);
        } else {
            IR_10.setText("0");
            IR_10.setBackground(Color.white);
        }

        if (OP_11.isSelected()) {
            IR += Math.pow(2, 11);
            IR_11.setText("1");
            IR_11.setBackground(Color.red);
        } else {
            IR_11.setText("0");
            IR_11.setBackground(Color.white);
        }

        if (OP_12.isSelected()) {
            IR += Math.pow(2, 12);
            IR_12.setText("1");
            IR_12.setBackground(Color.red);
        } else {
            IR_12.setText("0");
            IR_12.setBackground(Color.white);
        }

        if (OP_13.isSelected()) {
            IR += Math.pow(2, 13);
            IR_13.setText("1");
            IR_13.setBackground(Color.red);
        } else {
            IR_13.setText("0");
            IR_13.setBackground(Color.white);
        }

        if (OP_14.isSelected()) {
            IR += Math.pow(2, 14);
            IR_14.setText("1");
            IR_14.setBackground(Color.red);
        } else {
            IR_14.setText("0");
            IR_14.setBackground(Color.white);
        }

        if (OP_15.isSelected()) {
            IR += Math.pow(2, 15);
            IR_15.setText("1");
            IR_15.setBackground(Color.red);
        } else {
            IR_15.setText("0");
            IR_15.setBackground(Color.white);
        }
        System.out.println(IR);
        Reset_Toggle_Instruction();
    }//GEN-LAST:event_Load_IRActionPerformed

    public void Populate_CC() {
        if (CC0 == 1) {
            CC_0.setText("1");
            CC_0.setBackground(Color.red);
        } else {
            CC_0.setText("0");
            CC_0.setBackground(Color.white);
        }

        if (CC1 == 1) {
            CC_1.setText("1");
            CC_1.setBackground(Color.red);
        } else {
            CC_1.setText("0");
            CC_1.setBackground(Color.white);
        }

        if (CC2 == 1) {
            CC_2.setText("1");
            CC_2.setBackground(Color.red);
        } else {
            CC_2.setText("0");
            CC_2.setBackground(Color.white);
        }

        if (CC3 == 1) {
            CC_3.setText("1");
            CC_3.setBackground(Color.red);
        } else {
            CC_3.setText("0");
            CC_3.setBackground(Color.white);
        }
    }

    public void Populate_R0() {
        String R0_binary = Integer.toBinaryString(R0);
        if (R0_binary.length() >= 1 && R0_binary.charAt(R0_binary.length() - 1) == '1') {
            R0_0.setText("1");
            R0_0.setBackground(Color.red);
        } else {
            R0_0.setText("0");
            R0_0.setBackground(Color.white);
        }
        if (R0_binary.length() >= 2 && R0_binary.charAt(R0_binary.length() - 2) == '1') {
            R0_1.setText("1");
            R0_1.setBackground(Color.red);
        } else {
            R0_1.setText("0");
            R0_1.setBackground(Color.white);
        }
        if (R0_binary.length() >= 3 && R0_binary.charAt(R0_binary.length() - 3) == '1') {
            R0_2.setText("1");
            R0_2.setBackground(Color.red);
        } else {
            R0_2.setText("0");
            R0_2.setBackground(Color.white);
        }
        if (R0_binary.length() >= 4 && R0_binary.charAt(R0_binary.length() - 4) == '1') {
            R0_3.setText("1");
            R0_3.setBackground(Color.red);
        } else {
            R0_3.setText("0");
            R0_3.setBackground(Color.white);
        }
        if (R0_binary.length() >= 5 && R0_binary.charAt(R0_binary.length() - 5) == '1') {
            R0_4.setText("1");
            R0_4.setBackground(Color.red);
        } else {
            R0_4.setText("0");
            R0_4.setBackground(Color.white);
        }
        if (R0_binary.length() >= 6 && R0_binary.charAt(R0_binary.length() - 6) == '1') {
            R0_5.setText("1");
            R0_5.setBackground(Color.red);
        } else {
            R0_5.setText("0");
            R0_5.setBackground(Color.white);
        }
        if (R0_binary.length() >= 7 && R0_binary.charAt(R0_binary.length() - 7) == '1') {
            R0_6.setText("1");
            R0_6.setBackground(Color.red);
        } else {
            R0_6.setText("0");
            R0_6.setBackground(Color.white);
        }
        if (R0_binary.length() >= 8 && R0_binary.charAt(R0_binary.length() - 8) == '1') {
            R0_7.setText("1");
            R0_7.setBackground(Color.red);
        } else {
            R0_7.setText("0");
            R0_7.setBackground(Color.white);
        }
        if (R0_binary.length() >= 9 && R0_binary.charAt(R0_binary.length() - 9) == '1') {
            R0_8.setText("1");
            R0_8.setBackground(Color.red);
        } else {
            R0_8.setText("0");
            R0_8.setBackground(Color.white);
        }
        if (R0_binary.length() >= 10 && R0_binary.charAt(R0_binary.length() - 10) == '1') {
            R0_9.setText("1");
            R0_9.setBackground(Color.red);
        } else {
            R0_9.setText("0");
            R0_9.setBackground(Color.white);
        }
        if (R0_binary.length() >= 11 && R0_binary.charAt(R0_binary.length() - 11) == '1') {
            R0_10.setText("1");
            R0_10.setBackground(Color.red);
        } else {
            R0_10.setText("0");
            R0_10.setBackground(Color.white);
        }
        if (R0_binary.length() >= 12 && R0_binary.charAt(R0_binary.length() - 12) == '1') {
            R0_11.setText("1");
            R0_11.setBackground(Color.red);
        } else {
            R0_11.setText("0");
            R0_11.setBackground(Color.white);
        }
        if (R0_binary.length() >= 13 && R0_binary.charAt(R0_binary.length() - 13) == '1') {
            R0_12.setText("1");
            R0_12.setBackground(Color.red);
        } else {
            R0_12.setText("0");
            R0_12.setBackground(Color.white);
        }
        if (R0_binary.length() >= 14 && R0_binary.charAt(R0_binary.length() - 14) == '1') {
            R0_13.setText("1");
            R0_13.setBackground(Color.red);
        } else {
            R0_13.setText("0");
            R0_13.setBackground(Color.white);
        }
        if (R0_binary.length() >= 15 && R0_binary.charAt(R0_binary.length() - 15) == '1') {
            R0_14.setText("1");
            R0_14.setBackground(Color.red);
        } else {
            R0_14.setText("0");
            R0_14.setBackground(Color.white);
        }
        if (R0_binary.length() >= 16 && R0_binary.charAt(R0_binary.length() - 16) == '1') {
            R0_15.setText("1");
            R0_15.setBackground(Color.red);
        } else {
            R0_15.setText("0");
            R0_15.setBackground(Color.white);
        }
    }

    public void Populate_R1() {
        String R1_binary = Integer.toBinaryString(R1);
        if (R1_binary.length() >= 1 && R1_binary.charAt(R1_binary.length() - 1) == '1') {
            R1_0.setText("1");
            R1_0.setBackground(Color.red);
        } else {
            R1_0.setText("0");
            R1_0.setBackground(Color.white);
        }
        if (R1_binary.length() >= 2 && R1_binary.charAt(R1_binary.length() - 2) == '1') {
            R1_1.setText("1");
            R1_1.setBackground(Color.red);
        } else {
            R1_1.setText("0");
            R1_1.setBackground(Color.white);
        }
        if (R1_binary.length() >= 3 && R1_binary.charAt(R1_binary.length() - 3) == '1') {
            R1_2.setText("1");
            R1_2.setBackground(Color.red);
        } else {
            R1_2.setText("0");
            R1_2.setBackground(Color.white);
        }
        if (R1_binary.length() >= 4 && R1_binary.charAt(R1_binary.length() - 4) == '1') {
            R1_3.setText("1");
            R1_3.setBackground(Color.red);
        } else {
            R1_3.setText("0");
            R1_3.setBackground(Color.white);
        }
        if (R1_binary.length() >= 5 && R1_binary.charAt(R1_binary.length() - 5) == '1') {
            R1_4.setText("1");
            R1_4.setBackground(Color.red);
        } else {
            R1_4.setText("0");
            R1_4.setBackground(Color.white);
        }
        if (R1_binary.length() >= 6 && R1_binary.charAt(R1_binary.length() - 6) == '1') {
            R1_5.setText("1");
            R1_5.setBackground(Color.red);
        } else {
            R1_5.setText("0");
            R1_5.setBackground(Color.white);
        }
        if (R1_binary.length() >= 7 && R1_binary.charAt(R1_binary.length() - 7) == '1') {
            R1_6.setText("1");
            R1_6.setBackground(Color.red);
        } else {
            R1_6.setText("0");
            R1_6.setBackground(Color.white);
        }
        if (R1_binary.length() >= 8 && R1_binary.charAt(R1_binary.length() - 8) == '1') {
            R1_7.setText("1");
            R1_7.setBackground(Color.red);
        } else {
            R1_7.setText("0");
            R1_7.setBackground(Color.white);
        }
        if (R1_binary.length() >= 9 && R1_binary.charAt(R1_binary.length() - 9) == '1') {
            R1_8.setText("1");
            R1_8.setBackground(Color.red);
        } else {
            R1_8.setText("0");
            R1_8.setBackground(Color.white);
        }
        if (R1_binary.length() >= 10 && R1_binary.charAt(R1_binary.length() - 10) == '1') {
            R1_9.setText("1");
            R1_9.setBackground(Color.red);
        } else {
            R1_9.setText("0");
            R1_9.setBackground(Color.white);
        }
        if (R1_binary.length() >= 11 && R1_binary.charAt(R1_binary.length() - 11) == '1') {
            R1_10.setText("1");
            R1_10.setBackground(Color.red);
        } else {
            R1_10.setText("0");
            R1_10.setBackground(Color.white);
        }
        if (R1_binary.length() >= 12 && R1_binary.charAt(R1_binary.length() - 12) == '1') {
            R1_11.setText("1");
            R1_11.setBackground(Color.red);
        } else {
            R1_11.setText("0");
            R1_11.setBackground(Color.white);
        }
        if (R1_binary.length() >= 13 && R1_binary.charAt(R1_binary.length() - 13) == '1') {
            R1_12.setText("1");
            R1_12.setBackground(Color.red);
        } else {
            R1_12.setText("0");
            R1_12.setBackground(Color.white);
        }
        if (R1_binary.length() >= 14 && R1_binary.charAt(R1_binary.length() - 14) == '1') {
            R1_13.setText("1");
            R1_13.setBackground(Color.red);
        } else {
            R1_13.setText("0");
            R1_13.setBackground(Color.white);
        }
        if (R1_binary.length() >= 15 && R1_binary.charAt(R1_binary.length() - 15) == '1') {
            R1_14.setText("1");
            R1_14.setBackground(Color.red);
        } else {
            R1_14.setText("0");
            R1_14.setBackground(Color.white);
        }
        if (R1_binary.length() >= 16 && R1_binary.charAt(R1_binary.length() - 16) == '1') {
            R1_15.setText("1");
            R1_15.setBackground(Color.red);
        } else {
            R1_15.setText("0");
            R1_15.setBackground(Color.white);
        }
    }

    public void Populate_R2() {
        String R2_binary = Integer.toBinaryString(R2);
        if (R2_binary.length() >= 1 && R2_binary.charAt(R2_binary.length() - 1) == '1') {
            R2_0.setText("1");
            R2_0.setBackground(Color.red);
        } else {
            R2_0.setText("0");
            R2_0.setBackground(Color.white);
        }
        if (R2_binary.length() >= 2 && R2_binary.charAt(R2_binary.length() - 2) == '1') {
            R2_1.setText("1");
            R2_1.setBackground(Color.red);
        } else {
            R2_1.setText("0");
            R2_1.setBackground(Color.white);
        }
        if (R2_binary.length() >= 3 && R2_binary.charAt(R2_binary.length() - 3) == '1') {
            R2_2.setText("1");
            R2_2.setBackground(Color.red);
        } else {
            R2_2.setText("0");
            R2_2.setBackground(Color.white);
        }
        if (R2_binary.length() >= 4 && R2_binary.charAt(R2_binary.length() - 4) == '1') {
            R2_3.setText("1");
            R2_3.setBackground(Color.red);
        } else {
            R2_3.setText("0");
            R2_3.setBackground(Color.white);
        }
        if (R2_binary.length() >= 5 && R2_binary.charAt(R2_binary.length() - 5) == '1') {
            R2_4.setText("1");
            R2_4.setBackground(Color.red);
        } else {
            R2_4.setText("0");
            R2_4.setBackground(Color.white);
        }
        if (R2_binary.length() >= 6 && R2_binary.charAt(R2_binary.length() - 6) == '1') {
            R2_5.setText("1");
            R2_5.setBackground(Color.red);
        } else {
            R2_5.setText("0");
            R2_5.setBackground(Color.white);
        }
        if (R2_binary.length() >= 7 && R2_binary.charAt(R2_binary.length() - 7) == '1') {
            R2_6.setText("1");
            R2_6.setBackground(Color.red);
        } else {
            R2_6.setText("0");
            R2_6.setBackground(Color.white);
        }
        if (R2_binary.length() >= 8 && R2_binary.charAt(R2_binary.length() - 8) == '1') {
            R2_7.setText("1");
            R2_7.setBackground(Color.red);
        } else {
            R2_7.setText("0");
            R2_7.setBackground(Color.white);
        }
        if (R2_binary.length() >= 9 && R2_binary.charAt(R2_binary.length() - 9) == '1') {
            R2_8.setText("1");
            R2_8.setBackground(Color.red);
        } else {
            R2_8.setText("0");
            R2_8.setBackground(Color.white);
        }
        if (R2_binary.length() >= 10 && R2_binary.charAt(R2_binary.length() - 10) == '1') {
            R2_9.setText("1");
            R2_9.setBackground(Color.red);
        } else {
            R2_9.setText("0");
            R2_9.setBackground(Color.white);
        }
        if (R2_binary.length() >= 11 && R2_binary.charAt(R2_binary.length() - 11) == '1') {
            R2_10.setText("1");
            R2_10.setBackground(Color.red);
        } else {
            R2_10.setText("0");
            R2_10.setBackground(Color.white);
        }
        if (R2_binary.length() >= 12 && R2_binary.charAt(R2_binary.length() - 12) == '1') {
            R2_11.setText("1");
            R2_11.setBackground(Color.red);
        } else {
            R2_11.setText("0");
            R2_11.setBackground(Color.white);
        }
        if (R2_binary.length() >= 13 && R2_binary.charAt(R2_binary.length() - 13) == '1') {
            R2_12.setText("1");
            R2_12.setBackground(Color.red);
        } else {
            R2_12.setText("0");
            R2_12.setBackground(Color.white);
        }
        if (R2_binary.length() >= 14 && R2_binary.charAt(R2_binary.length() - 14) == '1') {
            R2_13.setText("1");
            R2_13.setBackground(Color.red);
        } else {
            R2_13.setText("0");
            R2_13.setBackground(Color.white);
        }
        if (R2_binary.length() >= 15 && R2_binary.charAt(R2_binary.length() - 15) == '1') {
            R2_14.setText("1");
            R2_14.setBackground(Color.red);
        } else {
            R2_14.setText("0");
            R2_14.setBackground(Color.white);
        }
        if (R2_binary.length() >= 16 && R2_binary.charAt(R2_binary.length() - 16) == '1') {
            R2_15.setText("1");
            R2_15.setBackground(Color.red);
        } else {
            R2_15.setText("0");
            R2_15.setBackground(Color.white);
        }
    }

    public void Populate_R3() {
        String R3_binary = Integer.toBinaryString(R3);
        if (R3_binary.length() >= 1 && R3_binary.charAt(R3_binary.length() - 1) == '1') {
            R3_0.setText("1");
            R3_0.setBackground(Color.red);
        } else {
            R3_0.setText("0");
            R3_0.setBackground(Color.white);
        }
        if (R3_binary.length() >= 2 && R3_binary.charAt(R3_binary.length() - 2) == '1') {
            R3_1.setText("1");
            R3_1.setBackground(Color.red);
        } else {
            R3_1.setText("0");
            R3_1.setBackground(Color.white);
        }
        if (R3_binary.length() >= 3 && R3_binary.charAt(R3_binary.length() - 3) == '1') {
            R3_2.setText("1");
            R3_2.setBackground(Color.red);
        } else {
            R3_2.setText("0");
            R3_2.setBackground(Color.white);
        }
        if (R3_binary.length() >= 4 && R3_binary.charAt(R3_binary.length() - 4) == '1') {
            R3_3.setText("1");
            R3_3.setBackground(Color.red);
        } else {
            R3_3.setText("0");
            R3_3.setBackground(Color.white);
        }
        if (R3_binary.length() >= 5 && R3_binary.charAt(R3_binary.length() - 5) == '1') {
            R3_4.setText("1");
            R3_4.setBackground(Color.red);
        } else {
            R3_4.setText("0");
            R3_4.setBackground(Color.white);
        }
        if (R3_binary.length() >= 6 && R3_binary.charAt(R3_binary.length() - 6) == '1') {
            R3_5.setText("1");
            R3_5.setBackground(Color.red);
        } else {
            R3_5.setText("0");
            R3_5.setBackground(Color.white);
        }
        if (R3_binary.length() >= 7 && R3_binary.charAt(R3_binary.length() - 7) == '1') {
            R3_6.setText("1");
            R3_6.setBackground(Color.red);
        } else {
            R3_6.setText("0");
            R3_6.setBackground(Color.white);
        }
        if (R3_binary.length() >= 8 && R3_binary.charAt(R3_binary.length() - 8) == '1') {
            R3_7.setText("1");
            R3_7.setBackground(Color.red);
        } else {
            R3_7.setText("0");
            R3_7.setBackground(Color.white);
        }
        if (R3_binary.length() >= 9 && R3_binary.charAt(R3_binary.length() - 9) == '1') {
            R3_8.setText("1");
            R3_8.setBackground(Color.red);
        } else {
            R3_8.setText("0");
            R3_8.setBackground(Color.white);
        }
        if (R3_binary.length() >= 10 && R3_binary.charAt(R3_binary.length() - 10) == '1') {
            R3_9.setText("1");
            R3_9.setBackground(Color.red);
        } else {
            R3_9.setText("0");
            R3_9.setBackground(Color.white);
        }
        if (R3_binary.length() >= 11 && R3_binary.charAt(R3_binary.length() - 11) == '1') {
            R3_10.setText("1");
            R3_10.setBackground(Color.red);
        } else {
            R3_10.setText("0");
            R3_10.setBackground(Color.white);
        }
        if (R3_binary.length() >= 12 && R3_binary.charAt(R3_binary.length() - 12) == '1') {
            R3_11.setText("1");
            R3_11.setBackground(Color.red);
        } else {
            R3_11.setText("0");
            R3_11.setBackground(Color.white);
        }
        if (R3_binary.length() >= 13 && R3_binary.charAt(R3_binary.length() - 13) == '1') {
            R3_12.setText("1");
            R3_12.setBackground(Color.red);
        } else {
            R3_12.setText("0");
            R3_12.setBackground(Color.white);
        }
        if (R3_binary.length() >= 14 && R3_binary.charAt(R3_binary.length() - 14) == '1') {
            R3_13.setText("1");
            R3_13.setBackground(Color.red);
        } else {
            R3_13.setText("0");
            R3_13.setBackground(Color.white);
        }
        if (R3_binary.length() >= 15 && R3_binary.charAt(R3_binary.length() - 15) == '1') {
            R3_14.setText("1");
            R3_14.setBackground(Color.red);
        } else {
            R3_14.setText("0");
            R3_14.setBackground(Color.white);
        }
        if (R3_binary.length() >= 16 && R3_binary.charAt(R3_binary.length() - 16) == '1') {
            R3_15.setText("1");
            R3_15.setBackground(Color.red);
        } else {
            R3_15.setText("0");
            R3_15.setBackground(Color.white);
        }
    }

    public void Populate_X1() {
        String X1_binary = Integer.toBinaryString(X1);
        if (X1_binary.length() >= 1 && X1_binary.charAt(X1_binary.length() - 1) == '1') {
            X1_0.setText("1");
            X1_0.setBackground(Color.red);
        } else {
            X1_0.setText("0");
            X1_0.setBackground(Color.white);
        }
        if (X1_binary.length() >= 2 && X1_binary.charAt(X1_binary.length() - 2) == '1') {
            X1_1.setText("1");
            X1_1.setBackground(Color.red);
        } else {
            X1_1.setText("0");
            X1_1.setBackground(Color.white);
        }
        if (X1_binary.length() >= 3 && X1_binary.charAt(X1_binary.length() - 3) == '1') {
            X1_2.setText("1");
            X1_2.setBackground(Color.red);
        } else {
            X1_2.setText("0");
            X1_2.setBackground(Color.white);
        }
        if (X1_binary.length() >= 4 && X1_binary.charAt(X1_binary.length() - 4) == '1') {
            X1_3.setText("1");
            X1_3.setBackground(Color.red);
        } else {
            X1_3.setText("0");
            X1_3.setBackground(Color.white);
        }
        if (X1_binary.length() >= 5 && X1_binary.charAt(X1_binary.length() - 5) == '1') {
            X1_4.setText("1");
            X1_4.setBackground(Color.red);
        } else {
            X1_4.setText("0");
            X1_4.setBackground(Color.white);
        }
        if (X1_binary.length() >= 6 && X1_binary.charAt(X1_binary.length() - 6) == '1') {
            X1_5.setText("1");
            X1_5.setBackground(Color.red);
        } else {
            X1_5.setText("0");
            X1_5.setBackground(Color.white);
        }
        if (X1_binary.length() >= 7 && X1_binary.charAt(X1_binary.length() - 7) == '1') {
            X1_6.setText("1");
            X1_6.setBackground(Color.red);
        } else {
            X1_6.setText("0");
            X1_6.setBackground(Color.white);
        }
        if (X1_binary.length() >= 8 && X1_binary.charAt(X1_binary.length() - 8) == '1') {
            X1_7.setText("1");
            X1_7.setBackground(Color.red);
        } else {
            X1_7.setText("0");
            X1_7.setBackground(Color.white);
        }
        if (X1_binary.length() >= 9 && X1_binary.charAt(X1_binary.length() - 9) == '1') {
            X1_8.setText("1");
            X1_8.setBackground(Color.red);
        } else {
            X1_8.setText("0");
            X1_8.setBackground(Color.white);
        }
        if (X1_binary.length() >= 10 && X1_binary.charAt(X1_binary.length() - 10) == '1') {
            X1_9.setText("1");
            X1_9.setBackground(Color.red);
        } else {
            X1_9.setText("0");
            X1_9.setBackground(Color.white);
        }
        if (X1_binary.length() >= 11 && X1_binary.charAt(X1_binary.length() - 11) == '1') {
            X1_10.setText("1");
            X1_10.setBackground(Color.red);
        } else {
            X1_10.setText("0");
            X1_10.setBackground(Color.white);
        }
        if (X1_binary.length() >= 12 && X1_binary.charAt(X1_binary.length() - 12) == '1') {
            X1_11.setText("1");
            X1_11.setBackground(Color.red);
        } else {
            X1_11.setText("0");
            X1_11.setBackground(Color.white);
        }
        if (X1_binary.length() >= 13 && X1_binary.charAt(X1_binary.length() - 13) == '1') {
            X1_12.setText("1");
            X1_12.setBackground(Color.red);
        } else {
            X1_12.setText("0");
            X1_12.setBackground(Color.white);
        }
        if (X1_binary.length() >= 14 && X1_binary.charAt(X1_binary.length() - 14) == '1') {
            X1_13.setText("1");
            X1_13.setBackground(Color.red);
        } else {
            X1_13.setText("0");
            X1_13.setBackground(Color.white);
        }
        if (X1_binary.length() >= 15 && X1_binary.charAt(X1_binary.length() - 15) == '1') {
            X1_14.setText("1");
            X1_14.setBackground(Color.red);
        } else {
            X1_14.setText("0");
            X1_14.setBackground(Color.white);
        }
        if (X1_binary.length() >= 16 && X1_binary.charAt(X1_binary.length() - 16) == '1') {
            X1_15.setText("1");
            X1_15.setBackground(Color.red);
        } else {
            X1_15.setText("0");
            X1_15.setBackground(Color.white);
        }
    }

    public void Populate_X2() {
        String X2_binary = Integer.toBinaryString(X2);
        if (X2_binary.length() >= 1 && X2_binary.charAt(X2_binary.length() - 1) == '1') {
            X2_0.setText("1");
            X2_0.setBackground(Color.red);
        } else {
            X2_0.setText("0");
            X2_0.setBackground(Color.white);
        }
        if (X2_binary.length() >= 2 && X2_binary.charAt(X2_binary.length() - 2) == '1') {
            X2_1.setText("1");
            X2_1.setBackground(Color.red);
        } else {
            X2_1.setText("0");
            X2_1.setBackground(Color.white);
        }
        if (X2_binary.length() >= 3 && X2_binary.charAt(X2_binary.length() - 3) == '1') {
            X2_2.setText("1");
            X2_2.setBackground(Color.red);
        } else {
            X2_2.setText("0");
            X2_2.setBackground(Color.white);
        }
        if (X2_binary.length() >= 4 && X2_binary.charAt(X2_binary.length() - 4) == '1') {
            X2_3.setText("1");
            X2_3.setBackground(Color.red);
        } else {
            X2_3.setText("0");
            X2_3.setBackground(Color.white);
        }
        if (X2_binary.length() >= 5 && X2_binary.charAt(X2_binary.length() - 5) == '1') {
            X2_4.setText("1");
            X2_4.setBackground(Color.red);
        } else {
            X2_4.setText("0");
            X2_4.setBackground(Color.white);
        }
        if (X2_binary.length() >= 6 && X2_binary.charAt(X2_binary.length() - 6) == '1') {
            X2_5.setText("1");
            X2_5.setBackground(Color.red);
        } else {
            X2_5.setText("0");
            X2_5.setBackground(Color.white);
        }
        if (X2_binary.length() >= 7 && X2_binary.charAt(X2_binary.length() - 7) == '1') {
            X2_6.setText("1");
            X2_6.setBackground(Color.red);
        } else {
            X2_6.setText("0");
            X2_6.setBackground(Color.white);
        }
        if (X2_binary.length() >= 8 && X2_binary.charAt(X2_binary.length() - 8) == '1') {
            X2_7.setText("1");
            X2_7.setBackground(Color.red);
        } else {
            X2_7.setText("0");
            X2_7.setBackground(Color.white);
        }
        if (X2_binary.length() >= 9 && X2_binary.charAt(X2_binary.length() - 9) == '1') {
            X2_8.setText("1");
            X2_8.setBackground(Color.red);
        } else {
            X2_8.setText("0");
            X2_8.setBackground(Color.white);
        }
        if (X2_binary.length() >= 10 && X2_binary.charAt(X2_binary.length() - 10) == '1') {
            X2_9.setText("1");
            X2_9.setBackground(Color.red);
        } else {
            X2_9.setText("0");
            X2_9.setBackground(Color.white);
        }
        if (X2_binary.length() >= 11 && X2_binary.charAt(X2_binary.length() - 11) == '1') {
            X2_10.setText("1");
            X2_10.setBackground(Color.red);
        } else {
            X2_10.setText("0");
            X2_10.setBackground(Color.white);
        }
        if (X2_binary.length() >= 12 && X2_binary.charAt(X2_binary.length() - 12) == '1') {
            X2_11.setText("1");
            X2_11.setBackground(Color.red);
        } else {
            X2_11.setText("0");
            X2_11.setBackground(Color.white);
        }
        if (X2_binary.length() >= 13 && X2_binary.charAt(X2_binary.length() - 13) == '1') {
            X2_12.setText("1");
            X2_12.setBackground(Color.red);
        } else {
            X2_12.setText("0");
            X2_12.setBackground(Color.white);
        }
        if (X2_binary.length() >= 14 && X2_binary.charAt(X2_binary.length() - 14) == '1') {
            X2_13.setText("1");
            X2_13.setBackground(Color.red);
        } else {
            X2_13.setText("0");
            X2_13.setBackground(Color.white);
        }
        if (X2_binary.length() >= 15 && X2_binary.charAt(X2_binary.length() - 15) == '1') {
            X2_14.setText("1");
            X2_14.setBackground(Color.red);
        } else {
            X2_14.setText("0");
            X2_14.setBackground(Color.white);
        }
        if (X2_binary.length() >= 16 && X2_binary.charAt(X2_binary.length() - 16) == '1') {
            X2_15.setText("1");
            X2_15.setBackground(Color.red);
        } else {
            X2_15.setText("0");
            X2_15.setBackground(Color.white);
        }
    }

    public void Populate_X3() {
        String X3_binary = Integer.toBinaryString(X3);
        if (X3_binary.length() >= 1 && X3_binary.charAt(X3_binary.length() - 1) == '1') {
            X3_0.setText("1");
            X3_0.setBackground(Color.red);
        } else {
            X3_0.setText("0");
            X3_0.setBackground(Color.white);
        }
        if (X3_binary.length() >= 2 && X3_binary.charAt(X3_binary.length() - 2) == '1') {
            X3_1.setText("1");
            X3_1.setBackground(Color.red);
        } else {
            X3_1.setText("0");
            X3_1.setBackground(Color.white);
        }
        if (X3_binary.length() >= 3 && X3_binary.charAt(X3_binary.length() - 3) == '1') {
            X3_2.setText("1");
            X3_2.setBackground(Color.red);
        } else {
            X3_2.setText("0");
            X3_2.setBackground(Color.white);
        }
        if (X3_binary.length() >= 4 && X3_binary.charAt(X3_binary.length() - 4) == '1') {
            X3_3.setText("1");
            X3_3.setBackground(Color.red);
        } else {
            X3_3.setText("0");
            X3_3.setBackground(Color.white);
        }
        if (X3_binary.length() >= 5 && X3_binary.charAt(X3_binary.length() - 5) == '1') {
            X3_4.setText("1");
            X3_4.setBackground(Color.red);
        } else {
            X3_4.setText("0");
            X3_4.setBackground(Color.white);
        }
        if (X3_binary.length() >= 6 && X3_binary.charAt(X3_binary.length() - 6) == '1') {
            X3_5.setText("1");
            X3_5.setBackground(Color.red);
        } else {
            X3_5.setText("0");
            X3_5.setBackground(Color.white);
        }
        if (X3_binary.length() >= 7 && X3_binary.charAt(X3_binary.length() - 7) == '1') {
            X3_6.setText("1");
            X3_6.setBackground(Color.red);
        } else {
            X3_6.setText("0");
            X3_6.setBackground(Color.white);
        }
        if (X3_binary.length() >= 8 && X3_binary.charAt(X3_binary.length() - 8) == '1') {
            X3_7.setText("1");
            X3_7.setBackground(Color.red);
        } else {
            X3_7.setText("0");
            X3_7.setBackground(Color.white);
        }
        if (X3_binary.length() >= 9 && X3_binary.charAt(X3_binary.length() - 9) == '1') {
            X3_8.setText("1");
            X3_8.setBackground(Color.red);
        } else {
            X3_8.setText("0");
            X3_8.setBackground(Color.white);
        }
        if (X3_binary.length() >= 10 && X3_binary.charAt(X3_binary.length() - 10) == '1') {
            X3_9.setText("1");
            X3_9.setBackground(Color.red);
        } else {
            X3_9.setText("0");
            X3_9.setBackground(Color.white);
        }
        if (X3_binary.length() >= 11 && X3_binary.charAt(X3_binary.length() - 11) == '1') {
            X3_10.setText("1");
            X3_10.setBackground(Color.red);
        } else {
            X3_10.setText("0");
            X3_10.setBackground(Color.white);
        }
        if (X3_binary.length() >= 12 && X3_binary.charAt(X3_binary.length() - 12) == '1') {
            X3_11.setText("1");
            X3_11.setBackground(Color.red);
        } else {
            X3_11.setText("0");
            X3_11.setBackground(Color.white);
        }
        if (X3_binary.length() >= 13 && X3_binary.charAt(X3_binary.length() - 13) == '1') {
            X3_12.setText("1");
            X3_12.setBackground(Color.red);
        } else {
            X3_12.setText("0");
            X3_12.setBackground(Color.white);
        }
        if (X3_binary.length() >= 14 && X3_binary.charAt(X3_binary.length() - 14) == '1') {
            X3_13.setText("1");
            X3_13.setBackground(Color.red);
        } else {
            X3_13.setText("0");
            X3_13.setBackground(Color.white);
        }
        if (X3_binary.length() >= 15 && X3_binary.charAt(X3_binary.length() - 15) == '1') {
            X3_14.setText("1");
            X3_14.setBackground(Color.red);
        } else {
            X3_14.setText("0");
            X3_14.setBackground(Color.white);
        }
        if (X3_binary.length() >= 16 && X3_binary.charAt(X3_binary.length() - 16) == '1') {
            X3_15.setText("1");
            X3_15.setBackground(Color.red);
        } else {
            X3_15.setText("0");
            X3_15.setBackground(Color.white);
        }
    }

    public void ExecuteInstruction() throws InterruptedException {
        System.out.println(PC);
        Clear();
        Populate_PC();
        IR = memory[PC];
        System.out.println(IR);
        Populate_IR();
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            Logger.getLogger(ComputerSimulator.class.getName()).log(Level.SEVERE, null, ex);
        }

        short flag_GPR = 0, flag_IXR = 0, flag_I = 0;
        //MAR = PC;
        System.out.println(IR);
        if (IR == 0)   //Halt
        {
            MAR = PC;
            Populate_MAR();
            for (short i = 0; i < 20; i++)

                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ComputerSimulator.class.getName()).log(Level.SEVERE, null, ex);
                }

            Halt_Display.setBackground(Color.red);

            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(ComputerSimulator.class.getName()).log(Level.SEVERE, null, ex);
            }
            PC++;
            Populate_PC();
            JPanel_Run.setBackground(Color.black);
            return;
        }

        String IR_binary = Integer.toBinaryString(IR & 0xFFFF);
        System.out.println(IR_binary);
        if (IR_binary.length() == 32) {
            IR_binary = IR_binary.substring(16, 32);
        }

        if (IR_binary.length() <= 10) {
            MBR = IR;

            MAR = PC;
            Populate_MAR();

            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(ComputerSimulator.class.getName()).log(Level.SEVERE, null, ex);
            }
            Populate_MBR();
        } else {
            //GPR
            if (IR_binary.charAt(IR_binary.length() - 10) == '0' && IR_binary.charAt(IR_binary.length() - 9) == '0') {
                flag_GPR = 1;

            } else if (IR_binary.charAt(IR_binary.length() - 10) == '0' && IR_binary.charAt(IR_binary.length() - 9) == '1') {
                flag_GPR = 2;

            } else if (IR_binary.charAt(IR_binary.length() - 10) == '1' && IR_binary.charAt(IR_binary.length() - 9) == '0') {
                flag_GPR = 3;

            } else {
                flag_GPR = 4;

            }

            //IXR
            if (IR_binary.charAt(IR_binary.length() - 8) == '0' && IR_binary.charAt(IR_binary.length() - 7) == '1') {
                flag_IXR = 1;
            } else if (IR_binary.charAt(IR_binary.length() - 8) == '1' && IR_binary.charAt(IR_binary.length() - 7) == '0') {
                flag_IXR = 2;
            } else if (IR_binary.charAt(IR_binary.length() - 8) == '1' && IR_binary.charAt(IR_binary.length() - 7) == '1') {
                flag_IXR = 3;
            }

            if (IR_binary.charAt(IR_binary.length() - 6) == '1') {
                flag_I = 1;
            }
            if (IR_binary.length() == 11 && IR_binary.charAt(0) == '1') {
                System.out.println("LDR ");
                //I = 0
                if (flag_I == 0) {
                    //No Indexing
                    if (flag_IXR == 0) {
                        System.out.println("no Indexing I=0 ");

                        MAR = getAddress(IR);
                        if (memoryOutofBoundCheck(MAR)) return;
                    } else  //Indexed
                    {
                        switch (flag_IXR) {
                            case 1 -> {
                                System.out.println("IX1 I=0 ");
                                MAR = (short) (getAddress(IR) + X1);
                                if (memoryOutofBoundCheck(MAR)) return;
                            }
                            case 2 -> {
                                System.out.println("IX2 I=0 ");
                                MAR = (short) (getAddress(IR) + X2);
                                if (memoryOutofBoundCheck(MAR)) return;
                            }
                            case 3 -> {
                                System.out.println("IX3 I=0 ");
                                MAR = (short) (getAddress(IR) + X3);
                                if (memoryOutofBoundCheck(MAR)) return;
                            }
                            default -> {
                            }
                        }
                    }
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ComputerSimulator.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Populate_MAR();

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ComputerSimulator.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    MBR = memory[MAR];
                    Populate_MBR();

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ComputerSimulator.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    switch (flag_GPR) {
                        case 1 -> {
                            System.out.println("R0\n");
                            R0 = memory[MAR];
                            Populate_R0();
                        }
                        case 2 -> {
                            System.out.println("R1\n");
                            R1 = memory[MAR];
                            Populate_R1();
                        }
                        case 3 -> {
                            System.out.println("R2\n");
                            R2 = memory[MAR];
                            Populate_R2();
                        }
                        case 4 -> {
                            System.out.println("R3\n");
                            R3 = memory[MAR];
                            Populate_R3();
                        }
                    }
                } else   //I = 1
                {
                    //No Indexing
                    if (flag_IXR == 0) {
                        System.out.println("no Indexing I=1 ");
                        MAR = memory[getAddress(IR)];
                        if (memoryOutofBoundCheck(MAR)) return;
                    } else  //Indexed
                    {
                        switch (flag_IXR) {
                            case 1:
                                System.out.println("IX1 I=1 ");
                                MAR = memory[(getAddress(IR) + X1)];
                                if (memoryOutofBoundCheck(MAR)) return;
                                break;
                            case 2:
                                System.out.println("IX2 I=1 ");
                                MAR = memory[getAddress(IR) + X2];
                                if (memoryOutofBoundCheck(MAR)) return;
                                break;
                            case 3:
                                System.out.println("IX3 I=1 ");
                                MAR = memory[getAddress(IR) + X3];
                                if (memoryOutofBoundCheck(MAR)) return;
                                break;
                            default: {
                            }
                        }
                    }

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ComputerSimulator.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Populate_MAR();


                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ComputerSimulator.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    MBR = memory[MAR];
                    Populate_MBR();


                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ComputerSimulator.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    switch (flag_GPR) {
                        case 1 -> {
                            System.out.println("R0\n");
                            R0 = memory[MAR];
                            Populate_R0();
                        }
                        case 2 -> {
                            System.out.println("R1\n");
                            R1 = memory[MAR];
                            Populate_R1();
                        }
                        case 3 -> {
                            System.out.println("R2\n");
                            R2 = memory[MAR];
                            Populate_R2();
                        }
                        case 4 -> {
                            System.out.println("R3\n");
                            R3 = memory[MAR];
                            Populate_R3();
                        }
                    }
                }
            }

            //STR
            else if (IR_binary.length() == 12 &&
                    IR_binary.charAt(0) == '1' &&
                    IR_binary.charAt(1) == '0') {
                System.out.println("STR ");
                //I = 0
                if (flag_I == 0) {
                    System.out.println("I=0 ");
                    //No Indexing
                    if (flag_IXR == 0) {
                        System.out.println("No Indexing ");

                        MAR = getAddress(IR);
                        if (memoryOutofBoundCheck(MAR)) return;
                    } else  //Indexed
                    {
                        switch (flag_IXR) {
                            case 1 -> {
                                System.out.println("IX1 ");
                                MAR = (short) (getAddress(IR) + X1);
                                if (memoryOutofBoundCheck(MAR)) return;
                            }
                            case 2 -> {
                                System.out.println("IX2 ");
                                MAR = (short) (getAddress(IR) + X2);
                                if (memoryOutofBoundCheck(MAR)) return;
                            }
                            case 3 -> {
                                System.out.println("IX3 ");
                                MAR = (short) (getAddress(IR) + X3);
                                if (memoryOutofBoundCheck(MAR)) return;
                            }
                            default -> {
                            }
                        }
                    }

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ComputerSimulator.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Populate_MAR();
                    switch (flag_GPR) {
                        case 1 -> {
                            System.out.println("R0\n");
                            memory[MAR] = R0;

                        }
                        case 2 -> {
                            System.out.println("R1\n");
                            memory[MAR] = R1;

                        }
                        case 3 -> {
                            System.out.println("R2\n");
                            memory[MAR] = R2;

                        }
                        case 4 -> {
                            System.out.println("R3\n");
                            memory[MAR] = R3;

                        }
                    }
                    MBR = memory[MAR];
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ComputerSimulator.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Populate_MBR();
                } else   //I = 1
                {
                    System.out.println("I=1 ");
                    //No Indexing
                    if (flag_IXR == 0) {
                        System.out.println("no indexing ");
                        MAR = memory[getAddress(IR)];
                        if (memoryOutofBoundCheck(MAR)) return;
                    } else  //Indexed
                    {
                        switch (flag_IXR) {
                            case 1:
                                MAR = memory[getAddress(IR) + X1];
                                System.out.println("IX1 ");
                                if (memoryOutofBoundCheck(MAR)) return;
                            case 2:
                                MAR = memory[getAddress(IR) + X2];
                                System.out.println("IX2 ");
                                if (memoryOutofBoundCheck(MAR)) return;
                            case 3:
                                MAR = memory[getAddress(IR) + X3];
                                System.out.println("IX3 ");
                                if (memoryOutofBoundCheck(MAR)) return;
                            default: {
                            }
                        }
                    }
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ComputerSimulator.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Populate_MAR();

                    switch (flag_GPR) {
                        case 1 -> {
                            System.out.println("R0\n");
                            memory[MAR] = R0;
                        }
                        case 2 -> {
                            System.out.println("R1\n");
                            memory[MAR] = R1;
                        }
                        case 3 -> {
                            System.out.println("R2\n");
                            memory[MAR] = R2;
                        }
                        case 4 -> {
                            System.out.println("R3\n");
                            memory[MAR] = R3;
                        }
                    }
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ComputerSimulator.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    MBR = memory[MAR];
                    Populate_MBR();
                }
            }

            //LDA
            else if (IR_binary.length() == 12 &&
                    IR_binary.charAt(0) == '1' &&
                    IR_binary.charAt(1) == '1') {
                //I = 0
                System.out.println("LDA ");
                if (flag_I == 0) {
                    System.out.println("I=0 ");
                    //No Indexing
                    if (flag_IXR == 0) {
                        System.out.println("no indexing ");
                        MAR = getAddress(IR);
                        if (memoryOutofBoundCheck(MAR)) return;
                    } else  //Indexed
                    {
                        switch (flag_IXR) {
                            case 1 -> {
                                MAR = (short) (getAddress(IR) + X1);
                                if (memoryOutofBoundCheck(MAR)) return;
                                System.out.println("IX1 ");
                            }
                            case 2 -> {
                                MAR = (short) (getAddress(IR) + X2);
                                if (memoryOutofBoundCheck(MAR)) return;
                                System.out.println("IX2 ");
                            }
                            case 3 -> {
                                MAR = (short) (getAddress(IR) + X3);
                                if (memoryOutofBoundCheck(MAR)) return;
                                System.out.println("IX3 ");
                            }
                            default -> {
                            }
                        }
                    }
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ComputerSimulator.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Populate_MAR();

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ComputerSimulator.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    MBR = memory[MAR];
                    Populate_MBR();

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ComputerSimulator.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    switch (flag_GPR) {
                        case 1 -> {
                            R0 = MAR;
                            Populate_R0();
                            System.out.println("R0\n");
                        }
                        case 2 -> {
                            R1 = MAR;
                            Populate_R1();
                            System.out.println("R1\n");
                        }
                        case 3 -> {
                            R2 = MAR;
                            Populate_R2();
                            System.out.println("R2\n");
                        }
                        case 4 -> {
                            R3 = MAR;
                            Populate_R3();
                            System.out.println("R3\n");
                        }
                    }
                } else   //I = 1
                {
                    System.out.println("I=1 ");
                    //No Indexing
                    if (flag_IXR == 0) {
                        System.out.println("No Indexing ");
                        MAR = memory[getAddress(IR)];
                        if (memoryOutofBoundCheck(MAR)) return;
                    } else  //Indexed
                    {
                        switch (flag_IXR) {
                            case 1:
                                MAR = memory[getAddress(IR) + X1];
                                System.out.println("IX1 ");
                                if (memoryOutofBoundCheck(MAR)) return;
                            case 2:
                                MAR = memory[getAddress(IR) + X2];
                                System.out.println("IX2 ");
                                if (memoryOutofBoundCheck(MAR)) return;
                            case 3:
                                MAR = memory[getAddress(IR) + X3];
                                System.out.println("IX3 ");
                                if (memoryOutofBoundCheck(MAR)) return;
                            default: {
                            }
                        }
                    }
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ComputerSimulator.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Populate_MAR();

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ComputerSimulator.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    MBR = memory[MAR];
                    Populate_MBR();

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ComputerSimulator.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    switch (flag_GPR) {
                        case 1 -> {
                            R0 = MAR;
                            Populate_R0();
                            System.out.println("R0\n");
                        }
                        case 2 -> {
                            R1 = MAR;
                            Populate_R1();
                            System.out.println("R1\n");
                        }
                        case 3 -> {
                            R2 = MAR;
                            Populate_R2();
                            System.out.println("R2\n");
                        }
                        case 4 -> {
                            R3 = MAR;
                            Populate_R3();
                            System.out.println("R3\n");
                        }
                    }
                }
            }

            //LDX
            else if (IR_binary.length() == 16 &&
                    IR_binary.charAt(0) == '1' &&
                    IR_binary.charAt(1) == '0' &&
                    IR_binary.charAt(2) == '1' &&
                    IR_binary.charAt(3) == '0' &&
                    IR_binary.charAt(4) == '0' &&
                    IR_binary.charAt(5) == '1') {
                System.out.println("LDX ");
                //I = 0
                if (flag_I == 0) {
                    System.out.println("I=0 ");
                    //No Indexing
                    if (flag_IXR == 0) {
                        System.out.println("No Indexing ");
                        MAR = getAddress(IR);
                        if (memoryOutofBoundCheck(MAR)) return;

                    } else  //Indexed
                    {
                        switch (flag_IXR) {
                            case 1 -> {
                                MAR = (short) (getAddress(IR));
                                if (memoryOutofBoundCheck(MAR)) return;
                                System.out.println("IX1\n");
                            }
                            case 2 -> {
                                MAR = (short) (getAddress(IR));
                                if (memoryOutofBoundCheck(MAR)) return;
                                System.out.println("IX2\n");
                            }
                            case 3 -> {
                                MAR = (short) (getAddress(IR));
                                if (memoryOutofBoundCheck(MAR)) return;
                                System.out.println("IX3\n");
                            }
                            default -> {
                            }
                        }
                    }
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ComputerSimulator.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Populate_MAR();

                    MBR = memory[MAR];

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ComputerSimulator.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Populate_MBR();

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ComputerSimulator.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    switch (flag_IXR) {
                        case 1 -> {
                            X1 = MBR;
                            Populate_X1();
                        }
                        case 2 -> {
                            X2 = MBR;
                            Populate_X2();
                        }
                        case 3 -> {
                            X3 = MBR;
                            Populate_X3();
                        }
                    }
                } else   //I = 1
                {

                    System.out.println("I=1 ");
                    //No Indexing
                    if (flag_IXR == 0) {
                        System.out.println("No Indexing ");
                        MAR = memory[getAddress(IR)];
                        if (memoryOutofBoundCheck(MAR)) return;
                    } else  //Indexed
                    {
                        switch (flag_IXR) {
                            case 1:
                                MAR = memory[getAddress(IR)];
                                System.out.println("IX1\n");
                                if (memoryOutofBoundCheck(MAR)) return;
                            case 2:
                                MAR = memory[getAddress(IR)];
                                System.out.println("IX2\n");
                                if (memoryOutofBoundCheck(MAR)) return;
                            case 3:
                                MAR = memory[getAddress(IR)];
                                System.out.println("IX3\n");
                                if (memoryOutofBoundCheck(MAR)) return;
                            default: {
                            }
                        }
                    }
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ComputerSimulator.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Populate_MAR();

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ComputerSimulator.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    MBR = memory[MAR];
                    Populate_MBR();

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ComputerSimulator.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    switch (flag_IXR) {
                        case 1 -> {
                            X1 = MAR;
                            Populate_X1();
                        }
                        case 2 -> {
                            X2 = MAR;
                            Populate_X2();
                        }
                        case 3 -> {
                            X3 = MAR;
                            Populate_X3();
                        }
                    }
                }
            }

            //STX
            else if (IR_binary.length() == 16 &&
                    IR_binary.charAt(0) == '1' &&
                    IR_binary.charAt(1) == '0' &&
                    IR_binary.charAt(2) == '1' &&
                    IR_binary.charAt(3) == '0' &&
                    IR_binary.charAt(4) == '1' &&
                    IR_binary.charAt(5) == '0') {
                System.out.println("STX ");
                //I = 0
                if (flag_I == 0) {
                    System.out.println("I=0 ");
                    //No Indexing
                    if (flag_IXR == 0) {
                        System.out.println("No Indexing ");
                        MAR = getAddress(IR);
                        if (memoryOutofBoundCheck(MAR)) return;
                    } else  //Indexed
                    {
                        switch (flag_IXR) {
                            case 1 -> {
                                MAR = (short) (getAddress(IR) + X1);
                                System.out.println("IX1\n");
                                if (memoryOutofBoundCheck(MAR)) return;
                            }
                            case 2 -> {
                                MAR = (short) (getAddress(IR) + X2);
                                System.out.println("IX2\n");
                                if (memoryOutofBoundCheck(MAR)) return;
                            }
                            case 3 -> {
                                MAR = (short) (getAddress(IR)+3);
                                System.out.println("IX3\n");
                                if (memoryOutofBoundCheck(MAR)) return;
                            }
                            default -> {
                            }
                        }
                    }
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ComputerSimulator.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Populate_MAR();
                    switch (flag_IXR) {
                        case 1 -> {
                            memory[MAR] = X1;
                        }
                        case 2 -> {
                            memory[MAR] = X2;
                        }
                        case 3 -> {
                            memory[MAR] = X3;
                        }
                    }
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ComputerSimulator.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    MBR = memory[MAR];
                    Populate_MBR();
                } else   //I = 1
                {
                    System.out.println("I=1 ");
                    //No Indexing
                    if (flag_IXR == 0) {
                        System.out.println("No Indexing ");
                        MAR = memory[getAddress(IR)];
                        if (memoryOutofBoundCheck(MAR)) return;
                    } else  //Indexed
                    {
                        switch (flag_IXR) {
                            case 1:
                                MAR = memory[getAddress(IR) + X1];
                                System.out.println("IX1\n");
                                if (memoryOutofBoundCheck(MAR)) return;
                            case 2:
                                MAR = memory[getAddress(IR) + X2];
                                System.out.println("IX2\n");
                                if (memoryOutofBoundCheck(MAR)) return;
                            case 3:
                                MAR = memory[getAddress(IR) + X3];
                                System.out.println("IX3\n");
                                if (memoryOutofBoundCheck(MAR)) return;
                            default: {
                            }
                        }
                    }
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ComputerSimulator.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Populate_MAR();

                    switch (flag_IXR) {
                        case 1 -> {
                            memory[MAR] = X1;
                        }
                        case 2 -> {
                            memory[MAR] = X2;
                        }
                        case 3 -> {
                            memory[MAR] = X3;
                        }
                    }
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ComputerSimulator.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    MBR = memory[MAR];
                    Populate_MBR();
                }
            }

        }
        try {
            Thread.sleep(10);
        } catch (
                InterruptedException ex) {
            Logger.getLogger(ComputerSimulator.class.getName()).log(Level.SEVERE, null, ex);
        }

        PC++;

        Populate_PC();

    }

    public void Populate_MAR() {
        String MAR_binary = Integer.toBinaryString(MAR);
        if (MAR_binary.length() >= 1 && MAR_binary.charAt(MAR_binary.length() - 1) == '1') {
            MAR_0.setText("1");
            MAR_0.setBackground(Color.red);
        } else {
            MAR_0.setText("0");
            MAR_0.setBackground(Color.white);
        }
        if (MAR_binary.length() >= 2 && MAR_binary.charAt(MAR_binary.length() - 2) == '1') {
            MAR_1.setText("1");
            MAR_1.setBackground(Color.red);
        } else {
            MAR_1.setText("0");
            MAR_1.setBackground(Color.white);
        }
        if (MAR_binary.length() >= 3 && MAR_binary.charAt(MAR_binary.length() - 3) == '1') {
            MAR_2.setText("1");
            MAR_2.setBackground(Color.red);
        } else {
            MAR_2.setText("0");
            MAR_2.setBackground(Color.white);
        }
        if (MAR_binary.length() >= 4 && MAR_binary.charAt(MAR_binary.length() - 4) == '1') {
            MAR_3.setText("1");
            MAR_3.setBackground(Color.red);
        } else {
            MAR_3.setText("0");
            MAR_3.setBackground(Color.white);
        }
        if (MAR_binary.length() >= 5 && MAR_binary.charAt(MAR_binary.length() - 5) == '1') {
            MAR_4.setText("1");
            MAR_4.setBackground(Color.red);
        } else {
            MAR_4.setText("0");
            MAR_4.setBackground(Color.white);
        }
        if (MAR_binary.length() >= 6 && MAR_binary.charAt(MAR_binary.length() - 6) == '1') {
            MAR_5.setText("1");
            MAR_5.setBackground(Color.red);
        } else {
            MAR_5.setText("0");
            MAR_5.setBackground(Color.white);
        }
        if (MAR_binary.length() >= 7 && MAR_binary.charAt(MAR_binary.length() - 7) == '1') {
            MAR_6.setText("1");
            MAR_6.setBackground(Color.red);
        } else {
            MAR_6.setText("0");
            MAR_6.setBackground(Color.white);
        }
        if (MAR_binary.length() >= 8 && MAR_binary.charAt(MAR_binary.length() - 8) == '1') {
            MAR_7.setText("1");
            MAR_7.setBackground(Color.red);
        } else {
            MAR_7.setText("0");
            MAR_7.setBackground(Color.white);
        }
        if (MAR_binary.length() >= 9 && MAR_binary.charAt(MAR_binary.length() - 9) == '1') {
            MAR_8.setText("1");
            MAR_8.setBackground(Color.red);
        } else {
            MAR_8.setText("0");
            MAR_8.setBackground(Color.white);
        }
        if (MAR_binary.length() >= 10 && MAR_binary.charAt(MAR_binary.length() - 10) == '1') {
            MAR_9.setText("1");
            MAR_9.setBackground(Color.red);
        } else {
            MAR_9.setText("0");
            MAR_9.setBackground(Color.white);
        }
        if (MAR_binary.length() >= 11 && MAR_binary.charAt(MAR_binary.length() - 11) == '1') {
            MAR_10.setText("1");
            MAR_10.setBackground(Color.red);
        } else {
            MAR_10.setText("0");
            MAR_10.setBackground(Color.white);
        }
        if (MAR_binary.length() >= 12 && MAR_binary.charAt(MAR_binary.length() - 12) == '1') {
            MAR_11.setText("1");
            MAR_11.setBackground(Color.red);
        } else {
            MAR_11.setText("0");
            MAR_11.setBackground(Color.white);
        }
    }

    public void Populate_IR() {
        String IR_binary = Integer.toBinaryString(IR);

        if (IR_binary.length() >= 1 && IR_binary.charAt(IR_binary.length() - 1) == '1') {
            IR_0.setText("1");
            IR_0.setBackground(Color.red);
        } else {
            IR_0.setText("0");
            IR_0.setBackground(Color.white);
        }
        if (IR_binary.length() >= 2 && IR_binary.charAt(IR_binary.length() - 2) == '1') {
            IR_1.setText("1");
            IR_1.setBackground(Color.red);
        } else {
            IR_1.setText("0");
            IR_1.setBackground(Color.white);
        }
        if (IR_binary.length() >= 3 && IR_binary.charAt(IR_binary.length() - 3) == '1') {
            IR_2.setText("1");
            IR_2.setBackground(Color.red);
        } else {
            IR_2.setText("0");
            IR_2.setBackground(Color.white);
        }
        if (IR_binary.length() >= 4 && IR_binary.charAt(IR_binary.length() - 4) == '1') {
            IR_3.setText("1");
            IR_3.setBackground(Color.red);
        } else {
            IR_3.setText("0");
            IR_3.setBackground(Color.white);
        }
        if (IR_binary.length() >= 5 && IR_binary.charAt(IR_binary.length() - 5) == '1') {
            IR_4.setText("1");
            IR_4.setBackground(Color.red);
        } else {
            IR_4.setText("0");
            IR_4.setBackground(Color.white);
        }
        if (IR_binary.length() >= 6 && IR_binary.charAt(IR_binary.length() - 6) == '1') {
            IR_5.setText("1");
            IR_5.setBackground(Color.red);
        } else {
            IR_5.setText("0");
            IR_5.setBackground(Color.white);
        }
        if (IR_binary.length() >= 7 && IR_binary.charAt(IR_binary.length() - 7) == '1') {
            IR_6.setText("1");
            IR_6.setBackground(Color.red);
        } else {
            IR_6.setText("0");
            IR_6.setBackground(Color.white);
        }
        if (IR_binary.length() >= 8 && IR_binary.charAt(IR_binary.length() - 8) == '1') {
            IR_7.setText("1");
            IR_7.setBackground(Color.red);
        } else {
            IR_7.setText("0");
            IR_7.setBackground(Color.white);
        }
        if (IR_binary.length() >= 9 && IR_binary.charAt(IR_binary.length() - 9) == '1') {
            IR_8.setText("1");
            IR_8.setBackground(Color.red);
        } else {
            IR_8.setText("0");
            IR_8.setBackground(Color.white);
        }
        if (IR_binary.length() >= 10 && IR_binary.charAt(IR_binary.length() - 10) == '1') {
            IR_9.setText("1");
            IR_9.setBackground(Color.red);
        } else {
            IR_9.setText("0");
            IR_9.setBackground(Color.white);
        }
        if (IR_binary.length() >= 11 && IR_binary.charAt(IR_binary.length() - 11) == '1') {
            IR_10.setText("1");
            IR_10.setBackground(Color.red);
        } else {
            IR_10.setText("0");
            IR_10.setBackground(Color.white);
        }
        if (IR_binary.length() >= 12 && IR_binary.charAt(IR_binary.length() - 12) == '1') {
            IR_11.setText("1");
            IR_11.setBackground(Color.red);
        } else {
            IR_11.setText("0");
            IR_11.setBackground(Color.white);
        }
        if (IR_binary.length() >= 13 && IR_binary.charAt(IR_binary.length() - 13) == '1') {
            IR_12.setText("1");
            IR_12.setBackground(Color.red);
        } else {
            IR_12.setText("0");
            IR_12.setBackground(Color.white);
        }
        if (IR_binary.length() >= 14 && IR_binary.charAt(IR_binary.length() - 14) == '1') {
            IR_13.setText("1");
            IR_13.setBackground(Color.red);
        } else {
            IR_13.setText("0");
            IR_13.setBackground(Color.white);
        }
        if (IR_binary.length() >= 15 && IR_binary.charAt(IR_binary.length() - 15) == '1') {
            IR_14.setText("1");
            IR_14.setBackground(Color.red);
        } else {
            IR_14.setText("0");
            IR_14.setBackground(Color.white);
        }
        if (IR_binary.length() >= 16 && IR_binary.charAt(IR_binary.length() - 16) == '1') {
            IR_15.setText("1");
            IR_15.setBackground(Color.red);
        } else {
            IR_15.setText("0");
            IR_15.setBackground(Color.white);
        }
    }

    public void Reset_Toggle_Instruction() {    //Reset Input Instruction Toggle Buttons to Initial value
        OP_15.setSelected(false);
        OP_14.setSelected(false);
        OP_13.setSelected(false);
        OP_12.setSelected(false);
        OP_11.setSelected(false);
        OP_10.setSelected(false);
        GPR_9.setSelected(false);
        GPR_8.setSelected(false);
        IXR_7.setSelected(false);
        IXR_6.setSelected(false);
        I_5.setSelected(false);
        ADDRESS_4.setSelected(false);
        ADDRESS_3.setSelected(false);
        ADDRESS_2.setSelected(false);
        ADDRESS_1.setSelected(false);
        ADDRESS_0.setSelected(false);
        OP_15.setBackground(Color.white);
        OP_14.setBackground(Color.white);
        OP_13.setBackground(Color.white);
        I_5.setBackground(Color.white);
        OP_12.setBackground(Color.white);
        OP_11.setBackground(Color.white);
        OP_10.setBackground(Color.white);
        GPR_9.setBackground(Color.white);
        GPR_8.setBackground(Color.white);
        IXR_7.setBackground(Color.white);
        IXR_6.setBackground(Color.white);
        ADDRESS_4.setBackground(Color.white);
        ADDRESS_3.setBackground(Color.white);
        ADDRESS_2.setBackground(Color.white);
        ADDRESS_1.setBackground(Color.white);
        ADDRESS_0.setBackground(Color.white);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        f = new JFrame("Computer Simulator");
        f.setSize(4000, 4000);
        JPanelMain = new JPanel();
        JPanel_IR = new JPanel();
        JLabel_IR = new JLabel();
        IR_15 = new JButton();
        IR_14 = new JButton();
        IR_13 = new JButton();
        IR_12 = new JButton();
        IR_11 = new JButton();
        IR_10 = new JButton();
        IR_9 = new JButton();
        IR_8 = new JButton();
        IR_7 = new JButton();
        IR_6 = new JButton();
        IR_5 = new JButton();
        IR_3 = new JButton();
        IR_4 = new JButton();
        IR_2 = new JButton();
        IR_1 = new JButton();
        IR_0 = new JButton();
        Load_IR = new JButton();
        JPanel_R0 = new JPanel();
        JLabel_R0 = new JLabel();
        R0_15 = new JButton();
        R0_14 = new JButton();
        R0_13 = new JButton();
        R0_12 = new JButton();
        R0_11 = new JButton();
        R0_10 = new JButton();
        R0_9 = new JButton();
        R0_8 = new JButton();
        R0_7 = new JButton();
        R0_6 = new JButton();
        R0_5 = new JButton();
        R0_3 = new JButton();
        R0_4 = new JButton();
        R0_2 = new JButton();
        R0_1 = new JButton();
        R0_0 = new JButton();
        Load_R0 = new JButton();
        JPanel_R1 = new JPanel();
        JLabel_R1 = new JLabel();
        R1_15 = new JButton();
        R1_14 = new JButton();
        R1_13 = new JButton();
        R1_12 = new JButton();
        R1_11 = new JButton();
        R1_10 = new JButton();
        R1_9 = new JButton();
        R1_8 = new JButton();
        R1_7 = new JButton();
        R1_6 = new JButton();
        R1_5 = new JButton();
        R1_3 = new JButton();
        R1_4 = new JButton();
        R1_2 = new JButton();
        R1_1 = new JButton();
        R1_0 = new JButton();
        Load_R1 = new JButton();
        JPanel_R2 = new JPanel();
        JLabel_R2 = new JLabel();
        R2_15 = new JButton();
        R2_14 = new JButton();
        R2_13 = new JButton();
        R2_12 = new JButton();
        R2_11 = new JButton();
        R2_10 = new JButton();
        R2_9 = new JButton();
        R2_8 = new JButton();
        R2_7 = new JButton();
        R2_6 = new JButton();
        R2_5 = new JButton();
        R2_3 = new JButton();
        R2_4 = new JButton();
        R2_2 = new JButton();
        R2_1 = new JButton();
        R2_0 = new JButton();
        Load_R2 = new JButton();
        JPanel_R3 = new JPanel();
        JLabel_R3 = new JLabel();
        R3_15 = new JButton();
        R3_14 = new JButton();
        R3_13 = new JButton();
        R3_12 = new JButton();
        R3_11 = new JButton();
        R3_10 = new JButton();
        R3_9 = new JButton();
        R3_8 = new JButton();
        R3_7 = new JButton();
        R3_6 = new JButton();
        R3_5 = new JButton();
        R3_3 = new JButton();
        R3_4 = new JButton();
        R3_2 = new JButton();
        R3_1 = new JButton();
        R3_0 = new JButton();
        Load_R3 = new JButton();
        JPanel_PC = new JPanel();
        JLabel_PC = new JLabel();
        PC_11 = new JButton();
        PC_10 = new JButton();
        PC_9 = new JButton();
        PC_8 = new JButton();
        PC_7 = new JButton();
        PC_6 = new JButton();
        PC_5 = new JButton();
        PC_4 = new JButton();
        PC_3 = new JButton();
        PC_2 = new JButton();
        PC_1 = new JButton();
        PC_0 = new JButton();
        Load_PC = new JButton();
        JPanel_MAR = new JPanel();
        JLabel_MAR = new JLabel();
        MAR_11 = new JButton();
        MAR_10 = new JButton();
        MAR_9 = new JButton();
        MAR_8 = new JButton();
        MAR_7 = new JButton();
        MAR_6 = new JButton();
        MAR_5 = new JButton();
        MAR_4 = new JButton();
        MAR_3 = new JButton();
        MAR_2 = new JButton();
        MAR_1 = new JButton();
        MAR_0 = new JButton();
        Load_MAR = new JButton();
        JPanel_MBR = new JPanel();
        JLabel_MBR = new JLabel();
        MBR_15 = new JButton();
        MBR_14 = new JButton();
        MBR_13 = new JButton();
        MBR_12 = new JButton();
        MBR_11 = new JButton();
        MBR_10 = new JButton();
        MBR_9 = new JButton();
        MBR_8 = new JButton();
        MBR_7 = new JButton();
        MBR_6 = new JButton();
        MBR_5 = new JButton();
        MBR_3 = new JButton();
        MBR_4 = new JButton();
        MBR_2 = new JButton();
        MBR_1 = new JButton();
        MBR_0 = new JButton();
        Load_MBR = new JButton();
        JPanel_INSTRUCTION = new JPanel();
        JPanel_OP = new JPanel();
        OP_15 = new JToggleButton();
        OP_14 = new JToggleButton();
        OP_13 = new JToggleButton();
        OP_12 = new JToggleButton();
        OP_11 = new JToggleButton();
        OP_10 = new JToggleButton();
        JPanel_GPR = new JPanel();
        GPR_9 = new JToggleButton();
        GPR_8 = new JToggleButton();
        JPanel_IXR = new JPanel();
        IXR_7 = new JToggleButton();
        IXR_6 = new JToggleButton();
        JPanel_I = new JPanel();
        I_5 = new JToggleButton();
        JPanel_ADDRESS = new JPanel();
        ADDRESS_4 = new JToggleButton();
        ADDRESS_3 = new JToggleButton();
        ADDRESS_2 = new JToggleButton();
        ADDRESS_1 = new JToggleButton();
        ADDRESS_0 = new JToggleButton();
        JPanel_OP_Main = new JPanel();
        JPanel_I_Main = new JPanel();
        JPanel_GPR_Main = new JPanel();
        JPanel_ADDRESS_Main = new JPanel();
        JPanel_IXR_Main = new JPanel();
        JPanel_X1 = new JPanel();
        JPanel_X2 = new JPanel();
        JPanel_X3 = new JPanel();
        JLabel_X1 = new JLabel();
        JLabel_X2 = new JLabel();
        JLabel_X3 = new JLabel();
        X1_15 = new JButton();
        X1_14 = new JButton();
        X1_13 = new JButton();
        X1_12 = new JButton();
        X1_11 = new JButton();
        X1_10 = new JButton();
        X1_9 = new JButton();
        X1_8 = new JButton();
        X1_7 = new JButton();
        X1_6 = new JButton();
        X1_5 = new JButton();
        X1_4 = new JButton();
        X1_3 = new JButton();
        X1_2 = new JButton();
        X1_1 = new JButton();
        X1_0 = new JButton();
        Load_X1 = new JButton();
        X2_12 = new JButton();
        X2_3 = new JButton();
        X2_2 = new JButton();
        X2_15 = new JButton();
        X2_5 = new JButton();
        Load_X2 = new JButton();
        X2_7 = new JButton();
        X2_14 = new JButton();
        X2_6 = new JButton();
        X2_8 = new JButton();
        X2_4 = new JButton();
        X2_1 = new JButton();
        X2_10 = new JButton();
        X2_13 = new JButton();
        X2_11 = new JButton();
        X2_9 = new JButton();
        X3_12 = new JButton();
        X3_3 = new JButton();
        X3_2 = new JButton();
        X3_15 = new JButton();
        X3_5 = new JButton();
        Load_X3 = new JButton();
        X3_7 = new JButton();
        X3_14 = new JButton();
        X3_6 = new JButton();
        X3_8 = new JButton();
        X3_4 = new JButton();
        X3_1 = new JButton();
        X3_10 = new JButton();
        X3_13 = new JButton();
        X3_11 = new JButton();
        X3_9 = new JButton();
        X2_0 = new JButton();
        X3_0 = new JButton();
        JPanel_MFR = new JPanel();
        JLabel_MFR = new JLabel();
        MFR_3 = new JButton();
        MFR_2 = new JButton();
        MFR_1 = new JButton();
        MFR_0 = new JButton();
        JPanel_CC = new JPanel();
        JLabel_CC = new JLabel();
        CC_3 = new JButton();
        CC_2 = new JButton();
        CC_1 = new JButton();
        CC_0 = new JButton();
        Store = new JButton();
        Load = new JButton();
        Clear_All = new JButton();
        Init = new JButton();
        Custom_Init = new JButton();
        SS = new JButton();
        Run = new JButton();
        JPanel_Func = new JPanel();
        JPanel_OPT = new JPanel();
        JPanel_Init = new JPanel();
        JLabel_Halt = new JLabel();
        JLabel_Run = new JLabel();
        Halt_Display = new JPanel();
        JPanel_Run = new JPanel();
        JPanel_Display = new JPanel();
        R0_0.setBackground(Color.white);
        R0_1.setBackground(Color.white);
        R0_2.setBackground(Color.white);
        R0_3.setBackground(Color.white);
        R0_4.setBackground(Color.white);
        R0_5.setBackground(Color.white);
        R0_6.setBackground(Color.white);
        R0_7.setBackground(Color.white);
        R0_8.setBackground(Color.white);
        R0_9.setBackground(Color.white);
        R0_10.setBackground(Color.white);
        R0_11.setBackground(Color.white);
        R0_12.setBackground(Color.white);
        R0_13.setBackground(Color.white);
        R0_14.setBackground(Color.white);
        R0_15.setBackground(Color.white);
        R0_0.setBackground(Color.white);
        R0_1.setBackground(Color.white);
        R0_2.setBackground(Color.white);
        R0_3.setBackground(Color.white);
        R0_4.setBackground(Color.white);
        R0_5.setBackground(Color.white);
        R0_6.setBackground(Color.white);
        R0_7.setBackground(Color.white);
        R0_8.setBackground(Color.white);
        R0_9.setBackground(Color.white);
        R0_10.setBackground(Color.white);
        R0_11.setBackground(Color.white);
        R0_12.setBackground(Color.white);
        R0_13.setBackground(Color.white);
        R0_14.setBackground(Color.white);
        R0_15.setBackground(Color.white);
        R1_0.setBackground(Color.white);
        R1_1.setBackground(Color.white);
        R1_2.setBackground(Color.white);
        R1_3.setBackground(Color.white);
        R1_4.setBackground(Color.white);
        R1_5.setBackground(Color.white);
        R1_6.setBackground(Color.white);
        R1_7.setBackground(Color.white);
        R1_8.setBackground(Color.white);
        R1_9.setBackground(Color.white);
        R1_10.setBackground(Color.white);
        R1_11.setBackground(Color.white);
        R1_12.setBackground(Color.white);
        R1_13.setBackground(Color.white);
        R1_14.setBackground(Color.white);
        R1_15.setBackground(Color.white);
        R2_0.setBackground(Color.white);
        R2_1.setBackground(Color.white);
        R2_2.setBackground(Color.white);
        R2_3.setBackground(Color.white);
        R2_4.setBackground(Color.white);
        R2_5.setBackground(Color.white);
        R2_6.setBackground(Color.white);
        R2_7.setBackground(Color.white);
        R2_8.setBackground(Color.white);
        R2_9.setBackground(Color.white);
        R2_10.setBackground(Color.white);
        R2_11.setBackground(Color.white);
        R2_12.setBackground(Color.white);
        R2_13.setBackground(Color.white);
        R2_14.setBackground(Color.white);
        R2_15.setBackground(Color.white);
        R3_0.setBackground(Color.white);
        R3_1.setBackground(Color.white);
        R3_2.setBackground(Color.white);
        R3_3.setBackground(Color.white);
        R3_4.setBackground(Color.white);
        R3_5.setBackground(Color.white);
        R3_6.setBackground(Color.white);
        R3_7.setBackground(Color.white);
        R3_8.setBackground(Color.white);
        R3_9.setBackground(Color.white);
        R3_10.setBackground(Color.white);
        R3_11.setBackground(Color.white);
        R3_12.setBackground(Color.white);
        R3_13.setBackground(Color.white);
        R3_14.setBackground(Color.white);
        R3_15.setBackground(Color.white);
        X1_0.setBackground(Color.white);
        X1_1.setBackground(Color.white);
        X1_2.setBackground(Color.white);
        X1_3.setBackground(Color.white);
        X1_4.setBackground(Color.white);
        X1_5.setBackground(Color.white);
        X1_6.setBackground(Color.white);
        X1_7.setBackground(Color.white);
        X1_8.setBackground(Color.white);
        X1_9.setBackground(Color.white);
        X1_10.setBackground(Color.white);
        X1_11.setBackground(Color.white);
        X1_12.setBackground(Color.white);
        X1_13.setBackground(Color.white);
        X1_14.setBackground(Color.white);
        X1_15.setBackground(Color.white);
        X2_0.setBackground(Color.white);
        X2_1.setBackground(Color.white);
        X2_2.setBackground(Color.white);
        X2_3.setBackground(Color.white);
        X2_4.setBackground(Color.white);
        X2_5.setBackground(Color.white);
        X2_6.setBackground(Color.white);
        X2_7.setBackground(Color.white);
        X2_8.setBackground(Color.white);
        X2_9.setBackground(Color.white);
        X2_10.setBackground(Color.white);
        X2_11.setBackground(Color.white);
        X2_12.setBackground(Color.white);
        X2_13.setBackground(Color.white);
        X2_14.setBackground(Color.white);
        X2_15.setBackground(Color.white);
        X3_0.setBackground(Color.white);
        X3_1.setBackground(Color.white);
        X3_2.setBackground(Color.white);
        X3_3.setBackground(Color.white);
        X3_4.setBackground(Color.white);
        X3_5.setBackground(Color.white);
        X3_6.setBackground(Color.white);
        X3_7.setBackground(Color.white);
        X3_8.setBackground(Color.white);
        X3_9.setBackground(Color.white);
        X3_10.setBackground(Color.white);
        X3_11.setBackground(Color.white);
        X3_12.setBackground(Color.white);
        X3_13.setBackground(Color.white);
        X3_14.setBackground(Color.white);
        X3_15.setBackground(Color.white);
        OP_15.setBackground(Color.white);
        OP_14.setBackground(Color.white);
        OP_13.setBackground(Color.white);
        I_5.setBackground(Color.white);
        OP_12.setBackground(Color.white);
        OP_11.setBackground(Color.white);
        OP_10.setBackground(Color.white);
        GPR_9.setBackground(Color.white);
        GPR_8.setBackground(Color.white);
        IXR_7.setBackground(Color.white);
        IXR_6.setBackground(Color.white);
        ADDRESS_4.setBackground(Color.white);
        ADDRESS_3.setBackground(Color.white);
        ADDRESS_2.setBackground(Color.white);
        ADDRESS_1.setBackground(Color.white);
        ADDRESS_0.setBackground(Color.white);
        PC_0.setBackground(Color.white);
        PC_1.setBackground(Color.white);
        PC_2.setBackground(Color.white);
        PC_3.setBackground(Color.white);
        PC_4.setBackground(Color.white);
        PC_5.setBackground(Color.white);
        PC_6.setBackground(Color.white);
        PC_7.setBackground(Color.white);
        PC_8.setBackground(Color.white);
        PC_9.setBackground(Color.white);
        PC_10.setBackground(Color.white);
        PC_11.setBackground(Color.white);
        MAR_0.setBackground(Color.white);
        MAR_1.setBackground(Color.white);
        MAR_2.setBackground(Color.white);
        MAR_3.setBackground(Color.white);
        MAR_4.setBackground(Color.white);
        MAR_5.setBackground(Color.white);
        MAR_6.setBackground(Color.white);
        MAR_7.setBackground(Color.white);
        MAR_8.setBackground(Color.white);
        MAR_9.setBackground(Color.white);
        MAR_10.setBackground(Color.white);
        MAR_11.setBackground(Color.white);
        MBR_0.setBackground(Color.white);
        MBR_1.setBackground(Color.white);
        MBR_2.setBackground(Color.white);
        MBR_3.setBackground(Color.white);
        MBR_4.setBackground(Color.white);
        MBR_5.setBackground(Color.white);
        MBR_6.setBackground(Color.white);
        MBR_7.setBackground(Color.white);
        MBR_8.setBackground(Color.white);
        MBR_9.setBackground(Color.white);
        MBR_10.setBackground(Color.white);
        MBR_11.setBackground(Color.white);
        MBR_12.setBackground(Color.white);
        MBR_13.setBackground(Color.white);
        MBR_14.setBackground(Color.white);
        MBR_15.setBackground(Color.white);
        IR_0.setBackground(Color.white);
        IR_1.setBackground(Color.white);
        IR_2.setBackground(Color.white);
        IR_3.setBackground(Color.white);
        IR_4.setBackground(Color.white);
        IR_5.setBackground(Color.white);
        IR_6.setBackground(Color.white);
        IR_7.setBackground(Color.white);
        IR_8.setBackground(Color.white);
        IR_9.setBackground(Color.white);
        IR_10.setBackground(Color.white);
        IR_11.setBackground(Color.white);
        IR_12.setBackground(Color.white);
        IR_13.setBackground(Color.white);
        IR_14.setBackground(Color.white);
        IR_15.setBackground(Color.white);
        MFR_0.setBackground(Color.white);
        MFR_1.setBackground(Color.white);
        MFR_2.setBackground(Color.white);
        MFR_3.setBackground(Color.white);
        CC_0.setBackground(Color.white);
        CC_1.setBackground(Color.white);
        CC_2.setBackground(Color.white);
        CC_3.setBackground(Color.white);
        JLabel_IR.setText("IR");
        JPanel_IR.add(JLabel_IR);
        IR_15.setText("0");
        JPanel_IR.add(IR_15);
        IR_14.setText("0");
        JPanel_IR.add(IR_14);
        IR_13.setText("0");
        JPanel_IR.add(IR_13);
        IR_12.setText("0");
        JPanel_IR.add(IR_12);
        IR_11.setText("0");
        JPanel_IR.add(IR_11);
        IR_10.setText("0");
        JPanel_IR.add(IR_10);
        IR_9.setText("0");
        JPanel_IR.add(IR_9);
        IR_8.setText("0");
        JPanel_IR.add(IR_8);
        IR_7.setText("0");
        JPanel_IR.add(IR_7);
        IR_6.setText("0");
        JPanel_IR.add(IR_6);
        IR_5.setText("0");
        JPanel_IR.add(IR_5);
        IR_4.setText("0");
        JPanel_IR.add(IR_4);
        IR_3.setText("0");
        JPanel_IR.add(IR_3);
        IR_2.setText("0");
        JPanel_IR.add(IR_2);
        IR_1.setText("0");
        JPanel_IR.add(IR_1);
        IR_0.setText("0");
        JPanel_IR.add(IR_0);
        Load_IR.setText("LD");
        Load_IR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Load_IRActionPerformed(evt);
            }
        });
        JPanel_IR.add(Load_IR);
        JLabel_R0.setText("R0");
        JPanel_R0.add(JLabel_R0);
        R0_15.setText("0");
        JPanel_R0.add(R0_15);
        R0_14.setText("0");
        JPanel_R0.add(R0_14);
        R0_13.setText("0");
        JPanel_R0.add(R0_13);
        R0_12.setText("0");
        JPanel_R0.add(R0_12);
        R0_11.setText("0");
        JPanel_R0.add(R0_11);
        R0_10.setText("0");
        JPanel_R0.add(R0_10);
        R0_9.setText("0");
        JPanel_R0.add(R0_9);
        R0_8.setText("0");
        JPanel_R0.add(R0_8);
        R0_7.setText("0");
        JPanel_R0.add(R0_7);
        R0_6.setText("0");
        JPanel_R0.add(R0_6);
        R0_5.setText("0");
        JPanel_R0.add(R0_5);
        R0_4.setText("0");
        JPanel_R0.add(R0_4);
        R0_3.setText("0");
        JPanel_R0.add(R0_3);
        R0_2.setText("0");
        JPanel_R0.add(R0_2);
        R0_1.setText("0");
        JPanel_R0.add(R0_1);
        R0_0.setText("0");
        JPanel_R0.add(R0_0);
        Load_R0.setText("LD");
        Load_R0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Load_R0ActionPerformed(evt);
            }
        });
        JPanel_R0.add(Load_R0);
        JLabel_R1.setText("R1");
        JPanel_R1.add(JLabel_R1);
        R1_15.setText("0");
        JPanel_R1.add(R1_15);
        R1_14.setText("0");
        JPanel_R1.add(R1_14);
        R1_13.setText("0");
        JPanel_R1.add(R1_13);
        R1_12.setText("0");
        JPanel_R1.add(R1_12);
        R1_11.setText("0");
        JPanel_R1.add(R1_11);
        R1_10.setText("0");
        JPanel_R1.add(R1_10);
        R1_9.setText("0");
        JPanel_R1.add(R1_9);
        R1_8.setText("0");
        JPanel_R1.add(R1_8);
        R1_7.setText("0");
        JPanel_R1.add(R1_7);
        R1_6.setText("0");
        JPanel_R1.add(R1_6);
        R1_5.setText("0");
        JPanel_R1.add(R1_5);
        R1_4.setText("0");
        JPanel_R1.add(R1_4);
        R1_3.setText("0");
        JPanel_R1.add(R1_3);
        R1_2.setText("0");
        JPanel_R1.add(R1_2);
        R1_1.setText("0");
        JPanel_R1.add(R1_1);
        R1_0.setText("0");
        JPanel_R1.add(R1_0);
        Load_R1.setText("LD");
        Load_R1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Load_R1ActionPerformed(evt);
            }
        });
        JPanel_R1.add(Load_R1);
        JLabel_R2.setText("R2");
        JPanel_R2.add(JLabel_R2);
        R2_15.setText("0");
        JPanel_R2.add(R2_15);
        R2_14.setText("0");
        JPanel_R2.add(R2_14);
        R2_13.setText("0");
        JPanel_R2.add(R2_13);
        R2_12.setText("0");
        JPanel_R2.add(R2_12);
        R2_11.setText("0");
        JPanel_R2.add(R2_11);
        R2_10.setText("0");
        JPanel_R2.add(R2_10);
        R2_9.setText("0");
        JPanel_R2.add(R2_9);
        R2_8.setText("0");
        JPanel_R2.add(R2_8);
        R2_7.setText("0");
        JPanel_R2.add(R2_7);
        R2_6.setText("0");
        JPanel_R2.add(R2_6);
        R2_5.setText("0");
        JPanel_R2.add(R2_5);
        R2_4.setText("0");
        JPanel_R2.add(R2_4);
        R2_3.setText("0");
        JPanel_R2.add(R2_3);
        R2_2.setText("0");
        JPanel_R2.add(R2_2);
        R2_1.setText("0");
        JPanel_R2.add(R2_1);
        R2_0.setText("0");
        JPanel_R2.add(R2_0);
        Load_R2.setText("LD");
        Load_R2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Load_R2ActionPerformed(evt);
            }
        });
        JPanel_R2.add(Load_R2);
        JLabel_R3.setText("R3");
        JPanel_R3.add(JLabel_R3);
        R3_15.setText("0");
        JPanel_R3.add(R3_15);
        R3_14.setText("0");
        JPanel_R3.add(R3_14);
        R3_13.setText("0");
        JPanel_R3.add(R3_13);
        R3_12.setText("0");
        JPanel_R3.add(R3_12);
        R3_11.setText("0");
        JPanel_R3.add(R3_11);
        R3_10.setText("0");
        JPanel_R3.add(R3_10);
        R3_9.setText("0");
        JPanel_R3.add(R3_9);
        R3_8.setText("0");
        JPanel_R3.add(R3_8);
        R3_7.setText("0");
        JPanel_R3.add(R3_7);
        R3_6.setText("0");
        JPanel_R3.add(R3_6);
        R3_5.setText("0");
        JPanel_R3.add(R3_5);
        R3_4.setText("0");
        JPanel_R3.add(R3_4);
        R3_3.setText("0");
        JPanel_R3.add(R3_3);
        R3_2.setText("0");
        JPanel_R3.add(R3_2);
        R3_1.setText("0");
        JPanel_R3.add(R3_1);
        R3_0.setText("0");
        JPanel_R3.add(R3_0);
        Load_R3.setText("LD");
        Load_R3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Load_R3ActionPerformed(evt);
            }
        });
        JPanel_R3.add(Load_R3);
        JLabel_PC.setText("PC");
        JPanel_PC.add(JLabel_PC);
        PC_11.setText("0");
        JPanel_PC.add(PC_11);
        PC_10.setText("0");
        JPanel_PC.add(PC_10);
        PC_9.setText("0");
        JPanel_PC.add(PC_9);
        PC_8.setText("0");
        JPanel_PC.add(PC_8);
        PC_7.setText("0");
        JPanel_PC.add(PC_7);
        PC_6.setText("0");
        JPanel_PC.add(PC_6);
        PC_5.setText("0");
        JPanel_PC.add(PC_5);
        PC_4.setText("0");
        JPanel_PC.add(PC_4);
        PC_3.setText("0");
        JPanel_PC.add(PC_3);
        PC_2.setText("0");
        JPanel_PC.add(PC_2);
        PC_1.setText("0");
        JPanel_PC.add(PC_1);
        PC_0.setText("0");
        JPanel_PC.add(PC_0);
        Load_PC.setText("LD");
        Load_PC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Load_PCActionPerformed(evt);
            }
        });
        JPanel_PC.add(Load_PC);
        JLabel_MAR.setText("MAR");
        JPanel_MAR.add(JLabel_MAR);
        MAR_11.setText("0");
        JPanel_MAR.add(MAR_11);
        MAR_10.setText("0");
        JPanel_MAR.add(MAR_10);
        MAR_9.setText("0");
        JPanel_MAR.add(MAR_9);
        MAR_8.setText("0");
        JPanel_MAR.add(MAR_8);
        MAR_7.setText("0");
        JPanel_MAR.add(MAR_7);
        MAR_6.setText("0");
        JPanel_MAR.add(MAR_6);
        MAR_5.setText("0");
        JPanel_MAR.add(MAR_5);
        MAR_4.setText("0");
        JPanel_MAR.add(MAR_4);
        MAR_3.setText("0");
        JPanel_MAR.add(MAR_3);
        MAR_2.setText("0");
        JPanel_MAR.add(MAR_2);
        MAR_1.setText("0");
        JPanel_MAR.add(MAR_1);
        MAR_0.setText("0");
        JPanel_MAR.add(MAR_0);
        Load_MAR.setText("LD");
        Load_MAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Load_MARActionPerformed(evt);
            }
        });
        JPanel_MAR.add(Load_MAR);
        JLabel_MBR.setText("MBR");
        JPanel_MBR.add(JLabel_MBR);
        MBR_15.setText("0");
        JPanel_MBR.add(MBR_15);
        MBR_14.setText("0");
        JPanel_MBR.add(MBR_14);
        MBR_13.setText("0");
        JPanel_MBR.add(MBR_13);
        MBR_12.setText("0");
        JPanel_MBR.add(MBR_12);
        MBR_11.setText("0");
        JPanel_MBR.add(MBR_11);
        MBR_10.setText("0");
        JPanel_MBR.add(MBR_10);
        MBR_9.setText("0");
        JPanel_MBR.add(MBR_9);
        MBR_8.setText("0");
        JPanel_MBR.add(MBR_8);
        MBR_7.setText("0");
        JPanel_MBR.add(MBR_7);
        MBR_6.setText("0");
        JPanel_MBR.add(MBR_6);
        MBR_5.setText("0");
        JPanel_MBR.add(MBR_5);
        MBR_4.setText("0");
        JPanel_MBR.add(MBR_4);
        MBR_3.setText("0");
        JPanel_MBR.add(MBR_3);
        MBR_2.setText("0");
        JPanel_MBR.add(MBR_2);
        MBR_1.setText("0");
        JPanel_MBR.add(MBR_1);
        MBR_0.setText("0");
        JPanel_MBR.add(MBR_0);
        Load_MBR.setText("LD");
        Load_MBR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Load_MBRActionPerformed(evt);
            }
        });
        JPanel_MBR.add(Load_MBR);
        OP_15.setText("15");
        OP_15.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
        OP_15.setIconTextGap(2);
        JPanel_OP.add(OP_15);
        OP_14.setText("14");
        OP_14.setIconTextGap(2);
        JPanel_OP.add(OP_14);
        OP_13.setText("13");
        OP_13.setIconTextGap(2);
        JPanel_OP.add(OP_13);
        OP_12.setText("12");
        OP_12.setIconTextGap(2);
        JPanel_OP.add(OP_12);
        OP_11.setText("11");
        OP_11.setIconTextGap(2);
        JPanel_OP.add(OP_11);
        OP_10.setText("10");
        OP_10.setIconTextGap(2);
        JPanel_OP.add(OP_10);
        GPR_9.setText(" 9 ");
        GPR_9.setIconTextGap(2);
        JPanel_GPR.add(GPR_9);
        GPR_8.setText(" 8 ");
        GPR_8.setIconTextGap(2);
        JPanel_GPR.add(GPR_8);
        IXR_7.setText(" 7 ");
        IXR_7.setIconTextGap(2);
        JPanel_IXR.add(IXR_7);
        IXR_6.setText(" 6 ");
        IXR_6.setIconTextGap(2);
        JPanel_IXR.add(IXR_6);
        I_5.setText(" 5 ");
        I_5.setIconTextGap(2);
        JPanel_I.add(I_5);
        ADDRESS_4.setText(" 4 ");
        ADDRESS_4.setIconTextGap(2);
        JPanel_ADDRESS.add(ADDRESS_4);
        ADDRESS_3.setText(" 3 ");
        ADDRESS_3.setIconTextGap(2);
        JPanel_ADDRESS.add(ADDRESS_3);
        ADDRESS_2.setText(" 2 ");
        ADDRESS_2.setIconTextGap(2);
        JPanel_ADDRESS.add(ADDRESS_2);
        ADDRESS_1.setText(" 1 ");
        ADDRESS_1.setIconTextGap(2);
        JPanel_ADDRESS.add(ADDRESS_1);
        ADDRESS_0.setText(" 0 ");
        ADDRESS_0.setIconTextGap(2);
        JPanel_ADDRESS.add(ADDRESS_0);
        JPanel_OP_Main.setLayout(new GridLayout(2, 1));
        JPanel_OP_Main.add(JPanel_OP);
        JPanel_OP_Main.add(new JLabel("Operation"));
        JPanel_GPR_Main.setLayout(new GridLayout(2, 1));
        JPanel_GPR_Main.add(JPanel_GPR);
        JPanel_GPR_Main.add(new JLabel("GPR"));
        JPanel_IXR_Main.setLayout(new GridLayout(2, 1));
        JPanel_IXR_Main.add(JPanel_IXR);
        JPanel_IXR_Main.add(new JLabel("IXR"));
        JPanel_I_Main.setLayout(new GridLayout(2, 1));
        JPanel_I_Main.add(JPanel_I);
        JPanel_I_Main.add(new JLabel("I"));
        JPanel_ADDRESS_Main.setLayout(new GridLayout(2, 1));
        JPanel_ADDRESS_Main.add(JPanel_ADDRESS);
        JPanel_ADDRESS_Main.add(new JLabel("Address"));
        JLabel_X1.setText("X1");
        JPanel_X1.add(JLabel_X1);
        X1_15.setText("0");
        JPanel_X1.add(X1_15);
        X1_14.setText("0");
        JPanel_X1.add(X1_14);
        X1_13.setText("0");
        JPanel_X1.add(X1_13);
        X1_12.setText("0");
        JPanel_X1.add(X1_12);
        X1_11.setText("0");
        JPanel_X1.add(X1_11);
        X1_10.setText("0");
        JPanel_X1.add(X1_10);
        X1_9.setText("0");
        JPanel_X1.add(X1_9);
        X1_8.setText("0");
        JPanel_X1.add(X1_8);
        X1_7.setText("0");
        JPanel_X1.add(X1_7);
        X1_6.setText("0");
        JPanel_X1.add(X1_6);
        X1_5.setText("0");
        JPanel_X1.add(X1_5);
        X1_4.setText("0");
        JPanel_X1.add(X1_4);
        X1_3.setText("0");
        JPanel_X1.add(X1_3);
        X1_2.setText("0");
        JPanel_X1.add(X1_2);
        X1_1.setText("0");
        JPanel_X1.add(X1_1);
        X1_0.setText("0");
        JPanel_X1.add(X1_0);
        Load_X1.setText("LD");
        Load_X1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Load_X1ActionPerformed(evt);
            }
        });
        JPanel_X1.add(Load_X1);
        JLabel_X2.setText("X2");
        JPanel_X2.add(JLabel_X2);
        X2_15.setText("0");
        JPanel_X2.add(X2_15);
        X2_14.setText("0");
        JPanel_X2.add(X2_14);
        X2_13.setText("0");
        JPanel_X2.add(X2_13);
        X2_12.setText("0");
        JPanel_X2.add(X2_12);
        X2_11.setText("0");
        JPanel_X2.add(X2_11);
        X2_10.setText("0");
        JPanel_X2.add(X2_10);
        X2_9.setText("0");
        JPanel_X2.add(X2_9);
        X2_8.setText("0");
        JPanel_X2.add(X2_8);
        X2_7.setText("0");
        JPanel_X2.add(X2_7);
        X2_6.setText("0");
        JPanel_X2.add(X2_6);
        X2_5.setText("0");
        JPanel_X2.add(X2_5);
        X2_4.setText("0");
        JPanel_X2.add(X2_4);
        X2_3.setText("0");
        JPanel_X2.add(X2_3);
        X2_2.setText("0");
        JPanel_X2.add(X2_2);
        X2_1.setText("0");
        JPanel_X2.add(X2_1);
        X2_0.setText("0");
        JPanel_X2.add(X2_0);
        Load_X2.setText("LD");
        Load_X2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Load_X2ActionPerformed(evt);
            }
        });
        JPanel_X2.add(Load_X2);
        JLabel_X3.setText("X3");
        JPanel_X3.add(JLabel_X3);
        X3_15.setText("0");
        JPanel_X3.add(X3_15);
        X3_14.setText("0");
        JPanel_X3.add(X3_14);
        X3_13.setText("0");
        JPanel_X3.add(X3_13);
        X3_12.setText("0");
        JPanel_X3.add(X3_12);
        X3_11.setText("0");
        JPanel_X3.add(X3_11);
        X3_10.setText("0");
        JPanel_X3.add(X3_10);
        X3_9.setText("0");
        JPanel_X3.add(X3_9);
        X3_8.setText("0");
        JPanel_X3.add(X3_8);
        X3_7.setText("0");
        JPanel_X3.add(X3_7);
        X3_6.setText("0");
        JPanel_X3.add(X3_6);
        X3_5.setText("0");
        JPanel_X3.add(X3_5);
        X3_4.setText("0");
        JPanel_X3.add(X3_4);
        X3_3.setText("0");
        JPanel_X3.add(X3_3);
        X3_2.setText("0");
        JPanel_X3.add(X3_2);
        X3_1.setText("0");
        JPanel_X3.add(X3_1);
        X3_0.setText("0");
        JPanel_X3.add(X3_0);
        Load_X3.setText("LD");
        Load_X3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Load_X3ActionPerformed(evt);
            }
        });
        JPanel_X3.add(Load_X3);
        JLabel_MFR.setText("MFR");
        JPanel_MFR.add(JLabel_MFR);
        MFR_3.setText("0");
        JPanel_MFR.add(MFR_3);
        MFR_2.setText("0");
        JPanel_MFR.add(MFR_2);
        MFR_1.setText("0");
        JPanel_MFR.add(MFR_1);
        MFR_0.setText("0");
        JPanel_MFR.add(MFR_0);
        JLabel_CC.setText("CC");
        JPanel_CC.add(JLabel_CC);
        CC_3.setText("0");
        JPanel_CC.add(CC_3);
        CC_2.setText("0");
        JPanel_CC.add(CC_2);
        CC_1.setText("0");
        JPanel_CC.add(CC_1);
        CC_0.setText("0");
        JPanel_CC.add(CC_0);
        Store.setText("Store");
        Store.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StoreActionPerformed(evt);
            }
        });
        JPanel_Func.add(Store);
        Load.setText("Load");
        Load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadActionPerformed(evt);
            }
        });
        JPanel_Func.add(Load);
        Clear_All.setText("Clear All");
        Clear_All.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear_AllActionPerformed(evt);
            }
        });
        JPanel_Func.add(Clear_All);
        Init.setText("Init");
        Init.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InitActionPerformed(evt);
            }
        });
        JPanel_Init.add(Init);
        Custom_Init.setText("Custom Init");
        Custom_Init.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Custom_InitActionPerformed(evt);
            }
        });
        JPanel_Init.add(Custom_Init);
        SS.setText("SS");
        SS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SSActionPerformed(evt);
            }
        });
        JPanel_OPT.add(SS);
        Run.setText("Run");
        Run.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RunActionPerformed(evt);
            }
        });
        JPanel_OPT.add(Run);
        G_Layout = new GridLayout(2, 2);
        G_Layout.setVgap(10);
        G_Layout.setHgap(10);
        JPanel_Display.setLayout(G_Layout);
        JLabel_Halt.setText("Halt");
        JPanel_Display.add(JLabel_Halt);
        Halt_Display.setBackground(Color.black);
        JPanel_Display.add(Halt_Display);
        JLabel_Run.setText("Run");
        JPanel_Display.add(JLabel_Run);
        JPanel_Display.add(JLabel_Run);
        JPanel_Run.setBackground(Color.black);
        JPanel_Display.add(JPanel_Run);
        JPanel_INSTRUCTION.add(JPanel_OP_Main);
        JPanel_INSTRUCTION.add(JPanel_GPR_Main);
        JPanel_INSTRUCTION.add(JPanel_IXR_Main);
        JPanel_INSTRUCTION.add(JPanel_I_Main);
        JPanel_INSTRUCTION.add(JPanel_ADDRESS_Main);
        JPanelMain.add(JPanel_R0);
        JPanelMain.add(JPanel_R1);
        JPanelMain.add(JPanel_R2);
        JPanelMain.add(JPanel_R3);
        JPanelMain.add(JPanel_X1);
        JPanelMain.add(JPanel_X2);
        JPanelMain.add(JPanel_X3);
        JPanelMain.add(JPanel_IR);
        JPanelMain.add(JPanel_MBR);
        JPanel_Grid1 = new JPanel();
        G_Layout1 = new GridLayout(3, 1);
        JPanel_Grid1.setLayout(G_Layout1);
        JPanel_Grid1.add(JPanel_MAR);
        JPanel_Grid1.add(JPanel_PC);
        JPanel_Grid1.add(JPanel_MFR);
        JPanel_Grid1.add(JPanel_CC);
        JPanelMain.add(JPanel_Grid1);
        JPanelMain.add(JPanel_INSTRUCTION);
        JPanel_Grid2 = new JPanel();
        G_Layout2 = new GridLayout(1, 3);
        JPanel_Grid2.setLayout(G_Layout2);
        JPanel_Grid2.add(JPanel_Func);
        JPanel_Grid2.add(JPanel_Init);
        JPanel_Grid2.add(JPanel_OPT);
        JPanelMain.add(JPanel_Grid2);
        JPanelMain.add(JPanel_Display);

        f.add(JPanelMain);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComputerSimulator();
            }
        });

    }
}