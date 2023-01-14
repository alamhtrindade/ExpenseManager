package expenseManager.Model;
import java.util.Date;
import javax.swing.JLabel;
import java.text.SimpleDateFormat;

/**
 *
 * @author alamtrindade
 */
public class UpdateTime extends Thread{
    
    private JLabel hour;
    
    public UpdateTime(JLabel hour) {
        this.hour = hour;
    }
    
    @Override
    public void run(){
        try{
            while(true){
                
                Date d = new Date();
                
                StringBuffer buff = new StringBuffer();
                
                SimpleDateFormat updater = new SimpleDateFormat("HH:mm:ss");
                
                this.hour.setText(buff.toString() + updater.format(d));
                Thread.sleep(1000);
                this.hour.revalidate();
            }
        }catch(InterruptedException e){
            System.out.println("Problema na atualização da Hora");
            e.printStackTrace();
        }
    }
}
