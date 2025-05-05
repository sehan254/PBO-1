import javax.swing.JOptionPane;

public class tugas_2 {
    public static void main(String[] args) {
       
        String pelajaran = JOptionPane.showInputDialog(null, "Anda sedang belajar apa?", "Input", JOptionPane.QUESTION_MESSAGE);
        
        if (pelajaran == null || pelajaran.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Input tidak boleh kosong", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(null, "Belajar " + pelajaran + " sangat mudah", "Message", JOptionPane.INFORMATION_MESSAGE);
    }
}
