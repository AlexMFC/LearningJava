/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.linguadosistema;

import java.util.Locale;

/**
 *
 * @author alexs
 */
public class LinguaDoSistema {

    public static void main(String[] args) {
        Locale language = Locale.getDefault();
        String idioma = language.getDisplayLanguage();
        System.out.println("o idioma do sistema eh");
        System.out.println(idioma);
        
    }
}
