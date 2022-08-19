package com.example.bluetoothterminal.Mod_7;

class DTCBuilder {

    /**
     *          DTC builder:
     *      _______   _______   _______   _______   _______
     *     |       | |       | |       | |       | |       |
     *     | DTC_1 | | DTC_2 | | DTC_3 | | DTC_4 | | DTC_5 |
     *     |_______| |_______| |_______| |_______| |_______|
     *
     */
    private static String DTC_1 = null;
    private static String DTC_2 = null;
    private static String DTC_3 = null;
    private static String DTC_4 = null;
    private static String DTC_5 = null;
    private static String response = "No DTC found.";

    static String buildDTC(String firstHex, String secondHex) {
        if (firstHex != null && secondHex != null) {


            String firstByteLine = HexToByte(firstHex);
            String secondByteLine = HexToByte(secondHex);

            /**
             * First DTC character.
             *
             *     _________________________|________
             *          P - Powertrain      |   00
             *          C - Chassis         |   01
             *          B - Body            |   10
             *          U - Network         |   11
             *
             */
            if (firstByteLine.substring(0, 2).equals("00")) DTC_1 = "P";
            if (firstByteLine.substring(0, 2).equals("01")) DTC_1 = "C";
            if (firstByteLine.substring(0, 2).equals("10")) DTC_1 = "B";
            if (firstByteLine.substring(0, 2).equals("11")) DTC_1 = "U";
            /**
             * Second DTC character.
             *
             *      _________________________________________|_______
             *      0 - Common trouble code                  |  00
             *      1 - Manufacturer specific trouble code   |  01
             *      2 - Common trouble code                  |  10
             *      3 - Manufacturer specific trouble code   |  11
             *
             */
            if (firstByteLine.substring(2, 4).equals("00")) DTC_2 = "0";
            if (firstByteLine.substring(2, 4).equals("01")) DTC_2 = "1";
            if (firstByteLine.substring(2, 4).equals("10")) DTC_2 = "2";
            if (firstByteLine.substring(2, 4).equals("11")) DTC_2 = "3";

            /**
             * Third DTC character.
             *
             *       ___________|_______              ___________|_______
             *             0    |  0000                     8    |  1000
             *             1    |  0001                     9    |  1001
             *             2    |  0010                     A    |  1010
             *             3    |  0011                     B    |  1011
             *             4    |  0100                     C    |  1100
             *             5    |  0101                     D    |  1101
             *             6    |  0110                     E    |  1110
             *             7    |  0111                     F    |  1111
             *
             *
             */
            if (firstByteLine.substring(4, 8).equals("0000")) DTC_3 = "0";
            if (firstByteLine.substring(4, 8).equals("0001")) DTC_3 = "1";
            if (firstByteLine.substring(4, 8).equals("0010")) DTC_3 = "2";
            if (firstByteLine.substring(4, 8).equals("0011")) DTC_3 = "3";
            if (firstByteLine.substring(4, 8).equals("0100")) DTC_3 = "4";
            if (firstByteLine.substring(4, 8).equals("0101")) DTC_3 = "5";
            if (firstByteLine.substring(4, 8).equals("0110")) DTC_3 = "6";
            if (firstByteLine.substring(4, 8).equals("0111")) DTC_3 = "7";
            if (firstByteLine.substring(4, 8).equals("1000")) DTC_3 = "8";
            if (firstByteLine.substring(4, 8).equals("1001")) DTC_3 = "9";
            if (firstByteLine.substring(4, 8).equals("1010")) DTC_3 = "A";
            if (firstByteLine.substring(4, 8).equals("1011")) DTC_3 = "B";
            if (firstByteLine.substring(4, 8).equals("1100")) DTC_3 = "C";
            if (firstByteLine.substring(4, 8).equals("1101")) DTC_3 = "D";
            if (firstByteLine.substring(4, 8).equals("1110")) DTC_3 = "E";
            if (firstByteLine.substring(4, 8).equals("1111")) DTC_3 = "F";

            /**
             * Fourth DTC character.
             *
             *       ___________|_______              ___________|_______
             *             0    |  0000                     8    |  1000
             *             1    |  0001                     9    |  1001
             *             2    |  0010                     A    |  1010
             *             3    |  0011                     B    |  1011
             *             4    |  0100                     C    |  1100
             *             5    |  0101                     D    |  1101
             *             6    |  0110                     E    |  1110
             *             7    |  0111                     F    |  1111
             *
             *
             */
            if (secondByteLine.substring(0, 4).equals("0000")) DTC_4 = "0";
            if (secondByteLine.substring(0, 4).equals("0001")) DTC_4 = "1";
            if (secondByteLine.substring(0, 4).equals("0010")) DTC_4 = "2";
            if (secondByteLine.substring(0, 4).equals("0011")) DTC_4 = "3";
            if (secondByteLine.substring(0, 4).equals("0100")) DTC_4 = "4";
            if (secondByteLine.substring(0, 4).equals("0101")) DTC_4 = "5";
            if (secondByteLine.substring(0, 4).equals("0110")) DTC_4 = "6";
            if (secondByteLine.substring(0, 4).equals("0111")) DTC_4 = "7";
            if (secondByteLine.substring(0, 4).equals("1000")) DTC_4 = "8";
            if (secondByteLine.substring(0, 4).equals("1001")) DTC_4 = "9";
            if (secondByteLine.substring(0, 4).equals("1010")) DTC_4 = "A";
            if (secondByteLine.substring(0, 4).equals("1011")) DTC_4 = "B";
            if (secondByteLine.substring(0, 4).equals("1100")) DTC_4 = "C";
            if (secondByteLine.substring(0, 4).equals("1101")) DTC_4 = "D";
            if (secondByteLine.substring(0, 4).equals("1110")) DTC_4 = "E";
            if (secondByteLine.substring(0, 4).equals("1111")) DTC_4 = "F";

            /**
             * Fifth DTC character.
             *
             *       ___________|_______              ___________|_______
             *             0    |  0000                     8    |  1000
             *             1    |  0001                     9    |  1001
             *             2    |  0010                     A    |  1010
             *             3    |  0011                     B    |  1011
             *             4    |  0100                     C    |  1100
             *             5    |  0101                     D    |  1101
             *             6    |  0110                     E    |  1110
             *             7    |  0111                     F    |  1111
             *
             *
             */
            if (secondByteLine.substring(4, 8).equals("0000")) DTC_5 = "0";
            if (secondByteLine.substring(4, 8).equals("0001")) DTC_5 = "1";
            if (secondByteLine.substring(4, 8).equals("0010")) DTC_5 = "2";
            if (secondByteLine.substring(4, 8).equals("0011")) DTC_5 = "3";
            if (secondByteLine.substring(4, 8).equals("0100")) DTC_5 = "4";
            if (secondByteLine.substring(4, 8).equals("0101")) DTC_5 = "5";
            if (secondByteLine.substring(4, 8).equals("0110")) DTC_5 = "6";
            if (secondByteLine.substring(4, 8).equals("0111")) DTC_5 = "7";
            if (secondByteLine.substring(4, 8).equals("1000")) DTC_5 = "8";
            if (secondByteLine.substring(4, 8).equals("1001")) DTC_5 = "9";
            if (secondByteLine.substring(4, 8).equals("1010")) DTC_5 = "A";
            if (secondByteLine.substring(4, 8).equals("1011")) DTC_5 = "B";
            if (secondByteLine.substring(4, 8).equals("1100")) DTC_5 = "C";
            if (secondByteLine.substring(4, 8).equals("1101")) DTC_5 = "D";
            if (secondByteLine.substring(4, 8).equals("1110")) DTC_5 = "E";
            if (secondByteLine.substring(4, 8).equals("1111")) DTC_5 = "F";

            String DTC = DTC_1 + DTC_2 + DTC_3 + DTC_4 + DTC_5;
            response =  DTC ;
        }

        return response;
    }
    private static String HexToByte(String hex) {
        int decimalValue = Integer.parseInt(hex, 16);
        String byteString = Integer.toBinaryString(decimalValue);
        String byteStringWithZeros = String.format("%8s", byteString).replace(' ', '0');
        return byteStringWithZeros;
    }
}
