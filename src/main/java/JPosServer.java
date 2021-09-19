import org.jpos.iso.ISOException;
import org.jpos.q2.Q2;

public class JPosServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ISOException {
        System.out.println("Server Start");

        Q2 aplikasiJpos = new Q2();
        aplikasiJpos.start();
        System.out.println("Server UP");


    }
}
