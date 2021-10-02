package Task_6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemAlreadyExistsException;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws FileNotFoundException {
        List<XMLReader> list = new ArrayList<>();
        list.add(new XMLReader());
        m(list);
    }

    static void  m(List<XMLReader> a) throws FileNotFoundException {
        for (XMLReader z: a){
            try {
                z.read();
            }catch (FileSystemAlreadyExistsException e){
                throw new FileNotFoundException();
            }catch (Throwable e){
            }
        }
    }
}
