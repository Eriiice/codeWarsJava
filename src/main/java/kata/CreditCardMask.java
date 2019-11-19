//Maskify.Maskify("4556364607935616"); // should return "############5616"
//  Maskify.Maskify("64607935616");      // should return "#######5616"
//  Maskify.Maskify("1");                // should return "1"
//  Maskify.Maskify("");                 // should return ""
//
//"What was the name of your first pet?"
//  Maskify.Maskify("Skippy");                                   // should return "##ippy"
//  Maskify.Maskify("Nananananananananananananananana Batman!"); // should return "####################################man!"
//
//  Link: http://www.codewars.com/kata/5412509bd436bd33920011bc/train/java"

package kata;

public class CreditCardMask {
    public static String maskify(String str) {
        if(str.length()>=4){
            int maskLength = str.length()-4;

            StringBuilder sbMaskString = new StringBuilder(maskLength);

            for(int i = 0; i < maskLength; i++){
                sbMaskString.append('#');
            }

            return sbMaskString.toString()
                    + str.substring(maskLength);
        }return str;
    }
}
