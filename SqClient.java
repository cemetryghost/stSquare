import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SqClient {
    public static void main(String[] args) throws IOException {
        try(Socket socket = new Socket("DESKTOP-QB67GVK", 1020)){
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(8);
            outputStream.flush();

            InputStream inputStream = socket.getInputStream();
            int response = inputStream.read();
            System.out.println(response);


        }
    }
}
