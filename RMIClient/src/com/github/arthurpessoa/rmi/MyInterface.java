package com.github.arthurpessoa.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 
 * @author arsouza
 *
 */
interface MyInterface extends Remote {
	MyClass f(MyClass x) throws RemoteException;
}

