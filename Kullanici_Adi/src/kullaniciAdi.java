import java.util.Scanner;

public class kullaniciAdi {

    public static void main(String[] args) {

        String userName,password,reset,newPassword,evet,hayir;


        Scanner inp = new Scanner (System.in);

        //Kullanıcı adı ve şifreyi kullanıcıya sor
        System.out.print("Kullanıcı Adınızı Giriniz:");
        userName = inp.nextLine();
        System.out.print("Şifrenizi giriniz:");
        password = inp.nextLine();
        //Koşulları oluştur
        if ((userName.equals("Patika")) && (password.equals("java123"))) {

            System.out.print("Bilgileriniz doğru. Giriş başarılı"); }

        else if (userName.equals("Patika") && (!password.equals("java123"))) {

            System.out.print("Şifreniz hatalı ");
            System.out.print("Şifrenizi yenilemek ister misiniz? - e/h: ");
            reset = inp.nextLine();
                if (reset.equals("e")) {
                    System.out.print("Yeni şifrenizi giriniz.");
                    newPassword = inp.nextLine();
                    if (newPassword.equals("java123")){
                        System.out.print("Eski şifrenizi giremezsiniz."); }
                    else {
                        password = newPassword;
                        System.out.print("Şifreniz başarılı bir şekilde değiştirildi");
                        } }
                else {
                    System.out.print("Tekrar giriş yapınız");

                } }
        else {

            System.out.print("Bilgileriniz yanlış.");

                        }
                    }
                    }

