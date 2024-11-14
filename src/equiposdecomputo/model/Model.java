
package equiposdecomputo.model;

import equiposdecomputo.igu.Interface;

public class Model {
    private boolean timeStarted = false; 
    private long startTime; 
    private int totalCosto = 0; 
    private int costoPorMinuto = 5; 
    private boolean costoCalculado = false; 

    public void iniciarTiempo() {
        if (!timeStarted) {
            timeStarted = true;
            startTime = System.currentTimeMillis(); 
        }
    }

    public void terminarTiempo() {
        if (timeStarted) {
            timeStarted = false;
            int minutosTranscurridos = getMinutesElapsed(); // Calcula los minutos transcurridos
            totalCosto = calcularCosto(minutosTranscurridos); // Calcula el costo total
            costoCalculado = true;
        }
    }

    private int calcularCosto(int minutos) {
        return minutos * costoPorMinuto;
    }

    private int getMinutesElapsed() {
        long tiempoActual = System.currentTimeMillis(); // Obtén el tiempo actual
        long tiempoTranscurrido = tiempoActual - startTime; // Calcula el tiempo transcurrido en milisegundos
        return (int) (tiempoTranscurrido / 60000); // Convierte milisegundos a minutos
    }

    public int getTotalCosto() {
        return totalCosto;
    }

    public boolean isCostoCalculado() {
        return costoCalculado;
    }

    public void reset() {
        timeStarted = false;
        totalCosto = 0;
        costoCalculado = false;
    }
}
