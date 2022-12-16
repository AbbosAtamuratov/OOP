import java.util.List;
import java.io.*;

public class TXTSaveManager {
    public void save_to_txt (List<Animal> animals){
        try {
            FileWriter writer = new FileWriter("Zoo.txt", false);
            for (Animal a: animals) {
                writer.write(a.toString()+"\n");
            }
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
