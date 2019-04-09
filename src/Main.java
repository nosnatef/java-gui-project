import java.io.File;
import java.io.IOException;
import javax.swing.*;

import com.google.gson.JsonObject;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;


public class Main {
    public static void main(String[] args){
        new ServerListener().start();
    }
}
