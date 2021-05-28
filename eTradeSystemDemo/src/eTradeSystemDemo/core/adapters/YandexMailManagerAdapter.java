package eTradeSystemDemo.core.adapters;

import eTradeSystemDemo.YandexMailManager.YandexMailManager;
import eTradeSystemDemo.core.abstracts.EmailService;

public class YandexMailManagerAdapter implements EmailService {
   private YandexMailManager yandexMailManager;
   public YandexMailManagerAdapter( ){
    yandexMailManager=new YandexMailManager();

    }

    public void send(String email, String message) {
        System.out.println("Email gönderilmiştir.");
        }
    }


