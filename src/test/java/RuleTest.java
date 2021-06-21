import org.junit.Rule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

public class RuleTest {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void aHoldCreateNewFileInTemporaryFolder() throws IOException{
        File created = temporaryFolder.newFile("file.txt");

        Assertions.assertTrue(created.isFile());
        Assertions.assertEquals(temporaryFolder.getRoot(), created.getParentFile());
    }
}
