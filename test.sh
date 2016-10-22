oldIFS="$IFS"
IFS=$'\n' arr=($(<test.properties))
IFS="$oldIFS"

File=hello.csv
Searchterm=hello.csv

TESTSTRINGONE="MOTEST"
NEWTESTSTRING=${TESTSTRINGONE:1}
echo ${NEWTESTSTRING}




if [ ${NEWTESTSTRING} == OTEST ]; then

        echo "successfully entered if block!!"

fi



import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by aruna on 22/10/16.
 */
public class TryRename {
    public static void main(String[] args) {
         File oldFile = Paths.get("/home/aruna/Documents/cherma_ssh/welcomeready.csv").toFile();
         String name = oldFile.getName();
         String newname = name.substring(0,(name.length()-9)) + "complete.csv";
          System.out.println("new file name is:" +newname);
        boolean x = oldFile.renameTo(new File(newname));
        if (x)
            System.out.println("renamed");


    }

}


