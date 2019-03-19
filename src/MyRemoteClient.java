import inter.MyRemote;

import java.rmi.Naming;

public class MyRemoteClient {

    public static void main(String[] args) {
       new MyRemoteClient().go();

    }

    public void go(){
        try{
            MyRemote myRemote = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
            String s = myRemote.sayHello();
            System.out.println("@@@:"+s);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
