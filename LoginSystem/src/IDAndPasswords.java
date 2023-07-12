import java.util.HashMap;

public  class IDAndPasswords{


    HashMap<String, String> logininfo = new HashMap<String, String>();


    IDAndPasswords() {


        logininfo.put("Bro", "pizza");

        logininfo.put("Brometheus", "PASSWORD");

        logininfo.put("BroCode", "abc123");

    }


    public HashMap getLoginInfo() {

        return logininfo;

    }
}

