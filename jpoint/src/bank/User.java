package bank;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by Mikalai_Churakou on 4/8/2017.
 */
public class User implements Serializable
{
    public String getLogin()
    {
        return login;
    }

    private String login;

    public User(String login)
    {
        this.login = login;
    }

    private Object readResolve(){
        return new User("user_a");
    }

    public static void main(String[] args) throws Exception
    {
        User u = new User("user_b");

        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        new ObjectOutputStream(stream).writeObject(u);

        byte[] bytes = stream.toByteArray();

        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        User u2 = (User )new ObjectInputStream(bais).readObject();

        System.out.println(u2.getLogin());


    }
}
