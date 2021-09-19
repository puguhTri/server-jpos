package iso;

import org.jpos.iso.ISOMsg;
import org.jpos.iso.ISORequestListener;
import org.jpos.iso.ISOSource;

import java.util.logging.Level;
import java.util.logging.Logger;

public class RequestListener implements ISORequestListener {
    @Override
    public boolean process(ISOSource sender, ISOMsg request) {
        try {
            String mti = request.getMTI();
            if ("0200".equals(mti)) {
                ISOMsg response = (ISOMsg) request.clone();
                response.setMTI("0810");
                response.set(39, "00");
                response.set(104, "Puguh");
                response.set(4, "100000");
                sender.send(response);
                return true;
            }


            return false;
        } catch (Exception ex) {
            Logger.getLogger(RequestListener.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
