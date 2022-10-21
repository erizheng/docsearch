import static org.junit.Assert.*;
import org.junit.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.io.IOException;


public class DocSearchTest {

   @Test
   public void testURL() throws IOException, URISyntaxException{
        Handler h = new Handler("technical");
        URI a = new URI("");
        URI b = new URI("/");

        assertEquals("Don't know how to handle that path!", h.handleRequest(a));
        assertEquals("There are NNNN files to search", h.handleRequest(b));

   }
   
}
