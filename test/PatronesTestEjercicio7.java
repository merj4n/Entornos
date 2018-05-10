import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PatronesTestEjercicio7 {

    @Test
    public void captureItemsBetweenDashes() {

        List<String> ejemplos = new ArrayList<>();
        List<String> vacia = new ArrayList<>();
        ejemplos.add("");
        ejemplos.add("-");
        ejemplos.add("--");
        ejemplos.add("-1-");
        ejemplos.add("-1--");
        ejemplos.add("--2-");
        ejemplos.add("1-aaa-3");
        ejemplos.add("-1-aaa-3-");

        for (int i=0;i<ejemplos.size();i++){

            System.out.println(Patrones.captureItemsBetweenDashes(ejemplos.get(i)));
            Assert.assertEquals(vacia,Patrones.captureItemsBetweenDashes(ejemplos.get(i)));
        }
        boolean nombre=ejemplos.isEmpty();
        System.out.println(nombre);
        //assertTrue("Esta vacia?",nombre);

    }
}