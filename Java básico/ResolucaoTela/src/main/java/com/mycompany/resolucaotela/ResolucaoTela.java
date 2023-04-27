/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author alexs
 */
public class ResolucaoTela {

    public static void main(String[] args) {
        Toolkit res = Toolkit.getDefaultToolkit();
        Dimension tam = res.getScreenSize();
        System.out.println("a resolucao da tela eh");
        System.out.printf("%d por %d", tam.width,  tam.height);
    }
}
