package com.fasterxml.aalto.util;

public final class TextUtil
{
    final static int CHAR_SPACE = 0x0020;

    private TextUtil() { }

    public static boolean isAllWhitespace(String str, boolean xml11)
    {
        for (int i = 0, len = str.length(); i < len; ++i) {
            int c = (int) str.charAt(i);
            if (c > CHAR_SPACE && (!xml11 || c != 0x85)) {
                return false;
            }
        }
        return true;
    }


    public static boolean isAllWhitespace(char[] ch, int start, int len, boolean xml11)
    {
        len += start;
        for (; start < len; ++start) {
            int c = (int) ch[start];
            if (c > CHAR_SPACE && (!xml11 || c != 0x85)) {
                return false;
            }
        }
        return true;
    }
}
