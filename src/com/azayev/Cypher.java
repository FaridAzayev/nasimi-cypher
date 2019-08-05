package com.azayev;

import java.util.HashMap;
import java.util.Map;

public class Cypher {
    private Map<Character, Character> cypherAlphabet = new HashMap<>();

    public Cypher() {
        init();
    }

    private void init() {
        char[] alphabet = {'a', 'b', 'c', 'ç', 'd', 'e', 'ə', 'f', 'g', 'ğ', 'h', 'x', 'ı', 'i', 'j', 'k', 'q', 'l', 'm', 'n', 'o', 'ö', 'p', 'r', 's', 'ş', 't', 'u', 'ü', 'v', 'y', 'z'};
        int i = 0;
        for (char c : alphabet) {
            cypherAlphabet.put(c, alphabet[(++i % 32)]);
        }
    }

    public String encode(String original) {
        char[] encoded = original.toCharArray();
        int i = 0;
        for (char c : original.toCharArray()) {
            if (cypherAlphabet.containsKey(c)) {
                encoded[i] = cypherAlphabet.get(c);
            }
            i++;
        }
        return new String(encoded);
    }
}