package com.github.arthurpessoa.rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * 
 * @author arsouza
 *
 */
class Server extends UnicastRemoteObject implements MyInterface {
	
	public Server() throws RemoteException {
	}
	public MyClass f(MyClass v) throws RemoteException {
		return new MyClass(v.getValue() + 1);
	}

	public static void main(String arg[]) {
		Registry r;		
		try {
			System.out.println("Iniciando Servidor...");
			
			r = LocateRegistry.createRegistry(1099);
			r.rebind("service", new Server());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}