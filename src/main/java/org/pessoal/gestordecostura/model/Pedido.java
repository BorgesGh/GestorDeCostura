package org.pessoal.gestordecostura.model;

import java.util.Date;
import java.util.List;

public class Pedido {
    private boolean finalizado;
    private Date data;
    private List<Item> itens;
    private int idPedido;
}