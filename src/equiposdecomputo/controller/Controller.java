
package equiposdecomputo.controller;

import equiposdecomputo.model.Model;
import equiposdecomputo.igu.Interface;

public class Controller {
     private Model model;
    private Interface view;

    // Constructor del controlador
    public Controller(Model model, Interface view) {
        this.model = model;
        this.view = view;
    }

    // Inicia la aplicación
    public void start() {
        view.setVisible(true);
    }
}
