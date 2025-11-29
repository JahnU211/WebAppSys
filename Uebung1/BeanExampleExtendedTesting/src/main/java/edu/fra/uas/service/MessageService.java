package edu.fra.uas.service;

import org.springframework.stereotype.Component;

@Component
public class MessageService {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer counter;

    public MessageService() {
        this.counter = 0; // Startwert
    }

    public Integer getCounter() {
        return counter;
    }

    public void increment() {
        counter++;
    }
}

/*
 * Erweitern Sie die Klasse MessageService um eine weitere Variable namens
 * counter vom
 * Datentyp Integer. Definieren Sie eine Methode increment, die den Wert der
 * Variablen
 * counter jeweils um 1 erhöht. Schreiben Sie dann in einer neuen Methode in der
 * Klasse
 * ControllerTest einen entsprechenden Test dazu.
 */
