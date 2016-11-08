



import java.rmi.*;

public interface InterfaceRmiCommunication extends Remote 
{
    Integer getSuma(int num1, int num2) throws RemoteException; 
    Integer getResta(int num1, int num2) throws RemoteException;
    Integer getMulti(int num1, int num2) throws RemoteException;
    float getDivi(float num1, float num2) throws RemoteException;
    Integer getPoten(int num1, int num2) throws RemoteException;
    double getRaiz(double num1, double num2) throws RemoteException;
}
