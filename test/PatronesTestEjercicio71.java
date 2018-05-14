import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PatronesTestEjercicio71 {

    @Test
    public void captureItemsBetweenDashes() {

        List<String> ejemplos = new ArrayList<>();
        List<String> vacia = new ArrayList<>();

        ejemplos.add("");

        for (int i=0;i<ejemplos.size();i++){

            Assert.assertEquals(vacia,Patrones.captureItemsBetweenDashes(ejemplos.get(i)));
        }
    }

    @Test
    public void captureItemsBetweenDashes2() {

        List<String> ejemplos = new ArrayList<>();
        List<String> vacia = new ArrayList<>();

        ejemplos.add("-");


        for (int i=0;i<ejemplos.size();i++){

            Assert.assertEquals(vacia,Patrones.captureItemsBetweenDashes(ejemplos.get(i)));
        }
    }

    @Test
    public void captureItemsBetweenDashes3() {

        List<String> ejemplos = new ArrayList<>();
        List<String> vacia = new ArrayList<>();

        ejemplos.add("--");


        for (int i=0;i<ejemplos.size();i++){

            Assert.assertEquals(vacia,Patrones.captureItemsBetweenDashes(ejemplos.get(i)));
        }
    }

    @Test
    public void captureItemsBetweenDashes4() {

        List<String> ejemplos = new ArrayList<>();
        List<String> vacia = new ArrayList<>();

        ejemplos.add("-1-");
        vacia.add("1");


        for (int i=0;i<ejemplos.size();i++){

            Assert.assertEquals(vacia,Patrones.captureItemsBetweenDashes(ejemplos.get(i)));
        }
    }

    @Test
    public void captureItemsBetweenDashes5() {

        List<String> ejemplos = new ArrayList<>();
        List<String> vacia = new ArrayList<>();

        ejemplos.add("-1--");
        vacia.add("1");

        for (int i=0;i<ejemplos.size();i++){

            Assert.assertEquals(vacia,Patrones.captureItemsBetweenDashes(ejemplos.get(i)));
        }
    }

    @Test
    public void captureItemsBetweenDashes6() {

        List<String> ejemplos = new ArrayList<>();
        List<String> vacia = new ArrayList<>();

        ejemplos.add("--2-");
        vacia.add("2");

        for (int i=0;i<ejemplos.size();i++){

            Assert.assertEquals(vacia,Patrones.captureItemsBetweenDashes(ejemplos.get(i)));
        }
    }

    @Test
    public void captureItemsBetweenDashes7() {

        List<String> ejemplos = new ArrayList<>();
        List<String> vacia = new ArrayList<>();

        ejemplos.add("1-aaa-3");
        vacia.add("aaa");

        for (int i=0;i<ejemplos.size();i++){

            Assert.assertEquals(vacia,Patrones.captureItemsBetweenDashes(ejemplos.get(i)));
        }
    }

    @Test
    public void captureItemsBetweenDashes8() {

        List<String> ejemplos = new ArrayList<>();
        List<String> vacia = new ArrayList<>();

        ejemplos.add("-1-aaa-3-");
        vacia.add("1, 3");

        for (int i=0;i<ejemplos.size();i++){

            Assert.assertEquals(vacia,Patrones.captureItemsBetweenDashes(ejemplos.get(i)));
        }
    }
}