package inherit.voice;

/**
 * @Author: py
 * @Date: 2019-04-16 20:13
 * @Version 1.0
 */
public class SalesVoice extends Invoice {
    public static String formatId(int id) {
        System.out.println();
        return "Sales_VoiceId: " + id;
    }

    public static void main(String[] args) {
        Invoice invoice = new SalesVoice();
        System.out.println(invoice.formatId(123));
        SalesVoice salesVoice = new SalesVoice();
        System.out.println(salesVoice.formatId(123));
        // System.out.println((SalesVoice)invoice.formatId(123)); Unable to run

    }
}
