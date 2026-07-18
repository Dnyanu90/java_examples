package com.tecspeak.basics;

/**
 * Converts numbers into their word representation, supporting both English (IN)
 * and Marathi (MR) locales.
 *
 * @author TecSpeak
 */
public class PrintsWords {

    /** English words for numbers 0 to 19. */
    static final String[] ONES = {
            "", "One", "Two", "Three", "Four", "Five",
            "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen",
            "Fifteen", "Sixteen", "Seventeen",
            "Eighteen", "Nineteen"};

    /** English words for multiples of ten. */
    static final String[] TENS = {
            "", "", "Twenty", "Thirty", "Forty",
            "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    /** Marathi words for numbers 0 to 99. */
    private static final String[] MARATHI_ONES = {
            "", "एक", "दोन", "तीन", "चार", "पाच", "सहा", "सात", "आठ", "नऊ", "दहा",
            "अकरा", "बारा", "तेरा", "चौदा", "पंधरा", "सोळा", "सतरा", "अठरा", "एकोणीस", "वीस",
            "एकवीस", "बावीस", "तेवीस", "चोवीस", "पंचवीस", "सभ्वीस", "सत्तावीस", "अठ्ठावीस", "एकोणतीस", "तीस",
            "एकतीस", "बत्तीस", "तेहतीस", "चौतीस", "पस्तीस", "छत्तीस", "सदुतीस", "अडुतीस", "एकोणचाळीस", "चाळीस",
            "एकचाळीस", "ब्याऐंशी", "त्र्याऐंशी", "चौर्याऐंशी", "पंचेचाळीस", "शाळाचेस", "सत्तेचाळीस", "अठ्ठेचाळीस", "एकोणपन्नास", "पन्नास",
            "एक्कावन्न", "बावन्न", "त्रेपन्न", "चोपन", "पंचावन्न", "शहाण्णव", "सत्तातन्न", "अठ्ठावन्न", "एकोणसाठ", "साठ",
            "एकसष्ठ", "बासष्ठ", "त्रेसष्ठ", "चौसष्ठ", "पाचसठ", "सहासठ", "सदुसष्ठ", "अडुसष्ठ", "एकोणसत्तर", "सत्तर",
            "एक्केहत्तर", "बाहत्तर", "त्र्याहत्तर", "चौऱ्याहत्तर", "पंच्याहत्तर", "शहात्तर", "सत्त्याहत्तर", "अठ्ठ्याहत्तर", "एकोणाऐंशी", "ऐंशी",
            "एक्क्यांशी", "ब्यांशी", "त्र्यांशी", "चौऱ्यांशी", "पंच्यांशी", "शहांशी", "सत्त्यांशी", "अठ्ठ्यांशी", "एकोणनव्वद", "नव्वद",
            "एक्क्याण्णव", "ब्याण्णव", "त्र्याण्णव", "चौऱ्याण्णव", "पंच्याण्णव", "शहाण्णव", "सत्त्याण्णव", "अठ्ठ्याण्णव", "नव्व्याण्णव"
    };

    /**
     * Prints the word representation of a number based on the specified locale.
     * <p>
     * IN locale supports numbers up to 9999 in English.
     * MR locale supports numbers up to 99 in Marathi.
     * </p>
     *
     * @param num    the number to translate
     * @param locale the locale string ("IN" for English, "MR" for Marathi)
     */
    public static void printsNumbersToWords(int num, String locale) {

        if (locale.equals("IN")) {
            if (num < 20) {
                System.out.println(ONES[num]);
            } else if (num < 100) {
                int unitDigit = num % 10;
                int tensDigit = num / 10;
                System.out.println(TENS[tensDigit] + " " + ONES[unitDigit]);
            } else if (num < 1000) {
                int unitDigit = num % 10;
                int tensDigit = (num / 10) % 10;
                int hundredsDigit = num / 100;
                System.out.println(ONES[hundredsDigit] + " Hundred " + TENS[tensDigit] + " " + ONES[unitDigit]);
            } else if (num < 10000) {
                int unitDigit = num % 10;
                int tensDigit = (num / 10) % 10;
                int hundredsDigit = (num / 100) % 10;
                int thousandsDigit = num / 1000;
                System.out.println(ONES[thousandsDigit] + " Thousand " + ONES[hundredsDigit] + " Hundred " + TENS[tensDigit] + " " + ONES[unitDigit]);
            }
        } else if (locale.equals("MR")) {
            if (num < 100) {
                System.out.println(MARATHI_ONES[num]);
            }
        }
    }

    /**
     * Main method demonstrating number translation in multiple locales.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        printsNumbersToWords(89, "MR");
        printsNumbersToWords(105, "IN");
    }
}
