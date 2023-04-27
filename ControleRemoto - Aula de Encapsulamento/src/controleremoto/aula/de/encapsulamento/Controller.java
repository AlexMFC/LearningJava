
package controleremoto.aula.de.encapsulamento;

import java.lang.reflect.Method;
/*Control implements Controller*/;

/**
 *
 * @author alexs
 */
public interface Controller {
    public Method on();
    public Method off();
    public Method openMenu();
    public Method closeMenu();
    public Method incVolume();
    public Method decVolume();
    public Method muteOn();
    public Method muteOff();
    public Method play();
    public Method pause();
}
