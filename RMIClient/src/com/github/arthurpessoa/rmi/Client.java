package com.github.arthurpessoa.rmi;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * 
 * @author arsouza
 *
 */
class Client {
	public static void main(String arg[]) {
		Registry r;
		try {
			System.out.println("Iniciando Client...");
			r = LocateRegistry.getRegistry("localhost", 1099);

			MyInterface service = (MyInterface)r.lookup("service");
			
			int badaroska = 12;
			MyClass result = service.f(new MyClass(badaroska)); //Badarosca
			
			
			System.out.println("badaroska = "+ badaroska);
			System.out.println("badarosca + 1 = "+result.getValue());  //print 124 aqui
		} catch (RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}
}