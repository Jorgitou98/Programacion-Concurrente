package Parte2;

import java.net.InetAddress;

@SuppressWarnings("serial")
public class MensajePreparadoServidorCliente extends Mensaje {
	
	// Host del Emisor para que el receptor puede obtener el socket con �l
	InetAddress dirHost;
	
	// Puerto donde est� el Emisor esperando al receptor
	int puerto;
	
	public MensajePreparadoServidorCliente(String origen, String fin, InetAddress dirHost, int puerto) {
		super(origen, fin);
		this.dirHost = dirHost;
		this.puerto = puerto;
	}
	@Override
	public Tipo getTipo() {
		return Tipo.PREPARADOSERVIDORCLIENTE;
	}
	public InetAddress getDirHost() {
		return dirHost;
	}
	public int getPuerto() {
		return puerto;
	}
	
}
