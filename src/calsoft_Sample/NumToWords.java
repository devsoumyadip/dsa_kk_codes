package calsoft_Sample;
import java.util.HashMap;
import java.util.Map;

public class NumToWords {


        private static final Map<Integer, String> numbersToWords = new HashMap<>();

        static {
            numbersToWords.put(0, "zero");
            numbersToWords.put(1, "one");
            numbersToWords.put(2, "two");
            numbersToWords.put(3, "three");
            numbersToWords.put(4, "four");
            numbersToWords.put(5, "five");
            numbersToWords.put(6, "six");
            numbersToWords.put(7, "seven");
            numbersToWords.put(8, "eight");
            numbersToWords.put(9, "nine");
            numbersToWords.put(10, "ten");
            numbersToWords.put(11, "eleven");
            numbersToWords.put(12, "twelve");
            numbersToWords.put(13, "thirteen");
            numbersToWords.put(14, "fourteen");
            numbersToWords.put(15, "fifteen");
            numbersToWords.put(16, "sixteen");
            numbersToWords.put(17, "seventeen");
            numbersToWords.put(18, "eighteen");
            numbersToWords.put(19, "nineteen");
            numbersToWords.put(20, "twenty");
            numbersToWords.put(30, "thirty");
            numbersToWords.put(40, "forty");
            numbersToWords.put(50, "fifty");
            numbersToWords.put(60, "sixty");
            numbersToWords.put(70, "seventy");
            numbersToWords.put(80, "eighty");
            numbersToWords.put(90, "ninety");
            numbersToWords.put(100, "hundred");
            numbersToWords.put(1000, "thousand");
            numbersToWords.put(1000000, "million");
            numbersToWords.put(1000000000, "billion");
        }

        public static String numberToWords(long number) {

            if (number == 0) {
                return numbersToWords.get(0);
            }

            StringBuilder words = new StringBuilder();
            int group = 0;
            while (number != 0) {
                int groupNumber = (int) (number % 1000);
                String groupWords = convertGroup(groupNumber);
                if (!groupWords.isEmpty()) {
                    words.insert(0, groupWords + (group > 0 ? " " + numbersToWords.get(1000 * group) : ""));
                }
                number /= 1000;
                group++;
            }

            return words.toString().trim();
        }

        private static String convertGroup(int groupNumber) {
            StringBuilder groupWords = new StringBuilder();
            int hundreds = groupNumber / 100;
            if (hundreds > 0) {
                groupWords.append(numbersToWords.get(hundreds) + " hundred");
            }
            groupNumber %= 100;

            if (groupNumber > 0) {
                if (groupWords.length() > 0) {
                    groupWords.append(" ");
                }
                if (groupNumber <= 20) {
                    groupWords.append(numbersToWords.get(groupNumber));
                } else {
                    int tens = groupNumber / 10;
                    int ones = groupNumber % 10;
                    groupWords.append(numbersToWords.get(tens * 10));
                    if (ones > 0) {
                        groupWords.append(" " + numbersToWords.get(ones));
                    }
                }
            }

            return groupWords.toString().trim();
        }

        public static void main(String[] args) {
            long number = 10201;
            String words = numberToWords(number);
            System.out.println(words); // Output: "ten thousand two hundred and one"
        }
    }

