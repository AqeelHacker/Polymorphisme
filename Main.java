
package Notifikasi;

public class Main {

    public static void main(String[] args) {
        String emailPenerima = "zexyuzxuan@yahoo.co.id";
        String nomerHp = "+62877789779789";
        String mobileId = "android-444444";

        EmailNotifikasi emailNotif = new EmailNotifikasi();
        SmsNotifikasi smsNotif = new SmsNotifikasi();
        PushNotifikasi pushNotif = new PushNotifikasi();

        String message = "";
        
        emailNotif.sendMessage(emailPenerima, message);
        smsNotif.sendMessage(nomerHp, message);
        pushNotif.sendMessage(mobileId, message);
    }
}