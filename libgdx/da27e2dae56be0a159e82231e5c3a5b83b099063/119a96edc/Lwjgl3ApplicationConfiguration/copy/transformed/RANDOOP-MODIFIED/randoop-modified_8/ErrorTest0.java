import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) 100, 1.0f, (float) 0, (float) (byte) 0);
        int int6 = com.badlogic.gdx.graphics.Color.rgb888(color5);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color14 = color9.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color15 = color8.sub(color14);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color8, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color22 = color8.set(1.561203E-39f, (float) 2, (float) (byte) -1, (float) 3);
        com.badlogic.gdx.graphics.Color color23 = color5.mul(color8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color23 and color9", color23.equals(color9) ? color23.hashCode() == color9.hashCode() : true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str1 = color0.toString();
        color0.g = 16;
        int int4 = com.badlogic.gdx.graphics.Color.rgb888(color0);
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color13 = color8.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color14 = color7.sub(color13);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color7, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(color7);
        com.badlogic.gdx.graphics.Color color22 = color7.mul((float) (-222), (-1.5084639E38f), (float) (-62986), (float) (-16741598));
        float float23 = color22.r;
        com.badlogic.gdx.graphics.Color color25 = color5.lerp(color22, (float) (-248));
        com.badlogic.gdx.graphics.Color color26 = com.badlogic.gdx.graphics.Color.MAROON;
        float float27 = color26.toFloatBits();
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color(color26);
        com.badlogic.gdx.graphics.Color color30 = color5.lerp(color28, 2.3418409E-38f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color0 and color30", color0.equals(color30) ? color0.hashCode() == color30.hashCode() : true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color13 = color8.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color21 = color15.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color22 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str23 = color22.toString();
        com.badlogic.gdx.graphics.Color color25 = color15.lerp(color22, (-8.0750596E37f));
        boolean boolean26 = color8.equals((java.lang.Object) color15);
        com.badlogic.gdx.graphics.Color color27 = color7.add(color8);
        com.badlogic.gdx.graphics.Color color28 = com.badlogic.gdx.graphics.Color.SCARLET;
        color28.b = '#';
        com.badlogic.gdx.graphics.Color color31 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color color33 = color28.lerp(color31, (float) 1L);
        com.badlogic.gdx.graphics.Color color34 = com.badlogic.gdx.graphics.Color.SALMON;
        float float35 = color34.toFloatBits();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str37 = lwjgl3ApplicationConfiguration36.title;
        com.badlogic.gdx.graphics.Color color38 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color38, 16);
        lwjgl3ApplicationConfiguration36.setInitialBackgroundColor(color38);
        com.badlogic.gdx.graphics.Color color46 = color38.sub((float) (-232), (float) (-255), (float) 10L, (float) 1L);
        com.badlogic.gdx.graphics.Color color48 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color54 = color48.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color55 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str56 = color55.toString();
        com.badlogic.gdx.graphics.Color color58 = color48.lerp(color55, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color59 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color59, 16);
        com.badlogic.gdx.graphics.Color color62 = color58.sub(color59);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color59, 1677696502);
        com.badlogic.gdx.graphics.Color color65 = color38.sub(color59);
        com.badlogic.gdx.graphics.Color color66 = color34.add(color59);
        com.badlogic.gdx.graphics.Color color68 = color31.lerp(color59, (float) (short) 1);
        com.badlogic.gdx.graphics.Color color69 = color27.set(color59);
        java.lang.String str70 = color59.toString();
        float float71 = color59.g;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color8 and color34", color8.equals(color34) ? color8.hashCode() == color34.hashCode() : true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color13 = color8.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color21 = color15.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color22 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str23 = color22.toString();
        com.badlogic.gdx.graphics.Color color25 = color15.lerp(color22, (-8.0750596E37f));
        boolean boolean26 = color8.equals((java.lang.Object) color15);
        com.badlogic.gdx.graphics.Color color27 = color7.add(color8);
        com.badlogic.gdx.graphics.Color color28 = com.badlogic.gdx.graphics.Color.SCARLET;
        color28.b = '#';
        com.badlogic.gdx.graphics.Color color31 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color color33 = color28.lerp(color31, (float) 1L);
        com.badlogic.gdx.graphics.Color color34 = com.badlogic.gdx.graphics.Color.SALMON;
        float float35 = color34.toFloatBits();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str37 = lwjgl3ApplicationConfiguration36.title;
        com.badlogic.gdx.graphics.Color color38 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color38, 16);
        lwjgl3ApplicationConfiguration36.setInitialBackgroundColor(color38);
        com.badlogic.gdx.graphics.Color color46 = color38.sub((float) (-232), (float) (-255), (float) 10L, (float) 1L);
        com.badlogic.gdx.graphics.Color color48 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color54 = color48.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color55 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str56 = color55.toString();
        com.badlogic.gdx.graphics.Color color58 = color48.lerp(color55, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color59 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color59, 16);
        com.badlogic.gdx.graphics.Color color62 = color58.sub(color59);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color59, 1677696502);
        com.badlogic.gdx.graphics.Color color65 = color38.sub(color59);
        com.badlogic.gdx.graphics.Color color66 = color34.add(color59);
        com.badlogic.gdx.graphics.Color color68 = color31.lerp(color59, (float) (short) 1);
        com.badlogic.gdx.graphics.Color color69 = color27.set(color59);
        float float70 = color69.a;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color8 and color34", color8.equals(color34) ? color8.hashCode() == color34.hashCode() : true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color1 = color0.cpy();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color1, 1);
        int int4 = color1.toIntBits();
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color7 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color8 = color6.set(color7);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color11 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color16 = color11.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(color11);
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(color17);
        com.badlogic.gdx.graphics.Color color19 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color24 = color19.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color32 = color26.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color33 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str34 = color33.toString();
        com.badlogic.gdx.graphics.Color color36 = color26.lerp(color33, (-8.0750596E37f));
        boolean boolean37 = color19.equals((java.lang.Object) color26);
        com.badlogic.gdx.graphics.Color color38 = color18.add(color19);
        com.badlogic.gdx.graphics.Color color40 = color10.lerp(color18, (float) (-14540110));
        com.badlogic.gdx.graphics.Color color41 = new com.badlogic.gdx.graphics.Color(color10);
        com.badlogic.gdx.graphics.Color color42 = color6.sub(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration43.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        com.badlogic.gdx.graphics.Color color52 = lwjgl3ApplicationConfiguration43.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color53 = color6.sub(color52);
        com.badlogic.gdx.graphics.Color color55 = color1.lerp(color6, (float) 13260);
        com.badlogic.gdx.graphics.Color color61 = color6.lerp((float) 16711680, (float) (-16711936), 100.0f, 0.30588236f, (float) 63519);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color19 and color52", color19.equals(color52) ? color19.hashCode() == color52.hashCode() : true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color3 = color2.cpy();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color3, 1);
        int int6 = color3.toIntBits();
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color10 = color8.set(color9);
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color(color8);
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color13 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color18 = color13.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(color13);
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color(color19);
        com.badlogic.gdx.graphics.Color color21 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color26 = color21.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color34 = color28.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color35 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str36 = color35.toString();
        com.badlogic.gdx.graphics.Color color38 = color28.lerp(color35, (-8.0750596E37f));
        boolean boolean39 = color21.equals((java.lang.Object) color28);
        com.badlogic.gdx.graphics.Color color40 = color20.add(color21);
        com.badlogic.gdx.graphics.Color color42 = color12.lerp(color20, (float) (-14540110));
        com.badlogic.gdx.graphics.Color color43 = new com.badlogic.gdx.graphics.Color(color12);
        com.badlogic.gdx.graphics.Color color44 = color8.sub(color12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration45 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration45.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        com.badlogic.gdx.graphics.Color color54 = lwjgl3ApplicationConfiguration45.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color55 = color8.sub(color54);
        com.badlogic.gdx.graphics.Color color57 = color3.lerp(color8, (float) 13260);
        com.badlogic.gdx.graphics.Color color58 = color1.set(color57);
        java.lang.String str59 = color58.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color12 and color54", color12.equals(color54) ? color12.hashCode() == color54.hashCode() : true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color7 = color1.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        int int8 = com.badlogic.gdx.graphics.Color.rgb888(color7);
        int int9 = com.badlogic.gdx.graphics.Color.rgb888(color7);
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.FOREST;
        int int11 = com.badlogic.gdx.graphics.Color.argb8888(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int13 = lwjgl3ApplicationConfiguration12.getaudioDeviceBufferSize();
        boolean boolean14 = lwjgl3ApplicationConfiguration12.windowResizable;
        lwjgl3ApplicationConfiguration12.depth = (short) 10;
        lwjgl3ApplicationConfiguration12.title = "4169e1ff";
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color28 = color22.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color29 = color20.mul(color28);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color20, (int) (byte) 0);
        lwjgl3ApplicationConfiguration12.initialBackgroundColor = color20;
        com.badlogic.gdx.graphics.Color color33 = color10.set(color20);
        com.badlogic.gdx.graphics.Color color34 = color7.set(color33);
        com.badlogic.gdx.graphics.Color color35 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color40 = color35.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color45 = color40.mul((-1.0f), (float) 1677696502, (float) 65024, (float) (short) 1);
        com.badlogic.gdx.graphics.Color color50 = color40.mul((float) 151015132, (float) (byte) 1, (-1.6880938E38f), (float) (-232));
        com.badlogic.gdx.graphics.Color color51 = color33.mul(color40);
        com.badlogic.gdx.graphics.Color color56 = color40.mul((float) 43268, 9.18893E-39f, (-1.701386E38f), 1.84552666E9f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color1 and color56", color1.equals(color56) ? color1.hashCode() == color56.hashCode() : true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(1.67129651E9f, (float) (-14540110), (float) 2, (-1.5659187E38f));
        com.badlogic.gdx.graphics.Color color6 = color4.mul(2.75501E-40f);
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color(1.5612034E-37f, (float) (-16711680), 2.5243549E-29f, (float) (-1306385665));
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color(color11);
        com.badlogic.gdx.graphics.Color color14 = color11.set((int) (short) 100);
        boolean boolean15 = color6.equals((java.lang.Object) color14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color6 and color12", color6.equals(color12) ? color6.hashCode() == color12.hashCode() : true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(3);
        color1.a = (byte) 100;
        com.badlogic.gdx.graphics.Color color4 = color1.clamp();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str6 = lwjgl3ApplicationConfiguration5.title;
        lwjgl3ApplicationConfiguration5.a = (-1);
        boolean boolean9 = lwjgl3ApplicationConfiguration5.vSyncEnabled;
        lwjgl3ApplicationConfiguration5.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color12 = lwjgl3ApplicationConfiguration5.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(color12);
        com.badlogic.gdx.graphics.Color color14 = new com.badlogic.gdx.graphics.Color(color13);
        com.badlogic.gdx.graphics.Color color19 = color13.mul(0.06666667f, (float) (-58475), (float) (-16734721), (float) 1044480);
        color13.b = (-1.7013859E38f);
        com.badlogic.gdx.graphics.Color color22 = color4.mul(color13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color22 and color13", color22.equals(color13) ? color22.hashCode() == color13.hashCode() : true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) (byte) 100, (float) 41903542, (float) (short) 10, (-1.6947917E38f));
        com.badlogic.gdx.graphics.Color color10 = color5.sub((float) (-65025), 9.18893E-39f, (float) (-50396672), (float) (-14540110));
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color(167247232);
        com.badlogic.gdx.graphics.Color color18 = color12.lerp((float) 31334400, (float) 3845, (float) (-62986), (float) (-16741598), (float) (-379904));
        com.badlogic.gdx.graphics.Color color19 = color10.mul(color18);
        color19.g = (-56576);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color19 and color12", color19.equals(color12) ? color19.hashCode() == color12.hashCode() : true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color1 = color0.cpy();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color1, 1);
        int int4 = color1.toIntBits();
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color7 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color8 = color6.set(color7);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color11 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color16 = color11.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(color11);
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(color17);
        com.badlogic.gdx.graphics.Color color19 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color24 = color19.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color32 = color26.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color33 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str34 = color33.toString();
        com.badlogic.gdx.graphics.Color color36 = color26.lerp(color33, (-8.0750596E37f));
        boolean boolean37 = color19.equals((java.lang.Object) color26);
        com.badlogic.gdx.graphics.Color color38 = color18.add(color19);
        com.badlogic.gdx.graphics.Color color40 = color10.lerp(color18, (float) (-14540110));
        com.badlogic.gdx.graphics.Color color41 = new com.badlogic.gdx.graphics.Color(color10);
        com.badlogic.gdx.graphics.Color color42 = color6.sub(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration43.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        com.badlogic.gdx.graphics.Color color52 = lwjgl3ApplicationConfiguration43.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color53 = color6.sub(color52);
        com.badlogic.gdx.graphics.Color color55 = color1.lerp(color6, (float) 13260);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration56 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode57 = null;
        lwjgl3ApplicationConfiguration56.setFullscreenMode(displayMode57);
        lwjgl3ApplicationConfiguration56.windowX = 100;
        int int61 = lwjgl3ApplicationConfiguration56.stencil;
        int int62 = lwjgl3ApplicationConfiguration56.windowY;
        lwjgl3ApplicationConfiguration56.a = 43268;
        int int65 = lwjgl3ApplicationConfiguration56.gles30ContextMinorVersion;
        int int66 = lwjgl3ApplicationConfiguration56.getwindowX();
        com.badlogic.gdx.graphics.Color color67 = lwjgl3ApplicationConfiguration56.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color68 = color55.add(color67);
        int int69 = color55.toIntBits();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color10 and color11", color10.equals(color11) ? color10.hashCode() == color11.hashCode() : true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color6);
        java.lang.String str8 = color6.toString();
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color19 = color13.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color20 = color11.mul(color19);
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color28 = color22.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        color28.g = (short) 1;
        com.badlogic.gdx.graphics.Color color32 = color20.lerp(color28, (float) 25500);
        com.badlogic.gdx.graphics.Color color37 = color20.mul(0.0f, (float) (-8142), (float) (-1562574848), (-1.0f));
        color20.g = '#';
        com.badlogic.gdx.graphics.Color color40 = color9.set(color20);
        com.badlogic.gdx.graphics.Color color45 = color40.add((float) (-16719105), (float) 56864, (float) (-10158080), 0.13725491f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color0 and color22", color0.equals(color22) ? color0.hashCode() == color22.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color3 = color1.set(color2);
        color3.r = (-7.5108E-22f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color3 and color2", color3.equals(color2) ? color3.hashCode() == color2.hashCode() : true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color1 = color0.cpy();
        int int2 = com.badlogic.gdx.graphics.Color.argb8888(color1);
        com.badlogic.gdx.graphics.Color color3 = com.badlogic.gdx.graphics.Color.FOREST;
        int int4 = com.badlogic.gdx.graphics.Color.argb8888(color3);
        com.badlogic.gdx.graphics.Color color6 = color1.lerp(color3, (float) (-50396672));
        int int7 = com.badlogic.gdx.graphics.Color.argb8888(color6);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color14 = color9.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(color9);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color15);
        com.badlogic.gdx.graphics.Color color17 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color22 = color17.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color30 = color24.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color31 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str32 = color31.toString();
        com.badlogic.gdx.graphics.Color color34 = color24.lerp(color31, (-8.0750596E37f));
        boolean boolean35 = color17.equals((java.lang.Object) color24);
        com.badlogic.gdx.graphics.Color color36 = color16.add(color17);
        com.badlogic.gdx.graphics.Color color38 = color8.lerp(color16, (float) (-14540110));
        int int39 = com.badlogic.gdx.graphics.Color.rgb565(color8);
        com.badlogic.gdx.graphics.Color color40 = color6.sub(color8);
        float float41 = color40.toFloatBits();
        com.badlogic.gdx.graphics.Color color42 = new com.badlogic.gdx.graphics.Color(color40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color3 and color8", color3.equals(color8) ? color3.hashCode() == color8.hashCode() : true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-255), 100.0f, (float) (byte) 100, (float) 41903542);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color10 = color5.add((float) 100, 1.0f, (float) 0, (float) (byte) 0);
        java.lang.String str11 = color10.toString();
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color10, 1);
        com.badlogic.gdx.graphics.Color color18 = color10.mul((float) 41903542, (float) (-8672), (float) (-50135050), (float) (-10));
        com.badlogic.gdx.graphics.Color color24 = color18.lerp((float) (-65025), (-0.0f), (float) (-65486), (float) (byte) 10, (float) (-1L));
        com.badlogic.gdx.graphics.Color color29 = color24.set((float) 1, (float) 255, (-5.68232E37f), (float) 1677696502);
        float float30 = color24.toFloatBits();
        com.badlogic.gdx.graphics.Color color31 = color4.mul(color24);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color31, 97);
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color(3);
        com.badlogic.gdx.graphics.Color color40 = color35.set((-6.878755E37f), 2.4259024E-18f, (float) (-2560), 0.0f);
        com.badlogic.gdx.graphics.Color color41 = color31.set(color40);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color41, (-257551));
        com.badlogic.gdx.graphics.Color color48 = new com.badlogic.gdx.graphics.Color((float) 2, (float) 100, (float) (short) 0, (float) 640);
        com.badlogic.gdx.graphics.Color color53 = color48.add((-8.0750596E37f), (float) 20188, (float) 10L, (float) 31334400);
        com.badlogic.gdx.graphics.Color color54 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color59 = color54.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color60 = new com.badlogic.gdx.graphics.Color(color54);
        com.badlogic.gdx.graphics.Color color61 = new com.badlogic.gdx.graphics.Color(color60);
        com.badlogic.gdx.graphics.Color color62 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color67 = color62.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color69 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color75 = color69.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color76 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str77 = color76.toString();
        com.badlogic.gdx.graphics.Color color79 = color69.lerp(color76, (-8.0750596E37f));
        boolean boolean80 = color62.equals((java.lang.Object) color69);
        com.badlogic.gdx.graphics.Color color81 = color61.add(color62);
        com.badlogic.gdx.graphics.Color color83 = color53.lerp(color61, (float) 100L);
        com.badlogic.gdx.graphics.Color color84 = color41.sub(color83);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color84 and color35", color84.equals(color35) ? color84.hashCode() == color35.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color5, 100);
        com.badlogic.gdx.graphics.Color color9 = color5.mul(100.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color9, 8897069);
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color17 = color12.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(color12);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(color18);
        int int20 = com.badlogic.gdx.graphics.Color.argb8888(color19);
        int int21 = com.badlogic.gdx.graphics.Color.rgba8888(color19);
        com.badlogic.gdx.graphics.Color color23 = color9.lerp(color19, (float) 1044480);
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color(color19);
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color(color24);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType27 = null;
        lwjgl3ApplicationConfiguration26.setpreferencesFileType(fileType27);
        lwjgl3ApplicationConfiguration26.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType32 = null;
        lwjgl3ApplicationConfiguration26.setPreferencesConfig("", fileType32);
        com.badlogic.gdx.Files.FileType fileType34 = lwjgl3ApplicationConfiguration26.preferencesFileType;
        int int35 = lwjgl3ApplicationConfiguration26.samples;
        int int36 = lwjgl3ApplicationConfiguration26.windowHeight;
        lwjgl3ApplicationConfiguration26.useOpenGL3(false, (int) 'a', (-16711680));
        com.badlogic.gdx.graphics.Color color41 = lwjgl3ApplicationConfiguration26.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color46 = color41.sub((float) (short) 0, (-1.6947917E38f), (-1.6947917E38f), (float) (-62986));
        com.badlogic.gdx.graphics.Color color52 = color41.lerp((float) 16711935, (float) (-40036), (float) (-1306385665), (float) (-10420224), (-1.7005551E38f));
        com.badlogic.gdx.graphics.Color color53 = color25.set(color41);
        color53.r = (-2130706432);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color53 and color41", color53.equals(color41) ? color53.hashCode() == color41.hashCode() : true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color9 = color3.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color10 = color1.mul(color9);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color1, (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color13 = color1.cpy();
        color1.g = (-2147283968);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color1 and color13", color1.equals(color13) ? color1.hashCode() == color13.hashCode() : true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(1677696502);
        lwjgl3ApplicationConfiguration0.setdepth(0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType10 = null;
        lwjgl3ApplicationConfiguration9.setpreferencesFileType(fileType10);
        lwjgl3ApplicationConfiguration9.useVsync(false);
        com.badlogic.gdx.graphics.Color color14 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration9.initialBackgroundColor = color14;
        lwjgl3ApplicationConfiguration9.setDecorated(false);
        int int18 = lwjgl3ApplicationConfiguration9.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration9.setuseGL30(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration9);
        lwjgl3ApplicationConfiguration21.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration21.disableAudio = true;
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        float float28 = color27.a;
        int int29 = color27.toIntBits();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType31 = null;
        lwjgl3ApplicationConfiguration30.setpreferencesFileType(fileType31);
        lwjgl3ApplicationConfiguration30.useVsync(false);
        lwjgl3ApplicationConfiguration30.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration37 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration30);
        boolean boolean38 = lwjgl3ApplicationConfiguration30.getwindowResizable();
        boolean boolean39 = color27.equals((java.lang.Object) lwjgl3ApplicationConfiguration30);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType41 = null;
        lwjgl3ApplicationConfiguration40.setpreferencesFileType(fileType41);
        lwjgl3ApplicationConfiguration40.disableAudio = true;
        lwjgl3ApplicationConfiguration40.b = (short) -1;
        com.badlogic.gdx.Files.FileType fileType47 = lwjgl3ApplicationConfiguration40.getpreferencesFileType();
        lwjgl3ApplicationConfiguration40.stencil = 0;
        com.badlogic.gdx.Files.FileType fileType50 = lwjgl3ApplicationConfiguration40.getpreferencesFileType();
        int int51 = lwjgl3ApplicationConfiguration40.g;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode52 = lwjgl3ApplicationConfiguration40.hdpiMode;
        lwjgl3ApplicationConfiguration30.setHdpiMode(hdpiMode52);
        lwjgl3ApplicationConfiguration21.setHdpiMode(hdpiMode52);
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode52;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color14 and color27", color14.equals(color27) ? color14.hashCode() == color27.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.FOREST;
        int int1 = com.badlogic.gdx.graphics.Color.argb8888(color0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int3 = lwjgl3ApplicationConfiguration2.getaudioDeviceBufferSize();
        boolean boolean4 = lwjgl3ApplicationConfiguration2.windowResizable;
        lwjgl3ApplicationConfiguration2.depth = (short) 10;
        lwjgl3ApplicationConfiguration2.title = "4169e1ff";
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color18 = color12.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color19 = color10.mul(color18);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration2.initialBackgroundColor = color10;
        com.badlogic.gdx.graphics.Color color23 = color0.set(color10);
        float float24 = color10.b;
        com.badlogic.gdx.graphics.Color color25 = color10.clamp();
        color25.a = (-33488131);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color0 and color25", color0.equals(color25) ? color0.hashCode() == color25.hashCode() : true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) 100, 1.0f, (float) 0, (float) (byte) 0);
        color0.g = 151015132;
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color0);
        color0.b = 0.99215686f;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color0 and color8", color0.equals(color8) ? color0.hashCode() == color8.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color2 = color0.mul(color1);
        color0.g = 6147990;
        com.badlogic.gdx.graphics.Color color5 = color0.clamp();
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color((-4.2867603E37f), 9.18893E-39f, (float) 1794115036, (float) (-10));
        com.badlogic.gdx.graphics.Color color11 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color16 = color11.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color21 = color16.mul((-1.0f), (float) 1677696502, (float) 65024, (float) (short) 1);
        com.badlogic.gdx.graphics.Color color22 = color10.sub(color21);
        com.badlogic.gdx.graphics.Color color23 = color5.mul(color22);
        color22.a = 2.9692728E-8f;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color0 and color22", color0.equals(color22) ? color0.hashCode() == color22.hashCode() : true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color6);
        java.lang.String str8 = color6.toString();
        int int9 = com.badlogic.gdx.graphics.Color.rgba4444(color6);
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color15 = color10.set((float) 15687677, (float) 2, (float) 1L, (float) (-240));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration16.audioDeviceBufferSize = ' ';
        lwjgl3ApplicationConfiguration16.setwindowResizable(true);
        lwjgl3ApplicationConfiguration16.gles30ContextMajorVersion = (-567943452);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration16.windowListener = lwjgl3WindowListener23;
        lwjgl3ApplicationConfiguration16.setdepth((-16741598));
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color36 = color30.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color37 = color28.mul(color36);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color28, (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color40 = color28.cpy();
        lwjgl3ApplicationConfiguration16.setInitialBackgroundColor(color28);
        com.badlogic.gdx.graphics.Color color42 = color15.set(color28);
        com.badlogic.gdx.graphics.Color color48 = color15.lerp(0.0f, (float) 58111, (float) (-16777199), (float) (-65024), 2.938736E-39f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color48 and color28", color48.equals(color28) ? color48.hashCode() == color28.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color5 = color0.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color13 = color7.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color14 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str15 = color14.toString();
        com.badlogic.gdx.graphics.Color color17 = color7.lerp(color14, (-8.0750596E37f));
        boolean boolean18 = color0.equals((java.lang.Object) color7);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(color7);
        color7.a = (-1.6415966E38f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color7 and color19", color7.equals(color19) ? color7.hashCode() == color19.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color5, 100);
        com.badlogic.gdx.graphics.Color color9 = color5.mul(100.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color9, 8897069);
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color17 = color12.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(color12);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(color18);
        int int20 = com.badlogic.gdx.graphics.Color.argb8888(color19);
        int int21 = com.badlogic.gdx.graphics.Color.rgba8888(color19);
        com.badlogic.gdx.graphics.Color color23 = color9.lerp(color19, (float) 1044480);
        int int24 = com.badlogic.gdx.graphics.Color.rgba8888(color9);
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color((int) (byte) 100);
        com.badlogic.gdx.graphics.Color color27 = com.badlogic.gdx.graphics.Color.BLACK;
        float float28 = color27.r;
        color27.r = 1671296512;
        com.badlogic.gdx.graphics.Color color31 = color26.sub(color27);
        com.badlogic.gdx.graphics.Color color32 = new com.badlogic.gdx.graphics.Color(color26);
        com.badlogic.gdx.graphics.Color color33 = color26.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color34 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color35 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color40 = color35.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color41 = new com.badlogic.gdx.graphics.Color(color35);
        com.badlogic.gdx.graphics.Color color42 = new com.badlogic.gdx.graphics.Color(color41);
        com.badlogic.gdx.graphics.Color color43 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color48 = color43.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color50 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color56 = color50.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color57 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str58 = color57.toString();
        com.badlogic.gdx.graphics.Color color60 = color50.lerp(color57, (-8.0750596E37f));
        boolean boolean61 = color43.equals((java.lang.Object) color50);
        com.badlogic.gdx.graphics.Color color62 = color42.add(color43);
        com.badlogic.gdx.graphics.Color color64 = color34.lerp(color42, (float) (-14540110));
        int int65 = com.badlogic.gdx.graphics.Color.rgb565(color34);
        com.badlogic.gdx.graphics.Color color70 = color34.mul((float) (byte) 0, (float) (byte) 100, (float) 35, (float) (-255));
        com.badlogic.gdx.graphics.Color color71 = color33.mul(color34);
        com.badlogic.gdx.graphics.Color color72 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color73 = color72.cpy();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color73, 1);
        com.badlogic.gdx.graphics.Color color76 = new com.badlogic.gdx.graphics.Color(color73);
        com.badlogic.gdx.graphics.Color color77 = new com.badlogic.gdx.graphics.Color(color76);
        com.badlogic.gdx.graphics.Color color78 = new com.badlogic.gdx.graphics.Color(color76);
        com.badlogic.gdx.graphics.Color color79 = color33.add(color78);
        com.badlogic.gdx.graphics.Color color81 = color9.lerp(color33, (-1.515294E38f));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color27 and color72", color27.equals(color72) ? color27.hashCode() == color72.hashCode() : true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color7 = color2.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color8 = color1.sub(color7);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color1, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color15 = color1.set(1.561203E-39f, (float) 2, (float) (byte) -1, (float) 3);
        com.badlogic.gdx.graphics.Color color20 = color15.add(2.75501E-40f, 9.1477E-41f, (float) (-1665155040), (float) (-2147483616));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color20 and color2", color20.equals(color2) ? color20.hashCode() == color2.hashCode() : true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(1.5612034E-37f, (float) (-16711680), 2.5243549E-29f, (float) (-1306385665));
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color13 = color7.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        int int14 = com.badlogic.gdx.graphics.Color.rgb888(color13);
        int int15 = com.badlogic.gdx.graphics.Color.rgb888(color13);
        com.badlogic.gdx.graphics.Color color16 = com.badlogic.gdx.graphics.Color.FOREST;
        int int17 = com.badlogic.gdx.graphics.Color.argb8888(color16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int19 = lwjgl3ApplicationConfiguration18.getaudioDeviceBufferSize();
        boolean boolean20 = lwjgl3ApplicationConfiguration18.windowResizable;
        lwjgl3ApplicationConfiguration18.depth = (short) 10;
        lwjgl3ApplicationConfiguration18.title = "4169e1ff";
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color34 = color28.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color35 = color26.mul(color34);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color26, (int) (byte) 0);
        lwjgl3ApplicationConfiguration18.initialBackgroundColor = color26;
        com.badlogic.gdx.graphics.Color color39 = color16.set(color26);
        com.badlogic.gdx.graphics.Color color40 = color13.set(color39);
        com.badlogic.gdx.graphics.Color color41 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color46 = color41.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color51 = color46.mul((-1.0f), (float) 1677696502, (float) 65024, (float) (short) 1);
        com.badlogic.gdx.graphics.Color color56 = color46.mul((float) 151015132, (float) (byte) 1, (-1.6880938E38f), (float) (-232));
        com.badlogic.gdx.graphics.Color color57 = color39.mul(color46);
        com.badlogic.gdx.graphics.Color color58 = color4.mul(color39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color5 and color7", color5.equals(color7) ? color5.hashCode() == color7.hashCode() : true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color0, (-256));
        com.badlogic.gdx.graphics.Color color3 = com.badlogic.gdx.graphics.Color.FOREST;
        int int4 = com.badlogic.gdx.graphics.Color.argb8888(color3);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int6 = lwjgl3ApplicationConfiguration5.getaudioDeviceBufferSize();
        boolean boolean7 = lwjgl3ApplicationConfiguration5.windowResizable;
        lwjgl3ApplicationConfiguration5.depth = (short) 10;
        lwjgl3ApplicationConfiguration5.title = "4169e1ff";
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color21 = color15.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color22 = color13.mul(color21);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color13, (int) (byte) 0);
        lwjgl3ApplicationConfiguration5.initialBackgroundColor = color13;
        com.badlogic.gdx.graphics.Color color26 = color3.set(color13);
        com.badlogic.gdx.graphics.Color color27 = color0.add(color3);
        com.badlogic.gdx.graphics.Color color32 = new com.badlogic.gdx.graphics.Color(1.67129651E9f, (float) (-14540110), (float) 2, (-1.5659187E38f));
        com.badlogic.gdx.graphics.Color color34 = color32.mul(2.75501E-40f);
        int int35 = com.badlogic.gdx.graphics.Color.rgb565(color34);
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color(color34);
        color34.r = (-254);
        com.badlogic.gdx.graphics.Color color39 = new com.badlogic.gdx.graphics.Color(color34);
        com.badlogic.gdx.graphics.Color color40 = color0.mul(color39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color3 and color36", color3.equals(color36) ? color3.hashCode() == color36.hashCode() : true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 10L, (float) 1, (float) 0, (float) (short) -1);
        color4.b = (-1241513983);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color4, (int) (byte) 100);
        com.badlogic.gdx.graphics.Color color11 = color4.mul((float) 16580354);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(1.5612034E-37f, (float) (-16711680), 2.5243549E-29f, (float) (-1306385665));
        color16.b = 65025;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str20 = lwjgl3ApplicationConfiguration19.title;
        lwjgl3ApplicationConfiguration19.a = (-1);
        boolean boolean23 = lwjgl3ApplicationConfiguration19.vSyncEnabled;
        lwjgl3ApplicationConfiguration19.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color26 = lwjgl3ApplicationConfiguration19.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(color26);
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color(color27);
        com.badlogic.gdx.graphics.Color color29 = color16.sub(color27);
        float float30 = color29.toFloatBits();
        com.badlogic.gdx.graphics.Color color31 = new com.badlogic.gdx.graphics.Color(color29);
        com.badlogic.gdx.graphics.Color color32 = color11.mul(color31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color32 and color16", color32.equals(color16) ? color32.hashCode() == color16.hashCode() : true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setwindowHeight((int) (byte) 10);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color14 = color9.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color15 = color8.sub(color14);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color8, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color22 = color8.set(1.561203E-39f, (float) 2, (float) (byte) -1, (float) 3);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3ApplicationConfiguration0.setwindowX(97);
        com.badlogic.gdx.graphics.Color color26 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(color26);
        com.badlogic.gdx.graphics.Color color28 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str29 = color28.toString();
        com.badlogic.gdx.graphics.Color color31 = color28.set((-62986));
        com.badlogic.gdx.graphics.Color color32 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str33 = color32.toString();
        com.badlogic.gdx.graphics.Color color35 = color32.set((-62986));
        com.badlogic.gdx.graphics.Color color36 = color31.sub(color35);
        com.badlogic.gdx.graphics.Color color37 = color26.add(color35);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color35);
        com.badlogic.gdx.graphics.Color color39 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        java.lang.String str40 = color39.toString();
        int int41 = com.badlogic.gdx.graphics.Color.argb8888(color39);
        float float42 = color39.toFloatBits();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color26 and color27", color26.equals(color27) ? color26.hashCode() == color27.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.windowDecorated;
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.GREEN;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color9);
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration0.b = (-10);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(1.67129651E9f, (float) (-14540110), (float) 2, (-1.5659187E38f));
        com.badlogic.gdx.graphics.Color color21 = color19.mul(2.75501E-40f);
        int int22 = com.badlogic.gdx.graphics.Color.rgb565(color21);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3ApplicationConfiguration0.setwindowHeight(58111);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color9 and color19", color9.equals(color19) ? color9.hashCode() == color19.hashCode() : true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-1308557313));
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color((-16711680));
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color3, (-16734721));
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color11 = color6.add((float) (byte) 100, (float) 41903542, (float) (short) 10, (-1.6947917E38f));
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color13 = color12.cpy();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color13, 1);
        float float16 = color13.r;
        com.badlogic.gdx.graphics.Color color17 = color6.sub(color13);
        com.badlogic.gdx.graphics.Color color18 = color3.set(color6);
        com.badlogic.gdx.graphics.Color color19 = color1.sub(color18);
        int int20 = com.badlogic.gdx.graphics.Color.argb8888(color19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color19 and color13", color19.equals(color13) ? color19.hashCode() == color13.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) (byte) 100, (float) 41903542, (float) (short) 10, (-1.6947917E38f));
        com.badlogic.gdx.graphics.Color color10 = color5.sub((float) (-65025), 9.18893E-39f, (float) (-50396672), (float) (-14540110));
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color(167247232);
        com.badlogic.gdx.graphics.Color color18 = color12.lerp((float) 31334400, (float) 3845, (float) (-62986), (float) (-16741598), (float) (-379904));
        com.badlogic.gdx.graphics.Color color19 = color10.mul(color18);
        color18.g = 2.4259024E-18f;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color0 and color18", color0.equals(color18) ? color0.hashCode() == color18.hashCode() : true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        lwjgl3ApplicationConfiguration0.setwindowX((int) ' ');
        lwjgl3ApplicationConfiguration0.depth = (-537010176);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-50396672), (int) '#');
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color19 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color20 = color19.cpy();
        int int21 = com.badlogic.gdx.graphics.Color.argb8888(color20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str23 = lwjgl3ApplicationConfiguration22.title;
        com.badlogic.gdx.graphics.Color color24 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color24, 16);
        lwjgl3ApplicationConfiguration22.setInitialBackgroundColor(color24);
        com.badlogic.gdx.graphics.Color color32 = color24.sub((float) (-232), (float) (-255), (float) 10L, (float) 1L);
        com.badlogic.gdx.graphics.Color color34 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color40 = color34.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color41 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str42 = color41.toString();
        com.badlogic.gdx.graphics.Color color44 = color34.lerp(color41, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color45 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color45, 16);
        com.badlogic.gdx.graphics.Color color48 = color44.sub(color45);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color45, 1677696502);
        com.badlogic.gdx.graphics.Color color51 = color24.sub(color45);
        com.badlogic.gdx.graphics.Color color52 = color20.mul(color45);
        com.badlogic.gdx.graphics.Color color53 = new com.badlogic.gdx.graphics.Color(color45);
        float float54 = color45.r;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color45;
        color45.b = (-2147477600);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color20 and color45", color20.equals(color45) ? color20.hashCode() == color45.hashCode() : true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color6);
        java.lang.String str8 = color6.toString();
        int int9 = com.badlogic.gdx.graphics.Color.rgba4444(color6);
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color15 = color10.set((float) 15687677, (float) 2, (float) 1L, (float) (-240));
        color10.a = 63488;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color0 and color10", color0.equals(color10) ? color0.hashCode() == color10.hashCode() : true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color1 = color0.cpy();
        int int2 = com.badlogic.gdx.graphics.Color.argb8888(color1);
        com.badlogic.gdx.graphics.Color color3 = com.badlogic.gdx.graphics.Color.FOREST;
        int int4 = com.badlogic.gdx.graphics.Color.argb8888(color3);
        com.badlogic.gdx.graphics.Color color6 = color1.lerp(color3, (float) (-50396672));
        int int7 = com.badlogic.gdx.graphics.Color.rgba8888(color1);
        color1.b = 7.2138E-39f;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color0 and color1", color0.equals(color1) ? color0.hashCode() == color1.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(1.67129651E9f, (float) (-14540110), (float) 2, (-1.5659187E38f));
        com.badlogic.gdx.graphics.Color color6 = color4.mul(2.75501E-40f);
        int int7 = com.badlogic.gdx.graphics.Color.rgb565(color6);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color6);
        color6.r = (-254);
        com.badlogic.gdx.graphics.Color color11 = color6.clamp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color11 and color8", color11.equals(color8) ? color11.hashCode() == color8.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setdepth((int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setwindowWidth((int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration5.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration5.samples = (-1);
        lwjgl3ApplicationConfiguration5.useGL30 = true;
        lwjgl3ApplicationConfiguration5.setpreferencesDirectory("ffff72ff");
        int int14 = lwjgl3ApplicationConfiguration5.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration5.windowY = 20188;
        int int17 = lwjgl3ApplicationConfiguration5.getaudioDeviceBufferCount();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = lwjgl3ApplicationConfiguration5.hdpiMode;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode18;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.graphics.Color color21 = lwjgl3ApplicationConfiguration20.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color27 = color21.lerp((float) 178, (float) (-2), (float) 167709184, (float) 41903542, 2.5243549E-29f);
        com.badlogic.gdx.graphics.Color color28 = color21.cpy();
        color21.a = (-537010176);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color21 and color28", color21.equals(color28) ? color21.hashCode() == color28.hashCode() : true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        float float2 = color1.a;
        int int3 = color1.toIntBits();
        int int4 = com.badlogic.gdx.graphics.Color.argb8888(color1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str6 = lwjgl3ApplicationConfiguration5.title;
        lwjgl3ApplicationConfiguration5.a = (-1);
        boolean boolean9 = lwjgl3ApplicationConfiguration5.vSyncEnabled;
        lwjgl3ApplicationConfiguration5.setaudioDeviceSimultaneousSources((-262646));
        lwjgl3ApplicationConfiguration5.useVsync(true);
        lwjgl3ApplicationConfiguration5.setBackBufferConfig((int) (byte) 0, (-256), (-1306385665), (-1879860224), 43268, 512, (-1611265692));
        lwjgl3ApplicationConfiguration5.audioDeviceBufferCount = 167247232;
        com.badlogic.gdx.graphics.Color color24 = lwjgl3ApplicationConfiguration5.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color29 = color24.mul((float) 1, (float) (-240), 2.3418409E-38f, (float) 100);
        com.badlogic.gdx.graphics.Color color30 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color35 = color30.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color(color30);
        com.badlogic.gdx.graphics.Color color37 = new com.badlogic.gdx.graphics.Color(color36);
        int int38 = com.badlogic.gdx.graphics.Color.argb8888(color37);
        int int39 = com.badlogic.gdx.graphics.Color.argb8888(color37);
        com.badlogic.gdx.graphics.Color color41 = color37.set(3);
        com.badlogic.gdx.graphics.Color color43 = color41.mul((float) (-334888960));
        com.badlogic.gdx.graphics.Color color45 = color24.lerp(color41, (float) (-587726848));
        com.badlogic.gdx.graphics.Color color46 = color1.add(color41);
        com.badlogic.gdx.graphics.Color color47 = color1.premultiplyAlpha();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color24 and color37", color24.equals(color37) ? color24.hashCode() == color37.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color5, 100);
        com.badlogic.gdx.graphics.Color color9 = color5.mul(100.0f);
        com.badlogic.gdx.graphics.Color color14 = color5.add((float) 65024, (float) (-2130837248), (float) (-255), (float) 31334400);
        com.badlogic.gdx.graphics.Color color15 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color20 = color15.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(color15);
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color(color21);
        java.lang.String str23 = color21.toString();
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color(color21);
        com.badlogic.gdx.graphics.Color color26 = color14.lerp(color24, (-1.515294E38f));
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color24, (-587202461));
        int int29 = com.badlogic.gdx.graphics.Color.rgba4444(color24);
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color(color24);
        com.badlogic.gdx.graphics.Color color31 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color32 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color37 = color32.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color38 = new com.badlogic.gdx.graphics.Color(color32);
        com.badlogic.gdx.graphics.Color color39 = new com.badlogic.gdx.graphics.Color(color38);
        com.badlogic.gdx.graphics.Color color40 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color45 = color40.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color47 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color53 = color47.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color54 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str55 = color54.toString();
        com.badlogic.gdx.graphics.Color color57 = color47.lerp(color54, (-8.0750596E37f));
        boolean boolean58 = color40.equals((java.lang.Object) color47);
        com.badlogic.gdx.graphics.Color color59 = color39.add(color40);
        com.badlogic.gdx.graphics.Color color61 = color31.lerp(color39, (float) (-14540110));
        int int62 = com.badlogic.gdx.graphics.Color.rgb565(color31);
        com.badlogic.gdx.graphics.Color color67 = color31.mul((float) (byte) 0, (float) (byte) 100, (float) 35, (float) (-255));
        int int68 = com.badlogic.gdx.graphics.Color.rgb565(color31);
        com.badlogic.gdx.graphics.Color color69 = color30.sub(color31);
        com.badlogic.gdx.graphics.Color color74 = color69.set((float) (-1792), 2.9692728E-8f, (-6.1624956E-23f), (float) (-167706623));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color74 and color31", color74.equals(color31) ? color74.hashCode() == color31.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color3 = color1.set(color2);
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color11 = color6.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(color12);
        com.badlogic.gdx.graphics.Color color14 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color19 = color14.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color27 = color21.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color28 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str29 = color28.toString();
        com.badlogic.gdx.graphics.Color color31 = color21.lerp(color28, (-8.0750596E37f));
        boolean boolean32 = color14.equals((java.lang.Object) color21);
        com.badlogic.gdx.graphics.Color color33 = color13.add(color14);
        com.badlogic.gdx.graphics.Color color35 = color5.lerp(color13, (float) (-14540110));
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color(color5);
        com.badlogic.gdx.graphics.Color color37 = color1.sub(color5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration38.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        com.badlogic.gdx.graphics.Color color47 = lwjgl3ApplicationConfiguration38.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color48 = color1.sub(color47);
        com.badlogic.gdx.graphics.Color color53 = color1.sub(0.0f, (float) 6147990, (float) 2147483647, 0.0f);
        color53.a = 65025;
        color53.r = (-1.6947916E38f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color53 and color47", color53.equals(color47) ? color53.hashCode() == color47.hashCode() : true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(1.5612034E-37f, (float) (-16711680), 2.5243549E-29f, (float) (-1306385665));
        color4.b = 65025;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str8 = lwjgl3ApplicationConfiguration7.title;
        lwjgl3ApplicationConfiguration7.a = (-1);
        boolean boolean11 = lwjgl3ApplicationConfiguration7.vSyncEnabled;
        lwjgl3ApplicationConfiguration7.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color14 = lwjgl3ApplicationConfiguration7.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(color14);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color15);
        com.badlogic.gdx.graphics.Color color17 = color4.sub(color15);
        float float18 = color17.toFloatBits();
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(color17);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color23 = color21.mul((float) 1671296512);
        com.badlogic.gdx.graphics.Color color25 = color17.lerp(color23, (float) (-512));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color25 and color19", color25.equals(color19) ? color25.hashCode() == color19.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color3 = color1.set(color2);
        com.badlogic.gdx.graphics.Color color8 = color3.mul((float) 100, (float) 1671296512, (float) 640, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color8);
        com.badlogic.gdx.graphics.Color color14 = color8.sub((float) (-10420224), (float) 536871099, (float) (-1607680), (-8.089319E30f));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color2 and color9", color2.equals(color9) ? color2.hashCode() == color9.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.FOREST;
        int int1 = com.badlogic.gdx.graphics.Color.argb8888(color0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int3 = lwjgl3ApplicationConfiguration2.getaudioDeviceBufferSize();
        boolean boolean4 = lwjgl3ApplicationConfiguration2.windowResizable;
        lwjgl3ApplicationConfiguration2.depth = (short) 10;
        lwjgl3ApplicationConfiguration2.title = "4169e1ff";
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color18 = color12.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color19 = color10.mul(color18);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration2.initialBackgroundColor = color10;
        com.badlogic.gdx.graphics.Color color23 = color0.set(color10);
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color26 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color31 = color26.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color32 = color25.sub(color31);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color25, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color(color25);
        com.badlogic.gdx.graphics.Color color40 = color25.mul((float) (-222), (-1.5084639E38f), (float) (-62986), (float) (-16741598));
        com.badlogic.gdx.graphics.Color color42 = color40.mul((-4.581683E37f));
        com.badlogic.gdx.graphics.Color color43 = color10.sub(color42);
        com.badlogic.gdx.graphics.Color color48 = new com.badlogic.gdx.graphics.Color((float) (-61455), (float) 195840, (float) (-16646400), (float) (-232));
        color48.g = (-12632257);
        boolean boolean51 = color42.equals((java.lang.Object) (-12632257));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color0 and color48", color0.equals(color48) ? color0.hashCode() == color48.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color3 = color1.set(color2);
        float float4 = color2.b;
        float float5 = color2.r;
        com.badlogic.gdx.graphics.Color color10 = color2.set((float) (byte) 1, (float) (byte) 10, 0.0f, 0.69803923f);
        com.badlogic.gdx.graphics.Color color11 = color2.cpy();
        int int12 = com.badlogic.gdx.graphics.Color.rgb888(color2);
        com.badlogic.gdx.graphics.Color color13 = color2.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color14 = com.badlogic.gdx.graphics.Color.GOLD;
        com.badlogic.gdx.graphics.Color color16 = color14.set(570949632);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color14, 166464000);
        com.badlogic.gdx.graphics.Color color23 = new com.badlogic.gdx.graphics.Color((float) 2, (float) 100, (float) (short) 0, (float) 640);
        color23.g = 167247232;
        java.lang.String str26 = color23.toString();
        float float27 = color23.a;
        com.badlogic.gdx.graphics.Color color28 = color14.set(color23);
        com.badlogic.gdx.graphics.Color color30 = color14.mul((-1.6995686E38f));
        com.badlogic.gdx.graphics.Color color31 = color2.add(color30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color1 and color23", color1.equals(color23) ? color1.hashCode() == color23.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color9 = color3.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color10 = color1.mul(color9);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color1, (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color13 = color1.cpy();
        com.badlogic.gdx.graphics.Color color14 = color1.cpy();
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color17 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color18 = color16.set(color17);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(color16);
        com.badlogic.gdx.graphics.Color color20 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color21 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color26 = color21.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(color21);
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color(color27);
        com.badlogic.gdx.graphics.Color color29 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color34 = color29.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color42 = color36.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color43 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str44 = color43.toString();
        com.badlogic.gdx.graphics.Color color46 = color36.lerp(color43, (-8.0750596E37f));
        boolean boolean47 = color29.equals((java.lang.Object) color36);
        com.badlogic.gdx.graphics.Color color48 = color28.add(color29);
        com.badlogic.gdx.graphics.Color color50 = color20.lerp(color28, (float) (-14540110));
        com.badlogic.gdx.graphics.Color color51 = new com.badlogic.gdx.graphics.Color(color20);
        com.badlogic.gdx.graphics.Color color52 = color16.sub(color20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration53 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration53.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        com.badlogic.gdx.graphics.Color color62 = lwjgl3ApplicationConfiguration53.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color63 = color16.sub(color62);
        com.badlogic.gdx.graphics.Color color68 = color16.sub(0.0f, (float) 6147990, (float) 2147483647, 0.0f);
        com.badlogic.gdx.graphics.Color color69 = color14.add(color16);
        color16.a = (-14492160);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color14 and color16", color14.equals(color16) ? color14.hashCode() == color16.hashCode() : true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (byte) 100);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.BLACK;
        float float3 = color2.r;
        color2.r = 1671296512;
        com.badlogic.gdx.graphics.Color color6 = color1.sub(color2);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color8 = color1.clamp();
        com.badlogic.gdx.graphics.Color color13 = color8.set((-8.4042517E37f), (float) (-1308622670), (-4.454078E37f), 2.3418409E-38f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color13 and color7", color13.equals(color7) ? color13.hashCode() == color7.hashCode() : true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) 100, 1.0f, (float) 0, (float) (byte) 0);
        color0.g = 151015132;
        com.badlogic.gdx.graphics.Color color12 = color0.sub((float) 10L, (float) 480, (float) (-1611265692), (float) (-8672));
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(color0);
        color0.g = 2147483647;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color0 and color13", color0.equals(color13) ? color0.hashCode() == color13.hashCode() : true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 6147990, (float) (byte) -1, (float) (-61455), (float) 15687677);
        com.badlogic.gdx.graphics.Color color10 = color4.lerp((float) (-183869281), (float) (-2142638528), (float) (-4096), (float) (-40036), (float) 63519);
        com.badlogic.gdx.graphics.Color color11 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color12 = color11.cpy();
        int int13 = com.badlogic.gdx.graphics.Color.argb8888(color12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str15 = lwjgl3ApplicationConfiguration14.title;
        com.badlogic.gdx.graphics.Color color16 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color16, 16);
        lwjgl3ApplicationConfiguration14.setInitialBackgroundColor(color16);
        com.badlogic.gdx.graphics.Color color24 = color16.sub((float) (-232), (float) (-255), (float) 10L, (float) 1L);
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color32 = color26.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color33 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str34 = color33.toString();
        com.badlogic.gdx.graphics.Color color36 = color26.lerp(color33, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color37 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color37, 16);
        com.badlogic.gdx.graphics.Color color40 = color36.sub(color37);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color37, 1677696502);
        com.badlogic.gdx.graphics.Color color43 = color16.sub(color37);
        com.badlogic.gdx.graphics.Color color44 = color12.mul(color37);
        com.badlogic.gdx.graphics.Color color45 = new com.badlogic.gdx.graphics.Color(color37);
        com.badlogic.gdx.graphics.Color color47 = color10.lerp(color37, (float) (-16580863));
        color37.b = (-1.4936944E38f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color4 and color37", color4.equals(color37) ? color4.hashCode() == color37.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setdepth((int) (byte) 1);
        com.badlogic.gdx.Files.FileType fileType3 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color7 = color5.set(color6);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color5);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color15 = color10.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color10);
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(color16);
        com.badlogic.gdx.graphics.Color color18 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color23 = color18.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color31 = color25.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color32 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str33 = color32.toString();
        com.badlogic.gdx.graphics.Color color35 = color25.lerp(color32, (-8.0750596E37f));
        boolean boolean36 = color18.equals((java.lang.Object) color25);
        com.badlogic.gdx.graphics.Color color37 = color17.add(color18);
        com.badlogic.gdx.graphics.Color color39 = color9.lerp(color17, (float) (-14540110));
        com.badlogic.gdx.graphics.Color color40 = new com.badlogic.gdx.graphics.Color(color9);
        com.badlogic.gdx.graphics.Color color41 = color5.sub(color9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration42 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration42.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        com.badlogic.gdx.graphics.Color color51 = lwjgl3ApplicationConfiguration42.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color52 = color5.sub(color51);
        com.badlogic.gdx.graphics.Color color57 = color5.sub(0.0f, (float) 6147990, (float) 2147483647, 0.0f);
        com.badlogic.gdx.graphics.Color color58 = color5.clamp();
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color58);
        int int60 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration61 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean62 = lwjgl3ApplicationConfiguration61.vSyncEnabled;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color10 and color51", color10.equals(color51) ? color10.hashCode() == color51.hashCode() : true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color3 = color1.set(color2);
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color11 = color6.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(color12);
        com.badlogic.gdx.graphics.Color color14 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color19 = color14.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color27 = color21.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color28 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str29 = color28.toString();
        com.badlogic.gdx.graphics.Color color31 = color21.lerp(color28, (-8.0750596E37f));
        boolean boolean32 = color14.equals((java.lang.Object) color21);
        com.badlogic.gdx.graphics.Color color33 = color13.add(color14);
        com.badlogic.gdx.graphics.Color color35 = color5.lerp(color13, (float) (-14540110));
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color(color5);
        com.badlogic.gdx.graphics.Color color37 = color1.sub(color5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration38.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        com.badlogic.gdx.graphics.Color color47 = lwjgl3ApplicationConfiguration38.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color48 = color1.sub(color47);
        float float49 = color48.g;
        color48.g = 0.12698413f;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color6 and color47", color6.equals(color47) ? color6.hashCode() == color47.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(480);
        com.badlogic.gdx.graphics.Color color2 = color1.cpy();
        float float3 = color2.b;
        com.badlogic.gdx.graphics.Color color8 = color2.sub((float) (-135823360), (float) 268493567, (float) (-1611265692), (float) 52);
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color18 = color12.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color19 = color10.mul(color18);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        float float22 = color21.a;
        com.badlogic.gdx.graphics.Color color27 = color21.mul((float) 8, (float) 1677696502, (float) 0L, (float) 43268);
        com.badlogic.gdx.graphics.Color color28 = color10.add(color27);
        com.badlogic.gdx.graphics.Color color33 = color28.mul(0.0f, (float) '#', 0.0f, (float) 16711935);
        com.badlogic.gdx.graphics.Color color35 = color2.lerp(color28, (float) (-2146959360));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode37 = null;
        lwjgl3ApplicationConfiguration36.setFullscreenMode(displayMode37);
        lwjgl3ApplicationConfiguration36.samples = (-1);
        lwjgl3ApplicationConfiguration36.useGL30 = true;
        lwjgl3ApplicationConfiguration36.setpreferencesDirectory("ffff72ff");
        int int45 = lwjgl3ApplicationConfiguration36.getgles30ContextMajorVersion();
        com.badlogic.gdx.graphics.Color color47 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color49 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color55 = color49.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color56 = color47.mul(color55);
        com.badlogic.gdx.graphics.Color color58 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        float float59 = color58.a;
        com.badlogic.gdx.graphics.Color color64 = color58.mul((float) 8, (float) 1677696502, (float) 0L, (float) 43268);
        com.badlogic.gdx.graphics.Color color65 = color47.add(color64);
        lwjgl3ApplicationConfiguration36.initialBackgroundColor = color47;
        com.badlogic.gdx.graphics.Color color71 = color47.set((-4.818329E37f), (float) '4', 9.1477E-41f, (float) '#');
        com.badlogic.gdx.graphics.Color color72 = color35.add(color47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color10 and color47", color10.equals(color47) ? color10.hashCode() == color47.hashCode() : true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color13 = color12.cpy();
        int int14 = com.badlogic.gdx.graphics.Color.argb8888(color13);
        com.badlogic.gdx.graphics.Color color15 = com.badlogic.gdx.graphics.Color.FOREST;
        int int16 = com.badlogic.gdx.graphics.Color.argb8888(color15);
        com.badlogic.gdx.graphics.Color color18 = color13.lerp(color15, (float) (-50396672));
        int int19 = com.badlogic.gdx.graphics.Color.argb8888(color18);
        com.badlogic.gdx.graphics.Color color20 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color21 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color26 = color21.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(color21);
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color(color27);
        com.badlogic.gdx.graphics.Color color29 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color34 = color29.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color42 = color36.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color43 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str44 = color43.toString();
        com.badlogic.gdx.graphics.Color color46 = color36.lerp(color43, (-8.0750596E37f));
        boolean boolean47 = color29.equals((java.lang.Object) color36);
        com.badlogic.gdx.graphics.Color color48 = color28.add(color29);
        com.badlogic.gdx.graphics.Color color50 = color20.lerp(color28, (float) (-14540110));
        int int51 = com.badlogic.gdx.graphics.Color.rgb565(color20);
        com.badlogic.gdx.graphics.Color color52 = color18.sub(color20);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color18;
        com.badlogic.gdx.graphics.Color color54 = new com.badlogic.gdx.graphics.Color(color18);
        int int55 = com.badlogic.gdx.graphics.Color.rgb565(color54);
        com.badlogic.gdx.graphics.Color color56 = color54.cpy();
        com.badlogic.gdx.graphics.Color color57 = color54.clamp();
        com.badlogic.gdx.graphics.Color color58 = color54.clamp();
        color58.r = 570425395;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color21 and color58", color21.equals(color58) ? color21.hashCode() == color58.hashCode() : true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SCARLET;
        color0.b = '#';
        com.badlogic.gdx.graphics.Color color3 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color color5 = color0.lerp(color3, (float) 1L);
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.SALMON;
        float float7 = color6.toFloatBits();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str9 = lwjgl3ApplicationConfiguration8.title;
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color10, 16);
        lwjgl3ApplicationConfiguration8.setInitialBackgroundColor(color10);
        com.badlogic.gdx.graphics.Color color18 = color10.sub((float) (-232), (float) (-255), (float) 10L, (float) 1L);
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color26 = color20.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color27 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str28 = color27.toString();
        com.badlogic.gdx.graphics.Color color30 = color20.lerp(color27, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color31 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color31, 16);
        com.badlogic.gdx.graphics.Color color34 = color30.sub(color31);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color31, 1677696502);
        com.badlogic.gdx.graphics.Color color37 = color10.sub(color31);
        com.badlogic.gdx.graphics.Color color38 = color6.add(color31);
        com.badlogic.gdx.graphics.Color color40 = color3.lerp(color31, (float) (short) 1);
        com.badlogic.gdx.graphics.Color color41 = color40.clamp();
        com.badlogic.gdx.graphics.Color color46 = color41.set((float) 570949632, (-1.4523669E17f), (-1.4523669E17f), (float) 65025);
        com.badlogic.gdx.graphics.Color color47 = com.badlogic.gdx.graphics.Color.CLEAR;
        com.badlogic.gdx.graphics.Color color52 = color47.set((float) (-1980237824), 9.18893E-39f, (-4.153069E34f), (float) (-50135050));
        com.badlogic.gdx.graphics.Color color53 = color47.clamp();
        float float54 = color47.a;
        boolean boolean55 = color46.equals((java.lang.Object) float54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color0 and color47", color0.equals(color47) ? color0.hashCode() == color47.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(1.5612034E-37f, (float) (-16711680), 2.5243549E-29f, (float) (-1306385665));
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color4);
        int int6 = com.badlogic.gdx.graphics.Color.rgba4444(color5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int8 = lwjgl3ApplicationConfiguration7.getaudioDeviceBufferSize();
        int int9 = lwjgl3ApplicationConfiguration7.b;
        lwjgl3ApplicationConfiguration7.useGL30 = false;
        int int12 = lwjgl3ApplicationConfiguration7.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration7.g = ' ';
        com.badlogic.gdx.graphics.Color color15 = lwjgl3ApplicationConfiguration7.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color16 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color17 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color22 = color17.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color23 = new com.badlogic.gdx.graphics.Color(color17);
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color(color23);
        com.badlogic.gdx.graphics.Color color25 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color30 = color25.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color32 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color38 = color32.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color39 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str40 = color39.toString();
        com.badlogic.gdx.graphics.Color color42 = color32.lerp(color39, (-8.0750596E37f));
        boolean boolean43 = color25.equals((java.lang.Object) color32);
        com.badlogic.gdx.graphics.Color color44 = color24.add(color25);
        com.badlogic.gdx.graphics.Color color46 = color16.lerp(color24, (float) (-14540110));
        int int47 = com.badlogic.gdx.graphics.Color.rgb565(color16);
        com.badlogic.gdx.graphics.Color color52 = color16.mul((float) (byte) 0, (float) (byte) 100, (float) 35, (float) (-255));
        com.badlogic.gdx.graphics.Color color57 = color16.mul(0.0f, (float) 6529016, (float) (short) 100, (float) (-1));
        com.badlogic.gdx.graphics.Color color58 = color15.sub(color57);
        com.badlogic.gdx.graphics.Color color60 = new com.badlogic.gdx.graphics.Color(50918400);
        com.badlogic.gdx.graphics.Color color61 = color15.sub(color60);
        com.badlogic.gdx.graphics.Color color62 = color5.sub(color60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color4 and color16", color4.equals(color16) ? color4.hashCode() == color16.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) 100, 1.0f, (float) 0, (float) (byte) 0);
        java.lang.String str6 = color5.toString();
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color5, 1);
        com.badlogic.gdx.graphics.Color color13 = color5.mul((float) 41903542, (float) (-8672), (float) (-50135050), (float) (-10));
        com.badlogic.gdx.graphics.Color color19 = color13.lerp((float) (-65025), (-0.0f), (float) (-65486), (float) (byte) 10, (float) (-1L));
        color13.b = 652800;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str23 = lwjgl3ApplicationConfiguration22.title;
        lwjgl3ApplicationConfiguration22.windowY = 20188;
        int int26 = lwjgl3ApplicationConfiguration22.getwindowWidth();
        boolean boolean27 = color13.equals((java.lang.Object) int26);
        com.badlogic.gdx.graphics.Color color28 = color13.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color33 = new com.badlogic.gdx.graphics.Color((float) 6147990, (float) (byte) -1, (float) (-61455), (float) 15687677);
        float float34 = color33.a;
        com.badlogic.gdx.graphics.Color color39 = color33.add((-8.0750596E37f), 0.0f, (float) 1799159552, (float) (-16646655));
        color33.b = (-16711936);
        com.badlogic.gdx.graphics.Color color42 = color13.add(color33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color42 and color33", color42.equals(color33) ? color42.hashCode() == color33.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) (byte) 100, (float) 41903542, (float) (short) 10, (-1.6947917E38f));
        com.badlogic.gdx.graphics.Color color10 = color5.sub((float) (-65025), 9.18893E-39f, (float) (-50396672), (float) (-14540110));
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color(167247232);
        com.badlogic.gdx.graphics.Color color18 = color12.lerp((float) 31334400, (float) 3845, (float) (-62986), (float) (-16741598), (float) (-379904));
        com.badlogic.gdx.graphics.Color color19 = color10.mul(color18);
        color10.a = 1610620896;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color10 and color12", color10.equals(color12) ? color10.hashCode() == color12.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color1 = color0.cpy();
        int int2 = com.badlogic.gdx.graphics.Color.argb8888(color1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration3 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str4 = lwjgl3ApplicationConfiguration3.title;
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color5, 16);
        lwjgl3ApplicationConfiguration3.setInitialBackgroundColor(color5);
        com.badlogic.gdx.graphics.Color color13 = color5.sub((float) (-232), (float) (-255), (float) 10L, (float) 1L);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color21 = color15.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color22 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str23 = color22.toString();
        com.badlogic.gdx.graphics.Color color25 = color15.lerp(color22, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color26 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color26, 16);
        com.badlogic.gdx.graphics.Color color29 = color25.sub(color26);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color26, 1677696502);
        com.badlogic.gdx.graphics.Color color32 = color5.sub(color26);
        com.badlogic.gdx.graphics.Color color33 = color1.mul(color26);
        int int34 = com.badlogic.gdx.graphics.Color.rgb888(color26);
        color26.a = (-6.1624956E-23f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color1 and color26", color1.equals(color26) ? color1.hashCode() == color26.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(1.67129651E9f, (float) (-14540110), (float) 2, (-1.5659187E38f));
        com.badlogic.gdx.graphics.Color color6 = color4.mul(2.75501E-40f);
        int int7 = com.badlogic.gdx.graphics.Color.rgb565(color6);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color13 = color8.sub((float) 7576628, (float) 2047, (float) 1175295, (-1.7011522E38f));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int15 = lwjgl3ApplicationConfiguration14.getaudioDeviceBufferSize();
        boolean boolean16 = lwjgl3ApplicationConfiguration14.windowResizable;
        lwjgl3ApplicationConfiguration14.depth = (short) 10;
        lwjgl3ApplicationConfiguration14.title = "4169e1ff";
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color30 = color24.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color31 = color22.mul(color30);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color22, (int) (byte) 0);
        lwjgl3ApplicationConfiguration14.initialBackgroundColor = color22;
        int int35 = com.badlogic.gdx.graphics.Color.argb8888(color22);
        com.badlogic.gdx.graphics.Color color36 = color22.clamp();
        com.badlogic.gdx.graphics.Color color37 = color13.set(color22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color4 and color37", color4.equals(color37) ? color4.hashCode() == color37.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        float float2 = color1.a;
        int int3 = color1.toIntBits();
        int int4 = com.badlogic.gdx.graphics.Color.argb8888(color1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str6 = lwjgl3ApplicationConfiguration5.title;
        lwjgl3ApplicationConfiguration5.a = (-1);
        boolean boolean9 = lwjgl3ApplicationConfiguration5.vSyncEnabled;
        lwjgl3ApplicationConfiguration5.setaudioDeviceSimultaneousSources((-262646));
        lwjgl3ApplicationConfiguration5.useVsync(true);
        lwjgl3ApplicationConfiguration5.setBackBufferConfig((int) (byte) 0, (-256), (-1306385665), (-1879860224), 43268, 512, (-1611265692));
        lwjgl3ApplicationConfiguration5.audioDeviceBufferCount = 167247232;
        com.badlogic.gdx.graphics.Color color24 = lwjgl3ApplicationConfiguration5.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color29 = color24.mul((float) 1, (float) (-240), 2.3418409E-38f, (float) 100);
        com.badlogic.gdx.graphics.Color color30 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color35 = color30.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color(color30);
        com.badlogic.gdx.graphics.Color color37 = new com.badlogic.gdx.graphics.Color(color36);
        int int38 = com.badlogic.gdx.graphics.Color.argb8888(color37);
        int int39 = com.badlogic.gdx.graphics.Color.argb8888(color37);
        com.badlogic.gdx.graphics.Color color41 = color37.set(3);
        com.badlogic.gdx.graphics.Color color43 = color41.mul((float) (-334888960));
        com.badlogic.gdx.graphics.Color color45 = color24.lerp(color41, (float) (-587726848));
        com.badlogic.gdx.graphics.Color color46 = color1.add(color41);
        int int47 = com.badlogic.gdx.graphics.Color.argb8888(color1);
        float float48 = color1.a;
        int int49 = com.badlogic.gdx.graphics.Color.rgb565(color1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color24 and color37", color24.equals(color37) ? color24.hashCode() == color37.hashCode() : true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color7 = color2.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color8 = color1.sub(color7);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color1);
        int int10 = color9.toIntBits();
        com.badlogic.gdx.graphics.Color color11 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color12 = color11.cpy();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color12, 1);
        int int15 = color12.toIntBits();
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color12);
        com.badlogic.gdx.graphics.Color color17 = color9.mul(color16);
        float float18 = color17.g;
        com.badlogic.gdx.graphics.Color color23 = color17.mul((float) (-15), 0.0f, 2.2054372E-18f, (-9.997505E37f));
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color(0.0f, (float) 1, 0.13333334f, 1.561203E-39f);
        com.badlogic.gdx.graphics.Color color30 = color28.mul((float) 100);
        com.badlogic.gdx.graphics.Color color35 = color28.add((float) (-1611265692), (float) 6147990, (float) (-1291845633), (float) 63736);
        color28.a = (-1611265692);
        com.badlogic.gdx.graphics.Color color38 = color28.cpy();
        com.badlogic.gdx.graphics.Color color40 = color38.mul((-1.61126566E9f));
        com.badlogic.gdx.graphics.Color color41 = color23.set(color38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color2 and color28", color2.equals(color28) ? color2.hashCode() == color28.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.stencil;
        int int6 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.a = 43268;
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getwindowX();
        com.badlogic.gdx.graphics.Color color11 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        color11.a = 35;
        com.badlogic.gdx.graphics.Color color14 = new com.badlogic.gdx.graphics.Color(color11);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(color11);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType17 = null;
        lwjgl3ApplicationConfiguration16.setpreferencesFileType(fileType17);
        lwjgl3ApplicationConfiguration16.useVsync(false);
        com.badlogic.gdx.graphics.Color color21 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration16.initialBackgroundColor = color21;
        int int23 = lwjgl3ApplicationConfiguration16.depth;
        lwjgl3ApplicationConfiguration16.windowResizable = false;
        com.badlogic.gdx.graphics.Color color26 = lwjgl3ApplicationConfiguration16.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color28 = color15.lerp(color26, (float) 0L);
        com.badlogic.gdx.graphics.Color color29 = new com.badlogic.gdx.graphics.Color(color15);
        com.badlogic.gdx.graphics.Color color30 = color15.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color35 = color30.sub((float) 130560, (float) (-234885152), (float) (-65042), (float) 480);
        color30.r = 0.0f;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color11 and color21", color11.equals(color21) ? color11.hashCode() == color21.hashCode() : true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 10L, (float) 1, (float) 0, (float) (short) -1);
        color4.b = (-1241513983);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color4, (int) (byte) 100);
        com.badlogic.gdx.graphics.Color color11 = color4.mul((float) 16580354);
        color11.r = 3855;
        com.badlogic.gdx.graphics.Color color14 = com.badlogic.gdx.graphics.Color.SKY;
        int int15 = com.badlogic.gdx.graphics.Color.argb8888(color14);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str17 = lwjgl3ApplicationConfiguration16.title;
        lwjgl3ApplicationConfiguration16.a = (-1);
        boolean boolean20 = lwjgl3ApplicationConfiguration16.vSyncEnabled;
        lwjgl3ApplicationConfiguration16.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color23 = lwjgl3ApplicationConfiguration16.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color24 = color14.mul(color23);
        com.badlogic.gdx.graphics.Color color25 = color23.cpy();
        com.badlogic.gdx.graphics.Color color26 = color11.set(color23);
        com.badlogic.gdx.graphics.Color color32 = color26.lerp((-4.2535955E37f), (float) (-4096), (float) (-1966080), (float) (-195840), (-1.7009965E38f));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color32 and color23", color32.equals(color23) ? color32.hashCode() == color23.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (byte) 100);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.BLACK;
        float float3 = color2.r;
        color2.r = 1671296512;
        com.badlogic.gdx.graphics.Color color6 = color1.sub(color2);
        float float7 = color2.g;
        com.badlogic.gdx.graphics.Color color8 = color2.clamp();
        com.badlogic.gdx.graphics.Color color13 = color2.mul(6.162976E-33f, (-4.2535296E37f), (float) (-1363456), (float) ' ');
        color2.a = (-16777216);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color1 and color2", color1.equals(color2) ? color1.hashCode() == color2.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SCARLET;
        color0.b = '#';
        com.badlogic.gdx.graphics.Color color3 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color color5 = color0.lerp(color3, (float) 1L);
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.SALMON;
        float float7 = color6.toFloatBits();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str9 = lwjgl3ApplicationConfiguration8.title;
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color10, 16);
        lwjgl3ApplicationConfiguration8.setInitialBackgroundColor(color10);
        com.badlogic.gdx.graphics.Color color18 = color10.sub((float) (-232), (float) (-255), (float) 10L, (float) 1L);
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color26 = color20.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color27 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str28 = color27.toString();
        com.badlogic.gdx.graphics.Color color30 = color20.lerp(color27, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color31 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color31, 16);
        com.badlogic.gdx.graphics.Color color34 = color30.sub(color31);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color31, 1677696502);
        com.badlogic.gdx.graphics.Color color37 = color10.sub(color31);
        com.badlogic.gdx.graphics.Color color38 = color6.add(color31);
        com.badlogic.gdx.graphics.Color color40 = color3.lerp(color31, (float) (short) 1);
        com.badlogic.gdx.graphics.Color color41 = color3.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color46 = color41.mul((float) (-10887648), (float) (-203427056), (float) (-187392), (float) 16772625);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color0 and color6", color0.equals(color6) ? color0.hashCode() == color6.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color0, (int) 'a');
        com.badlogic.gdx.graphics.Color color3 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        com.badlogic.gdx.graphics.Color color5 = color0.lerp(color3, (float) (short) 0);
        com.badlogic.gdx.graphics.Color color6 = color3.clamp();
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color7, (-59160));
        com.badlogic.gdx.graphics.Color color14 = color7.sub(0.057594743f, (float) (byte) 100, (float) 1677696502, (float) (-240));
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(1.5612034E-37f, (float) (-16711680), 2.5243549E-29f, (float) (-1306385665));
        color19.b = 65025;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str23 = lwjgl3ApplicationConfiguration22.title;
        lwjgl3ApplicationConfiguration22.a = (-1);
        boolean boolean26 = lwjgl3ApplicationConfiguration22.vSyncEnabled;
        lwjgl3ApplicationConfiguration22.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color29 = lwjgl3ApplicationConfiguration22.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color(color29);
        com.badlogic.gdx.graphics.Color color31 = new com.badlogic.gdx.graphics.Color(color30);
        com.badlogic.gdx.graphics.Color color32 = color19.sub(color30);
        float float33 = color32.toFloatBits();
        com.badlogic.gdx.graphics.Color color34 = new com.badlogic.gdx.graphics.Color(color32);
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color(color32);
        com.badlogic.gdx.graphics.Color color40 = color35.mul((float) 33488896, (-1.701386E38f), (float) (-146800768), (-1.5862616E29f));
        com.badlogic.gdx.graphics.Color color42 = color14.lerp(color35, (float) (-16776961));
        com.badlogic.gdx.graphics.Color color43 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color48 = color43.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color48, 100);
        com.badlogic.gdx.graphics.Color color52 = color48.mul(100.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color52, 8897069);
        com.badlogic.gdx.graphics.Color color55 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color60 = color55.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color61 = new com.badlogic.gdx.graphics.Color(color55);
        com.badlogic.gdx.graphics.Color color62 = new com.badlogic.gdx.graphics.Color(color61);
        int int63 = com.badlogic.gdx.graphics.Color.argb8888(color62);
        int int64 = com.badlogic.gdx.graphics.Color.rgba8888(color62);
        com.badlogic.gdx.graphics.Color color66 = color52.lerp(color62, (float) 1044480);
        com.badlogic.gdx.graphics.Color color67 = new com.badlogic.gdx.graphics.Color(color62);
        com.badlogic.gdx.graphics.Color color69 = com.badlogic.gdx.graphics.Color.valueOf("8ff00000");
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color69, (-1902614));
        com.badlogic.gdx.graphics.Color color73 = color62.lerp(color69, (float) 65280);
        com.badlogic.gdx.graphics.Color color74 = color35.mul(color73);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color29 and color73", color29.equals(color73) ? color29.hashCode() == color73.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setdepth((int) (byte) 1);
        com.badlogic.gdx.Files.FileType fileType3 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color7 = color5.set(color6);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color5);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color15 = color10.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color10);
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(color16);
        com.badlogic.gdx.graphics.Color color18 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color23 = color18.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color31 = color25.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color32 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str33 = color32.toString();
        com.badlogic.gdx.graphics.Color color35 = color25.lerp(color32, (-8.0750596E37f));
        boolean boolean36 = color18.equals((java.lang.Object) color25);
        com.badlogic.gdx.graphics.Color color37 = color17.add(color18);
        com.badlogic.gdx.graphics.Color color39 = color9.lerp(color17, (float) (-14540110));
        com.badlogic.gdx.graphics.Color color40 = new com.badlogic.gdx.graphics.Color(color9);
        com.badlogic.gdx.graphics.Color color41 = color5.sub(color9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration42 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration42.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        com.badlogic.gdx.graphics.Color color51 = lwjgl3ApplicationConfiguration42.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color52 = color5.sub(color51);
        com.badlogic.gdx.graphics.Color color57 = color5.sub(0.0f, (float) 6147990, (float) 2147483647, 0.0f);
        com.badlogic.gdx.graphics.Color color58 = color5.clamp();
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color58);
        int int60 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.setwindowY(16580354);
        int int63 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean64 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        lwjgl3ApplicationConfiguration0.b = 1794115036;
        int int67 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int68 = lwjgl3ApplicationConfiguration0.depth;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color18 and color51", color18.equals(color51) ? color18.hashCode() == color51.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color9 = color3.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color10 = color1.mul(color9);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        float float13 = color12.a;
        com.badlogic.gdx.graphics.Color color18 = color12.mul((float) 8, (float) 1677696502, (float) 0L, (float) 43268);
        com.badlogic.gdx.graphics.Color color19 = color1.add(color18);
        color1.b = (-10223586);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color1 and color12", color1.equals(color12) ? color1.hashCode() == color12.hashCode() : true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color5, 100);
        com.badlogic.gdx.graphics.Color color9 = color5.mul(100.0f);
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color(color5);
        com.badlogic.gdx.graphics.Color color11 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color16 = color11.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(color11);
        int int18 = com.badlogic.gdx.graphics.Color.argb8888(color11);
        com.badlogic.gdx.graphics.Color color19 = color11.clamp();
        com.badlogic.gdx.graphics.Color color20 = color5.mul(color19);
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color((int) (byte) 100);
        com.badlogic.gdx.graphics.Color color23 = com.badlogic.gdx.graphics.Color.BLACK;
        float float24 = color23.r;
        color23.r = 1671296512;
        com.badlogic.gdx.graphics.Color color27 = color22.sub(color23);
        color23.r = 166464000;
        com.badlogic.gdx.graphics.Color color30 = color5.add(color23);
        com.badlogic.gdx.graphics.Color color31 = new com.badlogic.gdx.graphics.Color(color23);
        int int32 = com.badlogic.gdx.graphics.Color.rgba8888(color31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color0 and color23", color0.equals(color23) ? color0.hashCode() == color23.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setdepth((int) (byte) 1);
        com.badlogic.gdx.Files.FileType fileType3 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color7 = color5.set(color6);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color5);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color15 = color10.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color10);
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(color16);
        com.badlogic.gdx.graphics.Color color18 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color23 = color18.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color31 = color25.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color32 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str33 = color32.toString();
        com.badlogic.gdx.graphics.Color color35 = color25.lerp(color32, (-8.0750596E37f));
        boolean boolean36 = color18.equals((java.lang.Object) color25);
        com.badlogic.gdx.graphics.Color color37 = color17.add(color18);
        com.badlogic.gdx.graphics.Color color39 = color9.lerp(color17, (float) (-14540110));
        com.badlogic.gdx.graphics.Color color40 = new com.badlogic.gdx.graphics.Color(color9);
        com.badlogic.gdx.graphics.Color color41 = color5.sub(color9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration42 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration42.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        com.badlogic.gdx.graphics.Color color51 = lwjgl3ApplicationConfiguration42.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color52 = color5.sub(color51);
        com.badlogic.gdx.graphics.Color color57 = color5.sub(0.0f, (float) 6147990, (float) 2147483647, 0.0f);
        com.badlogic.gdx.graphics.Color color58 = color5.clamp();
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color58);
        int int60 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.setwindowY(16580354);
        int int63 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean64 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        lwjgl3ApplicationConfiguration0.b = 1794115036;
        int int67 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.title = "";
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color10 and color51", color10.equals(color51) ? color10.hashCode() == color51.hashCode() : true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 1671296512, (float) 100L, (float) '4', (float) 0L);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color((-4.2867603E37f), 9.18893E-39f, (float) 1794115036, (float) (-10));
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color15 = color10.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color20 = color15.mul((-1.0f), (float) 1677696502, (float) 65024, (float) (short) 1);
        com.badlogic.gdx.graphics.Color color21 = color9.sub(color20);
        com.badlogic.gdx.graphics.Color color22 = color21.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color23 = color4.mul(color22);
        com.badlogic.gdx.graphics.Color color24 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color29 = color24.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color29, 100);
        com.badlogic.gdx.graphics.Color color33 = color29.mul(100.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color33, 8897069);
        com.badlogic.gdx.graphics.Color color36 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color41 = color36.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color42 = new com.badlogic.gdx.graphics.Color(color36);
        com.badlogic.gdx.graphics.Color color43 = new com.badlogic.gdx.graphics.Color(color42);
        int int44 = com.badlogic.gdx.graphics.Color.argb8888(color43);
        int int45 = com.badlogic.gdx.graphics.Color.rgba8888(color43);
        com.badlogic.gdx.graphics.Color color47 = color33.lerp(color43, (float) 1044480);
        com.badlogic.gdx.graphics.Color color52 = color47.add((float) '4', (float) 10, (float) (short) 1, 0.69803923f);
        float float53 = color47.r;
        com.badlogic.gdx.graphics.Color color58 = color47.mul((float) (-8192), (float) (-33566977), 9.1477E-41f, (float) (-85425));
        com.badlogic.gdx.graphics.Color color60 = color22.lerp(color58, (-1.209883E38f));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color4 and color58", color4.equals(color58) ? color4.hashCode() == color58.hashCode() : true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setdepth((int) (byte) 1);
        com.badlogic.gdx.Files.FileType fileType3 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color7 = color5.set(color6);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color5);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color15 = color10.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color10);
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(color16);
        com.badlogic.gdx.graphics.Color color18 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color23 = color18.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color31 = color25.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color32 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str33 = color32.toString();
        com.badlogic.gdx.graphics.Color color35 = color25.lerp(color32, (-8.0750596E37f));
        boolean boolean36 = color18.equals((java.lang.Object) color25);
        com.badlogic.gdx.graphics.Color color37 = color17.add(color18);
        com.badlogic.gdx.graphics.Color color39 = color9.lerp(color17, (float) (-14540110));
        com.badlogic.gdx.graphics.Color color40 = new com.badlogic.gdx.graphics.Color(color9);
        com.badlogic.gdx.graphics.Color color41 = color5.sub(color9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration42 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration42.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        com.badlogic.gdx.graphics.Color color51 = lwjgl3ApplicationConfiguration42.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color52 = color5.sub(color51);
        com.badlogic.gdx.graphics.Color color57 = color5.sub(0.0f, (float) 6147990, (float) 2147483647, 0.0f);
        com.badlogic.gdx.graphics.Color color58 = color5.clamp();
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color58);
        int int60 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color18 and color51", color18.equals(color51) ? color18.hashCode() == color51.hashCode() : true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color1 = color0.cpy();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color1, 1);
        int int4 = color1.toIntBits();
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color7 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color8 = color6.set(color7);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color11 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color16 = color11.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(color11);
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(color17);
        com.badlogic.gdx.graphics.Color color19 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color24 = color19.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color32 = color26.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color33 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str34 = color33.toString();
        com.badlogic.gdx.graphics.Color color36 = color26.lerp(color33, (-8.0750596E37f));
        boolean boolean37 = color19.equals((java.lang.Object) color26);
        com.badlogic.gdx.graphics.Color color38 = color18.add(color19);
        com.badlogic.gdx.graphics.Color color40 = color10.lerp(color18, (float) (-14540110));
        com.badlogic.gdx.graphics.Color color41 = new com.badlogic.gdx.graphics.Color(color10);
        com.badlogic.gdx.graphics.Color color42 = color6.sub(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration43.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        com.badlogic.gdx.graphics.Color color52 = lwjgl3ApplicationConfiguration43.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color53 = color6.sub(color52);
        com.badlogic.gdx.graphics.Color color55 = color1.lerp(color6, (float) 13260);
        com.badlogic.gdx.graphics.Color color60 = new com.badlogic.gdx.graphics.Color((float) (-918031), (float) 2, (float) 33554176, 2.5243549E-29f);
        color60.a = (-33488131);
        com.badlogic.gdx.graphics.Color color63 = color1.sub(color60);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color60, (-16711681));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color7 and color26", color7.equals(color26) ? color7.hashCode() == color26.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        float float1 = color0.toFloatBits();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str3 = lwjgl3ApplicationConfiguration2.title;
        com.badlogic.gdx.graphics.Color color4 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color4, 16);
        lwjgl3ApplicationConfiguration2.setInitialBackgroundColor(color4);
        com.badlogic.gdx.graphics.Color color12 = color4.sub((float) (-232), (float) (-255), (float) 10L, (float) 1L);
        com.badlogic.gdx.graphics.Color color14 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color20 = color14.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color21 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str22 = color21.toString();
        com.badlogic.gdx.graphics.Color color24 = color14.lerp(color21, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color25 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color25, 16);
        com.badlogic.gdx.graphics.Color color28 = color24.sub(color25);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color25, 1677696502);
        com.badlogic.gdx.graphics.Color color31 = color4.sub(color25);
        com.badlogic.gdx.graphics.Color color32 = color0.add(color25);
        com.badlogic.gdx.graphics.Color color33 = color25.cpy();
        com.badlogic.gdx.graphics.Color color34 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color35 = color34.cpy();
        int int36 = com.badlogic.gdx.graphics.Color.argb8888(color35);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration37 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str38 = lwjgl3ApplicationConfiguration37.title;
        com.badlogic.gdx.graphics.Color color39 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color39, 16);
        lwjgl3ApplicationConfiguration37.setInitialBackgroundColor(color39);
        com.badlogic.gdx.graphics.Color color47 = color39.sub((float) (-232), (float) (-255), (float) 10L, (float) 1L);
        com.badlogic.gdx.graphics.Color color49 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color55 = color49.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color56 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str57 = color56.toString();
        com.badlogic.gdx.graphics.Color color59 = color49.lerp(color56, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color60 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color60, 16);
        com.badlogic.gdx.graphics.Color color63 = color59.sub(color60);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color60, 1677696502);
        com.badlogic.gdx.graphics.Color color66 = color39.sub(color60);
        com.badlogic.gdx.graphics.Color color67 = color35.mul(color60);
        int int68 = com.badlogic.gdx.graphics.Color.rgba4444(color60);
        com.badlogic.gdx.graphics.Color color70 = color60.mul((float) 65290);
        com.badlogic.gdx.graphics.Color color72 = color25.lerp(color60, 0.0f);
        float float73 = color72.b;
        com.badlogic.gdx.graphics.Color color78 = color72.add((-1.6789801E38f), (-8.1830974E37f), 2.3485134E-38f, (float) (-21504));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color78 and color33", color78.equals(color33) ? color78.hashCode() == color33.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color1 = color0.cpy();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color1, 1);
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(color1);
        color1.g = 16777215;
        color1.a = (-8.0750596E37f);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color14 = color9.set((-1.7005811E38f), 0.0f, (-1.0f), 0.0f);
        com.badlogic.gdx.graphics.Color color16 = color14.set((-32768));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color0 and color1", color0.equals(color1) ? color0.hashCode() == color1.hashCode() : true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color3 = color1.mul((float) (-65400));
        float float4 = color1.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration5.gles30ContextMajorVersion = ' ';
        lwjgl3ApplicationConfiguration5.setWindowedMode(1, 10);
        boolean boolean11 = lwjgl3ApplicationConfiguration5.getwindowResizable();
        lwjgl3ApplicationConfiguration5.useGL30 = false;
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color23 = color17.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color24 = color15.mul(color23);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color15, (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color27 = color15.cpy();
        lwjgl3ApplicationConfiguration5.setInitialBackgroundColor(color27);
        color27.g = (-4.2867603E37f);
        com.badlogic.gdx.graphics.Color color32 = color1.lerp(color27, (-1.6996446E38f));
        float float33 = color1.g;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color15 and color27", color15.equals(color27) ? color15.hashCode() == color27.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) 100, 1.0f, (float) 0, (float) (byte) 0);
        java.lang.String str6 = color5.toString();
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color5, 1);
        com.badlogic.gdx.graphics.Color color13 = color5.mul((float) 41903542, (float) (-8672), (float) (-50135050), (float) (-10));
        com.badlogic.gdx.graphics.Color color19 = color13.lerp((float) (-65025), (-0.0f), (float) (-65486), (float) (byte) 10, (float) (-1L));
        color13.b = 652800;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str23 = lwjgl3ApplicationConfiguration22.title;
        lwjgl3ApplicationConfiguration22.windowY = 20188;
        int int26 = lwjgl3ApplicationConfiguration22.getwindowWidth();
        boolean boolean27 = color13.equals((java.lang.Object) int26);
        com.badlogic.gdx.graphics.Color color28 = color13.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color29 = new com.badlogic.gdx.graphics.Color(color28);
        color28.b = (-1.63587354E9f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color28 and color29", color28.equals(color29) ? color28.hashCode() == color29.hashCode() : true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color0);
        int int7 = com.badlogic.gdx.graphics.Color.argb8888(color0);
        com.badlogic.gdx.graphics.Color color13 = color0.lerp((float) (-1611265692), (float) 524288, (float) 6356992, (-1.7013883E38f), 0.30588236f);
        com.badlogic.gdx.graphics.Color color14 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color15 = com.badlogic.gdx.graphics.Color.RED;
        com.badlogic.gdx.graphics.Color color16 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str17 = color16.toString();
        com.badlogic.gdx.graphics.Color color19 = color16.set((-62986));
        com.badlogic.gdx.graphics.Color color20 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str21 = color20.toString();
        com.badlogic.gdx.graphics.Color color23 = color20.set((-62986));
        com.badlogic.gdx.graphics.Color color24 = color19.sub(color23);
        float float25 = color19.r;
        com.badlogic.gdx.graphics.Color color26 = color15.set(color19);
        com.badlogic.gdx.graphics.Color color27 = color14.mul(color19);
        color27.a = (-4.581683E37f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color27 and color15", color27.equals(color15) ? color27.hashCode() == color15.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.GOLDENROD;
        color0.g = 35;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(3);
        color4.a = (byte) 100;
        com.badlogic.gdx.graphics.Color color7 = color4.clamp();
        com.badlogic.gdx.graphics.Color color12 = color7.sub((float) (-14540110), (float) (short) -1, (float) (-14513374), (float) 2);
        com.badlogic.gdx.graphics.Color color13 = color0.add(color12);
        com.badlogic.gdx.graphics.Color color14 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color19 = color14.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color(color14);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(color20);
        int int22 = com.badlogic.gdx.graphics.Color.argb8888(color21);
        int int23 = com.badlogic.gdx.graphics.Color.argb8888(color21);
        com.badlogic.gdx.graphics.Color color25 = color21.set(3);
        com.badlogic.gdx.graphics.Color color26 = color0.sub(color25);
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        boolean boolean29 = color26.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.graphics.Color color34 = color26.sub((float) 0L, (-4.2865007E37f), 2.3509886E-38f, (float) (-8672));
        float float35 = color26.toFloatBits();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType37 = null;
        lwjgl3ApplicationConfiguration36.setpreferencesFileType(fileType37);
        lwjgl3ApplicationConfiguration36.useVsync(false);
        lwjgl3ApplicationConfiguration36.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration36);
        boolean boolean44 = lwjgl3ApplicationConfiguration36.windowDecorated;
        com.badlogic.gdx.graphics.Color color45 = com.badlogic.gdx.graphics.Color.GREEN;
        lwjgl3ApplicationConfiguration36.setInitialBackgroundColor(color45);
        com.badlogic.gdx.graphics.Color color51 = color45.set((-2.231065E33f), (float) (-65486), (float) (-56576), (-1.6482297E38f));
        com.badlogic.gdx.graphics.Color color52 = color26.mul(color51);
        com.badlogic.gdx.graphics.Color color53 = color52.premultiplyAlpha();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration54 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int55 = lwjgl3ApplicationConfiguration54.getaudioDeviceBufferSize();
        boolean boolean56 = lwjgl3ApplicationConfiguration54.windowResizable;
        int int57 = lwjgl3ApplicationConfiguration54.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration54.setvSyncEnabled(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration60 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration54);
        com.badlogic.gdx.graphics.Color color61 = lwjgl3ApplicationConfiguration60.initialBackgroundColor;
        float float62 = color61.toFloatBits();
        com.badlogic.gdx.graphics.Color color63 = new com.badlogic.gdx.graphics.Color(color61);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration64 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode65 = null;
        lwjgl3ApplicationConfiguration64.setFullscreenMode(displayMode65);
        lwjgl3ApplicationConfiguration64.windowX = 100;
        int int69 = lwjgl3ApplicationConfiguration64.g;
        com.badlogic.gdx.Files.FileType fileType70 = lwjgl3ApplicationConfiguration64.getpreferencesFileType();
        boolean boolean71 = lwjgl3ApplicationConfiguration64.windowDecorated;
        com.badlogic.gdx.graphics.Color color72 = lwjgl3ApplicationConfiguration64.initialBackgroundColor;
        int int73 = com.badlogic.gdx.graphics.Color.rgba8888(color72);
        com.badlogic.gdx.graphics.Color color74 = color61.add(color72);
        color74.g = 0.0f;
        com.badlogic.gdx.graphics.Color color78 = color74.set((-11280864));
        com.badlogic.gdx.graphics.Color color84 = color74.lerp((-1.4762738E38f), (float) (-11777024), (float) 67043080, (float) 16, (float) (-405213696));
        com.badlogic.gdx.graphics.Color color85 = color53.set(color84);
        color85.b = 50200831;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color85 and color28", color85.equals(color28) ? color85.hashCode() == color28.hashCode() : true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-62986), (float) 'a', (float) '4', (float) (short) 10);
        com.badlogic.gdx.graphics.Color color9 = color4.set((float) (-256), (float) 3840, (float) ' ', (-1.7013883E38f));
        com.badlogic.gdx.graphics.Color color14 = color4.add(0.0f, (-4.2815675E37f), (-5.4452915E37f), (float) 65024);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(1.5612034E-37f, (float) (-16711680), 2.5243549E-29f, (float) (-1306385665));
        color19.b = 65025;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str23 = lwjgl3ApplicationConfiguration22.title;
        lwjgl3ApplicationConfiguration22.a = (-1);
        boolean boolean26 = lwjgl3ApplicationConfiguration22.vSyncEnabled;
        lwjgl3ApplicationConfiguration22.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color29 = lwjgl3ApplicationConfiguration22.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color(color29);
        com.badlogic.gdx.graphics.Color color31 = new com.badlogic.gdx.graphics.Color(color30);
        com.badlogic.gdx.graphics.Color color32 = color19.sub(color30);
        float float33 = color32.toFloatBits();
        com.badlogic.gdx.graphics.Color color34 = new com.badlogic.gdx.graphics.Color(color32);
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color(color32);
        com.badlogic.gdx.graphics.Color color40 = color35.mul((float) 33488896, (-1.701386E38f), (float) (-146800768), (-1.5862616E29f));
        com.badlogic.gdx.graphics.Color color41 = color4.mul(color40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color41 and color40", color41.equals(color40) ? color41.hashCode() == color40.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color3 = color2.cpy();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color3, 1);
        int int6 = color3.toIntBits();
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color10 = color8.set(color9);
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color(color8);
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color13 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color18 = color13.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(color13);
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color(color19);
        com.badlogic.gdx.graphics.Color color21 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color26 = color21.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color34 = color28.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color35 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str36 = color35.toString();
        com.badlogic.gdx.graphics.Color color38 = color28.lerp(color35, (-8.0750596E37f));
        boolean boolean39 = color21.equals((java.lang.Object) color28);
        com.badlogic.gdx.graphics.Color color40 = color20.add(color21);
        com.badlogic.gdx.graphics.Color color42 = color12.lerp(color20, (float) (-14540110));
        com.badlogic.gdx.graphics.Color color43 = new com.badlogic.gdx.graphics.Color(color12);
        com.badlogic.gdx.graphics.Color color44 = color8.sub(color12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration45 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration45.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        com.badlogic.gdx.graphics.Color color54 = lwjgl3ApplicationConfiguration45.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color55 = color8.sub(color54);
        com.badlogic.gdx.graphics.Color color57 = color3.lerp(color8, (float) 13260);
        com.badlogic.gdx.graphics.Color color58 = color1.set(color57);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color58, 1044480);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color12 and color54", color12.equals(color54) ? color12.hashCode() == color54.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color3 = color1.mul((float) 1671296512);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(1.5612034E-37f, (float) (-16711680), 2.5243549E-29f, (float) (-1306385665));
        color8.b = 65025;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str12 = lwjgl3ApplicationConfiguration11.title;
        lwjgl3ApplicationConfiguration11.a = (-1);
        boolean boolean15 = lwjgl3ApplicationConfiguration11.vSyncEnabled;
        lwjgl3ApplicationConfiguration11.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color18 = lwjgl3ApplicationConfiguration11.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(color18);
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color(color19);
        com.badlogic.gdx.graphics.Color color21 = color8.sub(color19);
        float float22 = color21.toFloatBits();
        com.badlogic.gdx.graphics.Color color23 = color1.add(color21);
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color(color23);
        com.badlogic.gdx.graphics.Color color29 = color23.set((float) (-16844545), (-8.089319E30f), (float) (-1109610), (float) (-14540110));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color29 and color18", color29.equals(color18) ? color29.hashCode() == color18.hashCode() : true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color1 = color0.cpy();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color1, 1);
        int int4 = color1.toIntBits();
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color7 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color8 = color6.set(color7);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color11 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color16 = color11.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(color11);
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(color17);
        com.badlogic.gdx.graphics.Color color19 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color24 = color19.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color32 = color26.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color33 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str34 = color33.toString();
        com.badlogic.gdx.graphics.Color color36 = color26.lerp(color33, (-8.0750596E37f));
        boolean boolean37 = color19.equals((java.lang.Object) color26);
        com.badlogic.gdx.graphics.Color color38 = color18.add(color19);
        com.badlogic.gdx.graphics.Color color40 = color10.lerp(color18, (float) (-14540110));
        com.badlogic.gdx.graphics.Color color41 = new com.badlogic.gdx.graphics.Color(color10);
        com.badlogic.gdx.graphics.Color color42 = color6.sub(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration43.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        com.badlogic.gdx.graphics.Color color52 = lwjgl3ApplicationConfiguration43.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color53 = color6.sub(color52);
        com.badlogic.gdx.graphics.Color color55 = color1.lerp(color6, (float) 13260);
        com.badlogic.gdx.graphics.Color color60 = new com.badlogic.gdx.graphics.Color((float) (-918031), (float) 2, (float) 33554176, 2.5243549E-29f);
        color60.a = (-33488131);
        com.badlogic.gdx.graphics.Color color63 = color1.sub(color60);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color63, (-57400));
        com.badlogic.gdx.graphics.Color color70 = new com.badlogic.gdx.graphics.Color((-1.4936944E38f), 2.3418052E-38f, (float) ' ', (float) 65535);
        com.badlogic.gdx.graphics.Color color71 = new com.badlogic.gdx.graphics.Color(color70);
        com.badlogic.gdx.graphics.Color color72 = new com.badlogic.gdx.graphics.Color(color71);
        com.badlogic.gdx.graphics.Color color73 = color63.add(color71);
        com.badlogic.gdx.graphics.Color color79 = color63.lerp((float) 65295, (float) 51, (float) (-1363456), (float) (byte) 0, (float) (-1088));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color79 and color70", color79.equals(color70) ? color79.hashCode() == color70.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color1 = color0.cpy();
        int int2 = com.badlogic.gdx.graphics.Color.argb8888(color1);
        com.badlogic.gdx.graphics.Color color3 = com.badlogic.gdx.graphics.Color.FOREST;
        int int4 = com.badlogic.gdx.graphics.Color.argb8888(color3);
        com.badlogic.gdx.graphics.Color color6 = color1.lerp(color3, (float) (-50396672));
        int int7 = com.badlogic.gdx.graphics.Color.argb8888(color6);
        float float8 = color6.r;
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color14 = color9.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color16 = color9.mul((-5.9417005E37f));
        com.badlogic.gdx.graphics.Color color21 = color9.add((float) 3276808, (float) (-579592), 0.0f, (float) 2047);
        com.badlogic.gdx.graphics.Color color23 = color6.lerp(color9, (float) (-1611265692));
        com.badlogic.gdx.graphics.Color color24 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color29 = color24.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color(color24);
        int int31 = com.badlogic.gdx.graphics.Color.argb8888(color24);
        int int32 = color24.toIntBits();
        com.badlogic.gdx.graphics.Color color33 = color24.cpy();
        com.badlogic.gdx.graphics.Color color34 = new com.badlogic.gdx.graphics.Color(color33);
        com.badlogic.gdx.graphics.Color color35 = color23.sub(color34);
        color35.a = (-1.6955932E38f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color35 and color3", color35.equals(color3) ? color35.hashCode() == color3.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-262646));
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (-256), (-1306385665), (-1879860224), 43268, 512, (-1611265692));
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 167247232;
        com.badlogic.gdx.graphics.Color color19 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color24 = color19.mul((float) 1, (float) (-240), 2.3418409E-38f, (float) 100);
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color(color24);
        color24.g = (-1.7014086E38f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color24 and color25", color24.equals(color25) ? color24.hashCode() == color25.hashCode() : true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color0, (-256));
        com.badlogic.gdx.graphics.Color color3 = com.badlogic.gdx.graphics.Color.FOREST;
        int int4 = com.badlogic.gdx.graphics.Color.argb8888(color3);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int6 = lwjgl3ApplicationConfiguration5.getaudioDeviceBufferSize();
        boolean boolean7 = lwjgl3ApplicationConfiguration5.windowResizable;
        lwjgl3ApplicationConfiguration5.depth = (short) 10;
        lwjgl3ApplicationConfiguration5.title = "4169e1ff";
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color21 = color15.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color22 = color13.mul(color21);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color13, (int) (byte) 0);
        lwjgl3ApplicationConfiguration5.initialBackgroundColor = color13;
        com.badlogic.gdx.graphics.Color color26 = color3.set(color13);
        com.badlogic.gdx.graphics.Color color27 = color0.add(color3);
        com.badlogic.gdx.graphics.Color color29 = color0.set((-1980237824));
        com.badlogic.gdx.graphics.Color color30 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color35 = color30.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color(color30);
        int int37 = com.badlogic.gdx.graphics.Color.argb8888(color30);
        color30.r = 3855;
        com.badlogic.gdx.graphics.Color color41 = color29.lerp(color30, (float) (-2143297280));
        int int42 = com.badlogic.gdx.graphics.Color.rgb888(color41);
        color41.a = (-1.5822227E38f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color41 and color3", color41.equals(color3) ? color41.hashCode() == color3.hashCode() : true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.GOLDENROD;
        color0.g = 35;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(3);
        color4.a = (byte) 100;
        com.badlogic.gdx.graphics.Color color7 = color4.clamp();
        com.badlogic.gdx.graphics.Color color12 = color7.sub((float) (-14540110), (float) (short) -1, (float) (-14513374), (float) 2);
        com.badlogic.gdx.graphics.Color color13 = color0.add(color12);
        com.badlogic.gdx.graphics.Color color14 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color19 = color14.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color(color14);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(color20);
        int int22 = com.badlogic.gdx.graphics.Color.argb8888(color21);
        int int23 = com.badlogic.gdx.graphics.Color.argb8888(color21);
        com.badlogic.gdx.graphics.Color color25 = color21.set(3);
        com.badlogic.gdx.graphics.Color color26 = color0.sub(color25);
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(color26);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color27, (-2147283968));
        com.badlogic.gdx.graphics.Color color31 = new com.badlogic.gdx.graphics.Color((int) (byte) -1);
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color((float) 6356992, (float) 16, (float) (-65024), (float) 2016);
        com.badlogic.gdx.graphics.Color color38 = color31.lerp(color36, (-5.68232E37f));
        com.badlogic.gdx.graphics.Color color39 = new com.badlogic.gdx.graphics.Color(color36);
        com.badlogic.gdx.graphics.Color color40 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color45 = color40.add((float) 100, 1.0f, (float) 0, (float) (byte) 0);
        java.lang.String str46 = color45.toString();
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color45, 1);
        com.badlogic.gdx.graphics.Color color53 = color45.mul((float) 41903542, (float) (-8672), (float) (-50135050), (float) (-10));
        com.badlogic.gdx.graphics.Color color59 = color53.lerp((float) (-65025), (-0.0f), (float) (-65486), (float) (byte) 10, (float) (-1L));
        color53.b = 652800;
        boolean boolean62 = color36.equals((java.lang.Object) 652800);
        com.badlogic.gdx.graphics.Color color63 = color27.add(color36);
        com.badlogic.gdx.graphics.Color color68 = color63.set((-3.031089E36f), (float) (-16777200), (float) 11, (float) (-234885152));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color0 and color14", color0.equals(color14) ? color0.hashCode() == color14.hashCode() : true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color0, (int) 'a');
        com.badlogic.gdx.graphics.Color color3 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        com.badlogic.gdx.graphics.Color color5 = color0.lerp(color3, (float) (short) 0);
        com.badlogic.gdx.graphics.Color color6 = color3.clamp();
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color7, (-59160));
        com.badlogic.gdx.graphics.Color color14 = color7.sub(0.057594743f, (float) (byte) 100, (float) 1677696502, (float) (-240));
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(1.5612034E-37f, (float) (-16711680), 2.5243549E-29f, (float) (-1306385665));
        color19.b = 65025;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str23 = lwjgl3ApplicationConfiguration22.title;
        lwjgl3ApplicationConfiguration22.a = (-1);
        boolean boolean26 = lwjgl3ApplicationConfiguration22.vSyncEnabled;
        lwjgl3ApplicationConfiguration22.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color29 = lwjgl3ApplicationConfiguration22.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color(color29);
        com.badlogic.gdx.graphics.Color color31 = new com.badlogic.gdx.graphics.Color(color30);
        com.badlogic.gdx.graphics.Color color32 = color19.sub(color30);
        float float33 = color32.toFloatBits();
        com.badlogic.gdx.graphics.Color color34 = new com.badlogic.gdx.graphics.Color(color32);
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color(color32);
        com.badlogic.gdx.graphics.Color color40 = color35.mul((float) 33488896, (-1.701386E38f), (float) (-146800768), (-1.5862616E29f));
        com.badlogic.gdx.graphics.Color color42 = color14.lerp(color35, (float) (-16776961));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int44 = lwjgl3ApplicationConfiguration43.getaudioDeviceBufferSize();
        boolean boolean45 = lwjgl3ApplicationConfiguration43.windowResizable;
        lwjgl3ApplicationConfiguration43.disableAudio = false;
        lwjgl3ApplicationConfiguration43.setwindowHeight((int) (byte) 10);
        com.badlogic.gdx.graphics.Color color51 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color52 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color57 = color52.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color58 = color51.sub(color57);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color51, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color65 = color51.set(1.561203E-39f, (float) 2, (float) (byte) -1, (float) 3);
        lwjgl3ApplicationConfiguration43.setInitialBackgroundColor(color65);
        lwjgl3ApplicationConfiguration43.setwindowX(97);
        com.badlogic.gdx.graphics.Color color69 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color color70 = new com.badlogic.gdx.graphics.Color(color69);
        com.badlogic.gdx.graphics.Color color71 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str72 = color71.toString();
        com.badlogic.gdx.graphics.Color color74 = color71.set((-62986));
        com.badlogic.gdx.graphics.Color color75 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str76 = color75.toString();
        com.badlogic.gdx.graphics.Color color78 = color75.set((-62986));
        com.badlogic.gdx.graphics.Color color79 = color74.sub(color78);
        com.badlogic.gdx.graphics.Color color80 = color69.add(color78);
        lwjgl3ApplicationConfiguration43.setInitialBackgroundColor(color78);
        com.badlogic.gdx.graphics.Color color82 = lwjgl3ApplicationConfiguration43.initialBackgroundColor;
        java.lang.String str83 = color82.toString();
        int int84 = com.badlogic.gdx.graphics.Color.argb8888(color82);
        com.badlogic.gdx.graphics.Color color85 = color42.set(color82);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color85 and color35", color85.equals(color35) ? color85.hashCode() == color35.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color9 = color3.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color10 = color1.mul(color9);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color18 = color12.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        color18.g = (short) 1;
        com.badlogic.gdx.graphics.Color color22 = color10.lerp(color18, (float) 25500);
        com.badlogic.gdx.graphics.Color color23 = new com.badlogic.gdx.graphics.Color(color10);
        int int24 = com.badlogic.gdx.graphics.Color.rgba4444(color23);
        int int25 = com.badlogic.gdx.graphics.Color.rgba4444(color23);
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color(1.5612034E-37f, (float) (-16711680), 2.5243549E-29f, (float) (-1306385665));
        com.badlogic.gdx.graphics.Color color31 = new com.badlogic.gdx.graphics.Color(color30);
        com.badlogic.gdx.graphics.Color color33 = color23.lerp(color31, (float) 20160);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color31, (-8407040));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color23 and color30", color23.equals(color30) ? color23.hashCode() == color30.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color2 = color0.mul(color1);
        color0.g = 6147990;
        com.badlogic.gdx.graphics.Color color5 = color0.clamp();
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color((-4.2867603E37f), 9.18893E-39f, (float) 1794115036, (float) (-10));
        com.badlogic.gdx.graphics.Color color11 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color16 = color11.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color21 = color16.mul((-1.0f), (float) 1677696502, (float) 65024, (float) (short) 1);
        com.badlogic.gdx.graphics.Color color22 = color10.sub(color21);
        com.badlogic.gdx.graphics.Color color23 = color5.mul(color22);
        color23.a = 65024;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color23 and color10", color23.equals(color10) ? color23.hashCode() == color10.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color(1878880718);
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(color3);
        color4.g = 16648950;
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color color8 = color1.set(color7);
        color8.a = (-1.00817643E31f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color8 and color4", color8.equals(color4) ? color8.hashCode() == color4.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color0, (int) 'a');
        com.badlogic.gdx.graphics.Color color3 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        com.badlogic.gdx.graphics.Color color5 = color0.lerp(color3, (float) (short) 0);
        com.badlogic.gdx.graphics.Color color6 = color3.clamp();
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color7, (-59160));
        com.badlogic.gdx.graphics.Color color14 = color7.sub(0.057594743f, (float) (byte) 100, (float) 1677696502, (float) (-240));
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(1.5612034E-37f, (float) (-16711680), 2.5243549E-29f, (float) (-1306385665));
        color19.b = 65025;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str23 = lwjgl3ApplicationConfiguration22.title;
        lwjgl3ApplicationConfiguration22.a = (-1);
        boolean boolean26 = lwjgl3ApplicationConfiguration22.vSyncEnabled;
        lwjgl3ApplicationConfiguration22.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color29 = lwjgl3ApplicationConfiguration22.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color(color29);
        com.badlogic.gdx.graphics.Color color31 = new com.badlogic.gdx.graphics.Color(color30);
        com.badlogic.gdx.graphics.Color color32 = color19.sub(color30);
        float float33 = color32.toFloatBits();
        com.badlogic.gdx.graphics.Color color34 = new com.badlogic.gdx.graphics.Color(color32);
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color(color32);
        com.badlogic.gdx.graphics.Color color40 = color35.mul((float) 33488896, (-1.701386E38f), (float) (-146800768), (-1.5862616E29f));
        com.badlogic.gdx.graphics.Color color42 = color14.lerp(color35, (float) (-16776961));
        color42.r = 2147483647;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color3 and color35", color3.equals(color35) ? color3.hashCode() == color35.hashCode() : true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(100);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(1.5612034E-37f, (float) (-16711680), 2.5243549E-29f, (float) (-1306385665));
        color6.b = 65025;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str10 = lwjgl3ApplicationConfiguration9.title;
        lwjgl3ApplicationConfiguration9.a = (-1);
        boolean boolean13 = lwjgl3ApplicationConfiguration9.vSyncEnabled;
        lwjgl3ApplicationConfiguration9.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color16 = lwjgl3ApplicationConfiguration9.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(color16);
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(color17);
        com.badlogic.gdx.graphics.Color color19 = color6.sub(color17);
        float float20 = color19.toFloatBits();
        com.badlogic.gdx.graphics.Color color22 = color1.lerp(color19, (float) (-510));
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(0.06666667f, (float) (-8160), (float) 16776961, (float) (-383778816));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3ApplicationConfiguration28.setFullscreenMode(displayMode29);
        com.badlogic.gdx.Files.FileType fileType31 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration28.setpreferencesFileType(fileType31);
        lwjgl3ApplicationConfiguration28.disableAudio(true);
        lwjgl3ApplicationConfiguration28.setAudioConfig((-1), (-524869), 587162524);
        com.badlogic.gdx.graphics.Color color39 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color39, (int) 'a');
        com.badlogic.gdx.graphics.Color color42 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        com.badlogic.gdx.graphics.Color color44 = color39.lerp(color42, (float) (short) 0);
        com.badlogic.gdx.graphics.Color color45 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str46 = color45.toString();
        com.badlogic.gdx.graphics.Color color47 = color42.sub(color45);
        com.badlogic.gdx.graphics.Color color48 = new com.badlogic.gdx.graphics.Color(color47);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color47, (-1880097264));
        lwjgl3ApplicationConfiguration28.setInitialBackgroundColor(color47);
        boolean boolean52 = color27.equals((java.lang.Object) color47);
        com.badlogic.gdx.graphics.Color color57 = color47.sub((float) (-1644167168), (float) (-524536), (float) (-16777215), (float) (-10420224));
        com.badlogic.gdx.graphics.Color color58 = color22.set(color47);
        color47.r = 16703520;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color1 and color47", color1.equals(color47) ? color1.hashCode() == color47.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color3 = color1.set(color2);
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color11 = color6.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(color12);
        com.badlogic.gdx.graphics.Color color14 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color19 = color14.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color27 = color21.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color28 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str29 = color28.toString();
        com.badlogic.gdx.graphics.Color color31 = color21.lerp(color28, (-8.0750596E37f));
        boolean boolean32 = color14.equals((java.lang.Object) color21);
        com.badlogic.gdx.graphics.Color color33 = color13.add(color14);
        com.badlogic.gdx.graphics.Color color35 = color5.lerp(color13, (float) (-14540110));
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color(color5);
        com.badlogic.gdx.graphics.Color color37 = color1.sub(color5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration38.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        com.badlogic.gdx.graphics.Color color47 = lwjgl3ApplicationConfiguration38.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color48 = color1.sub(color47);
        com.badlogic.gdx.graphics.Color color49 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color49, 16);
        float float52 = color49.toFloatBits();
        com.badlogic.gdx.graphics.Color color54 = color47.lerp(color49, 2.4259024E-18f);
        com.badlogic.gdx.graphics.Color color59 = color54.set(7.175E-43f, (float) (-940), (float) (-68060), (float) (-115213));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color5 and color59", color5.equals(color59) ? color5.hashCode() == color59.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setdepth((int) (byte) 1);
        com.badlogic.gdx.Files.FileType fileType3 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color7 = color5.set(color6);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color5);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color15 = color10.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color10);
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(color16);
        com.badlogic.gdx.graphics.Color color18 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color23 = color18.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color31 = color25.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color32 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str33 = color32.toString();
        com.badlogic.gdx.graphics.Color color35 = color25.lerp(color32, (-8.0750596E37f));
        boolean boolean36 = color18.equals((java.lang.Object) color25);
        com.badlogic.gdx.graphics.Color color37 = color17.add(color18);
        com.badlogic.gdx.graphics.Color color39 = color9.lerp(color17, (float) (-14540110));
        com.badlogic.gdx.graphics.Color color40 = new com.badlogic.gdx.graphics.Color(color9);
        com.badlogic.gdx.graphics.Color color41 = color5.sub(color9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration42 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration42.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        com.badlogic.gdx.graphics.Color color51 = lwjgl3ApplicationConfiguration42.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color52 = color5.sub(color51);
        com.badlogic.gdx.graphics.Color color57 = color5.sub(0.0f, (float) 6147990, (float) 2147483647, 0.0f);
        com.badlogic.gdx.graphics.Color color58 = color5.clamp();
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color58);
        int int60 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.setwindowY(16580354);
        int int63 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean64 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        lwjgl3ApplicationConfiguration0.b = 1794115036;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color9 and color51", color9.equals(color51) ? color9.hashCode() == color51.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.stencil;
        int int6 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.a = 43268;
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getwindowX();
        com.badlogic.gdx.graphics.Color color11 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        color11.a = 35;
        com.badlogic.gdx.graphics.Color color14 = new com.badlogic.gdx.graphics.Color(color11);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(color11);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color11);
        float float17 = color16.r;
        com.badlogic.gdx.graphics.Color color18 = color16.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color20 = color18.mul((float) (-2140995584));
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color30 = color24.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color31 = color22.mul(color30);
        com.badlogic.gdx.graphics.Color color33 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        float float34 = color33.a;
        com.badlogic.gdx.graphics.Color color39 = color33.mul((float) 8, (float) 1677696502, (float) 0L, (float) 43268);
        com.badlogic.gdx.graphics.Color color40 = color22.add(color39);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color39, 100);
        com.badlogic.gdx.graphics.Color color43 = com.badlogic.gdx.graphics.Color.SCARLET;
        color43.b = '#';
        com.badlogic.gdx.graphics.Color color46 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color color48 = color43.lerp(color46, (float) 1L);
        com.badlogic.gdx.graphics.Color color49 = com.badlogic.gdx.graphics.Color.SALMON;
        float float50 = color49.toFloatBits();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration51 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str52 = lwjgl3ApplicationConfiguration51.title;
        com.badlogic.gdx.graphics.Color color53 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color53, 16);
        lwjgl3ApplicationConfiguration51.setInitialBackgroundColor(color53);
        com.badlogic.gdx.graphics.Color color61 = color53.sub((float) (-232), (float) (-255), (float) 10L, (float) 1L);
        com.badlogic.gdx.graphics.Color color63 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color69 = color63.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color70 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str71 = color70.toString();
        com.badlogic.gdx.graphics.Color color73 = color63.lerp(color70, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color74 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color74, 16);
        com.badlogic.gdx.graphics.Color color77 = color73.sub(color74);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color74, 1677696502);
        com.badlogic.gdx.graphics.Color color80 = color53.sub(color74);
        com.badlogic.gdx.graphics.Color color81 = color49.add(color74);
        com.badlogic.gdx.graphics.Color color83 = color46.lerp(color74, (float) (short) 1);
        com.badlogic.gdx.graphics.Color color84 = color46.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color86 = color39.lerp(color46, 0.95686275f);
        com.badlogic.gdx.graphics.Color color88 = color20.lerp(color86, 1.6768546E7f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color11 and color22", color11.equals(color22) ? color11.hashCode() == color22.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color0);
        int int7 = com.badlogic.gdx.graphics.Color.argb8888(color0);
        com.badlogic.gdx.graphics.Color color9 = color0.mul((float) (-262646));
        com.badlogic.gdx.graphics.Color color11 = color9.mul((float) (-56576));
        com.badlogic.gdx.graphics.Color color16 = color11.set((-1.7013859E38f), (-1.6482297E38f), (-4.581683E37f), 9.18893E-39f);
        com.badlogic.gdx.graphics.Color color17 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color18 = color17.cpy();
        com.badlogic.gdx.graphics.Color color19 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color20 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color25 = color20.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color(color20);
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(color26);
        com.badlogic.gdx.graphics.Color color28 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color33 = color28.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color41 = color35.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color42 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str43 = color42.toString();
        com.badlogic.gdx.graphics.Color color45 = color35.lerp(color42, (-8.0750596E37f));
        boolean boolean46 = color28.equals((java.lang.Object) color35);
        com.badlogic.gdx.graphics.Color color47 = color27.add(color28);
        com.badlogic.gdx.graphics.Color color49 = color19.lerp(color27, (float) (-14540110));
        int int50 = com.badlogic.gdx.graphics.Color.rgb565(color19);
        com.badlogic.gdx.graphics.Color color55 = color19.mul((float) (byte) 0, (float) (byte) 100, (float) 35, (float) (-255));
        com.badlogic.gdx.graphics.Color color56 = new com.badlogic.gdx.graphics.Color(color19);
        com.badlogic.gdx.graphics.Color color57 = color17.sub(color56);
        com.badlogic.gdx.graphics.Color color59 = new com.badlogic.gdx.graphics.Color((-66048));
        float float60 = color59.g;
        com.badlogic.gdx.graphics.Color color62 = color57.lerp(color59, (float) 61450);
        com.badlogic.gdx.graphics.Color color64 = color11.lerp(color62, (-1.6973618E38f));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color6 and color26", color6.equals(color26) ? color6.hashCode() == color26.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SCARLET;
        color0.b = '#';
        com.badlogic.gdx.graphics.Color color3 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color color5 = color0.lerp(color3, (float) 1L);
        color3.g = (byte) 10;
        float float8 = color3.b;
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color(251658239);
        com.badlogic.gdx.graphics.Color color12 = color3.lerp(color10, (float) (-2176));
        float float13 = color12.b;
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color((-4.2826227E37f), (float) (-2140995584), (-1.7011782E38f), 9.1837E-41f);
        com.badlogic.gdx.graphics.Color color20 = color12.lerp(color18, (float) 268493567);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color0 and color20", color0.equals(color20) ? color0.hashCode() == color20.hashCode() : true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color7 = color2.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color8 = color1.sub(color7);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color1, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color color14 = color12.mul((float) (-14513374));
        com.badlogic.gdx.graphics.Color color15 = color11.set(color12);
        com.badlogic.gdx.graphics.Color color16 = color12.cpy();
        com.badlogic.gdx.graphics.Color color17 = com.badlogic.gdx.graphics.Color.VIOLET;
        com.badlogic.gdx.graphics.Color color23 = color17.lerp((float) (byte) 100, (float) 8, (float) 10, (float) 9, (float) (-1611265692));
        com.badlogic.gdx.graphics.Color color24 = color12.mul(color23);
        color23.a = (-12775665);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color11 and color23", color11.equals(color23) ? color11.hashCode() == color23.hashCode() : true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        int int8 = lwjgl3ApplicationConfiguration0.stencil;
        int int9 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration0.stencil = (byte) 0;
        lwjgl3ApplicationConfiguration0.setWindowedMode(16, (-78));
        int int15 = lwjgl3ApplicationConfiguration0.getwindowX();
        int int16 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.setsamples((-1984));
        int int19 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color22 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color27 = color22.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color28 = color21.sub(color27);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color21, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color31 = new com.badlogic.gdx.graphics.Color(color21);
        com.badlogic.gdx.graphics.Color color32 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color color34 = color32.mul((float) (-14513374));
        com.badlogic.gdx.graphics.Color color35 = color31.set(color32);
        com.badlogic.gdx.graphics.Color color36 = color32.cpy();
        com.badlogic.gdx.graphics.Color color37 = com.badlogic.gdx.graphics.Color.VIOLET;
        com.badlogic.gdx.graphics.Color color43 = color37.lerp((float) (byte) 100, (float) 8, (float) 10, (float) 9, (float) (-1611265692));
        com.badlogic.gdx.graphics.Color color44 = color32.mul(color43);
        com.badlogic.gdx.graphics.Color color45 = color43.premultiplyAlpha();
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color45;
        com.badlogic.gdx.graphics.Color color51 = color45.set(0.001822412f, (float) 62730, (float) (-201584640), (float) (-33488896));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color22 and color51", color22.equals(color51) ? color22.hashCode() == color51.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-8414));
        float float2 = color1.toFloatBits();
        com.badlogic.gdx.graphics.Color color3 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str4 = color3.toString();
        color3.g = 16711935;
        com.badlogic.gdx.graphics.Color color7 = color3.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color3);
        com.badlogic.gdx.graphics.Color color9 = color1.set(color3);
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color11 = color10.cpy();
        int int12 = com.badlogic.gdx.graphics.Color.argb8888(color11);
        com.badlogic.gdx.graphics.Color color13 = com.badlogic.gdx.graphics.Color.FOREST;
        int int14 = com.badlogic.gdx.graphics.Color.argb8888(color13);
        com.badlogic.gdx.graphics.Color color16 = color11.lerp(color13, (float) (-50396672));
        int int17 = com.badlogic.gdx.graphics.Color.argb8888(color16);
        com.badlogic.gdx.graphics.Color color18 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color19 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color24 = color19.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color(color19);
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color(color25);
        com.badlogic.gdx.graphics.Color color27 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color32 = color27.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color34 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color40 = color34.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color41 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str42 = color41.toString();
        com.badlogic.gdx.graphics.Color color44 = color34.lerp(color41, (-8.0750596E37f));
        boolean boolean45 = color27.equals((java.lang.Object) color34);
        com.badlogic.gdx.graphics.Color color46 = color26.add(color27);
        com.badlogic.gdx.graphics.Color color48 = color18.lerp(color26, (float) (-14540110));
        int int49 = com.badlogic.gdx.graphics.Color.rgb565(color18);
        com.badlogic.gdx.graphics.Color color50 = color16.sub(color18);
        color16.r = (-240);
        color16.a = (-248);
        com.badlogic.gdx.graphics.Color color55 = new com.badlogic.gdx.graphics.Color(color16);
        com.badlogic.gdx.graphics.Color color56 = color1.add(color16);
        com.badlogic.gdx.graphics.Color color61 = new com.badlogic.gdx.graphics.Color((float) 10L, (float) 1, (float) 0, (float) (short) -1);
        color61.b = (-1241513983);
        com.badlogic.gdx.graphics.Color color64 = new com.badlogic.gdx.graphics.Color(color61);
        int int65 = color64.toIntBits();
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color64, 13090);
        com.badlogic.gdx.graphics.Color color73 = color64.lerp((float) (-146800768), (float) (-1291845888), (float) (-16777199), (float) 394264576, (float) 587202559);
        color64.b = 0.001822412f;
        com.badlogic.gdx.graphics.Color color76 = color56.mul(color64);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color76 and color8", color76.equals(color8) ? color76.hashCode() == color8.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BLACK;
        float float1 = color0.r;
        com.badlogic.gdx.graphics.Color color6 = color0.set((-8.0750596E37f), 0.0f, (float) (-1L), (float) 65024);
        com.badlogic.gdx.graphics.Color color11 = color0.set(0.0f, (float) 480, (float) 1677786624, (float) 480);
        com.badlogic.gdx.graphics.Color color16 = color0.set((-1.6415966E38f), (-1.6947138E38f), (float) 1, 2.2407642E-38f);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(1.5612034E-37f, (float) (-16711680), 2.5243549E-29f, (float) (-1306385665));
        color21.b = 65025;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str25 = lwjgl3ApplicationConfiguration24.title;
        lwjgl3ApplicationConfiguration24.a = (-1);
        boolean boolean28 = lwjgl3ApplicationConfiguration24.vSyncEnabled;
        lwjgl3ApplicationConfiguration24.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color31 = lwjgl3ApplicationConfiguration24.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color32 = new com.badlogic.gdx.graphics.Color(color31);
        com.badlogic.gdx.graphics.Color color33 = new com.badlogic.gdx.graphics.Color(color32);
        com.badlogic.gdx.graphics.Color color34 = color21.sub(color32);
        com.badlogic.gdx.graphics.Color color36 = color32.mul((float) (-13500161));
        com.badlogic.gdx.graphics.Color color37 = color16.add(color36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color37 and color21", color37.equals(color21) ? color37.hashCode() == color21.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color7 = color1.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str9 = color8.toString();
        com.badlogic.gdx.graphics.Color color11 = color1.lerp(color8, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color12, 16);
        com.badlogic.gdx.graphics.Color color15 = color11.sub(color12);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color12, 1677696502);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color12, 480);
        com.badlogic.gdx.graphics.Color color20 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color25 = color20.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color(color20);
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(color26);
        com.badlogic.gdx.graphics.Color color28 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color33 = color28.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color41 = color35.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color42 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str43 = color42.toString();
        com.badlogic.gdx.graphics.Color color45 = color35.lerp(color42, (-8.0750596E37f));
        boolean boolean46 = color28.equals((java.lang.Object) color35);
        com.badlogic.gdx.graphics.Color color47 = color27.add(color28);
        com.badlogic.gdx.graphics.Color color48 = color12.set(color27);
        com.badlogic.gdx.graphics.Color color53 = color12.set(10.0f, (float) (-1562574848), (float) 640, (float) 'a');
        int int54 = com.badlogic.gdx.graphics.Color.rgb888(color53);
        color53.a = (-1143197184);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color53 and color35", color53.equals(color35) ? color53.hashCode() == color35.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.graphics.Color color7 = lwjgl3ApplicationConfiguration6.initialBackgroundColor;
        float float8 = color7.toFloatBits();
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration10.setFullscreenMode(displayMode11);
        lwjgl3ApplicationConfiguration10.windowX = 100;
        int int15 = lwjgl3ApplicationConfiguration10.g;
        com.badlogic.gdx.Files.FileType fileType16 = lwjgl3ApplicationConfiguration10.getpreferencesFileType();
        boolean boolean17 = lwjgl3ApplicationConfiguration10.windowDecorated;
        com.badlogic.gdx.graphics.Color color18 = lwjgl3ApplicationConfiguration10.initialBackgroundColor;
        int int19 = com.badlogic.gdx.graphics.Color.rgba8888(color18);
        com.badlogic.gdx.graphics.Color color20 = color7.add(color18);
        com.badlogic.gdx.graphics.Color color26 = color18.lerp((float) 33488896, (-1.6951551E38f), (float) (-56576), (float) (-283184896), (float) 32);
        int int27 = com.badlogic.gdx.graphics.Color.rgba4444(color26);
        int int28 = com.badlogic.gdx.graphics.Color.rgba8888(color26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color26 and color9", color26.equals(color9) ? color26.hashCode() == color9.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color6 = color1.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color7);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color14 = color9.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color22 = color16.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color23 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str24 = color23.toString();
        com.badlogic.gdx.graphics.Color color26 = color16.lerp(color23, (-8.0750596E37f));
        boolean boolean27 = color9.equals((java.lang.Object) color16);
        com.badlogic.gdx.graphics.Color color28 = color8.add(color9);
        com.badlogic.gdx.graphics.Color color30 = color0.lerp(color8, (float) (-14540110));
        com.badlogic.gdx.graphics.Color color31 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color32 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color37 = color32.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        float float38 = color32.r;
        com.badlogic.gdx.graphics.Color color40 = color0.lerp(color32, (float) 0);
        color40.a = (-1.6981407E38f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color40 and color31", color40.equals(color31) ? color40.hashCode() == color31.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color1 = color0.cpy();
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color3 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color8 = color3.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color3);
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color(color9);
        com.badlogic.gdx.graphics.Color color11 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color16 = color11.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color24 = color18.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color25 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str26 = color25.toString();
        com.badlogic.gdx.graphics.Color color28 = color18.lerp(color25, (-8.0750596E37f));
        boolean boolean29 = color11.equals((java.lang.Object) color18);
        com.badlogic.gdx.graphics.Color color30 = color10.add(color11);
        com.badlogic.gdx.graphics.Color color32 = color2.lerp(color10, (float) (-14540110));
        int int33 = com.badlogic.gdx.graphics.Color.rgb565(color2);
        com.badlogic.gdx.graphics.Color color38 = color2.mul((float) (byte) 0, (float) (byte) 100, (float) 35, (float) (-255));
        com.badlogic.gdx.graphics.Color color39 = new com.badlogic.gdx.graphics.Color(color2);
        com.badlogic.gdx.graphics.Color color40 = color0.sub(color39);
        com.badlogic.gdx.graphics.Color color41 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color42 = new com.badlogic.gdx.graphics.Color(color0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color1 and color3", color1.equals(color3) ? color1.hashCode() == color3.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) 100, 1.0f, (float) 0, (float) (byte) 0);
        color0.g = 151015132;
        com.badlogic.gdx.graphics.Color color12 = color0.sub((float) 10L, (float) 480, (float) (-1611265692), (float) (-8672));
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(3);
        color15.a = (byte) 100;
        int int18 = com.badlogic.gdx.graphics.Color.rgb888(color15);
        color15.b = 50200831;
        com.badlogic.gdx.graphics.Color color21 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color26 = color21.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(color21);
        int int28 = com.badlogic.gdx.graphics.Color.argb8888(color21);
        com.badlogic.gdx.graphics.Color color30 = color21.mul((float) (-262646));
        com.badlogic.gdx.graphics.Color color32 = color30.mul((float) (-56576));
        com.badlogic.gdx.graphics.Color color33 = color15.mul(color32);
        com.badlogic.gdx.graphics.Color color35 = color15.mul((float) 33423457);
        com.badlogic.gdx.graphics.Color color36 = color0.add(color15);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration37 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int38 = lwjgl3ApplicationConfiguration37.getaudioDeviceBufferSize();
        boolean boolean39 = lwjgl3ApplicationConfiguration37.windowResizable;
        int int40 = lwjgl3ApplicationConfiguration37.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration37.setvSyncEnabled(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration37);
        com.badlogic.gdx.graphics.Color color44 = lwjgl3ApplicationConfiguration43.initialBackgroundColor;
        float float45 = color44.toFloatBits();
        com.badlogic.gdx.graphics.Color color46 = new com.badlogic.gdx.graphics.Color(color44);
        com.badlogic.gdx.graphics.Color color48 = color15.lerp(color46, (float) (-16711680));
        com.badlogic.gdx.graphics.Color color49 = new com.badlogic.gdx.graphics.Color(color48);
        com.badlogic.gdx.graphics.Color color54 = color49.add((-1.7013861E38f), (float) (-1308557313), (-9.997505E37f), (float) (-150994945));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color27 and color44", color27.equals(color44) ? color27.hashCode() == color44.hashCode() : true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color1 = color0.cpy();
        int int2 = com.badlogic.gdx.graphics.Color.argb8888(color1);
        com.badlogic.gdx.graphics.Color color3 = com.badlogic.gdx.graphics.Color.FOREST;
        int int4 = com.badlogic.gdx.graphics.Color.argb8888(color3);
        com.badlogic.gdx.graphics.Color color6 = color1.lerp(color3, (float) (-50396672));
        int int7 = com.badlogic.gdx.graphics.Color.argb8888(color6);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color14 = color9.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(color9);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color15);
        com.badlogic.gdx.graphics.Color color17 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color22 = color17.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color30 = color24.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color31 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str32 = color31.toString();
        com.badlogic.gdx.graphics.Color color34 = color24.lerp(color31, (-8.0750596E37f));
        boolean boolean35 = color17.equals((java.lang.Object) color24);
        com.badlogic.gdx.graphics.Color color36 = color16.add(color17);
        com.badlogic.gdx.graphics.Color color38 = color8.lerp(color16, (float) (-14540110));
        int int39 = com.badlogic.gdx.graphics.Color.rgb565(color8);
        com.badlogic.gdx.graphics.Color color40 = color6.sub(color8);
        color6.r = (-240);
        com.badlogic.gdx.graphics.Color color43 = new com.badlogic.gdx.graphics.Color(color6);
        color43.r = 4.8303113E-18f;
        com.badlogic.gdx.graphics.Color color46 = color43.clamp();
        color43.g = 1158662112;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color0 and color43", color0.equals(color43) ? color0.hashCode() == color43.hashCode() : true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.stencil;
        int int6 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.a = 43268;
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getwindowX();
        com.badlogic.gdx.graphics.Color color11 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        color11.a = 35;
        com.badlogic.gdx.graphics.Color color14 = new com.badlogic.gdx.graphics.Color(color11);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(color11);
        com.badlogic.gdx.graphics.Color color17 = color15.mul((float) 7728);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration18.setpreferencesFileType(fileType19);
        lwjgl3ApplicationConfiguration18.disableAudio = true;
        lwjgl3ApplicationConfiguration18.b = (short) -1;
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        float float27 = color26.a;
        int int28 = color26.toIntBits();
        lwjgl3ApplicationConfiguration18.initialBackgroundColor = color26;
        com.badlogic.gdx.graphics.Color color31 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color37 = color31.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color38 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str39 = color38.toString();
        com.badlogic.gdx.graphics.Color color41 = color31.lerp(color38, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color42 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color42, 16);
        com.badlogic.gdx.graphics.Color color45 = color41.sub(color42);
        color41.r = 0.0f;
        boolean boolean48 = color26.equals((java.lang.Object) color41);
        com.badlogic.gdx.graphics.Color color50 = color26.mul((float) 65290);
        com.badlogic.gdx.graphics.Color color51 = color26.cpy();
        boolean boolean52 = color17.equals((java.lang.Object) color51);
        com.badlogic.gdx.graphics.Color color53 = com.badlogic.gdx.graphics.Color.GREEN;
        com.badlogic.gdx.graphics.Color color59 = color53.lerp((-4.581683E37f), (float) 20160, (float) 13260, (float) (-187392), (float) (-1879860224));
        color59.r = 0.44444445f;
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color59, (-134355456));
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color59, (-112792302));
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color59, 653309);
        com.badlogic.gdx.graphics.Color color72 = new com.badlogic.gdx.graphics.Color((float) 160, (float) 1070333936, (float) (-1311232), (float) 40462);
        com.badlogic.gdx.graphics.Color color73 = color59.sub(color72);
        com.badlogic.gdx.graphics.Color color75 = color17.lerp(color59, (float) (-1175296));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color31 and color59", color31.equals(color59) ? color31.hashCode() == color59.hashCode() : true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color7 = color2.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color8 = color1.sub(color7);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color1, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color color14 = color12.mul((float) (-14513374));
        com.badlogic.gdx.graphics.Color color15 = color11.set(color12);
        color15.g = 2.9692728E-8f;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color15 and color12", color15.equals(color12) ? color15.hashCode() == color12.hashCode() : true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(4095);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color3 = color2.cpy();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color3, 1);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color3);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color12 = color7.add((float) (-567943452), 0.69803923f, 2.9056E-41f, (float) 16776960);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3ApplicationConfiguration13.setFullscreenMode(displayMode14);
        lwjgl3ApplicationConfiguration13.windowX = 100;
        int int18 = lwjgl3ApplicationConfiguration13.stencil;
        int int19 = lwjgl3ApplicationConfiguration13.windowY;
        lwjgl3ApplicationConfiguration13.a = 43268;
        int int22 = lwjgl3ApplicationConfiguration13.gles30ContextMinorVersion;
        int int23 = lwjgl3ApplicationConfiguration13.getwindowX();
        com.badlogic.gdx.graphics.Color color24 = lwjgl3ApplicationConfiguration13.initialBackgroundColor;
        color24.a = 35;
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(color24);
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color(color24);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType30 = null;
        lwjgl3ApplicationConfiguration29.setpreferencesFileType(fileType30);
        lwjgl3ApplicationConfiguration29.useVsync(false);
        com.badlogic.gdx.graphics.Color color34 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration29.initialBackgroundColor = color34;
        int int36 = lwjgl3ApplicationConfiguration29.depth;
        lwjgl3ApplicationConfiguration29.windowResizable = false;
        com.badlogic.gdx.graphics.Color color39 = lwjgl3ApplicationConfiguration29.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color41 = color28.lerp(color39, (float) 0L);
        com.badlogic.gdx.graphics.Color color42 = color7.set(color39);
        com.badlogic.gdx.graphics.Color color43 = color1.add(color7);
        color7.g = (-61363200);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color2 and color7", color2.equals(color7) ? color2.hashCode() == color7.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int7 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        lwjgl3ApplicationConfiguration0.setsamples((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.r = 44405;
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.DARK_GRAY;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(color12);
        com.badlogic.gdx.graphics.Color color15 = color12.set(35);
        com.badlogic.gdx.graphics.Color color16 = color12.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color21 = color12.mul(0.0f, (float) 65535, (float) (-32), (float) (-1));
        int int22 = com.badlogic.gdx.graphics.Color.rgba4444(color12);
        color12.g = 2080800;
        com.badlogic.gdx.graphics.Color color25 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color30 = color25.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color31 = new com.badlogic.gdx.graphics.Color(color25);
        int int32 = com.badlogic.gdx.graphics.Color.argb8888(color25);
        int int33 = color25.toIntBits();
        com.badlogic.gdx.graphics.Color color34 = color25.cpy();
        color34.a = 6528000;
        com.badlogic.gdx.graphics.Color color37 = color12.set(color34);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color12;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color12 and color25", color12.equals(color25) ? color12.hashCode() == color25.hashCode() : true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color13 = color12.cpy();
        int int14 = com.badlogic.gdx.graphics.Color.argb8888(color13);
        com.badlogic.gdx.graphics.Color color15 = com.badlogic.gdx.graphics.Color.FOREST;
        int int16 = com.badlogic.gdx.graphics.Color.argb8888(color15);
        com.badlogic.gdx.graphics.Color color18 = color13.lerp(color15, (float) (-50396672));
        int int19 = com.badlogic.gdx.graphics.Color.argb8888(color18);
        com.badlogic.gdx.graphics.Color color20 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color21 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color26 = color21.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(color21);
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color(color27);
        com.badlogic.gdx.graphics.Color color29 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color34 = color29.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color42 = color36.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color43 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str44 = color43.toString();
        com.badlogic.gdx.graphics.Color color46 = color36.lerp(color43, (-8.0750596E37f));
        boolean boolean47 = color29.equals((java.lang.Object) color36);
        com.badlogic.gdx.graphics.Color color48 = color28.add(color29);
        com.badlogic.gdx.graphics.Color color50 = color20.lerp(color28, (float) (-14540110));
        int int51 = com.badlogic.gdx.graphics.Color.rgb565(color20);
        com.badlogic.gdx.graphics.Color color52 = color18.sub(color20);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color18;
        float float54 = color18.a;
        com.badlogic.gdx.graphics.Color color59 = color18.add((float) (-16777215), (float) (byte) 10, (float) 43268, (float) 3855);
        float float60 = color59.b;
        com.badlogic.gdx.graphics.Color color62 = color59.mul(1.1802158E-30f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color62 and color15", color62.equals(color15) ? color62.hashCode() == color15.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color1 = color0.cpy();
        int int2 = com.badlogic.gdx.graphics.Color.argb8888(color1);
        com.badlogic.gdx.graphics.Color color3 = com.badlogic.gdx.graphics.Color.FOREST;
        int int4 = com.badlogic.gdx.graphics.Color.argb8888(color3);
        com.badlogic.gdx.graphics.Color color6 = color1.lerp(color3, (float) (-50396672));
        int int7 = com.badlogic.gdx.graphics.Color.argb8888(color6);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color14 = color9.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(color9);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color15);
        com.badlogic.gdx.graphics.Color color17 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color22 = color17.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color30 = color24.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color31 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str32 = color31.toString();
        com.badlogic.gdx.graphics.Color color34 = color24.lerp(color31, (-8.0750596E37f));
        boolean boolean35 = color17.equals((java.lang.Object) color24);
        com.badlogic.gdx.graphics.Color color36 = color16.add(color17);
        com.badlogic.gdx.graphics.Color color38 = color8.lerp(color16, (float) (-14540110));
        int int39 = com.badlogic.gdx.graphics.Color.rgb565(color8);
        com.badlogic.gdx.graphics.Color color40 = color6.sub(color8);
        com.badlogic.gdx.graphics.Color color45 = new com.badlogic.gdx.graphics.Color((float) 10L, (float) 1, (float) 0, (float) (short) -1);
        color45.r = 63519;
        com.badlogic.gdx.graphics.Color color49 = color45.set(512);
        com.badlogic.gdx.graphics.Color color50 = color6.add(color49);
        com.badlogic.gdx.graphics.Color color51 = new com.badlogic.gdx.graphics.Color(color49);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color49, 5636064);
        int int54 = color49.toIntBits();
        com.badlogic.gdx.graphics.Color color59 = new com.badlogic.gdx.graphics.Color((float) (-2105704448), (float) 2048, (float) (-587202461), 1.7705992E21f);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration60 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str61 = lwjgl3ApplicationConfiguration60.title;
        lwjgl3ApplicationConfiguration60.a = (-1);
        boolean boolean64 = lwjgl3ApplicationConfiguration60.vSyncEnabled;
        lwjgl3ApplicationConfiguration60.setaudioDeviceSimultaneousSources((-262646));
        lwjgl3ApplicationConfiguration60.useVsync(true);
        lwjgl3ApplicationConfiguration60.setBackBufferConfig((int) (byte) 0, (-256), (-1306385665), (-1879860224), 43268, 512, (-1611265692));
        lwjgl3ApplicationConfiguration60.audioDeviceBufferCount = 167247232;
        com.badlogic.gdx.graphics.Color color79 = lwjgl3ApplicationConfiguration60.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color84 = color79.mul((float) 1, (float) (-240), 2.3418409E-38f, (float) 100);
        java.lang.String str85 = color79.toString();
        com.badlogic.gdx.graphics.Color color86 = color59.add(color79);
        com.badlogic.gdx.graphics.Color color87 = color49.set(color59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color3 and color79", color3.equals(color79) ? color3.hashCode() == color79.hashCode() : true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color7 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color7);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color8);
        com.badlogic.gdx.graphics.Color color14 = color8.mul(0.06666667f, (float) (-58475), (float) (-16734721), (float) 1044480);
        color8.b = (-1.7013859E38f);
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(167247232);
        com.badlogic.gdx.graphics.Color color19 = color8.set(color18);
        com.badlogic.gdx.graphics.Color color20 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        int int21 = com.badlogic.gdx.graphics.Color.rgb565(color20);
        com.badlogic.gdx.graphics.Color color22 = color8.sub(color20);
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color32 = color26.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color33 = color24.mul(color32);
        com.badlogic.gdx.graphics.Color color38 = color33.sub((float) (short) -1, (float) (-1306385665), (float) (-262646), (float) 100L);
        int int39 = color33.toIntBits();
        float float40 = color33.a;
        com.badlogic.gdx.graphics.Color color41 = color22.sub(color33);
        java.lang.String str42 = color22.toString();
        float float43 = color22.toFloatBits();
        com.badlogic.gdx.graphics.Color color44 = new com.badlogic.gdx.graphics.Color(color22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color7 and color22", color7.equals(color22) ? color7.hashCode() == color22.hashCode() : true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color3 = color1.set(color2);
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color11 = color6.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(color12);
        com.badlogic.gdx.graphics.Color color14 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color19 = color14.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color27 = color21.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color28 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str29 = color28.toString();
        com.badlogic.gdx.graphics.Color color31 = color21.lerp(color28, (-8.0750596E37f));
        boolean boolean32 = color14.equals((java.lang.Object) color21);
        com.badlogic.gdx.graphics.Color color33 = color13.add(color14);
        com.badlogic.gdx.graphics.Color color35 = color5.lerp(color13, (float) (-14540110));
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color(color5);
        com.badlogic.gdx.graphics.Color color37 = color1.sub(color5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration38.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        com.badlogic.gdx.graphics.Color color47 = lwjgl3ApplicationConfiguration38.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color48 = color1.sub(color47);
        float float49 = color48.g;
        com.badlogic.gdx.graphics.Color color51 = color48.mul((float) 166464502);
        com.badlogic.gdx.graphics.Color color52 = new com.badlogic.gdx.graphics.Color(color51);
        color51.r = (-1.6881455E38f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color51 and color52", color51.equals(color52) ? color51.hashCode() == color52.hashCode() : true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int6 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color9;
        com.badlogic.gdx.graphics.Color color11 = color9.cpy();
        com.badlogic.gdx.graphics.Color color13 = color11.mul(0.057594743f);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(61450);
        com.badlogic.gdx.graphics.Color color16 = color11.mul(color15);
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(color16);
        color16.b = (-142774272);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color16 and color17", color16.equals(color17) ? color16.hashCode() == color17.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0.19607843f, 9.1477E-41f, (float) 512, (float) 20188);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(1878880718);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color6);
        color7.g = 16648950;
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color(color7);
        com.badlogic.gdx.graphics.Color color11 = color4.set(color10);
        com.badlogic.gdx.graphics.Color color16 = color10.set((float) (-2105704448), (float) 536870912, (float) 31520, (-1.7013869E38f));
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color((float) 2, (float) 100, (float) (short) 0, (float) 640);
        color21.g = 167247232;
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color(color21);
        int int25 = com.badlogic.gdx.graphics.Color.rgb888(color21);
        float float26 = color21.b;
        com.badlogic.gdx.graphics.Color color27 = color16.add(color21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color27 and color24", color27.equals(color24) ? color27.hashCode() == color24.hashCode() : true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setdepth((int) (byte) 1);
        com.badlogic.gdx.Files.FileType fileType3 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color7 = color5.set(color6);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color5);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color15 = color10.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color10);
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(color16);
        com.badlogic.gdx.graphics.Color color18 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color23 = color18.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color31 = color25.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color32 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str33 = color32.toString();
        com.badlogic.gdx.graphics.Color color35 = color25.lerp(color32, (-8.0750596E37f));
        boolean boolean36 = color18.equals((java.lang.Object) color25);
        com.badlogic.gdx.graphics.Color color37 = color17.add(color18);
        com.badlogic.gdx.graphics.Color color39 = color9.lerp(color17, (float) (-14540110));
        com.badlogic.gdx.graphics.Color color40 = new com.badlogic.gdx.graphics.Color(color9);
        com.badlogic.gdx.graphics.Color color41 = color5.sub(color9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration42 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration42.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        com.badlogic.gdx.graphics.Color color51 = lwjgl3ApplicationConfiguration42.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color52 = color5.sub(color51);
        com.badlogic.gdx.graphics.Color color57 = color5.sub(0.0f, (float) 6147990, (float) 2147483647, 0.0f);
        com.badlogic.gdx.graphics.Color color58 = color5.clamp();
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color58);
        int int60 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.setwindowY(16580354);
        int int63 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration64 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str65 = lwjgl3ApplicationConfiguration64.title;
        lwjgl3ApplicationConfiguration64.a = (-1);
        boolean boolean68 = lwjgl3ApplicationConfiguration64.vSyncEnabled;
        int int69 = lwjgl3ApplicationConfiguration64.windowHeight;
        lwjgl3ApplicationConfiguration64.setuseGL30(false);
        lwjgl3ApplicationConfiguration64.setwindowX((int) (short) 10);
        lwjgl3ApplicationConfiguration64.setWindowPosition(61450, (-1562574848));
        lwjgl3ApplicationConfiguration64.gles30ContextMajorVersion = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode79 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration64.hdpiMode = hdpiMode79;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode79;
        boolean boolean82 = lwjgl3ApplicationConfiguration0.windowDecorated;
        int int83 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.Graphics.DisplayMode displayMode84 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode84);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color6 and color10", color6.equals(color10) ? color6.hashCode() == color10.hashCode() : true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (byte) 100);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.BLACK;
        float float3 = color2.r;
        color2.r = 1671296512;
        com.badlogic.gdx.graphics.Color color6 = color1.sub(color2);
        com.badlogic.gdx.graphics.Color color8 = color6.set(1664640000);
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color((float) 10L, (float) 1, (float) 0, (float) (short) -1);
        color13.b = (-1241513983);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color13);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color13, (int) (byte) 100);
        color13.r = 31;
        com.badlogic.gdx.graphics.Color color25 = color13.add((float) 63519, (-1.6789801E38f), (-1.6950243E38f), (float) 1671296512);
        com.badlogic.gdx.graphics.Color color26 = color6.add(color25);
        com.badlogic.gdx.graphics.Color color27 = com.badlogic.gdx.graphics.Color.MAROON;
        float float28 = color27.toFloatBits();
        com.badlogic.gdx.graphics.Color color29 = new com.badlogic.gdx.graphics.Color(color27);
        com.badlogic.gdx.graphics.Color color31 = color26.lerp(color27, (float) 266342400);
        color26.r = (-62986);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color2 and color27", color2.equals(color27) ? color2.hashCode() == color27.hashCode() : true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((-1.6615402E38f), (float) 8, (float) (-66048), (float) (-257551));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration5.setpreferencesFileType(fileType6);
        lwjgl3ApplicationConfiguration5.useVsync(false);
        lwjgl3ApplicationConfiguration5.setWindowedMode(512, (int) '#');
        int int13 = lwjgl3ApplicationConfiguration5.stencil;
        int int14 = lwjgl3ApplicationConfiguration5.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration5.stencil = (byte) 0;
        lwjgl3ApplicationConfiguration5.setWindowedMode(16, (-78));
        int int20 = lwjgl3ApplicationConfiguration5.getwindowX();
        int int21 = lwjgl3ApplicationConfiguration5.getwindowX();
        lwjgl3ApplicationConfiguration5.setsamples((-1984));
        int int24 = lwjgl3ApplicationConfiguration5.getwindowWidth();
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color27 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color32 = color27.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color33 = color26.sub(color32);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color26, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color(color26);
        com.badlogic.gdx.graphics.Color color37 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color color39 = color37.mul((float) (-14513374));
        com.badlogic.gdx.graphics.Color color40 = color36.set(color37);
        com.badlogic.gdx.graphics.Color color41 = color37.cpy();
        com.badlogic.gdx.graphics.Color color42 = com.badlogic.gdx.graphics.Color.VIOLET;
        com.badlogic.gdx.graphics.Color color48 = color42.lerp((float) (byte) 100, (float) 8, (float) 10, (float) 9, (float) (-1611265692));
        com.badlogic.gdx.graphics.Color color49 = color37.mul(color48);
        com.badlogic.gdx.graphics.Color color50 = color48.premultiplyAlpha();
        lwjgl3ApplicationConfiguration5.initialBackgroundColor = color50;
        com.badlogic.gdx.graphics.Color color52 = color4.mul(color50);
        color50.g = (-1.4895661E38f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color4 and color50", color4.equals(color50) ? color4.hashCode() == color50.hashCode() : true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.FOREST;
        int int1 = com.badlogic.gdx.graphics.Color.argb8888(color0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int3 = lwjgl3ApplicationConfiguration2.getaudioDeviceBufferSize();
        boolean boolean4 = lwjgl3ApplicationConfiguration2.windowResizable;
        lwjgl3ApplicationConfiguration2.depth = (short) 10;
        lwjgl3ApplicationConfiguration2.title = "4169e1ff";
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color18 = color12.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color19 = color10.mul(color18);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration2.initialBackgroundColor = color10;
        com.badlogic.gdx.graphics.Color color23 = color0.set(color10);
        color23.a = (-65792);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color23 and color10", color23.equals(color10) ? color23.hashCode() == color10.hashCode() : true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color9 = color3.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color10 = color1.mul(color9);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color1, (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color13 = color1.cpy();
        com.badlogic.gdx.graphics.Color color14 = color1.cpy();
        color1.b = (-16844545);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color1 and color13", color1.equals(color13) ? color1.hashCode() == color13.hashCode() : true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setdepth((int) (byte) 1);
        com.badlogic.gdx.Files.FileType fileType3 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color7 = color5.set(color6);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color5);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color15 = color10.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color10);
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(color16);
        com.badlogic.gdx.graphics.Color color18 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color23 = color18.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color31 = color25.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color32 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str33 = color32.toString();
        com.badlogic.gdx.graphics.Color color35 = color25.lerp(color32, (-8.0750596E37f));
        boolean boolean36 = color18.equals((java.lang.Object) color25);
        com.badlogic.gdx.graphics.Color color37 = color17.add(color18);
        com.badlogic.gdx.graphics.Color color39 = color9.lerp(color17, (float) (-14540110));
        com.badlogic.gdx.graphics.Color color40 = new com.badlogic.gdx.graphics.Color(color9);
        com.badlogic.gdx.graphics.Color color41 = color5.sub(color9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration42 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration42.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        com.badlogic.gdx.graphics.Color color51 = lwjgl3ApplicationConfiguration42.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color52 = color5.sub(color51);
        com.badlogic.gdx.graphics.Color color57 = color5.sub(0.0f, (float) 6147990, (float) 2147483647, 0.0f);
        com.badlogic.gdx.graphics.Color color58 = color5.clamp();
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color58);
        int int60 = lwjgl3ApplicationConfiguration0.depth;
        java.lang.Class<?> wildcardClass61 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color10 and color51", color10.equals(color51) ? color10.hashCode() == color51.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color3 = color1.set(color2);
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color11 = color6.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(color12);
        com.badlogic.gdx.graphics.Color color14 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color19 = color14.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color27 = color21.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color28 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str29 = color28.toString();
        com.badlogic.gdx.graphics.Color color31 = color21.lerp(color28, (-8.0750596E37f));
        boolean boolean32 = color14.equals((java.lang.Object) color21);
        com.badlogic.gdx.graphics.Color color33 = color13.add(color14);
        com.badlogic.gdx.graphics.Color color35 = color5.lerp(color13, (float) (-14540110));
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color(color5);
        com.badlogic.gdx.graphics.Color color37 = color1.sub(color5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration38.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        com.badlogic.gdx.graphics.Color color47 = lwjgl3ApplicationConfiguration38.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color48 = color1.sub(color47);
        com.badlogic.gdx.graphics.Color color53 = color1.sub(0.0f, (float) 6147990, (float) 2147483647, 0.0f);
        com.badlogic.gdx.graphics.Color color54 = color1.clamp();
        color1.r = (-7.5108E-22f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color1 and color5", color1.equals(color5) ? color1.hashCode() == color5.hashCode() : true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color1 = color0.cpy();
        com.badlogic.gdx.graphics.Color color6 = color0.add((float) '#', (float) (-13500161), (float) 512, (float) (-335));
        java.lang.String str7 = color6.toString();
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color11 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color16 = color11.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color17 = color10.sub(color16);
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(color10);
        float float19 = color10.r;
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color((float) (-3200), (float) (-40036), (float) (-1306385665), (float) 58111);
        com.badlogic.gdx.graphics.Color color25 = color10.add(color24);
        com.badlogic.gdx.graphics.Color color27 = color8.lerp(color24, 2.4259024E-18f);
        int int28 = com.badlogic.gdx.graphics.Color.argb8888(color8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color0 and color8", color0.equals(color8) ? color0.hashCode() == color8.hashCode() : true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) 100, 1.0f, (float) 0, (float) (byte) 0);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color5);
        com.badlogic.gdx.graphics.Color color7 = color6.clamp();
        color7.b = 13260;
        float float10 = color7.r;
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(color12);
        com.badlogic.gdx.graphics.Color color14 = color7.mul(color12);
        float float15 = color14.g;
        color14.a = (-3.3087225E-23f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color14 and color12", color14.equals(color12) ? color14.hashCode() == color12.hashCode() : true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.GOLDENROD;
        color0.g = 35;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(3);
        color4.a = (byte) 100;
        com.badlogic.gdx.graphics.Color color7 = color4.clamp();
        com.badlogic.gdx.graphics.Color color12 = color7.sub((float) (-14540110), (float) (short) -1, (float) (-14513374), (float) 2);
        com.badlogic.gdx.graphics.Color color13 = color0.add(color12);
        com.badlogic.gdx.graphics.Color color14 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color19 = color14.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color(color14);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(color20);
        int int22 = com.badlogic.gdx.graphics.Color.argb8888(color21);
        int int23 = com.badlogic.gdx.graphics.Color.argb8888(color21);
        com.badlogic.gdx.graphics.Color color25 = color21.set(3);
        com.badlogic.gdx.graphics.Color color26 = color0.sub(color25);
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        boolean boolean29 = color26.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.graphics.Color color34 = color26.sub((float) 0L, (-4.2865007E37f), 2.3509886E-38f, (float) (-8672));
        float float35 = color26.toFloatBits();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType37 = null;
        lwjgl3ApplicationConfiguration36.setpreferencesFileType(fileType37);
        lwjgl3ApplicationConfiguration36.useVsync(false);
        lwjgl3ApplicationConfiguration36.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration36);
        boolean boolean44 = lwjgl3ApplicationConfiguration36.windowDecorated;
        com.badlogic.gdx.graphics.Color color45 = com.badlogic.gdx.graphics.Color.GREEN;
        lwjgl3ApplicationConfiguration36.setInitialBackgroundColor(color45);
        com.badlogic.gdx.graphics.Color color51 = color45.set((-2.231065E33f), (float) (-65486), (float) (-56576), (-1.6482297E38f));
        com.badlogic.gdx.graphics.Color color52 = color26.mul(color51);
        com.badlogic.gdx.graphics.Color color53 = color52.premultiplyAlpha();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration54 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int55 = lwjgl3ApplicationConfiguration54.getaudioDeviceBufferSize();
        boolean boolean56 = lwjgl3ApplicationConfiguration54.windowResizable;
        int int57 = lwjgl3ApplicationConfiguration54.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration54.setvSyncEnabled(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration60 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration54);
        com.badlogic.gdx.graphics.Color color61 = lwjgl3ApplicationConfiguration60.initialBackgroundColor;
        float float62 = color61.toFloatBits();
        com.badlogic.gdx.graphics.Color color63 = new com.badlogic.gdx.graphics.Color(color61);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration64 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode65 = null;
        lwjgl3ApplicationConfiguration64.setFullscreenMode(displayMode65);
        lwjgl3ApplicationConfiguration64.windowX = 100;
        int int69 = lwjgl3ApplicationConfiguration64.g;
        com.badlogic.gdx.Files.FileType fileType70 = lwjgl3ApplicationConfiguration64.getpreferencesFileType();
        boolean boolean71 = lwjgl3ApplicationConfiguration64.windowDecorated;
        com.badlogic.gdx.graphics.Color color72 = lwjgl3ApplicationConfiguration64.initialBackgroundColor;
        int int73 = com.badlogic.gdx.graphics.Color.rgba8888(color72);
        com.badlogic.gdx.graphics.Color color74 = color61.add(color72);
        color74.g = 0.0f;
        com.badlogic.gdx.graphics.Color color78 = color74.set((-11280864));
        com.badlogic.gdx.graphics.Color color84 = color74.lerp((-1.4762738E38f), (float) (-11777024), (float) 67043080, (float) 16, (float) (-405213696));
        com.badlogic.gdx.graphics.Color color85 = color53.set(color84);
        com.badlogic.gdx.graphics.Color color87 = color85.mul(0.0f);
        com.badlogic.gdx.graphics.Color color88 = new com.badlogic.gdx.graphics.Color(color87);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color4 and color14", color4.equals(color14) ? color4.hashCode() == color14.hashCode() : true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        int int12 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int14 = lwjgl3ApplicationConfiguration0.getdepth();
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color24 = color18.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color25 = color16.mul(color24);
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color33 = color27.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        color33.g = (short) 1;
        com.badlogic.gdx.graphics.Color color37 = color25.lerp(color33, (float) 25500);
        int int38 = com.badlogic.gdx.graphics.Color.rgba8888(color37);
        com.badlogic.gdx.graphics.Color color43 = color37.mul((float) 16, (-1.0f), (float) 524288, 1.7014117E38f);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color43);
        com.badlogic.gdx.graphics.Color color49 = new com.badlogic.gdx.graphics.Color((float) (-134217728), (float) (-587726848), (float) 573767680, (float) (-50396672));
        com.badlogic.gdx.graphics.Color color51 = new com.badlogic.gdx.graphics.Color((-335));
        com.badlogic.gdx.graphics.Color color52 = color51.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color53 = new com.badlogic.gdx.graphics.Color(color51);
        com.badlogic.gdx.graphics.Color color54 = color49.sub(color53);
        com.badlogic.gdx.graphics.Color color55 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color56 = color55.cpy();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color56, 1);
        int int59 = color56.toIntBits();
        com.badlogic.gdx.graphics.Color color60 = new com.badlogic.gdx.graphics.Color(color56);
        com.badlogic.gdx.graphics.Color color65 = color60.add((-5.68232E37f), 1.00579765E-28f, (float) 2147483647, (float) (-1306385665));
        com.badlogic.gdx.graphics.Color color66 = color53.mul(color65);
        com.badlogic.gdx.graphics.Color color67 = color43.add(color53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color67 and color18", color67.equals(color18) ? color67.hashCode() == color18.hashCode() : true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (byte) 100);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.BLACK;
        float float3 = color2.r;
        color2.r = 1671296512;
        com.badlogic.gdx.graphics.Color color6 = color1.sub(color2);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color8 = color1.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color15 = color10.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color10);
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(color16);
        com.badlogic.gdx.graphics.Color color18 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color23 = color18.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color31 = color25.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color32 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str33 = color32.toString();
        com.badlogic.gdx.graphics.Color color35 = color25.lerp(color32, (-8.0750596E37f));
        boolean boolean36 = color18.equals((java.lang.Object) color25);
        com.badlogic.gdx.graphics.Color color37 = color17.add(color18);
        com.badlogic.gdx.graphics.Color color39 = color9.lerp(color17, (float) (-14540110));
        int int40 = com.badlogic.gdx.graphics.Color.rgb565(color9);
        com.badlogic.gdx.graphics.Color color45 = color9.mul((float) (byte) 0, (float) (byte) 100, (float) 35, (float) (-255));
        com.badlogic.gdx.graphics.Color color46 = color8.mul(color9);
        com.badlogic.gdx.graphics.Color color51 = color46.mul((float) (-40036), (float) (-222), (float) (-16711680), (float) 1651519680);
        color51.a = (-16580863);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color51 and color7", color51.equals(color7) ? color51.hashCode() == color7.hashCode() : true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (short) -1, 1.6598767E-38f, 2.3418052E-38f, 2.3418409E-38f);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.GOLDENROD;
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.BLACK;
        float float7 = color6.r;
        com.badlogic.gdx.graphics.Color color12 = color6.sub((float) (-14513374), (float) 151015132, 0.0f, (float) 1L);
        com.badlogic.gdx.graphics.Color color17 = color6.set((float) (short) -1, (float) 524288, (float) (-1), 9.18893E-39f);
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color19 = color5.sub(color6);
        int int20 = com.badlogic.gdx.graphics.Color.rgba4444(color6);
        com.badlogic.gdx.graphics.Color color21 = color4.add(color6);
        com.badlogic.gdx.graphics.Color color22 = color21.clamp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color22 and color6", color22.equals(color6) ? color22.hashCode() == color6.hashCode() : true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(480);
        com.badlogic.gdx.graphics.Color color2 = color1.cpy();
        float float3 = color2.b;
        com.badlogic.gdx.graphics.Color color8 = color2.sub((float) (-135823360), (float) 268493567, (float) (-1611265692), (float) 52);
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color18 = color12.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color19 = color10.mul(color18);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        float float22 = color21.a;
        com.badlogic.gdx.graphics.Color color27 = color21.mul((float) 8, (float) 1677696502, (float) 0L, (float) 43268);
        com.badlogic.gdx.graphics.Color color28 = color10.add(color27);
        com.badlogic.gdx.graphics.Color color33 = color28.mul(0.0f, (float) '#', 0.0f, (float) 16711935);
        com.badlogic.gdx.graphics.Color color35 = color2.lerp(color28, (float) (-2146959360));
        com.badlogic.gdx.graphics.Color color37 = new com.badlogic.gdx.graphics.Color((-2142638528));
        com.badlogic.gdx.graphics.Color color42 = color37.sub((float) (-379904), (float) 20188, (-1.6986602E38f), (float) (-2130706432));
        int int43 = com.badlogic.gdx.graphics.Color.rgba8888(color42);
        com.badlogic.gdx.graphics.Color color45 = new com.badlogic.gdx.graphics.Color(100);
        com.badlogic.gdx.graphics.Color color50 = new com.badlogic.gdx.graphics.Color(1.5612034E-37f, (float) (-16711680), 2.5243549E-29f, (float) (-1306385665));
        color50.b = 65025;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration53 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str54 = lwjgl3ApplicationConfiguration53.title;
        lwjgl3ApplicationConfiguration53.a = (-1);
        boolean boolean57 = lwjgl3ApplicationConfiguration53.vSyncEnabled;
        lwjgl3ApplicationConfiguration53.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color60 = lwjgl3ApplicationConfiguration53.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color61 = new com.badlogic.gdx.graphics.Color(color60);
        com.badlogic.gdx.graphics.Color color62 = new com.badlogic.gdx.graphics.Color(color61);
        com.badlogic.gdx.graphics.Color color63 = color50.sub(color61);
        float float64 = color63.toFloatBits();
        com.badlogic.gdx.graphics.Color color66 = color45.lerp(color63, (float) (-510));
        com.badlogic.gdx.graphics.Color color67 = color42.sub(color66);
        com.badlogic.gdx.graphics.Color color72 = new com.badlogic.gdx.graphics.Color((float) 1, (float) 20160, (float) 0, (float) (byte) -1);
        int int73 = com.badlogic.gdx.graphics.Color.rgb565(color72);
        com.badlogic.gdx.graphics.Color color74 = color66.set(color72);
        com.badlogic.gdx.graphics.Color color75 = color2.sub(color66);
        float float76 = color75.r;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color75 and color50", color75.equals(color50) ? color75.hashCode() == color50.hashCode() : true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 2, (float) 100, (float) (short) 0, (float) 640);
        color4.g = 167247232;
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color4);
        float float8 = color7.r;
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color7);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color7, (-487968));
        color7.g = (-1880617984);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color16 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color17 = color15.set(color16);
        color16.r = (-255);
        com.badlogic.gdx.graphics.Color color24 = color16.sub((float) (-6528000), (float) (-115213), (-1.0f), (float) 537395200);
        com.badlogic.gdx.graphics.Color color25 = color7.set(color16);
        color16.a = 240;
        com.badlogic.gdx.graphics.Color color28 = com.badlogic.gdx.graphics.Color.SCARLET;
        color28.b = '#';
        com.badlogic.gdx.graphics.Color color31 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color color33 = color28.lerp(color31, (float) 1L);
        com.badlogic.gdx.graphics.Color color34 = color31.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color(color34);
        com.badlogic.gdx.graphics.Color color36 = color16.add(color35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color4 and color36", color4.equals(color36) ? color4.hashCode() == color36.hashCode() : true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        int int3 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-554880), 8897069);
        lwjgl3ApplicationConfiguration0.setwindowX((-768));
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("ffff65b6");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3ApplicationConfiguration13.setFullscreenMode(displayMode14);
        lwjgl3ApplicationConfiguration13.windowX = 100;
        int int18 = lwjgl3ApplicationConfiguration13.stencil;
        int int19 = lwjgl3ApplicationConfiguration13.windowY;
        lwjgl3ApplicationConfiguration13.a = 43268;
        int int22 = lwjgl3ApplicationConfiguration13.gles30ContextMinorVersion;
        int int23 = lwjgl3ApplicationConfiguration13.getwindowX();
        com.badlogic.gdx.graphics.Color color24 = lwjgl3ApplicationConfiguration13.initialBackgroundColor;
        color24.a = 35;
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(color24);
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color(color24);
        com.badlogic.gdx.graphics.Color color33 = new com.badlogic.gdx.graphics.Color((-0.49791527f), (float) 8, (float) (-32), (float) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration34.setDecorated(false);
        lwjgl3ApplicationConfiguration34.a = (byte) 10;
        boolean boolean39 = lwjgl3ApplicationConfiguration34.initialVisible;
        int int40 = lwjgl3ApplicationConfiguration34.b;
        lwjgl3ApplicationConfiguration34.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color43 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration34.initialBackgroundColor = color43;
        com.badlogic.gdx.graphics.Color color45 = color43.clamp();
        com.badlogic.gdx.graphics.Color color47 = color33.lerp(color45, (float) (-2336));
        com.badlogic.gdx.graphics.Color color48 = color28.add(color33);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration49 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str50 = lwjgl3ApplicationConfiguration49.title;
        lwjgl3ApplicationConfiguration49.a = (-1);
        boolean boolean53 = lwjgl3ApplicationConfiguration49.vSyncEnabled;
        lwjgl3ApplicationConfiguration49.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color56 = lwjgl3ApplicationConfiguration49.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color57 = new com.badlogic.gdx.graphics.Color(color56);
        com.badlogic.gdx.graphics.Color color59 = new com.badlogic.gdx.graphics.Color((-16711680));
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color59, (-16734721));
        com.badlogic.gdx.graphics.Color color62 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color67 = color62.add((float) (byte) 100, (float) 41903542, (float) (short) 10, (-1.6947917E38f));
        com.badlogic.gdx.graphics.Color color68 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color69 = color68.cpy();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color69, 1);
        float float72 = color69.r;
        com.badlogic.gdx.graphics.Color color73 = color62.sub(color69);
        com.badlogic.gdx.graphics.Color color74 = color59.set(color62);
        com.badlogic.gdx.graphics.Color color75 = color57.add(color62);
        com.badlogic.gdx.graphics.Color color76 = new com.badlogic.gdx.graphics.Color(color75);
        com.badlogic.gdx.graphics.Color color77 = color48.set(color75);
        com.badlogic.gdx.graphics.Color color78 = color48.clamp();
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color78;
        int int80 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color24 and color28", color24.equals(color28) ? color24.hashCode() == color28.hashCode() : true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.GOLD;
        com.badlogic.gdx.graphics.Color color2 = color0.set(570949632);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color0, 166464000);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color((float) 2, (float) 100, (float) (short) 0, (float) 640);
        color9.g = 167247232;
        java.lang.String str12 = color9.toString();
        float float13 = color9.a;
        com.badlogic.gdx.graphics.Color color14 = color0.set(color9);
        com.badlogic.gdx.graphics.Color color19 = color14.mul((float) 16767488, (float) (-1728), (-1.435E-42f), (-1.6997487E38f));
        com.badlogic.gdx.graphics.Color color20 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color25 = color20.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color(color20);
        int int27 = com.badlogic.gdx.graphics.Color.argb8888(color20);
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color(color20);
        com.badlogic.gdx.graphics.Color color29 = com.badlogic.gdx.graphics.Color.SALMON;
        float float30 = color29.toFloatBits();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str32 = lwjgl3ApplicationConfiguration31.title;
        com.badlogic.gdx.graphics.Color color33 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color33, 16);
        lwjgl3ApplicationConfiguration31.setInitialBackgroundColor(color33);
        com.badlogic.gdx.graphics.Color color41 = color33.sub((float) (-232), (float) (-255), (float) 10L, (float) 1L);
        com.badlogic.gdx.graphics.Color color43 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color49 = color43.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color50 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str51 = color50.toString();
        com.badlogic.gdx.graphics.Color color53 = color43.lerp(color50, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color54 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color54, 16);
        com.badlogic.gdx.graphics.Color color57 = color53.sub(color54);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color54, 1677696502);
        com.badlogic.gdx.graphics.Color color60 = color33.sub(color54);
        com.badlogic.gdx.graphics.Color color61 = color29.add(color54);
        com.badlogic.gdx.graphics.Color color62 = color28.sub(color54);
        com.badlogic.gdx.graphics.Color color64 = color19.lerp(color28, (-1.7013859E38f));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color9 and color20", color9.equals(color20) ? color9.hashCode() == color20.hashCode() : true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SCARLET;
        color0.b = '#';
        com.badlogic.gdx.graphics.Color color3 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color color5 = color0.lerp(color3, (float) 1L);
        com.badlogic.gdx.graphics.Color color6 = color3.premultiplyAlpha();
        color6.b = 2.3509528E-38f;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color0 and color6", color0.equals(color6) ? color0.hashCode() == color6.hashCode() : true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.graphics.Color color7 = lwjgl3ApplicationConfiguration6.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color13 = color8.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color14 = new com.badlogic.gdx.graphics.Color(color8);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(color14);
        com.badlogic.gdx.graphics.Color color16 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color21 = color16.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color23 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color29 = color23.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color30 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str31 = color30.toString();
        com.badlogic.gdx.graphics.Color color33 = color23.lerp(color30, (-8.0750596E37f));
        boolean boolean34 = color16.equals((java.lang.Object) color23);
        com.badlogic.gdx.graphics.Color color35 = color15.add(color16);
        float float36 = color35.b;
        com.badlogic.gdx.graphics.Color color37 = color7.set(color35);
        int int38 = com.badlogic.gdx.graphics.Color.rgb888(color37);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration39 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration39.setDecorated(false);
        lwjgl3ApplicationConfiguration39.a = (byte) 10;
        boolean boolean44 = lwjgl3ApplicationConfiguration39.initialVisible;
        int int45 = lwjgl3ApplicationConfiguration39.b;
        int int46 = lwjgl3ApplicationConfiguration39.getwindowY();
        int int47 = lwjgl3ApplicationConfiguration39.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration39.setInitialVisible(false);
        lwjgl3ApplicationConfiguration39.audioDeviceBufferSize = ' ';
        com.badlogic.gdx.graphics.Color color52 = lwjgl3ApplicationConfiguration39.initialBackgroundColor;
        int int53 = com.badlogic.gdx.graphics.Color.argb8888(color52);
        com.badlogic.gdx.graphics.Color color54 = color37.sub(color52);
        com.badlogic.gdx.graphics.Color color55 = color52.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color60 = color55.add((-1.6950762E38f), (float) 551485439, 5.990217E-18f, (float) (-1170));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color60 and color16", color60.equals(color16) ? color60.hashCode() == color16.hashCode() : true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(3);
        color1.a = (byte) 100;
        com.badlogic.gdx.graphics.Color color4 = color1.clamp();
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color1, (-1902614));
        com.badlogic.gdx.graphics.Color color11 = color1.set((float) (byte) 1, (float) '4', (float) 6529016, (float) (-16734721));
        com.badlogic.gdx.graphics.Color color12 = color11.cpy();
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color11, (-16646400));
        com.badlogic.gdx.graphics.Color color15 = color11.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color16 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color21 = color16.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color21, 100);
        com.badlogic.gdx.graphics.Color color25 = color21.mul(100.0f);
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color(color21);
        com.badlogic.gdx.graphics.Color color27 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color32 = color27.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color33 = new com.badlogic.gdx.graphics.Color(color27);
        int int34 = com.badlogic.gdx.graphics.Color.argb8888(color27);
        com.badlogic.gdx.graphics.Color color35 = color27.clamp();
        com.badlogic.gdx.graphics.Color color36 = color21.mul(color35);
        com.badlogic.gdx.graphics.Color color38 = new com.badlogic.gdx.graphics.Color((int) (byte) 100);
        com.badlogic.gdx.graphics.Color color39 = com.badlogic.gdx.graphics.Color.BLACK;
        float float40 = color39.r;
        color39.r = 1671296512;
        com.badlogic.gdx.graphics.Color color43 = color38.sub(color39);
        color39.r = 166464000;
        com.badlogic.gdx.graphics.Color color46 = color21.add(color39);
        com.badlogic.gdx.graphics.Color color47 = color11.sub(color46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color46 and color39", color46.equals(color39) ? color46.hashCode() == color39.hashCode() : true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color5, 100);
        com.badlogic.gdx.graphics.Color color9 = color5.mul(100.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color9, 8897069);
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color17 = color12.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(color12);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(color18);
        int int20 = com.badlogic.gdx.graphics.Color.argb8888(color19);
        int int21 = com.badlogic.gdx.graphics.Color.rgba8888(color19);
        com.badlogic.gdx.graphics.Color color23 = color9.lerp(color19, (float) 1044480);
        com.badlogic.gdx.graphics.Color color28 = color23.add((float) '4', (float) 10, (float) (short) 1, 0.69803923f);
        float float29 = color23.r;
        com.badlogic.gdx.graphics.Color color34 = color23.mul((float) (-8192), (float) (-33566977), 9.1477E-41f, (float) (-85425));
        float float35 = color23.a;
        com.badlogic.gdx.graphics.Color color36 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color color37 = new com.badlogic.gdx.graphics.Color(color36);
        com.badlogic.gdx.graphics.Color color38 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str39 = color38.toString();
        com.badlogic.gdx.graphics.Color color41 = color38.set((-62986));
        com.badlogic.gdx.graphics.Color color42 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str43 = color42.toString();
        com.badlogic.gdx.graphics.Color color45 = color42.set((-62986));
        com.badlogic.gdx.graphics.Color color46 = color41.sub(color45);
        com.badlogic.gdx.graphics.Color color47 = color36.add(color45);
        float float48 = color45.a;
        int int49 = com.badlogic.gdx.graphics.Color.rgb565(color45);
        com.badlogic.gdx.graphics.Color color51 = color23.lerp(color45, (float) (-73463560));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color51 and color45", color51.equals(color45) ? color51.hashCode() == color45.hashCode() : true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.TAN;
        com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.VIOLET;
        com.badlogic.gdx.graphics.Color color7 = color1.lerp((float) (byte) 100, (float) 8, (float) 10, (float) 9, (float) (-1611265692));
        int int8 = com.badlogic.gdx.graphics.Color.rgba8888(color1);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color10 = color0.sub(color1);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color1, 64783);
        float float13 = color1.g;
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color16 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color21 = color16.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color22 = color15.sub(color21);
        com.badlogic.gdx.graphics.Color color23 = new com.badlogic.gdx.graphics.Color(color15);
        int int24 = color23.toIntBits();
        com.badlogic.gdx.graphics.Color color25 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color26 = color25.cpy();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color26, 1);
        int int29 = color26.toIntBits();
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color(color26);
        com.badlogic.gdx.graphics.Color color31 = color23.mul(color30);
        float float32 = color31.a;
        com.badlogic.gdx.graphics.Color color33 = color1.mul(color31);
        com.badlogic.gdx.graphics.Color color35 = color33.mul((float) (-57312));
        color33.a = (-499968);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color33 and color9", color33.equals(color9) ? color33.hashCode() == color9.hashCode() : true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) 100, 1.0f, (float) 0, (float) (byte) 0);
        java.lang.String str6 = color5.toString();
        com.badlogic.gdx.graphics.Color color7 = com.badlogic.gdx.graphics.Color.DARK_GRAY;
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color7);
        int int9 = com.badlogic.gdx.graphics.Color.rgba4444(color8);
        com.badlogic.gdx.graphics.Color color10 = color5.mul(color8);
        color10.b = (-1.6615402E38f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color10 and color7", color10.equals(color7) ? color10.hashCode() == color7.hashCode() : true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        lwjgl3ApplicationConfiguration8.setAudioConfig(512, (-14540110), (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration14.setDecorated(false);
        lwjgl3ApplicationConfiguration14.a = (byte) 10;
        boolean boolean19 = lwjgl3ApplicationConfiguration14.initialVisible;
        int int20 = lwjgl3ApplicationConfiguration14.b;
        lwjgl3ApplicationConfiguration14.setInitialVisible(true);
        com.badlogic.gdx.Files.FileType fileType23 = lwjgl3ApplicationConfiguration14.preferencesFileType;
        lwjgl3ApplicationConfiguration8.setPreferencesConfig(".prefs/", fileType23);
        int int25 = lwjgl3ApplicationConfiguration8.gles30ContextMajorVersion;
        int int26 = lwjgl3ApplicationConfiguration8.windowHeight;
        int int27 = lwjgl3ApplicationConfiguration8.getwindowY();
        int int28 = lwjgl3ApplicationConfiguration8.audioDeviceSimultaneousSources;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType31 = null;
        lwjgl3ApplicationConfiguration30.setpreferencesFileType(fileType31);
        lwjgl3ApplicationConfiguration30.useVsync(false);
        com.badlogic.gdx.graphics.Color color35 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration30.initialBackgroundColor = color35;
        lwjgl3ApplicationConfiguration30.setDecorated(false);
        int int39 = lwjgl3ApplicationConfiguration30.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration30.setuseGL30(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration42 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration30);
        lwjgl3ApplicationConfiguration42.setwindowDecorated(false);
        int int45 = lwjgl3ApplicationConfiguration42.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration42.setgles30ContextMajorVersion(266342400);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener48 = null;
        lwjgl3ApplicationConfiguration42.setWindowListener(lwjgl3WindowListener48);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration50 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int51 = lwjgl3ApplicationConfiguration50.getaudioDeviceBufferSize();
        int int52 = lwjgl3ApplicationConfiguration50.b;
        lwjgl3ApplicationConfiguration50.useGL30 = false;
        int int55 = lwjgl3ApplicationConfiguration50.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration50.g = ' ';
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode58 = null;
        lwjgl3ApplicationConfiguration50.fullscreenMode = lwjgl3DisplayMode58;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener60 = null;
        lwjgl3ApplicationConfiguration50.setWindowListener(lwjgl3WindowListener60);
        com.badlogic.gdx.Files.FileType fileType62 = lwjgl3ApplicationConfiguration50.getpreferencesFileType();
        lwjgl3ApplicationConfiguration42.setpreferencesFileType(fileType62);
        lwjgl3ApplicationConfiguration8.setPreferencesConfig("00ffffff", fileType62);
        com.badlogic.gdx.graphics.Color color65 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color70 = color65.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color71 = new com.badlogic.gdx.graphics.Color(color65);
        int int72 = com.badlogic.gdx.graphics.Color.argb8888(color65);
        color65.g = 1671296512;
        lwjgl3ApplicationConfiguration8.initialBackgroundColor = color65;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color65 and color71", color65.equals(color71) ? color65.hashCode() == color71.hashCode() : true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setAudioConfig((-12632257), 61450, (-16741598));
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color((float) 10L, (float) 1, (float) 0, (float) (short) -1);
        color18.b = (-1241513983);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(color18);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color18, (int) (byte) 100);
        com.badlogic.gdx.graphics.Color color25 = color18.mul((float) 16580354);
        color25.r = 3855;
        com.badlogic.gdx.graphics.Color color28 = com.badlogic.gdx.graphics.Color.SKY;
        int int29 = com.badlogic.gdx.graphics.Color.argb8888(color28);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str31 = lwjgl3ApplicationConfiguration30.title;
        lwjgl3ApplicationConfiguration30.a = (-1);
        boolean boolean34 = lwjgl3ApplicationConfiguration30.vSyncEnabled;
        lwjgl3ApplicationConfiguration30.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color37 = lwjgl3ApplicationConfiguration30.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color38 = color28.mul(color37);
        com.badlogic.gdx.graphics.Color color39 = color37.cpy();
        com.badlogic.gdx.graphics.Color color40 = color25.set(color37);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color40);
        color40.a = (-1.7010757E38f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color40 and color37", color40.equals(color37) ? color40.hashCode() == color37.hashCode() : true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0.19607843f, 9.1477E-41f, (float) 512, (float) 20188);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(1878880718);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color6);
        color7.g = 16648950;
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color(color7);
        com.badlogic.gdx.graphics.Color color11 = color4.set(color10);
        color4.g = 150866176;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color7 and color4", color7.equals(color4) ? color7.hashCode() == color4.hashCode() : true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) 100, 1.0f, (float) 0, (float) (byte) 0);
        color0.g = 151015132;
        com.badlogic.gdx.graphics.Color color13 = color0.lerp((float) (short) 10, (float) (short) 0, (float) 3840, 0.0f, (float) 52);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color16 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color21 = color16.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color22 = color15.sub(color21);
        com.badlogic.gdx.graphics.Color color23 = new com.badlogic.gdx.graphics.Color(color15);
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color26 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color31 = color26.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color32 = color25.sub(color31);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color25, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color39 = color25.set(1.561203E-39f, (float) 2, (float) (byte) -1, (float) 3);
        com.badlogic.gdx.graphics.Color color40 = color15.set(color25);
        boolean boolean41 = color0.equals((java.lang.Object) color15);
        com.badlogic.gdx.graphics.Color color43 = color15.mul((float) 16668585);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color43 and color25", color43.equals(color25) ? color43.hashCode() == color25.hashCode() : true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color0, (-256));
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color12 = color6.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color13 = color4.mul(color12);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color21 = color15.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        color21.g = (short) 1;
        com.badlogic.gdx.graphics.Color color25 = color13.lerp(color21, (float) 25500);
        com.badlogic.gdx.graphics.Color color30 = color13.mul(0.0f, (float) (-8142), (float) (-1562574848), (-1.0f));
        com.badlogic.gdx.graphics.Color color31 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color36 = color31.add((float) 100, 1.0f, (float) 0, (float) (byte) 0);
        java.lang.String str37 = color36.toString();
        com.badlogic.gdx.graphics.Color color38 = com.badlogic.gdx.graphics.Color.DARK_GRAY;
        com.badlogic.gdx.graphics.Color color39 = new com.badlogic.gdx.graphics.Color(color38);
        int int40 = com.badlogic.gdx.graphics.Color.rgba4444(color39);
        com.badlogic.gdx.graphics.Color color41 = color36.mul(color39);
        com.badlogic.gdx.graphics.Color color42 = color30.add(color41);
        com.badlogic.gdx.graphics.Color color43 = color0.sub(color30);
        com.badlogic.gdx.graphics.Color color44 = color30.cpy();
        com.badlogic.gdx.graphics.Color color45 = new com.badlogic.gdx.graphics.Color(color30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color30 and color38", color30.equals(color38) ? color30.hashCode() == color38.hashCode() : true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.DARK_GRAY;
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color3 = color0.set(35);
        com.badlogic.gdx.graphics.Color color4 = color0.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color9 = color0.mul(0.0f, (float) 65535, (float) (-32), (float) (-1));
        int int10 = com.badlogic.gdx.graphics.Color.rgba4444(color0);
        color0.g = 2080800;
        com.badlogic.gdx.graphics.Color color13 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color18 = color13.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(color13);
        int int20 = com.badlogic.gdx.graphics.Color.argb8888(color13);
        int int21 = color13.toIntBits();
        com.badlogic.gdx.graphics.Color color22 = color13.cpy();
        color22.a = 6528000;
        com.badlogic.gdx.graphics.Color color25 = color0.set(color22);
        color25.g = 39936;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color13 and color22", color13.equals(color22) ? color13.hashCode() == color22.hashCode() : true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int6 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color9;
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-2560));
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color((float) 6147990, (float) (byte) -1, (float) (-61455), (float) 15687677);
        com.badlogic.gdx.graphics.Color color25 = color19.lerp((float) (-183869281), (float) (-2142638528), (float) (-4096), (float) (-40036), (float) 63519);
        com.badlogic.gdx.graphics.Color color26 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color27 = color26.cpy();
        int int28 = com.badlogic.gdx.graphics.Color.argb8888(color27);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str30 = lwjgl3ApplicationConfiguration29.title;
        com.badlogic.gdx.graphics.Color color31 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color31, 16);
        lwjgl3ApplicationConfiguration29.setInitialBackgroundColor(color31);
        com.badlogic.gdx.graphics.Color color39 = color31.sub((float) (-232), (float) (-255), (float) 10L, (float) 1L);
        com.badlogic.gdx.graphics.Color color41 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color47 = color41.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color48 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str49 = color48.toString();
        com.badlogic.gdx.graphics.Color color51 = color41.lerp(color48, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color52 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color52, 16);
        com.badlogic.gdx.graphics.Color color55 = color51.sub(color52);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color52, 1677696502);
        com.badlogic.gdx.graphics.Color color58 = color31.sub(color52);
        com.badlogic.gdx.graphics.Color color59 = color27.mul(color52);
        com.badlogic.gdx.graphics.Color color60 = new com.badlogic.gdx.graphics.Color(color52);
        com.badlogic.gdx.graphics.Color color62 = color25.lerp(color52, (float) (-16580863));
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color52, 1677696502);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color52);
        com.badlogic.gdx.graphics.Color color67 = color52.set(16);
        color67.a = (-5.9481655E37f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color19 and color67", color19.equals(color67) ? color19.hashCode() == color67.hashCode() : true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((-1.4936944E38f), 2.3418052E-38f, (float) ' ', (float) 65535);
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color5);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(480);
        com.badlogic.gdx.graphics.Color color9 = color8.cpy();
        int int10 = com.badlogic.gdx.graphics.Color.rgba8888(color8);
        com.badlogic.gdx.graphics.Color color12 = color5.lerp(color8, (float) (-2560));
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(color12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color4 and color12", color4.equals(color12) ? color4.hashCode() == color12.hashCode() : true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (byte) 100);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.BLACK;
        float float3 = color2.r;
        color2.r = 1671296512;
        com.badlogic.gdx.graphics.Color color6 = color1.sub(color2);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color8 = color1.clamp();
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color1, (-16646400));
        int int11 = com.badlogic.gdx.graphics.Color.rgba4444(color1);
        color1.g = (-159989760);
        com.badlogic.gdx.graphics.Color color18 = color1.add((float) (-888832), 0.0f, 0.0f, 5.8756265E-29f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color18 and color7", color18.equals(color7) ? color18.hashCode() == color7.hashCode() : true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color5 = color0.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color13 = color7.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color14 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str15 = color14.toString();
        com.badlogic.gdx.graphics.Color color17 = color7.lerp(color14, (-8.0750596E37f));
        boolean boolean18 = color0.equals((java.lang.Object) color7);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(color7);
        com.badlogic.gdx.graphics.Color color24 = color7.sub((-1.7011522E38f), (float) 65290, (float) (-138133248), (-4.2535296E37f));
        color7.a = (-7.508787E-9f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color7 and color19", color7.equals(color19) ? color7.hashCode() == color19.hashCode() : true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        int int12 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int14 = lwjgl3ApplicationConfiguration0.getdepth();
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color24 = color18.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color25 = color16.mul(color24);
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color33 = color27.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        color33.g = (short) 1;
        com.badlogic.gdx.graphics.Color color37 = color25.lerp(color33, (float) 25500);
        int int38 = com.badlogic.gdx.graphics.Color.rgba8888(color37);
        com.badlogic.gdx.graphics.Color color43 = color37.mul((float) 16, (-1.0f), (float) 524288, 1.7014117E38f);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color43);
        lwjgl3ApplicationConfiguration0.b = 16772625;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 0;
        com.badlogic.gdx.graphics.Color color50 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color51 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color52 = color50.set(color51);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color51);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color51, (-19889));
        com.badlogic.gdx.graphics.Color color60 = color51.mul(0.0f, (float) 8584978, (-1.6977967E38f), 0.12903225f);
        java.lang.String str61 = color51.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color50 and color51", color50.equals(color51) ? color50.hashCode() == color51.hashCode() : true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-262646));
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (-256), (-1306385665), (-1879860224), 43268, 512, (-1611265692));
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 167247232;
        com.badlogic.gdx.graphics.Color color19 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color24 = color19.mul((float) 1, (float) (-240), 2.3418409E-38f, (float) 100);
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color(color24);
        com.badlogic.gdx.graphics.Color color27 = color25.set(1105199359);
        float float28 = color27.toFloatBits();
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color27, 1677786624);
        com.badlogic.gdx.graphics.Color color31 = new com.badlogic.gdx.graphics.Color(color27);
        com.badlogic.gdx.graphics.Color color32 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str33 = color32.toString();
        color32.g = 16711935;
        com.badlogic.gdx.graphics.Color color36 = color32.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color41 = color36.sub((float) 16711425, 0.12698413f, 0.0f, (float) (-7680));
        com.badlogic.gdx.graphics.Color color42 = new com.badlogic.gdx.graphics.Color(color36);
        int int43 = com.badlogic.gdx.graphics.Color.rgba4444(color36);
        com.badlogic.gdx.graphics.Color color44 = color31.add(color36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color19 and color36", color19.equals(color36) ? color19.hashCode() == color36.hashCode() : true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color7 = color1.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str9 = color8.toString();
        com.badlogic.gdx.graphics.Color color11 = color1.lerp(color8, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color((float) 41903542, (float) (-1241513983), 0.0f, (float) 16777215);
        com.badlogic.gdx.graphics.Color color17 = color16.clamp();
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color(10.0f, (-1.7005551E38f), 0.0f, 2.3418409E-38f);
        com.badlogic.gdx.graphics.Color color27 = color22.set((float) (-56320), (-16384.0f), (float) 41903542, (float) (-33566977));
        int int28 = com.badlogic.gdx.graphics.Color.rgba8888(color27);
        com.badlogic.gdx.graphics.Color color29 = color17.mul(color27);
        com.badlogic.gdx.graphics.Color color30 = color8.set(color17);
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color(1.5612034E-37f, (float) (-16711680), 2.5243549E-29f, (float) (-1306385665));
        com.badlogic.gdx.graphics.Color color37 = color35.set((int) (short) 0);
        float float38 = color37.a;
        com.badlogic.gdx.graphics.Color color43 = color37.set((-4.386452E37f), (float) (-16711680), (-4.2535296E37f), (float) 1671296512);
        com.badlogic.gdx.graphics.Color color44 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color49 = color44.add((float) 100, 1.0f, (float) 0, (float) (byte) 0);
        color44.g = 151015132;
        com.badlogic.gdx.graphics.Color color57 = color44.lerp((float) (short) 10, (float) (short) 0, (float) 3840, 0.0f, (float) 52);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color44, 12346080);
        com.badlogic.gdx.graphics.Color color61 = color43.lerp(color44, (float) 2099200);
        com.badlogic.gdx.graphics.Color color62 = color17.sub(color61);
        com.badlogic.gdx.graphics.Color color64 = new com.badlogic.gdx.graphics.Color(512);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color64, (-8672));
        com.badlogic.gdx.graphics.Color color72 = color64.lerp((float) (-17826304), (float) 62730, (float) (-65486), (float) (-1880097264), (-5.4452915E37f));
        int int73 = com.badlogic.gdx.graphics.Color.rgb888(color64);
        com.badlogic.gdx.graphics.Color color75 = color61.lerp(color64, 0.0f);
        com.badlogic.gdx.graphics.Color color80 = color61.set((float) (-517931008), (float) (-2132934656), (float) (-379904), 4.2087E-41f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color8 and color80", color8.equals(color80) ? color8.hashCode() == color80.hashCode() : true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color0, (int) 'a');
        com.badlogic.gdx.graphics.Color color3 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        com.badlogic.gdx.graphics.Color color5 = color0.lerp(color3, (float) (short) 0);
        com.badlogic.gdx.graphics.Color color6 = color3.clamp();
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color7, (-59160));
        com.badlogic.gdx.graphics.Color color14 = color7.sub(0.057594743f, (float) (byte) 100, (float) 1677696502, (float) (-240));
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(1.5612034E-37f, (float) (-16711680), 2.5243549E-29f, (float) (-1306385665));
        color19.b = 65025;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str23 = lwjgl3ApplicationConfiguration22.title;
        lwjgl3ApplicationConfiguration22.a = (-1);
        boolean boolean26 = lwjgl3ApplicationConfiguration22.vSyncEnabled;
        lwjgl3ApplicationConfiguration22.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color29 = lwjgl3ApplicationConfiguration22.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color(color29);
        com.badlogic.gdx.graphics.Color color31 = new com.badlogic.gdx.graphics.Color(color30);
        com.badlogic.gdx.graphics.Color color32 = color19.sub(color30);
        float float33 = color32.toFloatBits();
        com.badlogic.gdx.graphics.Color color34 = new com.badlogic.gdx.graphics.Color(color32);
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color(color32);
        com.badlogic.gdx.graphics.Color color40 = color35.mul((float) 33488896, (-1.701386E38f), (float) (-146800768), (-1.5862616E29f));
        com.badlogic.gdx.graphics.Color color42 = color14.lerp(color35, (float) (-16776961));
        com.badlogic.gdx.graphics.Color color43 = new com.badlogic.gdx.graphics.Color(color35);
        int int44 = color43.toIntBits();
        com.badlogic.gdx.graphics.Color color45 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color50 = color45.add((float) 100, 1.0f, (float) 0, (float) (byte) 0);
        color45.g = 151015132;
        com.badlogic.gdx.graphics.Color color57 = color45.sub((float) 10L, (float) 480, (float) (-1611265692), (float) (-8672));
        com.badlogic.gdx.graphics.Color color58 = new com.badlogic.gdx.graphics.Color(color45);
        com.badlogic.gdx.graphics.Color color60 = new com.badlogic.gdx.graphics.Color(3);
        color60.a = (byte) 100;
        int int63 = com.badlogic.gdx.graphics.Color.rgb888(color60);
        color60.b = 50200831;
        com.badlogic.gdx.graphics.Color color66 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color71 = color66.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color72 = new com.badlogic.gdx.graphics.Color(color66);
        int int73 = com.badlogic.gdx.graphics.Color.argb8888(color66);
        com.badlogic.gdx.graphics.Color color75 = color66.mul((float) (-262646));
        com.badlogic.gdx.graphics.Color color77 = color75.mul((float) (-56576));
        com.badlogic.gdx.graphics.Color color78 = color60.mul(color77);
        com.badlogic.gdx.graphics.Color color80 = color60.mul((float) 33423457);
        com.badlogic.gdx.graphics.Color color81 = color45.add(color60);
        int int82 = com.badlogic.gdx.graphics.Color.rgb888(color81);
        com.badlogic.gdx.graphics.Color color83 = color43.set(color81);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color3 and color35", color3.equals(color35) ? color3.hashCode() == color35.hashCode() : true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color5 = color0.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        int int7 = com.badlogic.gdx.graphics.Color.rgb565(color6);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color6, (int) (byte) 1);
        com.badlogic.gdx.graphics.Color color11 = color6.mul((float) 573767680);
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        float float14 = color13.a;
        int int15 = color13.toIntBits();
        com.badlogic.gdx.graphics.Color color17 = color13.mul((float) (-255));
        float float18 = color17.r;
        com.badlogic.gdx.graphics.Color color19 = color11.set(color17);
        com.badlogic.gdx.graphics.Color color20 = color0.mul(color19);
        com.badlogic.gdx.graphics.Color color21 = com.badlogic.gdx.graphics.Color.GOLDENROD;
        color21.g = 35;
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color(3);
        color25.a = (byte) 100;
        com.badlogic.gdx.graphics.Color color28 = color25.clamp();
        com.badlogic.gdx.graphics.Color color33 = color28.sub((float) (-14540110), (float) (short) -1, (float) (-14513374), (float) 2);
        com.badlogic.gdx.graphics.Color color34 = color21.add(color33);
        com.badlogic.gdx.graphics.Color color35 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color40 = color35.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color41 = new com.badlogic.gdx.graphics.Color(color35);
        com.badlogic.gdx.graphics.Color color42 = new com.badlogic.gdx.graphics.Color(color41);
        int int43 = com.badlogic.gdx.graphics.Color.argb8888(color42);
        int int44 = com.badlogic.gdx.graphics.Color.argb8888(color42);
        com.badlogic.gdx.graphics.Color color46 = color42.set(3);
        com.badlogic.gdx.graphics.Color color47 = color21.sub(color46);
        com.badlogic.gdx.graphics.Color color48 = new com.badlogic.gdx.graphics.Color(color47);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color48, (-2147283968));
        com.badlogic.gdx.graphics.Color color51 = color0.add(color48);
        int int52 = com.badlogic.gdx.graphics.Color.rgba8888(color0);
        int int53 = com.badlogic.gdx.graphics.Color.rgb565(color0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color25 and color35", color25.equals(color35) ? color25.hashCode() == color35.hashCode() : true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-16252928), (-1.5659187E38f), (float) (-1L), (float) (-10887648));
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.SCARLET;
        color6.b = '#';
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color color11 = color6.lerp(color9, (float) 1L);
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.SALMON;
        float float13 = color12.toFloatBits();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str15 = lwjgl3ApplicationConfiguration14.title;
        com.badlogic.gdx.graphics.Color color16 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color16, 16);
        lwjgl3ApplicationConfiguration14.setInitialBackgroundColor(color16);
        com.badlogic.gdx.graphics.Color color24 = color16.sub((float) (-232), (float) (-255), (float) 10L, (float) 1L);
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color32 = color26.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color33 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str34 = color33.toString();
        com.badlogic.gdx.graphics.Color color36 = color26.lerp(color33, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color37 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color37, 16);
        com.badlogic.gdx.graphics.Color color40 = color36.sub(color37);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color37, 1677696502);
        com.badlogic.gdx.graphics.Color color43 = color16.sub(color37);
        com.badlogic.gdx.graphics.Color color44 = color12.add(color37);
        com.badlogic.gdx.graphics.Color color46 = color9.lerp(color37, (float) (short) 1);
        com.badlogic.gdx.graphics.Color color47 = color46.clamp();
        com.badlogic.gdx.graphics.Color color52 = color47.set((float) 570949632, (-1.4523669E17f), (-1.4523669E17f), (float) 65025);
        com.badlogic.gdx.graphics.Color color54 = color4.lerp(color52, (float) (-183869281));
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color54, 16743932);
        com.badlogic.gdx.graphics.Color color61 = color54.add((float) (-257551), (float) (-599662592), (float) 99, (float) (-2147477600));
        com.badlogic.gdx.graphics.Color color62 = new com.badlogic.gdx.graphics.Color(color54);
        com.badlogic.gdx.graphics.Color color68 = color62.lerp((float) (-2013528064), (float) (-532099584), (float) 16774372, (-2.231065E33f), 0.0f);
        com.badlogic.gdx.graphics.Color color73 = color62.set((float) (-17), (float) (-335544321), (float) 251653108, 2.2947034E-38f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color4 and color73", color4.equals(color73) ? color4.hashCode() == color73.hashCode() : true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (byte) 100);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.BLACK;
        float float3 = color2.r;
        color2.r = 1671296512;
        com.badlogic.gdx.graphics.Color color6 = color1.sub(color2);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color8 = color1.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color15 = color10.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color10);
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(color16);
        com.badlogic.gdx.graphics.Color color18 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color23 = color18.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color31 = color25.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color32 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str33 = color32.toString();
        com.badlogic.gdx.graphics.Color color35 = color25.lerp(color32, (-8.0750596E37f));
        boolean boolean36 = color18.equals((java.lang.Object) color25);
        com.badlogic.gdx.graphics.Color color37 = color17.add(color18);
        com.badlogic.gdx.graphics.Color color39 = color9.lerp(color17, (float) (-14540110));
        int int40 = com.badlogic.gdx.graphics.Color.rgb565(color9);
        com.badlogic.gdx.graphics.Color color45 = color9.mul((float) (byte) 0, (float) (byte) 100, (float) 35, (float) (-255));
        com.badlogic.gdx.graphics.Color color46 = color8.mul(color9);
        float float47 = color8.toFloatBits();
        com.badlogic.gdx.graphics.Color color48 = new com.badlogic.gdx.graphics.Color(color8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color2 and color10", color2.equals(color10) ? color2.hashCode() == color10.hashCode() : true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.GOLDENROD;
        color0.g = 35;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(3);
        color4.a = (byte) 100;
        com.badlogic.gdx.graphics.Color color7 = color4.clamp();
        com.badlogic.gdx.graphics.Color color12 = color7.sub((float) (-14540110), (float) (short) -1, (float) (-14513374), (float) 2);
        com.badlogic.gdx.graphics.Color color13 = color0.add(color12);
        com.badlogic.gdx.graphics.Color color14 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color19 = color14.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color(color14);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(color20);
        int int22 = com.badlogic.gdx.graphics.Color.argb8888(color21);
        int int23 = com.badlogic.gdx.graphics.Color.argb8888(color21);
        com.badlogic.gdx.graphics.Color color25 = color21.set(3);
        com.badlogic.gdx.graphics.Color color26 = color0.sub(color25);
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        boolean boolean29 = color26.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.graphics.Color color34 = color26.sub((float) 0L, (-4.2865007E37f), 2.3509886E-38f, (float) (-8672));
        float float35 = color26.toFloatBits();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType37 = null;
        lwjgl3ApplicationConfiguration36.setpreferencesFileType(fileType37);
        lwjgl3ApplicationConfiguration36.useVsync(false);
        lwjgl3ApplicationConfiguration36.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration36);
        boolean boolean44 = lwjgl3ApplicationConfiguration36.windowDecorated;
        com.badlogic.gdx.graphics.Color color45 = com.badlogic.gdx.graphics.Color.GREEN;
        lwjgl3ApplicationConfiguration36.setInitialBackgroundColor(color45);
        com.badlogic.gdx.graphics.Color color51 = color45.set((-2.231065E33f), (float) (-65486), (float) (-56576), (-1.6482297E38f));
        com.badlogic.gdx.graphics.Color color52 = color26.mul(color51);
        com.badlogic.gdx.graphics.Color color53 = color52.premultiplyAlpha();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration54 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int55 = lwjgl3ApplicationConfiguration54.getaudioDeviceBufferSize();
        boolean boolean56 = lwjgl3ApplicationConfiguration54.windowResizable;
        int int57 = lwjgl3ApplicationConfiguration54.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration54.setvSyncEnabled(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration60 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration54);
        com.badlogic.gdx.graphics.Color color61 = lwjgl3ApplicationConfiguration60.initialBackgroundColor;
        float float62 = color61.toFloatBits();
        com.badlogic.gdx.graphics.Color color63 = new com.badlogic.gdx.graphics.Color(color61);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration64 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode65 = null;
        lwjgl3ApplicationConfiguration64.setFullscreenMode(displayMode65);
        lwjgl3ApplicationConfiguration64.windowX = 100;
        int int69 = lwjgl3ApplicationConfiguration64.g;
        com.badlogic.gdx.Files.FileType fileType70 = lwjgl3ApplicationConfiguration64.getpreferencesFileType();
        boolean boolean71 = lwjgl3ApplicationConfiguration64.windowDecorated;
        com.badlogic.gdx.graphics.Color color72 = lwjgl3ApplicationConfiguration64.initialBackgroundColor;
        int int73 = com.badlogic.gdx.graphics.Color.rgba8888(color72);
        com.badlogic.gdx.graphics.Color color74 = color61.add(color72);
        color74.g = 0.0f;
        com.badlogic.gdx.graphics.Color color78 = color74.set((-11280864));
        com.badlogic.gdx.graphics.Color color84 = color74.lerp((-1.4762738E38f), (float) (-11777024), (float) 67043080, (float) 16, (float) (-405213696));
        com.badlogic.gdx.graphics.Color color85 = color53.set(color84);
        com.badlogic.gdx.graphics.Color color87 = color85.mul(0.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color85, 268435455);
        com.badlogic.gdx.graphics.Color color91 = color85.mul((float) 45312);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color91 and color63", color91.equals(color63) ? color91.hashCode() == color63.hashCode() : true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowY = 8;
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color13 = color11.set(color12);
        com.badlogic.gdx.graphics.Color color14 = color13.cpy();
        color14.a = 16777215;
        com.badlogic.gdx.graphics.Color color21 = color14.set((float) 65025, (float) 537395200, (float) (-652800), (float) (-1109610));
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color14);
        int int23 = lwjgl3ApplicationConfiguration0.a;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color5 and color11", color5.equals(color11) ? color5.hashCode() == color11.hashCode() : true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.GOLDENROD;
        color0.g = 35;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(3);
        color4.a = (byte) 100;
        com.badlogic.gdx.graphics.Color color7 = color4.clamp();
        com.badlogic.gdx.graphics.Color color12 = color7.sub((float) (-14540110), (float) (short) -1, (float) (-14513374), (float) 2);
        com.badlogic.gdx.graphics.Color color13 = color0.add(color12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType15 = null;
        lwjgl3ApplicationConfiguration14.setpreferencesFileType(fileType15);
        lwjgl3ApplicationConfiguration14.useVsync(false);
        com.badlogic.gdx.graphics.Color color19 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration14.initialBackgroundColor = color19;
        lwjgl3ApplicationConfiguration14.setDecorated(false);
        lwjgl3ApplicationConfiguration14.disableAudio = false;
        boolean boolean25 = lwjgl3ApplicationConfiguration14.getvSyncEnabled();
        lwjgl3ApplicationConfiguration14.windowDecorated = false;
        int int28 = lwjgl3ApplicationConfiguration14.getwindowHeight();
        int int29 = lwjgl3ApplicationConfiguration14.gles30ContextMajorVersion;
        com.badlogic.gdx.graphics.Color color34 = new com.badlogic.gdx.graphics.Color((float) 1470693630, (float) 10, (-1.6482297E38f), (float) 49939200);
        com.badlogic.gdx.graphics.Color color35 = color34.clamp();
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color(color34);
        com.badlogic.gdx.graphics.Color color41 = color36.mul((float) (-2048), (float) (-8520704), (float) (-14911125), (float) (-780810));
        lwjgl3ApplicationConfiguration14.initialBackgroundColor = color36;
        com.badlogic.gdx.graphics.Color color44 = color13.lerp(color36, (-1.24151398E9f));
        color44.b = 14336;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color44 and color19", color44.equals(color19) ? color44.hashCode() == color19.hashCode() : true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (short) -1, 1.6598767E-38f, 2.3418052E-38f, 2.3418409E-38f);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.GOLDENROD;
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.BLACK;
        float float7 = color6.r;
        com.badlogic.gdx.graphics.Color color12 = color6.sub((float) (-14513374), (float) 151015132, 0.0f, (float) 1L);
        com.badlogic.gdx.graphics.Color color17 = color6.set((float) (short) -1, (float) 524288, (float) (-1), 9.18893E-39f);
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color19 = color5.sub(color6);
        int int20 = com.badlogic.gdx.graphics.Color.rgba4444(color6);
        com.badlogic.gdx.graphics.Color color21 = color4.add(color6);
        com.badlogic.gdx.graphics.Color color26 = color6.sub((-1.608361E38f), (float) 570294272, (float) (-1073783552), (float) (-194841600));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color4 and color18", color4.equals(color18) ? color4.hashCode() == color18.hashCode() : true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str1 = color0.toString();
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color7 = color2.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color2);
        int int9 = com.badlogic.gdx.graphics.Color.argb8888(color2);
        com.badlogic.gdx.graphics.Color color15 = color2.lerp((float) (-1611265692), (float) 524288, (float) 6356992, (-1.7013883E38f), 0.30588236f);
        com.badlogic.gdx.graphics.Color color20 = color15.set((float) (-2), (float) (-16719105), (-1.24151398E9f), 2.5243549E-29f);
        com.badlogic.gdx.graphics.Color color21 = color0.sub(color20);
        color0.g = 9.1834E-41f;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color2 and color0", color2.equals(color0) ? color2.hashCode() == color0.hashCode() : true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((-1.4936944E38f), 2.3418052E-38f, (float) ' ', (float) 65535);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color7 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color12 = color7.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color13 = color6.sub(color12);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color6, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color17 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color color19 = color17.mul((float) (-14513374));
        com.badlogic.gdx.graphics.Color color20 = color16.set(color17);
        com.badlogic.gdx.graphics.Color color21 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color21, (int) 'a');
        com.badlogic.gdx.graphics.Color color24 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        com.badlogic.gdx.graphics.Color color26 = color21.lerp(color24, (float) (short) 0);
        com.badlogic.gdx.graphics.Color color27 = color24.clamp();
        int int28 = com.badlogic.gdx.graphics.Color.rgb888(color24);
        com.badlogic.gdx.graphics.Color color29 = color17.add(color24);
        com.badlogic.gdx.graphics.Color color30 = color4.set(color24);
        com.badlogic.gdx.graphics.Color color32 = new com.badlogic.gdx.graphics.Color((-128));
        com.badlogic.gdx.graphics.Color color33 = color24.sub(color32);
        color33.b = (-2005368832);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color4 and color33", color4.equals(color33) ? color4.hashCode() == color33.hashCode() : true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.GOLDENROD;
        color0.g = 35;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(3);
        color4.a = (byte) 100;
        com.badlogic.gdx.graphics.Color color7 = color4.clamp();
        com.badlogic.gdx.graphics.Color color12 = color7.sub((float) (-14540110), (float) (short) -1, (float) (-14513374), (float) 2);
        com.badlogic.gdx.graphics.Color color13 = color0.add(color12);
        com.badlogic.gdx.graphics.Color color14 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color19 = color14.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color(color14);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(color20);
        int int22 = com.badlogic.gdx.graphics.Color.argb8888(color21);
        int int23 = com.badlogic.gdx.graphics.Color.argb8888(color21);
        com.badlogic.gdx.graphics.Color color25 = color21.set(3);
        com.badlogic.gdx.graphics.Color color26 = color0.sub(color25);
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        boolean boolean29 = color26.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.graphics.Color color34 = color26.sub((float) 0L, (-4.2865007E37f), 2.3509886E-38f, (float) (-8672));
        float float35 = color26.toFloatBits();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType37 = null;
        lwjgl3ApplicationConfiguration36.setpreferencesFileType(fileType37);
        lwjgl3ApplicationConfiguration36.useVsync(false);
        lwjgl3ApplicationConfiguration36.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration36);
        boolean boolean44 = lwjgl3ApplicationConfiguration36.windowDecorated;
        com.badlogic.gdx.graphics.Color color45 = com.badlogic.gdx.graphics.Color.GREEN;
        lwjgl3ApplicationConfiguration36.setInitialBackgroundColor(color45);
        com.badlogic.gdx.graphics.Color color51 = color45.set((-2.231065E33f), (float) (-65486), (float) (-56576), (-1.6482297E38f));
        com.badlogic.gdx.graphics.Color color52 = color26.mul(color51);
        com.badlogic.gdx.graphics.Color color53 = color52.premultiplyAlpha();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration54 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int55 = lwjgl3ApplicationConfiguration54.getaudioDeviceBufferSize();
        boolean boolean56 = lwjgl3ApplicationConfiguration54.windowResizable;
        int int57 = lwjgl3ApplicationConfiguration54.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration54.setvSyncEnabled(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration60 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration54);
        com.badlogic.gdx.graphics.Color color61 = lwjgl3ApplicationConfiguration60.initialBackgroundColor;
        float float62 = color61.toFloatBits();
        com.badlogic.gdx.graphics.Color color63 = new com.badlogic.gdx.graphics.Color(color61);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration64 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode65 = null;
        lwjgl3ApplicationConfiguration64.setFullscreenMode(displayMode65);
        lwjgl3ApplicationConfiguration64.windowX = 100;
        int int69 = lwjgl3ApplicationConfiguration64.g;
        com.badlogic.gdx.Files.FileType fileType70 = lwjgl3ApplicationConfiguration64.getpreferencesFileType();
        boolean boolean71 = lwjgl3ApplicationConfiguration64.windowDecorated;
        com.badlogic.gdx.graphics.Color color72 = lwjgl3ApplicationConfiguration64.initialBackgroundColor;
        int int73 = com.badlogic.gdx.graphics.Color.rgba8888(color72);
        com.badlogic.gdx.graphics.Color color74 = color61.add(color72);
        color74.g = 0.0f;
        com.badlogic.gdx.graphics.Color color78 = color74.set((-11280864));
        com.badlogic.gdx.graphics.Color color84 = color74.lerp((-1.4762738E38f), (float) (-11777024), (float) 67043080, (float) 16, (float) (-405213696));
        com.badlogic.gdx.graphics.Color color85 = color53.set(color84);
        com.badlogic.gdx.graphics.Color color87 = color85.mul(0.0f);
        float float88 = color87.b;
        int int89 = com.badlogic.gdx.graphics.Color.rgba4444(color87);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color4 and color14", color4.equals(color14) ? color4.hashCode() == color14.hashCode() : true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("ffff72ff");
        int int9 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.windowX = 512;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.stencil = (-1306385665);
        int int15 = lwjgl3ApplicationConfiguration0.a;
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color((int) (byte) 100);
        com.badlogic.gdx.graphics.Color color18 = com.badlogic.gdx.graphics.Color.BLACK;
        float float19 = color18.r;
        color18.r = 1671296512;
        com.badlogic.gdx.graphics.Color color22 = color17.sub(color18);
        com.badlogic.gdx.graphics.Color color24 = color18.set((-16711923));
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color27 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color32 = color27.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color33 = color26.sub(color32);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color26, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color(color26);
        color26.g = 0.8666667f;
        com.badlogic.gdx.graphics.Color color39 = color18.add(color26);
        com.badlogic.gdx.graphics.Color color40 = new com.badlogic.gdx.graphics.Color(color26);
        com.badlogic.gdx.graphics.Color color41 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color42 = color41.cpy();
        int int43 = com.badlogic.gdx.graphics.Color.argb8888(color42);
        com.badlogic.gdx.graphics.Color color44 = com.badlogic.gdx.graphics.Color.FOREST;
        int int45 = com.badlogic.gdx.graphics.Color.argb8888(color44);
        com.badlogic.gdx.graphics.Color color47 = color42.lerp(color44, (float) (-50396672));
        int int48 = com.badlogic.gdx.graphics.Color.argb8888(color47);
        com.badlogic.gdx.graphics.Color color49 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color50 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color55 = color50.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color56 = new com.badlogic.gdx.graphics.Color(color50);
        com.badlogic.gdx.graphics.Color color57 = new com.badlogic.gdx.graphics.Color(color56);
        com.badlogic.gdx.graphics.Color color58 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color63 = color58.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color65 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color71 = color65.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color72 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str73 = color72.toString();
        com.badlogic.gdx.graphics.Color color75 = color65.lerp(color72, (-8.0750596E37f));
        boolean boolean76 = color58.equals((java.lang.Object) color65);
        com.badlogic.gdx.graphics.Color color77 = color57.add(color58);
        com.badlogic.gdx.graphics.Color color79 = color49.lerp(color57, (float) (-14540110));
        int int80 = com.badlogic.gdx.graphics.Color.rgb565(color49);
        com.badlogic.gdx.graphics.Color color81 = color47.sub(color49);
        color47.r = (-240);
        com.badlogic.gdx.graphics.Color color84 = new com.badlogic.gdx.graphics.Color(color47);
        com.badlogic.gdx.graphics.Color color86 = color84.mul((float) (byte) 10);
        com.badlogic.gdx.graphics.Color color87 = color26.set(color84);
        com.badlogic.gdx.graphics.Color color92 = color84.set((float) 160, (float) 299695904, (float) 512, (float) (-587202461));
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color92);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color26 and color41", color26.equals(color41) ? color26.hashCode() == color41.hashCode() : true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 10L, (float) 1, (float) 0, (float) (short) -1);
        color4.b = (-1241513983);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color4, (int) (byte) 100);
        com.badlogic.gdx.graphics.Color color11 = color4.mul((float) 16580354);
        color11.r = 3855;
        com.badlogic.gdx.graphics.Color color14 = com.badlogic.gdx.graphics.Color.SKY;
        int int15 = com.badlogic.gdx.graphics.Color.argb8888(color14);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str17 = lwjgl3ApplicationConfiguration16.title;
        lwjgl3ApplicationConfiguration16.a = (-1);
        boolean boolean20 = lwjgl3ApplicationConfiguration16.vSyncEnabled;
        lwjgl3ApplicationConfiguration16.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color23 = lwjgl3ApplicationConfiguration16.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color24 = color14.mul(color23);
        com.badlogic.gdx.graphics.Color color25 = color23.cpy();
        com.badlogic.gdx.graphics.Color color26 = color11.set(color23);
        com.badlogic.gdx.graphics.Color color27 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color32 = color27.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color34 = color27.mul((-5.9417005E37f));
        com.badlogic.gdx.graphics.Color color39 = color27.add((float) 3276808, (float) (-579592), 0.0f, (float) 2047);
        com.badlogic.gdx.graphics.Color color40 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color41 = color40.cpy();
        int int42 = com.badlogic.gdx.graphics.Color.argb8888(color41);
        com.badlogic.gdx.graphics.Color color43 = com.badlogic.gdx.graphics.Color.FOREST;
        int int44 = com.badlogic.gdx.graphics.Color.argb8888(color43);
        com.badlogic.gdx.graphics.Color color46 = color41.lerp(color43, (float) (-50396672));
        com.badlogic.gdx.graphics.Color color47 = color39.sub(color46);
        com.badlogic.gdx.graphics.Color color48 = color11.mul(color47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color40 and color41", color40.equals(color41) ? color40.hashCode() == color41.hashCode() : true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color5, 100);
        com.badlogic.gdx.graphics.Color color9 = color5.mul(100.0f);
        com.badlogic.gdx.graphics.Color color14 = color5.add((float) 65024, (float) (-2130837248), (float) (-255), (float) 31334400);
        com.badlogic.gdx.graphics.Color color15 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color20 = color15.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(color15);
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color(color21);
        java.lang.String str23 = color21.toString();
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color(color21);
        com.badlogic.gdx.graphics.Color color26 = color14.lerp(color24, (-1.515294E38f));
        com.badlogic.gdx.graphics.Color color31 = color14.mul((float) (-146800768), (float) 587202559, (float) (-32), (float) (-1879860224));
        com.badlogic.gdx.graphics.Color color33 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color41 = color35.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color42 = color33.mul(color41);
        com.badlogic.gdx.graphics.Color color43 = new com.badlogic.gdx.graphics.Color(color33);
        color33.r = (byte) 10;
        color33.r = 167247232;
        com.badlogic.gdx.graphics.Color color48 = color14.set(color33);
        color14.a = 1.1802158E-30f;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color14 and color33", color14.equals(color33) ? color14.hashCode() == color33.hashCode() : true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color0);
        int int7 = com.badlogic.gdx.graphics.Color.argb8888(color0);
        int int8 = color0.toIntBits();
        com.badlogic.gdx.graphics.Color color9 = color0.cpy();
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color9, (-14513374));
        float float12 = color9.toFloatBits();
        com.badlogic.gdx.graphics.Color color13 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color18 = color13.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color18, 100);
        com.badlogic.gdx.graphics.Color color22 = color18.mul(100.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color22, 8897069);
        com.badlogic.gdx.graphics.Color color25 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color30 = color25.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color31 = new com.badlogic.gdx.graphics.Color(color25);
        com.badlogic.gdx.graphics.Color color32 = new com.badlogic.gdx.graphics.Color(color31);
        int int33 = com.badlogic.gdx.graphics.Color.argb8888(color32);
        int int34 = com.badlogic.gdx.graphics.Color.rgba8888(color32);
        com.badlogic.gdx.graphics.Color color36 = color22.lerp(color32, (float) 1044480);
        com.badlogic.gdx.graphics.Color color37 = new com.badlogic.gdx.graphics.Color();
        com.badlogic.gdx.graphics.Color color38 = color22.sub(color37);
        com.badlogic.gdx.graphics.Color color40 = color37.set(1794115036);
        com.badlogic.gdx.graphics.Color color41 = color37.premultiplyAlpha();
        int int42 = color37.toIntBits();
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color37, (-67111040));
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color37, 8256822);
        float float47 = color37.b;
        com.badlogic.gdx.graphics.Color color48 = color9.sub(color37);
        com.badlogic.gdx.graphics.Color color50 = color9.set((-884784));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color0 and color6", color0.equals(color6) ? color0.hashCode() == color6.hashCode() : true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color13 = color12.cpy();
        int int14 = com.badlogic.gdx.graphics.Color.argb8888(color13);
        com.badlogic.gdx.graphics.Color color15 = com.badlogic.gdx.graphics.Color.FOREST;
        int int16 = com.badlogic.gdx.graphics.Color.argb8888(color15);
        com.badlogic.gdx.graphics.Color color18 = color13.lerp(color15, (float) (-50396672));
        int int19 = com.badlogic.gdx.graphics.Color.argb8888(color18);
        com.badlogic.gdx.graphics.Color color20 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color21 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color26 = color21.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(color21);
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color(color27);
        com.badlogic.gdx.graphics.Color color29 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color34 = color29.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color42 = color36.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color43 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str44 = color43.toString();
        com.badlogic.gdx.graphics.Color color46 = color36.lerp(color43, (-8.0750596E37f));
        boolean boolean47 = color29.equals((java.lang.Object) color36);
        com.badlogic.gdx.graphics.Color color48 = color28.add(color29);
        com.badlogic.gdx.graphics.Color color50 = color20.lerp(color28, (float) (-14540110));
        int int51 = com.badlogic.gdx.graphics.Color.rgb565(color20);
        com.badlogic.gdx.graphics.Color color52 = color18.sub(color20);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color18;
        boolean boolean54 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int55 = lwjgl3ApplicationConfiguration0.r;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode56 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode56;
        int int58 = lwjgl3ApplicationConfiguration0.windowHeight;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode59 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode59;
        lwjgl3ApplicationConfiguration0.g = (-1543503872);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color12 and color13", color12.equals(color13) ? color12.hashCode() == color13.hashCode() : true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int6 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color9;
        com.badlogic.gdx.graphics.Color color11 = color9.cpy();
        com.badlogic.gdx.graphics.Color color13 = color11.mul(0.057594743f);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(61450);
        com.badlogic.gdx.graphics.Color color16 = color11.mul(color15);
        color16.a = (-524536);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(color16);
        color16.g = (-8685688);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color16 and color19", color16.equals(color19) ? color16.hashCode() == color19.hashCode() : true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.stencil;
        int int6 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.a = 43268;
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getwindowX();
        com.badlogic.gdx.graphics.Color color11 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        color11.a = 35;
        com.badlogic.gdx.graphics.Color color14 = new com.badlogic.gdx.graphics.Color(color11);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(color11);
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color((-0.49791527f), (float) 8, (float) (-32), (float) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration21.setDecorated(false);
        lwjgl3ApplicationConfiguration21.a = (byte) 10;
        boolean boolean26 = lwjgl3ApplicationConfiguration21.initialVisible;
        int int27 = lwjgl3ApplicationConfiguration21.b;
        lwjgl3ApplicationConfiguration21.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color30 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration21.initialBackgroundColor = color30;
        com.badlogic.gdx.graphics.Color color32 = color30.clamp();
        com.badlogic.gdx.graphics.Color color34 = color20.lerp(color32, (float) (-2336));
        com.badlogic.gdx.graphics.Color color35 = color15.add(color20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str37 = lwjgl3ApplicationConfiguration36.title;
        lwjgl3ApplicationConfiguration36.a = (-1);
        boolean boolean40 = lwjgl3ApplicationConfiguration36.vSyncEnabled;
        lwjgl3ApplicationConfiguration36.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color43 = lwjgl3ApplicationConfiguration36.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color44 = new com.badlogic.gdx.graphics.Color(color43);
        com.badlogic.gdx.graphics.Color color46 = new com.badlogic.gdx.graphics.Color((-16711680));
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color46, (-16734721));
        com.badlogic.gdx.graphics.Color color49 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color54 = color49.add((float) (byte) 100, (float) 41903542, (float) (short) 10, (-1.6947917E38f));
        com.badlogic.gdx.graphics.Color color55 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color56 = color55.cpy();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color56, 1);
        float float59 = color56.r;
        com.badlogic.gdx.graphics.Color color60 = color49.sub(color56);
        com.badlogic.gdx.graphics.Color color61 = color46.set(color49);
        com.badlogic.gdx.graphics.Color color62 = color44.add(color49);
        com.badlogic.gdx.graphics.Color color63 = new com.badlogic.gdx.graphics.Color(color62);
        com.badlogic.gdx.graphics.Color color64 = color35.set(color62);
        com.badlogic.gdx.graphics.Color color65 = color35.clamp();
        color35.b = (-17826304);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color11 and color44", color11.equals(color44) ? color11.hashCode() == color44.hashCode() : true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-255), 100.0f, (float) (byte) 100, (float) 41903542);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color10 = color5.add((float) 100, 1.0f, (float) 0, (float) (byte) 0);
        java.lang.String str11 = color10.toString();
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color10, 1);
        com.badlogic.gdx.graphics.Color color18 = color10.mul((float) 41903542, (float) (-8672), (float) (-50135050), (float) (-10));
        com.badlogic.gdx.graphics.Color color24 = color18.lerp((float) (-65025), (-0.0f), (float) (-65486), (float) (byte) 10, (float) (-1L));
        com.badlogic.gdx.graphics.Color color29 = color24.set((float) 1, (float) 255, (-5.68232E37f), (float) 1677696502);
        float float30 = color24.toFloatBits();
        com.badlogic.gdx.graphics.Color color31 = color4.mul(color24);
        com.badlogic.gdx.graphics.Color color33 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color34 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color35 = color33.set(color34);
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color(color33);
        com.badlogic.gdx.graphics.Color color37 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color38 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color43 = color38.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color44 = new com.badlogic.gdx.graphics.Color(color38);
        com.badlogic.gdx.graphics.Color color45 = new com.badlogic.gdx.graphics.Color(color44);
        com.badlogic.gdx.graphics.Color color46 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color51 = color46.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color53 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color59 = color53.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color60 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str61 = color60.toString();
        com.badlogic.gdx.graphics.Color color63 = color53.lerp(color60, (-8.0750596E37f));
        boolean boolean64 = color46.equals((java.lang.Object) color53);
        com.badlogic.gdx.graphics.Color color65 = color45.add(color46);
        com.badlogic.gdx.graphics.Color color67 = color37.lerp(color45, (float) (-14540110));
        com.badlogic.gdx.graphics.Color color68 = new com.badlogic.gdx.graphics.Color(color37);
        com.badlogic.gdx.graphics.Color color69 = color33.sub(color37);
        com.badlogic.gdx.graphics.Color color70 = color37.cpy();
        com.badlogic.gdx.graphics.Color color71 = color4.sub(color37);
        com.badlogic.gdx.graphics.Color color72 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color77 = color72.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color78 = color72.cpy();
        com.badlogic.gdx.graphics.Color color83 = new com.badlogic.gdx.graphics.Color(0.11764706f, (float) 65295, 0.0f, (float) (-1306385665));
        com.badlogic.gdx.graphics.Color color84 = color72.sub(color83);
        com.badlogic.gdx.graphics.Color color85 = color71.mul(color72);
        int int86 = com.badlogic.gdx.graphics.Color.rgba8888(color72);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color72, 28172);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color4 and color33", color4.equals(color33) ? color4.hashCode() == color33.hashCode() : true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color7 = color2.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color8 = color1.sub(color7);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color1, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color color14 = color12.mul((float) (-14513374));
        com.badlogic.gdx.graphics.Color color15 = color11.set(color12);
        color11.g = 256;
        int int18 = com.badlogic.gdx.graphics.Color.argb8888(color11);
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color21 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color22 = color20.set(color21);
        com.badlogic.gdx.graphics.Color color23 = new com.badlogic.gdx.graphics.Color(color20);
        com.badlogic.gdx.graphics.Color color24 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color25 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color30 = color25.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color31 = new com.badlogic.gdx.graphics.Color(color25);
        com.badlogic.gdx.graphics.Color color32 = new com.badlogic.gdx.graphics.Color(color31);
        com.badlogic.gdx.graphics.Color color33 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color38 = color33.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color40 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color46 = color40.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color47 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str48 = color47.toString();
        com.badlogic.gdx.graphics.Color color50 = color40.lerp(color47, (-8.0750596E37f));
        boolean boolean51 = color33.equals((java.lang.Object) color40);
        com.badlogic.gdx.graphics.Color color52 = color32.add(color33);
        com.badlogic.gdx.graphics.Color color54 = color24.lerp(color32, (float) (-14540110));
        com.badlogic.gdx.graphics.Color color55 = new com.badlogic.gdx.graphics.Color(color24);
        com.badlogic.gdx.graphics.Color color56 = color20.sub(color24);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration57 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration57.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        com.badlogic.gdx.graphics.Color color66 = lwjgl3ApplicationConfiguration57.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color67 = color20.sub(color66);
        com.badlogic.gdx.graphics.Color color72 = color20.sub(0.0f, (float) 6147990, (float) 2147483647, 0.0f);
        com.badlogic.gdx.graphics.Color color73 = color11.mul(color72);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration74 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration74.setDecorated(false);
        lwjgl3ApplicationConfiguration74.a = (byte) 10;
        boolean boolean79 = lwjgl3ApplicationConfiguration74.initialVisible;
        int int80 = lwjgl3ApplicationConfiguration74.b;
        lwjgl3ApplicationConfiguration74.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color83 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration74.initialBackgroundColor = color83;
        com.badlogic.gdx.graphics.Color color85 = color83.cpy();
        float float86 = color83.a;
        com.badlogic.gdx.graphics.Color color88 = color83.set(50918400);
        com.badlogic.gdx.graphics.Color color89 = color73.sub(color83);
        int int90 = com.badlogic.gdx.graphics.Color.rgba4444(color73);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color2 and color21", color2.equals(color21) ? color2.hashCode() == color21.hashCode() : true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color0, (-256));
        com.badlogic.gdx.graphics.Color color4 = color0.mul((float) 58111);
        com.badlogic.gdx.graphics.Color color5 = color4.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color((float) (-2015879168), (float) (-2147283968), (float) 16711680, (-1.6974137E38f));
        com.badlogic.gdx.graphics.Color color11 = color5.add(color10);
        color11.g = (-184553728);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color11 and color10", color11.equals(color10) ? color11.hashCode() == color10.hashCode() : true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setwindowHeight((int) (byte) 10);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color14 = color9.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color15 = color8.sub(color14);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color8, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color22 = color8.set(1.561203E-39f, (float) 2, (float) (byte) -1, (float) 3);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3ApplicationConfiguration0.setwindowX(97);
        com.badlogic.gdx.graphics.Color color26 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(color26);
        com.badlogic.gdx.graphics.Color color28 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str29 = color28.toString();
        com.badlogic.gdx.graphics.Color color31 = color28.set((-62986));
        com.badlogic.gdx.graphics.Color color32 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str33 = color32.toString();
        com.badlogic.gdx.graphics.Color color35 = color32.set((-62986));
        com.badlogic.gdx.graphics.Color color36 = color31.sub(color35);
        com.badlogic.gdx.graphics.Color color37 = color26.add(color35);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color35);
        com.badlogic.gdx.graphics.Color color39 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color40 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean42 = lwjgl3ApplicationConfiguration0.windowDecorated;
        int int43 = lwjgl3ApplicationConfiguration0.g;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color26 and color27", color26.equals(color27) ? color26.hashCode() == color27.hashCode() : true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setwindowHeight((int) (byte) 10);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color14 = color9.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color15 = color8.sub(color14);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color8, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color22 = color8.set(1.561203E-39f, (float) 2, (float) (byte) -1, (float) 3);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color22);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3ApplicationConfiguration24.setFullscreenMode(displayMode25);
        lwjgl3ApplicationConfiguration24.samples = '4';
        int int29 = lwjgl3ApplicationConfiguration24.r;
        lwjgl3ApplicationConfiguration24.setwindowY(1671296512);
        lwjgl3ApplicationConfiguration24.setAudioConfig(640, 8897069, (-62986));
        boolean boolean36 = color22.equals((java.lang.Object) (-62986));
        com.badlogic.gdx.graphics.Color color38 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color40 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color46 = color40.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color47 = color38.mul(color46);
        com.badlogic.gdx.graphics.Color color49 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color55 = color49.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        color55.g = (short) 1;
        com.badlogic.gdx.graphics.Color color59 = color47.lerp(color55, (float) 25500);
        com.badlogic.gdx.graphics.Color color60 = new com.badlogic.gdx.graphics.Color(color47);
        int int61 = com.badlogic.gdx.graphics.Color.rgba4444(color60);
        int int62 = com.badlogic.gdx.graphics.Color.rgba4444(color60);
        com.badlogic.gdx.graphics.Color color67 = new com.badlogic.gdx.graphics.Color(1.5612034E-37f, (float) (-16711680), 2.5243549E-29f, (float) (-1306385665));
        com.badlogic.gdx.graphics.Color color68 = new com.badlogic.gdx.graphics.Color(color67);
        com.badlogic.gdx.graphics.Color color70 = color60.lerp(color68, (float) 20160);
        com.badlogic.gdx.graphics.Color color71 = color22.add(color68);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color60 and color67", color60.equals(color67) ? color60.hashCode() == color67.hashCode() : true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color5, 100);
        com.badlogic.gdx.graphics.Color color9 = color5.mul(100.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color9, 8897069);
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color17 = color12.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(color12);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(color18);
        int int20 = com.badlogic.gdx.graphics.Color.argb8888(color19);
        int int21 = com.badlogic.gdx.graphics.Color.rgba8888(color19);
        com.badlogic.gdx.graphics.Color color23 = color9.lerp(color19, (float) 1044480);
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color(color19);
        com.badlogic.gdx.graphics.Color color30 = color24.lerp(1.0f, (float) 13119, (float) (-16777199), (float) (-16711680), (float) (-201326593));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str32 = lwjgl3ApplicationConfiguration31.title;
        com.badlogic.gdx.graphics.Color color33 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color33, 16);
        lwjgl3ApplicationConfiguration31.setInitialBackgroundColor(color33);
        com.badlogic.gdx.graphics.Color color41 = color33.sub((float) (-232), (float) (-255), (float) 10L, (float) 1L);
        com.badlogic.gdx.graphics.Color color43 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color49 = color43.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color50 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str51 = color50.toString();
        com.badlogic.gdx.graphics.Color color53 = color43.lerp(color50, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color54 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color54, 16);
        com.badlogic.gdx.graphics.Color color57 = color53.sub(color54);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color54, 1677696502);
        com.badlogic.gdx.graphics.Color color60 = color33.sub(color54);
        int int61 = com.badlogic.gdx.graphics.Color.argb8888(color54);
        com.badlogic.gdx.graphics.Color color62 = color30.set(color54);
        int int63 = color54.toIntBits();
        com.badlogic.gdx.graphics.Color color64 = com.badlogic.gdx.graphics.Color.SCARLET;
        color64.b = '#';
        com.badlogic.gdx.graphics.Color color67 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color color69 = color64.lerp(color67, (float) 1L);
        com.badlogic.gdx.graphics.Color color70 = color67.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color71 = new com.badlogic.gdx.graphics.Color(color70);
        com.badlogic.gdx.graphics.Color color72 = color54.sub(color70);
        color72.a = 1.7347762E-18f;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color24 and color72", color24.equals(color72) ? color24.hashCode() == color72.hashCode() : true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-1308557313));
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color((-16711680));
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color3, (-16734721));
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color11 = color6.add((float) (byte) 100, (float) 41903542, (float) (short) 10, (-1.6947917E38f));
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color13 = color12.cpy();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color13, 1);
        float float16 = color13.r;
        com.badlogic.gdx.graphics.Color color17 = color6.sub(color13);
        com.badlogic.gdx.graphics.Color color18 = color3.set(color6);
        com.badlogic.gdx.graphics.Color color19 = color1.sub(color18);
        int int20 = com.badlogic.gdx.graphics.Color.rgb888(color19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType22 = null;
        lwjgl3ApplicationConfiguration21.setpreferencesFileType(fileType22);
        lwjgl3ApplicationConfiguration21.disableAudio = true;
        int int26 = lwjgl3ApplicationConfiguration21.windowY;
        int int27 = lwjgl3ApplicationConfiguration21.audioDeviceBufferCount;
        int int28 = lwjgl3ApplicationConfiguration21.a;
        boolean boolean29 = lwjgl3ApplicationConfiguration21.getvSyncEnabled();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode30 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration21.hdpiMode = hdpiMode30;
        lwjgl3ApplicationConfiguration21.windowX = 512;
        lwjgl3ApplicationConfiguration21.setuseGL30(true);
        lwjgl3ApplicationConfiguration21.b = (-127286);
        boolean boolean38 = color19.equals((java.lang.Object) lwjgl3ApplicationConfiguration21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color19 and color13", color19.equals(color13) ? color19.hashCode() == color13.hashCode() : true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(2.1862947E-38f, (float) 11280416, 0.13725491f, (float) 537395200);
        float float5 = color4.g;
        com.badlogic.gdx.graphics.Color color11 = color4.lerp((-1.6969465E38f), (float) 511, (float) 123030, 1.0384907E34f, (float) (short) -1);
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        com.badlogic.gdx.graphics.Color color13 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color14 = color12.mul(color13);
        float float15 = color14.r;
        color14.a = (-5.360365E37f);
        com.badlogic.gdx.graphics.Color color18 = color14.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color20 = color11.lerp(color18, (float) 5);
        color18.b = (-218476203);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color4 and color18", color4.equals(color18) ? color4.hashCode() == color18.hashCode() : true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0.0f, (-1.6969465E38f), (float) (short) 10, (float) (-55800));
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color((float) (-128512), (float) (-1902614), (float) 573767680, (float) (-1));
        com.badlogic.gdx.graphics.Color color11 = color4.lerp(color9, (float) (-1109610));
        color11.a = (-124);
        color11.a = (-1789779968);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color11 and color9", color11.equals(color9) ? color11.hashCode() == color9.hashCode() : true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color2, 16);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color2);
        com.badlogic.gdx.graphics.Color color10 = color2.sub((float) (-232), (float) (-255), (float) 10L, (float) 1L);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color18 = color12.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color19 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str20 = color19.toString();
        com.badlogic.gdx.graphics.Color color22 = color12.lerp(color19, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color23 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color23, 16);
        com.badlogic.gdx.graphics.Color color26 = color22.sub(color23);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color23, 1677696502);
        com.badlogic.gdx.graphics.Color color29 = color2.sub(color23);
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color(color29);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color29, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str34 = lwjgl3ApplicationConfiguration33.title;
        lwjgl3ApplicationConfiguration33.a = (-1);
        boolean boolean37 = lwjgl3ApplicationConfiguration33.vSyncEnabled;
        lwjgl3ApplicationConfiguration33.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color40 = lwjgl3ApplicationConfiguration33.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color41 = color40.clamp();
        color40.a = (-1.4936944E38f);
        com.badlogic.gdx.graphics.Color color45 = color40.set(33554176);
        com.badlogic.gdx.graphics.Color color47 = color45.mul(0.0f);
        color45.a = (-4.5858366E37f);
        com.badlogic.gdx.graphics.Color color51 = color29.lerp(color45, (float) 318766848);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color51 and color45", color51.equals(color45) ? color51.hashCode() == color45.hashCode() : true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color1 = color0.cpy();
        int int2 = com.badlogic.gdx.graphics.Color.argb8888(color1);
        com.badlogic.gdx.graphics.Color color3 = com.badlogic.gdx.graphics.Color.FOREST;
        int int4 = com.badlogic.gdx.graphics.Color.argb8888(color3);
        com.badlogic.gdx.graphics.Color color6 = color1.lerp(color3, (float) (-50396672));
        int int7 = com.badlogic.gdx.graphics.Color.argb8888(color6);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color14 = color9.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(color9);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color15);
        com.badlogic.gdx.graphics.Color color17 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color22 = color17.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color30 = color24.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color31 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str32 = color31.toString();
        com.badlogic.gdx.graphics.Color color34 = color24.lerp(color31, (-8.0750596E37f));
        boolean boolean35 = color17.equals((java.lang.Object) color24);
        com.badlogic.gdx.graphics.Color color36 = color16.add(color17);
        com.badlogic.gdx.graphics.Color color38 = color8.lerp(color16, (float) (-14540110));
        int int39 = com.badlogic.gdx.graphics.Color.rgb565(color8);
        com.badlogic.gdx.graphics.Color color40 = color6.sub(color8);
        float float41 = color40.toFloatBits();
        int int42 = com.badlogic.gdx.graphics.Color.rgb565(color40);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration43.setdepth((int) (byte) 1);
        lwjgl3ApplicationConfiguration43.setwindowWidth((int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration48 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode49 = null;
        lwjgl3ApplicationConfiguration48.setFullscreenMode(displayMode49);
        lwjgl3ApplicationConfiguration48.samples = (-1);
        lwjgl3ApplicationConfiguration48.useGL30 = true;
        lwjgl3ApplicationConfiguration48.setpreferencesDirectory("ffff72ff");
        int int57 = lwjgl3ApplicationConfiguration48.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration48.windowY = 20188;
        int int60 = lwjgl3ApplicationConfiguration48.getaudioDeviceBufferCount();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode61 = lwjgl3ApplicationConfiguration48.hdpiMode;
        lwjgl3ApplicationConfiguration43.hdpiMode = hdpiMode61;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration63 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration43);
        com.badlogic.gdx.graphics.Color color64 = lwjgl3ApplicationConfiguration63.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color65 = color40.sub(color64);
        int int66 = com.badlogic.gdx.graphics.Color.argb8888(color65);
        com.badlogic.gdx.graphics.Color color67 = color65.cpy();
        float float68 = color67.a;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color8 and color64", color8.equals(color64) ? color8.hashCode() == color64.hashCode() : true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BLACK;
        float float1 = color0.r;
        com.badlogic.gdx.graphics.Color color6 = color0.set((-8.0750596E37f), 0.0f, (float) (-1L), (float) 65024);
        com.badlogic.gdx.graphics.Color color7 = color0.cpy();
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color13 = color8.add((float) 100, 1.0f, (float) 0, (float) (byte) 0);
        java.lang.String str14 = color13.toString();
        com.badlogic.gdx.graphics.Color color15 = com.badlogic.gdx.graphics.Color.DARK_GRAY;
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color15);
        int int17 = com.badlogic.gdx.graphics.Color.rgba4444(color16);
        com.badlogic.gdx.graphics.Color color18 = color13.mul(color16);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(color18);
        boolean boolean20 = color7.equals((java.lang.Object) color19);
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color(0.0f, (float) 1, 0.13333334f, 1.561203E-39f);
        com.badlogic.gdx.graphics.Color color27 = color25.mul((float) 100);
        com.badlogic.gdx.graphics.Color color32 = color25.add((float) (-1611265692), (float) 6147990, (float) (-1291845633), (float) 63736);
        color25.a = (-1611265692);
        com.badlogic.gdx.graphics.Color color35 = color25.cpy();
        com.badlogic.gdx.graphics.Color color40 = color25.set(1.1802158E-30f, (float) (-1714481152), 0.0f, 1.5612034E-37f);
        float float41 = color40.a;
        com.badlogic.gdx.graphics.Color color43 = color19.lerp(color40, 0.9424053f);
        com.badlogic.gdx.graphics.Color color48 = color40.set((float) (-268566528), (-1.6989325E38f), (float) (-269090816), (float) (-248586240));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color8 and color19", color8.equals(color19) ? color8.hashCode() == color19.hashCode() : true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setwindowHeight((int) (byte) 10);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color14 = color9.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color15 = color8.sub(color14);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color8, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color22 = color8.set(1.561203E-39f, (float) 2, (float) (byte) -1, (float) 3);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color22);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3ApplicationConfiguration24.setFullscreenMode(displayMode25);
        lwjgl3ApplicationConfiguration24.samples = '4';
        int int29 = lwjgl3ApplicationConfiguration24.r;
        lwjgl3ApplicationConfiguration24.setwindowY(1671296512);
        lwjgl3ApplicationConfiguration24.setAudioConfig(640, 8897069, (-62986));
        boolean boolean36 = color22.equals((java.lang.Object) (-62986));
        int int37 = com.badlogic.gdx.graphics.Color.rgba8888(color22);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color22, 16252680);
        com.badlogic.gdx.graphics.Color color40 = new com.badlogic.gdx.graphics.Color(color22);
        color40.g = (-1.6947657E38f);
        com.badlogic.gdx.graphics.Color color43 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color48 = color43.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color49 = new com.badlogic.gdx.graphics.Color(color43);
        com.badlogic.gdx.graphics.Color color50 = new com.badlogic.gdx.graphics.Color(color49);
        int int51 = com.badlogic.gdx.graphics.Color.argb8888(color50);
        int int52 = com.badlogic.gdx.graphics.Color.argb8888(color50);
        com.badlogic.gdx.graphics.Color color57 = color50.set(0.0f, (float) 524288, 2.5243549E-29f, (float) (byte) 0);
        java.lang.String str58 = color50.toString();
        com.badlogic.gdx.graphics.Color color60 = color40.lerp(color50, (float) (-134308060));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color9 and color50", color9.equals(color50) ? color9.hashCode() == color50.hashCode() : true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-255), 100.0f, (float) (byte) 100, (float) 41903542);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color10 = color5.add((float) 100, 1.0f, (float) 0, (float) (byte) 0);
        java.lang.String str11 = color10.toString();
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color10, 1);
        com.badlogic.gdx.graphics.Color color18 = color10.mul((float) 41903542, (float) (-8672), (float) (-50135050), (float) (-10));
        com.badlogic.gdx.graphics.Color color24 = color18.lerp((float) (-65025), (-0.0f), (float) (-65486), (float) (byte) 10, (float) (-1L));
        com.badlogic.gdx.graphics.Color color29 = color24.set((float) 1, (float) 255, (-5.68232E37f), (float) 1677696502);
        float float30 = color24.toFloatBits();
        com.badlogic.gdx.graphics.Color color31 = color4.mul(color24);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color31, 97);
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color(3);
        com.badlogic.gdx.graphics.Color color40 = color35.set((-6.878755E37f), 2.4259024E-18f, (float) (-2560), 0.0f);
        com.badlogic.gdx.graphics.Color color41 = color31.set(color40);
        int int42 = com.badlogic.gdx.graphics.Color.rgba4444(color31);
        com.badlogic.gdx.graphics.Color color43 = color31.clamp();
        color31.g = 0.0f;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color31 and color35", color31.equals(color35) ? color31.hashCode() == color35.hashCode() : true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean7 = lwjgl3ApplicationConfiguration0.useGL30;
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (-50331648);
        com.badlogic.gdx.graphics.Color color11 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color16 = color11.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(color11);
        int int18 = com.badlogic.gdx.graphics.Color.argb8888(color11);
        com.badlogic.gdx.graphics.Color color19 = color11.clamp();
        int int20 = com.badlogic.gdx.graphics.Color.rgba8888(color19);
        int int21 = com.badlogic.gdx.graphics.Color.rgb565(color19);
        com.badlogic.gdx.graphics.Color color22 = color19.cpy();
        color19.a = (-16794448);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color19;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color19 and color17", color19.equals(color17) ? color19.hashCode() == color17.hashCode() : true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (byte) 100);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.BLACK;
        float float3 = color2.r;
        color2.r = 1671296512;
        com.badlogic.gdx.graphics.Color color6 = color1.sub(color2);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color8 = color1.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color15 = color10.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color10);
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(color16);
        com.badlogic.gdx.graphics.Color color18 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color23 = color18.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color31 = color25.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color32 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str33 = color32.toString();
        com.badlogic.gdx.graphics.Color color35 = color25.lerp(color32, (-8.0750596E37f));
        boolean boolean36 = color18.equals((java.lang.Object) color25);
        com.badlogic.gdx.graphics.Color color37 = color17.add(color18);
        com.badlogic.gdx.graphics.Color color39 = color9.lerp(color17, (float) (-14540110));
        int int40 = com.badlogic.gdx.graphics.Color.rgb565(color9);
        com.badlogic.gdx.graphics.Color color45 = color9.mul((float) (byte) 0, (float) (byte) 100, (float) 35, (float) (-255));
        com.badlogic.gdx.graphics.Color color46 = color8.mul(color9);
        com.badlogic.gdx.graphics.Color color47 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color48 = color47.cpy();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color48, 1);
        com.badlogic.gdx.graphics.Color color51 = new com.badlogic.gdx.graphics.Color(color48);
        com.badlogic.gdx.graphics.Color color52 = new com.badlogic.gdx.graphics.Color(color51);
        com.badlogic.gdx.graphics.Color color53 = new com.badlogic.gdx.graphics.Color(color51);
        com.badlogic.gdx.graphics.Color color54 = color8.add(color53);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color54, 140834847);
        com.badlogic.gdx.graphics.Color color61 = new com.badlogic.gdx.graphics.Color(0.0f, (float) 1, 0.13333334f, 1.561203E-39f);
        com.badlogic.gdx.graphics.Color color63 = color61.mul((float) 100);
        com.badlogic.gdx.graphics.Color color68 = color61.add((float) (-1611265692), (float) 6147990, (float) (-1291845633), (float) 63736);
        color61.a = (-1611265692);
        com.badlogic.gdx.graphics.Color color71 = color61.cpy();
        float float72 = color71.g;
        com.badlogic.gdx.graphics.Color color73 = color54.add(color71);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color18 and color61", color18.equals(color61) ? color18.hashCode() == color61.hashCode() : true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(100);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(1.5612034E-37f, (float) (-16711680), 2.5243549E-29f, (float) (-1306385665));
        color6.b = 65025;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str10 = lwjgl3ApplicationConfiguration9.title;
        lwjgl3ApplicationConfiguration9.a = (-1);
        boolean boolean13 = lwjgl3ApplicationConfiguration9.vSyncEnabled;
        lwjgl3ApplicationConfiguration9.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color16 = lwjgl3ApplicationConfiguration9.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(color16);
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(color17);
        com.badlogic.gdx.graphics.Color color19 = color6.sub(color17);
        float float20 = color19.toFloatBits();
        com.badlogic.gdx.graphics.Color color22 = color1.lerp(color19, (float) (-510));
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(0.06666667f, (float) (-8160), (float) 16776961, (float) (-383778816));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3ApplicationConfiguration28.setFullscreenMode(displayMode29);
        com.badlogic.gdx.Files.FileType fileType31 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration28.setpreferencesFileType(fileType31);
        lwjgl3ApplicationConfiguration28.disableAudio(true);
        lwjgl3ApplicationConfiguration28.setAudioConfig((-1), (-524869), 587162524);
        com.badlogic.gdx.graphics.Color color39 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color39, (int) 'a');
        com.badlogic.gdx.graphics.Color color42 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        com.badlogic.gdx.graphics.Color color44 = color39.lerp(color42, (float) (short) 0);
        com.badlogic.gdx.graphics.Color color45 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str46 = color45.toString();
        com.badlogic.gdx.graphics.Color color47 = color42.sub(color45);
        com.badlogic.gdx.graphics.Color color48 = new com.badlogic.gdx.graphics.Color(color47);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color47, (-1880097264));
        lwjgl3ApplicationConfiguration28.setInitialBackgroundColor(color47);
        boolean boolean52 = color27.equals((java.lang.Object) color47);
        com.badlogic.gdx.graphics.Color color57 = color47.sub((float) (-1644167168), (float) (-524536), (float) (-16777215), (float) (-10420224));
        com.badlogic.gdx.graphics.Color color58 = color22.set(color47);
        color47.g = 2.259476E-38f;
        com.badlogic.gdx.graphics.Color color61 = color47.clamp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color6 and color16", color6.equals(color16) ? color6.hashCode() == color16.hashCode() : true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.valueOf("ffffff00");
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str3 = color2.toString();
        com.badlogic.gdx.graphics.Color color5 = color2.set((-62986));
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str7 = color6.toString();
        com.badlogic.gdx.graphics.Color color9 = color6.set((-62986));
        com.badlogic.gdx.graphics.Color color10 = color5.sub(color9);
        com.badlogic.gdx.graphics.Color color11 = color1.sub(color5);
        com.badlogic.gdx.graphics.Color color16 = color1.sub((float) 16711425, (float) 14, (-1.4523669E17f), 1.561203E-39f);
        com.badlogic.gdx.graphics.Color color18 = com.badlogic.gdx.graphics.Color.valueOf("ffe7ff00");
        com.badlogic.gdx.graphics.Color color19 = color1.add(color18);
        com.badlogic.gdx.graphics.Color color24 = color19.mul((-5.9916294E29f), (float) (-90432), 2.3749179E-8f, (float) 587202527);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color24 and color2", color24.equals(color2) ? color24.hashCode() == color2.hashCode() : true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setwindowHeight((int) (byte) 10);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color14 = color9.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color15 = color8.sub(color14);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color8, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color22 = color8.set(1.561203E-39f, (float) 2, (float) (byte) -1, (float) 3);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color22);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3ApplicationConfiguration24.setFullscreenMode(displayMode25);
        lwjgl3ApplicationConfiguration24.samples = '4';
        int int29 = lwjgl3ApplicationConfiguration24.r;
        lwjgl3ApplicationConfiguration24.setwindowY(1671296512);
        lwjgl3ApplicationConfiguration24.setAudioConfig(640, 8897069, (-62986));
        boolean boolean36 = color22.equals((java.lang.Object) (-62986));
        int int37 = com.badlogic.gdx.graphics.Color.rgba8888(color22);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color22, 16252680);
        color22.b = 284196832;
        com.badlogic.gdx.graphics.Color color42 = color22.cpy();
        com.badlogic.gdx.graphics.Color color43 = color22.clamp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color43 and color42", color43.equals(color42) ? color43.hashCode() == color42.hashCode() : true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color5, 100);
        com.badlogic.gdx.graphics.Color color9 = color5.mul(100.0f);
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color(color5);
        com.badlogic.gdx.graphics.Color color11 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color16 = color11.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(color11);
        int int18 = com.badlogic.gdx.graphics.Color.argb8888(color11);
        com.badlogic.gdx.graphics.Color color19 = color11.clamp();
        com.badlogic.gdx.graphics.Color color20 = color5.mul(color19);
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color((int) (byte) 100);
        com.badlogic.gdx.graphics.Color color23 = com.badlogic.gdx.graphics.Color.BLACK;
        float float24 = color23.r;
        color23.r = 1671296512;
        com.badlogic.gdx.graphics.Color color27 = color22.sub(color23);
        color23.r = 166464000;
        com.badlogic.gdx.graphics.Color color30 = color5.add(color23);
        com.badlogic.gdx.graphics.Color color31 = new com.badlogic.gdx.graphics.Color(color23);
        color31.b = (-7.4769075E37f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color0 and color23", color0.equals(color23) ? color0.hashCode() == color23.hashCode() : true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color5 = color0.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color13 = color7.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color14 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str15 = color14.toString();
        com.badlogic.gdx.graphics.Color color17 = color7.lerp(color14, (-8.0750596E37f));
        boolean boolean18 = color0.equals((java.lang.Object) color7);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(color7);
        com.badlogic.gdx.graphics.Color color24 = color7.sub((-1.7011522E38f), (float) 65290, (float) (-138133248), (-4.2535296E37f));
        float float25 = color24.a;
        com.badlogic.gdx.graphics.Color color26 = com.badlogic.gdx.graphics.Color.BLACK;
        float float27 = color26.r;
        com.badlogic.gdx.graphics.Color color32 = color26.set((float) 0L, (float) 1671296512, (float) 255, (-5.387877E37f));
        com.badlogic.gdx.graphics.Color color33 = color24.add(color26);
        com.badlogic.gdx.graphics.Color color38 = color24.mul(6.189354E-33f, (float) 16703520, (float) (-459000), (float) (-1846476800));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color0 and color38", color0.equals(color38) ? color0.hashCode() == color38.hashCode() : true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color5, 100);
        com.badlogic.gdx.graphics.Color color9 = color5.mul(100.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color9, 8897069);
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color17 = color12.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(color12);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(color18);
        int int20 = com.badlogic.gdx.graphics.Color.argb8888(color19);
        int int21 = com.badlogic.gdx.graphics.Color.rgba8888(color19);
        com.badlogic.gdx.graphics.Color color23 = color9.lerp(color19, (float) 1044480);
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color(color19);
        com.badlogic.gdx.graphics.Color color30 = color24.lerp(1.0f, (float) 13119, (float) (-16777199), (float) (-16711680), (float) (-201326593));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str32 = lwjgl3ApplicationConfiguration31.title;
        com.badlogic.gdx.graphics.Color color33 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color33, 16);
        lwjgl3ApplicationConfiguration31.setInitialBackgroundColor(color33);
        com.badlogic.gdx.graphics.Color color41 = color33.sub((float) (-232), (float) (-255), (float) 10L, (float) 1L);
        com.badlogic.gdx.graphics.Color color43 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color49 = color43.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color50 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str51 = color50.toString();
        com.badlogic.gdx.graphics.Color color53 = color43.lerp(color50, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color54 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color54, 16);
        com.badlogic.gdx.graphics.Color color57 = color53.sub(color54);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color54, 1677696502);
        com.badlogic.gdx.graphics.Color color60 = color33.sub(color54);
        int int61 = com.badlogic.gdx.graphics.Color.argb8888(color54);
        com.badlogic.gdx.graphics.Color color62 = color30.set(color54);
        int int63 = color54.toIntBits();
        com.badlogic.gdx.graphics.Color color64 = com.badlogic.gdx.graphics.Color.SCARLET;
        color64.b = '#';
        com.badlogic.gdx.graphics.Color color67 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color color69 = color64.lerp(color67, (float) 1L);
        com.badlogic.gdx.graphics.Color color70 = color67.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color71 = new com.badlogic.gdx.graphics.Color(color70);
        com.badlogic.gdx.graphics.Color color72 = color54.sub(color70);
        float float73 = color72.toFloatBits();
        color72.a = 2.9692728E-8f;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color24 and color72", color24.equals(color72) ? color24.hashCode() == color72.hashCode() : true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        int int6 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        int int7 = lwjgl3ApplicationConfiguration0.a;
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.windowHeight = 'a';
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3ApplicationConfiguration14.setFullscreenMode(displayMode15);
        com.badlogic.gdx.Files.FileType fileType17 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration14.setpreferencesFileType(fileType17);
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("ffff72ff", fileType17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType21 = null;
        lwjgl3ApplicationConfiguration20.setpreferencesFileType(fileType21);
        lwjgl3ApplicationConfiguration20.useVsync(false);
        lwjgl3ApplicationConfiguration20.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration20);
        lwjgl3ApplicationConfiguration27.setwindowX((int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType30 = lwjgl3ApplicationConfiguration27.getpreferencesFileType();
        int int31 = lwjgl3ApplicationConfiguration27.gles30ContextMinorVersion;
        int int32 = lwjgl3ApplicationConfiguration27.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration33.setdepth((int) (byte) 1);
        com.badlogic.gdx.Files.FileType fileType36 = lwjgl3ApplicationConfiguration33.preferencesFileType;
        lwjgl3ApplicationConfiguration27.setpreferencesFileType(fileType36);
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType36;
        com.badlogic.gdx.graphics.Color color39 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color39, (int) 'a');
        com.badlogic.gdx.graphics.Color color42 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        com.badlogic.gdx.graphics.Color color44 = color39.lerp(color42, (float) (short) 0);
        com.badlogic.gdx.graphics.Color color45 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str46 = color45.toString();
        com.badlogic.gdx.graphics.Color color47 = color42.sub(color45);
        com.badlogic.gdx.graphics.Color color48 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color53 = color48.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color54 = new com.badlogic.gdx.graphics.Color(color48);
        int int55 = com.badlogic.gdx.graphics.Color.argb8888(color48);
        com.badlogic.gdx.graphics.Color color57 = color48.mul((float) (-262646));
        com.badlogic.gdx.graphics.Color color58 = color45.sub(color57);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration59 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int60 = lwjgl3ApplicationConfiguration59.getaudioDeviceBufferSize();
        boolean boolean61 = lwjgl3ApplicationConfiguration59.windowResizable;
        lwjgl3ApplicationConfiguration59.disableAudio = false;
        lwjgl3ApplicationConfiguration59.setResizable(true);
        lwjgl3ApplicationConfiguration59.setwindowX(10);
        lwjgl3ApplicationConfiguration59.gles30ContextMinorVersion = 151015132;
        com.badlogic.gdx.Files.FileType fileType70 = lwjgl3ApplicationConfiguration59.preferencesFileType;
        boolean boolean71 = lwjgl3ApplicationConfiguration59.windowDecorated;
        boolean boolean72 = lwjgl3ApplicationConfiguration59.getwindowDecorated();
        boolean boolean73 = color58.equals((java.lang.Object) lwjgl3ApplicationConfiguration59);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color58);
        com.badlogic.gdx.graphics.Color color76 = color58.mul(7.175E-43f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color76 and color48", color76.equals(color48) ? color76.hashCode() == color48.hashCode() : true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str1 = color0.toString();
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color7 = color2.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color2);
        int int9 = com.badlogic.gdx.graphics.Color.argb8888(color2);
        com.badlogic.gdx.graphics.Color color15 = color2.lerp((float) (-1611265692), (float) 524288, (float) 6356992, (-1.7013883E38f), 0.30588236f);
        com.badlogic.gdx.graphics.Color color20 = color15.set((float) (-2), (float) (-16719105), (-1.24151398E9f), 2.5243549E-29f);
        com.badlogic.gdx.graphics.Color color21 = color0.sub(color20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3ApplicationConfiguration22.setFullscreenMode(displayMode23);
        lwjgl3ApplicationConfiguration22.samples = (-1);
        lwjgl3ApplicationConfiguration22.setgles30ContextMajorVersion(1677696502);
        lwjgl3ApplicationConfiguration22.setdepth(0);
        lwjgl3ApplicationConfiguration22.setwindowX(640);
        lwjgl3ApplicationConfiguration22.gles30ContextMajorVersion = (short) 1;
        int int35 = lwjgl3ApplicationConfiguration22.getaudioDeviceSimultaneousSources();
        int int36 = lwjgl3ApplicationConfiguration22.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration22.audioDeviceBufferSize = (-270598144);
        lwjgl3ApplicationConfiguration22.initialVisible = false;
        lwjgl3ApplicationConfiguration22.setwindowY((-254));
        boolean boolean43 = lwjgl3ApplicationConfiguration22.getwindowDecorated();
        int int44 = lwjgl3ApplicationConfiguration22.getaudioDeviceSimultaneousSources();
        boolean boolean45 = color21.equals((java.lang.Object) lwjgl3ApplicationConfiguration22);
        com.badlogic.gdx.graphics.Color color50 = new com.badlogic.gdx.graphics.Color((float) 256, (-1.7013859E38f), 0.0f, (float) 16711425);
        com.badlogic.gdx.graphics.Color color55 = color50.set((float) (-1291845633), (-4.731522E-22f), (float) (-65568), 0.0f);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color50, (-38250));
        com.badlogic.gdx.graphics.Color color59 = color50.mul((float) 1671296512);
        com.badlogic.gdx.graphics.Color color60 = color21.sub(color50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color60 and color2", color60.equals(color2) ? color60.hashCode() == color2.hashCode() : true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 10L, (float) 1, (float) 0, (float) (short) -1);
        color4.b = (-1241513983);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color17 = color11.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color18 = color9.mul(color17);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color9, (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color21 = color9.cpy();
        com.badlogic.gdx.graphics.Color color22 = color7.set(color9);
        float float23 = color7.r;
        com.badlogic.gdx.graphics.Color color25 = color7.set((-3200));
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color((float) (-7876885), (float) 0L, (float) 6529016, (-0.49791527f));
        com.badlogic.gdx.graphics.Color color32 = color30.set(537395200);
        color30.g = 2;
        com.badlogic.gdx.graphics.Color color39 = color30.mul((float) (-2146959360), 0.8888889f, 2.3418409E-38f, (float) (-254));
        com.badlogic.gdx.graphics.Color color45 = color39.lerp((float) (-2143297280), (float) (-1222144), 0.03137255f, (float) 53562, (float) (-1103230192));
        com.badlogic.gdx.graphics.Color color46 = color25.mul(color45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color4 and color46", color4.equals(color46) ? color4.hashCode() == color46.hashCode() : true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        float float1 = color0.toFloatBits();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str3 = lwjgl3ApplicationConfiguration2.title;
        com.badlogic.gdx.graphics.Color color4 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color4, 16);
        lwjgl3ApplicationConfiguration2.setInitialBackgroundColor(color4);
        com.badlogic.gdx.graphics.Color color12 = color4.sub((float) (-232), (float) (-255), (float) 10L, (float) 1L);
        com.badlogic.gdx.graphics.Color color14 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color20 = color14.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color21 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str22 = color21.toString();
        com.badlogic.gdx.graphics.Color color24 = color14.lerp(color21, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color25 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color25, 16);
        com.badlogic.gdx.graphics.Color color28 = color24.sub(color25);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color25, 1677696502);
        com.badlogic.gdx.graphics.Color color31 = color4.sub(color25);
        com.badlogic.gdx.graphics.Color color32 = color0.add(color25);
        com.badlogic.gdx.graphics.Color color33 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color34 = color0.cpy();
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color38 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color44 = color38.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color45 = color36.mul(color44);
        com.badlogic.gdx.graphics.Color color46 = color44.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color51 = color44.set((float) (-65536), (float) (-2), (float) (-8142), (float) (-469852380));
        com.badlogic.gdx.graphics.Color color52 = new com.badlogic.gdx.graphics.Color(color51);
        com.badlogic.gdx.graphics.Color color53 = color0.mul(color52);
        com.badlogic.gdx.graphics.Color color55 = new com.badlogic.gdx.graphics.Color(480);
        com.badlogic.gdx.graphics.Color color56 = color55.cpy();
        int int57 = com.badlogic.gdx.graphics.Color.rgb565(color55);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color55, (-100));
        com.badlogic.gdx.graphics.Color color64 = color55.mul((float) (-65025), 2.950215E-39f, (-4.319991E37f), (-1.6877057E38f));
        com.badlogic.gdx.graphics.Color color65 = color0.set(color64);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color4 and color65", color4.equals(color65) ? color4.hashCode() == color65.hashCode() : true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color5, 100);
        com.badlogic.gdx.graphics.Color color9 = color5.mul(100.0f);
        com.badlogic.gdx.graphics.Color color14 = color9.sub((float) (byte) 0, (float) (-65280), (float) 65295, 0.0f);
        com.badlogic.gdx.graphics.Color color16 = color14.set((int) (short) 100);
        com.badlogic.gdx.graphics.Color color21 = color16.mul((float) (-1241513983), (float) (-16711680), (-5.387877E37f), (float) 61450);
        com.badlogic.gdx.graphics.Color color27 = color16.lerp((float) 25500, (float) (-58475), (float) 100L, (float) (-436443648), (-1.7013583E38f));
        color16.b = (-15);
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color(color16);
        com.badlogic.gdx.graphics.Color color31 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color32 = color31.cpy();
        int int33 = com.badlogic.gdx.graphics.Color.argb8888(color32);
        com.badlogic.gdx.graphics.Color color34 = com.badlogic.gdx.graphics.Color.FOREST;
        int int35 = com.badlogic.gdx.graphics.Color.argb8888(color34);
        com.badlogic.gdx.graphics.Color color37 = color32.lerp(color34, (float) (-50396672));
        int int38 = com.badlogic.gdx.graphics.Color.argb8888(color37);
        com.badlogic.gdx.graphics.Color color39 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color40 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color45 = color40.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color46 = new com.badlogic.gdx.graphics.Color(color40);
        com.badlogic.gdx.graphics.Color color47 = new com.badlogic.gdx.graphics.Color(color46);
        com.badlogic.gdx.graphics.Color color48 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color53 = color48.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color55 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color61 = color55.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color62 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str63 = color62.toString();
        com.badlogic.gdx.graphics.Color color65 = color55.lerp(color62, (-8.0750596E37f));
        boolean boolean66 = color48.equals((java.lang.Object) color55);
        com.badlogic.gdx.graphics.Color color67 = color47.add(color48);
        com.badlogic.gdx.graphics.Color color69 = color39.lerp(color47, (float) (-14540110));
        int int70 = com.badlogic.gdx.graphics.Color.rgb565(color39);
        com.badlogic.gdx.graphics.Color color71 = color37.sub(color39);
        com.badlogic.gdx.graphics.Color color76 = new com.badlogic.gdx.graphics.Color((float) 10L, (float) 1, (float) 0, (float) (short) -1);
        color76.r = 63519;
        com.badlogic.gdx.graphics.Color color80 = color76.set(512);
        com.badlogic.gdx.graphics.Color color81 = color37.add(color80);
        int int82 = com.badlogic.gdx.graphics.Color.rgba4444(color80);
        int int83 = color80.toIntBits();
        com.badlogic.gdx.graphics.Color color85 = color80.set((-65536));
        com.badlogic.gdx.graphics.Color color86 = color16.add(color85);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color31 and color34", color31.equals(color34) ? color31.hashCode() == color34.hashCode() : true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color13 = color8.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color21 = color15.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color22 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str23 = color22.toString();
        com.badlogic.gdx.graphics.Color color25 = color15.lerp(color22, (-8.0750596E37f));
        boolean boolean26 = color8.equals((java.lang.Object) color15);
        com.badlogic.gdx.graphics.Color color27 = color7.add(color8);
        com.badlogic.gdx.graphics.Color color33 = color8.lerp(0.19607843f, (float) 167247232, (float) 16777215, (float) 587162524, 0.0f);
        java.lang.String str34 = color33.toString();
        com.badlogic.gdx.graphics.Color color39 = new com.badlogic.gdx.graphics.Color((float) 10L, (float) 1, (float) 0, (float) (short) -1);
        color39.b = (-1241513983);
        com.badlogic.gdx.graphics.Color color42 = new com.badlogic.gdx.graphics.Color(color39);
        int int43 = color42.toIntBits();
        com.badlogic.gdx.graphics.Color color48 = color42.set((float) 6356992, (float) (-135823360), (float) 2550, (float) (-65486));
        float float49 = color42.g;
        com.badlogic.gdx.graphics.Color color50 = new com.badlogic.gdx.graphics.Color(color42);
        com.badlogic.gdx.graphics.Color color51 = color33.mul(color50);
        com.badlogic.gdx.graphics.Color color52 = com.badlogic.gdx.graphics.Color.DARK_GRAY;
        com.badlogic.gdx.graphics.Color color53 = new com.badlogic.gdx.graphics.Color(color52);
        com.badlogic.gdx.graphics.Color color55 = color52.set(35);
        com.badlogic.gdx.graphics.Color color56 = color52.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color61 = color52.mul(0.0f, (float) 65535, (float) (-32), (float) (-1));
        com.badlogic.gdx.graphics.Color color63 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color64 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color69 = color64.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color70 = color63.sub(color69);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color63, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color73 = new com.badlogic.gdx.graphics.Color(color63);
        com.badlogic.gdx.graphics.Color color78 = color63.mul((float) (-222), (-1.5084639E38f), (float) (-62986), (float) (-16741598));
        float float79 = color78.r;
        com.badlogic.gdx.graphics.Color color80 = color78.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color82 = color61.lerp(color78, (float) 16580354);
        com.badlogic.gdx.graphics.Color color83 = com.badlogic.gdx.graphics.Color.SCARLET;
        color83.b = '#';
        com.badlogic.gdx.graphics.Color color86 = color61.add(color83);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color86, (-469444608));
        com.badlogic.gdx.graphics.Color color90 = color86.mul(0.0f);
        int int91 = com.badlogic.gdx.graphics.Color.rgba8888(color86);
        com.badlogic.gdx.graphics.Color color92 = color50.sub(color86);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color86 and color53", color86.equals(color53) ? color86.hashCode() == color53.hashCode() : true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean6 = lwjgl3ApplicationConfiguration0.windowResizable;
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        int int8 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(6147990);
        com.badlogic.gdx.graphics.Color color11 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color16 = color11.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(color11);
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(color17);
        java.lang.String str19 = color17.toString();
        int int20 = com.badlogic.gdx.graphics.Color.rgba4444(color17);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(color17);
        com.badlogic.gdx.graphics.Color color26 = color21.set((float) 15687677, (float) 2, (float) 1L, (float) (-240));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration27.audioDeviceBufferSize = ' ';
        lwjgl3ApplicationConfiguration27.setwindowResizable(true);
        lwjgl3ApplicationConfiguration27.gles30ContextMajorVersion = (-567943452);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener34 = null;
        lwjgl3ApplicationConfiguration27.windowListener = lwjgl3WindowListener34;
        lwjgl3ApplicationConfiguration27.setdepth((-16741598));
        com.badlogic.gdx.graphics.Color color39 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color41 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color47 = color41.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color48 = color39.mul(color47);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color39, (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color51 = color39.cpy();
        lwjgl3ApplicationConfiguration27.setInitialBackgroundColor(color39);
        com.badlogic.gdx.graphics.Color color53 = color26.set(color39);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color39;
        color39.g = 4.4933517E-27f;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color21 and color39", color21.equals(color39) ? color21.hashCode() == color39.hashCode() : true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color1 = color0.cpy();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color1, 1);
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color color10 = color5.add((float) (-567943452), 0.69803923f, 2.9056E-41f, (float) 16776960);
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color(color5);
        com.badlogic.gdx.graphics.Color color12 = color5.cpy();
        color5.g = (-1880421376);
        int int15 = com.badlogic.gdx.graphics.Color.rgba8888(color5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color1 and color5", color1.equals(color5) ? color1.hashCode() == color5.hashCode() : true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-255), 100.0f, (float) (byte) 100, (float) 41903542);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color10 = color5.add((float) 100, 1.0f, (float) 0, (float) (byte) 0);
        java.lang.String str11 = color10.toString();
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color10, 1);
        com.badlogic.gdx.graphics.Color color18 = color10.mul((float) 41903542, (float) (-8672), (float) (-50135050), (float) (-10));
        com.badlogic.gdx.graphics.Color color24 = color18.lerp((float) (-65025), (-0.0f), (float) (-65486), (float) (byte) 10, (float) (-1L));
        com.badlogic.gdx.graphics.Color color29 = color24.set((float) 1, (float) 255, (-5.68232E37f), (float) 1677696502);
        float float30 = color24.toFloatBits();
        com.badlogic.gdx.graphics.Color color31 = color4.mul(color24);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color31, 97);
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color(3);
        com.badlogic.gdx.graphics.Color color40 = color35.set((-6.878755E37f), 2.4259024E-18f, (float) (-2560), 0.0f);
        com.badlogic.gdx.graphics.Color color41 = color31.set(color40);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color40, 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color4 and color40", color4.equals(color40) ? color4.hashCode() == color40.hashCode() : true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color6 = color1.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color7);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color14 = color9.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color22 = color16.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color23 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str24 = color23.toString();
        com.badlogic.gdx.graphics.Color color26 = color16.lerp(color23, (-8.0750596E37f));
        boolean boolean27 = color9.equals((java.lang.Object) color16);
        com.badlogic.gdx.graphics.Color color28 = color8.add(color9);
        com.badlogic.gdx.graphics.Color color30 = color0.lerp(color8, (float) (-14540110));
        int int31 = com.badlogic.gdx.graphics.Color.rgb565(color0);
        com.badlogic.gdx.graphics.Color color32 = new com.badlogic.gdx.graphics.Color(color0);
        color0.g = (-1.4754431E38f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color0 and color32", color0.equals(color32) ? color0.hashCode() == color32.hashCode() : true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0.13333334f, (float) (-208896000), (float) (-8126466), (float) (-1268));
        com.badlogic.gdx.graphics.Color color6 = color4.mul((float) (-52619264));
        com.badlogic.gdx.graphics.Color color8 = color4.mul(2.2683366E-38f);
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color((float) 1, (float) 20160, (float) 0, (float) (byte) -1);
        java.lang.Object obj14 = null;
        boolean boolean15 = color13.equals(obj14);
        int int16 = color13.toIntBits();
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(color13);
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color((-8.815718E32f), (float) (-1291891232), (float) (-2117940064), (float) (-85425));
        com.badlogic.gdx.graphics.Color color23 = com.badlogic.gdx.graphics.Color.DARK_GRAY;
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color(color23);
        com.badlogic.gdx.graphics.Color color25 = color22.add(color24);
        com.badlogic.gdx.graphics.Color color26 = com.badlogic.gdx.graphics.Color.MAGENTA;
        com.badlogic.gdx.graphics.Color color27 = color25.set(color26);
        com.badlogic.gdx.graphics.Color color29 = color17.lerp(color27, (float) (-8414));
        com.badlogic.gdx.graphics.Color color31 = color8.lerp(color29, 3.4084816E-37f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color31 and color23", color31.equals(color23) ? color31.hashCode() == color23.hashCode() : true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color13 = color8.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color21 = color15.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color22 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str23 = color22.toString();
        com.badlogic.gdx.graphics.Color color25 = color15.lerp(color22, (-8.0750596E37f));
        boolean boolean26 = color8.equals((java.lang.Object) color15);
        com.badlogic.gdx.graphics.Color color27 = color7.add(color8);
        float float28 = color27.r;
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color27, (-14622977));
        com.badlogic.gdx.graphics.Color color35 = color27.mul(3.6948E-41f, (float) (-18874624), (float) (-159989760), (float) (-65568));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int37 = lwjgl3ApplicationConfiguration36.getaudioDeviceBufferSize();
        boolean boolean38 = lwjgl3ApplicationConfiguration36.windowResizable;
        int int39 = lwjgl3ApplicationConfiguration36.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration36.setaudioDeviceBufferCount((-16741598));
        com.badlogic.gdx.graphics.Color color42 = com.badlogic.gdx.graphics.Color.SALMON;
        float float43 = color42.toFloatBits();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration44 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str45 = lwjgl3ApplicationConfiguration44.title;
        com.badlogic.gdx.graphics.Color color46 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color46, 16);
        lwjgl3ApplicationConfiguration44.setInitialBackgroundColor(color46);
        com.badlogic.gdx.graphics.Color color54 = color46.sub((float) (-232), (float) (-255), (float) 10L, (float) 1L);
        com.badlogic.gdx.graphics.Color color56 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color62 = color56.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color63 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str64 = color63.toString();
        com.badlogic.gdx.graphics.Color color66 = color56.lerp(color63, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color67 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color67, 16);
        com.badlogic.gdx.graphics.Color color70 = color66.sub(color67);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color67, 1677696502);
        com.badlogic.gdx.graphics.Color color73 = color46.sub(color67);
        com.badlogic.gdx.graphics.Color color74 = color42.add(color67);
        com.badlogic.gdx.graphics.Color color75 = new com.badlogic.gdx.graphics.Color(color67);
        com.badlogic.gdx.graphics.Color color80 = color67.add((float) (-1306385665), (-5.387877E37f), 0.67741936f, 4.8303113E-18f);
        lwjgl3ApplicationConfiguration36.initialBackgroundColor = color67;
        java.lang.String str82 = lwjgl3ApplicationConfiguration36.title;
        boolean boolean83 = color35.equals((java.lang.Object) lwjgl3ApplicationConfiguration36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color35 and color75", color35.equals(color75) ? color35.hashCode() == color75.hashCode() : true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-128512), (float) (-1902614), (float) 573767680, (float) (-1));
        int int5 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.GOLD;
        float float7 = color6.b;
        com.badlogic.gdx.graphics.Color color12 = color6.set((-1.5659187E38f), (float) (-65042), (float) (-334888960), (float) (-379904));
        com.badlogic.gdx.graphics.Color color13 = color4.mul(color6);
        com.badlogic.gdx.graphics.Color color14 = new com.badlogic.gdx.graphics.Color(color4);
        color4.a = (-201338096);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color6 and color4", color6.equals(color4) ? color6.hashCode() == color4.hashCode() : true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 1671296512, (float) 100L, (float) '4', (float) 0L);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color((-4.2867603E37f), 9.18893E-39f, (float) 1794115036, (float) (-10));
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color15 = color10.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color20 = color15.mul((-1.0f), (float) 1677696502, (float) 65024, (float) (short) 1);
        com.badlogic.gdx.graphics.Color color21 = color9.sub(color20);
        com.badlogic.gdx.graphics.Color color22 = color21.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color23 = color4.mul(color22);
        com.badlogic.gdx.graphics.Color color28 = color22.set((float) (-14492160), (float) 51, (float) 266342400, (-5.339288E37f));
        int int29 = color28.toIntBits();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color28 and color10", color28.equals(color10) ? color28.hashCode() == color10.hashCode() : true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((-1.4936944E38f), 2.3418052E-38f, (float) ' ', (float) 65535);
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color5);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(480);
        com.badlogic.gdx.graphics.Color color9 = color8.cpy();
        int int10 = com.badlogic.gdx.graphics.Color.rgba8888(color8);
        com.badlogic.gdx.graphics.Color color12 = color5.lerp(color8, (float) (-2560));
        int int13 = com.badlogic.gdx.graphics.Color.rgb888(color12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color4 and color12", color4.equals(color12) ? color4.hashCode() == color12.hashCode() : true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (byte) 100);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.BLACK;
        float float3 = color2.r;
        color2.r = 1671296512;
        com.badlogic.gdx.graphics.Color color6 = color1.sub(color2);
        float float7 = color2.g;
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color2);
        com.badlogic.gdx.graphics.Color color13 = color2.add((float) 6147990, (float) 1677786624, 0.0f, (float) (-13513103));
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color((float) (-940), 0.39215687f, (float) (-532099584), (float) (-416907264));
        com.badlogic.gdx.graphics.Color color19 = color2.set(color18);
        com.badlogic.gdx.graphics.Color color20 = com.badlogic.gdx.graphics.Color.DARK_GRAY;
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(color20);
        com.badlogic.gdx.graphics.Color color23 = color20.set(35);
        com.badlogic.gdx.graphics.Color color24 = color20.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color29 = color20.mul(0.0f, (float) 65535, (float) (-32), (float) (-1));
        int int30 = com.badlogic.gdx.graphics.Color.rgba4444(color20);
        color20.g = 2080800;
        com.badlogic.gdx.graphics.Color color33 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color38 = color33.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color39 = new com.badlogic.gdx.graphics.Color(color33);
        int int40 = com.badlogic.gdx.graphics.Color.argb8888(color33);
        int int41 = color33.toIntBits();
        com.badlogic.gdx.graphics.Color color42 = color33.cpy();
        color42.a = 6528000;
        com.badlogic.gdx.graphics.Color color45 = color20.set(color42);
        com.badlogic.gdx.graphics.Color color47 = color18.lerp(color45, 4.859585E-24f);
        java.lang.Class<?> wildcardClass48 = color18.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color2 and color18", color2.equals(color18) ? color2.hashCode() == color18.hashCode() : true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        com.badlogic.gdx.Files.FileType fileType8 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int9 = lwjgl3ApplicationConfiguration0.samples;
        int int10 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) 'a', (-16711680));
        com.badlogic.gdx.graphics.Color color15 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color15, 43268);
        int int18 = com.badlogic.gdx.graphics.Color.rgb888(color15);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(color15);
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color((float) 2, (float) 100, (float) (short) 0, (float) 640);
        color24.g = 167247232;
        com.badlogic.gdx.graphics.Color color27 = color15.sub(color24);
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color(color24);
        color28.b = (-16384.0f);
        com.badlogic.gdx.graphics.Color color35 = color28.add((-1.7014105E38f), (float) (-1800), 0.8745098f, 1.00579765E-28f);
        com.badlogic.gdx.graphics.Color color37 = new com.badlogic.gdx.graphics.Color((-14513374));
        int int38 = com.badlogic.gdx.graphics.Color.rgba8888(color37);
        com.badlogic.gdx.graphics.Color color39 = color28.mul(color37);
        com.badlogic.gdx.graphics.Color color41 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color47 = color41.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color48 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str49 = color48.toString();
        com.badlogic.gdx.graphics.Color color51 = color41.lerp(color48, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color52 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color52, 16);
        com.badlogic.gdx.graphics.Color color55 = color51.sub(color52);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color52, 1677696502);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color52, 480);
        com.badlogic.gdx.graphics.Color color60 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color65 = color60.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color66 = new com.badlogic.gdx.graphics.Color(color60);
        com.badlogic.gdx.graphics.Color color67 = new com.badlogic.gdx.graphics.Color(color66);
        com.badlogic.gdx.graphics.Color color68 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color73 = color68.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color75 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color81 = color75.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color82 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str83 = color82.toString();
        com.badlogic.gdx.graphics.Color color85 = color75.lerp(color82, (-8.0750596E37f));
        boolean boolean86 = color68.equals((java.lang.Object) color75);
        com.badlogic.gdx.graphics.Color color87 = color67.add(color68);
        com.badlogic.gdx.graphics.Color color88 = color52.set(color67);
        com.badlogic.gdx.graphics.Color color93 = color52.set(10.0f, (float) (-1562574848), (float) 640, (float) 'a');
        com.badlogic.gdx.graphics.Color color94 = com.badlogic.gdx.graphics.Color.ORANGE;
        com.badlogic.gdx.graphics.Color color95 = color52.add(color94);
        java.lang.String str96 = color94.toString();
        com.badlogic.gdx.graphics.Color color97 = color39.set(color94);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color24 and color97", color24.equals(color97) ? color24.hashCode() == color97.hashCode() : true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color9 = color3.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color10 = color1.mul(color9);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color18 = color12.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        color18.g = (short) 1;
        com.badlogic.gdx.graphics.Color color22 = color10.lerp(color18, (float) 25500);
        com.badlogic.gdx.graphics.Color color27 = color10.mul(0.0f, (float) (-8142), (float) (-1562574848), (-1.0f));
        com.badlogic.gdx.graphics.Color color28 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color33 = color28.add((float) 100, 1.0f, (float) 0, (float) (byte) 0);
        java.lang.String str34 = color33.toString();
        com.badlogic.gdx.graphics.Color color35 = com.badlogic.gdx.graphics.Color.DARK_GRAY;
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color(color35);
        int int37 = com.badlogic.gdx.graphics.Color.rgba4444(color36);
        com.badlogic.gdx.graphics.Color color38 = color33.mul(color36);
        com.badlogic.gdx.graphics.Color color39 = color27.add(color38);
        com.badlogic.gdx.graphics.Color color41 = color27.mul((float) (-33488131));
        com.badlogic.gdx.graphics.Color color46 = color41.mul((float) (-379904), (float) ' ', (float) 16711935, (float) (-32770560));
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color46, (-603664549));
        com.badlogic.gdx.graphics.Color color49 = new com.badlogic.gdx.graphics.Color(color46);
        color49.b = 0.0f;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color12 and color35", color12.equals(color35) ? color12.hashCode() == color35.hashCode() : true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color0, (int) 'a');
        com.badlogic.gdx.graphics.Color color3 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        com.badlogic.gdx.graphics.Color color5 = color0.lerp(color3, (float) (short) 0);
        com.badlogic.gdx.graphics.Color color6 = color3.clamp();
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color7, (-59160));
        com.badlogic.gdx.graphics.Color color14 = color7.mul((-1.4523669E17f), 9.1477E-41f, (float) (-16125952), (float) 246);
        float float15 = color7.toFloatBits();
        int int16 = com.badlogic.gdx.graphics.Color.rgba4444(color7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color3 and color7", color3.equals(color7) ? color3.hashCode() == color7.hashCode() : true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str1 = color0.toString();
        com.badlogic.gdx.graphics.Color color6 = color0.sub((float) 16711935, (float) 1671296512, (float) 8897069, (-1.6947917E38f));
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color0, (-178));
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color14 = color9.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(color9);
        int int16 = com.badlogic.gdx.graphics.Color.argb8888(color9);
        com.badlogic.gdx.graphics.Color color18 = color9.mul((float) (-262646));
        com.badlogic.gdx.graphics.Color color20 = color18.mul((float) (-56576));
        com.badlogic.gdx.graphics.Color color25 = color20.set((-1.7013859E38f), (-1.6482297E38f), (-4.581683E37f), 9.18893E-39f);
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color29 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color35 = color29.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color36 = color27.mul(color35);
        color27.r = (-256);
        boolean boolean39 = color20.equals((java.lang.Object) (-256));
        int int40 = color20.toIntBits();
        com.badlogic.gdx.graphics.Color color41 = color20.cpy();
        com.badlogic.gdx.graphics.Color color42 = color20.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color43 = color0.add(color42);
        com.badlogic.gdx.graphics.Color color45 = new com.badlogic.gdx.graphics.Color((-1958400));
        com.badlogic.gdx.graphics.Color color46 = new com.badlogic.gdx.graphics.Color(color45);
        com.badlogic.gdx.graphics.Color color47 = color43.sub(color45);
        com.badlogic.gdx.graphics.Color color52 = color43.mul((float) (-36356880), (float) (-335), (float) (-128512), (float) (-16780544));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color52 and color9", color52.equals(color9) ? color52.hashCode() == color9.hashCode() : true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color6);
        java.lang.String str8 = color6.toString();
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color11 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color16 = color11.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(color11);
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(color17);
        com.badlogic.gdx.graphics.Color color19 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color24 = color19.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color32 = color26.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color33 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str34 = color33.toString();
        com.badlogic.gdx.graphics.Color color36 = color26.lerp(color33, (-8.0750596E37f));
        boolean boolean37 = color19.equals((java.lang.Object) color26);
        com.badlogic.gdx.graphics.Color color38 = color18.add(color19);
        com.badlogic.gdx.graphics.Color color40 = color10.lerp(color18, (float) (-14540110));
        int int41 = com.badlogic.gdx.graphics.Color.rgb565(color10);
        com.badlogic.gdx.graphics.Color color42 = new com.badlogic.gdx.graphics.Color(color10);
        com.badlogic.gdx.graphics.Color color43 = color9.add(color42);
        com.badlogic.gdx.graphics.Color color44 = color9.clamp();
        com.badlogic.gdx.graphics.Color color45 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color46 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color51 = color46.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color52 = new com.badlogic.gdx.graphics.Color(color46);
        com.badlogic.gdx.graphics.Color color53 = new com.badlogic.gdx.graphics.Color(color52);
        com.badlogic.gdx.graphics.Color color54 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color59 = color54.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color61 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color67 = color61.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color68 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str69 = color68.toString();
        com.badlogic.gdx.graphics.Color color71 = color61.lerp(color68, (-8.0750596E37f));
        boolean boolean72 = color54.equals((java.lang.Object) color61);
        com.badlogic.gdx.graphics.Color color73 = color53.add(color54);
        com.badlogic.gdx.graphics.Color color75 = color45.lerp(color53, (float) (-14540110));
        com.badlogic.gdx.graphics.Color color77 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color78 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color79 = color77.set(color78);
        float float80 = color78.b;
        float float81 = color78.r;
        com.badlogic.gdx.graphics.Color color86 = color78.set((float) (byte) 1, (float) (byte) 10, 0.0f, 0.69803923f);
        com.badlogic.gdx.graphics.Color color87 = new com.badlogic.gdx.graphics.Color(color86);
        com.badlogic.gdx.graphics.Color color89 = color53.lerp(color87, (float) (-2143297280));
        java.lang.String str90 = color87.toString();
        int int91 = com.badlogic.gdx.graphics.Color.rgba4444(color87);
        com.badlogic.gdx.graphics.Color color92 = color9.mul(color87);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color0 and color53", color0.equals(color53) ? color0.hashCode() == color53.hashCode() : true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-65025), 0.69803923f, (float) (-232), (float) 16711425);
        float float5 = color4.g;
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color10 = color8.set(color9);
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color(color8);
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color13 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color18 = color13.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(color13);
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color(color19);
        com.badlogic.gdx.graphics.Color color21 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color26 = color21.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color34 = color28.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color35 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str36 = color35.toString();
        com.badlogic.gdx.graphics.Color color38 = color28.lerp(color35, (-8.0750596E37f));
        boolean boolean39 = color21.equals((java.lang.Object) color28);
        com.badlogic.gdx.graphics.Color color40 = color20.add(color21);
        com.badlogic.gdx.graphics.Color color42 = color12.lerp(color20, (float) (-14540110));
        com.badlogic.gdx.graphics.Color color43 = new com.badlogic.gdx.graphics.Color(color12);
        com.badlogic.gdx.graphics.Color color44 = color8.sub(color12);
        int int45 = com.badlogic.gdx.graphics.Color.rgba8888(color8);
        com.badlogic.gdx.graphics.Color color50 = color8.mul((float) 61440, (float) (-27809536), (float) 13119, (float) 16737792);
        com.badlogic.gdx.graphics.Color color51 = color4.mul(color8);
        com.badlogic.gdx.graphics.Color color57 = color8.lerp((float) (-8126466), (-1.6974137E38f), (float) (-3062), (float) (-16646387), (float) (-90432));
        com.badlogic.gdx.graphics.Color color62 = color57.mul((float) (-2350080), (float) 16727871, (-1.6951551E38f), (float) (-16580863));
        com.badlogic.gdx.graphics.Color color67 = new com.badlogic.gdx.graphics.Color((float) 10L, (float) 1, (float) 0, (float) (short) -1);
        color67.b = (-1241513983);
        com.badlogic.gdx.graphics.Color color70 = new com.badlogic.gdx.graphics.Color(color67);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color67, (int) (byte) 100);
        com.badlogic.gdx.graphics.Color color74 = color67.mul((float) 16580354);
        color74.r = 3855;
        com.badlogic.gdx.graphics.Color color77 = com.badlogic.gdx.graphics.Color.SKY;
        int int78 = com.badlogic.gdx.graphics.Color.argb8888(color77);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration79 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str80 = lwjgl3ApplicationConfiguration79.title;
        lwjgl3ApplicationConfiguration79.a = (-1);
        boolean boolean83 = lwjgl3ApplicationConfiguration79.vSyncEnabled;
        lwjgl3ApplicationConfiguration79.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color86 = lwjgl3ApplicationConfiguration79.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color87 = color77.mul(color86);
        com.badlogic.gdx.graphics.Color color88 = color86.cpy();
        com.badlogic.gdx.graphics.Color color89 = color74.set(color86);
        float float90 = color89.b;
        com.badlogic.gdx.graphics.Color color91 = color62.add(color89);
        float float92 = color91.r;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on color12 and color70", color12.equals(color70) ? color12.hashCode() == color70.hashCode() : true);
    }
}

