/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author todyn
 */
public class Comanda {
    int idComanda;
    String pedido;
    String status;
    String data;
    int idGarcom;

    public Comanda(int idComanda, String pedido, String status, String data, int idGarcom) {
        this.idComanda = idComanda;
        this.pedido = pedido;
        this.status = status;
        this.data = data;
        this.idGarcom = idGarcom;
    }
}
