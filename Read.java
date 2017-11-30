import java.io.EOFException;
import java.io.FileReader;

/**
 * Created by ioan on 11/29/17.
 */
public class Read {
    static private FileReader in = null;

    static public void readallnames()
    {
        try {
            int c;
            String temp,temp2;
            ListOfParticipants.init();
            in = new FileReader("Input.txt");
            c = in.read();
            while (c!=-1) {

                temp = "";
                temp.replaceAll("[^a-zA-Z0-9 ]", "");
                while (c != 46){
                    temp=temp+Character.toString ((char) c);;
                    c = in.read();
                }
                while (c == 46){
                    c = in.read();
                }

                temp2 = "";
                temp2.replaceAll("[^a-zA-Z0-9 ]", "");
                while ((c != 10)&&(c != 13)&&(c!=-1)){
                    temp2=temp2+Character.toString ((char) c);;
                    c = in.read();
                }
                while ((c!=-1)&&((c == 10)||(c == 13))){
                    c = in.read();
                }

                ListOfParticipants.map.put(temp,temp2);
            }
            in.close();
        }catch (Exception e) {
            System.err.println(e);
        }

    }

}
