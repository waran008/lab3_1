import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String input =  JOptionPane.showInputDialog("ใส่ตัวเลข 1 ตัว","0");
        JOptionPane.showMessageDialog(null,input,"title",JOptionPane.INFORMATION_MESSAGE);
        int ans = JOptionPane.showConfirmDialog(null,"i love you ?","you love me ?"
                                      ,JOptionPane.YES_NO_OPTION);
        if(ans==JOptionPane.YES_NO_OPTION){
            JOptionPane.showMessageDialog(null,"i love you jubu");
        }else {
            JOptionPane.showMessageDialog(null,"i hate you");

        }

    }
}
