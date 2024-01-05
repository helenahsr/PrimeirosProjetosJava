package com.mycompany.linguagemdosistema;

import java.util.Locale;

public class LinguagemDoSistema {

    public static void main(String[] args) {
        Locale idioma = Locale.getDefault(); 
        System.out.println("O idioma do sistema está em: " + idioma.toString());
    }
}
