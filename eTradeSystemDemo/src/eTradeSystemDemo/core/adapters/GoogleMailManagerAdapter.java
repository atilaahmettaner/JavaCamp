package eTradeSystemDemo.core.adapters;

import eTradeSystemDemo.core.abstracts.EmailService;
import eTradeSystemDemo.googleAuth.GoogleAuthManager;
import eTradeSystemDemo.googleMailManager.GoogleMailManager;

public class GoogleMailManagerAdapter implements EmailService {
        private GoogleMailManager googleMailManager;
    public GoogleMailManagerAdapter() {
        googleMailManager =new GoogleMailManager();

    }
    @Override
    public void send(String email, String massage) {
    googleMailManager.sendToMail(email,massage);
    }
}
