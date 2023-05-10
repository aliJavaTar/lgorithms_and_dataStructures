package com.javaBoy.kata;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindCommonWord {

    public boolean hasCommonWord(char[] firstArray, char[] secondArray) {
        for (char character : firstArray) {
            for (char value : secondArray) {
                if (character == value)
                    return true;
            }
        }
        return false;

    }

    public boolean hasCommonWordBetterWayWhitSet(char[] firstArray, char[] secondArray) {
        Map<Integer, Character> hashMap = new HashMap<>();
        for (int index = 0; index < firstArray.length; index++) {
            hashMap.put(index, firstArray[index]);
        }

        for (char character : secondArray) {
            if (hashMap.containsValue(character))
                return true;
        }
        return false;
    }
}
