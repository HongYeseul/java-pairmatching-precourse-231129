package pairmatching.model.crew;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileInput {
    public List<Crew> makeFrontMember() {
        List<Crew> crew = new ArrayList<Crew>();
        try{
            File file = new File("/Users/macbookpro/Desktop/YS/우테코준비/java-pairmatching-precourse/src/main/resources/frontend-crew.md");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String member = "";
            while(( member = bufferedReader.readLine()) != null){
                crew.add(new Crew(Course.FRONTEND, member));
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return crew;
    }
}
