import java.util.Random;

public class CaptchaGenerator {

  public static String generateCaptcha(int length) {
    String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    StringBuilder captcha = new StringBuilder();
    Random random = new Random();
    for (int i = 0; i < length; i++) {
      int index = random.nextInt(characters.length());
      captcha.append(characters.charAt(index));
    }
    return captcha.toString();
  }

  public static void main(String[] args) {
    int captchaLength = 6;
    String captcha = generateCaptcha(captchaLength);
    System.out.println("CAPTCHA: " + captcha);
  }
}
