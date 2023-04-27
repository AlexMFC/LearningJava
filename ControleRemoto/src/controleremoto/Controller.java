/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controleremoto;

/**
 *
 * @author alexs
 */
public interface Controller {
    public abstract String on();
    public abstract String off();
    public abstract String openMenu();
    public abstract String closeMenu();
    public abstract String incVolume();
    public abstract String decVolume();
    public abstract String muteOn();
    public abstract String muteOff();
    public abstract String play();
    public abstract String pause();
}
